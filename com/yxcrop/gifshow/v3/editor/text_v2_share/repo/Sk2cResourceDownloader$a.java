package com.yxcrop.gifshow.v3.editor.text_v2_share.repo.Sk2cResourceDownloader$a;
import com.kwai.middleware.resourcemanager.download.config.DownloadConfig;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.Sk2cResourceDownloader;
import nuc.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.io.File;
import com.yxcorp.gifshow.v3.editor.text.dynamic.util.DynamicTextEnv;

public final class Sk2cResourceDownloader$a extends DownloadConfig	// class@000bd7
{
    public final a a;
    public final Sk2cResourceDownloader b;

    public void Sk2cResourceDownloader$a(Sk2cResourceDownloader p0,a p1){
       a.p(p1, "config");
       this.b = p0;
       super();
       this.a = p1;
    }
    public String getBizType(){
       return "COVER_PLUGIN";
    }
    public String getMd5(){
       Object obj = PatchProxy.apply(null, this, Sk2cResourceDownloader$a.class, "2");
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
       Object obj = PatchProxy.apply(null, this, Sk2cResourceDownloader$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.p();
    }
    public File getUnzipFolder(){
       String obj = PatchProxy.apply(null, this, Sk2cResourceDownloader$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.r();
       a.m(obj);
       String str = this.a.o();
       a.m(str);
       return DynamicTextEnv.a(obj, str);
    }
}
