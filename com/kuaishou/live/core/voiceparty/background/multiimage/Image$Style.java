package com.kuaishou.live.core.voiceparty.background.multiimage.Image$Style;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class Image$Style extends Enum	// class@00134e
{
    public static final Image$Style[] $VALUES;
    public static final Image$Style CIRCLE;
    public static final Image$Style NONE;

    static {
       Image$Style style;
       Image$Style[] styleArray = new Image$Style[]{style,style};
       style = new Image$Style("NONE", 0);
       Image$Style.NONE = style;
       style = new Image$Style("CIRCLE", 1);
       Image$Style.CIRCLE = style;
       Image$Style.$VALUES = styleArray;
    }
    public void Image$Style(String p0,int p1){
       super(p0, p1);
    }
    public static Image$Style valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, Image$Style.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(Image$Style.class, p0);
    }
    public static Image$Style[] values(){
       Object obj = PatchProxy.apply(null, null, Image$Style.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Image$Style.$VALUES.clone();
    }
}
