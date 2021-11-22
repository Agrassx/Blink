package io.blink

import android.view.View
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import android.widget.EditText

import android.widget.TextView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import org.hamcrest.Description
import org.hamcrest.Matcher
import org.hamcrest.TypeSafeMatcher


@LargeTest
@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule
    var activityRule: ActivityScenarioRule<MainActivity> =
        ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun shouldContainHelloWorld() {
        onView(withId(R.id.main_activity_text_view))
            .check(matches(hasValueEqualTo("F")))
    }

    private fun hasValueEqualTo(content: String): Matcher<View?> {
        return object : TypeSafeMatcher<View?>() {

            override fun describeTo(description: Description) {
                description.appendText("Has EditText/TextView the value:  $content")
            }

            override fun matchesSafely(view: View?): Boolean {
                if (view !is TextView && view !is EditText) {
                    return false
                }

                val text: String =
                    if (view is TextView) {
                        view.text.toString()
                    } else {
                        (view as EditText).text.toString()
                    }

                return text.equals(content, ignoreCase = true)
            }
        }
    }

}
