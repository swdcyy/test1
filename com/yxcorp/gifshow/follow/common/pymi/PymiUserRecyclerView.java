package com.yxcorp.gifshow.follow.common.pymi.PymiUserRecyclerView;
import com.yxcorp.gifshow.follow.common.widget.FollowHorizontallyGestureRecyclerView;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewParent;
import android.view.ViewGroup;
import java.lang.Integer;
import android.view.View;

public class PymiUserRecyclerView extends FollowHorizontallyGestureRecyclerView	// class@001084
{
    public boolean c;

    public void PymiUserRecyclerView(Context p0){
       super(p0);
       this.c = true;
    }
    public void PymiUserRecyclerView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.c = true;
    }
    public void PymiUserRecyclerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.c = true;
    }
    public boolean canScrollHorizontally(int p0){
       return this.c;
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PymiUserRecyclerView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!p0.getAction()) {
          this.getParent().requestDisallowInterceptTouchEvent(true);
       }
       return super.dispatchTouchEvent(p0);
    }
    public void setCanScrollHorizontally(boolean p0){
       this.c = p0;
    }
    public boolean x(int p0){
       if (PatchProxy.isSupport(PymiUserRecyclerView.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, PymiUserRecyclerView.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return super.canScrollHorizontally(p0);
    }
}
