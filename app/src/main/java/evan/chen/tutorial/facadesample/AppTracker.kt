package evan.chen.tutorial.facadesample

import android.app.Application
import android.content.Context
import com.google.android.gms.analytics.HitBuilders
import com.google.android.gms.analytics.Tracker


class AppTracker (context:Context) {
    private var tracker: Tracker

    init {
        val application = context.applicationContext as FacadeSampleApplication
        tracker = application.getDefaultTracker()
    }

    fun sendScreenTracker(screenName:String){
        // GA Screen
        tracker.setScreenName(screenName)
        tracker.send(HitBuilders.ScreenViewBuilder().build())
    }

    fun sendEvent(category:String, action:String) {
        // GA Event
        tracker.send(HitBuilders.EventBuilder()
                .setCategory(category)
                .setAction(action)
                .build())
    }
}