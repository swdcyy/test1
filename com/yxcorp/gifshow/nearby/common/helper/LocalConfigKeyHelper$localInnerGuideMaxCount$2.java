package com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper$localInnerGuideMaxCount$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.sdk.switchconfig.a;
import java.lang.Integer;

public final class LocalConfigKeyHelper$localInnerGuideMaxCount$2 extends Lambda implements a	// class@0020fa
{
    public static final LocalConfigKeyHelper$localInnerGuideMaxCount$2 INSTANCE;

    static {
       LocalConfigKeyHelper$localInnerGuideMaxCount$2.INSTANCE = new LocalConfigKeyHelper$localInnerGuideMaxCount$2();
    }
    public void LocalConfigKeyHelper$localInnerGuideMaxCount$2(){
       super(0);
    }
    public final int invoke(){
       Object obj = PatchProxy.apply(null, this, LocalConfigKeyHelper$localInnerGuideMaxCount$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a.t().a("localSlideTipsGuideMaxDisplayCount", 0);
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
