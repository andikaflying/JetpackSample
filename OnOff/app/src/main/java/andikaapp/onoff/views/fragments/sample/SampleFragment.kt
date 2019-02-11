package andikaapp.onoff.views.fragments.sample

import andikaapp.onoff.data.models.sample.Request
import andikaapp.onoff.databinding.FragmentSampleBinding
import andikaapp.onoff.utilities.InjectorUtils
import andikaapp.onoff.viewmodels.sample.SampleViewModel
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders

class SampleFragment : Fragment() {
    private lateinit var viewModel: SampleViewModel
    private lateinit var binding: FragmentSampleBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentSampleBinding.inflate(inflater, container, false)
        val context = context ?: return binding.root

        val factory = InjectorUtils.provideSampleViewModelFactory(context);
        viewModel = ViewModelProviders.of(this, factory).get(SampleViewModel::class.java)
        displayAccountDetail()
        return binding.root;
    }

    private fun displayAccountDetail() {
        val request: Request = Request("morpheus", "leader")
        viewModel.register(request).observe(viewLifecycleOwner, Observer { responseData ->
            if (responseData != null) {
                binding.userDetail = responseData
            }
        })
    }
}