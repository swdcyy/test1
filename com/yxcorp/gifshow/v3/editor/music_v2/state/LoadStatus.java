package com.yxcorp.gifshow.v3.editor.music_v2.state.LoadStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LoadStatus extends Enum	// class@0010c0
{
    public static final LoadStatus[] $VALUES;
    public static final LoadStatus FAILED;
    public static final LoadStatus FINISH;
    public static final LoadStatus IDLE;
    public static final LoadStatus LOADING;

    static {
       LoadStatus loadStatus;
       LoadStatus[] loadStatusAr = new LoadStatus[]{loadStatus,loadStatus,loadStatus,loadStatus};
       loadStatus = new LoadStatus("IDLE", 0);
       LoadStatus.IDLE = loadStatus;
       loadStatus = new LoadStatus("LOADING", 1);
       LoadStatus.LOADING = loadStatus;
       loadStatus = new LoadStatus("FINISH", 2);
       LoadStatus.FINISH = loadStatus;
       loadStatus = new LoadStatus("FAILED", 3);
       LoadStatus.FAILED = loadStatus;
       LoadStatus.$VALUES = loadStatusAr;
    }
    public void LoadStatus(String p0,int p1){
       super(p0, p1);
    }
    public static LoadStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LoadStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LoadStatus.class, p0);
    }
    public static LoadStatus[] values(){
       Object obj = PatchProxy.apply(null, null, LoadStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LoadStatus.$VALUES.clone();
    }
}
