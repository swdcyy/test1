package com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtilOld$enableSlideBottomEntryTextFontWithBold$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class NasaExperimentUtilOld$enableSlideBottomEntryTextFontWithBold$2 extends Lambda implements a	// class@00187e
{
    public static final NasaExperimentUtilOld$enableSlideBottomEntryTextFontWithBold$2 INSTANCE;

    static {
       NasaExperimentUtilOld$enableSlideBottomEntryTextFontWithBold$2.INSTANCE = new NasaExperimentUtilOld$enableSlideBottomEntryTextFontWithBold$2();
    }
    public void NasaExperimentUtilOld$enableSlideBottomEntryTextFontWithBold$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, NasaExperimentUtilOld$enableSlideBottomEntryTextFontWithBold$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("slideBottomEntryTextFontWithMedium", false);
    }
}
