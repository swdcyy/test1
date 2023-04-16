package com.yxcrop.gifshow.v3.editor.text_v3.utils.TextTemplateEnvV3$resSavePath$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.io.File;
import com.yxcorp.gifshow.util.PostUtils;
import kotlin.jvm.internal.a;

public final class TextTemplateEnvV3$resSavePath$2 extends Lambda implements a	// class@000c6b
{
    public static final TextTemplateEnvV3$resSavePath$2 INSTANCE;

    static {
       TextTemplateEnvV3$resSavePath$2.INSTANCE = new TextTemplateEnvV3$resSavePath$2();
    }
    public void TextTemplateEnvV3$resSavePath$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       File obj = PatchProxy.apply(null, this, TextTemplateEnvV3$resSavePath$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = PostUtils.r(".text_templates");
       a.o(obj, "PostUtils.getSubPrivateCacheDir\(SAVE_DIR\)");
       return obj.getAbsolutePath();
    }
}
