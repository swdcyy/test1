package com.yxcorp.gifshow.v3.editor.music_v2.network.LyricMaterialDownloadHelper;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.music_v2.network.LyricAEResourceDownloader;
import com.yxcorp.gifshow.postfont.repo.FontDownloadHelper;
import crd.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.RuntimeException;
import com.yxcorp.gifshow.v3.editor.music_v2.network.LyricMaterialDownloadHelper$DownloadFailException;

public final class LyricMaterialDownloadHelper	// class@0010a7
{
    public final LyricAEResourceDownloader a;
    public final FontDownloadHelper b;
    public final a c;

    public void LyricMaterialDownloadHelper(){
       super();
       this.a = new LyricAEResourceDownloader();
       this.b = new FontDownloadHelper();
       this.c = new a();
    }
    public final int a(int p0,int p1,int p2){
       if (PatchProxy.isSupport(LyricMaterialDownloadHelper.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, LyricMaterialDownloadHelper.class, "3");
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
          throw new LyricMaterialDownloadHelper$DownloadFailException("getPercentIn: download fail");
       }
    }
}
