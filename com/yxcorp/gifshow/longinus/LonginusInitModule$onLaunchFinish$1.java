package com.yxcorp.gifshow.longinus.LonginusInitModule$onLaunchFinish$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Number;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.longinus.LonginusLog;
import com.yxcorp.gifshow.longinus.LonginusInitModule$onLaunchFinish$1$a;
import java.lang.Runnable;
import f97.d;

public final class LonginusInitModule$onLaunchFinish$1 extends Lambda implements l	// class@001b6b
{
    public static final LonginusInitModule$onLaunchFinish$1 INSTANCE;

    static {
       LonginusInitModule$onLaunchFinish$1.INSTANCE = new LonginusInitModule$onLaunchFinish$1();
    }
    public void LonginusInitModule$onLaunchFinish$1(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0.intValue());
       return l1.a;
    }
    public final void invoke(int p0){
       if (PatchProxy.isSupport(LonginusInitModule$onLaunchFinish$1.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LonginusInitModule$onLaunchFinish$1.class, "1")) {
          return;
       }
       LonginusLog.d("longinus", "prepare status="+p0);
       d.b(new LonginusInitModule$onLaunchFinish$1$a(p0));
       return;
    }
}
