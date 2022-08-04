package truongtd.com.alarmapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import truongtd.com.alarmapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: DayOfWeekAdapter
    private lateinit var viewModel: AlarmViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initViews()
        initActions()
    }
    private fun initViews() {
        adapter = DayOfWeekAdapter()
        binding.rvDayOfWeek.adapter = adapter
        viewModel = AlarmViewModel()
        adapter.submitList(viewModel.generateListDayOfWeek())
    }

    private fun initActions() {}
}