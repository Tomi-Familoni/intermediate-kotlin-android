package com.example.solarsystem

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.rule.ActivityTestRule
import androidx.test.ext.junit.runners.AndroidJUnit4
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
    fun checkDetail() {
        onView(withId(R.id.detail_toolbar))
                .check(matches(not(isDisplayed())))

        onView(withId(R.id.fab))
                .perform(click())

        onView(withId(R.id.detail_toolbar))
                .check(matches(withText("Replace with your own detail action")))
                .check(matches(isDisplayed()))

    }


}