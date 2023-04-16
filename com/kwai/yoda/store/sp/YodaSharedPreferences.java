package com.kwai.yoda.store.sp.YodaSharedPreferences;
import com.kwai.yoda.store.sp.YodaSharedPreferences$a;
import nsd.u;
import java.lang.Object;
import com.kwai.yoda.store.sp.YodaSharedPreferences$mStore$2;
import msd.a;
import qrd.p;
import qrd.s;
import xb7.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class YodaSharedPreferences	// class@0012f3
{
    public final p a;
    public static final YodaSharedPreferences$a b;

    static {
       YodaSharedPreferences.b = new YodaSharedPreferences$a(null);
    }
    public void YodaSharedPreferences(){
       super();
       this.a = s.c(YodaSharedPreferences$mStore$2.INSTANCE);
    }
    public final a a(){
       Object obj = PatchProxy.apply(null, this, YodaSharedPreferences.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
}
