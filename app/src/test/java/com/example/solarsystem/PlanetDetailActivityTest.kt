package com.example.solarsystem

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.contrib.RecyclerViewActions
import android.support.test.espresso.matcher.ViewMatchers.*
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import org.hamcrest.CoreMatchers.not
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)

class PlanetDetailActivityTest{
    @Rule @JvmField
    var activityRule = ActivityTestRule(PlanetDetailActivity::class.java)

    @Test
    fun test(){
        onView(withId(R.id.detail_toolbar))
                .check(matches(not(isDisplayed())))

        onView(withId(R.id.fab))
                .perform(click())

        onView(withId(R.id.detail_toolbar))
                .check(matches(withText("Replace with your own detail action")))
                .check(matches(isDisplayed()))

    }


}