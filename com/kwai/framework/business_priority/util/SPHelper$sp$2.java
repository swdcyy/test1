package com.kwai.framework.business_priority.util.SPHelper$sp$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.content.SharedPreferences;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Application;
import o56.a;
import android.content.Context;
import vid.b;

public final class SPHelper$sp$2 extends Lambda implements a	// class@0014e0
{
    public static final SPHelper$sp$2 INSTANCE;

    static {
       SPHelper$sp$2.INSTANCE = new SPHelper$sp$2();
    }
    public void SPHelper$sp$2(){
       super(0);
    }
    public final SharedPreferences invoke(){
       Object obj = PatchProxy.apply(null, this, SPHelper$sp$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.c(a.b(), "business_priority", 0);
    }
    public Object invoke(){
       return this.invoke();
    }
}
