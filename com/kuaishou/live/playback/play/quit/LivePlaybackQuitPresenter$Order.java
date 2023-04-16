package com.kuaishou.live.playback.play.quit.LivePlaybackQuitPresenter$Order;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LivePlaybackQuitPresenter$Order extends Enum	// class@000d37
{
    public static final LivePlaybackQuitPresenter$Order[] $VALUES;
    public static final LivePlaybackQuitPresenter$Order FINISH;
    public static final LivePlaybackQuitPresenter$Order FOLLOW_GUIDE;
    public static final LivePlaybackQuitPresenter$Order LANDSCAPE;

    static {
       LivePlaybackQuitPresenter$Order order = new LivePlaybackQuitPresenter$Order("LANDSCAPE", 0);
       LivePlaybackQuitPresenter$Order.LANDSCAPE = order;
       LivePlaybackQuitPresenter$Order order1 = new LivePlaybackQuitPresenter$Order("FOLLOW_GUIDE", 1);
       LivePlaybackQuitPresenter$Order.FOLLOW_GUIDE = order1;
       LivePlaybackQuitPresenter$Order order2 = new LivePlaybackQuitPresenter$Order("FINISH", 2);
       LivePlaybackQuitPresenter$Order.FINISH = order2;
       LivePlaybackQuitPresenter$Order[] orderArray = new LivePlaybackQuitPresenter$Order[]{order,order1,order2};
       LivePlaybackQuitPresenter$Order.$VALUES = orderArray;
    }
    public void LivePlaybackQuitPresenter$Order(String p0,int p1){
       super(p0, p1);
    }
    public static LivePlaybackQuitPresenter$Order valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LivePlaybackQuitPresenter$Order.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LivePlaybackQuitPresenter$Order.class, p0);
    }
    public static LivePlaybackQuitPresenter$Order[] values(){
       Object obj = PatchProxy.apply(null, null, LivePlaybackQuitPresenter$Order.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LivePlaybackQuitPresenter$Order.$VALUES.clone();
    }
}
