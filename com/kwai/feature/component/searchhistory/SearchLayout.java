package com.kwai.feature.component.searchhistory.SearchLayout;
import g06.e;
import ty5.a;
import hka.a;
import android.text.TextWatcher;
import ml8.d;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import cw9.b;
import com.kwai.feature.component.searchhistory.SearchLayout$KeyboardShownMode;
import com.kwai.feature.component.searchhistory.SearchLayout$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ll8.c$b;
import android.content.res.TypedArray;
import android.app.Activity;
import java.lang.Boolean;
import com.yxcorp.gifshow.activity.GifshowActivity;
import iy5.d;
import java.lang.StringBuilder;
import q87.c;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import k2b.u1;
import com.kwai.feature.component.searchhistory.SearchHistoryData;
import java.lang.CharSequence;
import android.widget.EditText;
import android.view.View;
import e3a.a;
import hka.l;
import java.lang.Integer;
import com.yxcorp.utility.Log;
import android.text.Editable;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.utility.TextUtils;
import java.lang.Runnable;
import com.kwai.feature.component.searchhistory.SearchLayout$b;
import java.lang.Enum;
import android.content.SharedPreferences;
import oe6.n;
import ty5.d;
import wkd.b;
import com.kwai.feature.component.searchhistory.b;
import g06.f;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.view.MotionEvent;
import ekd.m1;
import android.widget.TextView;
import android.widget.ImageView;
import g06.l;
import android.view.View$OnClickListener;
import g06.m;
import g06.n;
import g06.o;
import android.view.View$OnFocusChangeListener;
import g06.p;
import android.widget.TextView$OnEditorActionListener;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import androidx.fragment.app.Fragment;
import java.lang.Exception;
import com.yxcorp.utility.n;
import com.kwai.feature.component.searchhistory.SearchLayout$d;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import g06.q;
import android.graphics.drawable.Drawable;
import o56.c;
import o56.a;
import android.app.Application;
import android.view.KeyEvent;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.kwai.feature.component.searchhistory.SearchLayout$e;
import com.kwai.feature.component.searchhistory.SearchLayout$f;
import lnc.a1;
import zf6.j;
import android.content.res.Resources;
import android.content.res.Resources$Theme;
import o1.f;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import java.lang.RuntimeException;
import java.util.List;
import java.util.Collection;
import ekd.q;

public class SearchLayout extends RelativeLayout implements e, a, a, TextWatcher, d	// class@001295
{
    public boolean A;
    public Integer B;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final float J;
    public SearchLayout$KeyboardShownMode K;
    public Runnable L;
    public View b;
    public View c;
    public ImageView d;
    public EditText e;
    public TextView f;
    public View g;
    public View h;
    public View i;
    public View j;
    public TextView k;
    public View l;
    public int m;
    public boolean n;
    public boolean o;
    public boolean p;
    public String q;
    public CharSequence r;
    public CharSequence s;
    public d t;
    public BaseFragment u;
    public SearchLayout$e v;
    public q w;
    public BaseFragment x;
    public SearchLayout$f y;
    public SearchLayout$d z;
    public static final int M;

    public void SearchLayout(Context p0){
       super(p0, null, 0);
    }
    public void SearchLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void SearchLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.I = false;
       float f = (b.g())? 16.00f: 14.00f;
       this.J = f;
       this.K = SearchLayout$KeyboardShownMode.ADJUST_NOTHING;
       this.L = new SearchLayout$a(this);
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, this, SearchLayout.class, "2")) {
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.S4);
          this.F = typedArray.getColor(false, 0x7f061fe3);
          typedArray.recycle();
       }
       return;
    }
    public static void m(Activity p0,boolean p1,String p2){
       if (PatchProxy.isSupport(SearchLayout.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, null, SearchLayout.class, "53")) {
          return;
       }
       if (p0 instanceof GifshowActivity) {
          String url = p0.getUrl();
          Object[] objArray = new Object[0];
          d.C().w("SearchLayout", "search action url : "+url+", is_from_history : "+p1+", keyword : "+p2, objArray);
          JsonObject jsonObject = new JsonObject();
          jsonObject.c0("url", url);
          jsonObject.H("is_from_history", Boolean.valueOf(p1));
          jsonObject.c0("keyword", p2);
          u1.R("COMPONENT_SEARCH", jsonObject.toString(), 4);
       }
       return;
    }
    public void F6(SearchHistoryData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchLayout.class, "43")) {
          return;
       }
       this.E = true;
       this.e.setText(p0.mSearchWord);
       this.i(true);
       SearchLayout.m(a.a(this), true, p0.mSearchWord);
       return;
    }
    public void T5(SearchHistoryData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchLayout.class, "42")) {
          return;
       }
       if (this.I != null) {
          SearchLayout tu = this.u;
          if (tu instanceof l) {
             tu.a();
          }
       }
       return;
    }
    public void a(String p0,String p1,int p2){
       if (PatchProxy.isSupport(SearchLayout.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, SearchLayout.class, "52")) {
          return;
       }
       Log.g("search", "onClick");
       this.E = false;
       this.e.setText(p0);
       this.j(false, p1);
       return;
    }
    public void afterTextChanged(Editable p0){
       boolean b;
       SearchLayout tq;
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchLayout.class, "15")) {
          return;
       }
       String obj = PatchProxy.applyOneRefs(p0, this, SearchLayout.class, "16");
       int i = 1;
       int i1 = 0;
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(!TextUtils.x(this.q) && (this.q).equals(p0.toString())){
          b = true;
       }else {
          b = false;
       }
       if (b) {
          return;
       }else {
          this.k(this.G);
          obj = (this.H != null)? p0.toString(): this.q;
          SearchLayout tb = this.b;
          if (TextUtils.x(obj)) {
             i1 = 8;
          }
          tb.setVisibility(i1);
          this.e.removeCallbacks(this.L);
          if (TextUtils.x(p0.toString())) {
             this.h();
             this.s();
          }else if(SearchLayout$b.a[this.K.ordinal()] != i){
             this.e();
             this.x();
             if (this.y != null && this.o != null) {
                this.e.postDelayed(this.L, n.b().getLong("SearchSuggestInterval", 500));
             }
          }
          SearchLayout tt = this.t;
          if (tt != null) {
             tt.ke(this.q, this.E);
          }
          return;
       }
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, SearchLayout.class, "11")) {
          return;
       }
       if (this.u != null) {
          b.a(0x4abd6a99).e(this.u.K(), this.q);
       }
       return;
    }
    public void beforeTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, SearchLayout.class, "24")) {
          return;
       }
       this.f(true);
       SearchLayout tt = this.t;
       if (tt != null) {
          tt.s7(false);
       }
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, SearchLayout.class, "21")) {
          return;
       }
       this.e.setText("");
       return;
    }
    public void dispatchRestoreInstanceState(SparseArray p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchLayout.class, "13")) {
          return;
       }
       if (this.A != null) {
          this.e.removeTextChangedListener(this);
       }
       super.dispatchRestoreInstanceState(p0);
       if (this.A != null) {
          this.d();
          this.e.addTextChangedListener(this);
       }
       return;
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SearchLayout.class, "50");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.E = false;
       return super.dispatchTouchEvent(p0);
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchLayout.class, "1")) {
          return;
       }
       this.j = m1.f(p0, 0x7f0a37d4);
       this.g = m1.f(p0, 0x7f0a1299);
       this.f = m1.f(p0, 0x7f0a1404);
       this.l = m1.f(p0, 0x7f0a0f39);
       this.d = m1.f(p0, 0x7f0a379e);
       this.h = m1.f(p0, 0x7f0a37c9);
       this.c = m1.f(p0, 0x7f0a0649);
       this.b = m1.f(p0, 0x7f0a073b);
       this.i = m1.f(p0, 0x7f0a37c8);
       this.k = m1.f(p0, 0x7f0a37d3);
       this.e = m1.f(p0, 0x7f0a0ca8);
       m1.a(p0, new l(this), R.id.search_tips_wrapper);
       m1.a(p0, new m(this), R.id.clear_button);
       m1.a(p0, new n(this), R.id.cancel_button);
       m1.c(p0, new o(this), R.id.editor);
       m1.f(p0, R.id.editor).setOnEditorActionListener(new p(this));
       return;
    }
    public final void e(){
       SearchLayout tg;
       if (PatchProxy.applyVoid(null, this, SearchLayout.class, "36")) {
          return;
       }
       Activity uActivity = a.b(this.getContext());
       if (this.u != null && (uActivity != null && !uActivity.isFinishing())) {
          try{
             this.getFragmentManager().beginTransaction().s(this.u).m();
          }catch(java.lang.Exception e0){
             e0.printStackTrace();
          }
       }
    }
    public void f(boolean p0){
       if (PatchProxy.isSupport(SearchLayout.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, SearchLayout.class, "28")) {
          return;
       }
       this.v(p0);
       if (!this.l()) {
          return;
       }
       if (!TextUtils.x(TextUtils.G(this.e)) && p0) {
          this.e.setText("");
       }
       this.c.setVisibility(8);
       this.w();
       this.h();
       this.e();
       Activity uActivity = a.b(this.getContext());
       if (uActivity != null) {
          n.C(uActivity);
       }
       this.D = this.e.isFocused();
       return;
    }
    public void g(boolean p0){
       if (PatchProxy.isSupport(SearchLayout.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, SearchLayout.class, "29")) {
          return;
       }
       if (this.l()) {
          this.f(p0);
          SearchLayout tt = this.t;
          if (tt != null) {
             tt.s7(false);
          }
       }
       return;
    }
    public final c getFragmentManager(){
       SearchLayout obj = PatchProxy.apply(null, this, SearchLayout.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.z;
       if (obj != null) {
          c uoc = obj.b();
          if (uoc != null) {
             return uoc;
          }
       }
       return a.a(this).getSupportFragmentManager();
    }
    public String getKeyword(){
       Object obj = PatchProxy.apply(null, this, SearchLayout.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TextUtils.G(this.e).toString();
    }
    public CharSequence getSearchHintText(){
       return this.s;
    }
    public BaseFragment getSearchHistoryFragment(){
       return this.u;
    }
    public final void h(){
       if (PatchProxy.applyVoid(null, this, SearchLayout.class, "38")) {
          return;
       }
       if (this.x != null) {
          this.getFragmentManager().beginTransaction().s(this.x).m();
       }
       SearchLayout th = this.h;
       if (th != null) {
          int i = 8;
          th.setVisibility(i);
          th = this.i;
          if (th != null) {
             th.setVisibility(i);
          }
       }
       if (this.w != null && TextUtils.x(this.q)) {
          this.w.A5(this.q);
       }
       return;
    }
    public final void i(boolean p0){
       if (PatchProxy.isSupport(SearchLayout.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, SearchLayout.class, "9")) {
          return;
       }
       this.j(p0, "");
       return;
    }
    public void j(boolean p0,String p1){
       if (PatchProxy.isSupport(SearchLayout.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, SearchLayout.class, "10")) {
          return;
       }
       Log.g("serach", "confirmSearch "+p0);
       this.w();
       this.e.removeCallbacks(this.L);
       this.k(this.G);
       if (!TextUtils.x(this.q)) {
          Activity uActivity = a.b(this.getContext());
          if (uActivity != null) {
             n.C(uActivity);
          }
          this.b();
          SearchLayout tt = this.t;
          if (tt != null) {
             tt.qc(this.q, p0, p1);
          }
          SearchLayout.m(uActivity, p0, this.q);
       }
       return;
    }
    public void jd(){
       if (PatchProxy.applyVoid(null, this, SearchLayout.class, "46")) {
          return;
       }
       b.a(0x4abd6a99).a(this.u.K());
       SearchLayout tu = this.u;
       if (tu instanceof l) {
          tu.a();
       }
       Activity uActivity = a.a(this);
       if (uActivity instanceof GifshowActivity) {
          String url = uActivity.getUrl();
          Object[] objArray = new Object[0];
          d.C().w("SearchLayout", "clear_search_history url : "+url, objArray);
          u1.R("COMPONENT_SEARCH_CLEAR_HISTORY", url, 4);
       }
       return;
    }
    public final void k(boolean p0){
       if (PatchProxy.isSupport(SearchLayout.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, SearchLayout.class, "12")) {
          return;
       }
       String str = TextUtils.G(this.e).toString();
       this.q = str;
       if (p0) {
          this.q = str.trim();
       }
       if (TextUtils.x(this.q) && (this.p != null && !TextUtils.x(this.s))) {
          this.q = this.s.toString();
       }
    label_0047 :
       return;
    }
    public boolean l(){
       Object obj = PatchProxy.apply(null, this, SearchLayout.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!this.c.getVisibility())? true: false;
       return b;
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, SearchLayout.class, "23")) {
          return;
       }
       this.c();
       return;
    }
    public void o(){
       if (PatchProxy.applyVoid(null, this, SearchLayout.class, "20")) {
          return;
       }
       this.d();
       return;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, SearchLayout.class, "49")) {
          return;
       }
       super.onAttachedToWindow();
       this.e.addTextChangedListener(this);
       return;
    }
    public boolean onBackPressed(){
       Object obj = PatchProxy.apply(null, this, SearchLayout.class, "47");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!this.l()) {
          return false;
       }
       this.f(true);
       SearchLayout tt = this.t;
       if (tt != null) {
          tt.s7(true);
       }
       return true;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, SearchLayout.class, "51")) {
          return;
       }
       this.e.removeTextChangedListener(this);
       this.d();
       super.onDetachedFromWindow();
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, SearchLayout.class, "3")) {
          return;
       }
       super.onFinishInflate();
       this.doBindView(this);
       this.d.setImageDrawable(null);
       this.c();
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(SearchLayout.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, SearchLayout.class, "48")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       if (!this.l() || (this.K == null || ((p3 - p1) > (n.u(a.a().a()) / 4) && SearchLayout$b.a[this.K.ordinal()] == 1))) {
          this.s();
       }
    label_0053 :
       return;
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
    public boolean p(TextView p0,int p1,KeyEvent p2){
       if (PatchProxy.isSupport(SearchLayout.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, SearchLayout.class, "40");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       if (3 == p1) {
          this.E = false;
          this.i(false);
       }
       return false;
    }
    public void q(View p0,boolean p1){
       if (PatchProxy.isSupport(SearchLayout.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, SearchLayout.class, "19")) {
          return;
       }
       this.D = p1;
       if (p1) {
          if (!PatchProxy.applyVoid(null, this, SearchLayout.class, "30")) {
             this.v(false);
             this.c.setVisibility(false);
             this.e.requestFocus();
             this.e.requestFocusFromTouch();
             if (TextUtils.x(this.e.getText())) {
                this.s();
             }else {
                this.t();
             }
             SearchLayout tt = this.t;
             if (tt != null) {
                tt.R();
             }
          }
       }else if(!TextUtils.x(this.q)){
          this.h();
          this.e();
          Activity uActivity = a.b(this.getContext());
          if (uActivity != null) {
             n.C(uActivity);
          }
       }
       return;
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, SearchLayout.class, "45")) {
          return;
       }
       Log.g("serach", "onSearchHistoryTipsLayoutClick ");
       this.E = false;
       this.i(false);
       return;
    }
    public final void s(){
       if (PatchProxy.applyVoid(null, this, SearchLayout.class, "34")) {
          return;
       }
       if (this.v != null) {
          SearchLayout tg = this.g;
          if (tg != null) {
             if (this.I != null) {
                tg.setVisibility(4);
             }else {
                tg.setVisibility(0);
             }
             int i = 0x7f0a1299;
             if (this.findViewById(i) == null) {
                ExceptionHandler.handleCaughtException(new Exception("missing history_container"));
                return;
             }else {
                SearchLayout tu = this.u;
                if (tu == null) {
                   this.u = this.v.a(this);
                   e uoe = this.getFragmentManager().beginTransaction();
                   uoe.v(i, this.u);
                   uoe.m();
                }else if(tu instanceof l){
                   tu.a();
                }
                this.getFragmentManager().beginTransaction().E(this.u).m();
             }
          }
       }
       return;
    }
    public void setEditorColor(int p0){
       this.F = p0;
    }
    public void setFragmentManagerProvider(SearchLayout$d p0){
       this.z = p0;
    }
    public void setHintSearchEnable(boolean p0){
       this.p = p0;
    }
    public void setIsEmptyHideView(boolean p0){
       this.H = p0;
    }
    public void setKeyboardShownMode(SearchLayout$KeyboardShownMode p0){
       this.K = p0;
    }
    public void setNeedCloseHistoryPanelWhenIsEmpty(boolean p0){
       this.I = p0;
    }
    public void setNotRestoreText(boolean p0){
       this.A = p0;
    }
    public void setSearchEditText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchLayout.class, "22")) {
          return;
       }
       this.e.setText(p0);
       return;
    }
    public void setSearchEnable(boolean p0){
       if (PatchProxy.isSupport(SearchLayout.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, SearchLayout.class, "14")) {
          return;
       }
       this.e.setEnabled(p0);
       return;
    }
    public void setSearchHint(int p0){
       if (PatchProxy.isSupport(SearchLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SearchLayout.class, "6")) {
          return;
       }
       this.setSearchHint(this.getContext().getString(p0));
       return;
    }
    public void setSearchHint(CharSequence p0){
       String str1;
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchLayout.class, "4")) {
          return;
       }
       this.r = p0;
       SearchLayout te = this.e;
       String str = "";
       if (p0 == null) {
          str1 = str;
       }
       te.setHint(str1);
       SearchLayout tf = this.f;
       te = this.r;
       if (te != null) {
          str = te;
       }
       tf.setText(str);
       this.f.setTextSize(this.J);
       return;
    }
    public void setSearchHintText(CharSequence p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchLayout.class, "5")) {
          return;
       }
       this.s = p0;
       this.k(this.G);
       return;
    }
    public void setSearchHistoryFragmentCreator(SearchLayout$e p0){
       this.v = p0;
    }
    public void setSearchIcon(int p0){
       if (PatchProxy.isSupport(SearchLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SearchLayout.class, "26")) {
          return;
       }
       Integer integer = Integer.valueOf(p0);
       this.B = integer;
       SearchLayout tf = this.f;
       if (tf == null) {
          this.C = true;
          return;
       }else {
          tf.setCompoundDrawablesWithIntrinsicBounds(integer.intValue(), 0, 0, 0);
          return;
       }
    }
    public void setSearchListener(d p0){
       this.t = p0;
    }
    public void setSearchSuggestFragmentCreator(SearchLayout$f p0){
       this.y = p0;
    }
    public void setSearchSuggestListener(q p0){
       this.w = p0;
    }
    public void setSearchTipsFormatRes(int p0){
       if (PatchProxy.isSupport(SearchLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SearchLayout.class, "7")) {
          return;
       }
       this.m = p0;
       this.x();
       return;
    }
    public void setShowSearchSuggest(boolean p0){
       boolean b;
       if (PatchProxy.isSupport(SearchLayout.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, SearchLayout.class, "8")) {
          return;
       }
       this.o = p0;
       if (p0 && (!TextUtils.x(this.q) && this.x == null)) {
          this.e.removeCallbacks(this.L);
          this.L.run();
       }
    label_0033 :
       if (this.x != null && this.i != null) {
          SearchLayout obj = PatchProxy.apply(null, this, SearchLayout.class, "18");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             obj = this.j;
             b = (obj != null && !obj.getVisibility())? true: false;
          }
          if (b) {
             if (!p0 && !this.i.getVisibility()) {
                this.i.setVisibility(4);
             }else if(p0 && (this.i.getVisibility() && this.D != null)){
                this.i.setVisibility(0);
                this.e.removeCallbacks(this.L);
                this.L.run();
             }
          }
       }
    label_008f :
       return;
    }
    public void setShowSearchTips(boolean p0){
       this.n = p0;
    }
    public void setTrimKeyword(boolean p0){
       this.G = p0;
    }
    public void t(){
       if (PatchProxy.applyVoid(null, this, SearchLayout.class, "37")) {
          return;
       }
       Activity uActivity = a.b(this.getContext());
       if (uActivity == null || (!uActivity.isFinishing() && this.y != null)) {
          SearchLayout th = this.h;
          if (th != null && this.o != null) {
             int i = 0;
             th.setVisibility(i);
             if (this.n != null) {
                th = this.j;
                if (th != null) {
                   th.setVisibility(i);
                }
             }
             th = this.i;
             if (th != null) {
                th.setVisibility(i);
             }
             if (this.x == null) {
                this.x = this.y.a(this);
                th = this.w;
                if (th != null) {
                   th.A5(this.q);
                }
                e uoe = this.getFragmentManager().beginTransaction();
                uoe.v(R.id.search_suggest_container, this.x);
                uoe.o();
             }else {
                this.getFragmentManager().beginTransaction().E(this.x).m();
                th = this.w;
                if (th != null) {
                   th.A5(this.q);
                }
             }
          }
       }
    label_0083 :
       return;
    }
    public void u(){
       if (PatchProxy.applyVoid(null, this, SearchLayout.class, "31")) {
          return;
       }
       this.e.requestFocus();
       this.e.requestFocusFromTouch();
       n.b0(this.getContext(), this.e, true);
       return;
    }
    public final void v(boolean p0){
       if (PatchProxy.isSupport(SearchLayout.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, SearchLayout.class, "39")) {
          return;
       }
       SearchLayout tf = this.f;
       SearchLayout searchLayout = 8;
       int i = 0;
       int i1 = (p0)? 0: 8;
       tf.setVisibility(i1);
       if (p0) {
          this.f.setVisibility(i);
          this.d.setImageResource(i);
       }else {
          this.f.setVisibility(searchLayout);
          tf = this.B;
          if (tf != null) {
             this.d.setImageResource(tf.intValue());
          }else {
             this.d.setImageDrawable(j.n(a1.c(), R.drawable.common_base_search_24, 0x7f0607ea));
          }
       }
       if (this.C != null) {
          tf = this.B;
          if (tf != null) {
             this.f.setCompoundDrawablesWithIntrinsicBounds(tf.intValue(), i, i, i);
          }
       }
       tf = this.e;
       if (!p0) {
          i = f.a(this.getResources(), this.F, null);
       }
       tf.setHintTextColor(i);
       return;
    }
    public void w(){
       if (PatchProxy.applyVoid(null, this, SearchLayout.class, "27")) {
          return;
       }
       SearchLayout tl = this.l;
       if (tl != null) {
          tl.requestFocus();
       }else {
          this.d.requestFocus();
       }
       return;
    }
    public final void x(){
       if (PatchProxy.applyVoid(null, this, SearchLayout.class, "17")) {
          return;
       }
       if (this.n != null && this.k != null) {
          if (this.m != null) {
             if (!TextUtils.x(this.q)) {
                int i = 1;
                Object[] objArray = new Object[i];
                objArray[0] = this.q;
                SpannableString spannableStr = new SpannableString(this.getResources().getString(this.m, objArray));
                int i1 = (this.getResources().getString(this.m)).indexOf("%s");
                if (i1 >= 0) {
                   spannableStr.setSpan(new StyleSpan(i), i1, ((this.q).length() + i1), 17);
                   this.k.setText(spannableStr);
                   this.k.setTextSize(this.J);
                }
             }
          }else {
             throw new RuntimeException("if you set mIsShowSearchTips true,you must set mSearchTipsFormatRes");
          }
       }
       return;
    }
    public void y9(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchLayout.class, "41")) {
          return;
       }
       SearchLayout tg = this.g;
       if (tg == null) {
          return;
       }
       if (this.I == null && tg.getVisibility() != 8) {
          this.g.setVisibility(0);
          return;
       }else if(q.f(p0)){
          this.g.setVisibility(4);
       }else if(this.g.getVisibility() != 8){
          this.g.setVisibility(0);
       }
       return;
    }
}
