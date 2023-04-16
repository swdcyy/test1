package com.yxcorp.gifshow.v3.editor.text.textpanel.TextPanelDialogFragment;
import androidx.fragment.app.KwaiDialogFragment;
import com.yxcorp.gifshow.v3.editor.text.textpanel.TextPanelDialogFragment$screenWidth$2;
import msd.a;
import qrd.p;
import qrd.s;
import oa0.a;
import com.yxcorp.gifshow.v3.editor.text.textpanel.TextPanelDialogFragment$tabHostFragment$2;
import com.yxcorp.gifshow.v3.editor.text.textpanel.TextPanelDialogFragment$b;
import android.widget.ImageView;
import java.lang.String;
import kotlin.jvm.internal.a;
import cvc.f;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.WindowManager$LayoutParams;
import fvc.c;
import java.lang.Number;
import java.lang.Boolean;
import faa.a;
import q87.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.widget.popup.a;
import android.app.Activity;
import com.yxcorp.gifshow.widget.popup.KwaiBubbleOption;
import com.kwai.library.widget.popup.bubble.BubbleInterface$Position;
import com.kwai.library.widget.popup.bubble.a$c;
import lnc.a1;
import java.lang.CharSequence;
import android.view.View;
import android.view.ViewGroup;
import com.kwai.library.widget.popup.common.c$b;
import com.yxcorp.gifshow.v3.editor.text.textpanel.TextPanelDialogFragment$c;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.yxcorp.gifshow.v3.editor.text.textpanel.TextPanelDialogFragment$e;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.bubble.a;
import android.view.ViewTreeObserver;
import com.yxcorp.gifshow.v3.editor.text.textpanel.TextPanelDialogFragment$d;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.animation.AnimatorSet;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import android.animation.Animator$AnimatorListener;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;
import java.lang.Integer;
import java.lang.StringBuilder;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import android.view.LayoutInflater;
import android.os.Bundle;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.content.Context;
import msd.l;
import java.util.HashMap;
import android.widget.RelativeLayout;
import com.yxcorp.gifshow.widget.PassThroughEventView;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModel;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import com.yxcorp.gifshow.v3.editor.text.textpanel.TextPanelTabHostFragment;
import com.yxcorp.gifshow.v3.editor.text.textpanel.TextPanelDialogFragment$a;
import android.view.View$OnClickListener;
import android.view.ViewGroup$LayoutParams;
import cvc.e;
import fvc.b;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import fvc.a;
import android.os.Build$VERSION;

public final class TextPanelDialogFragment extends KwaiDialogFragment	// class@0014bd
{
    public a A;
    public boolean B;
    public boolean C;
    public final p D;
    public AnimatorSet E;
    public final TextPanelDialogFragment$b F;
    public TextElementViewModel G;
    public f H;
    public int I;
    public HashMap J;
    public int p;
    public final p q;
    public int r;
    public ImageView s;
    public ImageView t;
    public View u;
    public RelativeLayout v;
    public RelativeLayout w;
    public PassThroughEventView x;
    public FrameLayout y;
    public final boolean z;

    public void TextPanelDialogFragment(){
       super();
       this.q = s.c(new TextPanelDialogFragment$screenWidth$2(this));
       this.z = a.m0();
       this.C = true;
       this.D = s.c(new TextPanelDialogFragment$tabHostFragment$2(this));
       this.F = new TextPanelDialogFragment$b(this);
       this.I = 16;
    }
    public static final ImageView sh(TextPanelDialogFragment p0){
       p0 = p0.t;
       if (p0 == null) {
          a.S("recommendTextBtn");
       }
       return p0;
    }
    public static final f th(TextPanelDialogFragment p0){
       p0 = p0.H;
       if (p0 == null) {
          a.S("recommendTextViewModel");
       }
       return p0;
    }
    public final TextElementViewModel Ah(){
       TextPanelDialogFragment obj = PatchProxy.apply(null, this, TextPanelDialogFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.G;
       if (obj == null) {
          a.S("textElementViewModel");
       }
       return obj;
    }
    public final void Bh(WindowManager$LayoutParams p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, TextPanelDialogFragment.class, "13")) {
          return;
       }
       p0.x = 0;
       if (this.Eh()) {
          int b = c.b;
          p0.y = (this.r - c.a()) - b;
          i = (this.xh())? c.a() + b: ((c.a() + b) + this.p) - this.r;
          p0.height = i;
       }else {
          p0.y = this.r - c.a();
          i = (this.xh())? c.a(): (c.a() + this.p) - this.r;
          p0.height = i;
       }
       Number number = PatchProxy.apply(null, this, TextPanelDialogFragment.class, "1");
       if (number == PatchProxyResult.class) {
          number = this.q.getValue();
       }
       p0.width = number.intValue();
       return;
    }
    public final boolean Ch(){
       return this.C;
    }
    public final void Dh(){
       if (PatchProxy.applyVoid(null, this, TextPanelDialogFragment.class, "17")) {
          return;
       }
       if (this.xh()) {
          if (this.Eh()) {
             this.Hh((c.a() + c.b));
          }else {
             this.Hh(c.a());
          }
       }
       return;
    }
    public final boolean Eh(){
       Object obj = PatchProxy.apply(null, this, TextPanelDialogFragment.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.uh(this.I) && this.z == null)? true: false;
       return b;
    }
    public final void Fh(){
       if (PatchProxy.applyVoid(null, this, TextPanelDialogFragment.class, "24")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("TextPanelDialogFragment", "showTextRecoBubbleIfNeeded", objArray);
       TextPanelDialogFragment tt = this.t;
       String str = "recommendTextBtn";
       if (tt == null) {
          a.S(str);
       }
       if (tt.getWidth()) {
          tt = this.t;
          if (tt == null) {
             a.S(str);
          }
          if (tt.getHeight()) {
             if (this.Eh() && !a.m0()) {
                FragmentActivity activity = this.getActivity();
                if (activity != null) {
                   a uoa = new a(activity);
                   uoa.K0(KwaiBubbleOption.e);
                   uoa.D0(BubbleInterface$Position.TOP);
                   boolean b = true;
                   uoa.q0(b);
                   uoa.F0(a1.p(R.string.arg_RES_7f104c32));
                   TextPanelDialogFragment tt1 = this.t;
                   if (tt1 == null) {
                      a.S(str);
                   }
                   uoa.o0(tt1);
                   TextPanelDialogFragment tv = this.v;
                   if (tv == null) {
                      a.S("bubbleContainer");
                   }
                   uoa.C(tv);
                   uoa.P(b);
                   uoa.T(3000);
                   uoa.M(new TextPanelDialogFragment$c(this));
                   uoa.L(TextPanelDialogFragment$e.b);
                   this.A = uoa.X();
                }
             }
             return;
          }
       }
       tt = this.t;
       if (tt == null) {
          a.S(str);
       }
       tt.getViewTreeObserver().addOnGlobalLayoutListener(new TextPanelDialogFragment$d(this));
       return;
    }
    public final void Gh(boolean p0){
       TextPanelDialogFragment tt;
       float[] uofloatArray;
       ObjectAnimator objectAnimat;
       TextPanelDialogFragment ts;
       ObjectAnimator objectAnimat1;
       TextPanelDialogFragment ts1;
       ObjectAnimator objectAnimat2;
       TextPanelDialogFragment ts2;
       ObjectAnimator objectAnimat3;
       Animator[] uAnimatorArr;
       if (PatchProxy.isSupport(TextPanelDialogFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, TextPanelDialogFragment.class, "20")) {
          return;
       }
       TextPanelDialogFragment tE = this.E;
       int i = 1;
       if (tE != null && tE.isRunning() == i) {
          tE = this.E;
          if (tE != null) {
             tE.cancel();
          }
       }
       this.E = new AnimatorSet();
       int i1 = 3;
       int i2 = 4;
       String str = "recommendTextBtn";
       int i3 = 0;
       String str1 = "foldBtn";
       if (p0) {
          tt = this.t;
          if (tt == null) {
             a.S(str);
          }
          uofloatArray = new float[]{i3,c.a};
          objectAnimat = ObjectAnimator.ofFloat(tt, View.TRANSLATION_X, uofloatArray);
          ts = this.s;
          if (ts == null) {
             a.S(str1);
          }
          objectAnimat1 = ObjectAnimator.ofFloat(ts, View.SCALE_X, new float[2]{0x3f800000,0x3f000000});
          ts1 = this.s;
          if (ts1 == null) {
             a.S(str1);
          }
          objectAnimat2 = ObjectAnimator.ofFloat(ts1, View.SCALE_Y, new float[2]{0x3f800000,0x3f000000});
          ts2 = this.s;
          if (ts2 == null) {
             a.S(str1);
          }
          objectAnimat3 = ObjectAnimator.ofFloat(ts2, View.ALPHA, new float[2]{0x3f800000,0});
          ts2 = this.E;
          if (ts2 != null) {
             uAnimatorArr = new Animator[i2];
             uAnimatorArr[0] = objectAnimat;
             uAnimatorArr[i] = objectAnimat1;
             uAnimatorArr[2] = objectAnimat2;
             uAnimatorArr[i1] = objectAnimat3;
             ts2.playTogether(uAnimatorArr);
          }
       }else {
          tt = this.t;
          if (tt == null) {
             a.S(str);
          }
          uofloatArray = new float[]{c.a,i3};
          objectAnimat = ObjectAnimator.ofFloat(tt, View.TRANSLATION_X, uofloatArray);
          ts = this.s;
          if (ts == null) {
             a.S(str1);
          }
          objectAnimat1 = ObjectAnimator.ofFloat(ts, View.SCALE_X, new float[2]{0x3f000000,0x3f800000});
          ts1 = this.s;
          if (ts1 == null) {
             a.S(str1);
          }
          objectAnimat2 = ObjectAnimator.ofFloat(ts1, View.SCALE_Y, new float[2]{0x3f000000,0x3f800000});
          ts2 = this.s;
          if (ts2 == null) {
             a.S(str1);
          }
          objectAnimat3 = ObjectAnimator.ofFloat(ts2, View.ALPHA, new float[2]{0,0x3f800000});
          ts2 = this.E;
          if (ts2 != null) {
             uAnimatorArr = new Animator[i2];
             uAnimatorArr[0] = objectAnimat;
             uAnimatorArr[i] = objectAnimat1;
             uAnimatorArr[2] = objectAnimat2;
             uAnimatorArr[i1] = objectAnimat3;
             ts2.playTogether(uAnimatorArr);
          }
       }
       tt = this.E;
       if (tt != null) {
          tt.addListener(this.F);
       }
       tt = this.E;
       if (tt != null) {
          tt.setInterpolator(new DecelerateInterpolator(0x3fc00000));
       }
       tt = this.E;
       if (tt != null) {
          tt.setDuration(350);
       }
       tt = this.E;
       if (tt != null) {
          tt.start();
       }
       return;
    }
    public final void Hh(int p0){
       int b;
       if (PatchProxy.isSupport(TextPanelDialogFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TextPanelDialogFragment.class, "16")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().s("TextPanelDialogFragment", "screenHeight: "+this.p+", updateHeight: "+p0+", keyboardY: "+this.r, objArray);
       Dialog dialog = this.getDialog();
       if (dialog != null) {
          Window window = dialog.getWindow();
          if (window != null) {
             WindowManager$LayoutParams attributes = window.getAttributes();
             attributes.x = i;
             if (this.Eh()) {
                i = this.r - c.a();
                b = c.b;
             }else {
                TextPanelDialogFragment tr = this.r;
                b = c.a();
             }
             attributes.y = i - b;
             attributes.height = p0;
             window.setAttributes(attributes);
          }
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, TextPanelDialogFragment.class, "5");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       a.p(p0, "inflater");
       if (!PatchProxy.applyVoid(null, this, TextPanelDialogFragment.class, "14")) {
          Dialog dialog = this.getDialog();
          if (dialog != null) {
             dialog.requestWindowFeature(1);
          }
          dialog = this.getDialog();
          if (dialog != null) {
             Window window = dialog.getWindow();
             if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
                window.getDecorView().setBackgroundColor(0);
                window.setDimAmount(0);
                WindowManager$LayoutParams attributes = window.getAttributes();
                attributes.type = 1000;
                attributes.gravity = 51;
                attributes.flags = ((attributes.flags | Float.MIN_NORMAL) | 0x20000) | 0x08;
                attributes.softInputMode = 49;
                a.o(attributes, "attr");
                this.Bh(attributes);
                window.setAttributes(attributes);
             }
          }
       }
    label_0075 :
       return LayoutInflater.from(this.getContext()).inflate(0x7f0d15de, null);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, TextPanelDialogFragment.class, "11")) {
          return;
       }
       super.onDestroyView();
       TextPanelDialogFragment tG = this.G;
       if (tG == null) {
          a.S("textElementViewModel");
       }
       TextElementViewModel.b1(tG, 0, null, 2, null);
       if (!PatchProxy.applyVoid(null, this, TextPanelDialogFragment.class, "27")) {
          tG = this.J;
          if (tG != null) {
             tG.clear();
          }
       }
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, TextPanelDialogFragment.class, "10")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("TextPanelDialogFragment", "onResume", objArray);
       super.onResume();
       this.Fh();
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, TextPanelDialogFragment.class, "15")) {
          return;
       }
       super.onStart();
       Dialog dialog = this.getDialog();
       if (dialog != null) {
          Window window = dialog.getWindow();
          if (window != null) {
             WindowManager$LayoutParams attributes = window.getAttributes();
             attributes.flags = attributes.flags | 0x08;
             window.setAttributes(attributes);
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       View view;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TextPanelDialogFragment.class, "6")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       if (!PatchProxy.applyVoidOneRefs(p0, this, TextPanelDialogFragment.class, "7")) {
          view = p0.findViewById(R.id.text_panel_fold_btn);
          a.o(view, "rootView.findViewById\(R.id.text_panel_fold_btn\)");
          this.s = view;
          view = p0.findViewById(R.id.text_panel_recommend_text_btn);
          a.o(view, "rootView.findViewById\(R.¡­panel_recommend_text_btn\)");
          this.t = view;
          view = p0.findViewById(R.id.empty_view);
          a.o(view, "rootView.findViewById\(R.id.empty_view\)");
          this.u = view;
          view = p0.findViewById(R.id.bubble_container);
          a.o(view, "rootView.findViewById\(R.id.bubble_container\)");
          this.v = view;
          view = p0.findViewById(R.id.text_panel_root);
          a.o(view, "rootView.findViewById\(R.id.text_panel_root\)");
          this.w = view;
          view = p0.findViewById(R.id.touch_view);
          a.o(view, "rootView.findViewById\(R.id.touch_view\)");
          this.x = view;
          p0 = p0.findViewById(R.id.panel_toast_container);
          a.o(p0, "rootView.findViewById\(R.id.panel_toast_container\)");
          this.y = p0;
       }
       ViewModel viewModel = ViewModelProviders.of(this.yh()).get(TextElementViewModel.class);
       a.o(viewModel, "ViewModelProviders.of\(ge¡­entViewModel::class.java\)");
       this.G = viewModel;
       e uoe = this.getChildFragmentManager().beginTransaction();
       uoe.v(R.id.panel_tab_host_fragment_container, this.zh());
       uoe.l();
       TextPanelDialogFragment ts = this.s;
       if (ts == null) {
          a.S("foldBtn");
       }
       ts.setOnClickListener(new TextPanelDialogFragment$a(this));
       Object[] objArray = null;
       int i = 0;
       if (!PatchProxy.applyVoid(objArray, this, TextPanelDialogFragment.class, "8") && this.Eh()) {
          ts = this.x;
          String str1 = "passThroughEventView";
          if (ts == null) {
             a.S(str1);
          }
          ViewGroup$LayoutParams layoutParams = ts.getLayoutParams();
          layoutParams.height = c.b;
          TextPanelDialogFragment tx = this.x;
          if (tx == null) {
             a.S(str1);
          }
          tx.setLayoutParams(layoutParams);
          ts = this.x;
          if (ts == null) {
             a.S(str1);
          }
          ts.setVisibility(i);
       }
       this.I = this.ch("panelFrom", 16);
       if (!PatchProxy.applyVoid(objArray, this, TextPanelDialogFragment.class, "9")) {
          String str = "emptyView";
          if (this.uh(this.I)) {
             this.H = e.a(this.yh());
             ts = this.t;
             if (ts == null) {
                a.S("recommendTextBtn");
             }
             ts.setVisibility(i);
             ts = this.t;
             if (ts == null) {
                a.S("recommendTextBtn");
             }
             ts.setTranslationX(c.a);
             ts = this.u;
             if (ts == null) {
                a.S(str);
             }
             ts.setVisibility(8);
             ts = this.t;
             if (ts == null) {
                a.S("recommendTextBtn");
             }
             ts.setOnClickListener(new b(this, 100));
          }else {
             ts = this.t;
             if (ts == null) {
                a.S("recommendTextBtn");
             }
             ts.setVisibility(8);
             ts = this.u;
             if (ts == null) {
                a.S(str);
             }
             ts.setVisibility(8);
          }
       }
       return;
    }
    public final boolean uh(int p0){
       if (PatchProxy.isSupport(TextPanelDialogFragment.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, TextPanelDialogFragment.class, "22");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = (PostExperimentUtils.b0() && p0 == 16)? true: false;
       return b;
    }
    public final void vh(boolean p0){
       TextPanelDialogFragment tw;
       if (PatchProxy.isSupport(TextPanelDialogFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, TextPanelDialogFragment.class, "19")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().s("TextPanelDialogFragment", "changPanelStateChange: "+p0, objArray);
       this.C = p0;
       String str = "textPanelLayout";
       if (!PatchProxy.isSupport(TextPanelDialogFragment.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, TextPanelDialogFragment.class, "18")) {
          tw = this.w;
          if (tw == null) {
             a.S(str);
          }
          ViewGroup$LayoutParams layoutParams = tw.getLayoutParams();
          layoutParams.height = (p0)? c.a(): (c.a() + this.p) - this.r;
          TextPanelDialogFragment tw1 = this.w;
          if (tw1 == null) {
             a.S(str);
          }
          tw1.setLayoutParams(layoutParams);
       }
       if (p0) {
          tw = this.w;
          if (tw == null) {
             a.S(str);
          }
          tw.setBackground(a1.f(R.drawable.arg_RES_7f0823f5));
       }else {
          tw = this.w;
          if (tw == null) {
             a.S(str);
          }
          tw.setBackground(a1.f(R.drawable.arg_RES_7f0823f7));
          if (this.xh()) {
             if (this.Eh()) {
                this.Hh((((c.a() + c.b) + this.p) - this.r));
             }else {
                this.Hh(((c.a() + this.p) - this.r));
             }
          }
       }
       str = "foldBtn";
       String str1 = "recommendTextBtn";
       if (this.uh(this.I)) {
          if (p0) {
             this.Gh(true);
          }else {
             tw = this.t;
             if (tw == null) {
                a.S(str1);
             }
             tw.setVisibility(i);
             tw = this.u;
             if (tw == null) {
                a.S("emptyView");
             }
             tw.setVisibility(i);
             tw = this.s;
             if (tw == null) {
                a.S(str);
             }
             tw.setVisibility(i);
             this.Gh(i);
          }
       }else {
          tw = this.t;
          if (tw == null) {
             a.S(str1);
          }
          tw.setVisibility(4);
          tw = this.u;
          if (tw == null) {
             a.S("emptyView");
          }
          tw.setVisibility(4);
          tw = this.s;
          if (tw == null) {
             a.S(str);
          }
          if (p0) {
             i = 8;
          }
          tw.setVisibility(i);
       }
       Fragment uFragment = this.zh().t();
       if (!uFragment instanceof a) {
          uFragment = null;
       }
       if (uFragment != null) {
          uFragment.n9(p0);
       }
       return;
    }
    public final void wh(boolean p0){
       if (PatchProxy.isSupport(TextPanelDialogFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, TextPanelDialogFragment.class, "21")) {
          return;
       }
       TextPanelDialogFragment tt = this.t;
       if (tt == null) {
          a.S("recommendTextBtn");
       }
       tt.setClickable(p0);
       tt = this.s;
       if (tt == null) {
          a.S("foldBtn");
       }
       tt.setClickable(p0);
       return;
    }
    public final boolean xh(){
       boolean b = (Build$VERSION.SDK_INT >= 30)? true: false;
       return b;
    }
    public final Fragment yh(){
       Fragment obj = PatchProxy.apply(null, this, TextPanelDialogFragment.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getParentFragment();
       a.m(obj);
       return obj;
    }
    public final TextPanelTabHostFragment zh(){
       Object obj = PatchProxy.apply(null, this, TextPanelDialogFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.D.getValue();
    }
}
