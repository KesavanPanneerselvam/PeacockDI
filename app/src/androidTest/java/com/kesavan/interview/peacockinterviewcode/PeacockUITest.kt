package com.kesavan.interview.peacockinterviewcode

import android.view.View
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.kesavan.interview.peacockinterviewcode.main.MainActivity
import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Rule
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class PeacockUITest {

    @Rule
    @JvmField
    public val activityRule: ActivityScenarioRule<MainActivity> = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testRecyclerVisible() {
        activityRule.scenario.onActivity { mainActivity ->
            Assert.assertEquals(View.VISIBLE,mainActivity.findViewById<View?>(R.id.thrones_list).visibility)
        }
    }
    @Test
    fun testSampleRecyclerVisible() {
        activityRule.scenario.onActivity { mainActivity ->
            Assert.assertEquals(53,mainActivity.binding.thronesList.adapter?.itemCount)
        }
    }
}