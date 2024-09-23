package codelab.javiersolis.unit2_3_3.i220924.tipcalculator

import org.junit.Assert.assertEquals
import org.junit.Test
import java.text.NumberFormat

/**
 * Created by Javier J. Solis Flores on 22/09/24.
 * @email solis.unmsm@gmail.com
 * @github https://github.com/JavierSolis
 */
class TipCalculateTest
{
    @Test
    fun calculateTip_20PercentNoRoundup() {
        val amount = 10.00
        val tipPercent = 20.00
        val expectedTip = NumberFormat.getCurrencyInstance().format(2)
        val actualTip = calculateTip(amount = amount, tipPercent = tipPercent, false)
        assertEquals(expectedTip, actualTip)
    }
}