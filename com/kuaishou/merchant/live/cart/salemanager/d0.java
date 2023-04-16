package com.kuaishou.merchant.live.cart.salemanager.d0;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.merchant.live.cart.salemanager.e0;
import com.kuaishou.merchant.live.cart.salemanager.LiveAnchorShopFragment$b;
import java.lang.Object;
import com.kuaishou.merchant.live.cart.salemanager.model.ExcellentCommodityInfo;

public class d0 extends Accessor	// class@0019d7
{
    public final LiveAnchorShopFragment$b c;
    public final e0 d;

    public void d0(e0 p0,LiveAnchorShopFragment$b p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.m;
    }
    public void set(Object p0){
       this.c.m = p0;
    }
}
