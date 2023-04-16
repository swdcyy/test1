package com.kuaishou.merchant.basic.fragment.MerchantRecycleFragment$a;
import ekd.f$i;
import com.kuaishou.merchant.basic.fragment.MerchantRecycleFragment;
import android.view.animation.Animation;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;

public class MerchantRecycleFragment$a extends f$i	// class@0015b9
{
    public final MerchantRecycleFragment b;

    public void MerchantRecycleFragment$a(MerchantRecycleFragment p0){
       this.b = p0;
       super();
    }
    public void onAnimationEnd(Animation p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantRecycleFragment$a.class, "2")) {
          return;
       }
       this.b.Ih(p0);
       return;
    }
    public void onAnimationStart(Animation p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantRecycleFragment$a.class, "1")) {
          return;
       }
       Objects.requireNonNull(this.b);
       return;
    }
}
