package com.kuaishou.live.common.core.component.share.LiveShareSubBiz$AudienceSubBiz;
import com.kuaishou.live.common.core.component.share.LiveShareSubBiz;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveShareSubBiz$AudienceSubBiz extends Enum implements LiveShareSubBiz	// class@001773
{
    public String mValue;
    public static final LiveShareSubBiz$AudienceSubBiz[] $VALUES;
    public static final LiveShareSubBiz$AudienceSubBiz CONDITION_RED_PACKET;
    public static final LiveShareSubBiz$AudienceSubBiz COURSE_LIVE;
    public static final LiveShareSubBiz$AudienceSubBiz LIVE_QUIZ;
    public static final LiveShareSubBiz$AudienceSubBiz LIVE_QUIZ_GROUP;
    public static final LiveShareSubBiz$AudienceSubBiz LIVE_QUIZ_REVIVE_CARD;
    public static final LiveShareSubBiz$AudienceSubBiz LUCKY_STAR;
    public static final LiveShareSubBiz$AudienceSubBiz MUSIC_STATION_LIVE;
    public static final LiveShareSubBiz$AudienceSubBiz NORMAL_LIVE;
    public static final LiveShareSubBiz$AudienceSubBiz PAID_SHOW_LIVE;
    public static final LiveShareSubBiz$AudienceSubBiz RED_PACKET;

    static {
       LiveShareSubBiz$AudienceSubBiz uAudienceSub = new LiveShareSubBiz$AudienceSubBiz("LIVE_QUIZ", 0, "SF_COW_LIVE_ANSWER");
       LiveShareSubBiz$AudienceSubBiz.LIVE_QUIZ = uAudienceSub;
       LiveShareSubBiz$AudienceSubBiz uAudienceSub1 = new LiveShareSubBiz$AudienceSubBiz("LIVE_QUIZ_REVIVE_CARD", 1, "OPG_LIVE_ANSWERING_R");
       LiveShareSubBiz$AudienceSubBiz.LIVE_QUIZ_REVIVE_CARD = uAudienceSub1;
       LiveShareSubBiz$AudienceSubBiz uAudienceSub2 = new LiveShareSubBiz$AudienceSubBiz("LIVE_QUIZ_GROUP", 2, "OPG_LIVE_ANSWERING_G");
       LiveShareSubBiz$AudienceSubBiz.LIVE_QUIZ_GROUP = uAudienceSub2;
       LiveShareSubBiz$AudienceSubBiz uAudienceSub3 = new LiveShareSubBiz$AudienceSubBiz("MUSIC_STATION_LIVE", 3, "MUSIC_STATION_LIVE_STREAM");
       LiveShareSubBiz$AudienceSubBiz.MUSIC_STATION_LIVE = uAudienceSub3;
       LiveShareSubBiz$AudienceSubBiz uAudienceSub4 = new LiveShareSubBiz$AudienceSubBiz("CONDITION_RED_PACKET", 4, "LIVE_SHARE_PACKET");
       LiveShareSubBiz$AudienceSubBiz.CONDITION_RED_PACKET = uAudienceSub4;
       LiveShareSubBiz$AudienceSubBiz uAudienceSub5 = new LiveShareSubBiz$AudienceSubBiz("LUCKY_STAR", 5, "LIVE_LUCKY");
       LiveShareSubBiz$AudienceSubBiz.LUCKY_STAR = uAudienceSub5;
       LiveShareSubBiz$AudienceSubBiz uAudienceSub6 = new LiveShareSubBiz$AudienceSubBiz("RED_PACKET", 6, "LIVE_REDPACKET");
       LiveShareSubBiz$AudienceSubBiz.RED_PACKET = uAudienceSub6;
       LiveShareSubBiz$AudienceSubBiz uAudienceSub7 = new LiveShareSubBiz$AudienceSubBiz("PAID_SHOW_LIVE", 7, "LIVE_PAID_SHOW");
       LiveShareSubBiz$AudienceSubBiz.PAID_SHOW_LIVE = uAudienceSub7;
       LiveShareSubBiz$AudienceSubBiz uAudienceSub8 = new LiveShareSubBiz$AudienceSubBiz("COURSE_LIVE", 8, "LIVE_STREAM_COURSE");
       LiveShareSubBiz$AudienceSubBiz.COURSE_LIVE = uAudienceSub8;
       LiveShareSubBiz$AudienceSubBiz uAudienceSub9 = new LiveShareSubBiz$AudienceSubBiz("NORMAL_LIVE", 9, "LIVE_STREAM");
       LiveShareSubBiz$AudienceSubBiz.NORMAL_LIVE = uAudienceSub9;
       LiveShareSubBiz$AudienceSubBiz[] uAudienceSub10 = new LiveShareSubBiz$AudienceSubBiz[10];
       uAudienceSub10[0] = uAudienceSub;
       uAudienceSub10[1] = uAudienceSub1;
       uAudienceSub10[2] = uAudienceSub2;
       uAudienceSub10[3] = uAudienceSub3;
       uAudienceSub10[4] = uAudienceSub4;
       uAudienceSub10[5] = uAudienceSub5;
       uAudienceSub10[6] = uAudienceSub6;
       uAudienceSub10[7] = uAudienceSub7;
       uAudienceSub10[8] = uAudienceSub8;
       uAudienceSub10[9] = uAudienceSub9;
       LiveShareSubBiz$AudienceSubBiz.$VALUES = uAudienceSub10;
    }
    public void LiveShareSubBiz$AudienceSubBiz(String p0,int p1,String p2){
       super(p0, p1);
       this.mValue = p2;
    }
    public static LiveShareSubBiz$AudienceSubBiz valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveShareSubBiz$AudienceSubBiz.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveShareSubBiz$AudienceSubBiz.class, p0);
    }
    public static LiveShareSubBiz$AudienceSubBiz[] values(){
       Object obj = PatchProxy.apply(null, null, LiveShareSubBiz$AudienceSubBiz.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveShareSubBiz$AudienceSubBiz.$VALUES.clone();
    }
    public String getValue(){
       return this.mValue;
    }
}
