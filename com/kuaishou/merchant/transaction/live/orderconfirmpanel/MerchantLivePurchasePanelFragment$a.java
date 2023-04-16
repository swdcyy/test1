package com.kuaishou.merchant.transaction.live.orderconfirmpanel.MerchantLivePurchasePanelFragment$a;
import qk4.e;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.MerchantLivePurchasePanelFragment;
import java.lang.Object;
import qk4.d;
import qk4.a;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.MerchantLivePurchasePanelFragment$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import kc4.c$a;
import java.lang.Boolean;

public class MerchantLivePurchasePanelFragment$a implements e	// class@0007e3
{
    public final MerchantLivePurchasePanelFragment a;

    public void MerchantLivePurchasePanelFragment$a(MerchantLivePurchasePanelFragment p0){
       this.a = p0;
       super();
    }
    public void a(d p0){
       this.a.L = p0;
    }
    public void b(a p0){
       this.a.J.o = p0;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, MerchantLivePurchasePanelFragment$a.class, "2")) {
          return;
       }
       MerchantLivePurchasePanelFragment$a ta = this.a;
       MerchantLivePurchasePanelFragment j = ta.J;
       j.k = false;
       j.l = false;
       ta.q().a();
       return;
    }
    public void d(c$a p0){
       this.a.N = p0;
    }
    public void e(boolean p0){
       MerchantLivePurchasePanelFragment$a uoa = MerchantLivePurchasePanelFragment$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "1")) {
          return;
       }
       uoa = this.a;
       MerchantLivePurchasePanelFragment j = uoa.J;
       j.l = p0;
       j.k = true;
       uoa.q().a();
       return;
    }
}
