package com.yxcorp.gifshow.postfont.repo.FontDownloadHelper$b;
import com.kwai.middleware.resourcemanager.download.config.DownloadConfig;
import com.yxcorp.gifshow.postfont.repo.FontDownloadHelper;
import d0c.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.download.DownloadTask$DownloadTaskType;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.io.File;
import com.yxcorp.gifshow.postfont.FontEnv;

public final class FontDownloadHelper$b extends DownloadConfig	// class@00109c
{
    public a a;
    public final FontDownloadHelper b;

    public void FontDownloadHelper$b(FontDownloadHelper p0,a p1){
       a.p(p1, "fontData");
       this.b = p0;
       super();
       this.a = p1;
    }
    public final a a(){
       return this.a;
    }
    public String getBizType(){
       return "FONT";
    }
    public DownloadTask$DownloadTaskType getDownloadPriority(){
       return DownloadTask$DownloadTaskType.IMMEDIATE;
    }
    public String getMd5(){
       Object obj = PatchProxy.apply(null, this, FontDownloadHelper$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.g();
    }
    public boolean getNeedUnzip(){
       return true;
    }
    public String getProjectName(){
       return ":ks-components:post-font";
    }
    public List getResourceUrls(){
       Object obj = PatchProxy.apply(null, this, FontDownloadHelper$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.h();
    }
    public File getUnzipFolder(){
       Object obj = PatchProxy.apply(null, this, FontDownloadHelper$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return FontEnv.a();
    }
}
