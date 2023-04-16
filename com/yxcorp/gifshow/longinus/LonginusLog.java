package com.yxcorp.gifshow.longinus.LonginusLog;
import java.lang.String;
import com.yxcorp.gifshow.longinus.LonginusLog$logPropertiesSwitcher$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.longinus.LonginusLog$logClz$2;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.Throwable;
import com.yxcorp.gifshow.longinus.LonginusLog$logI$1;
import com.yxcorp.gifshow.longinus.LonginusLog$logE$1;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import msd.q;
import msd.p;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class LonginusLog	// class@001b73
{
    public static final p a;
    public static final p b;
    public static final Method c;
    public static final Method d;
    public static final p e;
    public static final q f;
    public static final LonginusLog g;

    static {
       Method declaredMeth;
       String str = String.class;
       LonginusLog longinusLog = new LonginusLog();
       LonginusLog.g = longinusLog;
       LonginusLog.a = s.c(LonginusLog$logPropertiesSwitcher$2.INSTANCE);
       LonginusLog.b = s.c(LonginusLog$logClz$2.INSTANCE);
       Class uClass = longinusLog.b();
       Method method = null;
       if (uClass != null) {
          Class[] uClassArray = new Class[]{str,str};
          declaredMeth = uClass.getDeclaredMethod("i", uClassArray);
       }else {
          declaredMeth = method;
       }
       LonginusLog.c = declaredMeth;
       Class uClass1 = longinusLog.b();
       if (uClass1 != null) {
          Class[] uClassArray1 = new Class[]{str,str,Throwable.class};
          method = uClass1.getDeclaredMethod("e", uClassArray1);
       }
       LonginusLog.d = method;
       LonginusLog.e = LonginusLog$logI$1.INSTANCE;
       LonginusLog.f = LonginusLog$logE$1.INSTANCE;
    }
    public void LonginusLog(){
       super();
    }
    public static final void a(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, LonginusLog.class, "4")) {
          return;
       }
       a.p(p0, "tag");
       a.p(p1, "msg");
       if (LonginusLog.g.c()) {
          LonginusLog.f.invoke(p0, p1, p2);
       }
       return;
    }
    public static final void d(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, LonginusLog.class, "3")) {
          return;
       }
       a.p(p0, "tag");
       a.p(p1, "msg");
       if (LonginusLog.g.c()) {
          LonginusLog.e.invoke(p0, p1);
       }
       return;
    }
    public final Class b(){
       Object obj = PatchProxy.apply(null, this, LonginusLog.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LonginusLog.b.getValue();
    }
    public final boolean c(){
       Object obj = PatchProxy.apply(null, this, LonginusLog.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = LonginusLog.a.getValue();
       }
       return obj.booleanValue();
    }
}
