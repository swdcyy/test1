package com.kwai.yoda.function.system.StartAccelerometerFunction$Companion$clearSensorOnDestroy$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import crd.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import rb7.c;
import rx7.r;
import brd.t;
import com.kwai.yoda.function.system.StartAccelerometerFunction$Companion$clearSensorOnDestroy$2$a;
import com.kwai.yoda.function.system.StartAccelerometerFunction$Companion$clearSensorOnDestroy$2$b;
import erd.g;

public final class StartAccelerometerFunction$Companion$clearSensorOnDestroy$2 extends Lambda implements a	// class@0011f4
{
    public static final StartAccelerometerFunction$Companion$clearSensorOnDestroy$2 INSTANCE;

    static {
       StartAccelerometerFunction$Companion$clearSensorOnDestroy$2.INSTANCE = new StartAccelerometerFunction$Companion$clearSensorOnDestroy$2();
    }
    public void StartAccelerometerFunction$Companion$clearSensorOnDestroy$2(){
       super(0);
    }
    public final b invoke(){
       Object obj = PatchProxy.apply(null, this, StartAccelerometerFunction$Companion$clearSensorOnDestroy$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return c.c.b(r.class).subscribe(StartAccelerometerFunction$Companion$clearSensorOnDestroy$2$a.b, StartAccelerometerFunction$Companion$clearSensorOnDestroy$2$b.b);
    }
    public Object invoke(){
       return this.invoke();
    }
}
