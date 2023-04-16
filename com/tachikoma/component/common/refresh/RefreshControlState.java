package com.tachikoma.component.common.refresh.RefreshControlState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class RefreshControlState extends Enum	// class@000ce3
{
    public final String state;
    public static final RefreshControlState[] $VALUES;
    public static final RefreshControlState IDLE;
    public static final RefreshControlState REFRESHING;
    public static final RefreshControlState WILL_REFRESH;

    static {
       RefreshControlState refreshContr = new RefreshControlState("IDLE", 0, "idle");
       RefreshControlState.IDLE = refreshContr;
       RefreshControlState refreshContr1 = new RefreshControlState("WILL_REFRESH", 1, "willRefresh");
       RefreshControlState.WILL_REFRESH = refreshContr1;
       RefreshControlState refreshContr2 = new RefreshControlState("REFRESHING", 2, "refreshing");
       RefreshControlState.REFRESHING = refreshContr2;
       RefreshControlState[] refreshContr3 = new RefreshControlState[]{refreshContr,refreshContr1,refreshContr2};
       RefreshControlState.$VALUES = refreshContr3;
    }
    public void RefreshControlState(String p0,int p1,String p2){
       super(p0, p1);
       this.state = p2;
    }
    public static RefreshControlState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RefreshControlState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(RefreshControlState.class, p0);
    }
    public static RefreshControlState[] values(){
       Object obj = PatchProxy.apply(null, null, RefreshControlState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RefreshControlState.$VALUES.clone();
    }
}
