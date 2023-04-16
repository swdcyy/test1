package com.kuaishou.merchant.home2.dynamic.MerchantMallFragment$e;
import com.kwai.library.widget.refresh.RefreshLayout$h;
import com.kuaishou.merchant.home2.dynamic.MerchantMallFragment;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Boolean;
import java.lang.String;
import androidx.lifecycle.MutableLiveData;
import b04.d;
import o17.i;

public final class MerchantMallFragment$e implements RefreshLayout$h	// class@001713
{
    public final MerchantMallFragment a;

    public void MerchantMallFragment$e(MerchantMallFragment p0){
       this.a = p0;
       super();
    }
    public void a(float p0,float p1,boolean p2){
       if (PatchProxy.isSupport(MerchantMallFragment$e.class) && PatchProxy.applyVoidThreeRefs(Float.valueOf(p0), Float.valueOf(p1), Boolean.valueOf(p2), this, MerchantMallFragment$e.class, "1")) {
          return;
       }
       MerchantMallFragment v = this.a.v;
       if (v != null) {
          MutableLiveData mutableLiveD = v.C0();
          if (mutableLiveD != null) {
             mutableLiveD.setValue(Float.valueOf(p0));
          }
       }
       return;
    }
    public void b(){
       i.d(this);
    }
    public void pullToRefresh(){
       i.b(this);
    }
    public void refreshComplete(){
       i.c(this);
    }
    public void releaseToRefresh(){
       i.e(this);
    }
}
