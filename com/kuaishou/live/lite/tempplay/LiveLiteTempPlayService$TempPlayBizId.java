package com.kuaishou.live.lite.tempplay.LiveLiteTempPlayService$TempPlayBizId;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveLiteTempPlayService$TempPlayBizId extends Enum	// class@000b85
{
    public int mBizPriority;
    public final String mLogBtnType;
    public static final LiveLiteTempPlayService$TempPlayBizId[] $VALUES;
    public static final LiveLiteTempPlayService$TempPlayBizId HOUR_RANK;
    public static final LiveLiteTempPlayService$TempPlayBizId MERCHANT_DY;
    public static final LiveLiteTempPlayService$TempPlayBizId MORE_FOLLOW;
    public static final LiveLiteTempPlayService$TempPlayBizId MORE_LIVE;
    public static final LiveLiteTempPlayService$TempPlayBizId PROFIT_INFO;
    public static final LiveLiteTempPlayService$TempPlayBizId SPECIAL_TAG;

    static {
       LiveLiteTempPlayService$TempPlayBizId tempPlayBizI = new LiveLiteTempPlayService$TempPlayBizId("SPECIAL_TAG", 0, 2, "CONTENT_STORY");
       LiveLiteTempPlayService$TempPlayBizId.SPECIAL_TAG = tempPlayBizI;
       LiveLiteTempPlayService$TempPlayBizId tempPlayBizI1 = new LiveLiteTempPlayService$TempPlayBizId("HOUR_RANK", 1, 4, "SNAP_FUN");
       LiveLiteTempPlayService$TempPlayBizId.HOUR_RANK = tempPlayBizI1;
       LiveLiteTempPlayService$TempPlayBizId tempPlayBizI2 = new LiveLiteTempPlayService$TempPlayBizId("PROFIT_INFO", 2, 3, "PROFIT_INFO");
       LiveLiteTempPlayService$TempPlayBizId.PROFIT_INFO = tempPlayBizI2;
       LiveLiteTempPlayService$TempPlayBizId tempPlayBizI3 = new LiveLiteTempPlayService$TempPlayBizId("MORE_LIVE", 3, 1, "MORE_LIVE");
       LiveLiteTempPlayService$TempPlayBizId.MORE_LIVE = tempPlayBizI3;
       LiveLiteTempPlayService$TempPlayBizId tempPlayBizI4 = new LiveLiteTempPlayService$TempPlayBizId("MORE_FOLLOW", 4, 1, "MORE_FOLLOW");
       LiveLiteTempPlayService$TempPlayBizId.MORE_FOLLOW = tempPlayBizI4;
       LiveLiteTempPlayService$TempPlayBizId tempPlayBizI5 = new LiveLiteTempPlayService$TempPlayBizId("MERCHANT_DY", 5, -1, "MERCHANT_DY");
       LiveLiteTempPlayService$TempPlayBizId.MERCHANT_DY = tempPlayBizI5;
       LiveLiteTempPlayService$TempPlayBizId[] tempPlayBizI6 = new LiveLiteTempPlayService$TempPlayBizId[]{tempPlayBizI,tempPlayBizI1,tempPlayBizI2,tempPlayBizI3,tempPlayBizI4,tempPlayBizI5};
       LiveLiteTempPlayService$TempPlayBizId.$VALUES = tempPlayBizI6;
    }
    public void LiveLiteTempPlayService$TempPlayBizId(String p0,int p1,int p2,String p3){
       super(p0, p1);
       this.mBizPriority = p2;
       this.mLogBtnType = p3;
    }
    public static LiveLiteTempPlayService$TempPlayBizId valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveLiteTempPlayService$TempPlayBizId.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveLiteTempPlayService$TempPlayBizId.class, p0);
    }
    public static LiveLiteTempPlayService$TempPlayBizId[] values(){
       Object obj = PatchProxy.apply(null, null, LiveLiteTempPlayService$TempPlayBizId.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveLiteTempPlayService$TempPlayBizId.$VALUES.clone();
    }
    public void setBizPriority(int p0){
       this.mBizPriority = p0;
    }
}
