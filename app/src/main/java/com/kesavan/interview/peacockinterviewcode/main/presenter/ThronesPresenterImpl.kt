package com.kesavan.interview.peacockinterviewcode.main.presenter

import com.kesavan.interview.peacockinterviewcode.data.CommonData
import com.kesavan.interview.peacockinterviewcode.di.Repository
import com.kesavan.interview.peacockinterviewcode.main.model.ThronesItem
import com.kesavan.interview.peocockdi.annotation.Inject

class ThronesPresenterImpl @Inject constructor(
  private val repository: Repository
) : ThronesPresenter {

  override fun getThronesList(): MutableList<ThronesItem> {
    return repository.thronesList()
  }
}