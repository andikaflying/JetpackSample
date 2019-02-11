package andikaapp.onoff.viewmodels.sample

import andikaapp.onoff.data.models.account.AuthResponse
import andikaapp.onoff.data.models.account.RegisterRequest
import andikaapp.onoff.data.models.sample.Request
import andikaapp.onoff.data.models.sample.Response
import andikaapp.onoff.data.repository.ProfileRepository
import andikaapp.onoff.data.repository.sample.SampleRepository
import android.util.Log
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel

/**
 * Created by andika on 1/27/19.
 */

class SampleViewModel constructor(private val repository: SampleRepository) : ViewModel() {

    private val response = MediatorLiveData<Response>();

    fun register(registerRequest: Request) : MediatorLiveData<Response> {
        val liveRegisterResponse = repository.register(registerRequest);
        response.addSource(liveRegisterResponse, response::setValue)
        return response;
    }

}