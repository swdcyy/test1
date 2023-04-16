package com.kwai.component.photo.detail.slide.widget.SlideLongAtlasRecyclerView;
import com.yxcorp.gifshow.recycler.widget.CustomRecyclerView;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView$l;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup;
import ekd.p1;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import a2.q;
import java.lang.Math;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import com.yxcorp.gifshow.widget.SwipeLayout$b;

public class SlideLongAtlasRecyclerView extends CustomRecyclerView	// class@000abc
{
    public float q;
    public float r;
    public float s;
    public SwipeLayout$b t;
    public boolean u;
    public boolean v;
    public boolean w;

    public void SlideLongAtlasRecyclerView(Context p0){
       super(p0, null);
    }
    public void SlideLongAtlasRecyclerView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.setItemAnimator(null);
       this.q = p1.d(this.getContext());
    }
    public boolean B(){
       return this.w;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SlideLongAtlasRecyclerView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!this.isEnabled()) {
          return false;
       }
       if (!q.c(p0)) {
          this.r = p0.getX();
          this.s = p0.getY();
       }
       super.onInterceptTouchEvent(p0);
       return true;
    }
    public boolean onTouchEvent(MotionEvent p0){
       SlideLongAtlasRecyclerView obj = PatchProxy.applyOneRefs(p0, this, SlideLongAtlasRecyclerView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!this.isEnabled()) {
          return b;
       }
       int i = q.c(p0);
       float f = p0.getX() - this.r;
       float f1 = p0.getY() - this.s;
       if (i) {
          if (i != 1) {
             int i1 = 2;
             if (i != i1) {
                if (i == 3) {
                }
             }else if(this.u != null && (Math.abs(f) - (float)(ViewConfiguration.get(this.getContext()).getScaledTouchSlop() / i1) > 0 && Math.abs(f) - (Math.abs(f1) * 2.00f) > 0)){
                this.getParent().requestDisallowInterceptTouchEvent(true);
                super.onTouchEvent(p0);
                return true;
             }
          }else if(f - this.q > 0 && Math.abs(f) - (Math.abs(f1) * 2.00f) > 0){
             obj = this.t;
             if (obj != null) {
                obj.d();
                return true;
             }
          }
       }else {
          this.r = p0.getX();
          this.s = p0.getY();
          this.w = (this.getScrollState())? true: b;
       }
    label_00a1 :
       super.onTouchEvent(p0);
       return true;
    }
    public void setNeedIgnoreAfterDetachedFromWindow(boolean p0){
       this.v = p0;
    }
    public void setNeedRequestDisallowIntercept(boolean p0){
       this.u = p0;
    }
    public void setOnSwipedListener(SwipeLayout$b p0){
       this.t = p0;
    }
    public void x(){
       if (PatchProxy.applyVoid(null, this, SlideLongAtlasRecyclerView.class, "3")) {
          return;
       }
       if (this.v != null) {
          return;
       }
       super.x();
       return;
    }
}
