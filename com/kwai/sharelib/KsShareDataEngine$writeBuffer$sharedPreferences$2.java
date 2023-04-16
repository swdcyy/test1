package com.kwai.sharelib.KsShareDataEngine$writeBuffer$sharedPreferences$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.content.SharedPreferences$Editor;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import c97.d;
import android.content.SharedPreferences;

public final class KsShareDataEngine$writeBuffer$sharedPreferences$2 extends Lambda implements a	// class@0016a0
{
    public static final KsShareDataEngine$writeBuffer$sharedPreferences$2 INSTANCE;

    static {
       KsShareDataEngine$writeBuffer$sharedPreferences$2.INSTANCE = new KsShareDataEngine$writeBuffer$sharedPreferences$2();
    }
    public void KsShareDataEngine$writeBuffer$sharedPreferences$2(){
       super(0);
    }
    public final SharedPreferences$Editor invoke(){
       Object obj = PatchProxy.apply(null, this, KsShareDataEngine$writeBuffer$sharedPreferences$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.a().h("KS_SHARE_BUFFER", 0).edit();
    }
    public Object invoke(){
       return this.invoke();
    }
}
