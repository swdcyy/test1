package com.kuaishou.merchant.bowl.krn.MerchantKrnContainerView;
import com.kwai.kds.krn.api.page.KwaiRnContainerView;
import android.content.Context;
import android.util.AttributeSet;
import com.kuaishou.merchant.bowl.krn.a;
import ps6.e;
import android.app.Activity;
import com.kuaishou.krn.model.LaunchModel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.LifecycleOwner;
import zj0.x;

public class MerchantKrnContainerView extends KwaiRnContainerView	// class@00160a
{
    public a t;

    public void MerchantKrnContainerView(Context p0){
       super(p0, null);
    }
    public void MerchantKrnContainerView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void MerchantKrnContainerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       a uoa = new a();
       this.t = uoa;
       super.setKrnLoadErrorListener(uoa);
    }
    public void c(Activity p0,LaunchModel p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MerchantKrnContainerView.class, "2")) {
          return;
       }
       this.t.a(p1);
       super.c(p0, p1);
       return;
    }
    public void e(Activity p0,LifecycleOwner p1,LaunchModel p2,x p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, MerchantKrnContainerView.class, "4")) {
          return;
       }
       this.t.a(p2);
       super.e(p0, p1, p2, p3);
       return;
    }
    public void g(Activity p0,LifecycleOwner p1,LaunchModel p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, MerchantKrnContainerView.class, "3")) {
          return;
       }
       this.t.a(p2);
       super.g(p0, p1, p2);
       return;
    }
    public boolean i(){
       return true;
    }
    public void setKrnLoadErrorListener(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantKrnContainerView.class, "1")) {
          return;
       }
       this.t.a = p0;
       return;
    }
}
