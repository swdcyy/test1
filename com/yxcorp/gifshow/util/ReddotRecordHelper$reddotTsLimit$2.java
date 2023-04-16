package com.yxcorp.gifshow.util.ReddotRecordHelper$reddotTsLimit$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.edge.reco.ctr.config.CtrPredictionRuntimeConfig;
import com.kwai.edge.reco.ctr.config.CtrPredictionRuntimeConfig$a;
import com.kwai.edge.reco.ctr.config.CTRFeatureConfig;
import com.kwai.edge.reco.ctr.config.RedDotFeature;
import java.lang.Object;
import java.lang.Integer;

public final class ReddotRecordHelper$reddotTsLimit$2 extends Lambda implements a	// class@001f25
{
    public static final ReddotRecordHelper$reddotTsLimit$2 INSTANCE;

    static {
       ReddotRecordHelper$reddotTsLimit$2.INSTANCE = new ReddotRecordHelper$reddotTsLimit$2();
    }
    public void ReddotRecordHelper$reddotTsLimit$2(){
       super(0);
    }
    public final int invoke(){
       return CtrPredictionRuntimeConfig.c.a().c().d().a();
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
