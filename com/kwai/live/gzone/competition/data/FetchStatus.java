package com.kwai.live.gzone.competition.data.FetchStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class FetchStatus extends Enum	// class@000ccd
{
    public static final FetchStatus[] $VALUES;
    public static final FetchStatus COMPLETE;
    public static final FetchStatus ERROR;
    public static final FetchStatus LOADING;

    static {
       FetchStatus uFetchStatus1;
       FetchStatus[] uFetchStatus = new FetchStatus[]{uFetchStatus1,uFetchStatus1,uFetchStatus1};
       uFetchStatus1 = new FetchStatus("LOADING", 0);
       FetchStatus.LOADING = uFetchStatus1;
       uFetchStatus1 = new FetchStatus("ERROR", 1);
       FetchStatus.ERROR = uFetchStatus1;
       uFetchStatus1 = new FetchStatus("COMPLETE", 2);
       FetchStatus.COMPLETE = uFetchStatus1;
       FetchStatus.$VALUES = uFetchStatus;
    }
    public void FetchStatus(String p0,int p1){
       super(p0, p1);
    }
    public static FetchStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FetchStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(FetchStatus.class, p0);
    }
    public static FetchStatus[] values(){
       Object obj = PatchProxy.apply(null, null, FetchStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return FetchStatus.$VALUES.clone();
    }
}
