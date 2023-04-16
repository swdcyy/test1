package com.kuaishou.merchant.live.marketing.sandeago.start.LiveAnchorStartSandeagoFragment;
import ml8.d;
import hka.a;
import com.kuaishou.merchant.basic.fragment.MerchantBaseFragment;
import com.kuaishou.merchant.live.marketing.sandeago.start.LiveAnchorStartSandeagoFragment$b;
import java.lang.String;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.live.marketing.sandeago.start.LiveAnchorStartSandeagoFragment$a;
import com.yxcorp.gifshow.widget.m;
import ekd.m1;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
import ot3.u0;
import com.kuaishou.merchant.live.marketing.sandeago.SandeagoPublish;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import r14.k;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import k2b.u1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.live.marketing.sandeago.start.presenter.m;
import com.kuaishou.merchant.live.marketing.sandeago.start.presenter.h;
import com.kuaishou.merchant.live.marketing.sandeago.start.presenter.r;
import com.kuaishou.merchant.live.marketing.sandeago.start.presenter.k;
import com.kuaishou.merchant.live.marketing.sandeago.start.presenter.n;
import com.kuaishou.merchant.live.marketing.sandeago.start.presenter.b;
import q64.p;
import com.kuaishou.merchant.live.marketing.sandeago.start.presenter.u;
import com.kuaishou.merchant.live.marketing.sandeago.start.presenter.q;
import com.kuaishou.merchant.live.marketing.sandeago.start.presenter.j;
import com.kuaishou.merchant.live.marketing.sandeago.start.presenter.t;
import java.util.List;
import java.util.ArrayList;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import p64.a;
import androidx.fragment.app.c$c;
import com.kuaishou.merchant.live.MerchantLiveLogBiz;
import p74.a;
import java.lang.Throwable;
import o74.a;
import android.os.Parcelable;
import org.parceler.b;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import xm4.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import com.yxcorp.utility.n;

public class LiveAnchorStartSandeagoFragment extends MerchantBaseFragment implements d, a	// class@001a5d
{
    public PresenterV2 m;
    public LiveAnchorStartSandeagoFragment$b n;
    public static final int o;

    public void LiveAnchorStartSandeagoFragment(){
       super();
       this.n = new LiveAnchorStartSandeagoFragment$b();
    }
    public String C1(){
       return "MERCHANT_START_SANDEAGO_PAGE";
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAnchorStartSandeagoFragment.class, "2")) {
          return;
       }
       m1.b(p0, new LiveAnchorStartSandeagoFragment$a(this), R.id.space);
       return;
    }
    public void fh(View p0,Bundle p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveAnchorStartSandeagoFragment.class, "5")) {
          return;
       }
       this.doBindView(p0);
       p1.o = u0.b();
       LiveAnchorStartSandeagoFragment tn = this.n;
       boolean b = true;
       boolean b1 = (tn.e.mPointerUser != null)? true: false;
       if (tn.b.getLiveType() != 3) {
          b = false;
       }
       k ok = k.class;
       if (!PatchProxy.isSupport(ok) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(b1), Boolean.valueOf(b), null, ok, "4")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "LIGHTING_PURCHASING";
          i3 oi3 = i3.f();
          oi3.c("is_directional", Integer.valueOf(b1));
          oi3.c("release_parttern", Integer.valueOf(b));
          uElementPack.params = oi3.e();
          u1.B0(new ShowMetaData().setElementPackage(uElementPack));
       }
       String str = "6";
       PresenterV2 presenterV2 = PatchProxy.applyWithListener(null, this, LiveAnchorStartSandeagoFragment.class, str);
       if (presenterV2 != patchProxyRe) {
       }else {
          presenterV2 = new PresenterV2();
          presenterV2.U7(new m());
          presenterV2.U7(new h());
          presenterV2.U7(new r());
          presenterV2.U7(new k());
          presenterV2.U7(new n());
          presenterV2.U7(new b());
          presenterV2.U7(new p());
          presenterV2.U7(new u());
          presenterV2.U7(new q());
          presenterV2.U7(new j());
          presenterV2.U7(new t());
          PatchProxy.onMethodExit(LiveAnchorStartSandeagoFragment.class, str);
       }
       this.m = presenterV2;
       presenterV2.f(p0);
       LiveAnchorStartSandeagoFragment tm = this.m;
       ArrayList uArrayList = PatchProxy.apply(null, this, LiveAnchorStartSandeagoFragment.class, "7");
       if (uArrayList != patchProxyRe) {
       }else {
          uArrayList = new ArrayList();
          uArrayList.add(this.n);
       }
       tm.i(uArrayList.toArray());
       this.getChildFragmentManager().addOnBackStackChangedListener(new a(this));
       return;
    }
    public boolean onBackPressed(){
       Object obj = PatchProxy.apply(null, this, LiveAnchorStartSandeagoFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!this.isAdded()) {
          return false;
       }
       if (this.getFragmentManager() != null) {
          return this.getFragmentManager().popBackStackImmediate("LiveAnchorStartSandeaBizFragment", 1);
       }
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAnchorStartSandeagoFragment.class, "3")) {
          return;
       }
       super.onCreate(p0);
       p0.b = b.a(this.getArguments().getParcelable("KEY_LIVE_BASE_CONTEXT"));
       p0.g = this;
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveAnchorStartSandeagoFragment.class, "4");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.d(p0, 0x7f0d04dc, p1, false);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LiveAnchorStartSandeagoFragment.class, "8")) {
          return;
       }
       super.onDestroyView();
       this.m.destroy();
       n.C(this.getActivity());
       return;
    }
}
