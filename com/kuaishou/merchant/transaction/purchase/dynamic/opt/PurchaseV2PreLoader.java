package com.kuaishou.merchant.transaction.purchase.dynamic.opt.PurchaseV2PreLoader;
import ra4.a;
import com.kuaishou.merchant.transaction.purchase.dynamic.opt.PurchaseV2PreLoader$mParamsBuilder$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.String;
import java.util.Map;
import com.kuaishou.merchant.preload.net.MethodRequest;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import sm4.b;
import sm4.a;
import kotlin.jvm.internal.a;
import com.kwai.robust.PatchProxyResult;
import okhttp3.RequestBody;
import gd4.d;
import ue4.j;
import android.net.Uri;
import java.util.Objects;
import com.kuaishou.merchant.transaction.purchase.dynamic.util.PageInfoParamBuilder;
import com.google.gson.JsonObject;
import androidx.fragment.app.Fragment;
import com.kuaishou.merchant.transaction.base.dynamic.viewbinder.MainProcViewBinder$b;
import ojd.c;
import brd.t;
import com.kuaishou.merchant.transaction.purchase.dynamic.opt.PurchaseV2PreLoader$a;
import com.kuaishou.merchant.transaction.purchase.dynamic.opt.PurchaseV2PreLoader$b;
import erd.g;
import crd.b;
import java.util.List;
import java.lang.Integer;
import va4.c;
import va4.a;
import nsd.u;

public final class PurchaseV2PreLoader extends a	// class@000916
{
    public static final p a;
    public static final PurchaseV2PreLoader b;

    static {
       PurchaseV2PreLoader.b = new PurchaseV2PreLoader();
       PurchaseV2PreLoader.a = s.c(PurchaseV2PreLoader$mParamsBuilder$2.INSTANCE);
    }
    public void PurchaseV2PreLoader(){
       super();
    }
    public String a(){
       return "MERCHANT_PURCHASE_PAGE_V2";
    }
    public void c(Map p0,MethodRequest p1){
       PurchaseV2PreLoader purchaseV2Pr = PurchaseV2PreLoader.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, purchaseV2Pr, "5")) {
          return;
       }
       if (TextUtils.x(p1.getUrl())) {
          return;
       }
       b uob = a.a();
       String url = p1.getUrl();
       a.m(url);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = PatchProxy.applyOneRefs(url, this, purchaseV2Pr, "6");
       if (uoc != patchProxyRe) {
       }else {
          d uod = new d(j.b());
          uod.E0(Uri.parse(url));
          PurchaseV2PreLoader b = PurchaseV2PreLoader.b;
          Objects.requireNonNull(b);
          PageInfoParamBuilder pageInfoPara = PatchProxy.apply(null, b, purchaseV2Pr, "1");
          if (pageInfoPara == patchProxyRe) {
             pageInfoPara = PurchaseV2PreLoader.a.getValue();
          }
          uoc = c.d(pageInfoPara.a(null, uod.z0(), uod.t0(), null));
       }
       uob.a(p0, uoc).subscribe(PurchaseV2PreLoader$a.b, PurchaseV2PreLoader$b.b);
       return;
    }
    public void e(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PurchaseV2PreLoader.class, "3")) {
          return;
       }
       this.h(p0, R.layout.arg_RES_7f0d04f2, 1);
       this.h(p0, R.layout.arg_RES_7f0d07b3, 1);
       this.h(p0, R.layout.arg_RES_7f0d032d, 1);
       this.h(p0, R.layout.arg_RES_7f0d07aa, 1);
       this.h(p0, R.layout.arg_RES_7f0d033e, 1);
       this.h(p0, R.layout.arg_RES_7f0d033a, 1);
       this.h(p0, R.layout.up, 1);
       this.h(p0, R.layout.arg_RES_7f0d07ae, 1);
       this.h(p0, R.layout.arg_RES_7f0d0336, 1);
       this.h(p0, R.layout.arg_RES_7f0d0337, 1);
       this.h(p0, R.layout.arg_RES_7f0d07b1, 1);
       this.h(p0, R.layout.arg_RES_7f0d07b0, 1);
       return;
    }
    public String g(){
       return "kwai://merchant/purchasev2";
    }
    public final void h(List p0,int p1,int p2){
       if (PatchProxy.isSupport(PurchaseV2PreLoader.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, PurchaseV2PreLoader.class, "4")) {
          return;
       }
       c uoc = new c(Integer.valueOf(p1), p2, 0, null, null, 28, null);
       p0.add(v0);
       return;
    }
}
