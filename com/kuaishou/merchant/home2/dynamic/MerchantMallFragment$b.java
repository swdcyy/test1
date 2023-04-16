package com.kuaishou.merchant.home2.dynamic.MerchantMallFragment$b;
import androidx.lifecycle.Observer;
import com.kuaishou.merchant.home2.dynamic.MerchantMallFragment;
import java.lang.Object;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentGlobalInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.y;

public final class MerchantMallFragment$b implements Observer	// class@00170f
{
    public final MerchantMallFragment b;

    public void MerchantMallFragment$b(MerchantMallFragment p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantMallFragment$b.class, "1")) {
       }else if(p0 != null){
          this.b.R.onNext(p0);
       }
       return;
    }
}
