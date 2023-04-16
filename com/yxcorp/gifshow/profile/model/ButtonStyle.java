package com.yxcorp.gifshow.profile.model.ButtonStyle;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ButtonStyle extends Enum	// class@00137e
{
    public static final ButtonStyle[] $VALUES;
    public static final ButtonStyle CIRCLE;
    public static final ButtonStyle RECTANGLE;

    static {
       ButtonStyle uButtonStyle1;
       ButtonStyle[] uButtonStyle = new ButtonStyle[]{uButtonStyle1,uButtonStyle1};
       uButtonStyle1 = new ButtonStyle("RECTANGLE", 0);
       ButtonStyle.RECTANGLE = uButtonStyle1;
       uButtonStyle1 = new ButtonStyle("CIRCLE", 1);
       ButtonStyle.CIRCLE = uButtonStyle1;
       ButtonStyle.$VALUES = uButtonStyle;
    }
    public void ButtonStyle(String p0,int p1){
       super(p0, p1);
    }
    public static ButtonStyle valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ButtonStyle.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ButtonStyle.class, p0);
    }
    public static ButtonStyle[] values(){
       Object obj = PatchProxy.apply(null, null, ButtonStyle.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ButtonStyle.$VALUES.clone();
    }
}
