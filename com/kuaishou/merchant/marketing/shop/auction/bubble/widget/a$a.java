package com.kuaishou.merchant.marketing.shop.auction.bubble.widget.a$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.merchant.marketing.shop.auction.bubble.widget.a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.merchant.marketing.shop.auction.bubble.widget.AbstractAuctionBubble;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.merchant.basic.util.o;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import com.kuaishou.merchant.marketing.shop.auction.bubble.widget.AbstractAuctionBubble$AuctionSuspendStatus;
import crd.b;
import lnc.b9;
import v84.b;
import v84.a;
import brd.t;
import cjd.e;
import erd.o;
import z84.h;
import z84.f;
import erd.g;

public class a$a extends m	// class@001b89
{
    public final a c;

    public void a$a(a p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       b obj;
       boolean b1;
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       a$a tc = this.c;
       Objects.requireNonNull(tc);
       a uoa = a.class;
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, tc, uoa, "6")) {
          int i = 0;
          boolean b = true;
          if (!tc.j0()) {
             if (tc.I()) {
                obj = PatchProxy.apply(objArray, tc, AbstractAuctionBubble.class, "22");
                if (obj != PatchProxyResult.class) {
                   b1 = obj.booleanValue();
                }else if((tc.C - o.d()) <= 0){
                   b = 0;
                }
                b1 = b;
                if (!b1) {
                   i.e(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f10025e), i);
                }
             }
          }else if(tc.H() == AbstractAuctionBubble$AuctionSuspendStatus.RESUME){
             i = true;
          }
          if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(i), tc, uoa, "7")) {
             tc.a1 = b;
             tc.i0(tc.k0());
             b9.a(tc.Y0);
             obj = a.a();
             a c1 = tc.c1;
             if (c1 == null) {
                c1 = "";
             }
             String str = (i)? "suspend": "resume";
             tc.Y0 = obj.d(c1, str).map(new e()).subscribe(new h(tc, i), new f(tc));
          }
       }
       return;
    }
}
