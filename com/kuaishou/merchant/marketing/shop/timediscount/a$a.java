package com.kuaishou.merchant.marketing.shop.timediscount.a$a;
import com.kuaishou.merchant.marketing.shop.timediscount.view.LiveMerchantTimeDiscountPendent$a;
import com.kuaishou.merchant.marketing.shop.timediscount.a;
import java.lang.Object;
import y94.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;

public class a$a implements LiveMerchantTimeDiscountPendent$a	// class@001c00
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void a(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "2")) {
          return;
       }
       this.a.h9(p0);
       return;
    }
    public void b(boolean p0,c p1){
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoa, "1")) {
          return;
       }
       this.a.k9(p0, p1);
       return;
    }
}
