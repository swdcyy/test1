package com.kwai.library.widget.refresh.path.LoadingStyle;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class LoadingStyle extends Enum	// class@0009dc
{
    public int value;
    public static final LoadingStyle[] $VALUES;
    public static final LoadingStyle CUSTOM;
    public static final LoadingStyle GRADIENT;
    public static final LoadingStyle GRAY;
    public static final LoadingStyle GRAY_DARK;
    public static final LoadingStyle GRAY_LIGHT;
    public static final LoadingStyle WHITE;

    static {
       LoadingStyle loadingStyle = new LoadingStyle("GRAY", 0, 0);
       LoadingStyle.GRAY = loadingStyle;
       LoadingStyle loadingStyle1 = new LoadingStyle("GRAY_LIGHT", 1, 1);
       LoadingStyle.GRAY_LIGHT = loadingStyle1;
       LoadingStyle loadingStyle2 = new LoadingStyle("GRAY_DARK", 2, 2);
       LoadingStyle.GRAY_DARK = loadingStyle2;
       LoadingStyle loadingStyle3 = new LoadingStyle("WHITE", 3, 3);
       LoadingStyle.WHITE = loadingStyle3;
       LoadingStyle loadingStyle4 = new LoadingStyle("GRADIENT", 4, 4);
       LoadingStyle.GRADIENT = loadingStyle4;
       LoadingStyle loadingStyle5 = new LoadingStyle("CUSTOM", 5, 5);
       LoadingStyle.CUSTOM = loadingStyle5;
       LoadingStyle[] loadingStyle6 = new LoadingStyle[]{loadingStyle,loadingStyle1,loadingStyle2,loadingStyle3,loadingStyle4,loadingStyle5};
       LoadingStyle.$VALUES = loadingStyle6;
    }
    public void LoadingStyle(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static LoadingStyle fromOrdinal(int p0){
       if (p0 >= 0 && p0 < LoadingStyle.values().length) {
          return LoadingStyle.values()[p0];
       }
       return LoadingStyle.GRAY;
    }
    public static LoadingStyle valueOf(String p0){
       return Enum.valueOf(LoadingStyle.class, p0);
    }
    public static LoadingStyle[] values(){
       return LoadingStyle.$VALUES.clone();
    }
}
