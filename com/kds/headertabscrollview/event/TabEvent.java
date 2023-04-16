package com.kds.headertabscrollview.event.TabEvent;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class TabEvent extends Enum	// class@000715
{
    public final String mName;
    public static final TabEvent[] $VALUES;
    public static final TabEvent ON_TAB_RESELECTED;
    public static final TabEvent ON_TAB_SELECTED;
    public static final TabEvent ON_TAB_UNSELECTED;

    static {
       TabEvent tabEvent;
       TabEvent[] tabEventArra = new TabEvent[]{tabEvent,tabEvent,tabEvent};
       tabEvent = new TabEvent("ON_TAB_SELECTED", 0, "onTabSelected");
       TabEvent.ON_TAB_SELECTED = tabEvent;
       tabEvent = new TabEvent("ON_TAB_UNSELECTED", 1, "onTabUnselected");
       TabEvent.ON_TAB_UNSELECTED = tabEvent;
       tabEvent = new TabEvent("ON_TAB_RESELECTED", 2, "onTabReselected");
       TabEvent.ON_TAB_RESELECTED = tabEvent;
       TabEvent.$VALUES = tabEventArra;
    }
    public void TabEvent(String p0,int p1,String p2){
       super(p0, p1);
       this.mName = p2;
    }
    public static TabEvent valueOf(String p0){
       return Enum.valueOf(TabEvent.class, p0);
    }
    public static TabEvent[] values(){
       return TabEvent.$VALUES.clone();
    }
    public String toString(){
       return this.mName;
    }
}
