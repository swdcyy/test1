package com.kuaishou.merchant.transaction.live.orderconfirmpage.a;
import erd.g;
import com.kuaishou.merchant.transaction.live.orderconfirmpage.MerchantPurchasePanelContainerActivity;
import java.lang.Object;
import gu3.b;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import wd4.a;
import android.content.Intent;
import android.app.Activity;
import android.net.Uri;
import java.util.Map;
import ot3.h0;
import sk4.d;
import java.lang.Integer;
import ot3.g0;
import android.os.Handler;
import tj4.a;
import java.lang.Runnable;
import crd.b;
import lnc.b9;

public final class a implements g	// class@0007de
{
    public final MerchantPurchasePanelContainerActivity b;

    public void a(MerchantPurchasePanelContainerActivity p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       MerchantPurchasePanelContainerActivity merchantPurc = MerchantPurchasePanelContainerActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, tb, merchantPurc, "3")) {
       }else if(p0 == null || tb.A != null){
          tb.A = true;
          RxBus f = RxBus.f;
          f.d(b.class);
          if (TextUtils.n("paySuccess", p0.a)) {
             f.c(new a());
             if (!TextUtils.x(p0.b)) {
                d.b(p0.b, h0.a(tb.B3(tb.getIntent())).get("detail_page_id"));
             }
          }
          if (!PatchProxy.applyVoid(null, tb, merchantPurc, "12")) {
             g0.a(tb, "mCloseEnterAnimation", Integer.valueOf(0));
          }
          new Handler().postDelayed(new a(p0), 100);
          b9.a(tb.B);
       }
    }
}
