package com.yxcorp.gifshow.trending.inject.event.OnPlayTrendingInfoChangeEvent$TrendingInfoChangeAction;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class OnPlayTrendingInfoChangeEvent$TrendingInfoChangeAction extends Enum	// class@001da6
{
    public static final OnPlayTrendingInfoChangeEvent$TrendingInfoChangeAction[] $VALUES;
    public static final OnPlayTrendingInfoChangeEvent$TrendingInfoChangeAction CLICK;
    public static final OnPlayTrendingInfoChangeEvent$TrendingInfoChangeAction JUMP_TO_NEXT;
    public static final OnPlayTrendingInfoChangeEvent$TrendingInfoChangeAction SLIDE_DOWN;
    public static final OnPlayTrendingInfoChangeEvent$TrendingInfoChangeAction SLIDE_UP;

    static {
       OnPlayTrendingInfoChangeEvent$TrendingInfoChangeAction trendingInfo = new OnPlayTrendingInfoChangeEvent$TrendingInfoChangeAction("CLICK", 0);
       OnPlayTrendingInfoChangeEvent$TrendingInfoChangeAction.CLICK = trendingInfo;
       OnPlayTrendingInfoChangeEvent$TrendingInfoChangeAction trendingInfo1 = new OnPlayTrendingInfoChangeEvent$TrendingInfoChangeAction("SLIDE_DOWN", 1);
       OnPlayTrendingInfoChangeEvent$TrendingInfoChangeAction.SLIDE_DOWN = trendingInfo1;
       OnPlayTrendingInfoChangeEvent$TrendingInfoChangeAction trendingInfo2 = new OnPlayTrendingInfoChangeEvent$TrendingInfoChangeAction("SLIDE_UP", 2);
       OnPlayTrendingInfoChangeEvent$TrendingInfoChangeAction.SLIDE_UP = trendingInfo2;
       OnPlayTrendingInfoChangeEvent$TrendingInfoChangeAction trendingInfo3 = new OnPlayTrendingInfoChangeEvent$TrendingInfoChangeAction("JUMP_TO_NEXT", 3);
       OnPlayTrendingInfoChangeEvent$TrendingInfoChangeAction.JUMP_TO_NEXT = trendingInfo3;
       OnPlayTrendingInfoChangeEvent$TrendingInfoChangeAction[] trendingInfo4 = new OnPlayTrendingInfoChangeEvent$TrendingInfoChangeAction[]{trendingInfo,trendingInfo1,trendingInfo2,trendingInfo3};
       OnPlayTrendingInfoChangeEvent$TrendingInfoChangeAction.$VALUES = trendingInfo4;
    }
    public void OnPlayTrendingInfoChangeEvent$TrendingInfoChangeAction(String p0,int p1){
       super(p0, p1);
    }
    public static OnPlayTrendingInfoChangeEvent$TrendingInfoChangeAction valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, OnPlayTrendingInfoChangeEvent$TrendingInfoChangeAction.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(OnPlayTrendingInfoChangeEvent$TrendingInfoChangeAction.class, p0);
    }
    public static OnPlayTrendingInfoChangeEvent$TrendingInfoChangeAction[] values(){
       Object obj = PatchProxy.apply(null, null, OnPlayTrendingInfoChangeEvent$TrendingInfoChangeAction.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return OnPlayTrendingInfoChangeEvent$TrendingInfoChangeAction.$VALUES.clone();
    }
}
