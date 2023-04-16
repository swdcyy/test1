package com.kuaishou.merchant.transaction.purchase.dynamic.viewbinder.MtpPageCtxBuildingViewBinder;
import vd4.d;
import com.kuaishou.merchant.transaction.purchase.dynamic.viewbinder.MtpPageCtxBuildingViewBinder$a;
import nsd.u;
import androidx.fragment.app.Fragment;
import com.kuaishou.merchant.transaction.purchase.dynamic.viewbinder.MtpPageCtxBuildingViewBinder$mParamBuilder$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.String;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import su.g$a;
import com.kuaishou.merchant.transaction.base.dynamic.viewbinder.MainProcViewBinder$b;
import ojd.c;
import com.kuaishou.merchant.transaction.purchase.dynamic.util.PageInfoParamBuilder;
import rk0.b;
import gd4.d;
import gd4.d$a;
import com.google.gson.JsonObject;
import okhttp3.RequestBody;
import com.kuaishou.merchant.transaction.purchase.k0;
import com.kuaishou.merchant.transaction.purchase.dynamic.viewbinder.MtpPageCtxBuildingViewBinder$b;
import erd.b;
import erd.o;

public final class MtpPageCtxBuildingViewBinder extends d	// class@000929
{
    public final p E;
    public static final MtpPageCtxBuildingViewBinder$a F;

    static {
       MtpPageCtxBuildingViewBinder.F = new MtpPageCtxBuildingViewBinder$a(null);
    }
    public void MtpPageCtxBuildingViewBinder(Fragment p0){
       super(p0);
       this.E = s.c(new MtpPageCtxBuildingViewBinder$mParamBuilder$2(p0));
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MtpPageCtxBuildingViewBinder.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(MtpPageCtxBuildingViewBinder.class, null);
       return objectsByTag;
    }
    public g$a o9(Object p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       MtpPageCtxBuildingViewBinder mtpPageCtxBu = MtpPageCtxBuildingViewBinder.class;
       g$a obj = PatchProxy.applyOneRefs(p0, this, mtpPageCtxBu, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new g$a("MERCHANT_PURCHASE_PAGE_V2", null, null);
       obj.v("/rest/app/trade/c/v2/ks/order/page/info");
       boolean b = true;
       obj.m(b);
       if (!(v5 = p0 instanceof MainProcViewBinder$b) || !p0.c()) {
          b = false;
       }
       obj.n(b);
       c uoc = PatchProxy.applyOneRefs(p0, this, mtpPageCtxBu, "3");
       if (uoc != patchProxyRe) {
       }else {
          Object obj1 = PatchProxy.apply(null, this, mtpPageCtxBu, "1");
          if (obj1 != patchProxyRe) {
          }else {
             obj1 = this.E.getValue();
          }
          Fragment uFragment = this.R8();
          d$a n = d.n;
          JsonObject jsonObject = n.a(this.R8()).z0();
          JsonObject jsonObject1 = n.a(this.R8()).t0();
          if (!v5) {
             p0 = null;
          }
          uoc = c.d(obj1.a(uFragment, jsonObject, jsonObject1, p0));
       }
       obj.t(uoc);
       obj.w(new k0(new MtpPageCtxBuildingViewBinder$b(this)));
       return obj;
    }
}
