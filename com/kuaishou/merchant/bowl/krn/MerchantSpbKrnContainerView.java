package com.kuaishou.merchant.bowl.krn.MerchantSpbKrnContainerView;
import com.kuaishou.merchant.bowl.krn.MerchantKrnContainerView;
import android.content.Context;
import android.util.AttributeSet;
import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import com.kuaishou.krn.model.LaunchModel;
import zj0.x;
import uu4.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.String;
import st3.d;
import ps6.e;
import com.kuaishou.merchant.bowl.krn.MerchantSpbKrnContainerView$a;
import ik0.b;
import com.kwai.kds.krn.api.page.KwaiRnContainerView;
import android.view.ViewGroup;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Map;
import hu4.m;
import bv4.b;
import mv.d;
import ik0.j;

public class MerchantSpbKrnContainerView extends MerchantKrnContainerView	// class@00160d
{
    public Map u;
    public String v;
    public static final int w;

    public void MerchantSpbKrnContainerView(Context p0){
       super(p0);
       this.k();
    }
    public void MerchantSpbKrnContainerView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.k();
    }
    public void MerchantSpbKrnContainerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.k();
    }
    public void j(Activity p0,LifecycleOwner p1,LaunchModel p2,x p3,b p4){
       if (PatchProxy.isSupport(MerchantSpbKrnContainerView.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, MerchantSpbKrnContainerView.class, "2")) {
             return;
          }
       }
       this.setKrnLoadErrorListener(new d(p4));
       super.e(p0, p1, p2, p3);
       return;
    }
    public final void k(){
       if (PatchProxy.applyVoid(null, this, MerchantSpbKrnContainerView.class, "1")) {
          return;
       }
       this.setCustomStateView(new MerchantSpbKrnContainerView$a(this));
       return;
    }
    public void onAttachedToWindow(){
       Map map;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MerchantSpbKrnContainerView.class, "3")) {
          return;
       }
       super.onAttachedToWindow();
       if (TextUtils.isEmpty(this.v)) {
          return;
       }
       m om = b.a(this.v, this.u);
       MerchantSpbKrnContainerView tu = this.u;
       if (tu != null) {
          String str = "pendantId";
          String str1 = "materialId";
          if (tu.containsKey(str) || this.u.containsKey(str1)) {
             String str2 = this.u.get(str);
             try{
                str = this.u.get(str1).toString();
             }catch(java.lang.Exception e0){
                str = "";
             }
             MerchantSpbKrnContainerView tv = this.v;
             m a = e0.a;
             om = e0.b;
             d uod = d.class;
             if (PatchProxy.isSupport(uod)) {
                Object[] objArray1 = new Object[]{str2,str,tv,a,om};
                if (!PatchProxy.applyVoid(objArray1, objArray, uod, "12")) {
                }
             }else {
             }
          }
       }
       return;
    }
    public void setKrnTopBarController(j p0){
    }
}
