package com.yxcorp.gifshow.v3.widget.TextBasePanelFragment;
import androidx.fragment.app.KwaiDialogFragment;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.widget.TextBasePanelFragment$screenWidth$2;
import msd.a;
import qrd.p;
import qrd.s;
import lnc.a1;
import android.view.WindowManager$LayoutParams;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.CharSequence;
import android.text.Editable;
import android.widget.EditText;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import android.text.TextUtils;
import android.widget.ImageView;
import android.view.ViewGroup$LayoutParams;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import android.graphics.drawable.ColorDrawable;
import axc.z;
import android.content.DialogInterface$OnShowListener;
import android.content.Context;
import androidx.fragment.app.Fragment;
import i2b.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import axc.c0;
import android.view.View$OnClickListener;
import axc.a0;
import android.text.TextWatcher;
import axc.b0;
import axc.d0;
import android.text.InputFilter;
import axc.e0;
import java.util.HashMap;
import android.os.Build$VERSION;
import java.lang.Integer;

public abstract class TextBasePanelFragment extends KwaiDialogFragment	// class@00165e
{
    public final EditorDelegate A;
    public HashMap B;
    public int p;
    public final p q;
    public int r;
    public int s;
    public int t;
    public int u;
    public View v;
    public EditText w;
    public KwaiImageView x;
    public TextView y;
    public boolean z;

    public void TextBasePanelFragment(EditorDelegate p0){
       a.p(p0, "editorDelegate");
       super();
       this.A = p0;
       this.q = s.c(new TextBasePanelFragment$screenWidth$2(this));
       this.s = 20;
       this.t = a1.e(117.00f);
    }
    public final void Ah(WindowManager$LayoutParams p0){
       TextBasePanelFragment tt;
       TextBasePanelFragment tr;
       if (PatchProxy.applyVoidOneRefs(p0, this, TextBasePanelFragment.class, "13")) {
          return;
       }
       p0.x = 0;
       p0.y = (this.u - this.t) - this.r;
       if (this.th()) {
          tt = this.t;
          tr = this.r;
       }else {
          tt = (this.t + this.p) - this.u;
          tr = this.r;
       }
       p0.height = tt + tr;
       Number number = PatchProxy.apply(null, this, TextBasePanelFragment.class, "1");
       if (number == PatchProxyResult.class) {
          number = this.q.getValue();
       }
       p0.width = number.intValue();
       return;
    }
    public abstract void Bh(CharSequence p0);
    public void Ch(){
       String str1;
       ViewGroup$LayoutParams layoutParams1;
       TextBasePanelFragment tw1;
       if (PatchProxy.applyVoid(null, this, TextBasePanelFragment.class, "17")) {
          return;
       }
       TextBasePanelFragment tw = this.w;
       String str = "editText";
       if (tw == null) {
          a.S(str);
       }
       Editable text = tw.getText();
       if (text != null) {
          str1 = text.toString();
          if (str1 != null) {
          label_0024 :
             int i = 0;
             Object[] objArray = new Object[i];
             a.D().w("TitleBasePanelFragment", "refreshInputViewIfNeeded: current text is "+str1, objArray);
             String str2 = "clearBtn";
             if (TextUtils.isEmpty(str1)) {
                tw = this.x;
                if (tw == null) {
                   a.S(str2);
                }
                tw.setVisibility(8);
             }else {
                tw = this.x;
                if (tw == null) {
                   a.S(str2);
                }
                tw.setVisibility(i);
             }
             tw = this.w;
             if (tw == null) {
                a.S(str);
             }
             ViewGroup$LayoutParams layoutParams = 2;
             int i1 = 0x7f0702c5;
             if (tw.getLineCount() < layoutParams && this.z != null) {
                tw = this.w;
                if (tw == null) {
                   a.S(str);
                }
                layoutParams1 = tw.getLayoutParams();
                layoutParams1.height = layoutParams1.height - a1.d(i1);
                tw1 = this.w;
                if (tw1 == null) {
                   a.S(str);
                }
                tw1.setLayoutParams(layoutParams1);
                tw = this.w;
                if (tw == null) {
                   a.S(str);
                }
                tw.setBackground(a1.f(R.drawable.arg_RES_7f081a47));
                this.yh(i);
                this.z = i;
                return;
             }else {
                tw = this.w;
                if (tw == null) {
                   a.S(str);
                }
                if (tw.getLineCount() >= layoutParams && this.z == null) {
                   tw = this.w;
                   if (tw == null) {
                      a.S(str);
                   }
                   layoutParams1 = tw.getLayoutParams();
                   layoutParams1.height = layoutParams1.height + a1.d(i1);
                   tw1 = this.w;
                   if (tw1 == null) {
                      a.S(str);
                   }
                   tw1.setLayoutParams(layoutParams1);
                   tw = this.w;
                   if (tw == null) {
                      a.S(str);
                   }
                   tw.setBackground(a1.f(R.drawable.arg_RES_7f081a48));
                   this.yh(a1.d(i1));
                   this.z = true;
                }
                return;
             }
          }
       }
       str1 = "";
       goto label_0024 ;
    }
    public abstract void Dh();
    public abstract void beforeTextChanged(CharSequence p0,int p1,int p2,int p3);
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, TextBasePanelFragment.class, "10");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       a.p(p0, "inflater");
       Object[] objArray = null;
       int i = 1;
       if (!PatchProxy.applyVoid(objArray, this, TextBasePanelFragment.class, "14")) {
          Dialog dialog = this.getDialog();
          if (dialog != null) {
             dialog.requestWindowFeature(i);
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
                attributes.flags = attributes.flags | Float.MIN_NORMAL;
                attributes.softInputMode = 49;
                a.o(attributes, "attr");
                this.Ah(attributes);
                window.setAttributes(attributes);
             }
          }
          dialog = this.getDialog();
          if (dialog != null) {
             dialog.setOnShowListener(new z(this));
          }
       }
       View view = a.a(this.getContext(), R.layout.arg_RES_7f0d10e8);
       a.o(view, "KwaiLayoutInflater.infla¡­yout.opening_title_panel\)");
       this.v = view;
       if (view == null) {
          a.S("rootView");
       }
       view = view.findViewById(R.id.opening_title_edit_text);
       a.o(view, "rootView.findViewById\(R.¡­.opening_title_edit_text\)");
       this.w = view;
       TextBasePanelFragment tv = this.v;
       if (tv == null) {
          a.S("rootView");
       }
       view = tv.findViewById(R.id.opening_title_clear);
       a.o(view, "rootView.findViewById\(R.id.opening_title_clear\)");
       this.x = view;
       tv = this.v;
       if (tv == null) {
          a.S("rootView");
       }
       view = tv.findViewById(R.id.opening_title_edit_complete);
       a.o(view, "rootView.findViewById\(R.¡­ning_title_edit_complete\)");
       this.y = view;
       this.zh();
       if (!PatchProxy.applyVoid(objArray, this, TextBasePanelFragment.class, "12")) {
          tv = this.x;
          if (tv == null) {
             a.S("clearBtn");
          }
          tv.setOnClickListener(new c0(this));
          tv = this.w;
          String str = "editText";
          if (tv == null) {
             a.S(str);
          }
          tv.addTextChangedListener(new a0(this));
          tv = this.w;
          if (tv == null) {
             a.S(str);
          }
          tv.addTextChangedListener(new b0(this));
          tv = this.w;
          if (tv == null) {
             a.S(str);
          }
          d0[] uod0Array = new d0[i];
          uod0Array[0] = new d0(this);
          tv.setFilters(uod0Array);
          tv = this.y;
          if (tv == null) {
             a.S("confirmBtn");
          }
          tv.setOnClickListener(new e0(this));
       }
       this.Ch();
       tv = this.v;
       if (tv == null) {
          a.S("rootView");
       }
       return tv;
    }
    public void onDestroyView(){
       super.onDestroyView();
       this.sh();
    }
    public abstract void onTextChanged(CharSequence p0,int p1,int p2,int p3);
    public void sh(){
       if (PatchProxy.applyVoid(null, this, TextBasePanelFragment.class, "19")) {
          return;
       }
       TextBasePanelFragment tB = this.B;
       if (tB != null) {
          tB.clear();
       }
       return;
    }
    public final boolean th(){
       boolean b = (Build$VERSION.SDK_INT >= 30)? true: false;
       return b;
    }
    public final KwaiImageView uh(){
       TextBasePanelFragment obj = PatchProxy.apply(null, this, TextBasePanelFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.x;
       if (obj == null) {
          a.S("clearBtn");
       }
       return obj;
    }
    public final EditText vh(){
       TextBasePanelFragment obj = PatchProxy.apply(null, this, TextBasePanelFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.w;
       if (obj == null) {
          a.S("editText");
       }
       return obj;
    }
    public final View wh(){
       TextBasePanelFragment obj = PatchProxy.apply(null, this, TextBasePanelFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.v;
       if (obj == null) {
          a.S("rootView");
       }
       return obj;
    }
    public int xh(){
       return this.s;
    }
    public final void yh(int p0){
       Window window;
       WindowManager$LayoutParams attributes;
       if (PatchProxy.isSupport(TextBasePanelFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TextBasePanelFragment.class, "16")) {
          return;
       }
       this.r = p0;
       Dialog dialog = this.getDialog();
       if (dialog != null) {
          window = dialog.getWindow();
          if (window != null) {
             attributes = window.getAttributes();
             TextBasePanelFragment tt = (this.th())? this.t: (this.t + this.p) - this.u;
             attributes.height = tt + p0;
             window.setAttributes(attributes);
          }
       }
       dialog = this.getDialog();
       if (dialog != null) {
          window = dialog.getWindow();
          if (window != null) {
             attributes = window.getAttributes();
             attributes.y = (this.u - this.t) - p0;
             window.setAttributes(attributes);
          }
       }
       return;
    }
    public void zh(){
       if (PatchProxy.applyVoid(null, this, TextBasePanelFragment.class, "11")) {
          return;
       }
       TextBasePanelFragment tw = this.w;
       if (tw == null) {
          a.S("editText");
       }
       tw.setText("");
       return;
    }
}
