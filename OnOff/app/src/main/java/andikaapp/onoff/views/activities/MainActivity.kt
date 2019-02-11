package andikaapp.onoff.views.activities

import andikaapp.onoff.R
import andikaapp.onoff.databinding.ActivityMainBinding
import andikaapp.onoff.utilities.InjectorUtils
import andikaapp.onoff.viewmodels.sample.SampleViewModel
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: SampleViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding : ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
    }

    private fun register() {
//        viewModel.register().observe(getView, Observer { movies ->
//            if (movies != null) {
//                Log.e("TAG", movies.size.toString())
//                adapter.submitList(movies)
//            }
//        })
    }

    private fun callingSample() {
//        viewModel.register().observe()

    }
}
