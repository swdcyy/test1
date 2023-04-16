package com.yxcorp.gifshow.v3.customizer.viewbinder.AbsVideoFragmentV3ViewBinder;
import com.yxcorp.gifshow.v3.customizer.viewbinder.BaseEditPreviewFragmentViewBinder;
import c35.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import h69.j;
import com.yxcorp.gifshow.v3.customizer.viewbinder.AbsVideoFragmentV3ViewBinder$a;
import com.kwai.video.editorsdk2.PreviewEventListenerV2;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import uoc.o;
import nwc.m;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import faa.a;
import q87.c;
import android.graphics.drawable.Drawable;
import lnc.a1;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import roc.e;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.customizer.preview.BaseEditorPreviewContainerLayout;
import com.yxcorp.gifshow.widget.PassThroughEventView;
import com.yxcorp.gifshow.v3.customizer.viewbinder.DefaultVideoFragmentV4ViewBinder;
import sm6.b;
import uoc.q;
import android.app.Activity;
import com.yxcorp.gifshow.widget.FlexScreenStatusData;
import lwc.h;
import com.yxcorp.gifshow.widget.adv.SDKPlayerBlackView;
import uoc.p;
import com.yxcorp.gifshow.v3.widget.EditorContainer;
import com.yxcorp.gifshow.v3.widget.EditPreviewPlayControlView;
import android.widget.FrameLayout;
import com.kuaishou.viewbinder.BaseViewBinder;
import z6b.a;
import android.widget.RelativeLayout;
import android.widget.ProgressBar;

public abstract class AbsVideoFragmentV3ViewBinder extends BaseEditPreviewFragmentViewBinder	// class@000d5f
{
    public View A;
    public EditPreviewPlayControlView B;
    public FrameLayout C;
    public RelativeLayout D;
    public o E;
    public o F;
    public a G;
    public e p;
    public d q;
    public BaseEditorPreviewContainerLayout r;
    public VideoSDKPlayerView s;
    public PassThroughEventView t;
    public View u;
    public SDKPlayerBlackView v;
    public ProgressBar w;
    public EditorContainer x;
    public View y;
    public View z;

    public void AbsVideoFragmentV3ViewBinder(c p0){
       a.p(p0, "viewHost");
       super(p0);
    }
    public void Q(){
       if (PatchProxy.applyVoid(null, this, AbsVideoFragmentV3ViewBinder.class, "13")) {
          return;
       }
       if (!j.j(this.N())) {
          return;
       }
       AbsVideoFragmentV3ViewBinder ts = this.s;
       if (ts == null) {
          a.S("playerView");
       }
       ts.setPreviewEventListener("AbsVideoFragmentV3ViewB", new AbsVideoFragmentV3ViewBinder$a(this));
       return;
    }
    public void R(){
       if (PatchProxy.applyVoid(null, this, AbsVideoFragmentV3ViewBinder.class, "16")) {
          return;
       }
       this.i0().d();
       return;
    }
    public void S(){
       if (PatchProxy.applyVoid(null, this, AbsVideoFragmentV3ViewBinder.class, "17")) {
          return;
       }
       this.i0().b();
       return;
    }
    public void T(m p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AbsVideoFragmentV3ViewBinder.class, "18")) {
          return;
       }
       a.p(p0, "previewTransformParam");
       this.i0().c(p0);
       return;
    }
    public void d0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AbsVideoFragmentV3ViewBinder.class, "20")) {
          return;
       }
       if (!PostExperimentUtils.b1()) {
          return;
       }
       Object[] objArray1 = new Object[0];
       a.D().w("AbsVideoFragmentV3ViewB", "adjustPreviewShadow: ", objArray1);
       AbsVideoFragmentV3ViewBinder tz = this.z;
       if (tz != null) {
          tz.setBackground(a1.f(R.drawable.arg_RES_7f0808fa));
       }
       tz = this.A;
       if (tz != null) {
          objArray = tz.getLayoutParams();
       }
       if (objArray != null) {
          objArray.height = a1.d(0x7f0702ae);
       }
       tz = this.A;
       if (tz != null) {
          tz.setLayoutParams(objArray);
       }
       tz = this.A;
       if (tz != null) {
          tz.setBackground(a1.f(R.drawable.arg_RES_7f080825));
       }
       return;
    }
    public final e e0(){
       AbsVideoFragmentV3ViewBinder obj = PatchProxy.apply(null, this, AbsVideoFragmentV3ViewBinder.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.p;
       if (obj == null) {
          a.S("iEditItemCustomizer");
       }
       return obj;
    }
    public final VideoSDKPlayerView f0(){
       AbsVideoFragmentV3ViewBinder obj = PatchProxy.apply(null, this, AbsVideoFragmentV3ViewBinder.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.s;
       if (obj == null) {
          a.S("playerView");
       }
       return obj;
    }
    public final BaseEditorPreviewContainerLayout g0(){
       AbsVideoFragmentV3ViewBinder obj = PatchProxy.apply(null, this, AbsVideoFragmentV3ViewBinder.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.r;
       if (obj == null) {
          a.S("preview");
       }
       return obj;
    }
    public final PassThroughEventView h0(){
       AbsVideoFragmentV3ViewBinder obj = PatchProxy.apply(null, this, AbsVideoFragmentV3ViewBinder.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.t;
       if (obj == null) {
          a.S("touchView");
       }
       return obj;
    }
    public final o i0(){
       AbsVideoFragmentV3ViewBinder obj = PatchProxy.apply(null, this, AbsVideoFragmentV3ViewBinder.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = "preview";
       if (this instanceof DefaultVideoFragmentV4ViewBinder && b.d()) {
          if (this.F == null) {
             Activity uActivity = this.z();
             FlexScreenStatusData uFlexScreenS = this.B();
             h oh = this.D();
             AbsVideoFragmentV3ViewBinder tr = this.r;
             if (tr == null) {
                a.S(str);
             }
             AbsVideoFragmentV3ViewBinder ts = this.s;
             if (ts == null) {
                a.S("playerView");
             }
             AbsVideoFragmentV3ViewBinder tv = this.v;
             if (tv == null) {
                a.S("mSDKPlayerBlackView");
             }
             q oq = new q(uActivity, uFlexScreenS, oh, tr, ts, tv);
             this.F = obj;
          }
          obj = this.F;
          a.m(obj);
       }else if(this.E == null){
          Activity uActivity1 = this.z();
          FlexScreenStatusData uFlexScreenS1 = this.B();
          h oh1 = this.D();
          AbsVideoFragmentV3ViewBinder tr1 = this.r;
          if (tr1 == null) {
             a.S(str);
          }
          this.E = new p(uActivity1, uFlexScreenS1, oh1, tr1);
       }
       obj = this.E;
       a.m(obj);
       return obj;
    }
    public final void j0(View p0){
       this.A = p0;
    }
    public final void k0(EditorContainer p0){
       this.x = p0;
    }
    public final void l0(EditPreviewPlayControlView p0){
       this.B = p0;
    }
    public final void m0(View p0){
       this.z = p0;
    }
    public final void n0(FrameLayout p0){
       this.C = p0;
    }
    public final void o0(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AbsVideoFragmentV3ViewBinder.class, "10")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.u = p0;
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, AbsVideoFragmentV3ViewBinder.class, "14")) {
          return;
       }
       super.onDestroy();
       AbsVideoFragmentV3ViewBinder tG = this.G;
       if (tG != null) {
          tG.a();
       }
       this.G = null;
       tG = this.s;
       if (tG == null) {
          a.S("playerView");
       }
       tG.setPreviewEventListener("AbsVideoFragmentV3ViewB", null);
       return;
    }
    public final void p0(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AbsVideoFragmentV3ViewBinder.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.p = p0;
       return;
    }
    public final void q0(RelativeLayout p0){
       this.D = p0;
    }
    public final void r0(View p0){
       this.y = p0;
    }
    public final void s0(VideoSDKPlayerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AbsVideoFragmentV3ViewBinder.class, "6")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.s = p0;
       return;
    }
    public final void t0(BaseEditorPreviewContainerLayout p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AbsVideoFragmentV3ViewBinder.class, "4")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.r = p0;
       return;
    }
    public final void u0(ProgressBar p0){
       this.w = p0;
    }
    public final void v0(PassThroughEventView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AbsVideoFragmentV3ViewBinder.class, "8")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.t = p0;
       return;
    }
}
