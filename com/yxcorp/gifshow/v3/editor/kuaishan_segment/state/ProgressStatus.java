package com.yxcorp.gifshow.v3.editor.kuaishan_segment.state.ProgressStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ProgressStatus extends Enum	// class@001025
{
    public static final ProgressStatus[] $VALUES;
    public static final ProgressStatus ERROR;
    public static final ProgressStatus FINISH;
    public static final ProgressStatus IDLE;
    public static final ProgressStatus LOADING;

    static {
       ProgressStatus progressStat1;
       ProgressStatus[] progressStat = new ProgressStatus[]{progressStat1,progressStat1,progressStat1,progressStat1};
       progressStat1 = new ProgressStatus("IDLE", 0);
       ProgressStatus.IDLE = progressStat1;
       progressStat1 = new ProgressStatus("LOADING", 1);
       ProgressStatus.LOADING = progressStat1;
       progressStat1 = new ProgressStatus("ERROR", 2);
       ProgressStatus.ERROR = progressStat1;
       progressStat1 = new ProgressStatus("FINISH", 3);
       ProgressStatus.FINISH = progressStat1;
       ProgressStatus.$VALUES = progressStat;
    }
    public void ProgressStatus(String p0,int p1){
       super(p0, p1);
    }
    public static ProgressStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ProgressStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ProgressStatus.class, p0);
    }
    public static ProgressStatus[] values(){
       Object obj = PatchProxy.apply(null, null, ProgressStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ProgressStatus.$VALUES.clone();
    }
}
