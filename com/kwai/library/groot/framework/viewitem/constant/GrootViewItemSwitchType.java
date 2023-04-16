package com.kwai.library.groot.framework.viewitem.constant.GrootViewItemSwitchType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class GrootViewItemSwitchType extends Enum	// class@000836
{
    public String mElementName;
    public static final GrootViewItemSwitchType[] $VALUES;
    public static final GrootViewItemSwitchType AUTO;
    public static final GrootViewItemSwitchType CLICK;
    public static final GrootViewItemSwitchType PULL;

    static {
       GrootViewItemSwitchType grootViewIte = new GrootViewItemSwitchType("AUTO", 0, "auto");
       GrootViewItemSwitchType.AUTO = grootViewIte;
       GrootViewItemSwitchType grootViewIte1 = new GrootViewItemSwitchType("CLICK", 1, "click");
       GrootViewItemSwitchType.CLICK = grootViewIte1;
       GrootViewItemSwitchType grootViewIte2 = new GrootViewItemSwitchType("PULL", 2, "pull");
       GrootViewItemSwitchType.PULL = grootViewIte2;
       GrootViewItemSwitchType[] grootViewIte3 = new GrootViewItemSwitchType[]{grootViewIte,grootViewIte1,grootViewIte2};
       GrootViewItemSwitchType.$VALUES = grootViewIte3;
    }
    public void GrootViewItemSwitchType(String p0,int p1,String p2){
       super(p0, p1);
       this.mElementName = p2;
    }
    public static GrootViewItemSwitchType valueOf(String p0){
       return Enum.valueOf(GrootViewItemSwitchType.class, p0);
    }
    public static GrootViewItemSwitchType[] values(){
       return GrootViewItemSwitchType.$VALUES.clone();
    }
}
