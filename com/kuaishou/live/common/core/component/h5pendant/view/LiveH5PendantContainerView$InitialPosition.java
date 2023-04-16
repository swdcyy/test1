package com.kuaishou.live.common.core.component.h5pendant.view.LiveH5PendantContainerView$InitialPosition;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveH5PendantContainerView$InitialPosition extends Enum	// class@001339
{
    public static final LiveH5PendantContainerView$InitialPosition[] $VALUES;
    public static final LiveH5PendantContainerView$InitialPosition LEFT_TOP;
    public static final LiveH5PendantContainerView$InitialPosition RIGHT_BOTTOM;
    public static final LiveH5PendantContainerView$InitialPosition RIGHT_TOP;

    static {
       LiveH5PendantContainerView$InitialPosition initialPosit = new LiveH5PendantContainerView$InitialPosition("LEFT_TOP", 0);
       LiveH5PendantContainerView$InitialPosition.LEFT_TOP = initialPosit;
       LiveH5PendantContainerView$InitialPosition initialPosit1 = new LiveH5PendantContainerView$InitialPosition("RIGHT_TOP", 1);
       LiveH5PendantContainerView$InitialPosition.RIGHT_TOP = initialPosit1;
       LiveH5PendantContainerView$InitialPosition initialPosit2 = new LiveH5PendantContainerView$InitialPosition("RIGHT_BOTTOM", 2);
       LiveH5PendantContainerView$InitialPosition.RIGHT_BOTTOM = initialPosit2;
       LiveH5PendantContainerView$InitialPosition[] initialPosit3 = new LiveH5PendantContainerView$InitialPosition[]{initialPosit,initialPosit1,initialPosit2};
       LiveH5PendantContainerView$InitialPosition.$VALUES = initialPosit3;
    }
    public void LiveH5PendantContainerView$InitialPosition(String p0,int p1){
       super(p0, p1);
    }
    public static LiveH5PendantContainerView$InitialPosition valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveH5PendantContainerView$InitialPosition.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveH5PendantContainerView$InitialPosition.class, p0);
    }
    public static LiveH5PendantContainerView$InitialPosition[] values(){
       Object obj = PatchProxy.apply(null, null, LiveH5PendantContainerView$InitialPosition.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveH5PendantContainerView$InitialPosition.$VALUES.clone();
    }
}
