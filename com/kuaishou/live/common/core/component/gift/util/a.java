package com.kuaishou.live.common.core.component.gift.util.a;
import ok.o;
import java.lang.Object;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.GiftPanelItem;
import com.yxcorp.gifshow.models.Gift;

public final class a implements o	// class@00132d
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final boolean apply(Object p0){
       boolean b = (p0 != null && p0.getGift() != null)? true: false;
       return b;
    }
}
