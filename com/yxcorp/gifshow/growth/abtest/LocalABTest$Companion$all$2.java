package com.yxcorp.gifshow.growth.abtest.LocalABTest$Companion$all$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.growth.util.KotlinReflectCompatKt;
import qrd.p;

public final class LocalABTest$Companion$all$2 extends Lambda implements a	// class@0012de
{
    public static final LocalABTest$Companion$all$2 INSTANCE;

    static {
       LocalABTest$Companion$all$2.INSTANCE = new LocalABTest$Companion$all$2();
    }
    public void LocalABTest$Companion$all$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final List invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.apply(null, this, LocalABTest$Companion$all$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.apply(null, null, KotlinReflectCompatKt.class, "1");
       if (obj != patchProxyRe) {
       }else {
          obj = KotlinReflectCompatKt.a.getValue();
       }
       return obj;
    }
}
