package com.kwai.component.tabs.panel.TabsPanelConfig$Style;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class TabsPanelConfig$Style extends Enum	// class@000b64
{
    public static final TabsPanelConfig$Style[] $VALUES;
    public static final TabsPanelConfig$Style DEFAULT;
    public static final TabsPanelConfig$Style STYLE1;
    public static final TabsPanelConfig$Style STYLE2;
    public static final TabsPanelConfig$Style STYLE_AI_TEXT;

    static {
       TabsPanelConfig$Style style = new TabsPanelConfig$Style("DEFAULT", 0);
       TabsPanelConfig$Style.DEFAULT = style;
       TabsPanelConfig$Style style1 = new TabsPanelConfig$Style("STYLE1", 1);
       TabsPanelConfig$Style.STYLE1 = style1;
       TabsPanelConfig$Style style2 = new TabsPanelConfig$Style("STYLE2", 2);
       TabsPanelConfig$Style.STYLE2 = style2;
       TabsPanelConfig$Style style3 = new TabsPanelConfig$Style("STYLE_AI_TEXT", 3);
       TabsPanelConfig$Style.STYLE_AI_TEXT = style3;
       TabsPanelConfig$Style[] styleArray = new TabsPanelConfig$Style[]{style,style1,style2,style3};
       TabsPanelConfig$Style.$VALUES = styleArray;
    }
    public void TabsPanelConfig$Style(String p0,int p1){
       super(p0, p1);
    }
    public static TabsPanelConfig$Style valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TabsPanelConfig$Style.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(TabsPanelConfig$Style.class, p0);
    }
    public static TabsPanelConfig$Style[] values(){
       Object obj = PatchProxy.apply(null, null, TabsPanelConfig$Style.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TabsPanelConfig$Style.$VALUES.clone();
    }
}
