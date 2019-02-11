package andikaapp.onoff.viewmodels

import andikaapp.onoff.data.repository.ProfileRepository
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

/**
 * Created by andika on 1/27/19.
 */

class ProfileViewModelFactory(private val repository : ProfileRepository) : ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>) = ProfileViewModel(repository) as T

}