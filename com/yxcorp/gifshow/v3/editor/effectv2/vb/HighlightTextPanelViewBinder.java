package com.yxcorp.gifshow.v3.editor.effectv2.vb.HighlightTextPanelViewBinder;
import nwc.a;
import pqc.a;
import ei0.a;
import com.yxcorp.gifshow.v3.editor.effectv2.vb.HighlightTextPanelViewBinder$c;
import nsd.u;
import androidx.fragment.app.Fragment;
import android.view.View;
import com.yxcorp.gifshow.v3.editor.i;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import lnc.a1;
import com.yxcorp.gifshow.v3.editor.effectv2.vb.HighlightTextPanelViewBinder$keyboardOffsetLiveData$2;
import msd.a;
import qrd.p;
import qrd.s;
import android.content.Context;
import com.yxcorp.utility.n;
import tyc.f2;
import android.app.Activity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import qqc.d;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import android.widget.LinearLayout;
import com.yxcorp.gifshow.v3.editor.effectv2.vb.HighlightTextPanelViewBinder$a;
import android.view.View$OnClickListener;
import cq.a;
import q87.c;
import com.yxcorp.gifshow.v3.editor.effectv2.vb.HighlightTextPanelViewBinder$b;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import com.kwai.robust.PatchProxy;
import android.os.Build$VERSION;
import androidx.fragment.app.FragmentActivity;
import com.kwai.robust.PatchProxyResult;
import java.lang.Float;
import java.lang.StringBuilder;
import android.animation.ObjectAnimator;
import ekd.e0;
import java.lang.Math;
import kqc.c;
import kqc.g;
import androidx.fragment.app.KwaiDialogFragment;
import com.yxcorp.gifshow.v3.editor.effectv2.widget.HighlightTitleDialogFragment;
import com.yxcorp.gifshow.v3.widget.TextBasePanelFragment;
import androidx.fragment.app.c;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import com.yxcorp.gifshow.v3.previewer.listener.EditorFragmentBackPressedResult;
import com.yxcorp.gifshow.v3.editor.effectv2.action.HighlightTextPanelCloseAction;
import xvc.b;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;

public final class HighlightTextPanelViewBinder extends a implements a, a	// class@000f64
{
    public final int c;
    public final View d;
    public f2 e;
    public final p f;
    public int g;
    public HighlightTitleDialogFragment h;
    public float i;
    public boolean j;
    public int k;
    public final View l;
    public ObjectAnimator m;
    public final f2 n;
    public final d o;
    public final Fragment p;
    public final View q;
    public final i r;
    public final EditReduxViewModel s;
    public static final HighlightTextPanelViewBinder$c t;

    static {
       HighlightTextPanelViewBinder.t = new HighlightTextPanelViewBinder$c(null);
    }
    public void HighlightTextPanelViewBinder(Fragment p0,View p1,i p2,EditReduxViewModel p3){
       a.p(p0, "previewFragment");
       a.p(p1, "rootView");
       a.p(p2, "editHelperContract");
       a.p(p3, "clipViewModel");
       EditorDelegate uEditorDeleg = p2.f();
       a.o(uEditorDeleg, "editHelperContract.editorDelegate");
       View view = uEditorDeleg.z();
       a.o(view, "editHelperContract.editorDelegate.previewView");
       super(view);
       this.p = p0;
       this.q = p1;
       this.r = p2;
       this.s = p3;
       this.c = a1.e(72.00f);
       View view1 = p0.requireView();
       a.o(view1, "previewFragment.requireView\(\)");
       this.d = view1;
       this.f = s.c(HighlightTextPanelViewBinder$keyboardOffsetLiveData$2.INSTANCE);
       this.g = n.u(p0.getContext());
       this.k = -1;
       view1 = view1.findViewById(R.id.preview);
       a.o(view1, "previewView.findViewById\(R.id.preview\)");
       this.l = view1;
       EditorDelegate uEditorDeleg1 = p2.f();
       a.o(uEditorDeleg1, "editHelperContract.editorDelegate");
       Activity context = uEditorDeleg1.getContext();
       a.o(context, "editHelperContract.editorDelegate.context");
       f2 uof2 = new f2(context, new MutableLiveData());
       this.n = uof2;
       ViewModel viewModel = ViewModelProviders.of(p0).get(d.class);
       a.o(viewModel, "ViewModelProviders.of\(pr¡­ectViewModel::class.java\)");
       this.o = viewModel;
       p1 = p1.findViewById(R.id.click_open_text_panel);
       a.o(p1, "rootView.findViewById\(R.id.click_open_text_panel\)");
       p1.setOnClickListener(new HighlightTextPanelViewBinder$a(this));
       Object[] objArray = new Object[0];
       a.D().w("KeyBoardPanelBaseViewBinder", "init", objArray);
       uof2.d();
       this.E().observe(p0, new HighlightTextPanelViewBinder$b(this));
    }
    public void B(){
       if (PatchProxy.applyVoid(null, this, HighlightTextPanelViewBinder.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("KeyBoardPanelBaseViewBinder", "onAttach", objArray);
       if (this.e == null) {
          this.n.a(this.E());
          this.n.d();
       }
       HighlightTextPanelViewBinder te = this.e;
       if (te != null) {
          te.d();
       }
       return;
    }
    public void C(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, HighlightTextPanelViewBinder.class, "3")) {
          return;
       }
       Object[] objArray1 = new Object[0];
       a.D().w("KeyBoardPanelBaseViewBinder", "onDetach", objArray1);
       HighlightTextPanelViewBinder te = this.e;
       if (te == null) {
          this.n.c(this.E());
       }else {
          a.m(te);
          te.b();
          this.e = objArray;
       }
       return;
    }
    public final void D(){
       if (PatchProxy.applyVoid(null, this, HighlightTextPanelViewBinder.class, "6")) {
          return;
       }
       if (Build$VERSION.SDK_INT < 23) {
          View view = new View(this.p.requireContext());
          view.setFocusable(true);
          view.setFocusableInTouchMode(true);
          view.requestFocus();
       }else {
          n.C(this.p.getActivity());
       }
       return;
    }
    public final MutableLiveData E(){
       Object obj = PatchProxy.apply(null, this, HighlightTextPanelViewBinder.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.f.getValue();
    }
    public final void F(float p0,float p1){
       HighlightTextPanelViewBinder highlightTex = HighlightTextPanelViewBinder.class;
       if (PatchProxy.isSupport(highlightTex) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, highlightTex, "8")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("KeyBoardPanelBaseViewBinder", "previewPullUpAnimation start = "+p0+" end = "+p1+' ', objArray);
       highlightTex = this.m;
       int i = 1;
       if (highlightTex != null && highlightTex.isRunning() == i) {
          highlightTex = this.m;
          if (highlightTex != null) {
             highlightTex.cancel();
          }
       }
       float[] uofloatArray = new float[]{p0,p1};
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(this.l, "translationY", uofloatArray).setDuration((long)((double)n.P(e0.b, Math.abs((p0 - p1))) * 0x3ff8000000000000));
       this.m = objectAnimat;
       if (objectAnimat != null) {
          objectAnimat.start();
       }
       return;
    }
    public void n(c p0,c p1){
       HighlightTextPanelViewBinder highlightTex = HighlightTextPanelViewBinder.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, highlightTex, "11")) {
          return;
       }
       a.p(p0, "newState");
       a.p(p1, "lastState");
       if (p0.j().g() == p1.j().g()) {
          return;
       }
       String str = "5";
       if (!p0.j().g()) {
          this.D();
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, this, highlightTex, str)) {
             Object[] objArray1 = new Object[false];
             a.D().w("KeyBoardPanelBaseViewBinder", "releaseTextPanelPopup", objArray1);
             HighlightTextPanelViewBinder th = this.h;
             if (th != null) {
                th.dismiss();
             }
             this.h = objArray;
          }
          if (!PatchProxy.applyVoid(objArray, this, highlightTex, "9") && this.j != null) {
             this.F(this.l.getTranslationY(), this.i);
             this.i = 0;
             this.j = false;
          }
       }else {
          FragmentActivity activity = this.p.getActivity();
          a.m(activity);
          View view = activity.findViewById(0x1020002);
          a.o(view, "previewFragment.activity¡­ew>\(android.R.id.content\)");
          this.g = view.getHeight();
          if (this.h == null) {
             EditorDelegate uEditorDeleg = this.r.f();
             a.o(uEditorDeleg, "editHelperContract.editorDelegate");
             HighlightTitleDialogFragment highlightTit = new HighlightTitleDialogFragment(uEditorDeleg);
             this.h = highlightTit;
             highlightTit.t = this.c;
             highlightTit.u = this.g;
             highlightTit.p = this.g;
             highlightTex = this.o;
             HighlightTextPanelViewBinder ts = this.s;
             if (!PatchProxy.applyVoidTwoRefs(highlightTex, ts, highlightTit, HighlightTitleDialogFragment.class, str)) {
                a.p(highlightTex, "viewModel");
                a.p(ts, "clipViewModel");
                highlightTit.C = highlightTex;
                highlightTit.F = ts;
             }
          }
          HighlightTextPanelViewBinder th1 = this.h;
          if (th1 != null) {
             th1.show(this.p.getChildFragmentManager(), "HighlightTitlePanel");
          }
          VideoSDKPlayerView videoSDKPlay = this.r.j();
          if (videoSDKPlay != null) {
             videoSDKPlay.pause();
          }
       }
    label_00e7 :
       return;
    }
    public EditorFragmentBackPressedResult onBackPressed(){
       HighlightTextPanelViewBinder obj = PatchProxy.apply(null, this, HighlightTextPanelViewBinder.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[0];
       a.D().w("KeyBoardPanelBaseViewBinder", "onBackPressed", objArray);
       this.o.t0(new HighlightTextPanelCloseAction());
       obj = this.h;
       if (obj != null) {
          Dialog dialog = obj.getDialog();
          if (dialog != null && dialog.isShowing() == true) {
             return EditorFragmentBackPressedResult.INTERCEPT_EVENT;
          }
       }
       return EditorFragmentBackPressedResult.PASS_EVENT;
    }
}
