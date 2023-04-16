package com.kwai.yoda.model.ButtonParams$Icon;
import java.lang.Enum;
import java.lang.String;
import com.kwai.yoda.model.ButtonParams;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ButtonParams$Icon extends Enum	// class@0012bb
{
    public int mIconId;
    public String mValue;
    public static final ButtonParams$Icon[] $VALUES;
    public static final ButtonParams$Icon BACK;
    public static final ButtonParams$Icon CLOSE;
    public static final ButtonParams$Icon CUSTOM;
    public static final ButtonParams$Icon DEFAULT;
    public static final ButtonParams$Icon SHARE;

    static {
       ButtonParams$Icon icon = new ButtonParams$Icon("SHARE", 0, ButtonParams.getButtonDrawable("share", 0x7f0819f8), "share");
       ButtonParams$Icon.SHARE = icon;
       ButtonParams$Icon icon1 = new ButtonParams$Icon("BACK", 1, ButtonParams.getButtonDrawable("back", 0x7f0819dc), "back");
       ButtonParams$Icon.BACK = icon1;
       ButtonParams$Icon icon2 = new ButtonParams$Icon("CLOSE", 2, ButtonParams.getButtonDrawable("close", 0x7f0819e0), "close");
       ButtonParams$Icon.CLOSE = icon2;
       ButtonParams$Icon icon3 = new ButtonParams$Icon("CUSTOM", 3, ButtonParams.getButtonDrawable("custom", 0x7f0819dc), "custom");
       ButtonParams$Icon.CUSTOM = icon3;
       ButtonParams$Icon icon4 = new ButtonParams$Icon("DEFAULT", 4, -1, "");
       ButtonParams$Icon.DEFAULT = icon4;
       ButtonParams$Icon[] iconArray = new ButtonParams$Icon[]{icon,icon1,icon2,icon3,icon4};
       ButtonParams$Icon.$VALUES = iconArray;
    }
    public void ButtonParams$Icon(String p0,int p1,int p2,String p3){
       super(p0, p1);
       this.mIconId = p2;
       this.mValue = p3;
    }
    public static ButtonParams$Icon valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ButtonParams$Icon.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ButtonParams$Icon.class, p0);
    }
    public static ButtonParams$Icon[] values(){
       Object obj = PatchProxy.apply(null, null, ButtonParams$Icon.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ButtonParams$Icon.$VALUES.clone();
    }
}
