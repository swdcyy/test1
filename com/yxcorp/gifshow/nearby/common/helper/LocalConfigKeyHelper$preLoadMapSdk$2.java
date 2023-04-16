package com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper$preLoadMapSdk$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.utility.SystemUtil;
import xf6.i;
import com.kwai.framework.abtest.f;

public final class LocalConfigKeyHelper$preLoadMapSdk$2 extends Lambda implements a	// class@002105
{
    public static final LocalConfigKeyHelper$preLoadMapSdk$2 INSTANCE;

    static {
       LocalConfigKeyHelper$preLoadMapSdk$2.INSTANCE = new LocalConfigKeyHelper$preLoadMapSdk$2();
    }
    public void LocalConfigKeyHelper$preLoadMapSdk$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, LocalConfigKeyHelper$preLoadMapSdk$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (SystemUtil.K()) {
          int i = i.g("pre_init_map");
          if (i != b) {
             b = (i != 2)? f.a("pre_init_map"): false;
          }
       }else {
          b = f.a("pre_init_map");
       }
       return b;
    }
}
