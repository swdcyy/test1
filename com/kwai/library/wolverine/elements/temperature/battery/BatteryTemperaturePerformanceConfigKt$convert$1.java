package com.kwai.library.wolverine.elements.temperature.battery.BatteryTemperaturePerformanceConfigKt$convert$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.google.common.collect.Range;
import java.lang.Integer;
import com.kwai.library.wolverine.elements.temperature.battery.BatteryTemperaturePerformanceItemRangeConfig;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class BatteryTemperaturePerformanceConfigKt$convert$1 extends Lambda implements p	// class@000ab7
{
    public static final BatteryTemperaturePerformanceConfigKt$convert$1 INSTANCE;

    static {
       BatteryTemperaturePerformanceConfigKt$convert$1.INSTANCE = new BatteryTemperaturePerformanceConfigKt$convert$1();
    }
    public void BatteryTemperaturePerformanceConfigKt$convert$1(){
       super(2);
    }
    public final BatteryTemperaturePerformanceItemRangeConfig invoke(Range p0,Integer p1){
       a.p(p0, "range");
       int i = (p1 != null)? p1.intValue(): 10;
       return new BatteryTemperaturePerformanceItemRangeConfig(p0, i);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
}
