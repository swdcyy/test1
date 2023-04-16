package com.kuaishou.live.common.core.component.pendant.miniwidget.position.lefttop.LiveLeftTopRevenueWidgetFoldStatusHelper$FOLD_STATUS;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveLeftTopRevenueWidgetFoldStatusHelper$FOLD_STATUS extends Enum	// class@0016ff
{
    public static final LiveLeftTopRevenueWidgetFoldStatusHelper$FOLD_STATUS[] $VALUES;
    public static final LiveLeftTopRevenueWidgetFoldStatusHelper$FOLD_STATUS FOLD_BY_TURBO;
    public static final LiveLeftTopRevenueWidgetFoldStatusHelper$FOLD_STATUS FOLD_BY_USER;
    public static final LiveLeftTopRevenueWidgetFoldStatusHelper$FOLD_STATUS UNFOLD;

    static {
       LiveLeftTopRevenueWidgetFoldStatusHelper$FOLD_STATUS uFOLD_STATUS = new LiveLeftTopRevenueWidgetFoldStatusHelper$FOLD_STATUS("UNFOLD", 0);
       LiveLeftTopRevenueWidgetFoldStatusHelper$FOLD_STATUS.UNFOLD = uFOLD_STATUS;
       LiveLeftTopRevenueWidgetFoldStatusHelper$FOLD_STATUS uFOLD_STATUS1 = new LiveLeftTopRevenueWidgetFoldStatusHelper$FOLD_STATUS("FOLD_BY_USER", 1);
       LiveLeftTopRevenueWidgetFoldStatusHelper$FOLD_STATUS.FOLD_BY_USER = uFOLD_STATUS1;
       LiveLeftTopRevenueWidgetFoldStatusHelper$FOLD_STATUS uFOLD_STATUS2 = new LiveLeftTopRevenueWidgetFoldStatusHelper$FOLD_STATUS("FOLD_BY_TURBO", 2);
       LiveLeftTopRevenueWidgetFoldStatusHelper$FOLD_STATUS.FOLD_BY_TURBO = uFOLD_STATUS2;
       LiveLeftTopRevenueWidgetFoldStatusHelper$FOLD_STATUS[] uFOLD_STATUS3 = new LiveLeftTopRevenueWidgetFoldStatusHelper$FOLD_STATUS[]{uFOLD_STATUS,uFOLD_STATUS1,uFOLD_STATUS2};
       LiveLeftTopRevenueWidgetFoldStatusHelper$FOLD_STATUS.$VALUES = uFOLD_STATUS3;
    }
    public void LiveLeftTopRevenueWidgetFoldStatusHelper$FOLD_STATUS(String p0,int p1){
       super(p0, p1);
    }
    public static LiveLeftTopRevenueWidgetFoldStatusHelper$FOLD_STATUS valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveLeftTopRevenueWidgetFoldStatusHelper$FOLD_STATUS.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveLeftTopRevenueWidgetFoldStatusHelper$FOLD_STATUS.class, p0);
    }
    public static LiveLeftTopRevenueWidgetFoldStatusHelper$FOLD_STATUS[] values(){
       Object obj = PatchProxy.apply(null, null, LiveLeftTopRevenueWidgetFoldStatusHelper$FOLD_STATUS.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveLeftTopRevenueWidgetFoldStatusHelper$FOLD_STATUS.$VALUES.clone();
    }
}
