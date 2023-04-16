package com.yxcorp.plugin.search.result.widget.HalfPageScrollViewPager;
import androidx.viewpager.widget.ViewPager;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.view.ViewGroup;

public class HalfPageScrollViewPager extends ViewPager	// class@00075f
{
    public boolean b;

    public void HalfPageScrollViewPager(Context p0){
       super(p0);
       this.b = true;
    }
    public void HalfPageScrollViewPager(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = true;
    }
    public boolean canScrollHorizontally(int p0){
       if (PatchProxy.isSupport(HalfPageScrollViewPager.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, HalfPageScrollViewPager.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (this.b == null) {
          return false;
       }else {
          return super.canScrollHorizontally(p0);
       }
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HalfPageScrollViewPager.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.getParent().requestDisallowInterceptTouchEvent(false);
       return super.dispatchTouchEvent(p0);
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HalfPageScrollViewPager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.b != null && super.onInterceptTouchEvent(p0))? true: false;
       return b;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HalfPageScrollViewPager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.b != null && super.onTouchEvent(p0))? true: false;
       return b;
    }
    public void setScrollable(boolean p0){
       this.b = p0;
    }
}
