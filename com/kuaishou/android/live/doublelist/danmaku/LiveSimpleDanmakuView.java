package com.kuaishou.android.live.doublelist.danmaku.LiveSimpleDanmakuView;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import com.kuaishou.android.live.doublelist.danmaku.LiveSimpleDanmakuView$a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup;
import android.os.SystemClock;
import op.j;
import java.lang.Integer;
import op.q;
import java.lang.Runnable;
import com.kuaishou.android.live.doublelist.danmaku.LiveSimpleDanmakuView$b;
import android.view.Choreographer$FrameCallback;
import android.view.Choreographer;
import java.util.Objects;
import java.lang.Math;
import android.view.View$MeasureSpec;

public class LiveSimpleDanmakuView extends FrameLayout	// class@0007c7
{
    public j b;
    public int c;
    public long d;
    public int e;
    public int f;
    public long g;
    public Choreographer h;
    public LiveSimpleDanmakuView$b i;
    public boolean j;
    public boolean k;
    public boolean l;
    public final Choreographer$FrameCallback m;

    public void LiveSimpleDanmakuView(Context p0){
       super(p0, null, -1);
       this.c = 36;
       this.d = 3000;
       this.m = new LiveSimpleDanmakuView$a(this);
    }
    public void LiveSimpleDanmakuView(Context p0,AttributeSet p1){
       super(p0, p1, -1);
       this.c = 36;
       this.d = 3000;
       this.m = new LiveSimpleDanmakuView$a(this);
    }
    public void LiveSimpleDanmakuView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.c = 36;
       this.d = 3000;
       this.m = new LiveSimpleDanmakuView$a(this);
    }
    public static void a(LiveSimpleDanmakuView p0,View p1){
       p0.e(p1);
    }
    private void e(View p0){
       p0.setTranslationX((float)this.e);
       p0.setVisibility(0);
    }
    public final void b(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSimpleDanmakuView.class, "10")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
       if (layoutParams instanceof FrameLayout$LayoutParams) {
          layoutParams.width = -2;
          layoutParams.height = -1;
       }else {
          layoutParams = new FrameLayout$LayoutParams(-2, -1);
       }
       p0.setLayoutParams(layoutParams);
       p0.measure(0, 0);
       p0.getLayoutParams().width = p0.getMeasuredWidth();
       p0.setTranslationX((float)this.e);
       super.addView(p0);
       this.f(this.f);
       return;
    }
    public void c(){
       int i4;
       if (PatchProxy.applyVoid(null, this, LiveSimpleDanmakuView.class, "1")) {
          return;
       }
       if (!this.g - null) {
          this.getChildAt(0).setTranslationX((float)this.e);
          this.g = SystemClock.uptimeMillis();
          return;
       }else {
          long l = SystemClock.uptimeMillis();
          long l1 = l - this.g;
          this.g = l;
          l = (long)this.e * l1;
          int i = (int)(l / this.d);
          int i1 = 0;
          int i2 = 0;
          while (true) {
             if (i1 >= this.getChildCount()) {
                return;
             }
             View childAt = this.getChildAt(i1);
             int i3 = (int)childAt.getX();
             if (!i1) {
                i4 = childAt.getWidth() + i3;
                if (i4 < 0) {
                   this.b.a(childAt);
                   this.removeView(childAt);
                   i1 = i1 - 1;
                }else {
                   float f = childAt.getTranslationX() - (float)i;
                   childAt.setTranslationX(f);
                   i2 = i4 - i;
                }
             }else {
                i2 = i2 + childAt.getTag(0x7f0a4478).intValue();
                childAt.setTranslationX((float)i2);
                i2 = i2 + childAt.getWidth();
             }
             int i5 = this.getChildCount() - 1;
             if (i1 == i5) {
                LiveSimpleDanmakuView te = this.e;
                if (i3 < te) {
                   i3 = this.c + i2;
                   if (i3 < te) {
                      i5 = this.f + 1;
                      if (i5 >= this.b.d()) {
                         if (this.l != null && this.f >= this.getChildCount()) {
                            this.f = 0;
                         }
                      }else {
                         i5 = this.f + 1;
                         this.f = i5;
                      }
                      childAt = this.b.e(this.getContext(), this.f, this.b.f());
                      if (childAt == null) {
                         break ;
                      }else {
                         LiveSimpleDanmakuView te1 = this.e;
                         i4 = te1 - i2;
                         LiveSimpleDanmakuView tc = this.c;
                         int i6 = tc / 6;
                         i6 = i6 + tc;
                         if (i4 > i6) {
                            i3 = te1 - i2;
                            childAt.setTag(R.id.viewtag, Integer.valueOf(i3));
                         }else {
                            childAt.setTag(R.id.viewtag, Integer.valueOf(tc));
                         }
                         this.b(childAt);
                         i1 = i1 + 1;
                      }
                   }
                }
             }
             i1 = i1 + 1;
          }
          return;
       }
    }
    public final void d(int p0){
       if (PatchProxy.isSupport(LiveSimpleDanmakuView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveSimpleDanmakuView.class, "9")) {
          return;
       }
       View view = this.b.e(this.getContext(), p0, this.b.f());
       if (view == null) {
          return;
       }
       this.f = p0;
       view.setTag(R.id.viewtag, Integer.valueOf(this.c));
       this.b(view);
       view.setVisibility(4);
       this.post(new q(this, view));
       return;
    }
    public final void f(int p0){
       if (PatchProxy.isSupport(LiveSimpleDanmakuView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveSimpleDanmakuView.class, "2")) {
          return;
       }
       LiveSimpleDanmakuView ti = this.i;
       if (ti != null) {
          ti.a(p0);
       }
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, LiveSimpleDanmakuView.class, "6")) {
          return;
       }
       this.j = false;
       this.g = 0;
       LiveSimpleDanmakuView th = this.h;
       if (th != null) {
          th.removeFrameCallback(this.m);
       }
       this.removeAllViews();
       return;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, LiveSimpleDanmakuView.class, "7")) {
          return;
       }
       if ((this.f + 1) >= this.b.d() && this.l != null) {
          this.i(0);
       }else {
          this.i((this.f + 1));
       }
       return;
    }
    public final void i(int p0){
       if (PatchProxy.isSupport(LiveSimpleDanmakuView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveSimpleDanmakuView.class, "5")) {
          return;
       }
       if (this.b.d() > p0 && this.j == null) {
          boolean b = true;
          this.j = b;
          this.d(p0);
          int i = this.b.c();
          Objects.requireNonNull(this.b);
          int i1 = Math.min(2, ((this.b.d() - p0) - b)) - i;
          if (i1 > 0) {
             int i2 = 0;
             while (i2 < i1) {
                int i3 = p0 + 1;
                i3 = i3 + i;
                i3 = i3 + i2;
                View view = this.b.e(this.getContext(), i3, null);
                if (view != null) {
                   this.b.a(view);
                }
                i2 = i2 + 1;
             }
          }
          if (this.h == null) {
             this.h = Choreographer.getInstance();
          }
          this.h.postFrameCallbackDelayed(this.m, 100);
       }
       return;
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, LiveSimpleDanmakuView.class, "8")) {
          return;
       }
       this.g();
       this.b.b();
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(LiveSimpleDanmakuView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, LiveSimpleDanmakuView.class, "3")) {
          return;
       }
       super.onMeasure(p0, p1);
       this.e = View$MeasureSpec.getSize(p0);
       return;
    }
    public void setAdapter(j p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSimpleDanmakuView.class, "4")) {
          return;
       }
       if (this.b != null) {
          this.j();
       }
       this.b = p0;
       this.i(0);
       return;
    }
    public void setAnimationDuration(long p0){
       this.d = p0;
    }
    public void setEnableAutoStop(boolean p0){
       this.k = p0;
    }
    public void setEnableLoopPlay(boolean p0){
       this.l = p0;
    }
    public void setOnItemShowListener(LiveSimpleDanmakuView$b p0){
       this.i = p0;
    }
    public void setSpanSize(int p0){
       this.c = p0;
    }
}
