package com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper$isAdjustLiveComment$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.utility.SystemUtil;
import com.kwai.framework.abtest.f;
import xf6.i;

public final class LocalConfigKeyHelper$isAdjustLiveComment$2 extends Lambda implements a	// class@0020f5
{
    public static final LocalConfigKeyHelper$isAdjustLiveComment$2 INSTANCE;

    static {
       LocalConfigKeyHelper$isAdjustLiveComment$2.INSTANCE = new LocalConfigKeyHelper$isAdjustLiveComment$2();
    }
    public void LocalConfigKeyHelper$isAdjustLiveComment$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, LocalConfigKeyHelper$isAdjustLiveComment$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (SystemUtil.K() && !f.a("adjustNearbyV4LiveComment")) {
          i.c("ADJUST_COMMENT_HEIGHT");
       }
       return f.a("adjustNearbyV4LiveComment");
    }
}
