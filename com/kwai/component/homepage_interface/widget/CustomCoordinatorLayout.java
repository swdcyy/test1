package com.kwai.component.homepage_interface.widget.CustomCoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
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
import android.view.ViewGroup;
import com.yxcorp.gifshow.recycler.widget.CustomRecyclerView;

public class CustomCoordinatorLayout extends CoordinatorLayout	// class@000983
{
    public CustomRecyclerView z;

    public void CustomCoordinatorLayout(Context p0){
       super(p0);
    }
    public void CustomCoordinatorLayout(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void CustomCoordinatorLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       CustomCoordinatorLayout obj = PatchProxy.applyOneRefs(p0, this, CustomCoordinatorLayout.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.z;
       if (obj != null) {
          int i = 0;
          if (this.getChildAt(i).getTop() >= 0) {
             i = true;
          }
          obj.setCanPullToRefresh(i);
       }
       return super.onInterceptTouchEvent(p0);
    }
    public void setCustomRecyclerView(CustomRecyclerView p0){
       this.z = p0;
    }
}
