package com.kuaishou.live.widget.page2.ViewPager2$RecyclerViewImpl;
import androidx.recyclerview.widget.RecyclerView;
import com.kuaishou.live.widget.page2.ViewPager2;
import android.content.Context;
import java.lang.CharSequence;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import com.kuaishou.live.widget.page2.ViewPager2$e;
import com.kuaishou.live.widget.page2.ViewPager2$d;
import android.view.accessibility.AccessibilityEvent;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Boolean;

public class ViewPager2$RecyclerViewImpl extends RecyclerView	// class@001029
{
    public final ViewPager2 b;

    public void ViewPager2$RecyclerViewImpl(ViewPager2 p0,Context p1){
       this.b = p0;
       super(p1);
    }
    public CharSequence getAccessibilityClassName(){
       ViewPager2 obj = PatchProxy.apply(null, this, ViewPager2$RecyclerViewImpl.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b.u;
       Objects.requireNonNull(obj);
       if (obj instanceof ViewPager2$e) {
          return this.b.u.l();
       }
       return super.getAccessibilityClassName();
    }
    public void onInitializeAccessibilityEvent(AccessibilityEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ViewPager2$RecyclerViewImpl.class, "2")) {
          return;
       }
       super.onInitializeAccessibilityEvent(p0);
       p0.setFromIndex(this.b.e);
       p0.setToIndex(this.b.e);
       this.b.u.onRvInitializeAccessibilityEvent(p0);
       return;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ViewPager2$RecyclerViewImpl.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.b.d() && super.onInterceptTouchEvent(p0))? true: false;
       return b;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ViewPager2$RecyclerViewImpl.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.b.d() && super.onTouchEvent(p0))? true: false;
       return b;
    }
}
