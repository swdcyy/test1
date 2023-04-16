package com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.w;
import im8.g;
import kc4.c;
import androidx.fragment.app.Fragment;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.w$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kc4.c$a;
import qk4.e;
import vd4.b;
import p74.a;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import com.kwai.robust.PatchProxyResult;
import nk4.t1;
import java.util.Map;
import java.util.HashMap;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.MerchantLivePurchasePanelResponse;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.basic.model.AddressInfo;
import java.lang.Boolean;
import kc4.x;

public class w extends c implements g	// class@000846
{
    public c$a A;
    public MerchantLivePurchasePanelResponse B;
    public e C;

    public void w(Fragment p0){
       super(p0);
       this.A = new w$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, w.class, "3")) {
          return;
       }
       super.E8();
       this.C.d(this.A);
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, w.class, "2")) {
          return;
       }
       super.F8();
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, w.class, "4")) {
          return;
       }
       super.H8();
       return;
    }
    public a Z8(){
       return MerchantTransactionLogBiz.LIVE_PURCHASE_PANEL;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, w.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new t1();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, w.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(w.class, new t1());
       }else {
          obj.put(w.class, null);
       }
       return obj;
    }
    public String getTag(){
       return "PurchasePanelAddressInteractPresenter";
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, w.class, "1")) {
          return;
       }
       super.j8();
       this.B = this.q8(MerchantLivePurchasePanelResponse.class);
       this.C = this.r8("LIVE_AUDIENCE_ORDER_CONFIRM_SERVICE");
       return;
    }
    public String o9(){
       MerchantLivePurchasePanelResponse mAddressInfo = this.B.mAddressInfo;
       AddressInfo mIdentifyKey = (mAddressInfo != null)? mAddressInfo.mIdentifyKey: "";
       return mIdentifyKey;
    }
    public boolean q9(){
       Object obj = PatchProxy.apply(null, this, w.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return x.h(this.B.mAddressInfo);
    }
}
