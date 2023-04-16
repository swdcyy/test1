package com.kuaishou.growth.pendant.realtime.price.feature.PrtpFeatureManager$init$$inlined$forEach$lambda$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.String;
import java.lang.Object;
import java.lang.Number;
import java.lang.Boolean;

public final class PrtpFeatureManager$init$$inlined$forEach$lambda$1 extends Lambda implements l	// class@0006bc
{
    public final ConcurrentHashMap $featureMap$inlined;
    public final long $trimSince$inlined;
    public final String $uid$inlined;

    public void PrtpFeatureManager$init$$inlined$forEach$lambda$1(ConcurrentHashMap p0,String p1,long p2){
       this.$featureMap$inlined = p0;
       this.$uid$inlined = p1;
       this.$trimSince$inlined = p2;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0.longValue()));
    }
    public final boolean invoke(long p0){
       boolean b = (p0 - this.$trimSince$inlined < 0)? true: false;
       return b;
    }
}
