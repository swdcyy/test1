package com.kwai.feature.api.platform.tracker.plugin.LeaveApplicationTracker;
import android.content.Context;
import android.app.Activity;

public interface abstract LeaveApplicationTracker	// class@000aea
{

    void a();
    void b(Context p0);
    long c();
    void d(Activity p0);
    void onActivityPaused(Activity p0);
    void onActivityResumed(Activity p0);
}
