package com.kwai.page.component.ui.UIFrom;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class UIFrom extends Enum	// class@001045
{
    public static final UIFrom[] $VALUES;
    public static final UIFrom OUTSIDE_VIEW;
    public static final UIFrom STUB_VIEW;

    static {
       UIFrom uIFrom = new UIFrom("STUB_VIEW", 0);
       UIFrom.STUB_VIEW = uIFrom;
       UIFrom uIFrom1 = new UIFrom("OUTSIDE_VIEW", 1);
       UIFrom.OUTSIDE_VIEW = uIFrom1;
       UIFrom[] uIFromArray = new UIFrom[]{uIFrom,uIFrom1};
       UIFrom.$VALUES = uIFromArray;
    }
    public void UIFrom(String p0,int p1){
       super(p0, p1);
    }
    public static UIFrom valueOf(String p0){
       return Enum.valueOf(UIFrom.class, p0);
    }
    public static UIFrom[] values(){
       return UIFrom.$VALUES.clone();
    }
}
