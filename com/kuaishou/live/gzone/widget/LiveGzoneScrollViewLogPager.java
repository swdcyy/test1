package com.kuaishou.live.gzone.widget.LiveGzoneScrollViewLogPager;
import j63.a;
import com.yxcorp.gifshow.widget.viewpager.CustomViewPager;
import android.content.Context;
import java.util.HashSet;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.viewpager.widget.CorrectOffsetViewPager;
import java.util.Set;
import com.yxcorp.gifshow.log.widget.CommonLogViewPager;
import android.view.MotionEvent;

public class LiveGzoneScrollViewLogPager extends CustomViewPager implements a	// class@001cfc
{
    public String w;
    public boolean x;
    public Set y;

    public void LiveGzoneScrollViewLogPager(Context p0){
       super(p0);
       this.w = "unknown";
       this.x = true;
       this.y = new HashSet();
    }
    public void LiveGzoneScrollViewLogPager(Context p0,AttributeSet p1){
       super(p0, p1);
       this.w = "unknown";
       this.x = true;
       this.y = new HashSet();
    }
    public boolean canScrollHorizontally(int p0){
       if (PatchProxy.isSupport(LiveGzoneScrollViewLogPager.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LiveGzoneScrollViewLogPager.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (this.x != null) {
          return super.canScrollHorizontally(p0);
       }else {
          return false;
       }
    }
    public String getItemSelectionReasonStr(){
       return this.w;
    }
    public boolean getScrollable(){
       return this.x;
    }
    public void h(boolean p0,String p1){
       if (PatchProxy.isSupport(LiveGzoneScrollViewLogPager.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, LiveGzoneScrollViewLogPager.class, "4")) {
          return;
       }
       if (p0) {
          this.y.remove(p1);
          this.x = this.y.isEmpty();
          return;
       }else {
          this.y.add(p1);
          this.x = false;
          return;
       }
    }
    public void n(int p0,boolean p1,String p2){
       if (PatchProxy.isSupport(LiveGzoneScrollViewLogPager.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Boolean.valueOf(p1), p2, this, LiveGzoneScrollViewLogPager.class, "6")) {
          return;
       }
       this.w = p2;
       super.n(p0, p1, p2);
       return;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveGzoneScrollViewLogPager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.x != null) {
          return super.onInterceptTouchEvent(p0);
       }
       return false;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveGzoneScrollViewLogPager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.x != null) {
          return super.onTouchEvent(p0);
       }
       return false;
    }
    public void setCurrentItem(int p0,boolean p1){
       if (PatchProxy.isSupport(LiveGzoneScrollViewLogPager.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, LiveGzoneScrollViewLogPager.class, "7")) {
          return;
       }
       this.n(p0, p1, "unknown");
       return;
    }
    public void setScrollable(boolean p0){
       if (PatchProxy.isSupport(LiveGzoneScrollViewLogPager.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveGzoneScrollViewLogPager.class, "3")) {
          return;
       }
       this.h(p0, "default");
       return;
    }
}
