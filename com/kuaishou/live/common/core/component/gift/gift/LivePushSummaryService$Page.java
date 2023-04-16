package com.kuaishou.live.common.core.component.gift.gift.LivePushSummaryService$Page;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LivePushSummaryService$Page extends Enum	// class@001289
{
    public static final LivePushSummaryService$Page[] $VALUES;
    public static final LivePushSummaryService$Page GIFT_BOX;
    public static final LivePushSummaryService$Page RECEIVED_GIFT_LIST;
    public static final LivePushSummaryService$Page SHOP_ORDER;

    static {
       LivePushSummaryService$Page page = new LivePushSummaryService$Page("GIFT_BOX", 0);
       LivePushSummaryService$Page.GIFT_BOX = page;
       LivePushSummaryService$Page page1 = new LivePushSummaryService$Page("RECEIVED_GIFT_LIST", 1);
       LivePushSummaryService$Page.RECEIVED_GIFT_LIST = page1;
       LivePushSummaryService$Page page2 = new LivePushSummaryService$Page("SHOP_ORDER", 2);
       LivePushSummaryService$Page.SHOP_ORDER = page2;
       LivePushSummaryService$Page[] pageArray = new LivePushSummaryService$Page[]{page,page1,page2};
       LivePushSummaryService$Page.$VALUES = pageArray;
    }
    public void LivePushSummaryService$Page(String p0,int p1){
       super(p0, p1);
    }
    public static LivePushSummaryService$Page valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LivePushSummaryService$Page.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LivePushSummaryService$Page.class, p0);
    }
    public static LivePushSummaryService$Page[] values(){
       Object obj = PatchProxy.apply(null, null, LivePushSummaryService$Page.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LivePushSummaryService$Page.$VALUES.clone();
    }
}
