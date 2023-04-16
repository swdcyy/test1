package com.kwai.live.gzone.pendant.service.LiveGzoneAudienceFeatureEntranceItem;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;

public final class LiveGzoneAudienceFeatureEntranceItem extends Enum	// class@000d93
{
    public final int mDefaultOrder;
    public final boolean mEnableShowInPureMode;
    public final String mEntranceId;
    public static final LiveGzoneAudienceFeatureEntranceItem[] $VALUES;
    public static final LiveGzoneAudienceFeatureEntranceItem ACCOMPANY;
    public static final LiveGzoneAudienceFeatureEntranceItem COMPETITION_PREDICTION;
    public static final LiveGzoneAudienceFeatureEntranceItem DEBUG_PENDANT;
    public static final LiveGzoneAudienceFeatureEntranceItem GIFT;
    public static final LiveGzoneAudienceFeatureEntranceItem GUESS;
    public static final LiveGzoneAudienceFeatureEntranceItem GZONE_VOTE;
    public static final LiveGzoneAudienceFeatureEntranceItem TREASURE_BOX;
    public static final LiveGzoneAudienceFeatureEntranceItem TURN_TABLE;
    public static final LiveGzoneAudienceFeatureEntranceItem VOTE;

    static {
       LiveGzoneAudienceFeatureEntranceItem liveGzoneAud = new LiveGzoneAudienceFeatureEntranceItem("GIFT", 0, 50, "10", false);
       LiveGzoneAudienceFeatureEntranceItem.GIFT = v6;
       LiveGzoneAudienceFeatureEntranceItem liveGzoneAud1 = new LiveGzoneAudienceFeatureEntranceItem("COMPETITION_PREDICTION", 1, 60, "9", false);
       LiveGzoneAudienceFeatureEntranceItem.COMPETITION_PREDICTION = liveGzoneAud;
       LiveGzoneAudienceFeatureEntranceItem liveGzoneAud2 = new LiveGzoneAudienceFeatureEntranceItem("ACCOMPANY", 2, 80, "7", false);
       LiveGzoneAudienceFeatureEntranceItem.ACCOMPANY = v1;
       liveGzoneAud1 = new LiveGzoneAudienceFeatureEntranceItem("TREASURE_BOX", 3, 100, "4", true);
       LiveGzoneAudienceFeatureEntranceItem.TREASURE_BOX = v2;
       liveGzoneAud2 = new LiveGzoneAudienceFeatureEntranceItem("VOTE", 4, 120, "3", true);
       LiveGzoneAudienceFeatureEntranceItem.VOTE = v3;
       liveGzoneAud1 = new LiveGzoneAudienceFeatureEntranceItem("GUESS", 5, 140, "2", true);
       LiveGzoneAudienceFeatureEntranceItem.GUESS = v4;
       liveGzoneAud2 = new LiveGzoneAudienceFeatureEntranceItem("TURN_TABLE", 6, 160, "1", false);
       LiveGzoneAudienceFeatureEntranceItem.TURN_TABLE = v5;
       liveGzoneAud1 = new LiveGzoneAudienceFeatureEntranceItem("GZONE_VOTE", 7, 180, "11", true);
       LiveGzoneAudienceFeatureEntranceItem.GZONE_VOTE = liveGzoneAud2;
       LiveGzoneAudienceFeatureEntranceItem liveGzoneAud3 = new LiveGzoneAudienceFeatureEntranceItem("DEBUG_PENDANT", 8, 999, "", false);
       LiveGzoneAudienceFeatureEntranceItem.DEBUG_PENDANT = liveGzoneAud1;
       LiveGzoneAudienceFeatureEntranceItem[] liveGzoneAud4 = new LiveGzoneAudienceFeatureEntranceItem[9];
       liveGzoneAud4[0] = v6;
       liveGzoneAud4[1] = liveGzoneAud;
       liveGzoneAud4[2] = v1;
       liveGzoneAud4[3] = v2;
       liveGzoneAud4[4] = v3;
       liveGzoneAud4[5] = v4;
       liveGzoneAud4[6] = v5;
       liveGzoneAud4[7] = liveGzoneAud2;
       liveGzoneAud4[8] = liveGzoneAud1;
       LiveGzoneAudienceFeatureEntranceItem.$VALUES = liveGzoneAud4;
    }
    public void LiveGzoneAudienceFeatureEntranceItem(String p0,int p1,int p2,String p3,boolean p4){
       super(p0, p1);
       this.mDefaultOrder = p2;
       this.mEntranceId = p3;
       this.mEnableShowInPureMode = p4;
    }
    public static LiveGzoneAudienceFeatureEntranceItem fromEntranceId(String p0){
       object oobject;
       LiveGzoneAudienceFeatureEntranceItem[] obj = PatchProxy.applyOneRefs(p0, null, LiveGzoneAudienceFeatureEntranceItem.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = LiveGzoneAudienceFeatureEntranceItem.values();
       int len = obj.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return null;
          }
          oobject = obj[i];
          if (TextUtils.equals(p0, oobject.mEntranceId)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return oobject;
    }
    public static LiveGzoneAudienceFeatureEntranceItem valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveGzoneAudienceFeatureEntranceItem.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveGzoneAudienceFeatureEntranceItem.class, p0);
    }
    public static LiveGzoneAudienceFeatureEntranceItem[] values(){
       Object obj = PatchProxy.apply(null, null, LiveGzoneAudienceFeatureEntranceItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveGzoneAudienceFeatureEntranceItem.$VALUES.clone();
    }
}
