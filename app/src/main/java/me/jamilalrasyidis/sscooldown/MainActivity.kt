package me.jamilalrasyidis.sscooldown

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import me.jamilalrasyidis.sscooldown.databinding.ActivityMainBinding
import me.jamilalrasyidis.sscooldown.utils.setBackgroundLayout

class MainActivity : AppCompatActivity() {

    private val binding by lazy { DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setBackgroundLayout(
            BACKGROUND_URL,
            binding.linearLayout
        )

        binding.textDate.text = "December 23, 2019"
        binding.textDays.text = "5 days (about 1 week)"
        binding.textTime.text = "23:00:33"
        binding.textTitle.text = "Incoming : Holiday Sale"
    }

    companion object {
        private const val BACKGROUND_URL = "https://fsb.zobj.net/crop.php?r=L3iNyQwZ83wZXP2Fr4HFpcMYbEIu8fRtpt9FyN5xV4nRdBb4oDTMua9dOjv0fwZtChg7Y5Tl-L5JJJPysKvs4jqfvUV7DL6_FlV75dGOcdeDW-fP6XlO9ceeru2lVI9OVWFfdSyT7id8aejyxT14ODwVdLfA3YaGg85pLB3io6RUhOy9UqXacOdDMlOE8ofT29rVPaVoCBIqgLZn"
    }
}
