package com.kuaishou.live.audience.component.vfc.LiveVfcPresenter;
import com.yxcorp.gifshow.music.utils.kottor.KPresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import nna.a;
import brd.t;
import com.kuaishou.live.audience.component.vfc.LiveVfcPresenter$onBind$1;
import p31.b;
import msd.l;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import fda.d;
import com.kuaishou.live.audience.component.vfc.LiveVfcPresenter$onBind$2;
import kotlin.jvm.internal.a;
import com.kuaishou.live.audience.component.vfc.LiveVfcPresenter$onBind$3;
import p31.a;
import vq5.b;
import vq5.d;
import p91.m;
import t02.a0;
import ks3.r;
import android.app.Activity;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import kq3.a;
import jq3.d;
import com.kuaishou.live.webview.context.LiveWebViewParam;
import com.kuaishou.live.webview.a;
import androidx.fragment.app.KwaiDialogFragment;

public final class LiveVfcPresenter extends KPresenterV2	// class@000bf2
{
    public final String q;
    public m r;
    public a0 s;
    public r t;
    public d u;
    public static String sLivePresenterClassName = "LiveVfcPresenter";

    public void LiveVfcPresenter(){
       super();
       this.q = "LiveVfcPresenter";
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, LiveVfcPresenter.class, "2")) {
          return;
       }
       RxBus f = RxBus.f;
       this.X7(f.f(a.class).subscribe(new b(new LiveVfcPresenter$onBind$1(this))));
       this.X7(f.f(d.class).subscribe(new b(new LiveVfcPresenter$onBind$2(this))));
       LiveVfcPresenter tu = this.u;
       if (tu == null) {
          a.S("mLiveRouterManager");
       }
       tu.t5("showvfcdialog", new a(new LiveVfcPresenter$onBind$3(this)));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LiveVfcPresenter.class, "1")) {
          return;
       }
       this.r = this.t8("LIVE_BASIC_CONTEXT");
       this.s = this.s8(a0.class);
       this.t = this.t8("LIVE_MERCHANT_AUDIENCE_BOTTOM_BAR_SERVICE");
       Object obj = this.r8("LIVE_ROUTER_SERVICE");
       a.o(obj, "inject\(LiveAccessIds.LIVE_ROUTER_SERVICE\)");
       this.u = obj;
       return;
    }
    public final void onGrowthHalfWebViewEvent(a p0){
       c childFragmen;
       LiveVfcPresenter liveVfcPrese = LiveVfcPresenter.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, liveVfcPrese, "3")) {
          return;
       }
       p0 = p0.a;
       if (!PatchProxy.applyVoidOneRefs(p0, this, liveVfcPrese, "5") && this.getActivity() != null) {
          liveVfcPrese = this.r;
          c uoc = null;
          if (liveVfcPrese != null) {
             BaseFragment uBaseFragmen = liveVfcPrese.b();
             if (uBaseFragmen != null) {
                childFragmen = uBaseFragmen.getChildFragmentManager();
             label_002d :
                if (childFragmen != null) {
                   Activity activity = this.getActivity();
                   a.m(activity);
                   LiveVfcPresenter tr = this.r;
                   if (tr != null) {
                      BaseFragment uBaseFragmen1 = tr.b();
                      if (uBaseFragmen1 != null) {
                         uoc = uBaseFragmen1.getChildFragmentManager();
                      }
                   }
                   a.m(uoc);
                   a uoa = a.c(activity, uoc);
                   uoa.g("growth-vfc-h5");
                   uoa.f("growth-vfc-h5");
                   uoa.b.setPortraitHeightPixel(d.a()).setLayoutType("0");
                   a.c().h(p0, uoa);
                }
             }
          }
          childFragmen = uoc;
          goto label_002d ;
       }
    label_006a :
       return;
    }
    public final void onGrowthShowShopEvent(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVfcPresenter.class, "4")) {
          return;
       }
       LiveVfcPresenter tt = this.t;
       if (tt != null) {
          tt.f();
       }
       return;
    }
}
