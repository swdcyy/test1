package com.kwai.feed.player.ui.GestureView;
import android.view.View;
import android.view.ViewConfiguration;
import android.content.Context;
import com.kwai.feed.player.ui.GestureView$a;
import com.kwai.feed.player.ui.GestureView$b;
import com.kwai.feed.player.ui.GestureView$c;
import android.util.AttributeSet;
import com.kwai.feed.player.ui.GestureView$f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.HashSet;
import java.util.Set;
import android.view.MotionEvent;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.util.Iterator;
import com.kwai.feed.player.ui.GestureView$d;
import c56.a;
import c56.b;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.utility.Log;
import android.view.ViewParent;
import android.view.GestureDetector;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector$OnGestureListener;
import c56.a$c;
import c56.b$a;
import android.view.View$OnClickListener;
import java.lang.UnsupportedOperationException;
import android.view.View$OnLongClickListener;
import c56.b$b;

public class GestureView extends View	// class@0014ad
{
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public a f;
    public b g;
    public GestureDetector h;
    public a$c i;
    public Set j;
    public Set k;
    public Set l;
    public boolean m;
    public long n;
    public boolean o;
    public final GestureDetector$OnGestureListener p;
    public final a$c q;
    public final GestureDetector$OnDoubleTapListener r;
    public static final int s;

    static {
       GestureView.s = ViewConfiguration.getDoubleTapTimeout();
    }
    public void GestureView(Context p0){
       super(p0);
       this.b = -1;
       this.p = new GestureView$a(this);
       this.q = new GestureView$b(this);
       this.r = new GestureView$c(this);
    }
    public void GestureView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = -1;
       this.p = new GestureView$a(this);
       this.q = new GestureView$b(this);
       this.r = new GestureView$c(this);
    }
    public void GestureView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = -1;
       this.p = new GestureView$a(this);
       this.q = new GestureView$b(this);
       this.r = new GestureView$c(this);
    }
    public void a(GestureView$f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GestureView.class, "6")) {
          return;
       }
       if (this.j == null) {
          this.j = new HashSet();
       }
       this.j.add(p0);
       return;
    }
    public void b(MotionEvent p0,boolean p1,int p2){
       if (PatchProxy.isSupport(GestureView.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Integer.valueOf(p2), this, GestureView.class, "16")) {
          return;
       }
       this.e("dispatchDoubleTap "+p2);
       GestureView tk = this.k;
       if (tk != null) {
          Iterator iterator = tk.iterator();
          while (iterator.hasNext()) {
             iterator.next().a(p0, p1, p2);
          }
       }
       return;
    }
    public final void c(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GestureView.class, "24")) {
          return;
       }
       GestureView tb = this.b;
       if (tb != 1) {
          if (tb == 2) {
             this.f.c(p0);
          }
       }else {
          this.g.a(p0);
       }
       return;
    }
    public boolean canScrollHorizontally(int p0){
       if (PatchProxy.isSupport(GestureView.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, GestureView.class, "26");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (this.g.d != null && (this.isShown() && this.d != null)) {
          return true;
       }else {
          return super.canScrollHorizontally(p0);
       }
    }
    public void d(MotionEvent p0,boolean p1){
       if (PatchProxy.isSupport(GestureView.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, GestureView.class, "15")) {
          return;
       }
       this.e("dispatchSingleTap");
       GestureView tj = this.j;
       if (tj != null) {
          Iterator iterator = tj.iterator();
          while (iterator.hasNext()) {
             iterator.next().a(p0, p1);
          }
       }
       return;
    }
    public void e(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GestureView.class, "28")) {
          return;
       }
       Log.g("XfPlayerGestureView", this+" "+p0);
       return;
    }
    public final void f(MotionEvent p0,int p1){
       if (PatchProxy.isSupport(GestureView.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, GestureView.class, "25")) {
          return;
       }
       this.b = p1;
       this.getParent().requestDisallowInterceptTouchEvent(true);
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, GestureView.class, "1")) {
          return;
       }
       super.onFinishInflate();
       Context context = this.getContext();
       if (!PatchProxy.applyVoidOneRefs(context, this, GestureView.class, "4")) {
          this.h = new GestureDetector(context, this.p, new Handler(Looper.getMainLooper()));
          this.f = new a(this.q);
          this.g = new b(context);
       }
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GestureView.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int actionMasked = p0.getActionMasked();
       boolean b = false;
       if (actionMasked) {
          if (actionMasked != 1) {
             if (actionMasked != 2) {
                if (actionMasked != 3) {
                   if (actionMasked != 5) {
                      if (actionMasked == 6) {
                         this.c(p0);
                      }
                   }
                }
             }
             if (this.b == -1 && this.e == null) {
                if (this.f.c(p0)) {
                   this.f(p0, 2);
                }else if(this.g.a(p0)){
                   this.f(p0, true);
                }
             }else {
                this.c(p0);
             }
          }
          if (this.d != null) {
             this.c(p0);
          }
          this.b = -1;
          this.d = b;
       }else {
          this.b = -1;
          this.e = b;
          this.d = true;
          this.g.a(p0);
          this.f.c(p0);
          this.e("detect down");
       }
       if (this.b != -1) {
          p0 = MotionEvent.obtain(p0);
          p0.setAction(3);
          this.h.onTouchEvent(p0);
          return true;
       }else {
          return this.h.onTouchEvent(p0);
       }
    }
    public void setEnableContinuousTap(boolean p0){
       this.m = p0;
    }
    public void setEnableHorizontalSwipe(boolean p0){
       if (PatchProxy.isSupport(GestureView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, GestureView.class, "18")) {
          return;
       }
       this.e("setEnableHorizontalSwipe "+p0);
       this.g.d = p0;
       return;
    }
    public void setEnableScaleGesture(boolean p0){
       if (PatchProxy.isSupport(GestureView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, GestureView.class, "20")) {
          return;
       }
       this.e("setEnableScaleGesture "+p0);
       this.f.d = p0;
       return;
    }
    public void setEnableVerticalSwipe(boolean p0){
       if (PatchProxy.isSupport(GestureView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, GestureView.class, "19")) {
          return;
       }
       this.e("setEnableVerticalSwipe "+p0);
       this.g.c = p0;
       return;
    }
    public void setHorizontalSwipeListener(b$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GestureView.class, "12")) {
          return;
       }
       this.g.j = p0;
       return;
    }
    public void setOnClickListener(View$OnClickListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GestureView.class, "2")) {
          return;
       }
       throw new UnsupportedOperationException("”√ OnSingleTapListener");
    }
    public void setOnLongClickListener(View$OnLongClickListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GestureView.class, "3")) {
          return;
       }
       throw new UnsupportedOperationException("”√ OnLongPressListener");
    }
    public void setScaleListener(a$c p0){
       this.i = p0;
    }
    public void setVerticalSwipeListener(b$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GestureView.class, "13")) {
          return;
       }
       this.g.k = p0;
       return;
    }
}
