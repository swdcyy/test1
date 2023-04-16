package com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils$enableHorizontalAtlasAutoPlay$2;
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

public final class NasaExperimentUtils$enableHorizontalAtlasAutoPlay$2 extends Lambda implements a	// class@00189d
{
    public static final NasaExperimentUtils$enableHorizontalAtlasAutoPlay$2 INSTANCE;

    static {
       NasaExperimentUtils$enableHorizontalAtlasAutoPlay$2.INSTANCE = new NasaExperimentUtils$enableHorizontalAtlasAutoPlay$2();
    }
    public void NasaExperimentUtils$enableHorizontalAtlasAutoPlay$2(){
       super(0);
    }
    public final Boolean invoke(){
       Object obj = PatchProxy.apply(null, this, NasaExperimentUtils$enableHorizontalAtlasAutoPlay$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.q.e(Boolean.valueOf((b.f() ^ 0x01)));
    }
    public Object invoke(){
       return this.invoke();
    }
}
