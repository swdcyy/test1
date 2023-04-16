package com.yxcorp.gifshow.prettify.v4.magic.filter.PrettifyConfigView;
import ml8.d;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import lnc.a1;
import com.kwai.feature.post.api.widget.ScrollToCenterRecyclerView;
import o1c.s1;
import androidx.recyclerview.widget.RecyclerView$r;
import unc.d;
import com.yxcorp.gifshow.widget.ViewStubInflater2;
import com.kwai.feature.post.api.widget.PrettifyDoubleSeekBar;
import android.widget.TextView;
import java.lang.Exception;
import com.yxcorp.gifshow.util.PostUtils;
import java.lang.Boolean;
import ekd.m1;
import android.view.ViewStub;
import java.lang.Runnable;
import android.content.res.Resources;
import cw9.c;
import k17.b;
import androidx.recyclerview.widget.RecyclerView$n;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.util.Property;
import android.animation.ObjectAnimator;
import com.yxcorp.gifshow.prettify.v4.magic.filter.PrettifyConfigView$b;
import android.animation.Animator$AnimatorListener;
import java.lang.Integer;
import android.view.ViewTreeObserver;
import com.yxcorp.gifshow.prettify.v4.magic.filter.PrettifyConfigView$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import android.view.View$OnClickListener;
import java.lang.Float;
import android.view.ViewGroup$LayoutParams;
import com.kwai.feature.post.api.widget.PrettifyDoubleSeekBar$a;

public class PrettifyConfigView extends LinearLayout implements d	// class@0011ab
{
    public PrettifyDoubleSeekBar b;
    public ScrollToCenterRecyclerView c;
    public LinearLayout d;
    public View e;
    public View f;
    public ViewStub g;
    public View h;
    public PrettifyDoubleSeekBar i;
    public TextView j;
    public LinearLayoutManager k;
    public boolean l;
    public int m;
    public static int n;

    public void PrettifyConfigView(Context p0){
       super(p0, null);
    }
    public void PrettifyConfigView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void PrettifyConfigView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoidOneRefs(p0, this, PrettifyConfigView.class, "5")) {
       }else {
          this.setOrientation(1);
          View view = a.d(p0, this.getConfigViewLayoutId(), this, 1);
          this.doBindView(view);
          LinearLayoutManager linearLayout = new LinearLayoutManager(this.getContext(), 0, 0);
          this.k = linearLayout;
          this.c.setLayoutManager(linearLayout);
          this.setItemDecoration(this.getItemSpace());
          this.c.setLeftMargin(a1.d(R.dimen.arg_RES_7f07054b));
          this.setClickable(1);
          this.c(new s1(this));
          d.b(this);
          if (this.g != null) {
             ViewStubInflater2 viewStubInfl = new ViewStubInflater2(0x7f0a0e6e);
             viewStubInfl.d(view);
             try{
                view = 0x7f0a0e6d;
                this.h = viewStubInfl.b(view);
                this.i = viewStubInfl.b(0x7f0a0e6c);
                this.j = viewStubInfl.b(0x7f0a0e85);
             }catch(java.lang.Exception e3){
                PostUtils.x("PrettifyConfigView_ViewStub", e3.getMessage());
             }
          }
       }
       return;
    }
    public void c(RecyclerView$r p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PrettifyConfigView.class, "33")) {
          return;
       }
       this.c.addOnScrollListener(p0);
       return;
    }
    public void d(boolean p0){
       if (PatchProxy.isSupport(PrettifyConfigView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PrettifyConfigView.class, "25")) {
          return;
       }
       if (!this.b.getVisibility()) {
          this.b.a(p0);
       }else if(!this.i.getVisibility()){
          this.i.a(p0);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PrettifyConfigView.class, "1")) {
          return;
       }
       this.e = m1.f(p0, 0x7f0a0e6b);
       this.d = m1.f(p0, 0x7f0a039b);
       this.f = m1.f(p0, 0x7f0a094a);
       this.g = m1.f(p0, 0x7f0a0e6e);
       this.b = m1.f(p0, 0x7f0a0e86);
       this.c = m1.f(p0, 0x7f0a0e7b);
       return;
    }
    public void e(boolean p0,Runnable p1){
       if (PatchProxy.isSupport(PrettifyConfigView.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), null, this, PrettifyConfigView.class, "19")) {
          return;
       }
       PrettifyConfigView th = this.h;
       if (th == null || (this.i == null || (!th.getVisibility() && !this.i.getVisibility()))) {
          this.i(this.i, p0);
          this.i(this.h, p0);
       }
    label_0039 :
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, PrettifyConfigView.class, "13")) {
          return;
       }
       this.d.setVisibility(8);
       this.c.removeItemDecorationAt(0);
       this.c.addItemDecoration(new b(0, c.a(this.getResources(), R.dimen.arg_RES_7f070295), this.getItemSpace()));
       this.c.setPadding(a1.e(0), this.getPaddingTop(), this.getPaddingRight(), this.getPaddingBottom());
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, PrettifyConfigView.class, "16")) {
          return;
       }
       this.h(false);
       return;
    }
    public int getConfigViewLayoutId(){
       return 0x7f0d1199;
    }
    public ScrollToCenterRecyclerView getFilterItemList(){
       return this.c;
    }
    public int getFirstItemVisible(){
       Object obj = PatchProxy.apply(null, this, PrettifyConfigView.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.k.i0();
    }
    public View getGoBackBtn(){
       return this.d;
    }
    public int getItemDividerHeight(){
       Object obj = PatchProxy.apply(null, this, PrettifyConfigView.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a1.d(0x7f070cbf);
    }
    public int getItemDividerWidth(){
       Object obj = PatchProxy.apply(null, this, PrettifyConfigView.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a1.d(0x7f070cc2);
    }
    public int getItemSpace(){
       Object obj = PatchProxy.apply(null, this, PrettifyConfigView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a1.d(0x7f0703d4);
    }
    public int getLastItemVisible(){
       Object obj = PatchProxy.apply(null, this, PrettifyConfigView.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.k.c();
    }
    public void h(boolean p0){
       if (PatchProxy.isSupport(PrettifyConfigView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PrettifyConfigView.class, "17")) {
          return;
       }
       if (this.b.getVisibility()) {
          return;
       }
       this.i(this.b, p0);
       return;
    }
    public final void i(View p0,boolean p1){
       if (PatchProxy.isSupport(PrettifyConfigView.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, PrettifyConfigView.class, "21")) {
          return;
       }
       p0.setPivotY((float)p0.getHeight());
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(p0, LinearLayout.ALPHA, new float[2]{0x3f800000,0});
       long l = (p1)? 0: 250;
       objectAnimat.setDuration(l);
       objectAnimat.addListener(new PrettifyConfigView$b(this, p0));
       PrettifyConfigView.n = 0;
       objectAnimat.start();
       return;
    }
    public void j(int p0){
       if (PatchProxy.isSupport(PrettifyConfigView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, PrettifyConfigView.class, "34")) {
          return;
       }
       PrettifyConfigView tc = this.c;
       int childLayoutP = tc.getChildLayoutPosition(tc.getChildAt(0));
       PrettifyConfigView tc1 = this.c;
       int childLayoutP1 = tc1.getChildLayoutPosition(tc1.getChildAt((tc1.getChildCount() - 1)));
       if (p0 <= childLayoutP) {
          this.c.smoothScrollToPosition(p0);
       }else if(p0 <= childLayoutP1){
          p0 = p0 - childLayoutP;
          if (p0 >= 0 && p0 < this.c.getChildCount()) {
             this.c.smoothScrollBy(this.c.getChildAt(p0).getLeft(), 0);
          }
       }else {
          this.c.smoothScrollToPosition(p0);
          this.l = true;
          this.m = p0;
       }
       return;
    }
    public void k(boolean p0){
       if (PatchProxy.isSupport(PrettifyConfigView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PrettifyConfigView.class, "24")) {
          return;
       }
       this.d((p0 ^ 0x01));
       return;
    }
    public void l(int p0){
       if (PatchProxy.isSupport(PrettifyConfigView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, PrettifyConfigView.class, "26")) {
          return;
       }
       this.c.scrollToPosition(p0);
       return;
    }
    public void m(int p0){
       if (PatchProxy.isSupport(PrettifyConfigView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, PrettifyConfigView.class, "28")) {
          return;
       }
       this.c.x(p0);
       return;
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, PrettifyConfigView.class, "35")) {
          return;
       }
       this.f.setPadding(0, a1.e(50.50f), 0, 0);
       return;
    }
    public void o(){
       if (PatchProxy.applyVoid(null, this, PrettifyConfigView.class, "14")) {
          return;
       }
       PrettifyConfigView prettifyConf = null;
       if (!PatchProxy.isSupport(PrettifyConfigView.class) || !PatchProxy.applyVoidOneRefs(Boolean.FALSE, this, PrettifyConfigView.class, "15")) {
          if (!this.b.getVisibility()) {
             this.b.a(true);
          }else {
             this.p(this.b, prettifyConf);
          }
       }
       return;
    }
    public final void p(View p0,boolean p1){
       if (PatchProxy.isSupport(PrettifyConfigView.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, PrettifyConfigView.class, "20")) {
          return;
       }
       p0.setVisibility(0);
       p0.getViewTreeObserver().addOnGlobalLayoutListener(new PrettifyConfigView$a(this, p0, p1));
       return;
    }
    public void setAdapter(RecyclerView$Adapter p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PrettifyConfigView.class, "8")) {
          return;
       }
       this.c.setAdapter(p0);
       return;
    }
    public void setBackBtnOnClickListener(View$OnClickListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PrettifyConfigView.class, "7")) {
          return;
       }
       this.d.setOnClickListener(p0);
       return;
    }
    public void setDefaultIndicatorProgress(float p0){
       if (PatchProxy.isSupport(PrettifyConfigView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, PrettifyConfigView.class, "23")) {
          return;
       }
       PrettifyConfigView tb = this.b;
       tb.setDefaultIndicatorProgress((int)(p0 * (float)tb.getMaxProgress()));
       return;
    }
    public void setDividerViewVisibility(int p0){
       if (PatchProxy.isSupport(PrettifyConfigView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, PrettifyConfigView.class, "29")) {
          return;
       }
       PrettifyConfigView te = this.e;
       if (te != null) {
          if (p0 == 8) {
             ViewGroup$LayoutParams layoutParams = te.getLayoutParams();
             layoutParams.height = a1.e(15.00f);
             this.e.setLayoutParams(layoutParams);
             this.e.setBackgroundResource(R.color.arg_RES_7f061c94);
          }else {
             te.setVisibility(p0);
          }
       }
       return;
    }
    public void setItemDecoration(int p0){
       if (PatchProxy.isSupport(PrettifyConfigView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, PrettifyConfigView.class, "6")) {
          return;
       }
       this.c.addItemDecoration(new b(0, c.a(this.getResources(), R.dimen.arg_RES_7f070295), p0));
       return;
    }
    public void setOnPrettifyDoubleSeekBarChangeListener(PrettifyDoubleSeekBar$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PrettifyConfigView.class, "11")) {
          return;
       }
       PrettifyConfigView ti = this.i;
       if (ti != null) {
          ti.setOnSeekBarChangeListener(p0);
       }
       return;
    }
    public void setSeekBarChangeListener(PrettifyDoubleSeekBar$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PrettifyConfigView.class, "10")) {
          return;
       }
       this.b.setOnSeekBarChangeListener(p0);
       return;
    }
    public void setSeekBarProgress(float p0){
       if (PatchProxy.isSupport(PrettifyConfigView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, PrettifyConfigView.class, "22")) {
          return;
       }
       PrettifyConfigView tb = this.b;
       tb.setProgress((int)(p0 * (float)tb.getMaxProgress()));
       return;
    }
    public void setSeekBarProgressAndRefresh(float p0){
       if (PatchProxy.isSupport(PrettifyConfigView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, PrettifyConfigView.class, "36")) {
          return;
       }
       PrettifyConfigView tb = this.b;
       tb.setProgressAndRefresh((int)(p0 * (float)tb.getMaxProgress()));
       return;
    }
    public void setupSeekBarMode(int p0){
       if (PatchProxy.isSupport(PrettifyConfigView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, PrettifyConfigView.class, "9")) {
          return;
       }
       this.b.setupSeekBarMode(p0);
       return;
    }
}
