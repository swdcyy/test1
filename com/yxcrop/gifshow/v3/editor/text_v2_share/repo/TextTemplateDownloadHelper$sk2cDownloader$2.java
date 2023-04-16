package com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextTemplateDownloadHelper$sk2cDownloader$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.Sk2cResourceDownloader;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class TextTemplateDownloadHelper$sk2cDownloader$2 extends Lambda implements a	// class@000bec
{
    public static final TextTemplateDownloadHelper$sk2cDownloader$2 INSTANCE;

    static {
       TextTemplateDownloadHelper$sk2cDownloader$2.INSTANCE = new TextTemplateDownloadHelper$sk2cDownloader$2();
    }
    public void TextTemplateDownloadHelper$sk2cDownloader$2(){
       super(0);
    }
    public final Sk2cResourceDownloader invoke(){
       Object obj = PatchProxy.apply(null, this, TextTemplateDownloadHelper$sk2cDownloader$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new Sk2cResourceDownloader();
    }
    public Object invoke(){
       return this.invoke();
    }
}
