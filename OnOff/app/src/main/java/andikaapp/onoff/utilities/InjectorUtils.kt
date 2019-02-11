package andikaapp.onoff.utilities

import andikaapp.onoff.data.repository.ProfileRepository
import andikaapp.onoff.data.repository.sample.SampleRepository
import andikaapp.onoff.viewmodels.ProfileViewModelFactory
import andikaapp.onoff.viewmodels.sample.SampleViewModel
import andikaapp.onoff.viewmodels.sample.SampleViewModelFactory
import android.content.Context

/**
 * Created by andika on 1/27/19.
 */

object InjectorUtils {
    private fun getProfileRepository(context: Context): ProfileRepository {
        return ProfileRepository();
    }

    fun provideProfileViewModelFactory(context: Context): ProfileViewModelFactory {
        val repository = getProfileRepository(context)
        return ProfileViewModelFactory(repository)
    }

    private fun getSampleRepository(context: Context): SampleRepository {
        return SampleRepository();
    }

    fun provideSampleViewModelFactory(context: Context): SampleViewModelFactory {
        val repository = SampleRepository()
        return SampleViewModelFactory(repository)
    }
}
