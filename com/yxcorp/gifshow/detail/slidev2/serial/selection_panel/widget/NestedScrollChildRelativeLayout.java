package com.yxcorp.gifshow.detail.slidev2.serial.selection_panel.widget.NestedScrollChildRelativeLayout;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import a2.u;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import java.lang.Math;

public final class NestedScrollChildRelativeLayout extends RelativeLayout	// class@0019f9
{
    public final int[] b;
    public u c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;

    public void NestedScrollChildRelativeLayout(Context p0){
       super(p0, null);
    }
    public void NestedScrollChildRelativeLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void NestedScrollChildRelativeLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       int[] ointArray = new int[2];
       this.b = ointArray;
       this.getScrollingChildHelper().n(true);
    }
    public final void a(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NestedScrollChildRelativeLayout.class, "3")) {
          return;
       }
       if (this.g == null) {
          this.g = true;
          this.d = (int)(p0.getY() + 0x3f000000);
          this.getScrollingChildHelper().p(2);
       }
       return;
    }
    public final boolean b(){
       return this.g;
    }
    public final u getScrollingChildHelper(){
       NestedScrollChildRelativeLayout obj = PatchProxy.apply(null, this, NestedScrollChildRelativeLayout.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.c == null) {
          this.c = new u(this);
       }
       obj = this.c;
       a.m(obj);
       return obj;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NestedScrollChildRelativeLayout.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.m(p0);
       int i = (int)p0.getX();
       int i1 = (int)p0.getY();
       int action = p0.getAction();
       if (action) {
          if (action != 1) {
             if (action != 2) {
                if (action == 3) {
                }
             }else if(Math.abs((this.e - i1)) > Math.abs((this.f - i)) || this.h != null){
                this.h = true;
             }
          }else {
          }
       }else {
          this.e = i1;
          this.f = i;
          this.h = false;
       }
    label_0051 :
       return this.h;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NestedScrollChildRelativeLayout.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.m(p0);
       int action = p0.getAction();
       if (action) {
          if (action != 1) {
             if (action != 2) {
                if (action == 3) {
                }
             }else {
                this.a(p0);
                int i = (int)(p0.getY() + 0x3f000000);
                this.getScrollingChildHelper().c(false, (this.d - i), null, this.b);
                this.d = i - this.b[1];
             }
          }else {
          }
       }else {
          this.a(p0);
       }
       return true;
    }
}
