package com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.picture.PicturePreviewViewBinder;
import yld.l;
import mnd.a;
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
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.picture.PicturePreviewViewBinder$longPictureViewBinder$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.picture.PicturePreviewViewBinder$atlasOrSinglePictureViewBinder$2;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.picture.PicturePreviewViewBinder$atlasForLongPictureViewBinder$2;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.picture.PicturePreviewViewBinder$g;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.picture.PicturePreviewViewBinder$b;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.picture.PicturePreviewViewBinder$h;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.picture.PicturePreviewViewBinder$d;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.picture.PicturePreviewViewBinder$c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import uwc.b;
import com.yxcorp.gifshow.v3.f;
import androidx.lifecycle.MutableLiveData;
import com.yxcorp.gifshow.v3.previewer.player.viewmodel.PicturesViewModel;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.picture.PicturePreviewViewBinder$e;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.picture.PicturePreviewViewBinder$f;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.gifshow.v3.previewer.PhotosEditPreviewV3Fragment;
import t36.f;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import tyc.z1;
import android.widget.AbsoluteLayout;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import java.util.Objects;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import com.yxcorp.gifshow.v3.EditorManager$b;
import com.yxcorp.gifshow.v3.EditorManager;
import ei0.a;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$d;
import mod.a;
import com.kwai.robust.PatchProxyResult;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import lnd.a;
import xld.c;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView$b;
import yld.m;
import cq.a;
import q87.c;
import java.lang.Boolean;
import android.view.MotionEvent;
import android.animation.ObjectAnimator;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import tnd.c;
import k2b.e0;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.v3.EditorItemFunc;
import xld.a;
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
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import ond.g;
import ond.h;
import android.widget.TextView;
import com.yxcrop.gifshow.v3.editor.text_v2_share.element.NewEditTextElement;
import com.yxcrop.gifshow.v3.editor.text_v2_share.element.NewEditTextBaseElement;
import ond.f;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.picture.PicturePreviewViewBinder$a;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;

public final class PicturePreviewViewBinder extends a implements l, a, a2	// class@000b4f
{
    public final l B;
    public final EditDecorationContainerView C;
    public float D;
    public float E;
    public final p F;
    public final p G;
    public final p H;
    public a I;
    public Runnable J;
    public final PicturePreviewViewBinder$g K;
    public final PicturePreviewViewBinder$b L;
    public final PicturePreviewViewBinder$h M;
    public final PicturePreviewViewBinder$d N;
    public final PicturePreviewViewBinder$c O;
    public final EditorDelegate P;

    public void PicturePreviewViewBinder(View p0,Fragment p1,EditorDelegate p2){
       a.p(p0, "rootView");
       a.p(p1, "fragment");
       a.p(p2, "delegate");
       super(p0, p1, p2);
       this.P = p2;
       this.B = b.d(p1);
       this.C = p0.findViewById(0x7f0a0a6c);
       this.F = s.c(new PicturePreviewViewBinder$longPictureViewBinder$2(this, p0, p1));
       this.G = s.c(new PicturePreviewViewBinder$atlasOrSinglePictureViewBinder$2(this, p0, p1));
       this.H = s.c(new PicturePreviewViewBinder$atlasForLongPictureViewBinder$2(this, p0, p1));
       this.K = new PicturePreviewViewBinder$g(this);
       this.L = new PicturePreviewViewBinder$b(this, p1);
       this.M = new PicturePreviewViewBinder$h(this);
       this.N = new PicturePreviewViewBinder$d(this);
       this.O = new PicturePreviewViewBinder$c(this);
    }
    public void B(){
       PicturePreviewViewBinder picturePrevi = PicturePreviewViewBinder.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, picturePrevi, "4")) {
          return;
       }
       super.B();
       b uob = f.k(this.P);
       uob.t0().observe(this.R(), new PicturePreviewViewBinder$e(this, uob));
       k1.r(new PicturePreviewViewBinder$f(this), 5);
       Fragment uFragment = this.R();
       if (!uFragment instanceof PhotosEditPreviewV3Fragment) {
          uFragment = objArray;
       }
       if (uFragment != null) {
          PhotosEditPreviewV3Fragment photosEditPr = uFragment.f1;
          if (photosEditPr != null) {
             photosEditPr.d(this.K);
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, picturePrevi, "6") && (PostExperimentUtils.Z() && this.P.C() instanceof z1)) {
          picturePrevi = this.C;
          if (picturePrevi != null && !picturePrevi.getVisibility()) {
             this.C.setUndersideView(this.P.C());
          }
          View view = this.P.C();
          Objects.requireNonNull(view, "null cannot be cast to non-null type com.yxcorp.gifshow.widget.IPassThroughEventHost");
          view.b(this);
       }
    label_0083 :
       return;
    }
    public void C(){
       PicturePreviewViewBinder picturePrevi = PicturePreviewViewBinder.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, picturePrevi, "5")) {
          return;
       }
       super.C();
       if (!PatchProxy.applyVoid(objArray, this, picturePrevi, "19")) {
          BaseFragment uBaseFragmen = this.P.q();
          if (!uBaseFragmen instanceof BaseEditorFragment) {
             uBaseFragmen = objArray;
          }
          BaseEditorFragment b = (uBaseFragmen != null)? uBaseFragmen.B: objArray;
          if (b != null) {
             b.F(this.O);
          }
       }
       picturePrevi = this.I;
       if (picturePrevi != null) {
          picturePrevi.C();
       }
       this.S().removeCallbacks(this.J);
       Fragment uFragment = this.R();
       if (!uFragment instanceof PhotosEditPreviewV3Fragment) {
          uFragment = objArray;
       }
       if (uFragment != null) {
          PhotosEditPreviewV3Fragment photosEditPr = uFragment.f1;
          if (photosEditPr != null) {
             photosEditPr.c(this.K);
          }
       }
       View view = this.P.C();
       if (view instanceof z1) {
          objArray = view;
       }
       if (objArray != null) {
          objArray.a(this);
       }
       return;
    }
    public DecorationContainerView$d N(){
       return this.L;
    }
    public a P(){
       Object obj = PatchProxy.apply(null, this, PicturePreviewViewBinder.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.u0().o0().y();
    }
    public EditReduxViewModel Z(){
       return this.u0();
    }
    public EditDecorationContainerView$b a0(){
       Object[] objArray1;
       Object[] objArray = null;
       PicturePreviewViewBinder obj = PatchProxy.apply(objArray, this, PicturePreviewViewBinder.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.I;
       if (!obj instanceof m) {
          objArray1 = objArray;
       }
       if (objArray1 != null) {
          objArray = objArray1.j();
       }
       return objArray;
    }
    public void c(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PicturePreviewViewBinder.class, "12")) {
          return;
       }
       int i = 0;
       if (this.J()) {
          objArray = new Object[i];
          a.D().w("PicturePreviewViewBinder", "onEditIconClick, editText", objArray);
          return;
       }else {
          this.p0(i);
          PicturePreviewViewBinder tI = this.I;
          if (tI instanceof a) {
             objArray = tI;
          }
          if (objArray != null) {
             objArray.c();
          }
          return;
       }
    }
    public boolean g0(){
       Object obj = PatchProxy.apply(null, this, PicturePreviewViewBinder.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.u0().o0().y().f() && this.u0().u0().y().f())? true: false;
       return b;
    }
    public int getLevel(){
       return 9;
    }
    public boolean i(){
       return true;
    }
    public final void s0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PicturePreviewViewBinder.class, "10")) {
          return;
       }
       PicturePreviewViewBinder tI = this.I;
       if (tI != null) {
          tI.C();
       }
       this.I = p0;
       if (p0 != null) {
          p0.B();
       }
       return;
    }
    public boolean t(MotionEvent p0){
       Fragment obj = PatchProxy.applyOneRefs(p0, this, PicturePreviewViewBinder.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "event");
       if (!p0.getAction()) {
          this.D = p0.getX();
          this.E = p0.getY();
       }
       if (p0.getAction() == 1 && (!p0.getX() - this.D && (!p0.getY() - this.E && (!this.S().getMSelectedWhenActionDown() && this.w0(this.u0().o0()))))) {
          p0 = this.S().getTag(R.id.TAG_PREVIEW_ANIMATOR_ID);
          if (!p0 instanceof ObjectAnimator || !p0.isRunning()) {
             PicturePreviewViewBinder tC = this.C;
             if (tC == null || tC.getSelectDecorationDrawer() == null) {
                this.c();
                obj = this.R();
                Objects.requireNonNull(obj, "null cannot be cast to non-null type com.yxcorp.gifshow.log.ILogPage");
                c.a.a(obj);
             }
          }
       }
    label_0093 :
       return true;
    }
    public final a t0(){
       Object obj = PatchProxy.apply(null, this, PicturePreviewViewBinder.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.G.getValue();
    }
    public l u0(){
       return this.B;
    }
    public final a v0(Workspace$Type p0){
       a uoa;
       Object obj = PatchProxy.applyOneRefs(p0, this, PicturePreviewViewBinder.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == Workspace$Type.LONG_PICTURE) {
          uoa = PatchProxy.apply(null, this, PicturePreviewViewBinder.class, "1");
          if (uoa == PatchProxyResult.class) {
             uoa = this.F.getValue();
          }
       }else {
          uoa = this.t0();
       }
       return uoa;
    }
    public final boolean w0(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PicturePreviewViewBinder.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!p0.y().f() && this.P.H() == null)? true: false;
       return b;
    }
    public void x(a p0,a p1){
       PicturePreviewViewBinder picturePrevi = PicturePreviewViewBinder.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, picturePrevi, "13")) {
       }else {
          a.p(p0, "newState");
          a.p(p1, "lastState");
          List list = (p0.x())? p0.i(): CollectionsKt__CollectionsKt.E();
          List list1 = (p1.x())? p1.i(): CollectionsKt__CollectionsKt.E();
          List list2 = list1;
          if (p0.x() && (a.g(list, list2) ^ 1)) {
             l ol = new l(this.S(), list, list2, this.N, null, 16, null);
             h.b(new k(list, list2)).e(v12);
          }
          this.d0(p0.o(), p1.o());
          NewTextBaseElementData newTextBaseE = h.l(list, p0.o());
          if (!p0.y().f() && p1.y().f()) {
             boolean b = false;
             b.d(this.S(), this.u0(), b, this.u0().o0().w());
             this.F();
             if (newTextBaseE != null) {
                String str = newTextBaseE.F0();
                if (str != null) {
                   if (!str.length()) {
                      b = true;
                   }
                   if (b == true) {
                      this.S().post(new g(this, this.S().getSelectDrawer()));
                   }
                }
             }
             this.S().post(new h(this));
          }else if(p0.y().f() && !p1.y().f()){
             this.S().setDelegate(this.a0());
          }
          this.c0(p0.y(), p1.y());
          this.S().e0();
          PicturePreviewViewBinder tI = this.I;
          if (!tI instanceof l) {
             tI = null;
          }
          if (tI != null) {
             tI.x(p0, p1);
          }
          if (PatchProxy.applyVoidOneRefs(p0, this, picturePrevi, "14") || (!this.T() && this.Y() != null)) {
             if (p0.q() && this.w0(p0)) {
                EditDecorationBaseDrawer uEditDecorat = this.S().J0();
                if (uEditDecorat instanceof NewEditTextElement && !uEditDecorat.isEmpty()) {
                   this.Y().postDelayed(new f(this, uEditDecorat), 200);
                }
             }else if(!this.Y().getVisibility() && (!this.w0(p0) || p0.o() >= 0)){
                this.Y().setVisibility(8);
                TextView textView = this.V();
                if (textView != null && !textView.getVisibility()) {
                   this.V().setVisibility(8);
                }
             }
          }
       }
    label_0195 :
       return;
    }
    public final void x0(boolean p0,EditorItemFunc p1){
       PicturePreviewViewBinder picturePrevi = PicturePreviewViewBinder.class;
       if (PatchProxy.isSupport(picturePrevi) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, picturePrevi, "20")) {
          return;
       }
       picturePrevi = this.I;
       if (picturePrevi instanceof PicturePreviewViewBinder$a) {
          if (p0) {
             picturePrevi.d(p1);
          }else {
             picturePrevi.y(p1);
          }
       }
       return;
    }
    public final void y0(EditorItemFunc p0){
       a uoa;
       PicturePreviewViewBinder picturePrevi = PicturePreviewViewBinder.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, picturePrevi, "7")) {
          return;
       }
       Workspace$Type type = null;
       boolean b = (p0 != null)? true: false;
       Workspace$Type type1 = this.P.getType();
       if (!PatchProxy.isSupport(picturePrevi) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, picturePrevi, "9")) {
          Log.b("PicturePreviewViewBinder", "changeContainerViewStatus: "+b);
          if (b) {
             if (this.S().getSelectDrawer() != null) {
                this.S().R();
             }
          }else {
             this.S().setVisibility(type);
             this.S().e0();
          }
       }
       if (!b || type1 != Workspace$Type.LONG_PICTURE) {
          a.o(type1, "realWorkspaceType");
          this.s0(this.v0(type1));
       }else if(p0 == EditorItemFunc.REORDER){
          uoa = this.t0();
       }else {
          uoa = PatchProxy.apply(null, this, picturePrevi, "3");
          if (uoa == PatchProxyResult.class) {
             uoa = this.H.getValue();
          }
       }
       this.s0(uoa);
       return;
    }
}
