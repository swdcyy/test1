package com.kwai.library.widget.popup.common.PopupInterface$Excluded;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class PopupInterface$Excluded extends Enum	// class@00097e
{
    public static final PopupInterface$Excluded[] $VALUES;
    public static final PopupInterface$Excluded ALL_TYPE;
    public static final PopupInterface$Excluded NOT_AGAINST;
    public static final PopupInterface$Excluded ONE_BY_ONE;
    public static final PopupInterface$Excluded SAME_TYPE;

    static {
       PopupInterface$Excluded uExcluded = new PopupInterface$Excluded("NOT_AGAINST", 0);
       PopupInterface$Excluded.NOT_AGAINST = uExcluded;
       PopupInterface$Excluded uExcluded1 = new PopupInterface$Excluded("SAME_TYPE", 1);
       PopupInterface$Excluded.SAME_TYPE = uExcluded1;
       PopupInterface$Excluded uExcluded2 = new PopupInterface$Excluded("ALL_TYPE", 2);
       PopupInterface$Excluded.ALL_TYPE = uExcluded2;
       PopupInterface$Excluded uExcluded3 = new PopupInterface$Excluded("ONE_BY_ONE", 3);
       PopupInterface$Excluded.ONE_BY_ONE = uExcluded3;
       PopupInterface$Excluded[] uExcludedArr = new PopupInterface$Excluded[]{uExcluded,uExcluded1,uExcluded2,uExcluded3};
       PopupInterface$Excluded.$VALUES = uExcludedArr;
    }
    public void PopupInterface$Excluded(String p0,int p1){
       super(p0, p1);
    }
    public static PopupInterface$Excluded valueOf(String p0){
       return Enum.valueOf(PopupInterface$Excluded.class, p0);
    }
    public static PopupInterface$Excluded[] values(){
       return PopupInterface$Excluded.$VALUES.clone();
    }
}
