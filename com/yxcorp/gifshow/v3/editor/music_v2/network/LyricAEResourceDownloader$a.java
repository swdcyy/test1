package com.yxcorp.gifshow.v3.editor.music_v2.network.LyricAEResourceDownloader$a;
import com.kwai.middleware.resourcemanager.download.config.DownloadConfig;
import com.yxcorp.gifshow.v3.editor.music_v2.network.LyricAEResourceDownloader;
import src.g;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.io.File;

public final class LyricAEResourceDownloader$a extends DownloadConfig	// class@00109d
{
    public final g a;
    public final LyricAEResourceDownloader b;

    public void LyricAEResourceDownloader$a(LyricAEResourceDownloader p0,g p1){
       a.p(p1, "item");
       this.b = p0;
       super();
       this.a = p1;
    }
    public String getBizType(){
       return "LYRICS_AE";
    }
    public String getMd5(){
       Object obj = PatchProxy.apply(null, this, LyricAEResourceDownloader$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.o();
    }
    public boolean getNeedUnzip(){
       return true;
    }
    public String getProjectName(){
       return ":ks-features:ft-post:edit";
    }
    public List getResourceUrls(){
       Object obj = PatchProxy.apply(null, this, LyricAEResourceDownloader$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.n();
    }
    public File getUnzipFolder(){
       Object obj = PatchProxy.apply(null, this, LyricAEResourceDownloader$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new File(this.a.m());
    }
}
