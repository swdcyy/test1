package com.kuaishou.merchant.live.marketing.sandeago.d;
import io.reactivex.g;
import com.kuaishou.merchant.live.marketing.sandeago.e;
import com.kuaishou.merchant.live.marketing.sandeago.o;
import android.app.Activity;
import java.lang.String;
import q14.i;
import com.kuaishou.merchant.api.live.basic.model.SwitchToolParams;
import java.lang.Object;
import brd.v;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import mrd.a;
import r14.k;
import java.util.Map;
import com.kuaishou.merchant.live.MerchantLiveLogBiz;
import p74.a;
import o74.a;
import java.lang.Boolean;
import e17.i;
import com.kuaishou.merchant.live.marketing.sandeago.n;
import m64.a;
import n64.g;
import n64.e;
import erd.g;
import crd.b;

public final class d implements g	// class@001a3a
{
    public final e b;
    public final o c;
    public final Activity d;
    public final String e;
    public final i f;
    public final SwitchToolParams g;

    public void d(e p0,o p1,Activity p2,String p3,i p4,SwitchToolParams p5){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
    }
    public final void subscribe(v p0){
       d tb = this.b;
       d tc = this.c;
       d td = this.d;
       d te = this.e;
       d tg = this.g;
       String str = tb.g();
       String str1 = this.f.g();
       Objects.requireNonNull(tc);
       a uoa = PatchProxy.applyFourRefs(td, te, str, str1, tc, o.class, "9");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = a.g();
          k.c(te);
          if (tc.u(te)) {
             if (tc.I(te).size() > 1) {
                a.A(MerchantLiveLogBiz.LIVE_SANDEAGO, "close sandeago failed", "multi sandeago");
                uoa.onNext(Boolean.FALSE);
                i.a(R.style.arg_RES_7f110668, 0x7f10434f);
             }else {
                n on = new n(tc, td, str, str1, te);
                uoa = t.create(v7);
             }
          }else if(tc.x(te)){
             a.s(MerchantLiveLogBiz.LIVE_SANDEAGO, "SandeagoManager", "turn sandeago mode off");
             tc.b(te, false);
             i.a(R.style.arg_RES_7f11066a, 0x7f10436b);
          }
          uoa.onNext(Boolean.TRUE);
       }
       uoa.subscribe(new g(tb, tg, p0), new e(tb, tg, p0));
       return;
    }
}
