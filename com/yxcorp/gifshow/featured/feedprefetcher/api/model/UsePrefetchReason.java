package com.yxcorp.gifshow.featured.feedprefetcher.api.model.UsePrefetchReason;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class UsePrefetchReason extends Enum	// class@000faa
{
    public String mReason;
    public static final UsePrefetchReason[] $VALUES;
    public static final UsePrefetchReason LOADING_ERROR;
    public static final UsePrefetchReason LOADING_TIMEOUT;
    public static final UsePrefetchReason NO_NETWORK;
    public static final UsePrefetchReason PLAY_ERROR;
    public static final UsePrefetchReason POOR_NETWORK;
    public static final UsePrefetchReason PREFETCH_EXPERIMENT;
    public static final UsePrefetchReason RERANK_PREFETCH;

    static {
       UsePrefetchReason usePrefetchR = new UsePrefetchReason("LOADING_TIMEOUT", 0, "loading_timeout");
       UsePrefetchReason.LOADING_TIMEOUT = usePrefetchR;
       UsePrefetchReason usePrefetchR1 = new UsePrefetchReason("LOADING_ERROR", 1, "loading_error");
       UsePrefetchReason.LOADING_ERROR = usePrefetchR1;
       UsePrefetchReason usePrefetchR2 = new UsePrefetchReason("PLAY_ERROR", 2, "play_error");
       UsePrefetchReason.PLAY_ERROR = usePrefetchR2;
       UsePrefetchReason usePrefetchR3 = new UsePrefetchReason("NO_NETWORK", 3, "no_network");
       UsePrefetchReason.NO_NETWORK = usePrefetchR3;
       UsePrefetchReason usePrefetchR4 = new UsePrefetchReason("POOR_NETWORK", 4, "poor_network");
       UsePrefetchReason.POOR_NETWORK = usePrefetchR4;
       UsePrefetchReason usePrefetchR5 = new UsePrefetchReason("RERANK_PREFETCH", 5, "rerank_prefetch");
       UsePrefetchReason.RERANK_PREFETCH = usePrefetchR5;
       UsePrefetchReason usePrefetchR6 = new UsePrefetchReason("PREFETCH_EXPERIMENT", 6, "prefetch_experiment");
       UsePrefetchReason.PREFETCH_EXPERIMENT = usePrefetchR6;
       UsePrefetchReason[] usePrefetchR7 = new UsePrefetchReason[]{usePrefetchR,usePrefetchR1,usePrefetchR2,usePrefetchR3,usePrefetchR4,usePrefetchR5,usePrefetchR6};
       UsePrefetchReason.$VALUES = usePrefetchR7;
    }
    public void UsePrefetchReason(String p0,int p1,String p2){
       super(p0, p1);
       this.mReason = p2;
    }
    public static UsePrefetchReason valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, UsePrefetchReason.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(UsePrefetchReason.class, p0);
    }
    public static UsePrefetchReason[] values(){
       Object obj = PatchProxy.apply(null, null, UsePrefetchReason.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return UsePrefetchReason.$VALUES.clone();
    }
    public String getReason(){
       return this.mReason;
    }
}
