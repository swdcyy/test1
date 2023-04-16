package com.kwai.component.uiconfig.homeslideplay.NasaSlidePlayExperimentUtil$enableOverAllSlideUpDown$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class NasaSlidePlayExperimentUtil$enableOverAllSlideUpDown$2 extends Lambda implements a	// class@000be4
{
    public static final NasaSlidePlayExperimentUtil$enableOverAllSlideUpDown$2 INSTANCE;

    static {
       NasaSlidePlayExperimentUtil$enableOverAllSlideUpDown$2.INSTANCE = new NasaSlidePlayExperimentUtil$enableOverAllSlideUpDown$2();
    }
    public void NasaSlidePlayExperimentUtil$enableOverAllSlideUpDown$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, NasaSlidePlayExperimentUtil$enableOverAllSlideUpDown$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("enableOverallSlideUpDown", false);
    }
}
