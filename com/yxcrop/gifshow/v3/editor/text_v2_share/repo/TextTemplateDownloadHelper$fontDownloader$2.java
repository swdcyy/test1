package com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextTemplateDownloadHelper$fontDownloader$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.postfont.repo.FontDownloadHelper;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class TextTemplateDownloadHelper$fontDownloader$2 extends Lambda implements a	// class@000beb
{
    public static final TextTemplateDownloadHelper$fontDownloader$2 INSTANCE;

    static {
       TextTemplateDownloadHelper$fontDownloader$2.INSTANCE = new TextTemplateDownloadHelper$fontDownloader$2();
    }
    public void TextTemplateDownloadHelper$fontDownloader$2(){
       super(0);
    }
    public final FontDownloadHelper invoke(){
       Object obj = PatchProxy.apply(null, this, TextTemplateDownloadHelper$fontDownloader$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new FontDownloadHelper();
    }
    public Object invoke(){
       return this.invoke();
    }
}
