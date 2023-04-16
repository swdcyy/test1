package com.kwai.component.uiconfig.homeslideplay.NasaSlidePlayExperimentUtil$getSummaryElementStyleConfig$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.sdk.switchconfig.a;
import java.lang.Integer;

public final class NasaSlidePlayExperimentUtil$getSummaryElementStyleConfig$2 extends Lambda implements a	// class@000be6
{
    public static final NasaSlidePlayExperimentUtil$getSummaryElementStyleConfig$2 INSTANCE;

    static {
       NasaSlidePlayExperimentUtil$getSummaryElementStyleConfig$2.INSTANCE = new NasaSlidePlayExperimentUtil$getSummaryElementStyleConfig$2();
    }
    public void NasaSlidePlayExperimentUtil$getSummaryElementStyleConfig$2(){
       super(0);
    }
    public final int invoke(){
       Object obj = PatchProxy.apply(null, this, NasaSlidePlayExperimentUtil$getSummaryElementStyleConfig$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a.t().a("enableSearchSummaryStyle", 0);
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
