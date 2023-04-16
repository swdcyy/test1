package com.kwai.performance.fluency.fps.monitor.FpsHandlerThread;
import android.os.HandlerThread;
import com.kwai.performance.fluency.fps.monitor.FpsHandlerThread$HANDLER$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.String;
import android.os.Handler;
import java.lang.Object;

public final class FpsHandlerThread extends HandlerThread	// class@000d7f
{
    public static final FpsHandlerThread b;
    public static final p c;

    static {
       FpsHandlerThread.b = new FpsHandlerThread();
       FpsHandlerThread.c = s.c(FpsHandlerThread$HANDLER$2.INSTANCE);
    }
    public void FpsHandlerThread(){
       super("FpsThread");
    }
    public final Handler a(){
       return FpsHandlerThread.c.getValue();
    }
}
