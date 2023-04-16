package com.kuaishou.live.common.core.component.pendant.miniwidget.position.rightbottom.LiveRightBottomRevenueWidgetViewV2$a;
import android.view.ViewOutlineProvider;
import com.kuaishou.live.common.core.component.pendant.miniwidget.position.rightbottom.LiveRightBottomRevenueWidgetViewV2;
import android.view.View;
import android.graphics.Outline;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.a1;

public class LiveRightBottomRevenueWidgetViewV2$a extends ViewOutlineProvider	// class@00170a
{
    public final LiveRightBottomRevenueWidgetViewV2 a;

    public void LiveRightBottomRevenueWidgetViewV2$a(LiveRightBottomRevenueWidgetViewV2 p0){
       this.a = p0;
       super();
    }
    public void getOutline(View p0,Outline p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveRightBottomRevenueWidgetViewV2$a.class, "1")) {
          return;
       }
       p1.setRoundRect(0, 0, p0.getWidth(), p0.getHeight(), (float)a1.e(4.00f));
       return;
    }
}
