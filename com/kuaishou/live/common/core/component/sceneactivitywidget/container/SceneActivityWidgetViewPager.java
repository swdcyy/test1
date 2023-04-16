package com.kuaishou.live.common.core.component.sceneactivitywidget.container.SceneActivityWidgetViewPager;
import com.kwai.library.widget.viewpager.VerticalViewPager;
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
import android.view.ViewGroup;

public class SceneActivityWidgetViewPager extends VerticalViewPager	// class@00176b
{
    public boolean l1;

    public void SceneActivityWidgetViewPager(Context p0){
       super(p0);
    }
    public void SceneActivityWidgetViewPager(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SceneActivityWidgetViewPager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.l1 != null && (this.getAdapter() == null || !this.getAdapter().j())) {
          return false;
       }
       return super.onInterceptTouchEvent(p0);
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SceneActivityWidgetViewPager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.getCurrentItem() || (!this.getChildCount() || this.l1 == null)) {
          return false;
       }
       return super.onTouchEvent(p0);
    }
    public void setIsLoopWidget(boolean p0){
       this.l1 = p0;
    }
}
