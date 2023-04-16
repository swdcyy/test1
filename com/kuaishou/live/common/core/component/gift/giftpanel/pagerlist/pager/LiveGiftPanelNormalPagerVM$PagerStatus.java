package com.kuaishou.live.common.core.component.gift.giftpanel.pagerlist.pager.LiveGiftPanelNormalPagerVM$PagerStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveGiftPanelNormalPagerVM$PagerStatus extends Enum	// class@0012ed
{
    public static final LiveGiftPanelNormalPagerVM$PagerStatus[] $VALUES;
    public static final LiveGiftPanelNormalPagerVM$PagerStatus EMPTY;
    public static final LiveGiftPanelNormalPagerVM$PagerStatus FAIL;
    public static final LiveGiftPanelNormalPagerVM$PagerStatus IDLE;
    public static final LiveGiftPanelNormalPagerVM$PagerStatus LOADING;
    public static final LiveGiftPanelNormalPagerVM$PagerStatus LOGIN;
    public static final LiveGiftPanelNormalPagerVM$PagerStatus SUCCESS;

    static {
       LiveGiftPanelNormalPagerVM$PagerStatus pagerStatus;
       LiveGiftPanelNormalPagerVM$PagerStatus[] pagerStatusA = new LiveGiftPanelNormalPagerVM$PagerStatus[]{pagerStatus,pagerStatus,pagerStatus,pagerStatus,pagerStatus,pagerStatus};
       pagerStatus = new LiveGiftPanelNormalPagerVM$PagerStatus("IDLE", 0);
       LiveGiftPanelNormalPagerVM$PagerStatus.IDLE = pagerStatus;
       pagerStatus = new LiveGiftPanelNormalPagerVM$PagerStatus("LOADING", 1);
       LiveGiftPanelNormalPagerVM$PagerStatus.LOADING = pagerStatus;
       pagerStatus = new LiveGiftPanelNormalPagerVM$PagerStatus("SUCCESS", 2);
       LiveGiftPanelNormalPagerVM$PagerStatus.SUCCESS = pagerStatus;
       pagerStatus = new LiveGiftPanelNormalPagerVM$PagerStatus("FAIL", 3);
       LiveGiftPanelNormalPagerVM$PagerStatus.FAIL = pagerStatus;
       pagerStatus = new LiveGiftPanelNormalPagerVM$PagerStatus("LOGIN", 4);
       LiveGiftPanelNormalPagerVM$PagerStatus.LOGIN = pagerStatus;
       pagerStatus = new LiveGiftPanelNormalPagerVM$PagerStatus("EMPTY", 5);
       LiveGiftPanelNormalPagerVM$PagerStatus.EMPTY = pagerStatus;
       LiveGiftPanelNormalPagerVM$PagerStatus.$VALUES = pagerStatusA;
    }
    public void LiveGiftPanelNormalPagerVM$PagerStatus(String p0,int p1){
       super(p0, p1);
    }
    public static LiveGiftPanelNormalPagerVM$PagerStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveGiftPanelNormalPagerVM$PagerStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveGiftPanelNormalPagerVM$PagerStatus.class, p0);
    }
    public static LiveGiftPanelNormalPagerVM$PagerStatus[] values(){
       Object obj = PatchProxy.apply(null, null, LiveGiftPanelNormalPagerVM$PagerStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveGiftPanelNormalPagerVM$PagerStatus.$VALUES.clone();
    }
}
