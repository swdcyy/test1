package com.yxcorp.gifshow.longinus.LonginusLog$logE$1;
import msd.q;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.String;
import java.lang.Throwable;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.longinus.LonginusLog;
import java.lang.reflect.Method;

public final class LonginusLog$logE$1 extends Lambda implements q	// class@001b70
{
    public static final LonginusLog$logE$1 INSTANCE;

    static {
       LonginusLog$logE$1.INSTANCE = new LonginusLog$logE$1();
    }
    public void LonginusLog$logE$1(){
       super(3);
    }
    public Object invoke(Object p0,Object p1,Object p2){
       this.invoke(p0, p1, p2);
       return l1.a;
    }
    public final void invoke(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LonginusLog$logE$1.class, "1")) {
          return;
       }
       a.p(p0, "tag");
       a.p(p1, "msg");
       Method d = LonginusLog.d;
       if (d != null) {
          Object[] objArray = new Object[]{p0,p1,p2};
          d.invoke(null, objArray);
       }
       return;
    }
}
