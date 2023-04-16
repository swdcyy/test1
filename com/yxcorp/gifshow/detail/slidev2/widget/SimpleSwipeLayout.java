package com.yxcorp.gifshow.detail.slidev2.widget.SimpleSwipeLayout;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.View;
import joc.z;
import android.view.ViewGroup;

public class SimpleSwipeLayout extends FrameLayout	// class@001a08
{
    public z b;

    public void SimpleSwipeLayout(Context p0){
       super(p0);
    }
    public void SimpleSwipeLayout(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       SimpleSwipeLayout obj = PatchProxy.applyOneRefs(p0, this, SimpleSwipeLayout.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b;
       if (obj != null && obj.c(this, p0)) {
          return true;
       }
       return super.onInterceptTouchEvent(p0);
    }
    public boolean onTouchEvent(MotionEvent p0){
       SimpleSwipeLayout obj = PatchProxy.applyOneRefs(p0, this, SimpleSwipeLayout.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b;
       if (obj != null && obj.e(this, p0)) {
          return true;
       }
       return super.onTouchEvent(p0);
    }
    public void setTouchDetector(z p0){
       this.b = p0;
    }
}
