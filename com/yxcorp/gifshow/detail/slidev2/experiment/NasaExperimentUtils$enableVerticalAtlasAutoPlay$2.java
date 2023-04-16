package com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils$enableVerticalAtlasAutoPlay$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import xf6.d;
import rkd.b;
import xf6.k$a;

public final class NasaExperimentUtils$enableVerticalAtlasAutoPlay$2 extends Lambda implements a	// class@0018a3
{
    public static final NasaExperimentUtils$enableVerticalAtlasAutoPlay$2 INSTANCE;

    static {
       NasaExperimentUtils$enableVerticalAtlasAutoPlay$2.INSTANCE = new NasaExperimentUtils$enableVerticalAtlasAutoPlay$2();
    }
    public void NasaExperimentUtils$enableVerticalAtlasAutoPlay$2(){
       super(0);
    }
    public final Boolean invoke(){
       Object obj = PatchProxy.apply(null, this, NasaExperimentUtils$enableVerticalAtlasAutoPlay$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.p.e(Boolean.valueOf((b.f() ^ 0x01)));
    }
    public Object invoke(){
       return this.invoke();
    }
}
