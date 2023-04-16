package com.yxcorp.gifshow.recycler.widget.NestedScrollSafeViewPager;
import com.yxcorp.gifshow.recycler.widget.NestedScrollViewPager;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.library.widget.viewpager.ScrollViewPager;
import java.lang.Integer;

public class NestedScrollSafeViewPager extends NestedScrollViewPager	// class@0017bb
{
    public boolean m;

    public void NestedScrollSafeViewPager(Context p0){
       super(p0);
    }
    public void NestedScrollSafeViewPager(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NestedScrollSafeViewPager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       try{
          return super.onInterceptTouchEvent(p0);
       }catch(java.lang.IllegalArgumentException e0){
          return false;
       }
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NestedScrollSafeViewPager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       try{
          return super.onTouchEvent(p0);
       }catch(java.lang.IllegalArgumentException e0){
          return false;
       }
    }
    public void setCurrentItem(int p0){
       if (PatchProxy.isSupport(NestedScrollSafeViewPager.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, NestedScrollSafeViewPager.class, "3")) {
          return;
       }
       super.setCurrentItem(p0, (this.m ^ 0x01));
       return;
    }
    public void setDefaultSwitchItemNoAnimation(boolean p0){
       this.m = p0;
    }
}
