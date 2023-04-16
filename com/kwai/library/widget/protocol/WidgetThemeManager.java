package com.kwai.library.widget.protocol.WidgetThemeManager;
import java.lang.Enum;
import java.lang.String;
import java.util.HashMap;
import java.lang.Class;
import java.lang.Object;
import java.util.Map;
import java.lang.Integer;

public final class WidgetThemeManager extends Enum	// class@0009b6
{
    public final Map mThemeCache;
    public static final WidgetThemeManager[] $VALUES;
    public static final WidgetThemeManager INSTANCE;

    static {
       WidgetThemeManager widgetThemeM = new WidgetThemeManager("INSTANCE", 0);
       WidgetThemeManager.INSTANCE = widgetThemeM;
       WidgetThemeManager[] widgetThemeM1 = new WidgetThemeManager[]{widgetThemeM};
       WidgetThemeManager.$VALUES = widgetThemeM1;
    }
    public void WidgetThemeManager(String p0,int p1){
       super(p0, p1);
       this.mThemeCache = new HashMap();
    }
    public static WidgetThemeManager valueOf(String p0){
       return Enum.valueOf(WidgetThemeManager.class, p0);
    }
    public static WidgetThemeManager[] values(){
       return WidgetThemeManager.$VALUES.clone();
    }
    public int findThemeId(String p0){
       Integer integer = this.mThemeCache.get(p0);
       if (integer == null) {
          return -1;
       }
       return integer.intValue();
    }
    public void registerTheme(int p0,String p1){
       this.mThemeCache.put(p1, Integer.valueOf(p0));
    }
}
