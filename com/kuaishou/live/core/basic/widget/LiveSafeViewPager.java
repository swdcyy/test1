package com.kuaishou.live.core.basic.widget.LiveSafeViewPager;
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
import h3.a;
import java.lang.IndexOutOfBoundsException;
import android.view.ViewGroup;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import java.lang.Exception;
import com.yxcorp.gifshow.osbug.IgnorableOSBugException;
import java.lang.reflect.Field;
import com.kuaishou.live.core.basic.widget.LiveSafeViewPager$a;
import android.view.animation.Interpolator;
import java.lang.IllegalAccessException;
import java.lang.NoSuchFieldException;

public class LiveSafeViewPager extends ViewPager	// class@000910
{
    public boolean b;

    public void LiveSafeViewPager(Context p0){
       super(p0);
       this.b = true;
    }
    public void LiveSafeViewPager(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = true;
    }
    public boolean canScrollHorizontally(int p0){
       if (PatchProxy.isSupport(LiveSafeViewPager.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LiveSafeViewPager.class, "4");
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
    public boolean onInterceptTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveSafeViewPager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.b == null) {
          return false;
       }
       try{
          if (this.getAdapter() != null && this.getAdapter().j()) {
          label_002a :
             return super.onInterceptTouchEvent(p0);
          }
       }catch(java.lang.IndexOutOfBoundsException e3){
          e3.printStackTrace();
       }
       return false;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveSafeViewPager.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.b == null) {
          return false;
       }
       if (!this.getCurrentItem() && !this.getChildCount()) {
          return false;
       }
       try{
          return super.onTouchEvent(p0);
       }catch(java.lang.IndexOutOfBoundsException e3){
          ExceptionHandler.handleCaughtException(e3);
       }catch(java.lang.IllegalArgumentException e3){
          IgnorableOSBugException.ignoreOrThrowIt(this.getClass().getName(), e3);
       }catch(java.lang.NullPointerException e3){
          ExceptionHandler.handleCaughtException(e3);
       }
       return v1;
    }
    public void setCurrentItem(int p0){
       if (PatchProxy.isSupport(LiveSafeViewPager.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveSafeViewPager.class, "5")) {
          return;
       }
       if (this.b != null) {
          super.setCurrentItem(p0);
       }
       return;
    }
    public void setCurrentItem(int p0,boolean p1){
       if (PatchProxy.isSupport(LiveSafeViewPager.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, LiveSafeViewPager.class, "6")) {
          return;
       }
       if (this.b != null) {
          super.setCurrentItem(p0, p1);
       }
       return;
    }
    public void setScrollable(boolean p0){
       this.b = p0;
    }
    public void setupViewPagerScrollDuration(int p0){
       if (PatchProxy.isSupport(LiveSafeViewPager.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveSafeViewPager.class, "2")) {
          return;
       }
       try{
          Field declaredFiel = ViewPager.class.getDeclaredField("mScroller");
          declaredFiel.setAccessible(true);
          Field declaredFiel1 = ViewPager.class.getDeclaredField("sInterpolator");
          declaredFiel1.setAccessible(true);
          declaredFiel.set(this, new LiveSafeViewPager$a(this, this.getContext(), declaredFiel1.get(null), p0));
       }catch(java.lang.NoSuchFieldException e6){
          e6.printStackTrace();
       }catch(java.lang.IllegalAccessException e6){
          e6.printStackTrace();
       }
       return;
    }
}
