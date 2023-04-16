package com.kuaishou.android.security.base.util.KSecurityTrack$IKSecurityTrackCallback;
import java.lang.String;
import com.kuaishou.android.security.base.util.KSecurityTrack$LEVEL;
import java.lang.Throwable;

public interface abstract KSecurityTrack$IKSecurityTrackCallback	// class@0006ad
{

    long getAppStartTime();
    long getHomeStartTime();
    int getLaunchSource();
    String getSessionId();
    boolean isAppOnForeground();
    boolean isColdStart();
    void log(KSecurityTrack$LEVEL p0,String p1,String p2,Throwable p3);
    void logsdkReport(String p0,String p1);
}
