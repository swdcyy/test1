package com.kwai.slide.play.detail.utils.ExperimentUtils$pressControlSpeedRate$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Float;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.reflect.Type;
import com.kwai.framework.abtest.f;

public final class ExperimentUtils$pressControlSpeedRate$2 extends Lambda implements a	// class@001880
{
    public static final ExperimentUtils$pressControlSpeedRate$2 INSTANCE;

    static {
       ExperimentUtils$pressControlSpeedRate$2.INSTANCE = new ExperimentUtils$pressControlSpeedRate$2();
    }
    public void ExperimentUtils$pressControlSpeedRate$2(){
       super(0);
    }
    public final Float invoke(){
       Object obj = PatchProxy.apply(null, this, ExperimentUtils$pressControlSpeedRate$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return f.b("pressControlSpeedValue", Float.TYPE, Float.valueOf(2.00f));
    }
    public Object invoke(){
       return this.invoke();
    }
}
