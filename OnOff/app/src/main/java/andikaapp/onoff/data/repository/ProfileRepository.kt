package andikaapp.onoff.data.repository

import andikaapp.onoff.data.models.account.AuthResponse
import andikaapp.onoff.data.models.account.RegisterRequest
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

/**
 * Created by andika on 1/27/19.
 */
class ProfileRepository() {

//    val apiList : APIList = RetrofitManager.getInstance().service;

    fun register(registerRequest: RegisterRequest) : LiveData<AuthResponse> {
        val authResponse : MutableLiveData<AuthResponse> = MutableLiveData();

//        apiList.register(registerRequest).enqueue(object : Callback<AuthResponse> {
//            override fun onResponse(call: Call<DisplayMovieResponse>, response: Response<DisplayMovieResponse>) {
//                movieList.value = response.body()?.results;
//            }
//
//            override fun onFailure(call: Call<DisplayMovieResponse>, t: Throwable) {
//
//            }
//        })

        return authResponse;
    }


}