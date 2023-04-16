package com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.TextVideoPreviewViewBinder;
import yld.l;
import mnd.a;
import com.yxcorp.gifshow.v3.previewer.listener.VideoFrameChangeListener;
import tyc.a2;
import kod.a;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import und.l;
import tnd.b;
import lwc.h;
import com.yxcorp.gifshow.v3.f;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.TextVideoPreviewViewBinder$mTimelineFragment$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.TextVideoPreviewViewBinder$a;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.TextVideoPreviewViewBinder$f;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.TextVideoPreviewViewBinder$g;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.TextVideoPreviewViewBinder$c;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.TextVideoPreviewViewBinder$d;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.TextVideoPreviewViewBinder$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.TextVideoPreviewViewBinder$e;
import java.lang.Runnable;
import ekd.k1;
import java.util.Map;
import nwc.l;
import t36.f;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import ei0.a;
import com.yxcorp.gifshow.widget.PassThroughEventView;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import com.yxcorp.gifshow.v3.EditorManager$b;
import com.yxcorp.gifshow.v3.EditorManager;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import android.widget.AbsoluteLayout;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$d;
import mod.a;
import com.kwai.robust.PatchProxyResult;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import lnd.a;
import xld.c;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView$b;
import faa.a;
import q87.c;
import java.lang.StringBuilder;
import xld.a;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import amd.c;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.timeline.TextTimelineFragmentV3;
import com.yxcrop.gifshow.v3.editor.decoration_v2.ui.DecorationTimelineFragment;
import java.lang.Boolean;
import xld.b;
import com.yxcorp.gifshow.v3.previewer.listener.VideoFrameChangeListener$CHANGE_TYPE;
import nwc.n;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import java.lang.Integer;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.TextVideoPreviewViewBinder$onFrameChanged$1;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewTreeObserver;
import nnd.g;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import android.view.MotionEvent;
import android.animation.ObjectAnimator;
import tnd.c;
import java.util.Objects;
import k2b.e0;
import com.yxcorp.gifshow.v3.EditorItemFunc;
import voc.o;
import bvc.b;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import wnd.k;
import androidx.recyclerview.widget.h$b;
import androidx.recyclerview.widget.h$e;
import androidx.recyclerview.widget.h;
import wnd.l;
import xnd.c;
import wba.r;
import nsd.u;
import u2.f;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.NewTextBaseElementData;
import wnd.h;
import wnd.b;
import nnd.e;
import nnd.f;
import aw9.c0;
import nnd.c;
import android.widget.TextView;
import com.yxcrop.gifshow.v3.editor.text_v2_share.element.NewEditTextElement;
import com.yxcrop.gifshow.v3.editor.text_v2_share.element.NewEditTextBaseElement;
import nnd.d;
import android.graphics.Point;
import oa0.a;

public final class TextVideoPreviewViewBinder extends a implements l, a, VideoFrameChangeListener, a2	// class@000b34
{
    public final l B;
    public final h C;
    public boolean D;
    public float E;
    public float F;
    public final p G;
    public Runnable H;
    public final TextVideoPreviewViewBinder$a I;
    public final TextVideoPreviewViewBinder$f J;
    public final TextVideoPreviewViewBinder$g K;
    public final TextVideoPreviewViewBinder$c L;
    public final TextVideoPreviewViewBinder$d M;
    public final TextVideoPreviewViewBinder$b N;

    public void TextVideoPreviewViewBinder(View p0,Fragment p1,EditorDelegate p2){
       a.p(p0, "rootView");
       a.p(p1, "fragment");
       a.p(p2, "editorDelegate");
       super(p0, p1, p2);
       this.B = b.d(p1);
       this.C = f.l(p1);
       this.D = true;
       this.G = s.c(new TextVideoPreviewViewBinder$mTimelineFragment$2(p2));
       this.I = new TextVideoPreviewViewBinder$a(this, p1);
       this.J = new TextVideoPreviewViewBinder$f(this, p2, p1);
       this.K = new TextVideoPreviewViewBinder$g(this);
       this.L = new TextVideoPreviewViewBinder$c(this, p2);
       this.M = new TextVideoPreviewViewBinder$d(this);
       this.N = new TextVideoPreviewViewBinder$b(this);
    }
    public void B(){
       if (PatchProxy.applyVoid(null, this, TextVideoPreviewViewBinder.class, "14")) {
          return;
       }
       super.B();
       k1.r(new TextVideoPreviewViewBinder$e(this), 5);
       f.o0(this.M, this.Q().u(), l.class);
       this.D = this.T() ^ 0x01;
       if (PostExperimentUtils.Z() && !PostExperimentUtils.W0()) {
          this.A().findViewById(R.id.touch_view).b(this);
       }
       return;
    }
    public void C(){
       TextVideoPreviewViewBinder textVideoPre = TextVideoPreviewViewBinder.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, textVideoPre, "16")) {
          return;
       }
       super.C();
       if (!PatchProxy.applyVoid(objArray, this, textVideoPre, "18")) {
          BaseFragment uBaseFragmen = this.Q().q();
          if (!uBaseFragmen instanceof BaseEditorFragment) {
             uBaseFragmen = objArray;
          }
          if (uBaseFragmen != null) {
             objArray = uBaseFragmen.B;
          }
          if (objArray != null) {
             objArray.F(this.N);
          }
       }
       this.S().removeCallbacks(this.H);
       f.t0(this.M, this.Q().u(), l.class);
       return;
    }
    public DecorationContainerView$d N(){
       return this.I;
    }
    public a P(){
       Object obj = PatchProxy.apply(null, this, TextVideoPreviewViewBinder.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.s0().o0().y();
    }
    public EditReduxViewModel Z(){
       return this.s0();
    }
    public EditDecorationContainerView$b a0(){
       return this.J;
    }
    public void c(){
       TextVideoPreviewViewBinder textVideoPre = TextVideoPreviewViewBinder.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, textVideoPre, "2")) {
          return;
       }
       int i = 0;
       if (this.J()) {
          objArray = new Object[i];
          a.D().w("TextPreviewViewBinder", "onEditIconClick, editText", objArray);
          return;
       }else {
          this.p0(i);
          a uoa = this.s0().o0();
          Object[] objArray1 = new Object[i];
          a.D().w("TextPreviewViewBinder", "isPhotoMovie="+uoa.t()+", duration="+uoa.n(), objArray1);
          if (this.D != null) {
             this.S().R();
             b.a(this.s0(), this.D);
          }else {
             TextTimelineFragmentV3 textTimeline = PatchProxy.apply(objArray, this, textVideoPre, "1");
             if (textTimeline == PatchProxyResult.class) {
                textTimeline = this.G.getValue();
             }
             textTimeline.show();
          }
          return;
       }
    }
    public boolean g0(){
       Object obj = PatchProxy.apply(null, this, TextVideoPreviewViewBinder.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.s0().u0().y().f() && (this.s0().o0().y().f() || (!this.s0().o0().y().f() && this.s0().o0().D())))? true: false;
       return b;
    }
    public int getLevel(){
       return 9;
    }
    public boolean h0(){
       a obj = PatchProxy.apply(null, this, TextVideoPreviewViewBinder.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.s0().o0();
       boolean b = (obj.s() || obj.E().d())? true: false;
       return b;
    }
    public boolean i(){
       return false;
    }
    public void l(VideoFrameChangeListener$CHANGE_TYPE p0){
       n.b(this, p0);
    }
    public void o(){
       n.c(this);
    }
    public void r(VideoFrameChangeListener$CHANGE_TYPE p0,Size p1,int p2){
       TextVideoPreviewViewBinder textVideoPre = TextVideoPreviewViewBinder.class;
       if (PatchProxy.isSupport(textVideoPre) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, TextVideoPreviewViewBinder.class, "6")) {
          return;
       }
       n.d(this, p0, p1, p2);
       TextVideoPreviewViewBinder$onFrameChanged$1 oonFrameChan = new TextVideoPreviewViewBinder$onFrameChanged$1(this);
       if (!PatchProxy.applyVoidOneRefs(oonFrameChan, this, textVideoPre, "7")) {
          p1 = this.C.u0(0).b;
          Size c = this.C.u0(0).c;
          if (p1 > null && c > null) {
             ViewGroup$LayoutParams layoutParams = this.S().getLayoutParams();
             if (layoutParams.height != c || layoutParams.width != p1) {
                layoutParams.width = p1;
                layoutParams.height = c;
                this.S().setLayoutParams(layoutParams);
             }
          }
          this.S().getViewTreeObserver().addOnGlobalLayoutListener(new g(this, oonFrameChan));
       }
       return;
    }
    public void r0(){
       if (PatchProxy.applyVoid(null, this, TextVideoPreviewViewBinder.class, "3")) {
          return;
       }
       EditDecorationBaseDrawer selectDrawer = this.S().getSelectDrawer();
       if (selectDrawer != null) {
          if (this.J.d(selectDrawer)) {
             super.r0();
          }else {
             Object[] objArray = new Object[0];
             a.D().w("TextPreviewViewBinder", "selected Drawer has inVisible when start edit.", objArray);
          }
       }
       return;
    }
    public l s0(){
       return this.B;
    }
    public boolean t(MotionEvent p0){
       Fragment obj = PatchProxy.applyOneRefs(p0, this, TextVideoPreviewViewBinder.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "event");
       if (!p0.getAction()) {
          this.E = p0.getX();
          this.F = p0.getY();
       }
       if (p0.getAction() == 1 && (!p0.getX() - this.E && (!p0.getY() - this.F && (!this.S().getMSelectedWhenActionDown() && this.t0(this.s0().o0()))))) {
          p0 = this.S().getTag(R.id.TAG_PREVIEW_ANIMATOR_ID);
          if (!p0 instanceof ObjectAnimator || !p0.isRunning()) {
             this.p0(false);
             b.a(this.s0(), this.D);
             obj = this.R();
             Objects.requireNonNull(obj, "null cannot be cast to non-null type com.yxcorp.gifshow.log.ILogPage");
             c.a.a(obj);
          }
       }
    label_0093 :
       return true;
    }
    public final boolean t0(a p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, TextVideoPreviewViewBinder.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!this.h0() && (!p0.D() && (!p0.y().f() && this.Q().H() == null))) {
          o oo = this.Q().x();
          a.o(oo, "editorDelegate.editorContext");
          if (!oo.b().d()) {
             b = true;
          label_004d :
             return b;
          }
       }
    label_004c :
       b = false;
       goto label_004d ;
    }
    public final boolean u0(){
       Object obj = PatchProxy.apply(null, this, TextVideoPreviewViewBinder.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.s0().o0().y().f();
    }
    public void w(VideoFrameChangeListener$CHANGE_TYPE p0,boolean p1){
       n.a(this, p0, p1);
    }
    public void x(a p0,a p1){
       EditDecorationContainerViewV2 uEditDecorat;
       TextView textView;
       TextVideoPreviewViewBinder textVideoPre = TextVideoPreviewViewBinder.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, textVideoPre, "4")) {
       }else {
          a.p(p0, "newState");
          a.p(p1, "lastState");
          List list = (p0.x())? p0.i(): CollectionsKt__CollectionsKt.E();
          List list1 = (p1.x())? p1.i(): CollectionsKt__CollectionsKt.E();
          List list2 = list1;
          if (p0.x() && (a.g(list, list2) ^ 1)) {
             l ol = new l(this.S(), list, list2, this.L, null, 16, null);
             h.b(new k(list, list2)).e(v12);
          }
          this.d0(p0.o(), p1.o());
          NewTextBaseElementData newTextBaseE = h.l(list, p0.o());
          if (!p0.y().f() && p1.y().f()) {
             b.d(this.S(), this.s0(), false, this.s0().o0().w());
             this.F();
             if (newTextBaseE != null) {
                String str = newTextBaseE.F0();
                if (str != null) {
                   uEditDecorat = (!str.length())? 1: null;
                   if (uEditDecorat == 1) {
                      this.S().post(new e(this, this.S().getSelectDrawer()));
                   }
                }
             }
             if (!this.h0() && !p0.D()) {
                this.S().post(new f(this));
             }
          }else if(p0.y().f() && !p1.y().f()){
             this.S().setDelegate(this.a0());
          }
          this.c0(p0.y(), p1.y());
          if (!PatchProxy.applyVoidTwoRefs(p0, p1, this, textVideoPre, "8")) {
             uEditDecorat = (!p0.s() && p1.s())? 1: null;
             c uoc = (!p0.E().d() && p1.E().d())? 1: null;
             if (uoc) {
                this.K();
             }
             if (uEditDecorat) {
                this.S().setMEnableHideDecorationView(1);
                this.k0();
                this.Q().O().w(1);
                this.S().setAllowedInterceptChange(1);
                this.S().O0(false, 1);
             }
             if (uoc || uEditDecorat) {
                this.S().post(new c(this));
             }
             uEditDecorat = (p0.s() && !p1.s())? 1: null;
             uoc = (p0.E().d() && !p1.E().d())? 1: 0;
             if (uoc) {
                this.H();
             }
             if (uEditDecorat) {
                this.S().setMEnableHideDecorationView(false);
                this.j0();
                this.Q().O().w(false);
                this.S().setAllowedInterceptChange(false);
                this.S().O0(1, 1);
             }
          }
          String str1 = 8;
          if (PatchProxy.applyVoidOneRefs(p0, this, textVideoPre, "9") || (!this.T() && this.Y() != null)) {
             if (p0.q() && this.t0(p0)) {
                EditDecorationBaseDrawer uEditDecorat2 = this.S().J0();
                if (uEditDecorat2 == null) {
                   this.o0(false);
                }
                if (uEditDecorat2 instanceof NewEditTextElement && !uEditDecorat2.isEmpty()) {
                   long l = (this.U())? 300: 0;
                   this.Y().postDelayed(new d(this, uEditDecorat2), l);
                }
             }else if(!this.Y().getVisibility() && (!this.t0(p0) || p0.o() >= 0)){
                this.Y().setVisibility(str1);
                textView = this.W();
                if (textView != null && !textView.getVisibility()) {
                   this.W().setVisibility(str1);
                }
                textView = this.V();
                if (textView != null && !textView.getVisibility()) {
                   this.V().setVisibility(str1);
                }
             }
          label_026a :
             if (p0.D()) {
                this.o0(1);
             }
          }
       label_0273 :
          if (!PatchProxy.applyVoidTwoRefs(p0, p1, this, textVideoPre, "10") && this.X() != null) {
             if (p0.z() && !p1.z()) {
                EditDecorationBaseDrawer uEditDecorat1 = this.S().p0(p0.o());
                if (this.t0(p0)) {
                   if (uEditDecorat1 == null) {
                      Object[] objArray = new Object[false];
                      a.D().w("TextPreviewViewBinder", "handleTextContinuePlayTip, selectDrawer is null", objArray);
                   }else {
                      textView = this.Y();
                      if (textView != null && !textView.getVisibility()) {
                         this.Y().setVisibility(str1);
                      }
                      this.E(this.X(), uEditDecorat1.getTipLocationBottomCenter());
                      a.Q0(false);
                   }
                }
             }else if(!this.X().getVisibility() && (!p0.z() && p1.z())){
                this.X().setVisibility(str1);
             }
          }
          if (p0.s() && !p1.s()) {
             this.D = false;
          }
       }
       return;
    }
}
