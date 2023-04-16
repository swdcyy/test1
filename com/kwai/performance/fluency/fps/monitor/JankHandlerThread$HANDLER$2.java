package com.kwai.performance.fluency.fps.monitor.JankHandlerThread$HANDLER$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.os.Handler;
import com.kwai.performance.fluency.fps.monitor.JankHandlerThread;
import android.os.Looper;
import android.os.HandlerThread;
import java.lang.Object;

public final class JankHandlerThread$HANDLER$2 extends Lambda implements a	// class@001069
{
    public static final JankHandlerThread$HANDLER$2 INSTANCE;

    static {
       JankHandlerThread$HANDLER$2.INSTANCE = new JankHandlerThread$HANDLER$2();
    }
    public void JankHandlerThread$HANDLER$2(){
       super(0);
    }
    public final Handler invoke(){
       return new Handler(JankHandlerThread.b.getLooper());
    }
    public Object invoke(){
       return this.invoke();
    }
}
