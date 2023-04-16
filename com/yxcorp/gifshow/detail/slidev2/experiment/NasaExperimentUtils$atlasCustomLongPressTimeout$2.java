package com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils$atlasCustomLongPressTimeout$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import xf6.d;
import xf6.l;
import java.lang.Integer;
import com.kwai.sdk.switchconfig.a;

public final class NasaExperimentUtils$atlasCustomLongPressTimeout$2 extends Lambda implements a	// class@001897
{
    public static final NasaExperimentUtils$atlasCustomLongPressTimeout$2 INSTANCE;

    static {
       NasaExperimentUtils$atlasCustomLongPressTimeout$2.INSTANCE = new NasaExperimentUtils$atlasCustomLongPressTimeout$2();
    }
    public void NasaExperimentUtils$atlasCustomLongPressTimeout$2(){
       super(0);
    }
    public final int invoke(){
       Object[] objArray = null;
       Integer obj = PatchProxy.apply(objArray, this, NasaExperimentUtils$atlasCustomLongPressTimeout$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = Integer.valueOf(l.e("ATLAS_CUSTOM_LONG_PRESS_TIMEOUT", -1));
       int i = (obj.intValue() > 0)? 1: 0;
       if (i) {
          objArray = obj;
       }
       int i1 = (objArray != null)? objArray.intValue(): a.t().a("atlasCustomLongPressTimeout", -1);
       return i1;
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
