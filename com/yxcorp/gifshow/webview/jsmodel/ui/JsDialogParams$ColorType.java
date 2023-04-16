package com.yxcorp.gifshow.webview.jsmodel.ui.JsDialogParams$ColorType;
import java.lang.Enum;
import kz6.f;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class JsDialogParams$ColorType extends Enum	// class@001790
{
    public int mBackground;
    public static final JsDialogParams$ColorType[] $VALUES;
    public static final JsDialogParams$ColorType NEGATIVE;
    public static final JsDialogParams$ColorType NEUTRAL;
    public static final JsDialogParams$ColorType POSITIVE;

    static {
       JsDialogParams$ColorType uColorType = new JsDialogParams$ColorType("POSITIVE", 0, f.d);
       JsDialogParams$ColorType.POSITIVE = uColorType;
       JsDialogParams$ColorType uColorType1 = new JsDialogParams$ColorType("NEGATIVE", 1, f.e);
       JsDialogParams$ColorType.NEGATIVE = uColorType1;
       JsDialogParams$ColorType uColorType2 = new JsDialogParams$ColorType("NEUTRAL", 2, f.c);
       JsDialogParams$ColorType.NEUTRAL = uColorType2;
       JsDialogParams$ColorType[] uColorTypeAr = new JsDialogParams$ColorType[]{uColorType,uColorType1,uColorType2};
       JsDialogParams$ColorType.$VALUES = uColorTypeAr;
    }
    public void JsDialogParams$ColorType(String p0,int p1,int p2){
       super(p0, p1);
       this.mBackground = p2;
    }
    public static JsDialogParams$ColorType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, JsDialogParams$ColorType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(JsDialogParams$ColorType.class, p0);
    }
    public static JsDialogParams$ColorType[] values(){
       Object obj = PatchProxy.apply(null, null, JsDialogParams$ColorType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return JsDialogParams$ColorType.$VALUES.clone();
    }
}
