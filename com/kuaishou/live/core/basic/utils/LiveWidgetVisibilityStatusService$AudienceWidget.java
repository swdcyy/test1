package com.kuaishou.live.core.basic.utils.LiveWidgetVisibilityStatusService$AudienceWidget;
import com.kuaishou.live.core.basic.utils.LiveWidgetVisibilityStatusService$a;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public final class LiveWidgetVisibilityStatusService$AudienceWidget extends Enum implements LiveWidgetVisibilityStatusService$a	// class@0008df
{
    public static final LiveWidgetVisibilityStatusService$AudienceWidget[] $VALUES;
    public static final LiveWidgetVisibilityStatusService$AudienceWidget CHATTING;
    public static final LiveWidgetVisibilityStatusService$AudienceWidget CHAT_APPLY_DIALOG;
    public static final LiveWidgetVisibilityStatusService$AudienceWidget DISTRICT_RANK_DETAIL;
    public static final LiveWidgetVisibilityStatusService$AudienceWidget FANS_GROUP_DETAIL;
    public static final LiveWidgetVisibilityStatusService$AudienceWidget GIFT_BOX;
    public static final LiveWidgetVisibilityStatusService$AudienceWidget GIFT_WHEEL;
    public static final LiveWidgetVisibilityStatusService$AudienceWidget MERCHANT_LIST;
    public static final LiveWidgetVisibilityStatusService$AudienceWidget PROFILE_CARD_DETAIL;
    public static final LiveWidgetVisibilityStatusService$AudienceWidget TOP_USER_DETAIL;
    public static final LiveWidgetVisibilityStatusService$AudienceWidget WISH_LIST_DETAIL;

    static {
       LiveWidgetVisibilityStatusService$AudienceWidget uAudienceWid = new LiveWidgetVisibilityStatusService$AudienceWidget("PROFILE_CARD_DETAIL", 0);
       LiveWidgetVisibilityStatusService$AudienceWidget.PROFILE_CARD_DETAIL = uAudienceWid;
       LiveWidgetVisibilityStatusService$AudienceWidget uAudienceWid1 = new LiveWidgetVisibilityStatusService$AudienceWidget("TOP_USER_DETAIL", 1);
       LiveWidgetVisibilityStatusService$AudienceWidget.TOP_USER_DETAIL = uAudienceWid1;
       LiveWidgetVisibilityStatusService$AudienceWidget uAudienceWid2 = new LiveWidgetVisibilityStatusService$AudienceWidget("WISH_LIST_DETAIL", 2);
       LiveWidgetVisibilityStatusService$AudienceWidget.WISH_LIST_DETAIL = uAudienceWid2;
       LiveWidgetVisibilityStatusService$AudienceWidget uAudienceWid3 = new LiveWidgetVisibilityStatusService$AudienceWidget("CHAT_APPLY_DIALOG", 3);
       LiveWidgetVisibilityStatusService$AudienceWidget.CHAT_APPLY_DIALOG = uAudienceWid3;
       LiveWidgetVisibilityStatusService$AudienceWidget uAudienceWid4 = new LiveWidgetVisibilityStatusService$AudienceWidget("CHATTING", 4);
       LiveWidgetVisibilityStatusService$AudienceWidget.CHATTING = uAudienceWid4;
       LiveWidgetVisibilityStatusService$AudienceWidget uAudienceWid5 = new LiveWidgetVisibilityStatusService$AudienceWidget("GIFT_BOX", 5);
       LiveWidgetVisibilityStatusService$AudienceWidget.GIFT_BOX = uAudienceWid5;
       LiveWidgetVisibilityStatusService$AudienceWidget uAudienceWid6 = new LiveWidgetVisibilityStatusService$AudienceWidget("MERCHANT_LIST", 6);
       LiveWidgetVisibilityStatusService$AudienceWidget.MERCHANT_LIST = uAudienceWid6;
       LiveWidgetVisibilityStatusService$AudienceWidget uAudienceWid7 = new LiveWidgetVisibilityStatusService$AudienceWidget("FANS_GROUP_DETAIL", 7);
       LiveWidgetVisibilityStatusService$AudienceWidget.FANS_GROUP_DETAIL = uAudienceWid7;
       LiveWidgetVisibilityStatusService$AudienceWidget uAudienceWid8 = new LiveWidgetVisibilityStatusService$AudienceWidget("GIFT_WHEEL", 8);
       LiveWidgetVisibilityStatusService$AudienceWidget.GIFT_WHEEL = uAudienceWid8;
       LiveWidgetVisibilityStatusService$AudienceWidget uAudienceWid9 = new LiveWidgetVisibilityStatusService$AudienceWidget("DISTRICT_RANK_DETAIL", 9);
       LiveWidgetVisibilityStatusService$AudienceWidget.DISTRICT_RANK_DETAIL = uAudienceWid9;
       LiveWidgetVisibilityStatusService$AudienceWidget[] uAudienceWid10 = new LiveWidgetVisibilityStatusService$AudienceWidget[10];
       uAudienceWid10[0] = uAudienceWid;
       uAudienceWid10[1] = uAudienceWid1;
       uAudienceWid10[2] = uAudienceWid2;
       uAudienceWid10[3] = uAudienceWid3;
       uAudienceWid10[4] = uAudienceWid4;
       uAudienceWid10[5] = uAudienceWid5;
       uAudienceWid10[6] = uAudienceWid6;
       uAudienceWid10[7] = uAudienceWid7;
       uAudienceWid10[8] = uAudienceWid8;
       uAudienceWid10[9] = uAudienceWid9;
       LiveWidgetVisibilityStatusService$AudienceWidget.$VALUES = uAudienceWid10;
    }
    public void LiveWidgetVisibilityStatusService$AudienceWidget(String p0,int p1){
       super(p0, p1);
    }
    public static LiveWidgetVisibilityStatusService$AudienceWidget valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveWidgetVisibilityStatusService$AudienceWidget.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveWidgetVisibilityStatusService$AudienceWidget.class, p0);
    }
    public static LiveWidgetVisibilityStatusService$AudienceWidget[] values(){
       Object obj = PatchProxy.apply(null, null, LiveWidgetVisibilityStatusService$AudienceWidget.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveWidgetVisibilityStatusService$AudienceWidget.$VALUES.clone();
    }
    public int getIndex(){
       Object obj = PatchProxy.apply(null, this, LiveWidgetVisibilityStatusService$AudienceWidget.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.ordinal();
    }
}
