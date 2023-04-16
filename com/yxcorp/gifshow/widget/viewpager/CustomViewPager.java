package com.yxcorp.gifshow.widget.viewpager.CustomViewPager;
import com.yxcorp.gifshow.log.widget.CommonLogViewPager;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import h3.a;
import androidx.viewpager.widget.ViewPager;
import com.yxcorp.gifshow.widget.viewpager.CustomViewPager$a;
import java.lang.Exception;
import com.yxcorp.gifshow.osbug.IgnorableOSBugException;

public class CustomViewPager extends CommonLogViewPager	// class@0019f1
{
    public float u;
    public CustomViewPager$a v;

    public void CustomViewPager(Context p0){
       super(p0);
    }
    public void CustomViewPager(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CustomViewPager.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!(p0.getAction() & 0x00ff)) {
          this.u = p0.getX();
       }
       return super.onInterceptTouchEvent(p0);
    }
    public boolean onTouchEvent(MotionEvent p0){
       CustomViewPager obj = PatchProxy.applyOneRefs(p0, this, CustomViewPager.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.getAdapter() != null) {
          int i = 1;
          if (!this.getCurrentItem() || this.getCurrentItem() == (this.getAdapter().j() - i)) {
             float x = p0.getX();
             if ((p0.getAction() & 0x00ff) == i) {
                if (this.getCurrentItem() || ((x - this.u) - 200.00f > 0 && !PatchProxy.applyVoid(null, this, CustomViewPager.class, "1"))) {
                   obj = this.v;
                   if (obj != null) {
                      obj.b();
                   }
                }
                if (this.getCurrentItem() != (this.getAdapter().j() - i) || (x - (this.u - 200.00f) < 0 && !PatchProxy.applyVoid(null, this, CustomViewPager.class, "2"))) {
                   obj = this.v;
                   if (obj != null) {
                      obj.a();
                   }
                }
             }
          }else {
          label_0088 :
             this.u = 0;
          }
       }else {
          goto label_0088 ;
       }
       try{
          return super.onTouchEvent(p0);
       }catch(java.lang.IllegalArgumentException e7){
          IgnorableOSBugException.ignoreOrThrowIt(this.getClass().getName(), e7);
          return false;
       }
    }
    public void setOnSwipeOutListener(CustomViewPager$a p0){
       this.v = p0;
    }
}
