package com.yxcorp.gifshow.v3.editor.sticker.tag.a;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.lifecycle.MutableLiveData;
import com.yxcorp.gifshow.v3.editor.sticker.tag.a$a;
import com.yxcorp.gifshow.v3.editor.sticker.tag.a$b;
import com.yxcorp.gifshow.v3.editor.sticker.tag.a$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.v3.editor.i;
import com.yxcorp.gifshow.v3.customizer.preview.BaseEditorPreviewContainerLayout;
import com.kuaishou.edit.draft.Workspace$Type;
import android.view.View;
import android.view.ViewParent;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import stc.e;
import java.lang.Runnable;
import android.widget.AbsoluteLayout;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.Fragment;
import lwc.h;
import com.yxcorp.gifshow.v3.f;
import com.yxcorp.gifshow.v3.previewer.PhotosEditPreviewV3Fragment;
import com.yxcorp.gifshow.v3.previewer.VideoEditPreviewV3Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.yxcorp.gifshow.v3.editor.sticker.element.vm.StickerElementViewModel;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import androidx.fragment.app.FragmentActivity;
import tyc.f2;
import android.widget.PopupWindow;
import qvc.b;
import com.yxcorp.gifshow.v3.editor.sticker.drawer.EditTagStickerElement;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$d;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import com.yxcorp.utility.n;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Float;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import android.animation.ObjectAnimator;
import ekd.e0;
import java.lang.Math;
import android.content.Context;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import aw9.z;
import com.yxcorp.gifshow.v3.editor.sticker.drawer.EditStickerBaseDrawer;
import ttc.e;
import android.content.Intent;
import stc.d;
import z1.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.EditText;
import stc.h;
import java.util.Map;
import java.util.HashMap;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;

public class a extends PresenterV2 implements g	// class@0012b6
{
    public e A;
    public EditTagStickerElement B;
    public boolean C;
    public StickerElementViewModel D;
    public final MutableLiveData E;
    public final b F;
    public Observer G;
    public DecorationContainerView$e H;
    public boolean p;
    public BaseEditorFragment q;
    public EditDecorationContainerView r;
    public EditDecorationContainerView s;
    public z t;
    public h u;
    public boolean v;
    public float w;
    public ObjectAnimator x;
    public i y;
    public View z;

    public void a(){
       super();
       this.p = false;
       this.v = false;
       this.w = 0;
       this.C = false;
       this.D = null;
       this.E = new MutableLiveData();
       this.F = new a$a(this);
       this.G = new a$b(this);
       this.H = new a$c(this);
    }
    public void E8(){
       a ty;
       View parent;
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "2")) {
          return;
       }
       if (this.getActivity() == null) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uoa, "4")) {
          ty = this.y;
          e uoe = 0x7f0a31cc;
          if (ty != null) {
             this.z = ty.f().J();
             Workspace$Type type = this.y.f().getType();
             if (type == Workspace$Type.SINGLE_PICTURE || (type != Workspace$Type.ATLAS && (type == Workspace$Type.LONG_PICTURE && this.z.getId() != uoe))) {
             }
          }else {
             this.z = this.m8().findViewById(0x7f0a31f0);
          }
       }
    label_0069 :
       if (this.r == null) {
          this.r = this.m8().findViewById(0x7f0a0a6c);
       }
       if (this.s == null) {
          this.s = this.m8().findViewById(0x7f0a2db3);
       }
       this.r.post(new e(this));
       ty = this.y;
       if (ty != null) {
          this.u = f.l(ty.f().q());
       }else {
          ty = this.q;
          if (ty instanceof PhotosEditPreviewV3Fragment || ty instanceof VideoEditPreviewV3Fragment) {
             this.u = f.l(ty);
          }
       }
       ty = this.q;
       if (ty instanceof PhotosEditPreviewV3Fragment) {
          this.D = ViewModelProviders.of(ty).get(StickerElementViewModel.class);
       }
       if (!PatchProxy.applyVoid(objArray, this, uoa, "6")) {
          this.E.observe(this.q, this.G);
          uoa = this.u;
          if (uoa != null) {
             uoa.I0(this.q.requireActivity(), this.E);
          }else {
             new f2(this.q.requireActivity(), this.E).d();
          }
       }
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "3")) {
          return;
       }
       a tA = this.A;
       if (tA != null) {
          tA.dismiss();
          this.A = objArray;
       }
       tA = this.B;
       if (tA != null) {
          tA.removeOnTextChangeWatcher(this.F);
       }
       tA = this.u;
       if (tA != null && tA.x0() != null) {
          this.u.x0().c(this.E);
       }
       tA = this.r;
       if (tA != null) {
          tA.M(this.H);
       }
       return;
    }
    public void P8(){
       a ts;
       if (PatchProxy.applyVoid(null, this, a.class, "10")) {
          return;
       }
       if (this.C == null) {
          return;
       }
       if (this.R8()) {
          ts = this.s;
          if (ts != null) {
             ts.setIgnoreAllTouchEvent(false);
          }
       }
       n.C(this.getActivity());
       this.C = false;
       ts = this.D;
       if (ts != null) {
          ts.u0(false);
       }
       this.p = false;
       if (this.v != null) {
          this.S8(this.z.getTranslationY(), this.w);
          this.w = 0;
          this.v = false;
       }
       this.B = null;
       return;
    }
    public final boolean R8(){
       a obj = PatchProxy.apply(null, this, a.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.u;
       boolean b = (obj != null && obj.i.a1() == Workspace$Type.SINGLE_PICTURE)? true: false;
       return b;
    }
    public final void S8(float p0,float p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, uoa, "9")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("StickerInputPresenter", "previewPullUpAnimation start = "+p0+" end = "+p1, objArray);
       uoa = this.x;
       if (uoa != null && uoa.isRunning()) {
          this.x.cancel();
       }
       float[] uofloatArray = new float[]{p0,p1};
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(this.z, "translationY", uofloatArray).setDuration((long)((double)n.P(e0.b, Math.abs((p0 - p1))) * 0x3ff8000000000000));
       this.x = objectAnimat;
       objectAnimat.start();
       return;
    }
    public void V8(boolean p0,EditDecorationBaseDrawer p1){
       a ts;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoa, "7")) {
          return;
       }
       a tt = this.t;
       if (tt != null) {
          tt.pause();
       }
       if (!EditStickerBaseDrawer.isTagSticker(p1)) {
          this.p = false;
          return;
       }else {
          Object[] objArray = new Object[false];
          a.D().w("StickerInputPresenter", "startTextEditor", objArray);
          Object[] objArray1 = null;
          if (!PatchProxy.applyVoid(objArray1, this, uoa, "5") && this.A == null) {
             FragmentActivity uFragmentAct = this.q.requireActivity();
             String str = PatchProxy.apply(objArray1, this, uoa, "11");
             if (str != PatchProxyResult.class) {
             }else {
                Intent intent = this.getActivity().getIntent();
                if (intent != null) {
                   str = intent.getStringExtra("editSessionId");
                   if (str != null) {
                   label_006b :
                      this.A = new e(uFragmentAct, str, new d(this));
                   }
                }
                str = "";
                goto label_006b ;
             }
          }
          this.p = true;
          this.B = p1;
          if (p0 && !TextUtils.x(p1.getContent())) {
             return;
          }else {
             this.B.setAcceptTouchEvent(true);
             this.B.addOnTextChangeWatcher(this.F);
             EditText editText = this.B.getEditText();
             editText.setFocusable(true);
             editText.setFocusableInTouchMode(true);
             if (!editText.hasFocus()) {
                editText.requestFocus();
             }
             n.a0(this.r.getContext(), editText, false);
             this.C = true;
             if (this.R8()) {
                ts = this.s;
                if (ts != null) {
                   ts.setIgnoreAllTouchEvent(true);
                }
             }
             ts = this.D;
             if (ts != null) {
                ts.u0(true);
             }
             return;
          }
       }
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new h();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, a.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(a.class, new h());
       }else {
          obj.put(a.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.r = this.t8("DECORATION_CONTAINER_VIEW");
       this.t = this.t8("DECORATION_PLAYER");
       this.y = this.t8("EDITOR_HELPER_CONTRACT");
       this.q = this.r8("FRAGMENT");
       return;
    }
}
