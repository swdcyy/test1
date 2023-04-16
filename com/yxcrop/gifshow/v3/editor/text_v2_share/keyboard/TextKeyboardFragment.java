package com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.TextKeyboardFragment;
import androidx.fragment.app.KwaiDialogFragment;
import java.util.ArrayList;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.TextKeyboardFragment$screenWidth$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.TextKeyboardFragment$a;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.TextKeyboardFragment$tabHostFragment$2;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.WindowManager$LayoutParams;
import iod.b;
import ynd.e;
import ynd.f;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import iod.a;
import androidx.lifecycle.ViewModel;
import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import java.util.Iterator;
import java.lang.Iterable;
import ei0.a;
import java.util.HashMap;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.TextPanelTabHostFragmentV2;
import hod.a;
import java.util.List;
import androidx.lifecycle.LifecycleOwner;
import android.os.Build$VERSION;
import ynd.d;
import java.lang.Number;
import java.lang.Integer;
import faa.a;
import java.lang.StringBuilder;
import q87.c;

public final class TextKeyboardFragment extends KwaiDialogFragment	// class@000b95
{
    public f p;
    public a q;
    public final List r;
    public int s;
    public final p t;
    public int u;
    public final Observer v;
    public final p w;
    public HashMap x;

    public void TextKeyboardFragment(){
       super();
       this.r = new ArrayList();
       this.t = s.c(new TextKeyboardFragment$screenWidth$2(this));
       this.v = new TextKeyboardFragment$a(this);
       this.w = s.c(new TextKeyboardFragment$tabHostFragment$2(this));
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, TextKeyboardFragment.class, "8");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       a.p(p0, "inflater");
       if (!PatchProxy.applyVoid(null, this, TextKeyboardFragment.class, "12")) {
          Dialog dialog = this.getDialog();
          if (dialog != null) {
             dialog.requestWindowFeature(1);
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
                attributes.type = 1000;
                attributes.gravity = 51;
                attributes.flags = ((attributes.flags | Float.MIN_NORMAL) | 0x20000) | 0x08;
                attributes.softInputMode = 49;
                a.o(attributes, "attr");
                this.uh(attributes);
                window.setAttributes(attributes);
             }
          }
          dialog = this.getDialog();
          if (dialog != null) {
             dialog.setCanceledOnTouchOutside(i);
          }
       }
       TextKeyboardFragment tp = this.p;
       if (tp == null) {
          a.S("keyboardOption");
       }
       ViewModel viewModel = ViewModelProviders.of(this, new b(tp.a())).get(a.class);
       a.o(viewModel, "ViewModelProviders.of\(th¡­ardViewModel::class.java\)");
       this.q = viewModel;
       return LayoutInflater.from(this.getContext()).inflate(0x7f0d15df, null);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, TextKeyboardFragment.class, "10")) {
          return;
       }
       super.onDestroyView();
       TextKeyboardFragment tq = this.q;
       if (tq == null) {
          a.S("mTextKeyboardViewModel");
       }
       tq.o0().removeObserver(this.v);
       Iterator iterator = this.r.iterator();
       while (iterator.hasNext()) {
          iterator.next().C();
       }
       if (!PatchProxy.applyVoid(null, this, TextKeyboardFragment.class, "28")) {
          tq = this.x;
          if (tq != null) {
             tq.clear();
          }
       }
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, TextKeyboardFragment.class, "13")) {
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TextKeyboardFragment.class, "9")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       e uoe = this.getChildFragmentManager().beginTransaction();
       int i = 0x7f0a2f77;
       TextPanelTabHostFragmentV2 textPanelTab = PatchProxy.apply(null, this, TextKeyboardFragment.class, "7");
       if (textPanelTab == PatchProxyResult.class) {
          textPanelTab = this.w.getValue();
       }
       uoe.v(i, textPanelTab);
       uoe.l();
       this.r.add(new a(this, p0));
       TextKeyboardFragment tq = this.q;
       if (tq == null) {
          a.S("mTextKeyboardViewModel");
       }
       tq.o0().observe(this, this.v);
       Iterator iterator = this.r.iterator();
       while (iterator.hasNext()) {
          iterator.next().B();
       }
       return;
    }
    public final boolean sh(){
       boolean b = (Build$VERSION.SDK_INT >= 30)? true: false;
       return b;
    }
    public final a th(){
       TextKeyboardFragment obj = PatchProxy.apply(null, this, TextKeyboardFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.q;
       if (obj == null) {
          a.S("mTextKeyboardViewModel");
       }
       return obj;
    }
    public final void uh(WindowManager$LayoutParams p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextKeyboardFragment.class, "11")) {
          return;
       }
       p0.x = 0;
       p0.y = this.u - d.a();
       int i = (this.sh())? d.a(): (d.a() + this.s) - this.u;
       p0.height = i;
       Number number = PatchProxy.apply(null, this, TextKeyboardFragment.class, "6");
       if (number == PatchProxyResult.class) {
          number = this.t.getValue();
       }
       p0.width = number.intValue();
       return;
    }
    public final void vh(int p0){
       if (PatchProxy.isSupport(TextKeyboardFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TextKeyboardFragment.class, "14")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().s("TextKeyboardFragment", "screenHeight: "+this.s+", updateHeight: "+p0+", keyboardY: "+this.u, objArray);
       Dialog dialog = this.getDialog();
       if (dialog != null) {
          Window window = dialog.getWindow();
          if (window != null) {
             WindowManager$LayoutParams attributes = window.getAttributes();
             attributes.x = i;
             attributes.y = this.u - d.a();
             attributes.height = p0;
             window.setAttributes(attributes);
          }
       }
       return;
    }
}
