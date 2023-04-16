package com.yxcorp.gifshow.ad.webview.jshandler.dto.JsToastParams$Type;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class JsToastParams$Type extends Enum	// class@0018fe
{
    public static final JsToastParams$Type[] $VALUES;
    public static final JsToastParams$Type ERROR;
    public static final JsToastParams$Type NORMAL;
    public static final JsToastParams$Type SUCCESS;

    static {
       JsToastParams$Type type = new JsToastParams$Type("NORMAL", 0);
       JsToastParams$Type.NORMAL = type;
       JsToastParams$Type type1 = new JsToastParams$Type("SUCCESS", 1);
       JsToastParams$Type.SUCCESS = type1;
       JsToastParams$Type type2 = new JsToastParams$Type("ERROR", 2);
       JsToastParams$Type.ERROR = type2;
       JsToastParams$Type[] typeArray = new JsToastParams$Type[]{type,type1,type2};
       JsToastParams$Type.$VALUES = typeArray;
    }
    public void JsToastParams$Type(String p0,int p1){
       super(p0, p1);
    }
    public static JsToastParams$Type valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, JsToastParams$Type.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(JsToastParams$Type.class, p0);
    }
    public static JsToastParams$Type[] values(){
       Object obj = PatchProxy.apply(null, null, JsToastParams$Type.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return JsToastParams$Type.$VALUES.clone();
    }
}
