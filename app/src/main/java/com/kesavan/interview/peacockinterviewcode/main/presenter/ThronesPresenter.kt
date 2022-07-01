package com.kesavan.interview.peacockinterviewcode.main.presenter

import com.kesavan.interview.peacockinterviewcode.main.model.ThronesItem

interface ThronesPresenter {
    fun getThronesList():MutableList<ThronesItem>
}