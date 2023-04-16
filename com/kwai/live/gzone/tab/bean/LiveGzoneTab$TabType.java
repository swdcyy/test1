package com.kwai.live.gzone.tab.bean.LiveGzoneTab$TabType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;

public final class LiveGzoneTab$TabType extends Enum	// class@000e06
{
    public final int mDefaultTabNameRes;
    public final boolean mIsDefaultVisible;
    public final boolean mSupportFirstLevelTab;
    public final String mTypeValue;
    public static final LiveGzoneTab$TabType[] $VALUES;
    public static final LiveGzoneTab$TabType ACTIVITY;
    public static final LiveGzoneTab$TabType ANCHOR_PROFILE;
    public static final LiveGzoneTab$TabType CHAT;
    public static final LiveGzoneTab$TabType COMPETITION_SCHEDULE;
    public static final LiveGzoneTab$TabType GAME_TV;
    public static final LiveGzoneTab$TabType H5;
    public static final LiveGzoneTab$TabType HYBRID;
    public static final LiveGzoneTab$TabType PLAY_TOGETHER;
    public static final LiveGzoneTab$TabType RANK;
    public static final LiveGzoneTab$TabType SCHEDULE_GOALS;

    static {
       LiveGzoneTab$TabType tabType = new LiveGzoneTab$TabType("CHAT", 0, "1", true, true, 0x7f102477);
       LiveGzoneTab$TabType.CHAT = v7;
       LiveGzoneTab$TabType tabType1 = new LiveGzoneTab$TabType("ANCHOR_PROFILE", 1, "2", true, true, 0x7f102476);
       LiveGzoneTab$TabType.ANCHOR_PROFILE = tabType;
       LiveGzoneTab$TabType tabType2 = new LiveGzoneTab$TabType("ACTIVITY", 2, "3", true, true, 0x7f102479);
       LiveGzoneTab$TabType.ACTIVITY = v1;
       tabType1 = new LiveGzoneTab$TabType("GAME_TV", 3, "4", true, true, 0x7f102478);
       LiveGzoneTab$TabType.GAME_TV = v2;
       tabType2 = new LiveGzoneTab$TabType("SCHEDULE_GOALS", 4, "6", true, true, 0x7f1013cb);
       LiveGzoneTab$TabType.SCHEDULE_GOALS = v3;
       tabType1 = new LiveGzoneTab$TabType("H5", 5, "7", true, true, 0x7f10020e);
       LiveGzoneTab$TabType.H5 = v4;
       tabType2 = new LiveGzoneTab$TabType("RANK", 6, "8", true, false, 0x7f102457);
       LiveGzoneTab$TabType.RANK = v5;
       tabType1 = new LiveGzoneTab$TabType("COMPETITION_SCHEDULE", 7, "601", false, true, 0x7f1013e0);
       LiveGzoneTab$TabType.COMPETITION_SCHEDULE = v6;
       tabType2 = new LiveGzoneTab$TabType("PLAY_TOGETHER", 8, "9", true, true, 0x7f101d02);
       LiveGzoneTab$TabType.PLAY_TOGETHER = tabType1;
       LiveGzoneTab$TabType tabType3 = new LiveGzoneTab$TabType("HYBRID", 9, "10", true, true, 0x7f10020e);
       LiveGzoneTab$TabType.HYBRID = v16;
       LiveGzoneTab$TabType[] tabTypeArray = new LiveGzoneTab$TabType[10];
       tabTypeArray[0] = v7;
       tabTypeArray[1] = tabType;
       tabTypeArray[2] = v1;
       tabTypeArray[3] = v2;
       tabTypeArray[4] = v3;
       tabTypeArray[5] = v4;
       tabTypeArray[6] = v5;
       tabTypeArray[7] = v6;
       tabTypeArray[8] = tabType1;
       tabTypeArray[9] = v16;
       LiveGzoneTab$TabType.$VALUES = tabTypeArray;
    }
    public void LiveGzoneTab$TabType(String p0,int p1,String p2,boolean p3,boolean p4,int p5){
       super(p0, p1);
       this.mTypeValue = p2;
       this.mSupportFirstLevelTab = p3;
       this.mIsDefaultVisible = p4;
       this.mDefaultTabNameRes = p5;
    }
    public static LiveGzoneTab$TabType fromTabType(String p0){
       object oobject;
       LiveGzoneTab$TabType[] obj = PatchProxy.applyOneRefs(p0, null, LiveGzoneTab$TabType.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = LiveGzoneTab$TabType.values();
       int len = obj.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return null;
          }
          oobject = obj[i];
          if (TextUtils.equals(oobject.mTypeValue, p0)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return oobject;
    }
    public static LiveGzoneTab$TabType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveGzoneTab$TabType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveGzoneTab$TabType.class, p0);
    }
    public static LiveGzoneTab$TabType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveGzoneTab$TabType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveGzoneTab$TabType.$VALUES.clone();
    }
}
