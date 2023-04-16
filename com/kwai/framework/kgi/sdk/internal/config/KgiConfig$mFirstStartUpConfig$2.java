package com.kwai.framework.kgi.sdk.internal.config.KgiConfig$mFirstStartUpConfig$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.framework.kgi.sdk.internal.config.KgiConfigItem;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.kgi.sdk.internal.config.KgiConfig;
import java.lang.StringBuilder;
import y76.b;

public final class KgiConfig$mFirstStartUpConfig$2 extends Lambda implements a	// class@001588
{
    public static final KgiConfig$mFirstStartUpConfig$2 INSTANCE;

    static {
       KgiConfig$mFirstStartUpConfig$2.INSTANCE = new KgiConfig$mFirstStartUpConfig$2();
    }
    public void KgiConfig$mFirstStartUpConfig$2(){
       super(0);
    }
    public final KgiConfigItem invoke(){
       KgiConfigItem obj = PatchProxy.apply(null, this, KgiConfig$mFirstStartUpConfig$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = KgiConfig.g.h();
       b.e("KgiConfig#mFirstStartUpConfig : = "+obj, false, 2, null);
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
