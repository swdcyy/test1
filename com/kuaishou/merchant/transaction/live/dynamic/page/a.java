package com.kuaishou.merchant.transaction.live.dynamic.page.a;
import erd.g;
import com.kuaishou.merchant.transaction.live.dynamic.page.MerchantUnpaidRnContainerActivity;
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
import com.kwai.robust.PatchProxyResult;
import android.net.Uri;
import java.util.Map;
import ot3.h0;
import sk4.d;
import java.lang.Integer;
import ot3.g0;
import android.os.Handler;
import jj4.e;
import java.lang.Runnable;
import crd.b;
import lnc.b9;

public final class a implements g	// class@0007b6
{
    public final MerchantUnpaidRnContainerActivity b;

    public void a(MerchantUnpaidRnContainerActivity p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b b;
       a tb = this.b;
       Objects.requireNonNull(tb);
       MerchantUnpaidRnContainerActivity merchantUnpa = MerchantUnpaidRnContainerActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, tb, merchantUnpa, "7")) {
       }else if(p0 == null || tb.y != null){
          tb.y = true;
          RxBus f = RxBus.f;
          f.d(b.class);
          if (TextUtils.n("paySuccess", p0.a)) {
             f.c(new a());
             if (!TextUtils.x(p0.b)) {
                b = p0.b;
                Intent intent = tb.getIntent();
                Uri uri = PatchProxy.applyOneRefs(intent, tb, merchantUnpa, "8");
                if (uri != PatchProxyResult.class) {
                }else if(intent != null && intent.getData() != null){
                   uri = intent.getData();
                   if (!uri.isHierarchical() || TextUtils.x(uri.getEncodedQuery())) {
                   }
                }else {
                }
                d.b(b, h0.a(uri).get("detail_page_id"));
             }
          }
          if (!PatchProxy.applyVoid(null, tb, merchantUnpa, "9")) {
             g0.a(tb, "mCloseEnterAnimation", Integer.valueOf(0));
          }
          new Handler().postDelayed(new e(p0), 100);
          b9.a(tb.z);
       }
    }
}
