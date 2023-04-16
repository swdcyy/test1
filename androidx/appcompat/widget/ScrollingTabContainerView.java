package androidx.appcompat.widget.ScrollingTabContainerView;
import android.widget.AdapterView$OnItemSelectedListener;
import android.widget.HorizontalScrollView;
import android.view.animation.DecelerateInterpolator;
import android.content.Context;
import androidx.appcompat.widget.ScrollingTabContainerView$d;
import u0.a;
import androidx.appcompat.widget.LinearLayoutCompat;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import androidx.appcompat.app.ActionBar$c;
import androidx.appcompat.widget.ScrollingTabContainerView$TabView;
import androidx.appcompat.widget.LinearLayoutCompat$LayoutParams;
import android.view.ViewGroup;
import android.widget.SpinnerAdapter;
import android.widget.Spinner;
import androidx.appcompat.widget.ScrollingTabContainerView$b;
import android.widget.BaseAdapter;
import java.lang.Runnable;
import androidx.appcompat.widget.ScrollingTabContainerView$a;
import androidx.appcompat.widget.AppCompatSpinner;
import android.util.AttributeSet;
import android.graphics.drawable.Drawable;
import android.widget.LinearLayout;
import android.widget.AbsListView$LayoutParams;
import androidx.appcompat.widget.ScrollingTabContainerView$c;
import android.view.View$OnClickListener;
import android.view.ViewParent;
import android.content.res.Configuration;
import android.widget.AdapterView;
import android.view.View$MeasureSpec;
import java.lang.Math;

public class ScrollingTabContainerView extends HorizontalScrollView implements AdapterView$OnItemSelectedListener	// class@000614
{
    public Runnable b;
    public ScrollingTabContainerView$c c;
    public LinearLayoutCompat d;
    public Spinner e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public int j;
    public ViewPropertyAnimator k;
    public final ScrollingTabContainerView$d l;
    public static final Interpolator m;

    static {
       ScrollingTabContainerView.m = new DecelerateInterpolator();
    }
    public void ScrollingTabContainerView(Context p0){
       super(p0);
       this.l = new ScrollingTabContainerView$d(this);
       this.setHorizontalScrollBarEnabled(false);
       a uoa = a.b(p0);
       this.setContentHeight(uoa.f());
       this.h = uoa.e();
       LinearLayoutCompat linearLayout = this.e();
       this.d = linearLayout;
       this.addView(linearLayout, new ViewGroup$LayoutParams(-2, -1));
    }
    public void a(ActionBar$c p0,int p1,boolean p2){
       ScrollingTabContainerView$TabView tabView = this.f(p0, false);
       this.d.addView(tabView, p1, new LinearLayoutCompat$LayoutParams(false, -1, 0x3f800000));
       ScrollingTabContainerView te = this.e;
       if (te != null) {
          te.getAdapter().notifyDataSetChanged();
       }
       if (p2) {
          tabView.setSelected(true);
       }
       if (this.f != null) {
          this.requestLayout();
       }
       return;
    }
    public void b(ActionBar$c p0,boolean p1){
       ScrollingTabContainerView$TabView tabView = this.f(p0, false);
       this.d.addView(tabView, new LinearLayoutCompat$LayoutParams(false, -1, 0x3f800000));
       ScrollingTabContainerView te = this.e;
       if (te != null) {
          te.getAdapter().notifyDataSetChanged();
       }
       if (p1) {
          tabView.setSelected(true);
       }
       if (this.f != null) {
          this.requestLayout();
       }
       return;
    }
    public void c(int p0){
       View childAt = this.d.getChildAt(p0);
       ScrollingTabContainerView tb = this.b;
       if (tb != null) {
          this.removeCallbacks(tb);
       }
       ScrollingTabContainerView$a uoa = new ScrollingTabContainerView$a(this, childAt);
       this.b = uoa;
       this.post(uoa);
       return;
    }
    public final Spinner d(){
       AppCompatSpinner uAppCompatSp = new AppCompatSpinner(this.getContext(), null, 0x7f0400df);
       uAppCompatSp.setLayoutParams(new LinearLayoutCompat$LayoutParams(-2, -1));
       uAppCompatSp.setOnItemSelectedListener(this);
       return uAppCompatSp;
    }
    public final LinearLayoutCompat e(){
       LinearLayoutCompat linearLayout = new LinearLayoutCompat(this.getContext(), null, 0x7f0400d9);
       linearLayout.setMeasureWithLargestChildEnabled(true);
       linearLayout.setGravity(17);
       linearLayout.setLayoutParams(new LinearLayoutCompat$LayoutParams(-2, -1));
       return linearLayout;
    }
    public ScrollingTabContainerView$TabView f(ActionBar$c p0,boolean p1){
       ScrollingTabContainerView$TabView tabView = new ScrollingTabContainerView$TabView(this, this.getContext(), p0, p1);
       if (p1) {
          tabView.setBackgroundDrawable(null);
          tabView.setLayoutParams(new AbsListView$LayoutParams(-1, this.i));
       }else {
          tabView.setFocusable(true);
          if (this.c == null) {
             this.c = new ScrollingTabContainerView$c(this);
          }
          tabView.setOnClickListener(this.c);
       }
       return tabView;
    }
    public final boolean g(){
       ScrollingTabContainerView te = this.e;
       boolean b = (te != null && te.getParent() == this)? true: false;
       return b;
    }
    public final void h(){
       if (this.g()) {
          return;
       }
       if (this.e == null) {
          this.e = this.d();
       }
       this.removeView(this.d);
       this.addView(this.e, new ViewGroup$LayoutParams(-2, -1));
       if (this.e.getAdapter() == null) {
          this.e.setAdapter(new ScrollingTabContainerView$b(this));
       }
       ScrollingTabContainerView tb = this.b;
       if (tb != null) {
          this.removeCallbacks(tb);
          this.b = null;
       }
       this.e.setSelection(this.j);
       return;
    }
    public final boolean i(){
       if (!this.g()) {
          return false;
       }
       this.removeView(this.e);
       this.addView(this.d, new ViewGroup$LayoutParams(-2, -1));
       this.setTabSelected(this.e.getSelectedItemPosition());
       return false;
    }
    public void j(){
       this.d.removeAllViews();
       ScrollingTabContainerView te = this.e;
       if (te != null) {
          te.getAdapter().notifyDataSetChanged();
       }
       if (this.f != null) {
          this.requestLayout();
       }
       return;
    }
    public void k(int p0){
       this.d.removeViewAt(p0);
       ScrollingTabContainerView te = this.e;
       if (te != null) {
          te.getAdapter().notifyDataSetChanged();
       }
       if (this.f != null) {
          this.requestLayout();
       }
       return;
    }
    public void l(int p0){
       this.d.getChildAt(p0).b();
       ScrollingTabContainerView te = this.e;
       if (te != null) {
          te.getAdapter().notifyDataSetChanged();
       }
       if (this.f != null) {
          this.requestLayout();
       }
       return;
    }
    public void onAttachedToWindow(){
       super.onAttachedToWindow();
       ScrollingTabContainerView tb = this.b;
       if (tb != null) {
          this.post(tb);
       }
       return;
    }
    public void onConfigurationChanged(Configuration p0){
       super.onConfigurationChanged(p0);
       a uoa = a.b(this.getContext());
       this.setContentHeight(uoa.f());
       this.h = uoa.e();
    }
    public void onDetachedFromWindow(){
       super.onDetachedFromWindow();
       ScrollingTabContainerView tb = this.b;
       if (tb != null) {
          this.removeCallbacks(tb);
       }
       return;
    }
    public void onItemSelected(AdapterView p0,View p1,int p2,long p3){
       p1.getTab().g();
    }
    public void onMeasure(int p0,int p1){
       p1 = View$MeasureSpec.getMode(p0);
       ScrollingTabContainerView scrollingTab = 1;
       int i = 0;
       int i1 = 0x40000000;
       boolean b = (p1 == i1)? true: false;
       this.setFillViewport(b);
       int childCount = this.d.getChildCount();
       if (childCount > scrollingTab && (p1 == i1 || p1 == Integer.MIN_VALUE)) {
          p1 = 2;
          this.g = (childCount > p1)? (int)((float)View$MeasureSpec.getSize(p0) * 0.40f): View$MeasureSpec.getSize(p0) / p1;
          this.g = Math.min(this.g, this.h);
       }else {
          this.g = -1;
       }
       p1 = View$MeasureSpec.makeMeasureSpec(this.i, i1);
       if (b || this.f == null) {
          scrollingTab = null;
       }
       if (scrollingTab) {
          this.d.measure(i, p1);
          if (this.d.getMeasuredWidth() > View$MeasureSpec.getSize(p0)) {
             this.h();
          }else {
             this.i();
          }
       }else {
          this.i();
       }
       int measuredWidt = this.getMeasuredWidth();
       super.onMeasure(p0, p1);
       p0 = this.getMeasuredWidth();
       if (b && measuredWidt != p0) {
          this.setTabSelected(this.j);
       }
       return;
    }
    public void onNothingSelected(AdapterView p0){
    }
    public void setAllowCollapse(boolean p0){
       this.f = p0;
    }
    public void setContentHeight(int p0){
       this.i = p0;
       this.requestLayout();
    }
    public void setTabSelected(int p0){
       this.j = p0;
       int childCount = this.d.getChildCount();
       int i = 0;
       while (i < childCount) {
          View childAt = this.d.getChildAt(i);
          boolean b = (i == p0)? true: false;
          childAt.setSelected(b);
          if (b) {
             this.c(p0);
          }
          i = i + 1;
       }
       ScrollingTabContainerView te = this.e;
       if (te != null && p0 >= 0) {
          te.setSelection(p0);
       }
       return;
    }
}
