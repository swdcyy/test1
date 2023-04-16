package com.kuaishou.live.basic.degrade.policy.LiveDeviceBenchmarkConfigKt$convert$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.google.common.collect.Range;
import java.lang.Integer;
import com.kuaishou.live.basic.degrade.policy.LiveDeviceBenchmarkItemRangeConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class LiveDeviceBenchmarkConfigKt$convert$1 extends Lambda implements p	// class@000cbb
{
    public static final LiveDeviceBenchmarkConfigKt$convert$1 INSTANCE;

    static {
       LiveDeviceBenchmarkConfigKt$convert$1.INSTANCE = new LiveDeviceBenchmarkConfigKt$convert$1();
    }
    public void LiveDeviceBenchmarkConfigKt$convert$1(){
       super(2);
    }
    public final LiveDeviceBenchmarkItemRangeConfig invoke(Range p0,Integer p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveDeviceBenchmarkConfigKt$convert$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "range");
       int i = (p1 != null)? p1.intValue(): Integer.MAX_VALUE;
       return new LiveDeviceBenchmarkItemRangeConfig(p0, i);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
}
