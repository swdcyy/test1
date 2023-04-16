package com.kwai.component.uiconfig.homeslideplay.NasaSlidePlayExperimentUtil$enableLocalSlidePlayPreLoad$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class NasaSlidePlayExperimentUtil$enableLocalSlidePlayPreLoad$2 extends Lambda implements a	// class@000be3
{
    public static final NasaSlidePlayExperimentUtil$enableLocalSlidePlayPreLoad$2 INSTANCE;

    static {
       NasaSlidePlayExperimentUtil$enableLocalSlidePlayPreLoad$2.INSTANCE = new NasaSlidePlayExperimentUtil$enableLocalSlidePlayPreLoad$2();
    }
    public void NasaSlidePlayExperimentUtil$enableLocalSlidePlayPreLoad$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, NasaSlidePlayExperimentUtil$enableLocalSlidePlayPreLoad$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (a.t().d("disableLocalSlidePlayPreLoad", false) ^ 0x01);
    }
}
