package com.kuaishou.live.gzone.v2.widget.LiveGzoneScrollViewPager;
import j63.a;
import androidx.viewpager.widget.KwaiViewPager;
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
import androidx.viewpager.widget.ViewPager;
import java.util.Set;
import android.view.MotionEvent;
import com.yxcorp.utility.SystemUtil;
import lnc.a1;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public class LiveGzoneScrollViewPager extends KwaiViewPager implements a	// class@001cf4
{
    public boolean b;
    public Set c;

    public void LiveGzoneScrollViewPager(Context p0){
       super(p0);
       this.b = true;
       this.c = new HashSet();
    }
    public void LiveGzoneScrollViewPager(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = true;
       this.c = new HashSet();
    }
    public boolean canScrollHorizontally(int p0){
       if (PatchProxy.isSupport(LiveGzoneScrollViewPager.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LiveGzoneScrollViewPager.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (this.b != null) {
          return super.canScrollHorizontally(p0);
       }else {
          return false;
       }
    }
    public boolean getScrollable(){
       return this.b;
    }
    public void h(boolean p0,String p1){
       if (PatchProxy.isSupport(LiveGzoneScrollViewPager.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, LiveGzoneScrollViewPager.class, "4")) {
          return;
       }
       if (p0) {
          this.c.remove(p1);
          this.b = this.c.isEmpty();
          return;
       }else {
          this.c.add(p1);
          this.b = false;
          return;
       }
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveGzoneScrollViewPager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.b != null) {
          return super.onInterceptTouchEvent(p0);
       }
       return false;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveGzoneScrollViewPager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.b != null) {
          return super.onTouchEvent(p0);
       }
       return false;
    }
    public void setScrollable(boolean p0){
       if (PatchProxy.isSupport(LiveGzoneScrollViewPager.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveGzoneScrollViewPager.class, "3")) {
          return;
       }
       this.h(p0, "default");
       return;
    }
}
