package com.kuaishou.live.common.core.component.turbomode.OptimizedElement;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class OptimizedElement extends Enum	// class@0017bb
{
    public final String key;
    public static final OptimizedElement[] $VALUES;
    public static final OptimizedElement AUDIENCE_TOPIC;
    public static final OptimizedElement COMMENT_NOTICE;
    public static final OptimizedElement DISTRICT_RANK;
    public static final OptimizedElement FOLLOW_COMMENT_NOTICE;
    public static final OptimizedElement GLOBAL_BROADCAST_NOTICE;
    public static final OptimizedElement LYRICS;
    public static final OptimizedElement MAGIC_MAGIC_GIFT_EFFECTS;
    public static final OptimizedElement RIGHT_BOTTOM_REVENUE_WIDGET;
    public static final OptimizedElement TEMP_ENHANCE_MESSAGE;
    public static final OptimizedElement TOP_BROADCAST_NOTICE;
    public static final OptimizedElement TOP_LEFT_REVENUE_WIDGET;
    public static final OptimizedElement TOP_RIGHT_NOTICE;
    public static final OptimizedElement WEALTH_GRADE_ENTER_ROOM_EFFECT;
    public static final OptimizedElement WISH_LIST;

    static {
       OptimizedElement[] optimizedEle = new OptimizedElement[14];
       OptimizedElement optimizedEle1 = new OptimizedElement("AUDIENCE_TOPIC", 0, "enableAudienceTopic");
       OptimizedElement.AUDIENCE_TOPIC = optimizedEle1;
       optimizedEle[0] = optimizedEle1;
       optimizedEle1 = new OptimizedElement("TOP_RIGHT_NOTICE", 1, "enableNotification");
       OptimizedElement.TOP_RIGHT_NOTICE = optimizedEle1;
       optimizedEle[1] = optimizedEle1;
       optimizedEle1 = new OptimizedElement("TOP_BROADCAST_NOTICE", 2, "enableTopNoticeOrBroadcastNotice");
       OptimizedElement.TOP_BROADCAST_NOTICE = optimizedEle1;
       optimizedEle[2] = optimizedEle1;
       optimizedEle1 = new OptimizedElement("TEMP_ENHANCE_MESSAGE", 3, "enableLeftTopNotice");
       OptimizedElement.TEMP_ENHANCE_MESSAGE = optimizedEle1;
       optimizedEle[3] = optimizedEle1;
       optimizedEle1 = new OptimizedElement("DISTRICT_RANK", 4, "enableDistrictRankNotice");
       OptimizedElement.DISTRICT_RANK = optimizedEle1;
       optimizedEle[4] = optimizedEle1;
       optimizedEle1 = new OptimizedElement("WISH_LIST", 5, "enableWishListAudience");
       OptimizedElement.WISH_LIST = optimizedEle1;
       optimizedEle[5] = optimizedEle1;
       optimizedEle1 = new OptimizedElement("TOP_LEFT_REVENUE_WIDGET", 6, "enableLeftTopRevenueWidget");
       OptimizedElement.TOP_LEFT_REVENUE_WIDGET = optimizedEle1;
       optimizedEle[6] = optimizedEle1;
       optimizedEle1 = new OptimizedElement("RIGHT_BOTTOM_REVENUE_WIDGET", 7, "enableRightBottomRevenue");
       OptimizedElement.RIGHT_BOTTOM_REVENUE_WIDGET = optimizedEle1;
       optimizedEle[7] = optimizedEle1;
       optimizedEle1 = new OptimizedElement("LYRICS", 8, "enableLiveMusicAudience");
       OptimizedElement.LYRICS = optimizedEle1;
       optimizedEle[8] = optimizedEle1;
       optimizedEle1 = new OptimizedElement("COMMENT_NOTICE", 9, "enableCommentNotice");
       OptimizedElement.COMMENT_NOTICE = optimizedEle1;
       optimizedEle[9] = optimizedEle1;
       optimizedEle1 = new OptimizedElement("FOLLOW_COMMENT_NOTICE", 10, "enableFollowCommentNotice");
       OptimizedElement.FOLLOW_COMMENT_NOTICE = optimizedEle1;
       optimizedEle[10] = optimizedEle1;
       optimizedEle1 = new OptimizedElement("MAGIC_MAGIC_GIFT_EFFECTS", 11, "enableAudienceMagicFace");
       OptimizedElement.MAGIC_MAGIC_GIFT_EFFECTS = optimizedEle1;
       optimizedEle[11] = optimizedEle1;
       optimizedEle1 = new OptimizedElement("WEALTH_GRADE_ENTER_ROOM_EFFECT", 12, "enableWealthGrade");
       OptimizedElement.WEALTH_GRADE_ENTER_ROOM_EFFECT = optimizedEle1;
       optimizedEle[12] = optimizedEle1;
       optimizedEle1 = new OptimizedElement("GLOBAL_BROADCAST_NOTICE", 13, "enableBroadcast");
       OptimizedElement.GLOBAL_BROADCAST_NOTICE = optimizedEle1;
       optimizedEle[13] = optimizedEle1;
       OptimizedElement.$VALUES = optimizedEle;
    }
    public void OptimizedElement(String p0,int p1,String p2){
       super(p0, p1);
       this.key = p2;
    }
    public static OptimizedElement valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, OptimizedElement.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(OptimizedElement.class, p0);
    }
    public static OptimizedElement[] values(){
       Object obj = PatchProxy.apply(null, null, OptimizedElement.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return OptimizedElement.$VALUES.clone();
    }
    public final String getKey(){
       return this.key;
    }
    public String toString(){
       return this.key;
    }
}
