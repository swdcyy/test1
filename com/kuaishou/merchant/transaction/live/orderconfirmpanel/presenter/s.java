package com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.s;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.s$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import z1.k;
import qk4.d;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.model.PageInfoReqParam;
import com.kwai.robust.PatchProxyResult;
import nk4.j1;
import java.util.Map;
import java.util.HashMap;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.UpgradeAddressGuideModel;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.MerchantLivePurchasePanelResponse;

public class s extends PresenterV2 implements g	// class@00083f
{
    public UpgradeAddressGuideModel p;
    public f q;
    public int r;
    public k s;
    public k t;
    public MerchantLivePurchasePanelResponse u;
    public boolean v;

    public void s(){
       super();
       this.q = new s$a(this);
       this.r = 6004;
    }
    public void P8(boolean p0,long p1){
       s os = s.class;
       if (PatchProxy.isSupport(os) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Long.valueOf(p1), this, os, "2")) {
          return;
       }
       d uod = this.s.get();
       if (uod != null) {
          PageInfoReqParam pageInfoReqP = uod.c();
          pageInfoReqP.mShouldRequest = true;
          if (p0) {
             pageInfoReqP.upgradeAddressSuccess(p1);
          }else {
             pageInfoReqP.reselectAddress(p1);
          }
          this.s.get().d(pageInfoReqP, true);
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, s.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new j1();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, s.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(s.class, new j1());
       }else {
          obj.put(s.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, s.class, "1")) {
          return;
       }
       this.p = this.q8(UpgradeAddressGuideModel.class);
       this.s = this.r8("LIVE_AUDIENCE_ORDER_BOTTOM_BAR_SERVICE_MEDIA");
       this.t = this.r8("ID_ADDRESS_SERVICE_SUPPLIER");
       this.u = this.q8(MerchantLivePurchasePanelResponse.class);
       return;
    }
}
