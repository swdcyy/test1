package com.kwai.library.widget.popup.dialog.callback.CenterSimpleStyleViewState$ButtonType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class CenterSimpleStyleViewState$ButtonType extends Enum	// class@00099c
{
    public static final CenterSimpleStyleViewState$ButtonType[] $VALUES;
    public static final CenterSimpleStyleViewState$ButtonType NEGATIVE;
    public static final CenterSimpleStyleViewState$ButtonType POSITIVE;
    public static final CenterSimpleStyleViewState$ButtonType SINGLE;
    public static final CenterSimpleStyleViewState$ButtonType UNEXACT;

    static {
       CenterSimpleStyleViewState$ButtonType uButtonType;
       CenterSimpleStyleViewState$ButtonType[] uButtonTypeA = new CenterSimpleStyleViewState$ButtonType[]{uButtonType,uButtonType,uButtonType,uButtonType};
       uButtonType = new CenterSimpleStyleViewState$ButtonType("POSITIVE", 0);
       CenterSimpleStyleViewState$ButtonType.POSITIVE = uButtonType;
       uButtonType = new CenterSimpleStyleViewState$ButtonType("NEGATIVE", 1);
       CenterSimpleStyleViewState$ButtonType.NEGATIVE = uButtonType;
       uButtonType = new CenterSimpleStyleViewState$ButtonType("SINGLE", 2);
       CenterSimpleStyleViewState$ButtonType.SINGLE = uButtonType;
       uButtonType = new CenterSimpleStyleViewState$ButtonType("UNEXACT", 3);
       CenterSimpleStyleViewState$ButtonType.UNEXACT = uButtonType;
       CenterSimpleStyleViewState$ButtonType.$VALUES = uButtonTypeA;
    }
    public void CenterSimpleStyleViewState$ButtonType(String p0,int p1){
       super(p0, p1);
    }
    public static CenterSimpleStyleViewState$ButtonType valueOf(String p0){
       return Enum.valueOf(CenterSimpleStyleViewState$ButtonType.class, p0);
    }
    public static CenterSimpleStyleViewState$ButtonType[] values(){
       return CenterSimpleStyleViewState$ButtonType.$VALUES.clone();
    }
}
