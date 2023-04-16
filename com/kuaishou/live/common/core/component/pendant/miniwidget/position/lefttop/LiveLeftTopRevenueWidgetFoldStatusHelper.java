package com.kuaishou.live.common.core.component.pendant.miniwidget.position.lefttop.LiveLeftTopRevenueWidgetFoldStatusHelper;
import com.kuaishou.live.common.core.component.pendant.miniwidget.position.lefttop.LiveLeftTopRevenueWidgetFoldStatusHelper$FOLD_STATUS;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class LiveLeftTopRevenueWidgetFoldStatusHelper	// class@001700
{
    public static LiveLeftTopRevenueWidgetFoldStatusHelper$FOLD_STATUS a;
    public static LiveLeftTopRevenueWidgetFoldStatusHelper b;

    static {
       LiveLeftTopRevenueWidgetFoldStatusHelper.a = LiveLeftTopRevenueWidgetFoldStatusHelper$FOLD_STATUS.UNFOLD;
    }
    public void LiveLeftTopRevenueWidgetFoldStatusHelper(){
       super();
    }
    public static LiveLeftTopRevenueWidgetFoldStatusHelper b(){
       Object obj = PatchProxy.apply(null, null, LiveLeftTopRevenueWidgetFoldStatusHelper.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (LiveLeftTopRevenueWidgetFoldStatusHelper.b == null) {
          LiveLeftTopRevenueWidgetFoldStatusHelper.b = new LiveLeftTopRevenueWidgetFoldStatusHelper();
       }
       return LiveLeftTopRevenueWidgetFoldStatusHelper.b;
    }
    public LiveLeftTopRevenueWidgetFoldStatusHelper$FOLD_STATUS a(){
       return LiveLeftTopRevenueWidgetFoldStatusHelper.a;
    }
    public boolean c(){
       boolean b = (LiveLeftTopRevenueWidgetFoldStatusHelper.a != LiveLeftTopRevenueWidgetFoldStatusHelper$FOLD_STATUS.UNFOLD)? true: false;
       return b;
    }
    public void d(LiveLeftTopRevenueWidgetFoldStatusHelper$FOLD_STATUS p0){
       LiveLeftTopRevenueWidgetFoldStatusHelper.a = p0;
    }
}
