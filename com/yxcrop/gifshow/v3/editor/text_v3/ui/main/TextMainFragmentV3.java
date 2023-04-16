package com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextMainFragmentV3;
import androidx.fragment.app.KwaiDialogFragment;
import android.view.ViewGroup;
import android.view.View;
import ynd.f;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextMainFragmentV3$mTextMainViewModel$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextMainFragmentV3$a;
import android.widget.EditText;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import android.widget.ImageView;
import java.lang.CharSequence;
import java.lang.Integer;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import android.view.WindowManager$LayoutParams;
import rod.k;
import android.view.LayoutInflater;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import rod.f;
import android.content.DialogInterface$OnShowListener;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import ynd.g;
import jod.f;
import android.text.TextUtils;
import com.yxcrop.gifshow.v3.editor.text_v3.action.UpdateOriginTextActionV3;
import xvc.b;
import lnc.a1;
import rod.g;
import android.view.View$OnClickListener;
import rod.i;
import rod.h;
import android.text.TextWatcher;
import rod.j;
import rod.m;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import java.util.HashMap;
import android.content.DialogInterface;
import tvc.e;
import xld.a;
import mod.a;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextMainFragmentV3$b;
import java.lang.Runnable;
import android.widget.AbsoluteLayout;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextPanelTabHostFragmentV3;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import androidx.lifecycle.LifecycleOwner;
import android.os.Build$VERSION;
import android.view.ViewGroup$LayoutParams;
import java.util.Objects;
import android.widget.RelativeLayout$LayoutParams;
import com.yxcorp.utility.n;

public final class TextMainFragmentV3 extends KwaiDialogFragment	// class@000c43
{
    public final f A;
    public final boolean B;
    public final int C;
    public final EditReduxViewModel D;
    public int E;
    public final EditDecorationContainerViewV2 F;
    public HashMap G;
    public final p p;
    public EditText q;
    public KwaiImageView r;
    public TextView s;
    public View t;
    public TextPanelTabHostFragmentV3 u;
    public boolean v;
    public int w;
    public final Observer x;
    public final ViewGroup y;
    public final View z;

    public void TextMainFragmentV3(ViewGroup p0,View p1,f p2,boolean p3,int p4,EditReduxViewModel p5,int p6,EditDecorationContainerViewV2 p7){
       a.p(p2, "textMainOption");
       a.p(p5, "viewModel");
       a.p(p7, "mContainerView");
       super();
       this.y = p0;
       this.z = p1;
       this.A = p2;
       this.B = p3;
       this.C = p4;
       this.D = p5;
       this.E = p6;
       this.F = p7;
       this.p = s.c(new TextMainFragmentV3$mTextMainViewModel$2(this));
       this.x = new TextMainFragmentV3$a(this);
    }
    public static final EditText sh(TextMainFragmentV3 p0){
       p0 = p0.q;
       if (p0 == null) {
          a.S("editText");
       }
       return p0;
    }
    public final void Ah(boolean p0){
       TextMainFragmentV3 tr;
       if (PatchProxy.isSupport(TextMainFragmentV3.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, TextMainFragmentV3.class, "12")) {
          return;
       }
       String str = "clearBtn";
       if (p0) {
          tr = this.r;
          if (tr == null) {
             a.S(str);
          }
          tr.setVisibility(0);
       }else {
          tr = this.r;
          if (tr == null) {
             a.S(str);
          }
          tr.setVisibility(4);
       }
       return;
    }
    public final void Bh(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextMainFragmentV3.class, "17")) {
          return;
       }
       if (p0 != null) {
          TextMainFragmentV3 tq = this.q;
          if (tq == null) {
             a.S("editText");
          }
          if (tq != null) {
             tq.setHint(p0);
          }
       }
       return;
    }
    public final void Ch(int p0){
       if (PatchProxy.isSupport(TextMainFragmentV3.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TextMainFragmentV3.class, "6")) {
          return;
       }
       Dialog dialog = this.getDialog();
       if (dialog != null) {
          Window window = dialog.getWindow();
          if (window != null) {
             WindowManager$LayoutParams attributes = window.getAttributes();
             attributes.x = 0;
             attributes.y = (this.E - k.a()) - this.w;
             attributes.height = p0;
             window.setAttributes(attributes);
          }
       }
       return;
    }
    public final void Dh(int p0){
       if (PatchProxy.isSupport(TextMainFragmentV3.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TextMainFragmentV3.class, "16")) {
          return;
       }
       if (this.E == p0) {
          return;
       }
       this.E = p0;
       Dialog dialog = this.getDialog();
       if (dialog != null) {
          Window window = dialog.getWindow();
          if (window != null) {
             WindowManager$LayoutParams attributes = window.getAttributes();
             a.o(attributes, "attr");
             this.xh(attributes);
             window.setAttributes(attributes);
          }
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, TextMainFragmentV3.class, "2");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       a.p(p0, "inflater");
       Object[] objArray = null;
       String str = 1;
       if (!PatchProxy.applyVoid(objArray, this, TextMainFragmentV3.class, "4")) {
          Dialog dialog = this.getDialog();
          if (dialog != null) {
             dialog.requestWindowFeature(str);
          }
          dialog = this.getDialog();
          int i = 0;
          if (dialog != null) {
             Window window = dialog.getWindow();
             if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(i));
                window.getDecorView().setBackgroundColor(i);
                window.setDimAmount(0);
                WindowManager$LayoutParams attributes = window.getAttributes();
                attributes.gravity = 51;
                attributes.type = 1000;
                attributes.flags = (attributes.flags | Float.MIN_NORMAL) | 0x20;
                attributes.softInputMode = 49;
                a.o(attributes, "attr");
                this.xh(attributes);
                window.setAttributes(attributes);
             }
          }
          dialog = this.getDialog();
          if (dialog != null) {
             dialog.setCanceledOnTouchOutside(i);
          }
          dialog = this.getDialog();
          if (dialog != null) {
             dialog.setOnShowListener(new f(this));
          }
       }
       View view = LayoutInflater.from(this.getContext()).inflate(R.layout.arg_RES_7f0d15d4, objArray);
       a.o(view, "LayoutInflater.from\(cont¡­ontainer_layout_v3, null\)");
       this.t = view;
       if (view == null) {
          a.S("rootView");
       }
       view = view.findViewById(R.id.opening_title_edit_text);
       a.o(view, "rootView.findViewById\(R.¡­.opening_title_edit_text\)");
       this.q = view;
       TextMainFragmentV3 tt = this.t;
       if (tt == null) {
          a.S("rootView");
       }
       view = tt.findViewById(R.id.opening_title_clear);
       a.o(view, "rootView.findViewById\(R.id.opening_title_clear\)");
       this.r = view;
       tt = this.t;
       if (tt == null) {
          a.S("rootView");
       }
       view = tt.findViewById(R.id.opening_title_edit_complete);
       a.o(view, "rootView.findViewById\(R.¡­ning_title_edit_complete\)");
       this.s = view;
       if (!PatchProxy.applyVoid(objArray, this, TextMainFragmentV3.class, "7")) {
          if (TextUtils.isEmpty(this.A.b().a().c())) {
             tt = this.q;
             if (tt == null) {
                a.S("editText");
             }
             str = "";
             tt.setText(str);
             this.D.t0(new UpdateOriginTextActionV3(str, this.A.b().a().b()));
          }else if(a.g(this.A.b().a().c(), a1.p(0x7f104ade)) ^ str){
             tt = this.q;
             if (tt == null) {
                a.S("editText");
             }
             tt.setText(this.A.b().a().c());
             this.D.t0(new UpdateOriginTextActionV3(this.A.b().a().c(), this.A.b().a().b()));
             this.Ah(str);
          }
          if (!TextUtils.isEmpty(this.A.b().a().b())) {
             this.Bh(this.A.b().a().b());
          }
          tt = this.q;
          if (tt == null) {
             a.S("editText");
          }
          tt.setOnClickListener(new g(this));
       }
       if (!PatchProxy.applyVoid(objArray, this, TextMainFragmentV3.class, "8")) {
          tt = this.r;
          if (tt == null) {
             a.S("clearBtn");
          }
          tt.setOnClickListener(new i(this));
          tt = this.q;
          if (tt == null) {
             a.S("editText");
          }
          tt.addTextChangedListener(new h(this));
          tt = this.s;
          if (tt == null) {
             a.S("confirmBtn");
          }
          tt.setOnClickListener(new j(this));
       }
       tt = this.t;
       if (tt == null) {
          a.S("rootView");
       }
       return tt;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, TextMainFragmentV3.class, "13")) {
          return;
       }
       super.onDestroyView();
       this.uh().p0().removeObserver(this.x);
       if (!PatchProxy.applyVoid(null, this, TextMainFragmentV3.class, "20")) {
          TextMainFragmentV3 tG = this.G;
          if (tG != null) {
             tG.clear();
          }
       }
       return;
    }
    public void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextMainFragmentV3.class, "9")) {
          return;
       }
       a.p(p0, "dialog");
       if (this.th()) {
          TextMainFragmentV3 ty = this.y;
          if (ty != null) {
             ty.removeView(this.z);
          }
       }
       super.onDismiss(p0);
       if (this.D.o0().h().f() && (!this.D.o0().h().b() && this.D.o0().h().e())) {
          this.F.post(new TextMainFragmentV3$b(this));
       }
    label_0062 :
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TextMainFragmentV3.class, "3")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       TextPanelTabHostFragmentV3 textPanelTab = new TextPanelTabHostFragmentV3(this.B);
       this.u = textPanelTab;
       textPanelTab.setArguments(this.getArguments());
       e uoe = this.getChildFragmentManager().beginTransaction();
       int i = 0x7f0a2f77;
       TextMainFragmentV3 tu = this.u;
       if (tu == null) {
          a.S("mTabHostFragment");
       }
       uoe.v(i, tu);
       uoe.l();
       this.uh().p0().observe(this, this.x);
       return;
    }
    public final boolean th(){
       boolean b = (Build$VERSION.SDK_INT >= 30)? true: false;
       return b;
    }
    public final m uh(){
       Object obj = PatchProxy.apply(null, this, TextMainFragmentV3.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.p.getValue();
    }
    public final f vh(){
       return this.A;
    }
    public final void wh(int p0){
       Window window;
       WindowManager$LayoutParams attributes;
       TextMainFragmentV3 ts;
       ViewGroup$LayoutParams layoutParams;
       TextMainFragmentV3 ts1;
       if (PatchProxy.isSupport(TextMainFragmentV3.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TextMainFragmentV3.class, "11")) {
          return;
       }
       this.w = p0;
       Dialog dialog = this.getDialog();
       if (dialog != null) {
          window = dialog.getWindow();
          if (window != null) {
             attributes = window.getAttributes();
             int i = (this.th())? k.a(): (k.a() + this.C) - this.E;
             attributes.height = i + p0;
             window.setAttributes(attributes);
          }
       }
       dialog = this.getDialog();
       if (dialog != null) {
          window = dialog.getWindow();
          if (window != null) {
             attributes = window.getAttributes();
             attributes.y = (this.E - k.a()) - p0;
             window.setAttributes(attributes);
          }
       }
       String str = "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams";
       if (!p0) {
          ts = this.s;
          if (ts == null) {
             a.S("confirmBtn");
          }
          layoutParams = ts.getLayoutParams();
          Objects.requireNonNull(layoutParams, str);
          layoutParams.topMargin = a1.d(0x7f070356);
          ts1 = this.s;
          if (ts1 == null) {
             a.S("confirmBtn");
          }
          ts1.setLayoutParams(layoutParams);
       }else {
          ts = this.s;
          if (ts == null) {
             a.S("confirmBtn");
          }
          layoutParams = ts.getLayoutParams();
          Objects.requireNonNull(layoutParams, str);
          layoutParams.topMargin = a1.d(0x7f0702b8);
          ts1 = this.s;
          if (ts1 == null) {
             a.S("confirmBtn");
          }
          ts1.setLayoutParams(layoutParams);
       }
       return;
    }
    public final void xh(WindowManager$LayoutParams p0){
       int i;
       TextMainFragmentV3 tw;
       if (PatchProxy.applyVoidOneRefs(p0, this, TextMainFragmentV3.class, "14")) {
          return;
       }
       p0.x = 0;
       p0.y = (this.E - k.a()) - this.w;
       if (this.th()) {
          i = k.a();
          tw = this.w;
       }else {
          i = (k.a() + this.C) - this.E;
          tw = this.w;
       }
       p0.height = i + tw;
       p0.width = n.y(this.getContext());
       return;
    }
    public final boolean yh(){
       return this.B;
    }
    public final void zh(CharSequence p0){
       ViewGroup$LayoutParams layoutParams1;
       if (PatchProxy.applyVoidOneRefs(p0, this, TextMainFragmentV3.class, "10")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = 1;
       int i = 0;
       if (p0 != null) {
          boolean b = (p0.length() > 0)? true: false;
          this.Ah(b);
       }
       TextMainFragmentV3 tq = this.q;
       if (tq == null) {
          a.S("editText");
       }
       int i1 = 2;
       if (tq.getLineCount() < i1 && this.v != null) {
          tq = this.q;
          if (tq == null) {
             a.S("editText");
          }
          layoutParams1 = tq.getLayoutParams();
          layoutParams1.height = layoutParams1.height - a1.d(0x7f0702c5);
          TextMainFragmentV3 tq1 = this.q;
          if (tq1 == null) {
             a.S("editText");
          }
          tq1.setLayoutParams(layoutParams1);
          tq = this.q;
          if (tq == null) {
             a.S("editText");
          }
          tq.setBackground(a1.f(R.drawable.arg_RES_7f081a47));
          this.wh(i);
          this.v = i;
          return;
       }else {
          tq = this.q;
          if (tq == null) {
             a.S("editText");
          }
          if (tq.getLineCount() >= i1 && this.v == null) {
             tq = this.q;
             if (tq == null) {
                a.S("editText");
             }
             layoutParams1 = tq.getLayoutParams();
             layoutParams1.height = layoutParams1.height + a1.d(0x7f0702c5);
             TextMainFragmentV3 tq2 = this.q;
             if (tq2 == null) {
                a.S("editText");
             }
             tq2.setLayoutParams(layoutParams1);
             tq = this.q;
             if (tq == null) {
                a.S("editText");
             }
             tq.setBackground(a1.f(R.drawable.arg_RES_7f081a49));
             this.wh(a1.d(R.dimen.arg_RES_7f0702c5));
             this.v = layoutParams;
          }
          return;
       }
    }
}
