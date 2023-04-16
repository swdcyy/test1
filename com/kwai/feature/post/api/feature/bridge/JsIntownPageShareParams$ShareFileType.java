package com.kwai.feature.post.api.feature.bridge.JsIntownPageShareParams$ShareFileType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class JsIntownPageShareParams$ShareFileType extends Enum	// class@00134c
{
    public static final JsIntownPageShareParams$ShareFileType[] $VALUES;
    public static final JsIntownPageShareParams$ShareFileType IMAGE;
    public static final JsIntownPageShareParams$ShareFileType NORMAL;

    static {
       JsIntownPageShareParams$ShareFileType shareFileTyp = new JsIntownPageShareParams$ShareFileType("NORMAL", 0);
       JsIntownPageShareParams$ShareFileType.NORMAL = shareFileTyp;
       JsIntownPageShareParams$ShareFileType shareFileTyp1 = new JsIntownPageShareParams$ShareFileType("IMAGE", 1);
       JsIntownPageShareParams$ShareFileType.IMAGE = shareFileTyp1;
       JsIntownPageShareParams$ShareFileType[] shareFileTyp2 = new JsIntownPageShareParams$ShareFileType[]{shareFileTyp,shareFileTyp1};
       JsIntownPageShareParams$ShareFileType.$VALUES = shareFileTyp2;
    }
    public void JsIntownPageShareParams$ShareFileType(String p0,int p1){
       super(p0, p1);
    }
    public static JsIntownPageShareParams$ShareFileType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, JsIntownPageShareParams$ShareFileType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(JsIntownPageShareParams$ShareFileType.class, p0);
    }
    public static JsIntownPageShareParams$ShareFileType[] values(){
       Object obj = PatchProxy.apply(null, null, JsIntownPageShareParams$ShareFileType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return JsIntownPageShareParams$ShareFileType.$VALUES.clone();
    }
}
