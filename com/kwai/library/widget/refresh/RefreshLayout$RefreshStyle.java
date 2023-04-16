package com.kwai.library.widget.refresh.RefreshLayout$RefreshStyle;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class RefreshLayout$RefreshStyle extends Enum	// class@0009c4
{
    public static final RefreshLayout$RefreshStyle[] $VALUES;
    public static final RefreshLayout$RefreshStyle FLOAT;
    public static final RefreshLayout$RefreshStyle NORMAL;
    public static final RefreshLayout$RefreshStyle PINNED;

    static {
       RefreshLayout$RefreshStyle refreshStyle = new RefreshLayout$RefreshStyle("NORMAL", 0);
       RefreshLayout$RefreshStyle.NORMAL = refreshStyle;
       RefreshLayout$RefreshStyle refreshStyle1 = new RefreshLayout$RefreshStyle("PINNED", 1);
       RefreshLayout$RefreshStyle.PINNED = refreshStyle1;
       RefreshLayout$RefreshStyle refreshStyle2 = new RefreshLayout$RefreshStyle("FLOAT", 2);
       RefreshLayout$RefreshStyle.FLOAT = refreshStyle2;
       RefreshLayout$RefreshStyle[] refreshStyle3 = new RefreshLayout$RefreshStyle[]{refreshStyle,refreshStyle1,refreshStyle2};
       RefreshLayout$RefreshStyle.$VALUES = refreshStyle3;
    }
    public void RefreshLayout$RefreshStyle(String p0,int p1){
       super(p0, p1);
    }
    public static RefreshLayout$RefreshStyle valueOf(String p0){
       return Enum.valueOf(RefreshLayout$RefreshStyle.class, p0);
    }
    public static RefreshLayout$RefreshStyle[] values(){
       return RefreshLayout$RefreshStyle.$VALUES.clone();
    }
}
