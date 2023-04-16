package com.kuaishou.pagedy.container.widget.DynamicMultiTabsView$a;
import androidx.viewpager2.widget.ViewPager2$h;
import com.kuaishou.pagedy.container.widget.DynamicMultiTabsView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;

public final class DynamicMultiTabsView$a extends ViewPager2$h	// class@000a65
{
    public final DynamicMultiTabsView a;

    public void DynamicMultiTabsView$a(DynamicMultiTabsView p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
    }
    public void c(int p0){
       DynamicMultiTabsView$a uoa = DynamicMultiTabsView$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       this.a.c(p0);
       return;
    }
}
