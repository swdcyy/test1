package com.yxcorp.gifshow.model.FeedConsumeActionType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class FeedConsumeActionType extends Enum	// class@001e12
{
    public String mType;
    public static final FeedConsumeActionType[] $VALUES;
    public static final FeedConsumeActionType AT_LEAST_1_MIN_VIDEO_PLAY_LESS_THAN_18S;
    public static final FeedConsumeActionType AT_MOST_1_MIN_VIDEO_PLAY_LESS_THAN_7S;
    public static final FeedConsumeActionType INTERACTION;
    public static final FeedConsumeActionType PLAY_AT_LEAST_30S;
    public static final FeedConsumeActionType PLAY_TO_THE_END_VIDEO_LESS_THAN_30S;
    public static final FeedConsumeActionType SEND_COMMENT;
    public static final FeedConsumeActionType SLIDE;

    static {
       FeedConsumeActionType uFeedConsume = new FeedConsumeActionType("SLIDE", 0, "SLIDE");
       FeedConsumeActionType.SLIDE = uFeedConsume;
       FeedConsumeActionType uFeedConsume1 = new FeedConsumeActionType("AT_LEAST_1_MIN_VIDEO_PLAY_LESS_THAN_18S", 1, "AT_LEAST_1_MIN_VIDEO_PLAY_LESS_THAN_18S");
       FeedConsumeActionType.AT_LEAST_1_MIN_VIDEO_PLAY_LESS_THAN_18S = uFeedConsume1;
       FeedConsumeActionType uFeedConsume2 = new FeedConsumeActionType("AT_MOST_1_MIN_VIDEO_PLAY_LESS_THAN_7S", 2, "AT_MOST_1_MIN_VIDEO_PLAY_LESS_THAN_7S");
       FeedConsumeActionType.AT_MOST_1_MIN_VIDEO_PLAY_LESS_THAN_7S = uFeedConsume2;
       FeedConsumeActionType uFeedConsume3 = new FeedConsumeActionType("PLAY_AT_LEAST_30S", 3, "PLAY_AT_LEAST_30S");
       FeedConsumeActionType.PLAY_AT_LEAST_30S = uFeedConsume3;
       FeedConsumeActionType uFeedConsume4 = new FeedConsumeActionType("PLAY_TO_THE_END_VIDEO_LESS_THAN_30S", 4, "PLAY_TO_THE_END_VIDEO_LESS_THAN_30S");
       FeedConsumeActionType.PLAY_TO_THE_END_VIDEO_LESS_THAN_30S = uFeedConsume4;
       FeedConsumeActionType uFeedConsume5 = new FeedConsumeActionType("INTERACTION", 5, "INTERACTION");
       FeedConsumeActionType.INTERACTION = uFeedConsume5;
       FeedConsumeActionType uFeedConsume6 = new FeedConsumeActionType("SEND_COMMENT", 6, "SEND_COMMENT");
       FeedConsumeActionType.SEND_COMMENT = uFeedConsume6;
       FeedConsumeActionType[] uFeedConsume7 = new FeedConsumeActionType[]{uFeedConsume,uFeedConsume1,uFeedConsume2,uFeedConsume3,uFeedConsume4,uFeedConsume5,uFeedConsume6};
       FeedConsumeActionType.$VALUES = uFeedConsume7;
    }
    public void FeedConsumeActionType(String p0,int p1,String p2){
       super(p0, p1);
       this.mType = p2;
    }
    public static FeedConsumeActionType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FeedConsumeActionType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(FeedConsumeActionType.class, p0);
    }
    public static FeedConsumeActionType[] values(){
       Object obj = PatchProxy.apply(null, null, FeedConsumeActionType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return FeedConsumeActionType.$VALUES.clone();
    }
    public String getAction(){
       return this.mType;
    }
}
