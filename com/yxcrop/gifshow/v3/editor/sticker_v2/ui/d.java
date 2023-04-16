package com.yxcrop.gifshow.v3.editor.sticker_v2.ui.d;
import yld.l;
import nwc.a;
import ei0.a;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import smd.d;
import io.reactivex.subjects.PublishSubject;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.c;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import faa.a;
import q87.c;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.NewStickerLibraryFragment;
import com.yxcorp.gifshow.v3.editor.sticker.stickerlibrary.StickerLibraryFragment$c;
import nmd.h;
import java.util.List;
import java.util.Set;
import mrd.a;
import com.yxcorp.gifshow.v3.editor.sticker.stickerlibrary.StickerLibraryFragment$d;
import nmd.m;
import x59.e$d;
import com.yxcorp.gifshow.v3.editor.sticker.stickerlibrary.StickerLibraryFragment;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.v3.EditorActivity;
import com.yxcorp.gifshow.v3.AbsEditorActivityViewBinder;
import com.kwai.feature.post.api.widget.PostRadioGroupWithIndicator;
import android.widget.Button;
import java.util.Objects;
import crd.b;
import java.lang.Boolean;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.v3.f;
import com.yxcorp.gifshow.v3.previewer.listener.EditorFragmentBackPressedResult;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import mmd.b;
import com.yxcrop.gifshow.v3.editor.sticker_v2.action.StickerLibraryCloseAction;
import xvc.b;
import xld.a;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import com.yxcorp.gifshow.v3.editor.sticker.h1;

public final class d extends a implements l, a	// class@000aa7
{
    public final c c;
    public final boolean d;
    public BaseFragment e;
    public View f;
    public Button g;
    public View h;
    public boolean i;
    public final Fragment j;
    public final EditorDelegate k;
    public final d l;
    public final PublishSubject m;

    public void d(View p0,Fragment p1,EditorDelegate p2,d p3,PublishSubject p4){
       a.p(p0, "rootView");
       a.p(p1, "previewFragment");
       a.p(p2, "editorDelegate");
       a.p(p3, "viewModel");
       a.p(p4, "onClickListener");
       super(p0);
       this.j = p1;
       this.k = p2;
       this.l = p3;
       this.m = p4;
       c uoc = new c(p2);
       this.c = uoc;
       uoc.a(p1, p4, this.d, true);
       c uoc1 = PatchProxy.apply(null, uoc, c.class, "2");
       if (uoc1 != PatchProxyResult.class) {
       }else {
          Object[] objArray = new Object[0];
          a.D().s("NewStickerEditor", "onStart: ", objArray);
          NewStickerLibraryFragment newStickerLi = new NewStickerLibraryFragment();
          uoc.a = newStickerLi;
          StickerLibraryFragment$c uoc2 = new StickerLibraryFragment$c(uoc.b, uoc.c, uoc.g, new h(uoc));
          uoc2.b(uoc.f);
          uoc2.c(new m(uoc));
          newStickerLi.Th(uoc2);
          uoc.b();
          uoc1 = uoc.a;
       }
       a.o(uoc1, "mStoryStickerEditor.onStart\(\)");
       this.e = uoc1;
       return;
    }
    public void B(){
       Object[] objArray1;
       PostRadioGroupWithIndicator postRadioGro;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d.class, "4")) {
          return;
       }
       FragmentActivity activity = this.j.getActivity();
       if (!activity instanceof EditorActivity) {
          activity = objArray;
       }
       if (activity != null) {
          AbsEditorActivityViewBinder uAbsEditorAc = activity.N3();
          if (uAbsEditorAc != null) {
             View view = uAbsEditorAc.D();
          label_0027 :
             this.f = view;
             activity = this.j.getActivity();
             if (!activity instanceof EditorActivity) {
                objArray1 = objArray;
             }
             if (objArray1 != null) {
                uAbsEditorAc = objArray1.N3();
                if (uAbsEditorAc != null) {
                   postRadioGro = uAbsEditorAc.C();
                label_0044 :
                   this.h = postRadioGro;
                   activity = this.j.getActivity();
                   if (!activity instanceof EditorActivity) {
                      objArray1 = objArray;
                   }
                   if (objArray1 != null) {
                      uAbsEditorAc = objArray1.N3();
                      if (uAbsEditorAc != null) {
                         objArray = uAbsEditorAc.B();
                      }
                   }
                   this.g = objArray;
                   return;
                }
             }
             postRadioGro = objArray;
             goto label_0044 ;
          }
       }
       objArray1 = objArray;
       goto label_0027 ;
    }
    public void C(){
       if (PatchProxy.applyVoid(null, this, d.class, "5")) {
          return;
       }
       d tc = this.c;
       Objects.requireNonNull(tc);
       c uoc = c.class;
       if (!PatchProxy.applyVoid(null, tc, uoc, "4")) {
          int i = 0;
          Object[] objArray = new Object[i];
          a.D().s("NewStickerEditor", "onDestroy: ", objArray);
          if (!PatchProxy.applyVoid(null, tc, uoc, "3")) {
             Object[] objArray1 = new Object[i];
             a.D().s("NewStickerEditor", "onFinish: ", objArray1);
             uoc = tc.d;
             if (uoc != null) {
                uoc.dispose();
                tc.d = null;
             }
          }
          tc.a = null;
          tc.c.clear();
          tc.h = null;
       }
       return;
    }
    public final boolean D(){
       Object obj = PatchProxy.apply(null, this, d.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return f.E(this.k.getType());
    }
    public final void E(boolean p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, "7")) {
          return;
       }
       uod = this.f;
       float f = 0x3f800000;
       if (uod != null) {
          float f1 = (p0)? 0x3f800000: 0;
          uod.setAlpha(f1);
       }
       uod = this.f;
       if (uod != null) {
          View view = uod.findViewById(R.id.left_btn_container);
          if (view != null) {
             view.setClickable(p0);
          }
       }
       uod = this.h;
       if (uod != null) {
          if (!p0) {
             f = 0;
          }
          uod.setAlpha(f);
       }
       uod = this.h;
       if (uod != null) {
          uod.setEnabled(p0);
       }
       uod = this.g;
       if (uod != null) {
          uod.setClickable(p0);
       }
       return;
    }
    public EditorFragmentBackPressedResult onBackPressed(){
       Object obj = PatchProxy.apply(null, this, d.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.l.o0().B()) {
          return EditorFragmentBackPressedResult.PASS_EVENT;
       }
       this.l.t0(new StickerLibraryCloseAction());
       return EditorFragmentBackPressedResult.INTERCEPT_EVENT;
    }
    public void x(a p0,a p1){
       d uod = d.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uod, "1")) {
       }else {
          a.p(p0, "newState");
          a.p(p1, "lastState");
          if (!p0.B() && p1.B()) {
             Object[] objArray = new Object[0];
             a.D().w("StickerLibraryViewBinder", "hideStickerLibraryPanel: ", objArray);
             if (!PatchProxy.applyVoid(null, this, uod, "3")) {
                e uoe1 = this.j.getChildFragmentManager().beginTransaction();
                a.o(uoe1, "previewFragment.childFra¡­anager.beginTransaction\(\)");
                uoe1.s(this.e).o();
                if (this.D()) {
                   this.E(true);
                }
             }
          }
          if (p0.B() && !p1.B()) {
             Object[] objArray1 = new Object[0];
             a.D().w("StickerLibraryViewBinder", "showStickerLibraryPanel: ", objArray1);
             if (!PatchProxy.applyVoid(null, this, uod, "2")) {
                if (this.i == null) {
                   d tj = this.j;
                   Objects.requireNonNull(tj, "null cannot be cast to non-null type com.yxcorp.gifshow.recycler.fragment.BaseFragment");
                   this.c.a(tj, this.m, this.d, 0);
                   this.i = true;
                }
                e uoe = this.j.getChildFragmentManager().beginTransaction();
                uoe.y(R.anim.arg_RES_7f010105, 0x7f01010d);
                a.o(uoe, "previewFragment.childFra¡­anim.slide_out_to_bottom\)");
                if (this.e.isAdded()) {
                   uoe.E(this.e).o();
                }else {
                   Fragment uFragment = this.j.getChildFragmentManager().findFragmentByTag("StickerLibraryViewBinder");
                   if (uFragment != null) {
                      uoe.u(uFragment);
                   }
                   uoe.g(R.id.sticker_container, this.e, "StickerLibraryViewBinder");
                   uoe.o();
                }
                h1.o();
                if (this.D()) {
                   this.E(0);
                }
             }
          }
       }
    label_00e8 :
       return;
    }
}
