package codelab.javiersolis.unit2_3_3.i220924.tipcalculator

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performTextInput
import codelab.javiersolis.unit2_3_3.i220924.tipcalculator.ui.theme.CodeLabTipCalculatorTheme
import org.junit.Rule
import org.junit.Test
import java.text.NumberFormat

/**
 * Created by Javier J. Solis Flores on 23/09/24.
 * @email solis.unmsm@gmail.com
 * @github https://github.com/JavierSolis
 */

class TipUITests {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun calculate_20_percent_tip() {
        composeTestRule.setContent {
            CodeLabTipCalculatorTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    TipTimeLayout(modifier = Modifier.padding(innerPadding))
                }
            }
        }

        val node = composeTestRule.onNodeWithText("Bill Amount")
        node.assertExists()
        node.performTextInput("10")

        val nodePercentage = composeTestRule.onNodeWithText("Tip Percentage")
        nodePercentage.assertExists()
        nodePercentage.performTextInput("20")

        val expectedTip = NumberFormat.getCurrencyInstance().format(2)
        composeTestRule.onNodeWithText("Tip Amount: $expectedTip").assertExists(
            "No node with this text was found."
        )
    }
}