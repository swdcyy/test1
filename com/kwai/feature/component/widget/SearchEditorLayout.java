package com.kwai.feature.component.widget.SearchEditorLayout;
import android.text.TextWatcher;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import com.kwai.feature.component.widget.SearchEditorLayout$a;
import com.kwai.feature.component.SearchStateLogic;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import iy5.e;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import ekd.m1;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.EditText;
import k06.b;
import android.view.View$OnClickListener;
import k06.c;
import k06.e;
import android.widget.TextView$OnEditorActionListener;
import k06.d;
import android.view.View$OnFocusChangeListener;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.component.widget.SearchEditorLayout$d;
import java.lang.Boolean;
import java.lang.Integer;
import android.app.Activity;
import e3a.a;
import com.yxcorp.utility.n;
import android.util.SparseArray;
import android.content.res.Resources$Theme;
import o1.f;
import com.kwai.feature.component.widget.SearchEditorLayout$b;
import android.view.ViewParent;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.os.Build$VERSION;
import com.kwai.feature.component.widget.SearchEditorLayout$c;

public class SearchEditorLayout extends FrameLayout implements TextWatcher	// class@0012ad
{
    public View b;
    public ImageView c;
    public TextView d;
    public EditText e;
    public TextView f;
    public ImageView g;
    public View h;
    public View i;
    public FrameLayout j;
    public e k;
    public String l;
    public SearchEditorLayout$d m;
    public SearchEditorLayout$c n;
    public SearchEditorLayout$b o;
    public final SearchStateLogic p;
    public SearchStateLogic$b q;
    public static final int r;

    public void SearchEditorLayout(Context p0){
       super(p0, null);
    }
    public void SearchEditorLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void SearchEditorLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.l = "";
       this.q = new SearchEditorLayout$a(this);
       SearchStateLogic searchStateL = new SearchStateLogic(p0, this);
       this.p = searchStateL;
       SearchEditorLayout tq = this.q;
       Objects.requireNonNull(searchStateL);
       if (PatchProxy.applyVoidOneRefs(tq, searchStateL, SearchStateLogic.class, "7")) {
       }else if(tq != null){
          searchStateL.k.add(tq);
       }
       this.k = searchStateL.b();
       if (!PatchProxy.applyVoidOneRefs(p0, this, SearchEditorLayout.class, "4")) {
          View view = a.c(p0, R.layout.arg_RES_7f0d139b, this);
          this.i = m1.f(view, 0x7f0a367d);
          this.b = m1.f(view, 0x7f0a4453);
          this.c = m1.f(view, 0x7f0a157c);
          this.d = m1.f(view, 0x7f0a410c);
          this.e = m1.f(view, 0x7f0a3781);
          this.f = m1.f(view, 0x7f0a4107);
          this.g = m1.f(view, 0x7f0a1508);
          this.h = m1.f(view, 0x7f0a443c);
          this.j = m1.f(view, 0x7f0a0ed8);
          m1.a(view, new b(this), R.id.iv_clear_button);
          m1.a(view, new c(this), R.id.tv_cancel_button);
          m1.f(view, R.id.search_editor).setOnEditorActionListener(new e(this));
          m1.c(view, new d(this), R.id.search_editor);
          this.a();
       }
       return;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, SearchEditorLayout.class, "10")) {
          return;
       }
       this.g(this.k.a);
       String str = (!TextUtils.x(this.k.b()))? this.k.b().toString(): "";
       this.e.setHint(str);
       this.d.setText(str);
       if (this.k.a()) {
          this.i.setBackground(this.getResources().getDrawable(this.k.a()));
       }
       return;
    }
    public void afterTextChanged(Editable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchEditorLayout.class, "16")) {
          return;
       }
       String str = p0.toString();
       if (!PatchProxy.applyVoidOneRefs(str, this, SearchEditorLayout.class, "17")) {
          String str1 = PatchProxy.applyOneRefs(str, this, SearchEditorLayout.class, "15");
          if (str1 != PatchProxyResult.class) {
          }else if(this.k.h()){
             str1 = str.trim();
          }else {
             str1 = str;
          }
          if (!(this.l).equals(str1)) {
             this.l = str1;
          }
          SearchEditorLayout tg = this.g;
          int i = (!TextUtils.x(str))? 0: 8;
          tg.setVisibility(i);
       }
       this.p.f(2);
       SearchEditorLayout tm = this.m;
       if (tm != null) {
          tm.a(p0.toString());
       }
       p0 = PatchProxy.apply(null, this, SearchEditorLayout.class, "18");
       boolean b = (p0 != PatchProxyResult.class)? p0.booleanValue(): TextUtils.x(this.l) ^ 0x01;
       if (b && this.p.b().e()) {
          this.c(false, 11);
       }
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, SearchEditorLayout.class, "14")) {
          return;
       }
       this.e.setText("");
       return;
    }
    public void beforeTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
    public final void c(boolean p0,int p1){
       if (PatchProxy.isSupport(SearchEditorLayout.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), this, SearchEditorLayout.class, "20")) {
          return;
       }
       CharSequence uCharSequenc = this.p.b().b();
       String str = (this.p.b().d() && !TextUtils.x(uCharSequenc))? 1: null;
       if (TextUtils.x(this.l) && str) {
          this.l = uCharSequenc.toString();
          this.e.setText(uCharSequenc);
       }
       if (!TextUtils.x(this.l)) {
          if (p0) {
             Activity uActivity = a.b(this.getContext());
             if (uActivity != null) {
                n.C(uActivity);
             }
          }
          if (p1 == 12) {
             this.p.f(4);
          }else {
             this.p.f(3);
          }
       }
       return;
    }
    public final int d(boolean p0,int p1,int p2){
       if (p0) {
       }else {
          p1 = p2;
       }
       return p1;
    }
    public void dispatchRestoreInstanceState(SparseArray p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchEditorLayout.class, "13")) {
          return;
       }
       boolean b = this.k.c();
       if (b) {
          this.e.removeTextChangedListener(this);
       }
       super.dispatchRestoreInstanceState(p0);
       if (b) {
          this.b();
          this.e.addTextChangedListener(this);
       }
       return;
    }
    public boolean e(){
       Object obj = PatchProxy.apply(null, this, SearchEditorLayout.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return TextUtils.x(this.e.getText());
    }
    public void f(View p0,boolean p1){
       if (PatchProxy.isSupport(SearchEditorLayout.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, SearchEditorLayout.class, "23")) {
          return;
       }
       if (p1) {
          this.h(true);
          this.e.requestFocus();
          this.e.requestFocusFromTouch();
          this.p.f(true);
       }else if(!TextUtils.x(this.l)){
          Activity uActivity = a.b(this.getContext());
          if (uActivity != null) {
             n.C(uActivity);
          }
       }
       return;
    }
    public final void g(boolean p0){
       if (PatchProxy.isSupport(SearchEditorLayout.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, SearchEditorLayout.class, "27")) {
          return;
       }
       SearchEditorLayout td = this.d;
       int i = 8;
       int i1 = 0;
       int i2 = (p0)? 0: 8;
       td.setVisibility(i2);
       td = this.c;
       if (!p0) {
          i = 0;
       }
       td.setVisibility(i);
       td = this.e;
       if (!p0) {
          i1 = f.a(this.getResources(), this.k.g, null);
       }
       td.setHintTextColor(i1);
       return;
    }
    public SearchEditorLayout$b getCancelBtnClickListener(){
       return this.o;
    }
    public e getConfigOptions(){
       return this.k;
    }
    public SearchEditorLayout$d getISearchTextChangeListener(){
       return this.m;
    }
    public String getKeyword(){
       return this.l;
    }
    public SearchStateLogic getSearchStateLogic(){
       return this.p;
    }
    public final void h(boolean p0){
       if (PatchProxy.isSupport(SearchEditorLayout.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, SearchEditorLayout.class, "26")) {
          return;
       }
       this.g((p0 ^ 0x01));
       SearchEditorLayout tf = this.f;
       int i = (p0)? 0: 8;
       tf.setVisibility(i);
       return;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, SearchEditorLayout.class, "30")) {
          return;
       }
       super.onAttachedToWindow();
       this.e.addTextChangedListener(this);
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, SearchEditorLayout.class, "31")) {
          return;
       }
       this.e.removeTextChangedListener(this);
       this.b();
       super.onDetachedFromWindow();
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, SearchEditorLayout.class, "1")) {
          return;
       }
       super.onFinishInflate();
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(SearchEditorLayout.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, SearchEditorLayout.class, "2")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       SearchEditorLayout tp = this.p;
       Context context = this.getContext();
       ViewGroup parent = this.getParent();
       Objects.requireNonNull(tp);
       if (!PatchProxy.applyVoidTwoRefs(context, parent, tp, SearchStateLogic.class, "1") && tp.o == null) {
          tp.o = true;
          tp.c = parent;
          View view = a.c(context, R.layout.arg_RES_7f0d1399, null);
          view.setId(SearchStateLogic.p);
          tp.e = view;
          parent.addView(view);
          view.setVisibility(8);
          tp.a();
       }
       return;
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
    public void setCancelBtnClickListener(SearchEditorLayout$b p0){
       this.o = p0;
    }
    public void setCancelBtnText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchEditorLayout.class, "8")) {
          return;
       }
       if (this.f != null) {
          if (TextUtils.x(p0)) {
             p0 = "";
          }
          this.f.setText(p0);
       }
       return;
    }
    public void setConfigOptions(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchEditorLayout.class, "3")) {
          return;
       }
       if (p0 != null) {
          this.k = p0;
          this.a();
       }
       return;
    }
    public void setCustomRightLayout(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchEditorLayout.class, "5")) {
          return;
       }
       SearchEditorLayout tj = this.j;
       if (tj != null && p0 != null) {
          if (tj.getChildCount() > 0) {
             this.j.removeAllViews();
          }
          this.j.addView(p0, new FrameLayout$LayoutParams(-2, -1));
          this.j.setVisibility(0);
       }
       return;
    }
    public void setEditCursorDrawable(int p0){
       if (PatchProxy.isSupport(SearchEditorLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SearchEditorLayout.class, "32")) {
          return;
       }
       if (Build$VERSION.SDK_INT >= 29) {
          this.e.setTextCursorDrawable(p0);
       }
       return;
    }
    public void setEditorActionListener(SearchEditorLayout$c p0){
       if (p0 != null) {
          this.n = p0;
       }
       return;
    }
    public void setEditorEnabled(boolean p0){
       if (PatchProxy.isSupport(SearchEditorLayout.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, SearchEditorLayout.class, "12")) {
          return;
       }
       this.e.setEnabled(p0);
       return;
    }
    public void setISearchTextChangeListener(SearchEditorLayout$d p0){
       this.m = p0;
    }
}
