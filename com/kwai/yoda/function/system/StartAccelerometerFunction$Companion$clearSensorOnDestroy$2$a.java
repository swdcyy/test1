package com.kwai.yoda.function.system.StartAccelerometerFunction$Companion$clearSensorOnDestroy$2$a;
import erd.g;
import java.lang.Object;
import rx7.r;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.yoda.function.system.StartAccelerometerFunction;
import java.util.Map;
import com.kwai.yoda.function.system.StartAccelerometerFunction$b;
import java.lang.Integer;

public final class StartAccelerometerFunction$Companion$clearSensorOnDestroy$2$a implements g	// class@0011f2
{
    public static final StartAccelerometerFunction$Companion$clearSensorOnDestroy$2$a b;

    static {
       StartAccelerometerFunction$Companion$clearSensorOnDestroy$2$a.b = new StartAccelerometerFunction$Companion$clearSensorOnDestroy$2$a();
    }
    public void StartAccelerometerFunction$Companion$clearSensorOnDestroy$2$a(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StartAccelerometerFunction$Companion$clearSensorOnDestroy$2$a.class, "1")) {
       }else {
          StartAccelerometerFunction.f.a().remove(Integer.valueOf(p0.a()));
       }
       return;
    }
}
