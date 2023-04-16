package com.yxcorp.gifshow.postfont.model.FontType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class FontType extends Enum	// class@001099
{
    public static final FontType[] $VALUES;
    public static final FontType LOCAL;
    public static final FontType REMOTE;

    static {
       FontType uFontType;
       FontType[] uFontTypeArr = new FontType[]{uFontType,uFontType};
       uFontType = new FontType("REMOTE", 0);
       FontType.REMOTE = uFontType;
       uFontType = new FontType("LOCAL", 1);
       FontType.LOCAL = uFontType;
       FontType.$VALUES = uFontTypeArr;
    }
    public void FontType(String p0,int p1){
       super(p0, p1);
    }
    public static FontType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FontType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(FontType.class, p0);
    }
    public static FontType[] values(){
       Object obj = PatchProxy.apply(null, null, FontType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return FontType.$VALUES.clone();
    }
}
