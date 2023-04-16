package com.yxcorp.gifshow.detail.common.negative.operation.item.OperationSaveTraffic;
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
import java.util.Objects;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.detail.common.negative.operation.item.OperationSaveTraffic$mSaveTrafficViewModel$2;
import msd.a;
import qrd.p;
import qrd.s;
import ez9.c;
import com.yxcorp.gifshow.detail.common.negative.operation.item.OperationSaveTraffic$1;
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
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils;
import l3a.b;
import uw9.c;
import zz9.c;
import ez9.b;
import kotlin.Pair;
import qrd.r0;
import java.util.HashMap;
import trd.t0;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class OperationSaveTraffic extends w0	// class@001482
{
    public final BaseFragment C;
    public final QPhoto D;
    public final u E;
    public final FragmentActivity F;
    public final p G;
    public final c H;
    public final m0 I;
    public final SlidePageConfig J;

    public void OperationSaveTraffic(m0 p0,SlidePageConfig p1){
       a a;
       a.p(p0, "callerContext");
       a.p(p1, "pageConfig");
       super("save_traffic");
       this.I = p0;
       this.J = p1;
       this.C = p0.b;
       PhotoDetailParam mPhoto = p0.c.mPhoto;
       this.D = mPhoto;
       a.o(mPhoto, "mPhoto");
       u ou = new u(PlayerPanelConfigHelper.a(), mPhoto);
       this.E = ou;
       a = p0.a;
       Objects.requireNonNull(a, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
       this.F = a;
       this.G = s.c(new OperationSaveTraffic$mSaveTrafficViewModel$2(this));
       this.H = new c(ou, p1);
       this.T(R.string.arg_RES_7f100f24);
       this.L(R.drawable.arg_RES_7f080b0a);
       this.R(true);
       this.Q(OperationSaveTraffic$1.INSTANCE);
    }
    public boolean E(){
       boolean b;
       Object obj = PatchProxy.apply(null, this, OperationSaveTraffic.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (f.j()) {
          OperationSaveTraffic tD = this.D;
          a.o(tD, "mPhoto");
          if (d.a.a(tD, this.I) && (this.J.T() && this.E.i())) {
             b = true;
          label_003e :
             return b;
          }
       }
       b = false;
       goto label_003e ;
    }
    public final void W(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OperationSaveTraffic.class, "5")) {
          return;
       }
       i.g(R.style.arg_RES_7f11066a, p0, true, true);
       return;
    }
    public void d(w0 p0,g p1){
       boolean b;
       String str;
       OperationSaveTraffic operationSav = OperationSaveTraffic.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, operationSav, "3")) {
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
                str = a1.p(R.string.arg_RES_7f100f26);
                a.o(str, "CommonUtil.string\(R.stri¡­back_panel_datasave_open\)");
                this.W(str);
             }else {
                str = a1.p(R.string.arg_RES_7f100f25);
                a.o(str, "CommonUtil.string\(R.stri¡­ack_panel_datasave_close\)");
                this.W(str);
             }
             if (NasaExperimentUtils.B()) {
                b.a = b ^ 0x01;
             }else {
                c.B((b ^ 0x01));
             }
             c uoc = PatchProxy.apply(null, this, operationSav, "1");
             if (uoc == PatchProxyResult.class) {
                uoc = this.G.getValue();
             }
             uoc.I((b ^ 0x01));
             OperationSaveTraffic tD = this.D;
             a.o(tD, "mPhoto");
             OperationSaveTraffic tC = this.C;
             a.o(tC, "mFragment");
             Pair[] pairArray = new Pair[]{r0.a("video_saveflow_icon_button", this.H.d((b ^ 1)))};
             b.a.c(tD, tC, t0.M(pairArray));
             return;
          }
       }
       b = false;
       goto label_002a ;
    }
    public void onShow(){
       if (PatchProxy.applyVoid(null, this, OperationSaveTraffic.class, "4")) {
          return;
       }
       OperationSaveTraffic tD = this.D;
       a.o(tD, "mPhoto");
       OperationSaveTraffic tC = this.C;
       a.o(tC, "mFragment");
       this.H.c(tD, tC, this.H.b());
       return;
    }
}
