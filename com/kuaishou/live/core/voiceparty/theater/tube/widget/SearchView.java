package com.kuaishou.live.core.voiceparty.theater.tube.widget.SearchView;
import android.widget.FrameLayout;
import vsd.n;
import kotlin.jvm.internal.PropertyReference1Impl;
import java.lang.Class;
import java.lang.String;
import kotlin.jvm.internal.PropertyReference1;
import vsd.p;
import nsd.m0;
import com.kuaishou.live.core.voiceparty.theater.tube.widget.SearchView$e;
import nsd.u;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import kotlin.jvm.internal.a;
import android.view.View;
import rsd.e;
import com.yxcorp.gifshow.util.KotterKnifeKt;
import com.kuaishou.live.core.voiceparty.theater.tube.widget.SearchView$g;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.kuaishou.live.core.voiceparty.theater.tube.widget.SearchView$a;
import android.view.View$OnClickListener;
import android.widget.TextView;
import com.kuaishou.live.core.voiceparty.theater.tube.widget.SearchView$b;
import android.widget.EditText;
import com.kuaishou.live.core.voiceparty.theater.tube.widget.SearchView$c;
import android.view.View$OnFocusChangeListener;
import com.kuaishou.live.core.voiceparty.theater.tube.widget.SearchView$d;
import android.widget.TextView$OnEditorActionListener;
import android.text.TextWatcher;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import java.lang.Boolean;
import a27.c;
import android.graphics.drawable.Drawable;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import android.content.res.Resources;
import android.content.res.Resources$Theme;
import o1.f;
import androidx.core.graphics.drawable.a;
import android.content.res.ColorStateList;
import android.util.SparseArray;
import ll8.c$b;
import android.content.res.TypedArray;
import android.os.Build$VERSION;
import android.text.Editable;
import com.yxcorp.utility.TextUtils;
import java.lang.Float;
import com.kuaishou.live.core.voiceparty.theater.tube.widget.SearchView$f;
import android.graphics.Typeface;

public class SearchView extends FrameLayout	// class@001a49
{
    public SearchView$f b;
    public String c;
    public boolean d;
    public boolean e;
    public boolean f;
    public CharSequence g;
    public final e h;
    public final e i;
    public final e j;
    public final e k;
    public final e l;
    public final e m;
    public final e n;
    public final SearchView$g o;
    public HashMap p;
    public static final n[] q;
    public static final SearchView$e r;

    static {
       n[] onArray = new n[]{m0.r(new PropertyReference1Impl(SearchView.class, "editorView", "getEditorView\(\)Landroid/widget/EditText;", 0)),m0.r(new PropertyReference1Impl(SearchView.class, "insideHintView", "getInsideHintView\(\)Landroid/widget/TextView;", 0)),m0.r(new PropertyReference1Impl(SearchView.class, "searchContainerView", "getSearchContainerView\(\)Landroid/view/View;", 0)),m0.r(new PropertyReference1Impl(SearchView.class, "searchIconView", "getSearchIconView\(\)Landroid/widget/ImageView;", 0)),m0.r(new PropertyReference1Impl(SearchView.class, "focusTrickView", "getFocusTrickView\(\)Landroid/view/View;", 0)),m0.r(new PropertyReference1Impl(SearchView.class, "clearButton", "getClearButton\(\)Landroid/widget/ImageView;", 0)),m0.r(new PropertyReference1Impl(SearchView.class, "cancelButton", "getCancelButton\(\)Landroid/widget/TextView;", 0))};
       SearchView.q = onArray;
       SearchView.r = new SearchView$e(null);
    }
    public void SearchView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void SearchView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.e = true;
       this.h = KotterKnifeKt.a(this, 0x7f0a0ca8);
       this.i = KotterKnifeKt.a(this, 0x7f0a1406);
       this.j = KotterKnifeKt.a(this, 0x7f0a3775);
       this.k = KotterKnifeKt.a(this, 0x7f0a379e);
       this.l = KotterKnifeKt.a(this, 0x7f0a0f39);
       this.m = KotterKnifeKt.a(this, 0x7f0a073b);
       this.n = KotterKnifeKt.a(this, 0x7f0a0649);
       SearchView$g og = new SearchView$g(this);
       this.o = og;
       LayoutInflater.from(p0).inflate(R.layout.arg_RES_7f0d16e6, this);
       this.getClearButton().setOnClickListener(new SearchView$a(this));
       this.getCancelButton().setOnClickListener(new SearchView$b(this));
       this.getEditorView().setOnFocusChangeListener(new SearchView$c(this));
       this.getEditorView().setOnEditorActionListener(new SearchView$d(this));
       this.getEditorView().addTextChangedListener(og);
       this.getSearchIconView().setImageLevel(true);
       this.e(p0, p1, p2);
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, SearchView.class, "35")) {
          return;
       }
       if (this.getFocusTrickView() != null) {
          View focusTrickVi = this.getFocusTrickView();
          if (focusTrickVi != null) {
             focusTrickVi.requestFocus();
          }
       }else {
          this.getSearchIconView().requestFocus();
       }
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, SearchView.class, "34")) {
          return;
       }
       this.getEditorView().setText("");
       return;
    }
    public final void c(boolean p0){
       if (PatchProxy.isSupport(SearchView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, SearchView.class, "32")) {
          return;
       }
       this.j(p0);
       if (!this.f()) {
          return;
       }
       if (p0) {
          this.b();
       }
       this.getCancelButton().setVisibility(8);
       c.d(this.getEditorView());
       this.a();
       return;
    }
    public final Drawable d(int p0,int p1){
       if (PatchProxy.isSupport(SearchView.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, SearchView.class, "37");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Drawable uDrawable = f.c(this.getResources(), p0, null);
       if (uDrawable != null && p1) {
          uDrawable = a.r(uDrawable);
          a.o(uDrawable, f.b(this.getResources(), p1, null));
       }
       return uDrawable;
    }
    public void dispatchRestoreInstanceState(SparseArray p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchView.class, "12")) {
          return;
       }
       a.p(p0, "container");
       if (this.e == null) {
          this.o.a(false);
       }
       super.dispatchRestoreInstanceState(p0);
       if (this.e == null) {
          this.b();
          this.o.a(true);
       }
       return;
    }
    public final void e(Context p0,AttributeSet p1,int p2){
       if (PatchProxy.isSupport(SearchView.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, SearchView.class, "8")) {
          return;
       }
       TypedArray typedArray = p0.getTheme().obtainStyledAttributes(p1, c$b.h6, p2, 0);
       a.o(typedArray, "context.theme.obtainStyl¡­rchView, defStyleAttr, 0\)");
       int indexCount = typedArray.getIndexCount();
       p2 = 0;
       int i = 0;
       int i1 = 0;
       while (p2 < indexCount) {
          int index = typedArray.getIndex(p2);
          if (index == 4) {
             this.setBackground(typedArray.getDrawable(index));
          }else if(index == 1){
             index = typedArray.getInt(index, 0);
             if (index) {
                this.setTextStyle(index);
             }
          }else if(!index){
             int i2 = -1;
             index = typedArray.getDimensionPixelSize(index, i2);
             if (index != i2) {
                this.i(0, (float)index);
             }
          }else if(index == 2){
             index = typedArray.getResourceId(index, 0);
             if (index) {
                this.setTextColor(index);
             }
          }else if(index == 3){
             index = typedArray.getResourceId(index, 0);
             if (index) {
                this.setHintTextColor(index);
             }
          }else if(index == 6){
             index = typedArray.getResourceId(index, 0);
             if (index && Build$VERSION.SDK_INT >= 29) {
                this.setTextCursorDrawable(index);
             }
          }else if(index == 5){
             CharSequence text = typedArray.getText(index);
             a.o(text, "a.getText\(attr\)");
             this.setHintText(text);
          }else if(index == 9){
             index = typedArray.getResourceId(index, 0);
             if (index) {
                this.setSearchBackground(index);
             }
          }else if(index == 10){
             i = typedArray.getResourceId(index, i);
          }else if(index == 11){
             i1 = typedArray.getResourceId(index, i1);
          }else if(index == 8){
             index = typedArray.getResourceId(index, 0);
             if (index) {
                this.setClearDrawable(index);
             }
          }else if(index == 7){
             index = typedArray.getResourceId(index, 0);
             if (index) {
                this.setCancelTextColor(index);
             }
          }
          p2++;
       }
       if (i) {
          this.h(i, i1);
       }
       return;
    }
    public final boolean f(){
       Object obj = PatchProxy.apply(null, this, SearchView.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!this.getCancelButton().getVisibility())? true: false;
       return b;
    }
    public final String g(boolean p0){
       Editable obj;
       if (PatchProxy.isSupport(SearchView.class)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, SearchView.class, "33");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = TextUtils.G(this.getEditorView());
       int i = 0;
       String str = (obj != null)? obj.toString(): i;
       if (p0) {
          if (str != null) {
             i = 1;
             int i1 = str.length() - i;
             int i2 = 0;
             int i3 = 0;
             while (true) {
                if (i2 <= i1) {
                   int i4 = (!i3)? i2: i1;
                   i4 = (a.t(str.charAt(i4), 32) <= 0)? 1: 0;
                   if (!i3) {
                      if (!i4) {
                         i3 = 1;
                      }else {
                         i2 = i2 + 1;
                      }
                   }else if(!i4){
                   label_005e :
                      i = str.subSequence(i2, (i1 + i)).toString();
                   }else {
                      i1--;
                   }
                }else {
                   goto label_005e ;
                }
             }
          }
          str = i;
       }
       if (TextUtils.x(str) && this.f != null) {
          str = this.getEditorView().getHint().toString();
       }
       return str;
    }
    public final TextView getCancelButton(){
       Object obj = PatchProxy.apply(null, this, SearchView.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.n.a(this, SearchView.q[6]);
    }
    public final ImageView getClearButton(){
       Object obj = PatchProxy.apply(null, this, SearchView.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.m.a(this, SearchView.q[5]);
    }
    public final EditText getEditorView(){
       Object obj = PatchProxy.apply(null, this, SearchView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.h.a(this, SearchView.q[0]);
    }
    public final View getFocusTrickView(){
       Object obj = PatchProxy.apply(null, this, SearchView.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.l.a(this, SearchView.q[4]);
    }
    public final TextView getInsideHintView(){
       Object obj = PatchProxy.apply(null, this, SearchView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.i.a(this, SearchView.q[1]);
    }
    public final String getKeyword(){
       Object obj = PatchProxy.apply(null, this, SearchView.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TextUtils.G(this.getEditorView()).toString();
    }
    public final View getSearchContainerView(){
       Object obj = PatchProxy.apply(null, this, SearchView.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.j.a(this, SearchView.q[2]);
    }
    public final ImageView getSearchIconView(){
       Object obj = PatchProxy.apply(null, this, SearchView.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.k.a(this, SearchView.q[3]);
    }
    public final void h(int p0,int p1){
       if (PatchProxy.isSupport(SearchView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, SearchView.class, "17")) {
          return;
       }
       Drawable uDrawable = this.d(p0, p1);
       if (uDrawable != null) {
          uDrawable.setLevel(1);
       }else {
          uDrawable = null;
       }
       Drawable uDrawable1 = this.d(p0, p1);
       if (uDrawable1 != null) {
          uDrawable1.setLevel(1);
       }else {
          uDrawable1 = null;
       }
       this.getInsideHintView().setCompoundDrawablesWithIntrinsicBounds(uDrawable, null, null, null);
       this.getSearchIconView().setImageDrawable(uDrawable1);
       return;
    }
    public final void i(int p0,float p1){
       if (PatchProxy.isSupport(SearchView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Float.valueOf(p1), this, SearchView.class, "21")) {
          return;
       }
       this.getEditorView().setTextSize(p0, p1);
       this.getInsideHintView().setTextSize(p0, p1);
       this.getCancelButton().setTextSize(p0, p1);
       return;
    }
    public final void j(boolean p0){
       if (PatchProxy.isSupport(SearchView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, SearchView.class, "36")) {
          return;
       }
       TextView insideHintVi = this.getInsideHintView();
       int i = 0;
       int i1 = (p0)? 0: 8;
       insideHintVi.setVisibility(i1);
       ImageView searchIconVi = this.getSearchIconView();
       if (p0) {
          i = 8;
       }
       searchIconVi.setVisibility(i);
       EditText editorView = this.getEditorView();
       CharSequence uCharSequenc = (p0)? null: this.g;
       editorView.setHint(uCharSequenc);
       return;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, SearchView.class, "10")) {
          return;
       }
       super.onAttachedToWindow();
       this.o.a(true);
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, SearchView.class, "11")) {
          return;
       }
       super.onDetachedFromWindow();
       this.o.a(false);
       this.b();
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, SearchView.class, "9")) {
          return;
       }
       super.onFinishInflate();
       this.c(true);
       return;
    }
    public final void setCancelTextColor(int p0){
       if (PatchProxy.isSupport(SearchView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SearchView.class, "27")) {
          return;
       }
       this.getCancelButton().setTextColor(f.b(this.getResources(), p0, null));
       return;
    }
    public final void setClearDrawable(int p0){
       if (PatchProxy.isSupport(SearchView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SearchView.class, "18")) {
          return;
       }
       this.getClearButton().setImageResource(p0);
       return;
    }
    public final void setHintSearchable(boolean p0){
       this.f = p0;
    }
    public final void setHintText(int p0){
       if (PatchProxy.isSupport(SearchView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SearchView.class, "24")) {
          return;
       }
       String str = this.getContext().getString(p0);
       a.o(str, "context.getString\(hint\)");
       this.setHintText(str);
       return;
    }
    public final void setHintText(CharSequence p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchView.class, "25")) {
          return;
       }
       a.p(p0, "hint");
       this.g = p0;
       this.getInsideHintView().setText(p0);
       this.getEditorView().setHint(p0);
       this.j((this.f() ^ 0x01));
       return;
    }
    public final void setHintTextColor(int p0){
       if (PatchProxy.isSupport(SearchView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SearchView.class, "26")) {
          return;
       }
       this.getEditorView().setHintTextColor(f.b(this.getResources(), p0, null));
       this.getInsideHintView().setTextColor(f.b(this.getResources(), p0, null));
       return;
    }
    public final void setRestoreText(boolean p0){
       this.e = p0;
    }
    public final void setSearchBackground(int p0){
       if (PatchProxy.isSupport(SearchView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SearchView.class, "16")) {
          return;
       }
       this.getSearchContainerView().setBackgroundResource(p0);
       return;
    }
    public final void setSearchCallback(SearchView$f p0){
       this.b = p0;
    }
    public final void setTextColor(int p0){
       if (PatchProxy.isSupport(SearchView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SearchView.class, "19")) {
          return;
       }
       this.getEditorView().setTextColor(f.b(this.getResources(), p0, null));
       return;
    }
    public final void setTextCursorDrawable(int p0){
       if (PatchProxy.isSupport(SearchView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SearchView.class, "23")) {
          return;
       }
       this.getEditorView().setTextCursorDrawable(p0);
       return;
    }
    public final void setTextSize(float p0){
       if (PatchProxy.isSupport(SearchView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, SearchView.class, "20")) {
          return;
       }
       this.i(1, p0);
       return;
    }
    public final void setTextStyle(int p0){
       if (PatchProxy.isSupport(SearchView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SearchView.class, "22")) {
          return;
       }
       this.getEditorView().setTypeface(this.getEditorView().getTypeface(), p0);
       this.getInsideHintView().setTypeface(this.getInsideHintView().getTypeface(), p0);
       return;
    }
    public final void setTrimKeyword(boolean p0){
       this.d = p0;
    }
}
