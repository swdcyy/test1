package com.kuaishou.merchant.live.cart.salemanager.n;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.merchant.live.cart.salemanager.e0;
import com.kuaishou.merchant.live.cart.salemanager.LiveAnchorShopFragment$b;
import java.lang.Object;
import com.kuaishou.merchant.live.cart.salemanager.model.SandeaSwitchInfo;

public class n extends Accessor	// class@0019f7
{
    public final LiveAnchorShopFragment$b c;
    public final e0 d;

    public void n(e0 p0,LiveAnchorShopFragment$b p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.k;
    }
    public void set(Object p0){
       this.c.k = p0;
    }
}
