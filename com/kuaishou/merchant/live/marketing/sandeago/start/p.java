package com.kuaishou.merchant.live.marketing.sandeago.start.p;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kuaishou.merchant.live.marketing.sandeago.start.LiveAnchorStartSandeagoFragment$b;
import com.kuaishou.merchant.live.marketing.sandeago.start.g;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.merchant.live.marketing.sandeago.start.h;
import com.kuaishou.merchant.live.marketing.sandeago.start.i;
import com.kuaishou.merchant.live.marketing.sandeago.start.j;
import com.kuaishou.merchant.live.marketing.sandeago.start.k;
import com.kuaishou.merchant.live.marketing.sandeago.start.l;
import com.kuaishou.merchant.live.marketing.sandeago.start.m;
import com.kuaishou.merchant.live.marketing.sandeago.start.n;
import com.kuaishou.merchant.live.marketing.sandeago.start.o;
import com.kuaishou.merchant.live.marketing.sandeago.start.a;
import com.kuaishou.merchant.live.marketing.sandeago.start.b;
import com.kuaishou.merchant.live.marketing.sandeago.start.c;
import com.kuaishou.merchant.live.marketing.sandeago.start.d;
import com.kuaishou.merchant.live.marketing.sandeago.start.e;
import com.kuaishou.merchant.live.marketing.sandeago.start.f;
import java.lang.Class;
import mm8.a;

public final class p implements b	// class@001a6d
{

    public void p(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("SANDEAGO_AUDIT_FAIL_SUBJECT", new g(this, p1));
       p0.i("SANDEAGO_CATEGORY_CHANGED_SUBJECT", new h(this, p1));
       p0.i("SANDEAGO_CATEGORY_SUGGEST_SUBJECT", new i(this, p1));
       p0.i("SANDEAGO_ENTER_TIME", new j(this, p1));
       p0.i("SANDEABIZ_START_FRAGMENT", new k(this, p1));
       p0.i("LIVE_MERCHANT_ANCHOR_SANDEABIZ_SERVICE", new l(this, p1));
       p0.i("LIVE_BASE_CONTEXT", new m(this, p1));
       p0.i("SANDEABIZ_START_DELEGATE", new n(this, p1));
       p0.i("SANDEAGO_PROP_CHANGED_SUBJECT", new o(this, p1));
       p0.i("SANDEAGO_RULE_CONFIG_SUBJECT", new a(this, p1));
       p0.i("SANDEABIZ_PUBLISH", new b(this, p1));
       p0.i("SANDEABIZ_STORE_PUBLISH", new c(this, p1));
       p0.i("SANDEAGO_SKU_EDIT_TEXT_CHANGED_SUBJECT", new d(this, p1));
       e uoe = new e(this, p1);
       String str = "SANDEAGO_TITLE_SUBJECT";
       try{
          p0.i(str, uoe);
          p0.h(LiveAnchorStartSandeagoFragment$b.class, new f(this, p1));
          return;
       }catch(java.lang.IllegalArgumentException e0){
       }
    }
    public a b(Object p0){
       return a.a(this, p0);
    }
    public b init(){
       return a.b(this);
    }
}
