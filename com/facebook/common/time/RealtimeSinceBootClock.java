package com.facebook.common.time.RealtimeSinceBootClock;
import hb.b;
import java.lang.Object;
import android.os.SystemClock;

public class RealtimeSinceBootClock implements b	// class@000455
{
    public static final RealtimeSinceBootClock a;

    static {
       RealtimeSinceBootClock.a = new RealtimeSinceBootClock();
    }
    public void RealtimeSinceBootClock(){
       super();
    }
    public static RealtimeSinceBootClock get(){
       return RealtimeSinceBootClock.a;
    }
    public long now(){
       return SystemClock.elapsedRealtime();
    }
}
