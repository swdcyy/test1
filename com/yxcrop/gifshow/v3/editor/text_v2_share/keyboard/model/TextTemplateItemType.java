package com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.model.TextTemplateItemType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class TextTemplateItemType extends Enum	// class@000baf
{
    public static final TextTemplateItemType[] $VALUES;
    public static final TextTemplateItemType DYNAMIC;
    public static final TextTemplateItemType LOCAL;

    static {
       TextTemplateItemType textTemplate1;
       TextTemplateItemType[] textTemplate = new TextTemplateItemType[]{textTemplate1,textTemplate1};
       textTemplate1 = new TextTemplateItemType("DYNAMIC", 0);
       TextTemplateItemType.DYNAMIC = textTemplate1;
       textTemplate1 = new TextTemplateItemType("LOCAL", 1);
       TextTemplateItemType.LOCAL = textTemplate1;
       TextTemplateItemType.$VALUES = textTemplate;
    }
    public void TextTemplateItemType(String p0,int p1){
       super(p0, p1);
    }
    public static TextTemplateItemType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TextTemplateItemType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(TextTemplateItemType.class, p0);
    }
    public static TextTemplateItemType[] values(){
       Object obj = PatchProxy.apply(null, null, TextTemplateItemType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TextTemplateItemType.$VALUES.clone();
    }
}
