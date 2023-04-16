package com.yxcorp.plugin.search.widget.SearchTextSwitcher;
import android.widget.ViewSwitcher;
import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import cw9.b;
import ufd.o;
import android.widget.ViewSwitcher$ViewFactory;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import com.search.common.entity.TrendingItem;
import com.kwai.robust.PatchProxyResult;
import k2b.e0;
import fbd.b;
import gbd.i;
import android.view.View;
import java.lang.Integer;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import zf6.j;
import android.widget.TextView;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.search.common.entity.SearchBaseItem;
import com.yxcorp.plugin.search.b;

public class SearchTextSwitcher extends ViewSwitcher	// class@0007ee
{
    public List b;
    public int c;
    public String d;
    public TrendingItem e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public String j;
    public boolean k;
    public b l;
    public boolean m;
    public b n;
    public final float o;
    public static final int p;

    public void SearchTextSwitcher(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = new ArrayList();
       this.i = false;
       float f = (b.g())? 16.00f: 14.00f;
       this.o = f;
       this.setFactory(new o(this, p0));
       return;
    }
    public void a(boolean p0){
       TrendingItem obj;
       boolean b;
       if (PatchProxy.isSupport(SearchTextSwitcher.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, SearchTextSwitcher.class, "3")) {
          return;
       }
       if (this.b.size() <= 1) {
          return;
       }
       if (this.c < (this.b.size() - 1)) {
          this.c = this.c + 1;
       }else {
          this.c = 0;
          this.k = true;
       }
       if (!PatchProxy.isSupport(SearchTextSwitcher.class) || (!PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, SearchTextSwitcher.class, "4") && p0)) {
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, this, SearchTextSwitcher.class, "5")) {
             obj = this.b.get(this.c);
             this.e = obj;
             if (obj.mIsResultBarDefaultKeyword != null && obj.isShowed()) {
                this.c = this.c + 1;
             }
          }
          if (!PatchProxy.applyVoid(objArray, this, SearchTextSwitcher.class, "2")) {
             obj = PatchProxy.apply(objArray, this, SearchTextSwitcher.class, "16");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else if(this.getCurTrendingItem() != null && (this.getCurTrendingItem().mIsResultBarDefaultKeyword == null && this.m == null)){
                b = true;
             }else {
                b = false;
             }
             if (b) {
                i.n(0, this.n.W0(), this.getCurTrendingItem(), "search_entrance_xtab_bar", "SEARCH_KEYWORD_XTAB_BAR");
                this.m = true;
             }
          }
       }
    label_00c3 :
       this.h(1, p0);
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, SearchTextSwitcher.class, "15")) {
          return;
       }
       if (this.i == null) {
          return;
       }
       this.c(this.getChildAt(0), this.g);
       this.c(this.getNextView(), this.g);
       return;
    }
    public void c(View p0,int p1){
       if (PatchProxy.isSupport(SearchTextSwitcher.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, SearchTextSwitcher.class, "12")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       Drawable uDrawable = j.k(this.getContext(), R.drawable.arg_RES_7f081f1f);
       uDrawable.setTint(p1);
       p0.findViewWithTag("innerIcon").setImageDrawable(uDrawable);
       return;
    }
    public void d(){
       this.k = false;
    }
    public final void e(View p0,TrendingItem p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SearchTextSwitcher.class, "9")) {
          return;
       }
       TextView textView = p0.findViewWithTag("innerText");
       textView.setText(p1.mQuery);
       if (TextUtils.equals(p1.mQuery, this.j)) {
          SearchTextSwitcher tf = this.f;
          if (tf != null) {
             textView.setTextColor(tf);
          }else {
          label_002a :
             tf = this.h;
             if (tf != null) {
                textView.setTextColor(tf);
             }
          }
       }else {
          goto label_002a ;
       }
       p0.setVisibility(0);
       return;
    }
    public void f(List p0,boolean p1){
       if (PatchProxy.isSupport(SearchTextSwitcher.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, SearchTextSwitcher.class, "1")) {
          return;
       }
       if (p0.size() > 0) {
          this.b = p0;
          this.c = 0;
       }
       this.reset();
       this.h(0, p1);
       return;
    }
    public void g(int p0,int p1){
       if (PatchProxy.isSupport(SearchTextSwitcher.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, SearchTextSwitcher.class, "11")) {
          return;
       }
       this.g = p0;
       this.h = p1;
       this.b();
       return;
    }
    public TrendingItem getCurTrendingItem(){
       return this.e;
    }
    public int getCurrentPos(){
       return this.c;
    }
    public String getKeywordHint(){
       SearchTextSwitcher te = this.e;
       TrendingItem mQuery = (te != null)? te.mQuery: "";
       return mQuery;
    }
    public String getSessionId(){
       return this.d;
    }
    public final void h(boolean p0,boolean p1){
       if (PatchProxy.isSupport(SearchTextSwitcher.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, SearchTextSwitcher.class, "6")) {
          return;
       }
       TrendingItem trendingItem = this.b.get(this.c);
       this.e = trendingItem;
       if (p0) {
          this.setText(trendingItem);
       }else {
          this.setCurrentText(trendingItem);
       }
       if (p1) {
          if (!PatchProxy.applyVoid(null, this, SearchTextSwitcher.class, "14")) {
             SearchTextSwitcher te = this.e;
             if (te.mIsResultBarDefaultKeyword != null) {
                te.setShowed(true);
             }
             if (this.n != null && (!this.e.isShowed() && this.e.mIsResultBarDefaultKeyword == null)) {
                i.n(0, this.n.W0(), this.e, "search_entrance_xtab_bar", "SEARCH_KEYWORD_XTAB");
                this.e.setShowed(true);
             }
          }
       }else if(this.l != null && (this.n != null && !this.e.isShowed())){
          SearchTextSwitcher te1 = this.e;
          i.o(this.n.W0(), te1.mFromSessionId, te1.mQuery, te1.getPosition(), this.e.mKsOrderId);
          this.e.setShowed(true);
       }
    label_009c :
       return;
    }
    public final void setCurrentText(TrendingItem p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchTextSwitcher.class, "8")) {
          return;
       }
       this.e(this.getChildAt(0), p0);
       return;
    }
    public void setFragmentContext(b p0){
       this.l = p0;
    }
    public void setFragmentInfoProvider(b p0){
       this.n = p0;
    }
    public void setQueryTextColor(int p0){
       if (PatchProxy.isSupport(SearchTextSwitcher.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SearchTextSwitcher.class, "10")) {
          return;
       }
       this.f = p0;
       SearchTextSwitcher te = this.e;
       if (te != null && (TextUtils.equals(te.mQuery, this.j) && this.f != null)) {
          this.getChildAt(0).findViewWithTag("innerText").setTextColor(this.f);
       }
    label_003d :
       return;
    }
    public void setResultQuery(String p0){
       this.j = p0;
    }
    public void setResultSwitcher(boolean p0){
       this.i = p0;
    }
    public void setSessionId(String p0){
       this.d = p0;
    }
    public final void setText(TrendingItem p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchTextSwitcher.class, "7")) {
          return;
       }
       this.b();
       this.e(this.getNextView(), p0);
       this.showNext();
       return;
    }
}
