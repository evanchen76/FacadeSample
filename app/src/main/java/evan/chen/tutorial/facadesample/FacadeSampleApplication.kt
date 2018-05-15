package evan.chen.tutorial.facadesample

import android.app.Application
import android.R.xml
import com.google.android.gms.analytics.GoogleAnalytics
import com.google.android.gms.analytics.Tracker


class FacadeSampleApplication : Application() {

    private var sAnalytics: GoogleAnalytics? = null
    private var sTracker: Tracker? = null

    override fun onCreate() {
        super.onCreate()

        sAnalytics = GoogleAnalytics.getInstance(this)
    }

    /**
     * Gets the default [Tracker] for this [Application].
     * @return tracker
     */
    @Synchronized
    fun getDefaultTracker(): Tracker {
        // To enable debug logging use: adb shell setprop log.tag.GAv4 DEBUG
        if (sTracker == null) {
            sTracker = sAnalytics!!.newTracker(R.xml.global_tracker)
        }

        return sTracker!!
    }

}