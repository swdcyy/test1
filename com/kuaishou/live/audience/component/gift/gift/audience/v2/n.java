package com.kuaishou.live.audience.component.gift.gift.audience.v2.n;
import java.util.Comparator;
import java.lang.Object;
import com.kuaishou.live.common.core.component.gift.gift.righttopbanner.panel.ILiveDefaultSelectGiftIdInterceptor;
import java.lang.Integer;

public final class n implements Comparator	// class@000b25
{
    public static final n b;

    static {
       n.b = new n();
    }
    public void n(){
       super();
    }
    public final int compare(Object p0,Object p1){
       return Integer.compare(p1.getPriority(), p0.getPriority());
    }
}
