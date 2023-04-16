package com.yxcorp.gifshow.profile.widget.HorizontalRecyclerView;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import kotlin.LazyThreadSafetyMode;
import com.yxcorp.gifshow.profile.widget.HorizontalRecyclerView$mTouchSlop$2;
import msd.a;
import qrd.p;
import qrd.s;
import android.view.MotionEvent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Math;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import android.view.ViewGroup;
import java.lang.Number;
import android.view.ViewParent;

public final class HorizontalRecyclerView extends RecyclerView	// class@0015f6
{
    public float b;
    public float c;
    public final p d;
    public HashMap e;

    public void HorizontalRecyclerView(Context p0){
       super(p0, null);
    }
    public void HorizontalRecyclerView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
       this.d = s.b(LazyThreadSafetyMode.NONE, new HorizontalRecyclerView$mTouchSlop$2(p0));
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       ViewPager obj = PatchProxy.applyOneRefs(p0, this, HorizontalRecyclerView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "ev");
       int action = p0.getAction();
       boolean b = true;
       if (action) {
          if (action == 0.00f) {
             float y = p0.getY();
             if (Math.abs((p0.getX() - this.c)) - (float)this.getMTouchSlop() > 0 && Math.abs((y - this.b)) - (float)(this.getMTouchSlop() * 2) < 0) {
                obj = this.x(this);
                if (obj != null) {
                   obj.requestDisallowInterceptTouchEvent(false);
                }
             }else {
                obj = this.x(this);
                if (obj != null) {
                   obj.requestDisallowInterceptTouchEvent(b);
                }
             }
          }
       }else {
          this.b = p0.getX();
          this.c = p0.getY();
          obj = this.x(this);
          if (obj != null) {
             obj.requestDisallowInterceptTouchEvent(b);
          }
       }
       return super.dispatchTouchEvent(p0);
    }
    public final int getMTouchSlop(){
       Object obj = PatchProxy.apply(null, this, HorizontalRecyclerView.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = this.d.getValue();
       }
       return obj.intValue();
    }
    public final ViewPager x(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HorizontalRecyclerView.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       ViewParent parent = p0.getParent();
       v0 = parent instanceof ViewPager;
       while (!obj) {
          ViewParent parent1 = (parent != null)? parent.getParent(): null;
          if (parent1 != null) {
             parent = parent.getParent();
          }else if(!obj){
             parent = null;
          }
          return parent;
       }
    }
}
