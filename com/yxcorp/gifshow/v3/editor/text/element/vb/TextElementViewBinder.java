package com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder;
import nwc.a;
import ei0.a;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.v3.editor.text.font.FontVMDelegate;
import android.view.View;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel;
import t36.f;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import wuc.j;
import androidx.fragment.app.FragmentActivity;
import android.view.Window;
import android.app.Activity;
import android.content.Context;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder$mDisposable$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import com.yxcorp.gifshow.widget.PassThroughEventView;
import com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder$n;
import com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder$p;
import androidx.lifecycle.LiveData;
import com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder$d;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import di0.b;
import com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder$e;
import com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder$f;
import androidx.lifecycle.MutableLiveData;
import com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder$g;
import com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder$h;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder$a;
import com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder$b;
import androidx.lifecycle.Lifecycle;
import com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder$7;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder$i;
import com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder$j;
import com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder$c;
import com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder$o;
import crd.a;
import android.os.Build$VERSION;
import android.widget.AbsoluteLayout;
import com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder$k;
import java.lang.Runnable;
import java.lang.Boolean;
import com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder$dismissPopup$1;
import java.util.Objects;
import faa.a;
import q87.c;
import com.yxcorp.gifshow.v3.editor.text.textpanel.TextPanelDialogFragment;
import com.yxcorp.gifshow.v3.editor.text.element.EditTextBaseElement;
import java.lang.CharSequence;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import juc.b;
import com.yxcorp.gifshow.v3.editor.text.model.TextDrawConfigParam;
import com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder$l;
import erd.r;
import java.util.List;
import java.util.Collection;
import com.yxcorp.gifshow.decoration.drawer.DecorationDrawer;
import java.lang.StringBuilder;
import java.lang.RuntimeException;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder$m;
import t36.f$a;
import com.yxcorp.gifshow.v3.editor.text.widget.TextDrawerLayout;
import java.lang.Float;
import android.animation.ObjectAnimator;
import ekd.e0;
import java.lang.Math;
import com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder$q;
import yuc.d;
import com.yxcorp.gifshow.v3.editor.text.font.FontPopupWindow;
import yuc.e;
import android.widget.PopupWindow$OnDismissListener;
import android.widget.PopupWindow;
import androidx.fragment.app.KwaiDialogFragment;
import com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder$r;
import java.lang.Integer;
import com.yxcorp.gifshow.v3.editor.text.model.EditTextBaseElementData;
import wuc.d;
import wuc.e;
import wuc.f;
import com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder$s;
import android.widget.EditText;
import com.yxcorp.gifshow.v3.previewer.listener.EditorFragmentBackPressedResult;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;

public final class TextElementViewBinder extends a implements a	// class@001416
{
    public final TextElementViewModel A;
    public final f B;
    public f C;
    public f D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public FontPopupWindow c;
    public TextPanelDialogFragment d;
    public final j e;
    public View f;
    public int g;
    public boolean h;
    public final int i;
    public final p j;
    public EditDecorationContainerView k;
    public final VideoSDKPlayerView l;
    public final View m;
    public float n;
    public boolean o;
    public ObjectAnimator p;
    public PassThroughEventView q;
    public boolean r;
    public AttrAnimProgressFragment s;
    public int t;
    public final TextElementViewBinder$n u;
    public final TextElementViewBinder$p v;
    public final TextElementViewBinder$o w;
    public final boolean x;
    public final Fragment y;
    public final FontVMDelegate z;

    public void TextElementViewBinder(boolean p0,Fragment p1,FontVMDelegate p2,View p3,TextElementViewModel p4,f p5,f p6,f p7,boolean p8,boolean p9,boolean p10,boolean p11,boolean p12){
       View decorView;
       a.p(p1, "fragment");
       a.p(p2, "fontVMDelegate");
       a.p(p3, "rootView");
       a.p(p4, "mTextElementViewModel");
       super(p3);
       this.x = p0;
       this.y = p1;
       this.z = p2;
       this.A = p4;
       this.B = p5;
       this.C = p6;
       this.D = p7;
       this.E = p9;
       this.F = p10;
       this.G = p11;
       this.H = p12;
       this.e = new j();
       FragmentActivity activity = p1.getActivity();
       if (activity != null) {
          Window window = activity.getWindow();
          if (window != null) {
             decorView = window.getDecorView();
          label_0047 :
             this.f = decorView;
             this.g = n.u(p1.getContext());
             this.i = n.y(p1.getContext());
             this.j = s.c(TextElementViewBinder$mDisposable$2.INSTANCE);
             if (p0) {
                decorView = p3.findViewById(R.id.cover_decoration_editor_view);
                a.o(decorView, "rootView.findViewById\(R.¡­r_decoration_editor_view\)");
             }else {
                decorView = p3.findViewById(R.id.decoration_editor_view);
                a.o(decorView, "rootView.findViewById\(R.id.decoration_editor_view\)");
             }
             this.k = decorView;
             VideoSDKPlayerView videoSDKPlay = (p8)? null: p3.findViewById(R.id.player);
             this.l = videoSDKPlay;
             View view = p3.findViewById(R.id.preview);
             a.o(view, "rootView.findViewById\(R.id.preview\)");
             this.m = view;
             p3 = p3.findViewById(R.id.touch_view);
             a.o(p3, "rootView.findViewById\(R.id.touch_view\)");
             this.q = p3;
             this.t = -1;
             this.u = new TextElementViewBinder$n(this);
             TextElementViewBinder$p op = new TextElementViewBinder$p(this);
             this.v = op;
             if (!p0 && p5 != null) {
                p5.d(op);
             }
             p4.L0().observe(p1, new TextElementViewBinder$d(this));
             p4.R0().observe(p1, new TextElementViewBinder$e(this));
             p4.x.observe(p1, new TextElementViewBinder$f(this));
             p4.P0().observe(p1, new TextElementViewBinder$g(this));
             p4.v.observe(p1, new TextElementViewBinder$h(this));
             if (videoSDKPlay != null) {
                LiveData liveData = PatchProxy.apply(null, p4, TextElementViewModel.class, "10");
                if (liveData == PatchProxyResult.class) {
                   liveData = p4.y.getValue();
                }
                liveData.observe(p1, new TextElementViewBinder$a(this));
                p4.i.observe(p1, new TextElementViewBinder$b(videoSDKPlay, this));
             }
             p1.getLifecycle().addObserver(new TextElementViewBinder$7(this));
             p4.D0().observe(p1, new TextElementViewBinder$i(this));
             p4.I0().observe(p1, new TextElementViewBinder$j(this));
             p4.K0().observe(p1, new TextElementViewBinder$c(this));
             this.w = new TextElementViewBinder$o(this);
             return;
          }
       }
       decorView = null;
       goto label_0047 ;
    }
    public static void F(TextElementViewBinder p0,boolean p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = false;
       }
       p0.E(p1);
       return;
    }
    public void C(){
       if (PatchProxy.applyVoid(null, this, TextElementViewBinder.class, "24")) {
          return;
       }
       this.K().dispose();
       return;
    }
    public final void D(){
       if (PatchProxy.applyVoid(null, this, TextElementViewBinder.class, "16")) {
          return;
       }
       if (Build$VERSION.SDK_INT < 23) {
          View view = new View(this.y.requireContext());
          this.k.addView(view);
          view.setFocusable(true);
          view.setFocusableInTouchMode(true);
          view.requestFocus();
          this.k.post(new TextElementViewBinder$k(this, view));
       }else {
          n.C(this.y.getActivity());
       }
       return;
    }
    public final void E(boolean p0){
       Object[] objArray1;
       TextElementViewBinder textElementV = TextElementViewBinder.class;
       if (PatchProxy.isSupport(textElementV) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, textElementV, "10")) {
          return;
       }
       int i = 0;
       if (this.x == null) {
          TextElementViewBinder tE = this.E;
          if (tE != null || this.H != null) {
             if (this.H != null) {
                this.D();
             }else if(tE != null){
                textElementV = this.e;
                tE = this.d;
                TextElementViewBinder$dismissPopup$1 uodismissPop = new TextElementViewBinder$dismissPopup$1(this, p0);
                Objects.requireNonNull(textElementV);
                if (!PatchProxy.applyVoidTwoRefs(tE, uodismissPop, textElementV, j.class, "2")) {
                   a.p(uodismissPop, "dismissFun");
                   if (tE == null) {
                      Object[] objArray = new Object[i];
                      a.D().s("TextPanelDialogStateController", "dialog is null or unfold, do nothing", objArray);
                   }else if(textElementV.a != null && tE.Ch()){
                      objArray1 = new Object[i];
                      a.D().s("TextPanelDialogStateController", "keyboardShow changPanelStateChange to unfold", objArray1);
                      tE.vh(i);
                      textElementV.a = i;
                   }else if(textElementV.b != null){
                      objArray1 = new Object[i];
                      a.D().s("TextPanelDialogStateController", "real dismiss dialog", objArray1);
                      uodismissPop.invoke();
                      textElementV.b = i;
                   }
                }
             }
          }else if(this.h != null){
             if (p0) {
                this.S();
             }else {
                n.C(this.y.getActivity());
                if (!PatchProxy.applyVoid(null, this, textElementV, "20") && !this.A.T0()) {
                   Object[] objArray2 = new Object[i];
                   a.D().s("TextElementViewBinder", "dismissFontPopup", objArray2);
                   this.S();
                }
             }
          }else {
             n.C(this.y.getActivity());
          }
       }else {
          goto label_008b ;
       }
       return;
    }
    public final void G(EditTextBaseElement p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextElementViewBinder.class, "26")) {
          return;
       }
       if (p0 != null) {
          boolean b = (!p0.getText().length())? true: false;
          if (b && (PostExperimentUtils.t1() && (PostExperimentUtils.u1() && this.G != null))) {
             this.A.z1(p0.getLayerIndex(), p0.getEditPainter().r().g(), 24);
          }
       }
    label_0043 :
       return;
    }
    public final EditTextBaseElement H(){
       DecorationDrawer obj1;
       Object[] objArray = null;
       List obj = PatchProxy.apply(objArray, this, TextElementViewBinder.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = "null cannot be cast to non-null type com.yxcorp.gifshow.v3.editor.text.element.EditTextBaseElement<out com.yxcorp.gifshow.v3.editor.text.model.EditTextBaseElementData>";
       if (this.A.T0()) {
          obj = this.k.o0(TextElementViewBinder$l.b);
          a.o(obj, "mContainerView.findEleme¡­InSubtitle\(\)\n          }\)");
          if (obj.isEmpty() ^ 0x01) {
             obj1 = obj.get(0);
             Objects.requireNonNull(obj1, str);
             return obj1;
          }
       }else if(this.k.getTopDecorationDrawer() instanceof EditTextBaseElement){
          obj1 = this.k.getTopDecorationDrawer();
          Objects.requireNonNull(obj1, str);
          return obj1;
       }else {
          obj1 = this.k.getTopDecorationDrawer();
          if (obj1 != null) {
             ExceptionHandler.handleCaughtException(new RuntimeException("TextElementViewBinder "+obj1.getClass()+" does not match EditTextBaseElement"));
          }
       }
       return objArray;
    }
    public final Fragment I(){
       return this.y;
    }
    public final EditDecorationContainerView J(){
       return this.k;
    }
    public final a K(){
       Object obj = PatchProxy.apply(null, this, TextElementViewBinder.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.j.getValue();
    }
    public final VideoSDKPlayerView L(){
       return this.l;
    }
    public final PassThroughEventView M(){
       return this.q;
    }
    public final boolean N(){
       return this.x;
    }
    public final boolean P(){
       TextElementViewBinder obj = PatchProxy.apply(null, this, TextElementViewBinder.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.x;
       boolean b = true;
       if (obj == null && this.E != null) {
          if (this.d == null || !this.e.a()) {
             b = false;
          }
       }else if(obj != null && (this.A.H0() && this.t == null)){
          obj = this.D;
          if (obj != null) {
             obj.s0(TextElementViewBinder$m.a);
          }
       }else {
          b = this.h;
       }
       return b;
    }
    public final void Q(EditTextBaseElement p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextElementViewBinder.class, "4")) {
          return;
       }
       if (p0 != null) {
          TextDrawerLayout textDrawerLa = p0.getTextDrawerLayout();
          if (textDrawerLa != null) {
             textDrawerLa.g();
          }
       }
       if (p0 != null) {
          TextDrawerLayout textDrawerLa1 = p0.getTextDrawerLayout();
          if (textDrawerLa1 != null) {
             textDrawerLa1.setAcceptEvent(false);
          }
       }
       this.G(p0);
       TextElementViewBinder.F(this, false, 1, null);
       return;
    }
    public final void R(float p0,float p1){
       TextElementViewBinder textElementV = TextElementViewBinder.class;
       if (PatchProxy.isSupport(textElementV) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, textElementV, "14")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("TextElementViewBinder", "previewPullUpAnimation start = "+p0+" end = "+p1+' ', objArray);
       textElementV = this.p;
       int i = 1;
       if (textElementV != null && textElementV.isRunning() == i) {
          textElementV = this.p;
          if (textElementV != null) {
             textElementV.cancel();
          }
       }
       float[] uofloatArray = new float[]{p0,p1};
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(this.m, "translationY", uofloatArray).setDuration((long)((double)n.P(e0.b, Math.abs((p0 - p1))) * 0x3ff8000000000000));
       this.p = objectAnimat;
       if (objectAnimat != null) {
          objectAnimat.start();
       }
       return;
    }
    public final void S(){
       TextElementViewBinder tB;
       if (PatchProxy.applyVoid(null, this, TextElementViewBinder.class, "21")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("TextElementViewBinder", "releasePopup", objArray);
       if (this.r != null) {
          tB = this.B;
          if (tB != null) {
             tB.s0(new TextElementViewBinder$q(this));
          }
       }
       tB = this.c;
       if (tB != null) {
          tB.d(null);
          tB.e(null);
          tB.setOnDismissListener(null);
          tB.dismiss();
       }
       this.c = null;
       this.h = false;
       return;
    }
    public final void T(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, TextElementViewBinder.class, "17")) {
          return;
       }
       Object[] objArray1 = new Object[0];
       a.D().s("TextElementViewBinder", "releaseTextPanelPopup", objArray1);
       TextElementViewBinder td = this.d;
       if (td != null) {
          td.dismiss();
       }
       this.d = objArray;
       td = this.B;
       if (td != null) {
          td.s0(new TextElementViewBinder$r(this));
       }
       if (this.o != null) {
          this.R(this.m.getTranslationY(), this.n);
          this.n = 0;
       }
       return;
    }
    public final void U(int p0,int p1){
       TextElementViewBinder textElementV = TextElementViewBinder.class;
       if (PatchProxy.isSupport(textElementV) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, textElementV, "19")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("TextElementViewBinder", "showFontPopup", objArray);
       EditTextBaseElement uEditTextBas = this.H();
       if (uEditTextBas != null) {
          EditTextBaseElementData editTextBase = uEditTextBas.getEditTextBaseElementData();
          if (editTextBase != null) {
             TextDrawConfigParam textDrawConf = editTextBase.C0();
             if (textDrawConf != null && !textDrawConf.i()) {
                return;
             }
          }
       }
       this.h = true;
       this.r = true;
       TextElementViewBinder tc = this.c;
       if (tc == null) {
          if (!PatchProxy.applyVoid(null, this, textElementV, "22")) {
             FontPopupWindow uFontPopupWi = new FontPopupWindow(this.y, this.z);
             this.c = uFontPopupWi;
             uFontPopupWi.d(new d(this));
             uFontPopupWi.e(new e(uFontPopupWi, this));
             uFontPopupWi.setOnDismissListener(new f(this));
          }
       }else {
          a.m(tc);
          if (tc.isShowing()) {
             textElementV = this.c;
             if (textElementV != null) {
                textElementV.update(p0, p1, textElementV.getWidth(), textElementV.getHeight());
             }
             return;
          }
       }
       textElementV = this.B;
       if (textElementV != null) {
          textElementV.s0(TextElementViewBinder$s.a);
       }
       textElementV = this.c;
       if (textElementV != null) {
          tc = this.f;
          if (!PatchProxy.isSupport(FontPopupWindow.class) || !PatchProxy.applyVoidThreeRefs(tc, Integer.valueOf(p0), Integer.valueOf(p1), textElementV, FontPopupWindow.class, "3")) {
             textElementV.showAtLocation(tc, 48, p0, (p1 - textElementV.e));
          }
       }
       return;
    }
    public final void V(){
       TextElementViewBinder textElementV = TextElementViewBinder.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, textElementV, "7")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, textElementV, "25")) {
          FragmentActivity activity = this.y.getActivity();
          a.m(activity);
          View view = activity.findViewById(0x1020002);
          a.o(view, "fragment.activity!!.find¡­ew>\(android.R.id.content\)");
          this.g = view.getHeight();
          Object[] objArray2 = new Object[0];
          a.D().s("TextPanelDialogFragment", "mCorrectScreenHeight: "+this.g, objArray2);
       }
       Object[] objArray1 = new Object[0];
       a.D().s("TextElementViewBinder", "startTextEditor", objArray1);
       textElementV = this.c;
       if (textElementV != null) {
          a.m(textElementV);
          if (textElementV.isShowing()) {
             return;
          }
       }
       if (this.H == null) {
          textElementV = this.l;
          if (textElementV != null) {
             textElementV.pause();
          }
       }
       EditTextBaseElement topElement = this.k.getTopElement();
       if (topElement != null) {
          topElement.getTextDrawerLayout().setAcceptEvent(true);
          EditText focusEditTex = topElement.getTextDrawerLayout().getFocusEditText();
          focusEditTex.setFocusable(true);
          focusEditTex.setFocusableInTouchMode(true);
          if (!focusEditTex.hasFocus()) {
             focusEditTex.requestFocus();
          }
          n.a0(this.k.getContext(), focusEditTex, 0);
       }
       return;
    }
    public final void W(EditTextBaseElement p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TextElementViewBinder.class, "23")) {
          return;
       }
       if (p0.getEditTextBaseElementData().y0()) {
          this.A.p1(p0.getLayerIndex(), p1);
       }else {
          TextElementViewModel.x1(this.A, p0.getLayerIndex(), p1, 0, 4, null);
       }
       return;
    }
    public EditorFragmentBackPressedResult onBackPressed(){
       DecorationDrawer obj = PatchProxy.apply(null, this, TextElementViewBinder.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.x != null || !this.e.a()) {
          return EditorFragmentBackPressedResult.PASS_EVENT;
       }
       obj = this.k.getTopDecorationDrawer();
       if (obj != null && (obj.mIsSelected != null && obj instanceof EditTextBaseElement)) {
          this.G(obj);
       }
    label_0031 :
       TextElementViewBinder.F(this, false, 1, null);
       return EditorFragmentBackPressedResult.INTERCEPT_EVENT;
    }
}
