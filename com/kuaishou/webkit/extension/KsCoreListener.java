package com.kuaishou.webkit.extension.KsCoreListener;
import java.lang.Object;
import java.lang.String;
import org.json.JSONObject;
import android.os.Bundle;
import com.kuaishou.webkit.internal.KsCorePerformanceTiming;
import android.os.Message;

public class KsCoreListener	// class@0012d6
{

    public void KsCoreListener(){
       super();
    }
    public void onEvent(String p0,JSONObject p1){
    }
    public void onFirstWebViewCreated(boolean p0){
    }
    public void onLogging(int p0,String p1,String p2){
    }
    public final boolean onMiscMessage(int p0,Bundle p1){
       switch (p0){
           case 'e':
             KsCorePerformanceTiming.NotifyGeneralPerformanceTiming(p1.getString("name"), p1.getLong("time_stamp"));
             return true;
           case 'f':
             KsCorePerformanceTiming.NotifySharedStaticsCreated();
             return true;
           case 'g':
             KsCorePerformanceTiming.NotifyAsyncInitResult(p1.getBoolean("result"));
             return true;
           default:
             return false;
       }
    }
    public final boolean onMiscMessage(Message p0){
       return false;
    }
    public void onTimeDotting(String p0,long p1){
       KsCorePerformanceTiming.NotifyKeyPerformanceTiming(p0, p1);
    }
}
