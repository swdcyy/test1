package com.yxcorp.gifshow.longinus.LonginusLog$logI$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.String;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.longinus.LonginusLog;
import java.lang.reflect.Method;

public final class LonginusLog$logI$1 extends Lambda implements p	// class@001b71
{
    public static final LonginusLog$logI$1 INSTANCE;

    static {
       LonginusLog$logI$1.INSTANCE = new LonginusLog$logI$1();
    }
    public void LonginusLog$logI$1(){
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       this.invoke(p0, p1);
       return l1.a;
    }
    public final void invoke(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LonginusLog$logI$1.class, "1")) {
          return;
       }
       a.p(p0, "tag");
       a.p(p1, "msg");
       Method c = LonginusLog.c;
       if (c != null) {
          Object[] objArray = new Object[]{p0,p1};
          c.invoke(null, objArray);
       }
       return;
    }
}
