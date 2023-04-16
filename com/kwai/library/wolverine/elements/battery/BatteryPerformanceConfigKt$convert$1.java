package com.kwai.library.wolverine.elements.battery.BatteryPerformanceConfigKt$convert$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.google.common.collect.Range;
import java.lang.Integer;
import com.kwai.library.wolverine.elements.battery.BatteryPerformanceItemRangeConfig;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class BatteryPerformanceConfigKt$convert$1 extends Lambda implements p	// class@000aac
{
    public static final BatteryPerformanceConfigKt$convert$1 INSTANCE;

    static {
       BatteryPerformanceConfigKt$convert$1.INSTANCE = new BatteryPerformanceConfigKt$convert$1();
    }
    public void BatteryPerformanceConfigKt$convert$1(){
       super(2);
    }
    public final BatteryPerformanceItemRangeConfig invoke(Range p0,Integer p1){
       a.p(p0, "range");
       int i = (p1 != null)? p1.intValue(): Integer.MAX_VALUE;
       return new BatteryPerformanceItemRangeConfig(p0, i);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
}
