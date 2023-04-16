package com.kuaishou.live.common.core.component.gift.domain.effect.bean.GiftActionData;
import com.kuaishou.live.common.core.component.gift.domain.effect.bean.ActionData;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;

public final class GiftActionData extends ActionData	// class@0011a1
{
    public final int giftCount;
    public final String giftId;
    public final String giftName;
    public final int giftPrice;

    public void GiftActionData(String p0,String p1,int p2,int p3){
       a.p(p0, "giftId");
       a.p(p1, "giftName");
       super(4, 0, 2, null);
       this.giftId = p0;
       this.giftName = p1;
       this.giftPrice = p2;
       this.giftCount = p3;
    }
    public final int getGiftCount(){
       return this.giftCount;
    }
    public final String getGiftId(){
       return this.giftId;
    }
    public final String getGiftName(){
       return this.giftName;
    }
    public final int getGiftPrice(){
       return this.giftPrice;
    }
}
