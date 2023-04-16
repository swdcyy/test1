package com.yxcorp.gifshow.v3.editor.text.textpanel.style.TextStyleViewBinder;
import ei0.a;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.ImageView;
import k17.b;
import lnc.a1;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.v3.editor.text.textpanel.style.TextStyleViewBinder$a;
import android.os.Bundle;
import android.os.Parcelable;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleValue;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.MutableLiveData;
import kotlin.Pair;
import java.lang.Integer;
import com.yxcorp.gifshow.v3.editor.text.model.TextConfigParam;
import huc.d;
import com.yxcorp.gifshow.v3.editor.text.model.TextDrawConfigParam;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleAttrs;
import androidx.lifecycle.LiveData;
import com.yxcorp.gifshow.v3.editor.text.textpanel.style.TextStyleViewBinder$1;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.v3.editor.text.textpanel.style.TextStyleViewBinder$2;
import com.yxcorp.gifshow.v3.widget.CenterLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView$l;
import androidx.recyclerview.widget.RecyclerView$n;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleDataManager$a;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleDataManager$TextColors;
import huc.s;
import tb7.j;
import com.yxcorp.gifshow.v3.editor.text.textpanel.style.TextStyleViewBinder$c;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.v3.editor.text.textpanel.style.TextStyleViewBinder$d;
import java.lang.Boolean;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.yxcorp.gifshow.v3.editor.text.textpanel.style.TextStyleViewBinder$e;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import java.util.Objects;
import androidx.recyclerview.widget.LinearLayoutManager;

public final class TextStyleViewBinder extends a	// class@0014db
{
    public final RecyclerView c;
    public final ImageView d;
    public final ImageView e;
    public final b f;
    public final FrameLayout g;
    public final TextStyleViewBinder$a h;
    public final boolean i;
    public final String j;
    public final TextStyleValue k;
    public final Fragment l;
    public final TextElementViewModel m;

    public void TextStyleViewBinder(Fragment p0,TextElementViewModel p1,View p2){
       String str1;
       Bundle obj = p0;
       Pair obj1 = p1;
       Object obj2 = p2;
       TextStyleViewBinder textStyleVie = TextStyleViewBinder.class;
       a.p(obj, "fragment");
       a.p(obj1, "textViewModel");
       a.p(obj2, "rootView");
       super(obj2);
       this.l = obj;
       this.m = obj1;
       View view = obj2.findViewById(R.id.text_style_colors_recyclerview);
       a.o(view, "rootView.findViewById\(R.¡­tyle_colors_recyclerview\)");
       this.c = view;
       View view1 = obj2.findViewById(R.id.text_style_mode_switch);
       a.o(view1, "rootView.findViewById\(R.id.text_style_mode_switch\)");
       this.d = view1;
       View view2 = obj2.findViewById(R.id.text_style_alignment_switch);
       a.o(view2, "rootView.findViewById\(R.¡­t_style_alignment_switch\)");
       this.e = view2;
       b uob = new b(0, a1.e(10.00f), a1.e(10.00f), 0);
       this.f = uob;
       this.g = obj2.findViewById(0x7f0a3f95);
       TextStyleViewBinder$a uoa = new TextStyleViewBinder$a(this);
       this.h = uoa;
       Bundle arguments = p0.getArguments();
       boolean b = (arguments != null && arguments.getInt("panelFrom") == 256)? true: false;
       this.i = b;
       Bundle arguments1 = p0.getArguments();
       Object[] objArray = null;
       String str = (arguments1 != null)? arguments1.getString("currentTextId"): objArray;
       this.j = str;
       obj = p0.getArguments();
       TextStyleValue parcelable = (obj != null)? obj.getParcelable("draftCustomStyleData"): objArray;
       this.k = parcelable;
       if (!PatchProxy.applyVoid(objArray, this, textStyleVie, "6")) {
          if (parcelable != null) {
             obj1.U0(b).setValue(new Pair(parcelable, Integer.valueOf(0)));
          }
          TextConfigParam textConfigPa = (str == null || !str.length())? 1: null;
          if (!textConfigPa) {
             p1.W0().setValue(d.h(str).i().o());
          }
       }
       this.E(p1.W0().getValue());
       this.H();
       view1.setOnClickListener(new TextStyleViewBinder$1(this));
       this.F();
       view2.setOnClickListener(new TextStyleViewBinder$2(this));
       view.setLayoutManager(new CenterLayoutManager(p2.getContext(), 0, 0, 0));
       view.setAdapter(uoa);
       RecyclerView$l ol = null;
       view.setItemAnimator(ol);
       if (!view.getItemDecorationCount()) {
          view.addItemDecoration(uob);
       }
       if (!PatchProxy.applyVoid(ol, this, textStyleVie, "2")) {
          obj1 = obj1.U0(b).getValue();
          if (obj1 != null) {
             TextStyleValue first = obj1.getFirst();
             if (first != null) {
                str1 = first.j();
             label_014a :
                int i = -1;
                Iterator iterator = uoa.e.iterator();
                int i1 = 0;
                while (iterator.hasNext()) {
                   Object obj3 = iterator.next();
                   int i2 = i1 + 1;
                   if (i1 < 0) {
                      CollectionsKt__CollectionsKt.W();
                   }
                   if (j.a(str1, s.a(obj3.a.c))) {
                      i = i1;
                   }
                   i1 = i2;
                }
                if (i >= 0) {
                   this.D(i, 0);
                }
             }
          }
          str1 = ol;
          goto label_014a ;
       }
       return;
    }
    public void B(){
       if (PatchProxy.applyVoid(null, this, TextStyleViewBinder.class, "4")) {
          return;
       }
       this.m.U0(this.i).observe(this.l, new TextStyleViewBinder$c(this));
       this.m.W0().observe(this.l, new TextStyleViewBinder$d(this));
       return;
    }
    public void C(){
       if (PatchProxy.applyVoid(null, this, TextStyleViewBinder.class, "5")) {
          return;
       }
       this.m.U0(this.i).removeObservers(this.l);
       this.m.W0().removeObservers(this.l);
       return;
    }
    public final void D(int p0,boolean p1){
       RecyclerView$LayoutManager layoutManage1;
       TextStyleViewBinder textStyleVie = TextStyleViewBinder.class;
       if (PatchProxy.isSupport(textStyleVie) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, textStyleVie, "3")) {
          return;
       }
       if (!this.c.getWidth() || !this.c.getChildCount()) {
          this.c.getViewTreeObserver().addOnGlobalLayoutListener(new TextStyleViewBinder$e(this, p0, p1));
       }
       RecyclerView$LayoutManager layoutManage = this.c.getLayoutManager();
       Objects.requireNonNull(layoutManage, "null cannot be cast to non-null type com.yxcorp.gifshow.v3.widget.CenterLayoutManager");
       layoutManage.H(true);
       if (p1) {
          layoutManage1 = this.c.getLayoutManager();
          Objects.requireNonNull(layoutManage1, "null cannot be cast to non-null type com.yxcorp.gifshow.v3.widget.CenterLayoutManager");
          layoutManage1.W0(100.00f);
          this.c.smoothScrollToPosition(p0);
       }else {
          layoutManage1 = this.c.getLayoutManager();
          Objects.requireNonNull(layoutManage1, "null cannot be cast to non-null type com.yxcorp.gifshow.v3.widget.CenterLayoutManager");
          layoutManage1.W0(10.00f);
          this.c.smoothScrollToPosition(p0);
       }
       return;
    }
    public final void E(TextStyleAttrs p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextStyleViewBinder.class, "7")) {
          return;
       }
       TextStyleViewBinder td = this.d;
       float f = 0x3f800000;
       float f1 = (p0 != null && p0.d() == true)? 0x3f800000: 0x3f000000;
       td.setAlpha(f1);
       td = this.e;
       f1 = (p0 != null && p0.b() == true)? 0x3f800000: 0x3f000000;
       td.setAlpha(f1);
       td = this.c;
       if (p0 == null || p0.c() != true) {
          f = 0x3f000000;
       }
       td.setAlpha(f);
       return;
    }
    public final void F(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, TextStyleViewBinder.class, "8")) {
          return;
       }
       Pair value = this.m.U0(this.i).getValue();
       if (value != null) {
          TextStyleValue first = value.getFirst();
          if (first != null) {
             objArray = Integer.valueOf(first.h());
          }
       }
       int i = 0x7f080f05;
       if (objArray != null && !objArray.intValue()) {
          this.e.setImageResource(i);
       }else {
          int i1 = 1;
          if (objArray != null && objArray.intValue() == i1) {
             this.e.setImageResource(R.drawable.arg_RES_7f080f03);
          }else if(objArray != null && objArray.intValue() == 2){
             this.e.setImageResource(R.drawable.arg_RES_7f080f07);
          }else {
             this.e.setImageResource(i);
          }
       }
       return;
    }
    public final void G(){
       if (PatchProxy.applyVoid(null, this, TextStyleViewBinder.class, "10")) {
          return;
       }
       this.h.k0();
       return;
    }
    public final void H(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, TextStyleViewBinder.class, "9")) {
          return;
       }
       Pair value = this.m.U0(this.i).getValue();
       if (value != null) {
          TextStyleValue first = value.getFirst();
          if (first != null) {
             objArray = Integer.valueOf(first.i());
          }
       }
       int i = 0x7f080f0d;
       if (objArray != null && !objArray.intValue()) {
          this.d.setImageResource(i);
       }else {
          int i1 = 1;
          if (objArray != null && objArray.intValue() == i1) {
             this.d.setImageResource(R.drawable.arg_RES_7f080f0b);
          }else {
             i1 = 2;
             if (objArray != null && objArray.intValue() == i1) {
                this.d.setImageResource(R.drawable.arg_RES_7f080f11);
             }else if(objArray != null && objArray.intValue() == 3){
                this.d.setImageResource(R.drawable.arg_RES_7f080f0f);
             }else {
                this.d.setImageResource(i);
             }
          }
       }
       return;
    }
}
