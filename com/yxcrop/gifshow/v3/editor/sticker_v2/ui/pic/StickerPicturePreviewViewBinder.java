package com.yxcrop.gifshow.v3.editor.sticker_v2.ui.pic.StickerPicturePreviewViewBinder;
import nmd.v;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import smd.d;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.pic.StickerPicturePreviewViewBinder$longPictureViewBinder$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.pic.StickerPicturePreviewViewBinder$atlasOrSinglePictureViewBinder$2;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.pic.StickerPicturePreviewViewBinder$atlasForLongPictureViewBinder$2;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.pic.StickerPicturePreviewViewBinder$e;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.pic.StickerPicturePreviewViewBinder$mPictureViewModel$2;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.pic.StickerPicturePreviewViewBinder$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import uwc.b;
import com.yxcorp.gifshow.v3.f;
import androidx.lifecycle.MutableLiveData;
import com.yxcorp.gifshow.v3.previewer.player.viewmodel.PicturesViewModel;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.pic.StickerPicturePreviewViewBinder$c;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.pic.StickerPicturePreviewViewBinder$d;
import java.lang.Runnable;
import ekd.k1;
import ei0.a;
import com.yxcorp.gifshow.v3.EditorManager$b;
import com.yxcorp.gifshow.v3.EditorManager;
import mmd.a;
import com.kwai.robust.PatchProxyResult;
import java.util.HashMap;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import android.util.Pair;
import lwc.h;
import java.util.ArrayList;
import java.lang.CharSequence;
import msd.l;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.lang.Integer;
import java.util.Map;
import java.lang.Float;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import android.graphics.Rect;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import nsd.u;
import java.lang.Number;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.pic.StickerPicturePreviewViewBinder$a;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.c$a;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView$b;
import yld.m;
import mmd.b;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import java.lang.Boolean;
import mod.a;
import yld.l;
import xld.a;
import faa.a;
import q87.c;
import android.widget.TextView;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.element.NewEditStickerBaseDrawer;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import pmd.b;
import java.lang.StringBuilder;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.v3.EditorItemFunc;

public final class StickerPicturePreviewViewBinder extends v	// class@000ac6
{
    public final p J;
    public final p K;
    public final p L;
    public a M;
    public final EditorManager N;
    public final c$a O;
    public final p P;
    public final StickerPicturePreviewViewBinder$b Q;
    public final EditorDelegate R;

    public void StickerPicturePreviewViewBinder(View p0,Fragment p1,EditorDelegate p2,d p3){
       a.p(p0, "rootView");
       a.p(p1, "fragment");
       a.p(p2, "delegate");
       a.p(p3, "viewModel");
       super(p0, p1, p2, p3);
       this.R = p2;
       this.J = s.c(new StickerPicturePreviewViewBinder$longPictureViewBinder$2(this, p0, p1));
       this.K = s.c(new StickerPicturePreviewViewBinder$atlasOrSinglePictureViewBinder$2(this, p0, p1));
       this.L = s.c(new StickerPicturePreviewViewBinder$atlasForLongPictureViewBinder$2(this, p0, p1));
       BaseFragment uBaseFragmen = p2.q();
       BaseEditorFragment uBaseEditorF = null;
       if (!uBaseFragmen instanceof BaseEditorFragment) {
          uBaseFragmen = uBaseEditorF;
       }
       if (uBaseFragmen != null) {
          uBaseEditorF = uBaseFragmen.B;
       }
       this.N = uBaseEditorF;
       this.O = new StickerPicturePreviewViewBinder$e(this);
       this.P = s.c(new StickerPicturePreviewViewBinder$mPictureViewModel$2(this));
       this.Q = new StickerPicturePreviewViewBinder$b(this);
       return;
    }
    public void B(){
       if (PatchProxy.applyVoid(null, this, StickerPicturePreviewViewBinder.class, "5")) {
          return;
       }
       super.B();
       b uob = f.k(this.R);
       uob.t0().observe(this.W(), new StickerPicturePreviewViewBinder$c(this, uob));
       k1.r(new StickerPicturePreviewViewBinder$d(this), 5);
       return;
    }
    public void C(){
       if (PatchProxy.applyVoid(null, this, StickerPicturePreviewViewBinder.class, "6")) {
          return;
       }
       super.C();
       StickerPicturePreviewViewBinder tM = this.M;
       if (tM != null) {
          tM.C();
       }
       tM = this.N;
       if (tM != null) {
          tM.F(this.Q);
       }
       return;
    }
    public a F(){
       Object obj = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       StickerPicturePreviewViewBinder stickerPictu = StickerPicturePreviewViewBinder.class;
       Object[] objArray = null;
       Object obj1 = PatchProxy.apply(objArray, obj, stickerPictu, "21");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       HashMap hashMap = new HashMap();
       HashMap hashMap1 = new HashMap();
       Object obj2 = PatchProxy.apply(objArray, obj, stickerPictu, "4");
       if (obj2 != patchProxyRe) {
       }else {
          obj2 = obj.P.getValue();
       }
       int i = 0;
       Iterator iterator = obj2.H0().iterator();
       while (iterator.hasNext()) {
          Pair obj3 = iterator.next();
          int i1 = i + 1;
          if (i < 0) {
             CollectionsKt__CollectionsKt.W();
          }
          if (i >= 0 && i < this.X().w0().size()) {
             ArrayList uArrayList = new ArrayList();
             Pair first = obj3.first;
             if (first != null) {
                a.o(first, "identifierList.first");
                uArrayList.add(first);
             }
             obj3 = obj3.second;
             if (obj3 != null) {
                a.o(obj3, "identifierList.second");
                uArrayList.add(obj3);
             }
             CharSequence uCharSequenc = null;
             ArrayList uArrayList1 = uArrayList;
             hashMap.put(Integer.valueOf((CollectionsKt___CollectionsKt.V2(uArrayList1, "", uCharSequenc, null, 0, null, null, 62, null)).hashCode()), this.X().w0().get(i));
             hashMap1.put(Integer.valueOf((CollectionsKt___CollectionsKt.V2(uArrayList1, "", uCharSequenc, null, 0, null, null, 62, null)).hashCode()), Float.valueOf(obj.L(uArrayList)));
          }
          i = i1;
       }
       a uoa = new a(true, this.P().getEditorRect().width(), hashMap, hashMap1, null, 16, null);
       return iterator;
    }
    public float L(List p0){
       StickerPicturePreviewViewBinder obj = PatchProxy.applyOneRefs(p0, this, StickerPicturePreviewViewBinder.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       obj = this.M;
       if (!obj instanceof StickerPicturePreviewViewBinder$a) {
          obj = null;
       }
       float f = (obj != null)? obj.f(p0): 0x3f800000;
       return f;
    }
    public int M(List p0){
       StickerPicturePreviewViewBinder obj = PatchProxy.applyOneRefs(p0, this, StickerPicturePreviewViewBinder.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.M;
       if (!obj instanceof StickerPicturePreviewViewBinder$a) {
          obj = null;
       }
       int i = (obj != null)? obj.m(p0): -1;
       return i;
    }
    public Size N(List p0){
       StickerPicturePreviewViewBinder obj = PatchProxy.applyOneRefs(p0, this, StickerPicturePreviewViewBinder.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.M;
       if (!obj instanceof StickerPicturePreviewViewBinder$a) {
          obj = null;
       }
       int i = (obj != null)? obj.m(p0): -1;
       if (i < 0 || i >= this.X().w0().size()) {
          return new Size(0, 0);
       }else {
          return this.X().w0().get(i);
       }
    }
    public c$a V(){
       return this.O;
    }
    public EditDecorationContainerView$b Z(){
       Object[] objArray1;
       Object[] objArray = null;
       StickerPicturePreviewViewBinder obj = PatchProxy.apply(objArray, this, StickerPicturePreviewViewBinder.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.M;
       if (!obj instanceof m) {
          objArray1 = objArray;
       }
       if (objArray1 != null) {
          objArray = objArray1.j();
       }
       return objArray;
    }
    public b a0(){
       Object obj = PatchProxy.apply(null, this, StickerPicturePreviewViewBinder.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b0().o0();
    }
    public boolean e0(){
       Object obj = PatchProxy.apply(null, this, StickerPicturePreviewViewBinder.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.b0().o0().y().f() && this.b0().u0().y().f())? true: false;
       return b;
    }
    public void h(boolean p0){
       StickerPicturePreviewViewBinder stickerPictu = StickerPicturePreviewViewBinder.class;
       if (PatchProxy.isSupport(stickerPictu) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, stickerPictu, "20")) {
          return;
       }
       super.h(p0);
       stickerPictu = this.M;
       if (!stickerPictu instanceof StickerPicturePreviewViewBinder$a) {
          stickerPictu = null;
       }
       if (stickerPictu != null) {
          stickerPictu.h(p0);
       }
       return;
    }
    public void l0(b p0,b p1){
       StickerPicturePreviewViewBinder stickerPictu = StickerPicturePreviewViewBinder.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, stickerPictu, "10")) {
          return;
       }
       a.p(p0, "newState");
       a.p(p1, "lastState");
       super.l0(p0, p1);
       StickerPicturePreviewViewBinder tM = this.M;
       if (!tM instanceof l) {
          tM = null;
       }
       if (tM != null) {
          tM.x(p0, p1);
       }
       int i = 0;
       if (!PatchProxy.applyVoidOneRefs(p0, this, stickerPictu, "11")) {
          Object[] objArray1 = new Object[i];
          a.D().w("PicturePreviewViewBinder", "handleTextTip: ", objArray1);
          if (this.Q()) {
             objArray1 = new Object[i];
             a.D().w("PicturePreviewViewBinder", "handleTextTip: mIsFromDraftAlbum = true", objArray1);
          }else if(this.R() != null){
             if (p0.q() && this.s0(p0)) {
                EditDecorationBaseDrawer uEditDecorat = this.P().H0();
                if (uEditDecorat instanceof NewEditStickerBaseDrawer && (uEditDecorat.stickerTextAvailable() && !uEditDecorat.getFinalRotate() - null)) {
                   Object[] objArray2 = new Object[i];
                   a.D().w("PicturePreviewViewBinder", "handleTextTip: shouldShowTextTip", objArray2);
                   this.R().postDelayed(new b(this, uEditDecorat), 200);
                }
             }else if(!this.R().getVisibility() && (!this.s0(p0) || p0.o() >= 0)){
                int i1 = 8;
                this.R().setVisibility(i1);
                TextView textView = this.U();
                if (textView != null && !textView.getVisibility()) {
                   this.U().setVisibility(i1);
                }
                textView = this.S();
                if (textView != null && !textView.getVisibility()) {
                   this.S().setVisibility(i1);
                }
             }
          }
       }
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, this, stickerPictu, "12")) {
          boolean b = true;
          boolean b1 = (!p0.B() && p1.B())? true: false;
          if (!p0.B() || p1.B()) {
             b = false;
          }
          Object[] objArray = new Object[i];
          a.D().w("PicturePreviewViewBinder", "handleSubPageState: isEnterLibrary = "+b+", isExitLibrary = "+b1, objArray);
          if (b1) {
             this.i0();
          }
          if (b) {
             this.h0();
          }
       }
       return;
    }
    public final void p0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StickerPicturePreviewViewBinder.class, "8")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("PicturePreviewViewBinder", "changeSubViewBinder: "+p0, objArray);
       StickerPicturePreviewViewBinder tM = this.M;
       if (tM != null) {
          tM.C();
       }
       this.M = p0;
       if (p0 != null) {
          p0.B();
       }
       return;
    }
    public final a q0(){
       Object obj = PatchProxy.apply(null, this, StickerPicturePreviewViewBinder.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.K.getValue();
    }
    public final a r0(Workspace$Type p0){
       a uoa;
       Object obj = PatchProxy.applyOneRefs(p0, this, StickerPicturePreviewViewBinder.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == Workspace$Type.LONG_PICTURE) {
          uoa = PatchProxy.apply(null, this, StickerPicturePreviewViewBinder.class, "1");
          if (uoa == PatchProxyResult.class) {
             uoa = this.J.getValue();
          }
       }else {
          uoa = this.q0();
       }
       return uoa;
    }
    public final boolean s0(b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, StickerPicturePreviewViewBinder.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!p0.y().f() && this.R.H() == null)? true: false;
       return b;
    }
    public final void t0(EditorItemFunc p0){
       a uoa;
       StickerPicturePreviewViewBinder stickerPictu = StickerPicturePreviewViewBinder.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, stickerPictu, "7")) {
          return;
       }
       int i = 0;
       boolean b = (p0 != null)? true: false;
       Workspace$Type type = this.R.getType();
       Object[] objArray = new Object[i];
       a.D().w("PicturePreviewViewBinder", "processTabShowOrHide: tabShow: "+b+", realWorkspaceType: "+type, objArray);
       if (!b || type != Workspace$Type.LONG_PICTURE) {
          a.o(type, "realWorkspaceType");
          this.p0(this.r0(type));
       }else if(p0 == EditorItemFunc.REORDER){
          uoa = this.q0();
       }else {
          uoa = PatchProxy.apply(null, this, stickerPictu, "3");
          if (uoa == PatchProxyResult.class) {
             uoa = this.L.getValue();
          }
       }
       this.p0(uoa);
       return;
    }
    public void x(a p0,a p1){
       this.l0(p0, p1);
    }
}
