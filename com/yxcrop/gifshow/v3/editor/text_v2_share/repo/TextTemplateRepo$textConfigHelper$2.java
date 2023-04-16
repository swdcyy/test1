package com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextTemplateRepo$textConfigHelper$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextTemplateConfigHelper;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class TextTemplateRepo$textConfigHelper$2 extends Lambda implements a	// class@000bf5
{
    public static final TextTemplateRepo$textConfigHelper$2 INSTANCE;

    static {
       TextTemplateRepo$textConfigHelper$2.INSTANCE = new TextTemplateRepo$textConfigHelper$2();
    }
    public void TextTemplateRepo$textConfigHelper$2(){
       super(0);
    }
    public final TextTemplateConfigHelper invoke(){
       Object obj = PatchProxy.apply(null, this, TextTemplateRepo$textConfigHelper$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new TextTemplateConfigHelper();
    }
    public Object invoke(){
       return this.invoke();
    }
}
