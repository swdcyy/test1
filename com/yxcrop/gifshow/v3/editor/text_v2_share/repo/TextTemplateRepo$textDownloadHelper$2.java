package com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextTemplateRepo$textDownloadHelper$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextTemplateDownloadHelper;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class TextTemplateRepo$textDownloadHelper$2 extends Lambda implements a	// class@000bf6
{
    public static final TextTemplateRepo$textDownloadHelper$2 INSTANCE;

    static {
       TextTemplateRepo$textDownloadHelper$2.INSTANCE = new TextTemplateRepo$textDownloadHelper$2();
    }
    public void TextTemplateRepo$textDownloadHelper$2(){
       super(0);
    }
    public final TextTemplateDownloadHelper invoke(){
       Object obj = PatchProxy.apply(null, this, TextTemplateRepo$textDownloadHelper$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new TextTemplateDownloadHelper();
    }
    public Object invoke(){
       return this.invoke();
    }
}
