package com.kuaishou.merchant.home2.dynamic.MerchantMallFragment$d;
import androidx.lifecycle.Observer;
import com.kuaishou.merchant.home2.dynamic.MerchantMallFragment;
import java.lang.Object;
import com.google.gson.JsonElement;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.y;

public final class MerchantMallFragment$d implements Observer	// class@001711
{
    public final MerchantMallFragment b;

    public void MerchantMallFragment$d(MerchantMallFragment p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantMallFragment$d.class, "1")) {
       }else if(p0 != null){
          this.b.P.onNext(p0);
       }
       return;
    }
}
