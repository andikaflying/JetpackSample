package andikaapp.onoff.viewmodels

import andikaapp.onoff.data.models.account.AuthResponse
import andikaapp.onoff.data.models.account.RegisterRequest
import andikaapp.onoff.data.repository.ProfileRepository
import androidx.lifecycle.ViewModel
import androidx.lifecycle.MediatorLiveData

/**
 * Created by andika on 1/27/19.
 */

class ProfileViewModel constructor(private val repository: ProfileRepository) : ViewModel() {

    private val authResponse = MediatorLiveData<AuthResponse>();

    fun register(registerRequest: RegisterRequest) : MediatorLiveData<AuthResponse> {

        return authResponse;
    }

}