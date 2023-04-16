package com.yxcorp.gifshow.ad.rerank.AdRankConfig;
import com.yxcorp.gifshow.ad.rerank.AdRankConfig$a;
import nsd.u;
import java.lang.Object;
import com.yxcorp.gifshow.ad.rerank.AdRankConfig$mEnableAdRank$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.ad.rerank.AdRankConfig$mTimeIntervalMs$2;
import com.yxcorp.gifshow.ad.rerank.AdRankConfig$mFilterAdTopCount$2;
import com.yxcorp.gifshow.ad.rerank.AdRankConfig$mAdAvoidMap$2;

public final class AdRankConfig	// class@0017c2
{
    public final p a;
    public final p b;
    public final p c;
    public final p d;
    public static final AdRankConfig$a e;

    static {
       AdRankConfig.e = new AdRankConfig$a(null);
    }
    public void AdRankConfig(){
       super();
       this.a = s.c(AdRankConfig$mEnableAdRank$2.INSTANCE);
       this.b = s.c(AdRankConfig$mTimeIntervalMs$2.INSTANCE);
       this.c = s.c(AdRankConfig$mFilterAdTopCount$2.INSTANCE);
       this.d = s.c(AdRankConfig$mAdAvoidMap$2.INSTANCE);
    }
}
