package com.kuaishou.merchant.transaction.live.dynamic.opt.PurchasePanelV2PreLoader;
import ra4.a;
import com.kuaishou.merchant.transaction.live.dynamic.opt.PurchasePanelV2PreLoader$mParamsBuilder$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.String;
import java.util.Map;
import com.kuaishou.merchant.preload.net.MethodRequest;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.net.Uri;
import ot3.h0;
import ekd.q;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lk4.b;
import lk4.a;
import kotlin.jvm.internal.a;
import com.kwai.robust.PatchProxyResult;
import okhttp3.RequestBody;
import gd4.d;
import ue4.j;
import java.util.Objects;
import com.kuaishou.merchant.transaction.live.dynamic.service.PageInfoParamBuilder;
import com.google.gson.JsonObject;
import androidx.fragment.app.Fragment;
import com.kuaishou.merchant.transaction.base.dynamic.viewbinder.MainProcViewBinder$b;
import ojd.c;
import brd.t;
import com.kuaishou.merchant.transaction.live.dynamic.opt.PurchasePanelV2PreLoader$a;
import com.kuaishou.merchant.transaction.live.dynamic.opt.PurchasePanelV2PreLoader$b;
import erd.g;
import crd.b;
import java.util.List;
import va4.c;
import java.lang.Integer;
import va4.a;
import nsd.u;

public final class PurchasePanelV2PreLoader extends a	// class@0007ab
{
    public static final p a;
    public static final PurchasePanelV2PreLoader b;

    static {
       PurchasePanelV2PreLoader.b = new PurchasePanelV2PreLoader();
       PurchasePanelV2PreLoader.a = s.c(PurchasePanelV2PreLoader$mParamsBuilder$2.INSTANCE);
    }
    public void PurchasePanelV2PreLoader(){
       super();
    }
    public String a(){
       return "MERCHANT_PURCHASE_HALF_PAGE";
    }
    public void c(Map p0,MethodRequest p1){
       PurchasePanelV2PreLoader purchasePane = PurchasePanelV2PreLoader.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, purchasePane, "4")) {
          return;
       }
       if (q.h(h0.a(Uri.parse(p1.getUrl())))) {
          return;
       }
       if (TextUtils.x(p1.getUrl())) {
          return;
       }
       b uob = a.a();
       String url = p1.getUrl();
       a.m(url);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = PatchProxy.applyOneRefs(url, this, purchasePane, "5");
       if (uoc != patchProxyRe) {
       }else {
          d uod = new d(j.b());
          uod.E0(Uri.parse(url));
          PurchasePanelV2PreLoader b = PurchasePanelV2PreLoader.b;
          Objects.requireNonNull(b);
          PageInfoParamBuilder pageInfoPara = PatchProxy.apply(null, b, purchasePane, "1");
          if (pageInfoPara == patchProxyRe) {
             pageInfoPara = PurchasePanelV2PreLoader.a.getValue();
          }
          uoc = c.d(pageInfoPara.a(null, uod.z0(), uod.t0(), null));
       }
       uob.a(p0, uoc).subscribe(PurchasePanelV2PreLoader$a.b, PurchasePanelV2PreLoader$b.b);
       return;
    }
    public void e(List p0){
       Object obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, this, PurchasePanelV2PreLoader.class, "3")) {
          return;
       }
       c uoc = new c(Integer.valueOf(0x7f0d04f1), 1, 0, null, null, 28, null);
       obj.add(v1);
       c uoc1 = new c(Integer.valueOf(0x7f0d04e9), 1, 0, null, null, 28, null);
       obj.add(v1);
       uoc = new c(Integer.valueOf(0x7f0d07ab), 1, 0, null, null, 28, null);
       obj.add(v1);
       uoc1 = new c(Integer.valueOf(0x7f0d07ad), 1, 0, null, null, 28, null);
       obj.add(v1);
       return;
    }
    public String g(){
       return "kwai://merchant/live/purchasepanelv2";
    }
}
