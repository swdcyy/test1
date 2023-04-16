package com.kuaishou.ark.rtx.widget.scrollview.view.HScrollerView;
import or.a;
import android.widget.HorizontalScrollView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewTreeObserver;
import pr.a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Boolean;
import or.b;
import android.view.View;
import android.widget.FrameLayout;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import or.c;
import or.d;
import android.view.View$OnScrollChangeListener;

public class HScrollerView extends HorizontalScrollView implements a	// class@000fa2
{
    public boolean b;
    public boolean c;
    public d d;
    public c e;
    public b f;
    public static final int g;

    public void HScrollerView(Context p0){
       super(p0, null);
    }
    public void HScrollerView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void HScrollerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       boolean b = false;
       this.b = b;
       this.c = true;
       this.d = null;
       this.e = null;
       this.f = null;
       if (PatchProxy.applyVoidOneRefs(p0, this, HScrollerView.class, "1")) {
       }else {
          this.setOverScrollMode(2);
          this.setClipToPadding(b);
          this.setImportantForAccessibility(2);
          this.setLayoutParams(new ViewGroup$LayoutParams(-1, -1));
          this.getViewTreeObserver().addOnGlobalLayoutListener(new a(this));
       }
       return;
    }
    public void a(RecyclerView p0){
    }
    public void c(boolean p0){
       if (PatchProxy.isSupport(HScrollerView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, HScrollerView.class, "12")) {
          return;
       }
       this.setNestedScrollingEnabled((p0 ^ 0x01));
       return;
    }
    public void d(boolean p0){
       if (PatchProxy.isSupport(HScrollerView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, HScrollerView.class, "8")) {
          return;
       }
       this.setVerticalScrollBarEnabled(p0);
       return;
    }
    public void e(b p0){
       this.f = p0;
    }
    public void f(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HScrollerView.class, "9")) {
          return;
       }
       this.addView(p0);
       return;
    }
    public void g(boolean p0){
       if (PatchProxy.isSupport(HScrollerView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, HScrollerView.class, "11")) {
          return;
       }
       this.setClipChildren(p0);
       return;
    }
    public FrameLayout getView(){
       return this;
    }
    public void h(boolean p0){
       if (PatchProxy.isSupport(HScrollerView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, HScrollerView.class, "10")) {
          return;
       }
       this.setFillViewport(p0);
       return;
    }
    public void i(boolean p0){
       if (PatchProxy.isSupport(HScrollerView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, HScrollerView.class, "7")) {
          return;
       }
       this.setHorizontalScrollBarEnabled(p0);
       return;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HScrollerView.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!p0.getAction()) {
          this.b = false;
       }
       return super.onInterceptTouchEvent(p0);
    }
    public void onOverScrolled(int p0,int p1,boolean p2,boolean p3){
       HScrollerView te;
       if (PatchProxy.isSupport(HScrollerView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Boolean.valueOf(p2), Boolean.valueOf(p3), this, HScrollerView.class, "4")) {
          return;
       }
       super.onOverScrolled(p0, p1, p2, p3);
       if (p3) {
          if (this.b == null) {
             this.b = true;
             if (p1 > 0) {
                te = this.e;
                if (te != null) {
                   te.a();
                }
             }else {
                te = this.d;
                if (te != null) {
                   te.e();
                }
             }
          }
       }else {
          this.b = false;
       }
       return;
    }
    public void onScrollChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(HScrollerView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, HScrollerView.class, "3")) {
          return;
       }
       super.onScrollChanged(p0, p1, p2, p3);
       HScrollerView tf = this.f;
       if (tf != null) {
          tf.onScrollChange(p0, p1, p2, p3);
       }
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HScrollerView.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.c == null) {
          return true;
       }
       return super.onTouchEvent(p0);
    }
    public void setOnScrollChangeListener(View$OnScrollChangeListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HScrollerView.class, "2")) {
          return;
       }
       super.setOnScrollChangeListener(p0);
       return;
    }
    public void setOnScrollToBottomListener(c p0){
       this.e = p0;
    }
    public void setOnScrollToTopListener(d p0){
       this.d = p0;
    }
    public void setScrollEnabled(boolean p0){
       this.c = p0;
    }
}
