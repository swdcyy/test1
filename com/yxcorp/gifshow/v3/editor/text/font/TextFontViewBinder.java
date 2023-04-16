package com.yxcorp.gifshow.v3.editor.text.font.TextFontViewBinder;
import yuc.c;
import ei0.a;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel;
import android.view.View;
import com.yxcorp.gifshow.v3.editor.text.font.FontVMDelegate;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.text.font.TextFontViewBinder$mFontAdapter$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.v3.editor.text.font.TextFontViewBinder$mFontRecyclerView$2;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.v3.editor.text.font.adapter.FontAdapter;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.yxcorp.gifshow.v3.editor.text.font.vm.FontViewModel;
import di0.b;
import androidx.lifecycle.LiveData;
import com.kuaishou.kotlin.livedata.ListHolder;
import java.util.Collection;
import faa.a;
import q87.c;
import android.os.Bundle;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.v3.editor.text.font.TextFontViewBinder$b;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import androidx.recyclerview.widget.LinearLayoutManager;
import yuc.d;
import com.yxcorp.gifshow.v3.editor.text.font.TextFontViewBinder$a;
import java.lang.Number;
import android.view.ViewGroup;
import java.lang.Integer;
import android.view.ViewTreeObserver;
import com.yxcorp.gifshow.v3.editor.text.font.TextFontViewBinder$c;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.v3.editor.text.font.TextFontViewBinder$updateTextFont$1;
import msd.l;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;

public final class TextFontViewBinder extends a implements c	// class@001434
{
    public final p c;
    public final p d;
    public final Fragment e;
    public final TextElementViewModel f;
    public final View g;
    public final FontVMDelegate h;

    public void TextFontViewBinder(Fragment p0,TextElementViewModel p1,View p2,FontVMDelegate p3){
       String str;
       Object[] objArray1;
       TextFontViewBinder textFontView = TextFontViewBinder.class;
       a.p(p0, "fragment");
       a.p(p1, "textViewModel");
       a.p(p2, "rootView");
       a.p(p3, "vmDelegate");
       super(p2);
       this.e = p0;
       this.f = p1;
       this.g = p2;
       this.h = p3;
       this.c = s.c(new TextFontViewBinder$mFontAdapter$2(this));
       this.d = s.c(new TextFontViewBinder$mFontRecyclerView$2(this));
       this.E().setAdapter(this.D());
       Object[] objArray = null;
       int i = 1;
       if (PatchProxy.applyVoid(objArray, this, textFontView, "4")) {
       }else if(p3.d().isEmpty()){
          ListHolder value = p3.f().w0().getValue();
          List list = (value != null)? value.c(): objArray;
          if (list != null && (list.isEmpty() ^ i) == i) {
             Object[] objArray2 = new Object[0];
             a.D().s("TextFontViewBinder", "vmList isNotEmpty", objArray2);
             p3.d().addAll(list);
             this.D().O0();
             this.D().k0();
          }else {
             objArray1 = new Object[0];
             a.D().s("TextFontViewBinder", "load cache", objArray1);
             p3.f().y0(0);
          }
       }else {
          objArray1 = new Object[0];
          a.D().s("TextFontViewBinder", "fontList isNotEmpty", objArray1);
          this.D().O0();
       }
       if (!PatchProxy.applyVoid(objArray, this, textFontView, "3")) {
          Bundle arguments = p0.getArguments();
          if (arguments != null) {
             str = arguments.getString("currentFont");
             if (str != null) {
             label_00da :
                a.o(str, "fragment.arguments?.getS\x20\x02g\(KEY_CURRENT_FONT\) ?: \"\"\x00");
                String str1 = p3.e();
                objArray1 = new Object[0];
                a.D().s("TextFontViewBinder", "floatCurrentFontName: "+str1+" draftFontName: "+str, objArray1);
                int i1 = (!str.length())? 1: 0;
                if (i1) {
                   i1 = (str1.length() > 0)? 1: 0;
                   if (i1) {
                      this.F(p3.a(str1));
                      this.G(str1);
                   }
                }
                i1 = (str.length() > 0)? true: false;
                if (i1) {
                   if (a.g(str, str1) ^ i) {
                      int i2 = p3.a(str);
                      if (i2 >= 0) {
                         this.F(i2);
                      }else {
                         str = p3.c();
                         if (str.length() <= 0) {
                            i = 0;
                         }
                         if (i) {
                            this.F(0);
                            str1 = str;
                         }
                         this.G(str1);
                      }
                   }else {
                      this.F(p3.a(str1));
                   }
                }
             }
          }
          str = "";
          goto label_00da ;
       }
       return;
    }
    public void B(){
       if (PatchProxy.applyVoid(null, this, TextFontViewBinder.class, "9")) {
          return;
       }
       this.h.f().w0().observe(this.e, new TextFontViewBinder$b(this));
       return;
    }
    public RecyclerView$LayoutManager B1(){
       RecyclerView$LayoutManager obj = PatchProxy.apply(null, this, TextFontViewBinder.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.E().getLayoutManager();
       Objects.requireNonNull(obj, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
       return obj;
    }
    public void C(){
       if (PatchProxy.applyVoid(null, this, TextFontViewBinder.class, "10")) {
          return;
       }
       this.h.f().w0().removeObservers(this.e);
       return;
    }
    public d C1(){
       Object obj = PatchProxy.apply(null, this, TextFontViewBinder.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new TextFontViewBinder$a(this);
    }
    public final FontAdapter D(){
       Object obj = PatchProxy.apply(null, this, TextFontViewBinder.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.getValue();
    }
    public int D1(){
       Object obj = PatchProxy.apply(null, this, TextFontViewBinder.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.E().getWidth();
    }
    public final RecyclerView E(){
       Object obj = PatchProxy.apply(null, this, TextFontViewBinder.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.getValue();
    }
    public final void F(int p0){
       TextFontViewBinder textFontView = TextFontViewBinder.class;
       if (PatchProxy.isSupport(textFontView) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, textFontView, "6")) {
          return;
       }
       if (p0 < 0) {
          return;
       }
       if (!this.E().getWidth()) {
          this.E().getViewTreeObserver().addOnGlobalLayoutListener(new TextFontViewBinder$c(this, p0));
       }else {
          this.D().N0(p0);
          this.D().J0(p0);
       }
       return;
    }
    public final void G(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextFontViewBinder.class, "8")) {
          return;
       }
       a.p(p0, "fontFileName");
       this.f.a1(4, new TextFontViewBinder$updateTextFont$1(p0));
       return;
    }
    public Activity getActivity(){
       Object obj = PatchProxy.apply(null, this, TextFontViewBinder.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e.getActivity();
    }
}
