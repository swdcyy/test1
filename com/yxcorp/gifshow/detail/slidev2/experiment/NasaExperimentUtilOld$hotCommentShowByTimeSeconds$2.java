package com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtilOld$hotCommentShowByTimeSeconds$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.sdk.switchconfig.a;
import java.lang.Long;

public final class NasaExperimentUtilOld$hotCommentShowByTimeSeconds$2 extends Lambda implements a	// class@001885
{
    public static final NasaExperimentUtilOld$hotCommentShowByTimeSeconds$2 INSTANCE;

    static {
       NasaExperimentUtilOld$hotCommentShowByTimeSeconds$2.INSTANCE = new NasaExperimentUtilOld$hotCommentShowByTimeSeconds$2();
    }
    public void NasaExperimentUtilOld$hotCommentShowByTimeSeconds$2(){
       super(0);
    }
    public final long invoke(){
       Object obj = PatchProxy.apply(null, this, NasaExperimentUtilOld$hotCommentShowByTimeSeconds$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return a.t().b("hotCommentShowByTimeSeconds", 3);
    }
    public Object invoke(){
       return Long.valueOf(this.invoke());
    }
}
