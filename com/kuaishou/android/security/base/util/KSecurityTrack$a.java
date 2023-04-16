package com.kuaishou.android.security.base.util.KSecurityTrack$a;
import com.kuaishou.android.security.base.util.KSecurityTrack$IKSecurityTrackCallback;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.android.security.base.util.KSecurityTrack$LEVEL;
import java.lang.Throwable;

public final class KSecurityTrack$a implements KSecurityTrack$IKSecurityTrackCallback	// class@0006af
{

    public void KSecurityTrack$a(){
       super();
    }
    public long getAppStartTime(){
       return 0x1869f;
    }
    public long getHomeStartTime(){
       return 0x1869f;
    }
    public int getLaunchSource(){
       return 0x1869f;
    }
    public String getSessionId(){
       return "default_sessionid";
    }
    public boolean isAppOnForeground(){
       return false;
    }
    public boolean isColdStart(){
       return false;
    }
    public void log(KSecurityTrack$LEVEL p0,String p1,String p2,Throwable p3){
    }
    public void logsdkReport(String p0,String p1){
    }
}
