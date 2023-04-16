package com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.q;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.w$b;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.r;
import qk4.d;
import qk4.e;
import com.kuaishou.merchant.transaction.base.sku.c;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.MerchantLivePurchasePanelResponse;
import com.kuaishou.merchant.basic.model.AddressInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import pi4.a;
import com.smile.gifmaker.mvps.utils.DefaultObservable;

public class q extends w$b	// class@00083c
{
    public final r f;

    public void q(r p0,d p1,e p2,c p3,MerchantLivePurchasePanelResponse p4,AddressInfo p5){
       this.f = p0;
       super(p1, p2, p3, p4, p5);
    }
    public void b(AddressInfo p0){
       AddressInfo mAddress;
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "1")) {
          return;
       }
       this.f.S8(p0);
       this.f.q.e(true);
       q tf = this.f;
       r s = tf.s;
       r u = tf.u;
       if (u != null) {
          MerchantLivePurchasePanelResponse mAddressInfo = u.mAddressInfo;
          if (mAddressInfo != null) {
             mAddress = mAddressInfo.mAddress;
          label_002b :
             s.notifyChanged(new a(p0, mAddress));
             return;
          }
       }
       mAddress = "";
       goto label_002b ;
    }
}
