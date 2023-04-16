package com.yxcorp.gifshow.share.KwaiOperator$Style;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KwaiOperator$Style extends Enum	// class@001b46
{
    public static final KwaiOperator$Style[] $VALUES;
    public static final KwaiOperator$Style COPY_TITLE;
    public static final KwaiOperator$Style GRID_LIST;
    public static final KwaiOperator$Style ITEM_LIST_DARK;
    public static final KwaiOperator$Style ITEM_LIST_LIGHT;
    public static final KwaiOperator$Style NONE;
    public static final KwaiOperator$Style SECTION_DARK_REFACTOR;
    public static final KwaiOperator$Style SECTION_LIGHT_REFACTOR;

    static {
       KwaiOperator$Style style;
       KwaiOperator$Style[] styleArray = new KwaiOperator$Style[]{style,style,style,style,style,style,style};
       style = new KwaiOperator$Style("NONE", 0);
       KwaiOperator$Style.NONE = style;
       style = new KwaiOperator$Style("GRID_LIST", 1);
       KwaiOperator$Style.GRID_LIST = style;
       style = new KwaiOperator$Style("ITEM_LIST_DARK", 2);
       KwaiOperator$Style.ITEM_LIST_DARK = style;
       style = new KwaiOperator$Style("ITEM_LIST_LIGHT", 3);
       KwaiOperator$Style.ITEM_LIST_LIGHT = style;
       style = new KwaiOperator$Style("COPY_TITLE", 4);
       KwaiOperator$Style.COPY_TITLE = style;
       style = new KwaiOperator$Style("SECTION_DARK_REFACTOR", 5);
       KwaiOperator$Style.SECTION_DARK_REFACTOR = style;
       style = new KwaiOperator$Style("SECTION_LIGHT_REFACTOR", 6);
       KwaiOperator$Style.SECTION_LIGHT_REFACTOR = style;
       KwaiOperator$Style.$VALUES = styleArray;
    }
    public void KwaiOperator$Style(String p0,int p1){
       super(p0, p1);
    }
    public static KwaiOperator$Style valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KwaiOperator$Style.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KwaiOperator$Style.class, p0);
    }
    public static KwaiOperator$Style[] values(){
       Object obj = PatchProxy.apply(null, null, KwaiOperator$Style.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KwaiOperator$Style.$VALUES.clone();
    }
}
