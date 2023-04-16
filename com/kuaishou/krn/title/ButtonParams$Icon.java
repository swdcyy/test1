package com.kuaishou.krn.title.ButtonParams$Icon;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ButtonParams$Icon extends Enum	// class@000917
{
    public int iconId;
    public String value;
    public static final ButtonParams$Icon[] $VALUES;
    public static final ButtonParams$Icon BACK;

    static {
       ButtonParams$Icon icon = new ButtonParams$Icon("BACK", 0, 0x7f080f70, "back");
       ButtonParams$Icon.BACK = icon;
       ButtonParams$Icon[] iconArray = new ButtonParams$Icon[]{icon};
       ButtonParams$Icon.$VALUES = iconArray;
    }
    public void ButtonParams$Icon(String p0,int p1,int p2,String p3){
       super(p0, p1);
       this.iconId = p2;
       this.value = p3;
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
