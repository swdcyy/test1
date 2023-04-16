package com.yxcorp.gifshow.component.postlistcomponent.state.LoadingStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LoadingStatus extends Enum	// class@0011c6
{
    public static final LoadingStatus[] $VALUES;
    public static final LoadingStatus DATA_LOADING;
    public static final LoadingStatus DATA_LOADING_CANCELLED;
    public static final LoadingStatus DATA_LOADING_FAILED;
    public static final LoadingStatus DATA_LOADING_FINISH;
    public static final LoadingStatus DATA_LOADING_MORE;
    public static final LoadingStatus DATA_LOADING_MORE_FAILED;
    public static final LoadingStatus DATA_LOADING_MORE_FINISH;
    public static final LoadingStatus IDLE;

    static {
       LoadingStatus loadingStatu1;
       LoadingStatus[] loadingStatu = new LoadingStatus[]{loadingStatu1,loadingStatu1,loadingStatu1,loadingStatu1,loadingStatu1,loadingStatu1,loadingStatu1,loadingStatu1};
       loadingStatu1 = new LoadingStatus("IDLE", 0);
       LoadingStatus.IDLE = loadingStatu1;
       loadingStatu1 = new LoadingStatus("DATA_LOADING", 1);
       LoadingStatus.DATA_LOADING = loadingStatu1;
       loadingStatu1 = new LoadingStatus("DATA_LOADING_FAILED", 2);
       LoadingStatus.DATA_LOADING_FAILED = loadingStatu1;
       loadingStatu1 = new LoadingStatus("DATA_LOADING_CANCELLED", 3);
       LoadingStatus.DATA_LOADING_CANCELLED = loadingStatu1;
       loadingStatu1 = new LoadingStatus("DATA_LOADING_FINISH", 4);
       LoadingStatus.DATA_LOADING_FINISH = loadingStatu1;
       loadingStatu1 = new LoadingStatus("DATA_LOADING_MORE", 5);
       LoadingStatus.DATA_LOADING_MORE = loadingStatu1;
       loadingStatu1 = new LoadingStatus("DATA_LOADING_MORE_FAILED", 6);
       LoadingStatus.DATA_LOADING_MORE_FAILED = loadingStatu1;
       loadingStatu1 = new LoadingStatus("DATA_LOADING_MORE_FINISH", 7);
       LoadingStatus.DATA_LOADING_MORE_FINISH = loadingStatu1;
       LoadingStatus.$VALUES = loadingStatu;
    }
    public void LoadingStatus(String p0,int p1){
       super(p0, p1);
    }
    public static LoadingStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LoadingStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LoadingStatus.class, p0);
    }
    public static LoadingStatus[] values(){
       Object obj = PatchProxy.apply(null, null, LoadingStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LoadingStatus.$VALUES.clone();
    }
}
