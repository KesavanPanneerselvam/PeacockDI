package com.kesavan.interview.peacockinterviewcode.di

import com.kesavan.interview.peacockinterviewcode.data.CommonData
import com.kesavan.interview.peacockinterviewcode.main.model.ThronesItem
import com.kesavan.interview.peocockdi.annotation.Inject

class Repository @Inject constructor(private val commonData: CommonData) {

    fun thronesList(): MutableList<ThronesItem> {
        return commonData.thronesList
    }
}