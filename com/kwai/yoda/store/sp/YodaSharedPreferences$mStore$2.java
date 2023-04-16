package com.kwai.yoda.store.sp.YodaSharedPreferences$mStore$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import xb7.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.middleware.azeroth.Azeroth2;

public final class YodaSharedPreferences$mStore$2 extends Lambda implements a	// class@0012f2
{
    public static final YodaSharedPreferences$mStore$2 INSTANCE;

    static {
       YodaSharedPreferences$mStore$2.INSTANCE = new YodaSharedPreferences$mStore$2();
    }
    public void YodaSharedPreferences$mStore$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final a invoke(){
       Object obj = PatchProxy.apply(null, this, YodaSharedPreferences$mStore$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Azeroth2.B.b("yoda_sp");
    }
}
