package com.kwai.framework.business_priority.util.SPHelper;
import com.kwai.framework.business_priority.util.SPHelper$sp$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import android.content.SharedPreferences;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class SPHelper	// class@0014e1
{
    public static final p a;
    public static final SPHelper b;

    static {
       SPHelper.b = new SPHelper();
       SPHelper.a = s.c(SPHelper$sp$2.INSTANCE);
    }
    public void SPHelper(){
       super();
    }
    public final SharedPreferences a(){
       Object obj = PatchProxy.apply(null, this, SPHelper.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SPHelper.a.getValue();
    }
}
