package com.kwai.library.widget.refresh.KwaiLoadingView;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.util.concurrent.atomic.AtomicBoolean;
import ll8.c$b;
import android.content.res.TypedArray;
import com.kwai.library.widget.refresh.a;
import com.kwai.library.widget.refresh.a$a;
import java.lang.CharSequence;
import j17.a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.kwai.library.widget.refresh.path.PathLoadingView;
import android.widget.TextView;
import com.kwai.library.widget.refresh.path.LoadingStyle;
import android.widget.LinearLayout;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.content.res.Resources;
import java.lang.String;
import java.lang.Exception;
import android.text.TextUtils;
import android.view.ViewParent;
import android.widget.LinearLayout$LayoutParams;
import com.yxcorp.utility.n;
import android.view.MotionEvent;

public class KwaiLoadingView extends FrameLayout	// class@0009bf
{
    public boolean b;
    public AtomicBoolean c;
    public PathLoadingView d;
    public TextView e;
    public TextView f;

    public void KwaiLoadingView(Context p0){
       super(p0, null);
    }
    public void KwaiLoadingView(Context p0,int p1){
       super(p0);
       this.c = new AtomicBoolean(false);
       this.a(p0, null, p1);
    }
    public void KwaiLoadingView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void KwaiLoadingView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.c = new AtomicBoolean(false);
       this.a(p0, p1, false);
    }
    public final void a(Context p0,AttributeSet p1,int p2){
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.Y1, 0, p2);
       a$a g = a.g;
       int intx = typedArray.getInt(4, g.a().e);
       CharSequence text = typedArray.getText(5);
       float dimension = typedArray.getDimension(6, a.c(this.getContext(), g.a().d));
       float dimension1 = typedArray.getDimension(2, a.c(this.getContext(), g.a().c));
       g = typedArray.getResourceId(0, g.a().b);
       typedArray.recycle();
       LayoutInflater.from(p0).inflate(R.layout.arg_RES_7f0d072b, this);
       this.d = this.findViewById(0x7f0a1695);
       this.e = this.findViewById(0x7f0a1694);
       this.d.f(LoadingStyle.fromOrdinal(intx), g);
       this.setLoadingText(text);
       this.e(dimension, dimension1);
    }
    public final void b(int p0){
       boolean b = (!p0 && this.isShown())? true: false;
       this.c(b);
       return;
    }
    public final void c(boolean p0){
       if (p0) {
          this.h();
       }else {
          this.i();
       }
       return;
    }
    public void d(){
       ViewGroup$LayoutParams layoutParams = this.getChildAt(0).getLayoutParams();
       if (!layoutParams instanceof FrameLayout$LayoutParams) {
          return;
       }
       layoutParams.gravity = 17;
       this.requestLayout();
       return;
    }
    public final void e(float p0,float p1){
       if (p0 > 0 || p1 > 0) {
          KwaiLoadingView td = this.d;
          if (td != null) {
             ViewGroup$LayoutParams layoutParams = td.getLayoutParams();
             if (p0 > 0) {
                layoutParams.width = (int)p0;
             }
             if (p1 > 0) {
                layoutParams.height = (int)p1;
             }
             this.d.setLayoutParams(layoutParams);
             return;
          }
       }
       return;
    }
    public void f(boolean p0,int p1){
       CharSequence uCharSequenc = (!p1)? null: this.getResources().getString(p1);
       this.g(p0, uCharSequenc);
       return;
    }
    public void g(boolean p0,CharSequence p1){
       if (this.d == null) {
          return;
       }
       if (p0 || p1 != null) {
          this.setVisibility(0);
       }else {
          this.setVisibility(8);
       }
       KwaiLoadingView td = this.d;
       int i = (p0)? 0: 8;
       try{
          td.setVisibility(i);
          this.e.setText(p1);
       }catch(java.lang.Exception e4){
          e4.printStackTrace();
       }
       this.e.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
       if (TextUtils.isEmpty(p1)) {
          this.e.setVisibility(8);
       }else {
          this.e.setVisibility(0);
       }
       return;
    }
    public TextView getTitleDetailView(){
       if (this.f == null) {
          TextView textView = new TextView(this.getContext(), null, 0x7f11042f);
          this.f = textView;
          textView.setGravity(17);
          this.f.setTextColor(this.getResources().getColor(R.color.arg_RES_7f062149));
          this.f.setTextSize(0, this.getContext().getResources().getDimension(R.dimen.arg_RES_7f0710fd));
          LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(-2, -2);
          layoutParams.topMargin = n.c(this.getContext(), 5.00f);
          layoutParams.gravity = 1;
          this.d.getParent().addView(this.f, layoutParams);
       }
       return this.f;
    }
    public TextView getTitleView(){
       return this.e;
    }
    public void h(){
       if (this.d != null && !this.c.getAndSet(true)) {
          this.d.o(0x3f000000);
       }
       return;
    }
    public void i(){
       KwaiLoadingView td = this.d;
       if (td != null) {
          td.a();
          this.c.set(false);
       }
       return;
    }
    public void onAttachedToWindow(){
       super.onAttachedToWindow();
       if (this.isShown()) {
          this.h();
       }
       return;
    }
    public void onDetachedFromWindow(){
       this.i();
       super.onDetachedFromWindow();
    }
    public boolean onTouchEvent(MotionEvent p0){
       return false;
    }
    public void onVisibilityAggregated(boolean p0){
       super.onVisibilityAggregated(p0);
       if (p0 != this.b) {
          this.b = p0;
          this.c(p0);
       }
       return;
    }
    public void onWindowVisibilityChanged(int p0){
       super.onWindowVisibilityChanged(p0);
       this.b(p0);
    }
    public void setLoadingHeight(int p0){
       this.e(0, (float)p0);
    }
    public void setLoadingStyle(LoadingStyle p0){
       KwaiLoadingView td = this.d;
       if (td != null) {
          td.setLoadingStyle(p0);
       }
       return;
    }
    public void setLoadingText(CharSequence p0){
       this.e.setText(p0);
       if (TextUtils.isEmpty(p0)) {
          this.e.setVisibility(8);
       }else {
          this.e.setVisibility(0);
       }
       return;
    }
    public void setLoadingWidth(int p0){
       this.e((float)p0, 0);
    }
    public void setTitleDetailText(CharSequence p0){
       if (TextUtils.isEmpty(p0)) {
          KwaiLoadingView tf = this.f;
          if (tf != null) {
             tf.setVisibility(8);
          }
          return;
       }else {
          this.getTitleDetailView().setVisibility(0);
          this.getTitleDetailView().setText(p0);
          return;
       }
    }
    public void setVisibility(int p0){
       super.setVisibility(p0);
       if (this.getVisibility() != p0) {
          this.b(p0);
       }
       return;
    }
}
