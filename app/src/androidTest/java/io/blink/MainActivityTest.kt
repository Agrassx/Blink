package io.blink

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.assertTextEquals
import androidx.compose.ui.test.hasTestTag
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@LargeTest
@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule(MainActivity::class.java)

    @Test
    fun shouldContainHelloWorld() {
        val textView = composeTestRule.onNode(
            hasTestTag("text"),
            useUnmergedTree = true,
        )

        textView.apply {
            assertIsDisplayed()
            assertTextEquals("Hello world")
        }
    }

    @Test
    fun shouldContainOneLinkWithTitleGoogleInList() {
        val list = composeTestRule.onNode(
            hasTestTag("linkList"),
        )

        list.apply {
            assertIsDisplayed()

            assert(
                hasAnyChild(
                    hasText("Google")
                )
            )
        }
    }

    @Test
    fun shouldContainOneLinkWithClickableUrlInList() {

        composeTestRule.onNodeWithTag("linkList-item1")
            .apply {
                assertHasClickAction()
                assertIsDisplayed()
            }
    }


}
