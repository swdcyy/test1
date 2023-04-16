package nmd.l0;
import com.yxcorp.gifshow.v3.previewer.listener.VideoFrameChangeListener;
import nmd.v;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import smd.d;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nmd.l0$b;
import nmd.l0$a;
import mmd.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.HashMap;
import cmd.b;
import java.util.List;
import java.lang.Iterable;
import java.lang.CharSequence;
import msd.l;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.lang.Integer;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import java.util.Map;
import java.lang.Float;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import android.graphics.Rect;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import java.util.Objects;
import com.yxcorp.gifshow.v3.previewer.VideoEditPreviewV3Fragment;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import java.lang.Number;
import lwc.h;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.c$a;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView$b;
import mmd.b;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import java.lang.Boolean;
import mod.a;
import xld.a;
import com.yxcorp.gifshow.v3.previewer.listener.VideoFrameChangeListener$CHANGE_TYPE;
import nwc.n;
import nmd.j0;
import java.lang.Runnable;
import android.widget.AbsoluteLayout;
import aw9.c0;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import android.widget.TextView;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.element.NewEditStickerBaseDrawer;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import nmd.k0;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import android.graphics.Point;
import oa0.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import android.view.ViewParent;
import cmd.a;
import nsd.u;
import com.yxcorp.gifshow.v3.EditorItemFunc;
import voc.o;
import bvc.b;

public final class l0 extends v implements VideoFrameChangeListener	// class@001e64
{
    public final l0$b J;
    public final l0$a K;
    public final EditorDelegate L;

    public void l0(View p0,Fragment p1,EditorDelegate p2,d p3){
       a.p(p0, "rootView");
       a.p(p1, "previewFragment");
       a.p(p2, "editorDelegate");
       a.p(p3, "viewModel");
       super(p0, p1, p2, p3);
       this.L = p2;
       this.J = new l0$b(this, p3);
       this.K = new l0$a(this, p3);
    }
    public a F(){
       List obj = PatchProxy.apply(null, this, l0.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       HashMap hashMap = new HashMap();
       HashMap hashMap1 = new HashMap();
       obj = this.q0().a();
       List list = obj;
       hashMap.put(Integer.valueOf((CollectionsKt___CollectionsKt.V2(list, "", null, null, 0, null, null, 62, null)).hashCode()), this.N(obj));
       hashMap1.put(Integer.valueOf((CollectionsKt___CollectionsKt.V2(list, "", null, null, 0, null, null, 62, null)).hashCode()), Float.valueOf(this.L(obj)));
       Fragment uFragment = this.W();
       Objects.requireNonNull(uFragment, "null cannot be cast to non-null type com.yxcorp.gifshow.v3.previewer.VideoEditPreviewV3Fragment");
       VideoSDKPlayerView videoSDKPlay = uFragment.Rh();
       a uoa = new a(this.g0(), this.P().getEditorRect().width(), hashMap, hashMap1, videoSDKPlay);
       return obj;
    }
    public float L(List p0){
       p0 = PatchProxy.applyOneRefs(p0, this, l0.class, "8");
       if (p0 != PatchProxyResult.class) {
          return p0.floatValue();
       }
       return this.X().p0(0);
    }
    public int M(List p0){
       return 0;
    }
    public Size N(List p0){
       p0 = PatchProxy.applyOneRefs(p0, this, l0.class, "7");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return this.X().C0(0);
    }
    public c$a V(){
       return this.K;
    }
    public EditDecorationContainerView$b Z(){
       return this.J;
    }
    public b a0(){
       Object obj = PatchProxy.apply(null, this, l0.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b0().o0();
    }
    public boolean e0(){
       Object obj = PatchProxy.apply(null, this, l0.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.b0().u0().y().f() && (this.b0().o0().y().f() || (!this.b0().o0().y().f() && this.b0().o0().s())))? true: false;
       return b;
    }
    public boolean f0(){
       Object obj = PatchProxy.apply(null, this, l0.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (super.f0() || this.b0().o0().s())? true: false;
       return b;
    }
    public void l(VideoFrameChangeListener$CHANGE_TYPE p0){
       n.b(this, p0);
    }
    public void l0(b p0,b p1){
       l0 ol0 = l0.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ol0, "1")) {
          return;
       }
       a.p(p0, "newState");
       a.p(p1, "lastState");
       super.l0(p0, p1);
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, this, ol0, "2")) {
          EditDecorationContainerViewV2 uEditDecorat2 = (!p0.s() && p1.s())? 1: null;
          if (uEditDecorat2) {
             this.P().post(new j0(this));
             this.P().setMEnableHideDecorationView(true);
             this.L.O().w(true);
             this.P().setAllowedInterceptChange(true);
             this.P().O0(0, true);
             this.i0();
          }
          boolean b = (p0.s() && !p1.s())? true: false;
          boolean b1 = (p0.B() && !p1.B())? true: false;
          Object[] objArray1 = new Object[0];
          a.D().w("StickerVideoPreviewViewBinder", "handleSubPageState: isEnterTimeline = "+b+", isEnterLibrary"+" = "+b1, objArray1);
          if (b) {
             this.P().setMEnableHideDecorationView(0);
             this.L.O().w(0);
             this.P().setAllowedInterceptChange(0);
             this.P().O0(true, true);
          }
          if (b || b1) {
             this.h0();
          }
       }
       if (PatchProxy.applyVoidOneRefs(p0, this, ol0, "9") || (!this.Q() && this.R() != null)) {
          if (p0.q() && this.r0(p0)) {
             EditDecorationBaseDrawer uEditDecorat1 = this.P().H0();
             if (uEditDecorat1 == null) {
                this.m0(0);
             }
             if (uEditDecorat1 instanceof NewEditStickerBaseDrawer && (uEditDecorat1.stickerTextAvailable() && !uEditDecorat1.getFinalRotate())) {
                long l = (this.x != null)? 300: 0;
                this.R().postDelayed(new k0(this, uEditDecorat1), l);
             }
          }else if(!this.R().getVisibility() && (!this.r0(p0) || p0.o() >= 0)){
             this.R().setVisibility(8);
             TextView textView1 = this.S();
             if (textView1 != null && !textView1.getVisibility()) {
                this.S().setVisibility(8);
             }
             textView1 = this.U();
             if (textView1 != null && !textView1.getVisibility()) {
                this.U().setVisibility(8);
             }
          }
       label_0172 :
          if (p0.s()) {
             this.m0(true);
          }
       }
    label_017b :
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, this, ol0, "11") && this.T() != null) {
          if (p0.z() && !p1.z()) {
             EditDecorationBaseDrawer uEditDecorat = this.P().p0(p0.o());
             if (this.r0(p0)) {
                if (uEditDecorat == null) {
                   Object[] objArray = new Object[0];
                   a.D().w("StickerVideoPreviewViewBinder", "handleTextContinuePlayTip, selectDrawer is null", objArray);
                }else {
                   TextView textView = this.R();
                   if (textView != null && !textView.getVisibility()) {
                      this.R().setVisibility(8);
                   }
                   textView = this.U();
                   if (textView != null && !textView.getVisibility()) {
                      this.U().setVisibility(8);
                   }
                   textView = this.S();
                   if (textView != null && !textView.getVisibility()) {
                      this.S().setVisibility(8);
                   }
                   this.E(this.T(), uEditDecorat.getTipLocationBottomCenter());
                   SharedPreferences$Editor uEditor = a.a.edit();
                   uEditor.putBoolean("enable_sticker_continue_play_tip", 0);
                   g.a(uEditor);
                }
             }
          }else if(!this.T().getVisibility() && (!p0.z() && p1.z())){
             this.T().setVisibility(8);
          }
       }
       return;
    }
    public void o(){
       n.c(this);
    }
    public final EditorDelegate p0(){
       return this.L;
    }
    public final b q0(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, l0.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       ViewParent parent = this.P().getParent();
       Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.View");
       b uob = new b(false, this.b0().o0().t(), this.N(objArray), (float)this.P().getEditorRect().width(), (parent.getScaleX() * this.P().getScaleX()), this.X().p0(0), a.a(), this.b0().o0().c().size(), 0, 0, 769, null);
       return obj;
    }
    public void r(VideoFrameChangeListener$CHANGE_TYPE p0,Size p1,int p2){
       n.d(this, p0, p1, p2);
    }
    public final boolean r0(b p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, l0.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!this.f0() && (!p0.s() && (!p0.y().f() && this.L.H() == null))) {
          o oo = this.L.x();
          a.o(oo, "editorDelegate.editorContext");
          if (!oo.b().d()) {
             b = true;
          label_0049 :
             return b;
          }
       }
    label_0048 :
       b = false;
       goto label_0049 ;
    }
    public final boolean s0(){
       Object obj = PatchProxy.apply(null, this, l0.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b0().o0().y().f();
    }
    public void w(VideoFrameChangeListener$CHANGE_TYPE p0,boolean p1){
       n.a(this, p0, p1);
    }
    public void x(a p0,a p1){
       this.l0(p0, p1);
    }
}
