package com.yxcorp.gifshow.detail.slidev2.similarphoto.episodes.EpisodesEntranceConfig$Companion$ConfigInstance$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.detail.slidev2.similarphoto.episodes.EpisodesEntranceConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils;

public final class EpisodesEntranceConfig$Companion$ConfigInstance$2 extends Lambda implements a	// class@0019fb
{
    public static final EpisodesEntranceConfig$Companion$ConfigInstance$2 INSTANCE;

    static {
       EpisodesEntranceConfig$Companion$ConfigInstance$2.INSTANCE = new EpisodesEntranceConfig$Companion$ConfigInstance$2();
    }
    public void EpisodesEntranceConfig$Companion$ConfigInstance$2(){
       super(0);
    }
    public final EpisodesEntranceConfig invoke(){
       EpisodesEntranceConfig obj = PatchProxy.apply(null, this, EpisodesEntranceConfig$Companion$ConfigInstance$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new EpisodesEntranceConfig();
       obj.a = NasaExperimentUtils.f();
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
