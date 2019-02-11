package andikaapp.onoff.viewmodels.sample

import andikaapp.onoff.data.repository.ProfileRepository
import andikaapp.onoff.data.repository.sample.SampleRepository
import andikaapp.onoff.viewmodels.ProfileViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class SampleViewModelFactory(private val repository : SampleRepository) : ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>) = SampleViewModel(repository) as T

}