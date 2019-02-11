package andikaapp.onoff.utilities

import java.util.concurrent.Executors

/**
 * Created by andika on 1/27/19.
 */
private val IO_EXECUTOR = Executors.newSingleThreadExecutor()

fun runOnBackgroundThread(f: () -> Unit) {
    IO_EXECUTOR.execute(f)
}