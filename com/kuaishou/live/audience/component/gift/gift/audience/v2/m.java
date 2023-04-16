package com.kuaishou.live.audience.component.gift.gift.audience.v2.m;
import java.util.Comparator;
import java.lang.Object;
import com.kuaishou.live.common.core.component.gift.gift.righttopbanner.panel.ILiveDefaultSelectGiftIdInterceptor;
import java.lang.Integer;

public final class m implements Comparator	// class@000b24
{
    public static final m b;

    static {
       m.b = new m();
    }
    public void m(){
       super();
    }
    public final int compare(Object p0,Object p1){
       return Integer.compare(p1.getPriority(), p0.getPriority());
    }
}
