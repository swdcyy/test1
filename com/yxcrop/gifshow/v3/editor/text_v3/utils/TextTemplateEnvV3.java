package com.yxcrop.gifshow.v3.editor.text_v3.utils.TextTemplateEnvV3;
import com.yxcrop.gifshow.v3.editor.text_v3.utils.TextTemplateEnvV3$resSavePath$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.String;
import java.io.File;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;

public final class TextTemplateEnvV3	// class@000c6c
{
    public static final p a;
    public static final TextTemplateEnvV3 b;

    static {
       TextTemplateEnvV3.b = new TextTemplateEnvV3();
       TextTemplateEnvV3.a = s.c(TextTemplateEnvV3$resSavePath$2.INSTANCE);
    }
    public void TextTemplateEnvV3(){
       super();
    }
    public static final File a(String p0,String p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       TextTemplateEnvV3 textTemplate = TextTemplateEnvV3.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, textTemplate, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "textId");
       a.p(p1, "resMd5");
       Object obj1 = PatchProxy.apply(null, null, textTemplate, "1");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = TextTemplateEnvV3.a.getValue();
       }
       return new File(obj1, p0+'_'+p1);
    }
}
