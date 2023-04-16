package com.kuaishou.merchant.home2.dynamic.MerchantDynamicHomeBuyerFragment$d;
import com.kwai.library.widget.refresh.RefreshLayout$h;
import com.kuaishou.merchant.home2.dynamic.MerchantDynamicHomeBuyerFragment;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Boolean;
import java.lang.String;
import androidx.lifecycle.MutableLiveData;
import b04.d;
import o17.i;

public final class MerchantDynamicHomeBuyerFragment$d implements RefreshLayout$h	// class@001709
{
    public final MerchantDynamicHomeBuyerFragment a;

    public void MerchantDynamicHomeBuyerFragment$d(MerchantDynamicHomeBuyerFragment p0){
       this.a = p0;
       super();
    }
    public void a(float p0,float p1,boolean p2){
       if (PatchProxy.isSupport(MerchantDynamicHomeBuyerFragment$d.class) && PatchProxy.applyVoidThreeRefs(Float.valueOf(p0), Float.valueOf(p1), Boolean.valueOf(p2), this, MerchantDynamicHomeBuyerFragment$d.class, "1")) {
          return;
       }
       MerchantDynamicHomeBuyerFragment t = this.a.t;
       if (t != null) {
          MutableLiveData mutableLiveD = t.C0();
          if (mutableLiveD != null) {
             mutableLiveD.setValue(Float.valueOf(p0));
          }
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, MerchantDynamicHomeBuyerFragment$d.class, "2")) {
          return;
       }
       MerchantDynamicHomeBuyerFragment t = this.a.t;
       if (t != null) {
          t.T0(false);
       }
       t = this.a.t;
       if (t != null) {
          t.R0(false);
       }
       return;
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
