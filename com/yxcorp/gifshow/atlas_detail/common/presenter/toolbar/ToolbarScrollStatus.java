package com.yxcorp.gifshow.atlas_detail.common.presenter.toolbar.ToolbarScrollStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ToolbarScrollStatus extends Enum	// class@001ba3
{
    public static final ToolbarScrollStatus[] $VALUES;
    public static final ToolbarScrollStatus FULLY_SOLID;
    public static final ToolbarScrollStatus FULLY_TRANSPARENT;
    public static final ToolbarScrollStatus IN_TRANSITION;

    static {
       ToolbarScrollStatus toolbarScrol = new ToolbarScrollStatus("FULLY_TRANSPARENT", 0);
       ToolbarScrollStatus.FULLY_TRANSPARENT = toolbarScrol;
       ToolbarScrollStatus toolbarScrol1 = new ToolbarScrollStatus("IN_TRANSITION", 1);
       ToolbarScrollStatus.IN_TRANSITION = toolbarScrol1;
       ToolbarScrollStatus toolbarScrol2 = new ToolbarScrollStatus("FULLY_SOLID", 2);
       ToolbarScrollStatus.FULLY_SOLID = toolbarScrol2;
       ToolbarScrollStatus[] toolbarScrol3 = new ToolbarScrollStatus[]{toolbarScrol,toolbarScrol1,toolbarScrol2};
       ToolbarScrollStatus.$VALUES = toolbarScrol3;
    }
    public void ToolbarScrollStatus(String p0,int p1){
       super(p0, p1);
    }
    public static ToolbarScrollStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ToolbarScrollStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ToolbarScrollStatus.class, p0);
    }
    public static ToolbarScrollStatus[] values(){
       Object obj = PatchProxy.apply(null, null, ToolbarScrollStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ToolbarScrollStatus.$VALUES.clone();
    }
}
