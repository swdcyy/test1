package com.kuaishou.merchant.home2.dynamic.MerchantDynamicHomeBuyerFragment$c;
import androidx.lifecycle.Observer;
import com.kuaishou.merchant.home2.dynamic.MerchantDynamicHomeBuyerFragment;
import java.lang.Object;
import com.google.gson.JsonElement;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.y;

public final class MerchantDynamicHomeBuyerFragment$c implements Observer	// class@001708
{
    public final MerchantDynamicHomeBuyerFragment b;

    public void MerchantDynamicHomeBuyerFragment$c(MerchantDynamicHomeBuyerFragment p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantDynamicHomeBuyerFragment$c.class, "1")) {
       }else if(p0 != null){
          this.b.G.onNext(p0);
       }
       return;
    }
}
