package com.kwai.component.uiconfig.homeslideplay.NasaSlidePlayExperimentUtil$slideBottomEntryTextSize$2;
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

public final class NasaSlidePlayExperimentUtil$slideBottomEntryTextSize$2 extends Lambda implements a	// class@000be7
{
    public static final NasaSlidePlayExperimentUtil$slideBottomEntryTextSize$2 INSTANCE;

    static {
       NasaSlidePlayExperimentUtil$slideBottomEntryTextSize$2.INSTANCE = new NasaSlidePlayExperimentUtil$slideBottomEntryTextSize$2();
    }
    public void NasaSlidePlayExperimentUtil$slideBottomEntryTextSize$2(){
       super(0);
    }
    public final int invoke(){
       Object obj = PatchProxy.apply(null, this, NasaSlidePlayExperimentUtil$slideBottomEntryTextSize$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a.t().a("slideBottomEntryTextFont", 0);
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
