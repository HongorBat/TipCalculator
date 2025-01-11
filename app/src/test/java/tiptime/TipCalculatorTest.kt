package tiptime

import com.example.tiptime.calculateTip
import junit.framework.TestCase.assertEquals
import org.junit.Test
import java.text.NumberFormat

class TipCalculatorTest {

    @Test
    fun calcualteTip_20PercentNoRoundUp() {
        val amount = 10.00
        val tipPercent = 20.00

        val expectedTip = NumberFormat.getCurrencyInstance().format(2)

        val actualTip = calculateTip(amount = amount, tipPercent = tipPercent, false)

        assertEquals(expectedTip, actualTip)
    }
}