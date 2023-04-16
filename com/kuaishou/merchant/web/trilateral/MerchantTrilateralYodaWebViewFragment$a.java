package com.kuaishou.merchant.web.trilateral.MerchantTrilateralYodaWebViewFragment$a;
import com.yxcorp.gifshow.webview.yoda.view.c;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import cn4.a;
import java.lang.ref.WeakReference;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import tkd.b;
import tkd.d;
import vs3.a;
import u07.t$a;
import u07.f;
import cn4.h;
import u07.u;
import cn4.g;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.robust.PatchProxyResult;

public class MerchantTrilateralYodaWebViewFragment$a extends c	// class@0009dd
{
    public WeakReference l;
    public a m;

    public void MerchantTrilateralYodaWebViewFragment$a(KwaiYodaWebViewFragment p0,a p1){
       super(p0);
       this.l = new WeakReference(p0.getActivity());
       this.m = p1;
    }
    public static void l(MerchantTrilateralYodaWebViewFragment$a p0,t p1,View p2){
       super.loadUrl();
    }
    public void loadUrl(){
       if (PatchProxy.applyVoid(null, this, MerchantTrilateralYodaWebViewFragment$a.class, "1")) {
          return;
       }
       Activity uActivity = this.m();
       if (uActivity != null && !uActivity.isFinishing()) {
          if (this.m.d(this.h()) && this.m.b(this.h())) {
             d.a(0x7074b578).a30(uActivity, this.h());
             return;
          }else if(!this.m.c(this.h())){
             t$a uoa = f.e(new t$a(uActivity));
             uoa.W0(R.string.arg_RES_7f103489);
             uoa.y0(R.string.arg_RES_7f103486);
             uoa.S0(R.string.arg_RES_7f103488);
             uoa.Q0(R.string.arg_RES_7f103487);
             uoa.u0(new h(this));
             uoa.t0(new g(this));
             uoa.Y(PopupInterface.a);
          }else {
             super.loadUrl();
          }
       }
       return;
    }
    public final Activity m(){
       Object[] objArray = null;
       MerchantTrilateralYodaWebViewFragment$a obj = PatchProxy.apply(objArray, this, MerchantTrilateralYodaWebViewFragment$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.l;
       if (obj != null && obj.get() != null) {
          objArray = this.l.get();
       }
       return objArray;
    }
}
