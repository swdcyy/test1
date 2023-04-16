package com.facebook.common.time.AwakeTimeSinceBootClock;
import hb.b;
import hb.c;
import java.lang.Object;
import android.os.SystemClock;
import java.lang.System;

public class AwakeTimeSinceBootClock implements b, c	// class@000454
{
    public static final AwakeTimeSinceBootClock INSTANCE;

    static {
       AwakeTimeSinceBootClock.INSTANCE = new AwakeTimeSinceBootClock();
    }
    public void AwakeTimeSinceBootClock(){
       super();
    }
    public static AwakeTimeSinceBootClock get(){
       return AwakeTimeSinceBootClock.INSTANCE;
    }
    public long now(){
       return SystemClock.uptimeMillis();
    }
    public long nowNanos(){
       return System.nanoTime();
    }
}
