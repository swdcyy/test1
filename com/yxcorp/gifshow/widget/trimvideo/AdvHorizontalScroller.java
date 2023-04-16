package com.yxcorp.gifshow.widget.trimvideo.AdvHorizontalScroller;
import android.widget.HorizontalScrollView;
import android.content.Context;
import com.yxcorp.gifshow.widget.trimvideo.AdvHorizontalScroller$a;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import java.lang.Runnable;
import ekd.k1;
import android.graphics.Canvas;
import android.view.View;
import com.yxcorp.gifshow.widget.trimvideo.AdvHorizontalScroller$b;
import java.lang.Integer;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class AdvHorizontalScroller extends HorizontalScrollView	// class@0019d9
{
    public boolean b;
    public boolean c;
    public Runnable d;
    public AdvHorizontalScroller$b e;
    public int f;

    public void AdvHorizontalScroller(Context p0){
       super(p0);
       this.d = new AdvHorizontalScroller$a(this);
       this.f = -1;
    }
    public void AdvHorizontalScroller(Context p0,AttributeSet p1){
       super(p0, p1);
       this.d = new AdvHorizontalScroller$a(this);
       this.f = -1;
    }
    public void AdvHorizontalScroller(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.d = new AdvHorizontalScroller$a(this);
       this.f = -1;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, AdvHorizontalScroller.class, "3")) {
          return;
       }
       super.onDetachedFromWindow();
       k1.m(this.d);
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdvHorizontalScroller.class, "2")) {
          return;
       }
       super.onDraw(p0);
       AdvHorizontalScroller te = this.e;
       if (te != null) {
          te.c(p0);
       }
       return;
    }
    public void onScrollChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(AdvHorizontalScroller.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, AdvHorizontalScroller.class, "4")) {
          return;
       }
       super.onScrollChanged(p0, p1, p2, p3);
       AdvHorizontalScroller te = this.e;
       if (te != null) {
          te.a(p0, p2);
       }
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AdvHorizontalScroller.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int action = p0.getAction();
       boolean b = true;
       if (action) {
          if (action != b) {
             if (action != 2) {
                if (action == 3) {
                }
             }else {
             label_0036 :
                this.b = b;
             }
          }else {
          }
       }else {
          this.f = this.getScrollX();
          k1.m(this.d);
          goto label_0036 ;
       }
       return super.onTouchEvent(p0);
    }
    public void scrollTo(int p0,int p1){
       if (PatchProxy.isSupport(AdvHorizontalScroller.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, AdvHorizontalScroller.class, "1")) {
          return;
       }
       super.scrollTo(p0, p1);
       AdvHorizontalScroller te = this.e;
       if (te != null && (this.b == null && this.c != null)) {
          te.b();
       }
    label_002d :
       return;
    }
    public void setOnScrollListener(AdvHorizontalScroller$b p0){
       this.e = p0;
    }
}
