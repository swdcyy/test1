package com.kuaishou.live.common.core.component.pendant.miniwidget.position.rightbottom.b;
import java.lang.Runnable;
import com.kuaishou.live.common.core.component.pendant.miniwidget.position.rightbottom.LiveRightBottomRevenueWidgetViewV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.pendant.miniwidget.position.rightbottom.LiveRightBottomRevenueWidgetBaseView$b;

public class b implements Runnable	// class@00170d
{
    public final LiveRightBottomRevenueWidgetViewV2 b;

    public void b(LiveRightBottomRevenueWidgetViewV2 p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       b tb = this.b;
       LiveRightBottomRevenueWidgetViewV2 y = tb.y;
       if (y != null) {
          y.a(tb.h, 1);
       }
       return;
    }
}
