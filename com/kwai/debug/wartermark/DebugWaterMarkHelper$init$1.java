package com.kwai.debug.wartermark.DebugWaterMarkHelper$init$1;
import androidx.lifecycle.LifecycleObserver;
import com.kwai.debug.wartermark.DebugWaterMarkHelper;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import android.widget.LinearLayout;
import android.view.View;
import ri5.b$a;

public final class DebugWaterMarkHelper$init$1 implements LifecycleObserver	// class@000cfc
{
    public final DebugWaterMarkHelper b;

    public void DebugWaterMarkHelper$init$1(DebugWaterMarkHelper p0){
       this.b = p0;
       super();
    }
    public final void onDestroy(){
       if (PatchProxy.applyVoid(null, this, DebugWaterMarkHelper$init$1.class, "2")) {
          return;
       }
       this.b.h.getLifecycle().removeObserver(this);
       return;
    }
    public final void onResume(){
       if (PatchProxy.applyVoid(null, this, DebugWaterMarkHelper$init$1.class, "1")) {
          return;
       }
       int childCount = this.b.f().getChildCount();
       int i = 0;
       while (i < childCount) {
          View childAt = this.b.f().getChildAt(i);
          if (childAt != null) {
             Object[] tag = childAt.getTag(R.id.debug_water_mark_tag_show_listener_id);
             if (!tag instanceof b$a) {
                tag = null;
             }
             if (tag != null && !tag.a()) {
                childAt.setVisibility(8);
             }else {
                childAt.setVisibility(0);
             }
          }
          i = i + 1;
       }
       return;
    }
}
