package com.yxcorp.gifshow.action.RealActionBizType;
import yv8.c;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class RealActionBizType extends Enum implements c	// class@00130e
{
    public final String mBizType;
    public static final RealActionBizType[] $VALUES;
    public static final RealActionBizType CORONA;
    public static final RealActionBizType DOMINO;
    public static final RealActionBizType FEATURED;
    public static final RealActionBizType FEATURE_LIVE;
    public static final RealActionBizType FOLLOW;
    public static final RealActionBizType FRIEND_TAB;
    public static final RealActionBizType HOT;
    public static final RealActionBizType HOT_SPOT;
    public static final RealActionBizType LIFE;
    public static final RealActionBizType LIVE_FEATURED_RERANK;
    public static final RealActionBizType LIVE_HOT_RERANK;
    public static final RealActionBizType LIVE_MORE_SQUARE;
    public static final RealActionBizType LIVE_SQUARE;
    public static final RealActionBizType LIVE_VOICE_PARTY_SQUARE;
    public static final RealActionBizType LOCAL;
    public static final RealActionBizType NEWS_SLIDE;
    public static final RealActionBizType SEARCH;
    public static final RealActionBizType THANOS_NEBULA;
    public static final RealActionBizType UNIVERSAL_FEED_TAB;

    static {
       RealActionBizType realActionBi = new RealActionBizType("FOLLOW", 0, "FOLLOW");
       RealActionBizType.FOLLOW = realActionBi;
       RealActionBizType realActionBi1 = new RealActionBizType("HOT", 1, "HOT");
       RealActionBizType.HOT = realActionBi1;
       RealActionBizType realActionBi2 = new RealActionBizType("LOCAL", 2, "NEARBY");
       RealActionBizType.LOCAL = realActionBi2;
       RealActionBizType realActionBi3 = new RealActionBizType("CORONA", 3, "CORONA");
       RealActionBizType.CORONA = realActionBi3;
       RealActionBizType realActionBi4 = new RealActionBizType("FEATURE_LIVE", 4, "FEATURED_LIVE");
       RealActionBizType.FEATURE_LIVE = realActionBi4;
       RealActionBizType realActionBi5 = new RealActionBizType("LIVE_SQUARE", 5, "LIVE_SQUARE");
       RealActionBizType.LIVE_SQUARE = realActionBi5;
       RealActionBizType realActionBi6 = new RealActionBizType("LIVE_MORE_SQUARE", 6, "LIVE_MORE_SQUARE");
       RealActionBizType.LIVE_MORE_SQUARE = realActionBi6;
       RealActionBizType realActionBi7 = new RealActionBizType("LIVE_VOICE_PARTY_SQUARE", 7, "BIZ_LIVE_VOICE_PARTY_SQUARE");
       RealActionBizType.LIVE_VOICE_PARTY_SQUARE = realActionBi7;
       RealActionBizType realActionBi8 = new RealActionBizType("LIVE_FEATURED_RERANK", 8, "BIZ_LIVE_FEATURED_RERANK");
       RealActionBizType.LIVE_FEATURED_RERANK = realActionBi8;
       RealActionBizType realActionBi9 = new RealActionBizType("LIVE_HOT_RERANK", 9, "BIZ_LIVE_HOT_RERANK");
       RealActionBizType.LIVE_HOT_RERANK = realActionBi9;
       RealActionBizType realActionBi10 = new RealActionBizType("FEATURED", 10, "FEATURED");
       RealActionBizType.FEATURED = realActionBi10;
       RealActionBizType realActionBi11 = new RealActionBizType("THANOS_NEBULA", 11, "THANOS_NEBULA");
       RealActionBizType.THANOS_NEBULA = realActionBi11;
       RealActionBizType realActionBi12 = new RealActionBizType("FRIEND_TAB", 12, "FRIENDS");
       RealActionBizType.FRIEND_TAB = realActionBi12;
       RealActionBizType realActionBi13 = new RealActionBizType("NEWS_SLIDE", 13, "NEWS_SLIDE");
       RealActionBizType.NEWS_SLIDE = realActionBi13;
       RealActionBizType realActionBi14 = realActionBi13;
       RealActionBizType realActionBi15 = realActionBi12;
       RealActionBizType realActionBi16 = new RealActionBizType("DOMINO", 14, "DOMINO");
       RealActionBizType.DOMINO = realActionBi16;
       RealActionBizType realActionBi17 = realActionBi16;
       realActionBi13 = new RealActionBizType("SEARCH", 15, "SEARCH");
       RealActionBizType.SEARCH = realActionBi13;
       RealActionBizType realActionBi18 = realActionBi13;
       RealActionBizType realActionBi19 = new RealActionBizType("LIFE", 16, "LIFE");
       RealActionBizType.LIFE = realActionBi19;
       RealActionBizType realActionBi20 = realActionBi19;
       realActionBi13 = new RealActionBizType("HOT_SPOT", 17, "HOT_SPOT");
       RealActionBizType.HOT_SPOT = realActionBi13;
       RealActionBizType realActionBi21 = realActionBi13;
       realActionBi19 = new RealActionBizType("UNIVERSAL_FEED_TAB", 18, "UNIVERSAL_FEED_TAB");
       RealActionBizType.UNIVERSAL_FEED_TAB = realActionBi19;
       RealActionBizType[] realActionBi22 = new RealActionBizType[19];
       realActionBi22[0] = realActionBi;
       realActionBi22[1] = realActionBi1;
       realActionBi22[2] = realActionBi2;
       realActionBi22[3] = realActionBi3;
       realActionBi22[4] = realActionBi4;
       realActionBi22[5] = realActionBi5;
       realActionBi22[6] = realActionBi6;
       realActionBi22[7] = realActionBi7;
       realActionBi22[8] = realActionBi8;
       realActionBi22[9] = realActionBi9;
       realActionBi22[10] = realActionBi10;
       realActionBi22[11] = realActionBi11;
       realActionBi22[12] = realActionBi15;
       realActionBi22[13] = realActionBi14;
       realActionBi22[14] = realActionBi17;
       realActionBi22[15] = realActionBi18;
       realActionBi22[16] = realActionBi20;
       realActionBi22[17] = realActionBi21;
       realActionBi22[18] = realActionBi19;
       RealActionBizType.$VALUES = realActionBi22;
    }
    public void RealActionBizType(String p0,int p1,String p2){
       super(p0, p1);
       this.mBizType = p2;
    }
    public static RealActionBizType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RealActionBizType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(RealActionBizType.class, p0);
    }
    public static RealActionBizType[] values(){
       Object obj = PatchProxy.apply(null, null, RealActionBizType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RealActionBizType.$VALUES.clone();
    }
    public String bizType(){
       return this.mBizType;
    }
}
