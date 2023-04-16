package com.yxcorp.gifshow.growth.widget.onekeyadd.WidgetViewPager;
import androidx.viewpager.widget.ViewPager;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class WidgetViewPager extends ViewPager	// class@0015f0
{
    public boolean b;

    public void WidgetViewPager(Context p0){
       a.p(p0, "context");
       super(p0, null);
    }
    public void WidgetViewPager(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
       this.b = true;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, WidgetViewPager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.b != null && super.onInterceptTouchEvent(p0))? true: false;
       return b;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, WidgetViewPager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.b != null && super.onTouchEvent(p0))? true: false;
       return b;
    }
    public final void setCanScroll(boolean p0){
       this.b = p0;
    }
}
