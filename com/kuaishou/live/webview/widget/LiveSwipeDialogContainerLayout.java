package com.kuaishou.live.webview.widget.LiveSwipeDialogContainerLayout;
import android.widget.FrameLayout;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import com.kuaishou.live.webview.widget.LiveSwipeDialogContainerLayout$a;
import android.view.ViewGroup;
import androidx.customview.widget.ViewDragHelper$c;
import androidx.customview.widget.ViewDragHelper;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import a2.i0;
import com.kuaishou.live.webview.widget.LiveSwipeDialogContainerLayout$b;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Integer;

public class LiveSwipeDialogContainerLayout extends FrameLayout	// class@001015
{
    public ViewDragHelper b;
    public ViewGroup c;
    public int d;
    public float e;
    public float f;
    public LiveSwipeDialogContainerLayout$b g;
    public final ViewDragHelper$c h;
    public static final int i;

    static {
       LiveSwipeDialogContainerLayout.i = a1.e(48.00f);
    }
    public void LiveSwipeDialogContainerLayout(Context p0){
       super(p0, null);
    }
    public void LiveSwipeDialogContainerLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveSwipeDialogContainerLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       LiveSwipeDialogContainerLayout$a uoa = new LiveSwipeDialogContainerLayout$a(this);
       this.h = uoa;
       this.b = ViewDragHelper.create(this, uoa);
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, LiveSwipeDialogContainerLayout.class, "6")) {
          return;
       }
       this.b.smoothSlideViewTo(this.c, 0, this.d);
       this.invalidate();
       return;
    }
    public void computeScroll(){
       if (PatchProxy.applyVoid(null, this, LiveSwipeDialogContainerLayout.class, "5")) {
          return;
       }
       super.computeScroll();
       if (this.b.continueSettling(true)) {
          i0.j0(this);
       }else if(this.c.getTop() == this.d){
          LiveSwipeDialogContainerLayout tg = this.g;
          if (tg != null) {
             tg.b();
          }
       }
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, LiveSwipeDialogContainerLayout.class, "3")) {
          return;
       }
       super.onFinishInflate();
       this.c = this.findViewById(0x7f0a2a54);
       return;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveSwipeDialogContainerLayout.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int action = p0.getAction();
       if (action) {
          if (action == 2) {
             float f = p0.getX() - this.e;
             LiveSwipeDialogContainerLayout tf = this.f;
             float f1 = p0.getY() - tf;
             if (0 - f1 < 0 && (f - f1 < 0 && (0 - tf <= 0 && tf - (float)LiveSwipeDialogContainerLayout.i <= 0))) {
                return true;
             }
          }
       }else {
          this.e = p0.getX();
          this.f = p0.getY();
       }
       this.b.shouldInterceptTouchEvent(p0);
       return false;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(LiveSwipeDialogContainerLayout.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, LiveSwipeDialogContainerLayout.class, "4")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       this.d = this.getMeasuredHeight();
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveSwipeDialogContainerLayout.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.b.processTouchEvent(p0);
       return true;
    }
    public void setOnScrollListener(LiveSwipeDialogContainerLayout$b p0){
       this.g = p0;
    }
}
