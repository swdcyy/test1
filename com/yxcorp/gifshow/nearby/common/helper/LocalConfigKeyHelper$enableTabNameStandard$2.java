package com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper$enableTabNameStandard$2;
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

public final class LocalConfigKeyHelper$enableTabNameStandard$2 extends Lambda implements a	// class@0020f3
{
    public static final LocalConfigKeyHelper$enableTabNameStandard$2 INSTANCE;

    static {
       LocalConfigKeyHelper$enableTabNameStandard$2.INSTANCE = new LocalConfigKeyHelper$enableTabNameStandard$2();
    }
    public void LocalConfigKeyHelper$enableTabNameStandard$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, LocalConfigKeyHelper$enableTabNameStandard$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (SystemUtil.K()) {
          int i = i.g("enableTabNameV2");
          if (i != b) {
             b = (i != 2)? f.a("enableTabNameV2"): false;
          }
       }else {
          b = f.a("enableTabNameV2");
       }
       return b;
    }
}
