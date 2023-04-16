package com.yxcorp.gifshow.detail.common.negative.operation.item.OperationSmallWindow;
import mf5.w0;
import v6a.m0;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import le5.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import sz9.u;
import com.yxcorp.gifshow.detail.player.panel.config.SlidePlayerPanelConfig;
import com.yxcorp.gifshow.detail.player.panel.config.PlayerPanelConfigHelper;
import com.yxcorp.gifshow.entity.QPhoto;
import ez9.c;
import com.yxcorp.gifshow.detail.common.negative.operation.item.OperationSmallWindow$1;
import msd.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import le5.f;
import ez9.d;
import java.lang.CharSequence;
import e17.i;
import kf5.g;
import lnc.a1;
import i3a.b;
import ez9.b;
import kotlin.Pair;
import qrd.r0;
import java.util.HashMap;
import trd.t0;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class OperationSmallWindow extends w0	// class@001484
{
    public final BaseFragment C;
    public final QPhoto D;
    public final u E;
    public final c F;
    public final m0 G;
    public final SlidePageConfig H;

    public void OperationSmallWindow(m0 p0,SlidePageConfig p1){
       a.p(p0, "callerContext");
       a.p(p1, "pageConfig");
       super("small_window");
       this.G = p0;
       this.H = p1;
       this.C = p0.b;
       PhotoDetailParam mPhoto = p0.c.mPhoto;
       this.D = mPhoto;
       a.o(mPhoto, "mPhoto");
       u ou = new u(PlayerPanelConfigHelper.a(), mPhoto);
       this.E = ou;
       this.F = new c(ou, p1);
       this.T(R.string.arg_RES_7f100f2a);
       this.L(R.drawable.arg_RES_7f080b21);
       this.R(true);
       this.Q(OperationSmallWindow$1.INSTANCE);
    }
    public boolean E(){
       boolean b;
       Object obj = PatchProxy.apply(null, this, OperationSmallWindow.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (f.j()) {
          OperationSmallWindow tD = this.D;
          a.o(tD, "mPhoto");
          if (d.a.a(tD, this.G) && (this.H.V() && this.E.j())) {
             b = true;
          label_003e :
             return b;
          }
       }
       b = false;
       goto label_003e ;
    }
    public final void W(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OperationSmallWindow.class, "4")) {
          return;
       }
       i.g(R.style.arg_RES_7f11066a, p0, true, true);
       return;
    }
    public void d(w0 p0,g p1){
       boolean b;
       String str;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, OperationSmallWindow.class, "2")) {
          return;
       }
       a.p(p0, "item");
       a.p(p1, "panel");
       a uoa = this.t();
       if (uoa != null) {
          Boolean uBoolean = uoa.invoke();
          if (uBoolean != null) {
             b = uBoolean.booleanValue();
          label_002a :
             if (!b) {
                str = a1.p(R.string.arg_RES_7f100f2c);
                a.o(str, "CommonUtil.string\(R.stri¡­k_panel_smallwindow_open\)");
                this.W(str);
             }else {
                str = a1.p(R.string.arg_RES_7f100f2b);
                a.o(str, "CommonUtil.string\(R.stri¡­_panel_smallwindow_close\)");
                this.W(str);
             }
             b.n((b ^ 0x01));
             OperationSmallWindow tD = this.D;
             a.o(tD, "mPhoto");
             OperationSmallWindow tC = this.C;
             a.o(tC, "mFragment");
             Pair[] pairArray = new Pair[]{r0.a("small_window_play", this.F.d((b ^ 1)))};
             b.a.c(tD, tC, t0.M(pairArray));
             return;
          }
       }
       b = false;
       goto label_002a ;
    }
    public void onShow(){
       if (PatchProxy.applyVoid(null, this, OperationSmallWindow.class, "3")) {
          return;
       }
       OperationSmallWindow tD = this.D;
       a.o(tD, "mPhoto");
       OperationSmallWindow tC = this.C;
       a.o(tC, "mFragment");
       this.F.c(tD, tC, this.F.b());
       return;
    }
}
