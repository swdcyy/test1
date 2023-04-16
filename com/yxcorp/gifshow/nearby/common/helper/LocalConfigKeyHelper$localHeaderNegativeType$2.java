package com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper$localHeaderNegativeType$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.utility.SystemUtil;
import xf6.i;
import com.kwai.framework.abtest.f;
import java.lang.Integer;

public final class LocalConfigKeyHelper$localHeaderNegativeType$2 extends Lambda implements a	// class@0020f9
{
    public static final LocalConfigKeyHelper$localHeaderNegativeType$2 INSTANCE;

    static {
       LocalConfigKeyHelper$localHeaderNegativeType$2.INSTANCE = new LocalConfigKeyHelper$localHeaderNegativeType$2();
    }
    public void LocalConfigKeyHelper$localHeaderNegativeType$2(){
       super(0);
    }
    public final int invoke(){
       Object obj = PatchProxy.apply(null, this, LocalConfigKeyHelper$localHeaderNegativeType$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (SystemUtil.K()) {
          return i.g("localHeaderNegativeType");
       }
       return f.f("localHeaderNegativeType", 0);
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
