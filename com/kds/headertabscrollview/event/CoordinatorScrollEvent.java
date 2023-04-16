package com.kds.headertabscrollview.event.CoordinatorScrollEvent;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class CoordinatorScrollEvent extends Enum	// class@000714
{
    public final String mName;
    public static final CoordinatorScrollEvent[] $VALUES;
    public static final CoordinatorScrollEvent ON_HEADER_BOTTOM_OFFSET_CHANGE;
    public static final CoordinatorScrollEvent ON_REBOUND_OFFSET_CHANGE;

    static {
       CoordinatorScrollEvent uCoordinator1;
       CoordinatorScrollEvent[] uCoordinator = new CoordinatorScrollEvent[]{uCoordinator1,uCoordinator1};
       uCoordinator1 = new CoordinatorScrollEvent("ON_REBOUND_OFFSET_CHANGE", 0, "onReboundOffsetChange");
       CoordinatorScrollEvent.ON_REBOUND_OFFSET_CHANGE = uCoordinator1;
       uCoordinator1 = new CoordinatorScrollEvent("ON_HEADER_BOTTOM_OFFSET_CHANGE", 1, "onHeaderBottomOffsetChange");
       CoordinatorScrollEvent.ON_HEADER_BOTTOM_OFFSET_CHANGE = uCoordinator1;
       CoordinatorScrollEvent.$VALUES = uCoordinator;
    }
    public void CoordinatorScrollEvent(String p0,int p1,String p2){
       super(p0, p1);
       this.mName = p2;
    }
    public static CoordinatorScrollEvent valueOf(String p0){
       return Enum.valueOf(CoordinatorScrollEvent.class, p0);
    }
    public static CoordinatorScrollEvent[] values(){
       return CoordinatorScrollEvent.$VALUES.clone();
    }
    public String toString(){
       return this.mName;
    }
}
