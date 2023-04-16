package com.kuaishou.merchant.transaction.live.dynamic.service.MtPurchasePanelSkuServiceViewBinder;
import vd4.b;
import com.kuaishou.merchant.transaction.live.dynamic.service.MtPurchasePanelSkuServiceViewBinder$a;
import nsd.u;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.transaction.live.dynamic.service.MtPurchasePanelSkuServiceViewBinder$onBind$1;
import kotlin.jvm.internal.a;
import msd.l;
import vd4.s$b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class MtPurchasePanelSkuServiceViewBinder extends b	// class@0007bd
{
    public s$b y;
    public static final MtPurchasePanelSkuServiceViewBinder$a z;

    static {
       MtPurchasePanelSkuServiceViewBinder.z = new MtPurchasePanelSkuServiceViewBinder$a(null);
    }
    public void MtPurchasePanelSkuServiceViewBinder(Fragment p0){
       super(p0);
    }
    public void E8(){
       MtPurchasePanelSkuServiceViewBinder mtPurchasePa = MtPurchasePanelSkuServiceViewBinder.class;
       if (PatchProxy.applyVoid(null, this, mtPurchasePa, "2")) {
          return;
       }
       super.E8();
       MtPurchasePanelSkuServiceViewBinder$onBind$1 oonBind$1 = new MtPurchasePanelSkuServiceViewBinder$onBind$1(this);
       if (!PatchProxy.applyVoidTwoRefs("skuManagerInfo", oonBind$1, this, mtPurchasePa, "4")) {
          mtPurchasePa = this.y;
          if (mtPurchasePa == null) {
             a.S("mGlobalDataDispatchService");
          }
          mtPurchasePa.b("skuManagerInfo", oonBind$1);
       }
       return;
    }
    public void J8(){
       MtPurchasePanelSkuServiceViewBinder mtPurchasePa = MtPurchasePanelSkuServiceViewBinder.class;
       if (PatchProxy.applyVoid(null, this, mtPurchasePa, "3")) {
          return;
       }
       super.J8();
       if (!PatchProxy.applyVoidOneRefs("skuManagerInfo", this, mtPurchasePa, "5")) {
          mtPurchasePa = this.y;
          if (mtPurchasePa == null) {
             a.S("mGlobalDataDispatchService");
          }
          mtPurchasePa.d("skuManagerInfo");
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, MtPurchasePanelSkuServiceViewBinder.class, "1")) {
          return;
       }
       super.j8();
       this.y = this.r8("global_data_dispatch_svr");
       return;
    }
}
