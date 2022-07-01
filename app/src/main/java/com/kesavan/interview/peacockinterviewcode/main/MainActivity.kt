package com.kesavan.interview.peacockinterviewcode.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.kesavan.interview.peacockinterviewcode.databinding.ActivityMainBinding
import com.kesavan.interview.peacockinterviewcode.main.adapter.ThronesAdapter
import com.kesavan.interview.peacockinterviewcode.main.presenter.ThronesPresenter
import com.kesavan.interview.peocockdi.annotation.Inject
import com.kesavan.interview.peocockdi.di.Injectors

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var thronesPresenter: ThronesPresenter

    private var thronesAdapter = ThronesAdapter()

    val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Injectors.inject(MainModule::class, this)
        setContentView(binding.root)
        binding.thronesList.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = thronesAdapter
        }
        thronesAdapter.loadThrones(thronesPresenter.getThronesList())
    }
}