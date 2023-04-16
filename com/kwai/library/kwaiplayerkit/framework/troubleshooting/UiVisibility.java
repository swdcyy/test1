package com.kwai.library.kwaiplayerkit.framework.troubleshooting.UiVisibility;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class UiVisibility extends Enum	// class@000892
{
    public static final UiVisibility[] $VALUES;
    public static final UiVisibility GONE;
    public static final UiVisibility INVISIBLE;
    public static final UiVisibility UNKNOWN;
    public static final UiVisibility VISIBLE;

    static {
       UiVisibility uiVisibility1;
       UiVisibility[] uiVisibility = new UiVisibility[]{uiVisibility1,uiVisibility1,uiVisibility1,uiVisibility1};
       uiVisibility1 = new UiVisibility("UNKNOWN", 0);
       UiVisibility.UNKNOWN = uiVisibility1;
       uiVisibility1 = new UiVisibility("VISIBLE", 1);
       UiVisibility.VISIBLE = uiVisibility1;
       uiVisibility1 = new UiVisibility("INVISIBLE", 2);
       UiVisibility.INVISIBLE = uiVisibility1;
       uiVisibility1 = new UiVisibility("GONE", 3);
       UiVisibility.GONE = uiVisibility1;
       UiVisibility.$VALUES = uiVisibility;
    }
    public void UiVisibility(String p0,int p1){
       super(p0, p1);
    }
    public static UiVisibility valueOf(String p0){
       return Enum.valueOf(UiVisibility.class, p0);
    }
    public static UiVisibility[] values(){
       return UiVisibility.$VALUES.clone();
    }
}
