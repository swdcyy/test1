package com.yxcorp.gifshow.follow.common.degrade.policy.FollowDeviceBenchmarkConfigKt$convert$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.google.common.collect.Range;
import java.lang.Integer;
import com.yxcorp.gifshow.follow.common.degrade.policy.FollowDeviceBenchmarkItemRangeConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class FollowDeviceBenchmarkConfigKt$convert$1 extends Lambda implements p	// class@001046
{
    public static final FollowDeviceBenchmarkConfigKt$convert$1 INSTANCE;

    static {
       FollowDeviceBenchmarkConfigKt$convert$1.INSTANCE = new FollowDeviceBenchmarkConfigKt$convert$1();
    }
    public void FollowDeviceBenchmarkConfigKt$convert$1(){
       super(2);
    }
    public final FollowDeviceBenchmarkItemRangeConfig invoke(Range p0,Integer p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, FollowDeviceBenchmarkConfigKt$convert$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "range");
       int i = (p1 != null)? p1.intValue(): Integer.MAX_VALUE;
       return new FollowDeviceBenchmarkItemRangeConfig(p0, i);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
}
