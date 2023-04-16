package com.kwai.performance.fluency.fps.monitor.JankHandlerThread;
import android.os.HandlerThread;
import com.kwai.performance.fluency.fps.monitor.JankHandlerThread$HANDLER$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.String;

public final class JankHandlerThread extends HandlerThread	// class@00106a
{
    public static final JankHandlerThread b;
    public static final p c;

    static {
       JankHandlerThread.b = new JankHandlerThread();
       JankHandlerThread.c = s.c(JankHandlerThread$HANDLER$2.INSTANCE);
    }
    public void JankHandlerThread(){
       super("JankThread");
    }
}
