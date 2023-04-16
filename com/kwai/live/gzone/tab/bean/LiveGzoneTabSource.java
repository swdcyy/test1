package com.kwai.live.gzone.tab.bean.LiveGzoneTabSource;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveGzoneTabSource extends Enum	// class@000e0b
{
    public String mValues;
    public static final LiveGzoneTabSource[] $VALUES;
    public static final LiveGzoneTabSource ACTIVITY_NATIVE_PENDANT;
    public static final LiveGzoneTabSource ACTIVITY_PENDANT;
    public static final LiveGzoneTabSource ACTIVITY_TAB;
    public static final LiveGzoneTabSource CLICK;
    public static final LiveGzoneTabSource COMMENT_LOTTERY;
    public static final LiveGzoneTabSource COMPETITION_PREDICTION;
    public static final LiveGzoneTabSource COMPETITION_SCORE_TAB;
    public static final LiveGzoneTabSource GAME_INTERACTIVE;
    public static final LiveGzoneTabSource GIFT;
    public static final LiveGzoneTabSource GUESS;
    public static final LiveGzoneTabSource GUESS_RESULT;
    public static final LiveGzoneTabSource GUESS_TIP;
    public static final LiveGzoneTabSource GZONE_VOTE;
    public static final LiveGzoneTabSource IGNORE;
    public static final LiveGzoneTabSource OTHERS;
    public static final LiveGzoneTabSource PK;
    public static final LiveGzoneTabSource PROFILE_AT;
    public static final LiveGzoneTabSource RANK;
    public static final LiveGzoneTabSource SWITCH;
    public static final LiveGzoneTabSource TREASURE_BOX;
    public static final LiveGzoneTabSource TURNTABLE;
    public static final LiveGzoneTabSource UNION_H5_PENDANT;
    public static final LiveGzoneTabSource UNKNOWN;
    public static final LiveGzoneTabSource VOTE;

    static {
       LiveGzoneTabSource liveGzoneTab = new LiveGzoneTabSource("TURNTABLE", 0, "draw");
       LiveGzoneTabSource.TURNTABLE = liveGzoneTab;
       LiveGzoneTabSource liveGzoneTab1 = new LiveGzoneTabSource("ACTIVITY_TAB", 1, "activityTab");
       LiveGzoneTabSource.ACTIVITY_TAB = liveGzoneTab1;
       LiveGzoneTabSource liveGzoneTab2 = new LiveGzoneTabSource("COMPETITION_SCORE_TAB", 2, "competitionScoreTab");
       LiveGzoneTabSource.COMPETITION_SCORE_TAB = liveGzoneTab2;
       LiveGzoneTabSource liveGzoneTab3 = new LiveGzoneTabSource("TREASURE_BOX", 3, "treasure_box");
       LiveGzoneTabSource.TREASURE_BOX = liveGzoneTab3;
       LiveGzoneTabSource liveGzoneTab4 = new LiveGzoneTabSource("RANK", 4, "rank");
       LiveGzoneTabSource.RANK = liveGzoneTab4;
       LiveGzoneTabSource liveGzoneTab5 = new LiveGzoneTabSource("UNKNOWN", 5, "unknown");
       LiveGzoneTabSource.UNKNOWN = liveGzoneTab5;
       LiveGzoneTabSource liveGzoneTab6 = new LiveGzoneTabSource("VOTE", 6, "vote");
       LiveGzoneTabSource.VOTE = liveGzoneTab6;
       LiveGzoneTabSource liveGzoneTab7 = new LiveGzoneTabSource("GUESS", 7, "guess");
       LiveGzoneTabSource.GUESS = liveGzoneTab7;
       LiveGzoneTabSource liveGzoneTab8 = new LiveGzoneTabSource("COMPETITION_PREDICTION", 8, "competition_prediction");
       LiveGzoneTabSource.COMPETITION_PREDICTION = liveGzoneTab8;
       LiveGzoneTabSource liveGzoneTab9 = new LiveGzoneTabSource("GUESS_RESULT", 9, "guess_result");
       LiveGzoneTabSource.GUESS_RESULT = liveGzoneTab9;
       LiveGzoneTabSource liveGzoneTab10 = new LiveGzoneTabSource("GUESS_TIP", 10, "guess_point");
       LiveGzoneTabSource.GUESS_TIP = liveGzoneTab10;
       LiveGzoneTabSource liveGzoneTab11 = new LiveGzoneTabSource("COMMENT_LOTTERY", 11, "comment_lottery");
       LiveGzoneTabSource.COMMENT_LOTTERY = liveGzoneTab11;
       LiveGzoneTabSource liveGzoneTab12 = new LiveGzoneTabSource("PK", 12, "pk");
       LiveGzoneTabSource.PK = liveGzoneTab12;
       LiveGzoneTabSource liveGzoneTab13 = liveGzoneTab12;
       LiveGzoneTabSource liveGzoneTab14 = new LiveGzoneTabSource("PROFILE_AT", 13, "profile_at");
       LiveGzoneTabSource.PROFILE_AT = liveGzoneTab14;
       LiveGzoneTabSource liveGzoneTab15 = liveGzoneTab14;
       liveGzoneTab12 = new LiveGzoneTabSource("CLICK", 14, "click");
       LiveGzoneTabSource.CLICK = liveGzoneTab12;
       LiveGzoneTabSource liveGzoneTab16 = liveGzoneTab12;
       liveGzoneTab14 = new LiveGzoneTabSource("SWITCH", 15, "switch");
       LiveGzoneTabSource.SWITCH = liveGzoneTab14;
       LiveGzoneTabSource liveGzoneTab17 = liveGzoneTab14;
       liveGzoneTab12 = new LiveGzoneTabSource("GZONE_VOTE", 16, "gzone_vote");
       LiveGzoneTabSource.GZONE_VOTE = liveGzoneTab12;
       LiveGzoneTabSource liveGzoneTab18 = liveGzoneTab12;
       liveGzoneTab14 = new LiveGzoneTabSource("UNION_H5_PENDANT", 17, "activity_center_pendant");
       LiveGzoneTabSource.UNION_H5_PENDANT = liveGzoneTab14;
       LiveGzoneTabSource liveGzoneTab19 = liveGzoneTab14;
       liveGzoneTab12 = new LiveGzoneTabSource("ACTIVITY_NATIVE_PENDANT", 18, "other");
       LiveGzoneTabSource.ACTIVITY_NATIVE_PENDANT = liveGzoneTab12;
       LiveGzoneTabSource liveGzoneTab20 = liveGzoneTab12;
       LiveGzoneTabSource liveGzoneTab21 = liveGzoneTab11;
       LiveGzoneTabSource liveGzoneTab22 = new LiveGzoneTabSource("ACTIVITY_PENDANT", 19, "activity_zt_pendant");
       LiveGzoneTabSource.ACTIVITY_PENDANT = liveGzoneTab22;
       LiveGzoneTabSource liveGzoneTab23 = liveGzoneTab22;
       liveGzoneTab11 = new LiveGzoneTabSource("GIFT", 20, "gift");
       LiveGzoneTabSource.GIFT = liveGzoneTab11;
       LiveGzoneTabSource liveGzoneTab24 = liveGzoneTab11;
       LiveGzoneTabSource liveGzoneTab25 = new LiveGzoneTabSource("GAME_INTERACTIVE", 21, "game_interactive");
       LiveGzoneTabSource.GAME_INTERACTIVE = liveGzoneTab25;
       LiveGzoneTabSource liveGzoneTab26 = liveGzoneTab25;
       liveGzoneTab12 = new LiveGzoneTabSource("IGNORE", 22, "");
       LiveGzoneTabSource.IGNORE = liveGzoneTab12;
       liveGzoneTab11 = new LiveGzoneTabSource("OTHERS", 23, "other");
       LiveGzoneTabSource.OTHERS = liveGzoneTab11;
       LiveGzoneTabSource[] liveGzoneTab27 = new LiveGzoneTabSource[24];
       liveGzoneTab27[0] = liveGzoneTab;
       liveGzoneTab27[1] = liveGzoneTab1;
       liveGzoneTab27[2] = liveGzoneTab2;
       liveGzoneTab27[3] = liveGzoneTab3;
       liveGzoneTab27[4] = liveGzoneTab4;
       liveGzoneTab27[5] = liveGzoneTab5;
       liveGzoneTab27[6] = liveGzoneTab6;
       liveGzoneTab27[7] = liveGzoneTab7;
       liveGzoneTab27[8] = liveGzoneTab8;
       liveGzoneTab27[9] = liveGzoneTab9;
       liveGzoneTab27[10] = liveGzoneTab10;
       liveGzoneTab27[11] = liveGzoneTab21;
       liveGzoneTab27[12] = liveGzoneTab13;
       liveGzoneTab27[13] = liveGzoneTab15;
       liveGzoneTab27[14] = liveGzoneTab16;
       liveGzoneTab27[15] = liveGzoneTab17;
       liveGzoneTab27[16] = liveGzoneTab18;
       liveGzoneTab27[17] = liveGzoneTab19;
       liveGzoneTab27[18] = liveGzoneTab20;
       liveGzoneTab27[19] = liveGzoneTab23;
       liveGzoneTab27[20] = liveGzoneTab24;
       liveGzoneTab27[21] = liveGzoneTab26;
       liveGzoneTab27[22] = liveGzoneTab12;
       liveGzoneTab27[23] = liveGzoneTab11;
       LiveGzoneTabSource.$VALUES = liveGzoneTab27;
    }
    public void LiveGzoneTabSource(String p0,int p1,String p2){
       super(p0, p1);
       this.mValues = p2;
    }
    public static LiveGzoneTabSource valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveGzoneTabSource.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveGzoneTabSource.class, p0);
    }
    public static LiveGzoneTabSource[] values(){
       Object obj = PatchProxy.apply(null, null, LiveGzoneTabSource.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveGzoneTabSource.$VALUES.clone();
    }
}
