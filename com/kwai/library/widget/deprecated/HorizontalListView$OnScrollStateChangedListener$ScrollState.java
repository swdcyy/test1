package com.kwai.library.widget.deprecated.HorizontalListView$OnScrollStateChangedListener$ScrollState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class HorizontalListView$OnScrollStateChangedListener$ScrollState extends Enum	// class@000912
{
    public static final HorizontalListView$OnScrollStateChangedListener$ScrollState[] $VALUES;
    public static final HorizontalListView$OnScrollStateChangedListener$ScrollState SCROLL_STATE_FLING;
    public static final HorizontalListView$OnScrollStateChangedListener$ScrollState SCROLL_STATE_IDLE;
    public static final HorizontalListView$OnScrollStateChangedListener$ScrollState SCROLL_STATE_TOUCH_SCROLL;

    static {
       HorizontalListView$OnScrollStateChangedListener$ScrollState onScrollStat = new HorizontalListView$OnScrollStateChangedListener$ScrollState("SCROLL_STATE_IDLE", 0);
       HorizontalListView$OnScrollStateChangedListener$ScrollState.SCROLL_STATE_IDLE = onScrollStat;
       HorizontalListView$OnScrollStateChangedListener$ScrollState onScrollStat1 = new HorizontalListView$OnScrollStateChangedListener$ScrollState("SCROLL_STATE_TOUCH_SCROLL", 1);
       HorizontalListView$OnScrollStateChangedListener$ScrollState.SCROLL_STATE_TOUCH_SCROLL = onScrollStat1;
       HorizontalListView$OnScrollStateChangedListener$ScrollState onScrollStat2 = new HorizontalListView$OnScrollStateChangedListener$ScrollState("SCROLL_STATE_FLING", 2);
       HorizontalListView$OnScrollStateChangedListener$ScrollState.SCROLL_STATE_FLING = onScrollStat2;
       HorizontalListView$OnScrollStateChangedListener$ScrollState[] onScrollStat3 = new HorizontalListView$OnScrollStateChangedListener$ScrollState[]{onScrollStat,onScrollStat1,onScrollStat2};
       HorizontalListView$OnScrollStateChangedListener$ScrollState.$VALUES = onScrollStat3;
    }
    public void HorizontalListView$OnScrollStateChangedListener$ScrollState(String p0,int p1){
       super(p0, p1);
    }
    public static HorizontalListView$OnScrollStateChangedListener$ScrollState valueOf(String p0){
       return Enum.valueOf(HorizontalListView$OnScrollStateChangedListener$ScrollState.class, p0);
    }
    public static HorizontalListView$OnScrollStateChangedListener$ScrollState[] values(){
       return HorizontalListView$OnScrollStateChangedListener$ScrollState.$VALUES.clone();
    }
}
