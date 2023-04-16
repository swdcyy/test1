package com.kwai.performance.fluency.fps.monitor.FpsHandlerThread$HANDLER$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.os.Handler;
import com.kwai.performance.fluency.fps.monitor.FpsHandlerThread;
import android.os.Looper;
import android.os.HandlerThread;
import java.lang.Object;

public final class FpsHandlerThread$HANDLER$2 extends Lambda implements a	// class@000d7e
{
    public static final FpsHandlerThread$HANDLER$2 INSTANCE;

    static {
       FpsHandlerThread$HANDLER$2.INSTANCE = new FpsHandlerThread$HANDLER$2();
    }
    public void FpsHandlerThread$HANDLER$2(){
       super(0);
    }
    public final Handler invoke(){
       return new Handler(FpsHandlerThread.b.getLooper());
    }
    public Object invoke(){
       return this.invoke();
    }
}
