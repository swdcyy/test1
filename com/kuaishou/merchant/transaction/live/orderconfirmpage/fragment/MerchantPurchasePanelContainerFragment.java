package com.kuaishou.merchant.transaction.live.orderconfirmpage.fragment.MerchantPurchasePanelContainerFragment;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.MerchantLivePurchasePanelContainerFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.fragment.BottomSheetFragment;
import com.yxcorp.gifshow.fragment.ContainerFragment;
import lnc.a1;
import android.content.Intent;
import com.kuaishou.merchant.basic.activity.plugin.MakeActivityHalfScreenPlugin;
import et3.a;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.MerchantLivePurchasePanelFragment;
import com.kuaishou.merchant.basic.fragment.MerchantBottomSheetFragment;
import com.kuaishou.merchant.transaction.live.orderconfirmpage.fragment.MerchantPurchasePanelFragment;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.MerchantLivePurchasePanelFragment$b;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.MerchantLivePurchasePanelResponse;
import com.kuaishou.merchant.basic.fragment.MerchantRecycleFragment;
import com.kuaishou.merchant.basic.fragment.f;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import xm4.a;
import android.widget.FrameLayout;
import ekd.m1;

public class MerchantPurchasePanelContainerFragment extends MerchantLivePurchasePanelContainerFragment	// class@0007df
{
    public static final int K;

    public void MerchantPurchasePanelContainerFragment(){
       super();
    }
    public void Mh(){
       if (PatchProxy.applyVoid(null, this, MerchantPurchasePanelContainerFragment.class, "4")) {
          return;
       }
       FragmentActivity activity = this.getActivity();
       if (activity == null) {
          return;
       }
       this.Gh(true);
       this.Ah(false);
       this.zh(false);
       if (n.I(activity)) {
          this.yh(a1.d(R.dimen.arg_RES_7f070898));
       }else {
          int i = MakeActivityHalfScreenPlugin.Vg(activity.getIntent());
          if (i <= 0) {
             i = (int)((float)n.l(activity) * a.a);
          }
          this.xh(i);
       }
       return;
    }
    public Fragment Nh(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       MerchantLivePurchasePanelContainerFragment obj = PatchProxy.apply(objArray, this, MerchantPurchasePanelContainerFragment.class, "3");
       if (obj != patchProxyRe) {
       }else {
          obj = this.G;
          MerchantLivePurchasePanelContainerFragment tF = this.F;
          MerchantBottomSheetFragment tz = this.z;
          int i = 1;
          if (PatchProxy.isSupport(MerchantPurchasePanelFragment.class)) {
             Object[] objArray1 = new Object[]{objArray,obj,this,tF,tz};
             Object obj1 = PatchProxy.apply(objArray1, objArray, MerchantPurchasePanelFragment.class, "1");
             if (obj1 != patchProxyRe) {
                obj = obj1;
             }
          }
          MerchantPurchasePanelFragment merchantPurc = new MerchantPurchasePanelFragment();
          merchantPurc.I = obj;
          merchantPurc.K = this;
          MerchantLivePurchasePanelFragment j = merchantPurc.J;
          j.k = false;
          j.x = tF;
          MerchantLivePurchasePanelResponse merchantLive = new MerchantLivePurchasePanelResponse();
          merchantLive.updateLogTag();
          merchantPurc.J.c = merchantLive;
          merchantPurc.G.i(tz);
          obj = merchantPurc;
       }
       return obj;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, MerchantPurchasePanelContainerFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       View view = a.d(p0, R.layout.arg_RES_7f0d04e8, p1, false);
       this.doBindView(view);
       this.E.setVisibility(8);
       this.Lh(m1.f(view, R.id.confirm_container));
       this.Mh();
       return view;
    }
}
