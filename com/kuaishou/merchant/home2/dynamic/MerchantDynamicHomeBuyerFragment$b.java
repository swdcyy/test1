package com.kuaishou.merchant.home2.dynamic.MerchantDynamicHomeBuyerFragment$b;
import androidx.lifecycle.Observer;
import com.kuaishou.merchant.home2.dynamic.MerchantDynamicHomeBuyerFragment;
import java.lang.Object;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentGlobalInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.y;

public final class MerchantDynamicHomeBuyerFragment$b implements Observer	// class@001707
{
    public final MerchantDynamicHomeBuyerFragment b;

    public void MerchantDynamicHomeBuyerFragment$b(MerchantDynamicHomeBuyerFragment p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantDynamicHomeBuyerFragment$b.class, "1")) {
       }else if(p0 != null){
          this.b.I.onNext(p0);
       }
       return;
    }
}
