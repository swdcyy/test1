package com.kuaishou.live.lite.framework.utils.JankMessageMonitor$installOnTestChannel$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Looper;
import android.util.Printer;

public final class JankMessageMonitor$installOnTestChannel$1 extends Lambda implements a	// class@000977
{
    public static final JankMessageMonitor$installOnTestChannel$1 INSTANCE;

    static {
       JankMessageMonitor$installOnTestChannel$1.INSTANCE = new JankMessageMonitor$installOnTestChannel$1();
    }
    public void JankMessageMonitor$installOnTestChannel$1(){
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, JankMessageMonitor$installOnTestChannel$1.class, "1")) {
          return;
       }
       Looper.getMainLooper().setMessageLogging(null);
       return;
    }
}
