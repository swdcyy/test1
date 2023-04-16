package com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextTemplateDownloadHelper;
import java.lang.Object;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextTemplateDownloadHelper$sk2cDownloader$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextTemplateDownloadHelper$fontDownloader$2;
import crd.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.RuntimeException;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextTemplateDownloadHelper$DownloadFailException;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.Sk2cResourceDownloader;

public final class TextTemplateDownloadHelper	// class@000bed
{
    public final p a;
    public final p b;
    public final a c;

    public void TextTemplateDownloadHelper(){
       super();
       this.a = s.c(TextTemplateDownloadHelper$sk2cDownloader$2.INSTANCE);
       this.b = s.c(TextTemplateDownloadHelper$fontDownloader$2.INSTANCE);
       this.c = new a();
    }
    public final int a(int p0,int p1,int p2){
       if (PatchProxy.isSupport(TextTemplateDownloadHelper.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, TextTemplateDownloadHelper.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (p0 != -2) {
          if (p2 > p1 && (p2 <= 100 && (p1 >= 0 && p0 >= 0))) {
             if (p0 == 200) {
                return p2;
             }else {
                return (p1 + (((p2 - p1) * p0) / 100));
             }
          }else {
             throw new RuntimeException("getPercentIn: invalid percent");
          }
       }else {
          throw new TextTemplateDownloadHelper$DownloadFailException("getPercentIn: download fail");
       }
    }
    public final Sk2cResourceDownloader b(){
       Object obj = PatchProxy.apply(null, this, TextTemplateDownloadHelper.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
}
