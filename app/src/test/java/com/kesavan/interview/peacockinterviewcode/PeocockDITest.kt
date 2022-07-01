package com.kesavan.interview.peacockinterviewcode

import com.kesavan.interview.peacockinterviewcode.di.AppModule
import com.kesavan.interview.peacockinterviewcode.di.Repository
import com.kesavan.interview.peacockinterviewcode.main.MainModule
import com.kesavan.interview.peacockinterviewcode.main.presenter.ThronesPresenter
import com.kesavan.interview.peocockdi.annotation.Inject
import com.kesavan.interview.peocockdi.di.Injectors
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class PeocockDITest {

    @Inject
    lateinit var repository: Repository

    @Inject
    lateinit var thronesPresenter: ThronesPresenter

    @Before
    fun setupModule(){
        Injectors.injectApp(AppModule::class)
        Injectors.inject(MainModule::class, this)
    }

    @Test
    fun check_repositoryisNotNull() {
        val list=repository.thronesList()
        Assert.assertNotNull(list)
    }

    @Test
    fun check_presenterisNotNull() {
        val list=thronesPresenter.getThronesList()
        Assert.assertNotNull(list)
    }

    @Test
    fun check_itemtitleismatchingornot() {
        val list=repository.thronesList()
        Assert.assertEquals("Lady of Winterfell",list.get(10).title)
    }
}