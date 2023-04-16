package com.kwai.video.wayne.player.multisource.switcher.FetchReason;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class FetchReason extends Enum	// class@000db0
{
    public static final FetchReason[] $VALUES;
    public static final FetchReason FetchReason_403;
    public static final FetchReason FetchReason_403V2;
    public static final FetchReason FetchReason_INITSOURCE;
    public static final FetchReason UNKNOW;

    static {
       FetchReason uFetchReason1;
       FetchReason[] uFetchReason = new FetchReason[]{uFetchReason1,uFetchReason1,uFetchReason1,uFetchReason1};
       uFetchReason1 = new FetchReason("FetchReason_INITSOURCE", 0);
       FetchReason.FetchReason_INITSOURCE = uFetchReason1;
       uFetchReason1 = new FetchReason("FetchReason_403", 1);
       FetchReason.FetchReason_403 = uFetchReason1;
       uFetchReason1 = new FetchReason("FetchReason_403V2", 2);
       FetchReason.FetchReason_403V2 = uFetchReason1;
       uFetchReason1 = new FetchReason("UNKNOW", 3);
       FetchReason.UNKNOW = uFetchReason1;
       FetchReason.$VALUES = uFetchReason;
    }
    public void FetchReason(String p0,int p1){
       super(p0, p1);
    }
    public static FetchReason valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FetchReason.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(FetchReason.class, p0);
    }
    public static FetchReason[] values(){
       Object obj = PatchProxy.apply(null, null, FetchReason.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return FetchReason.$VALUES.clone();
    }
}
