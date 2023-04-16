package com.kuaishou.merchant.home2.dynamic.microdetail.MerchantMicroDetailFragment$b;
import erd.g;
import com.kuaishou.merchant.home2.dynamic.microdetail.MerchantMicroDetailFragment;
import com.kuaishou.merchant.home2.main.widget.MerchantMallRootView;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import rw3.b;
import a04.b;

public final class MerchantMicroDetailFragment$b implements g	// class@00175c
{
    public final MerchantMicroDetailFragment b;
    public final MerchantMallRootView c;

    public void MerchantMicroDetailFragment$b(MerchantMicroDetailFragment p0,MerchantMallRootView p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantMicroDetailFragment$b.class, "1")) {
       }else {
          p0 = this.b.n;
          if (p0 != null) {
             p0.onEvent(14);
             if (p0.r0() || p0.q0()) {
                this.c.setDispatchDrawSubjectEnabled(false);
                b.d.a(p0.p0());
             }
          }
       }
       return;
    }
}
