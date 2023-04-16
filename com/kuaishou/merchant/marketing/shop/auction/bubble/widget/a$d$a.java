package com.kuaishou.merchant.marketing.shop.auction.bubble.widget.a$d$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.merchant.marketing.shop.auction.bubble.widget.a$d;
import bs3.a$a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.marketing.shop.auction.bubble.widget.AbstractAuctionBubble$a;

public class a$d$a extends m	// class@001b8c
{
    public final a$a c;
    public final a$d d;

    public void a$d$a(a$d p0,a$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$d$a.class, "1")) {
          return;
       }
       a$d f = this.d.f;
       if (f != null) {
          a$d$a tc = this.c;
          f.b(tc.b, String.valueOf(tc.a));
       }
       return;
    }
}
