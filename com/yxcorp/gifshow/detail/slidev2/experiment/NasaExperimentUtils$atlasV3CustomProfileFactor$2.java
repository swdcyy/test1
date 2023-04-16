package com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils$atlasV3CustomProfileFactor$2;
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
import java.lang.Float;

public final class NasaExperimentUtils$atlasV3CustomProfileFactor$2 extends Lambda implements a	// class@001899
{
    public static final NasaExperimentUtils$atlasV3CustomProfileFactor$2 INSTANCE;

    static {
       NasaExperimentUtils$atlasV3CustomProfileFactor$2.INSTANCE = new NasaExperimentUtils$atlasV3CustomProfileFactor$2();
    }
    public void NasaExperimentUtils$atlasV3CustomProfileFactor$2(){
       super(0);
    }
    public final float invoke(){
       Object[] objArray = null;
       Integer obj = PatchProxy.apply(objArray, this, NasaExperimentUtils$atlasV3CustomProfileFactor$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       obj = Integer.valueOf(l.e("ATLAS_V3_CUSTOM_PROFILE_FACTOR", -1));
       int i = (obj.intValue() > 0)? 1: 0;
       if (i) {
          objArray = obj;
       }
       int i1 = (objArray != null)? objArray.intValue(): a.t().a("atlasV3CustomProfileFactor", -1);
       return ((float)i1 / 10.00f);
    }
    public Object invoke(){
       return Float.valueOf(this.invoke());
    }
}
