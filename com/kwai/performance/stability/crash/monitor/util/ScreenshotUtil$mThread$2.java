package com.kwai.performance.stability.crash.monitor.util.ScreenshotUtil$mThread$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.os.HandlerThread;
import java.lang.String;
import java.lang.Object;

public final class ScreenshotUtil$mThread$2 extends Lambda implements a	// class@00120f
{
    public static final ScreenshotUtil$mThread$2 INSTANCE;

    static {
       ScreenshotUtil$mThread$2.INSTANCE = new ScreenshotUtil$mThread$2();
    }
    public void ScreenshotUtil$mThread$2(){
       super(0);
    }
    public final HandlerThread invoke(){
       HandlerThread handlerThrea = new HandlerThread("captureScreenshot");
       handlerThrea.start();
       return handlerThrea;
    }
    public Object invoke(){
       return this.invoke();
    }
}
