package com.yxcorp.gifshow.v3.editor.text.dynamic.repo.DynamicTextDownloadHelper$a;
import com.kwai.middleware.resourcemanager.download.config.DownloadConfig;
import com.yxcorp.gifshow.v3.editor.text.dynamic.repo.DynamicTextDownloadHelper;
import nuc.c;
import java.lang.String;
import hqc.i;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.yxcorp.download.DownloadTask$DownloadTaskType;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.io.File;

public final class DynamicTextDownloadHelper$a extends DownloadConfig	// class@0013d7
{
    public c a;
    public final String b;
    public final i c;
    public final DynamicTextDownloadHelper d;

    public void DynamicTextDownloadHelper$a(DynamicTextDownloadHelper p0,c p1,String p2,i p3){
       a.p(p1, "dynamicViewData");
       a.p(p2, "customBizType");
       a.p(p3, "unzipFolderSupplier");
       this.d = p0;
       super();
       this.a = p1;
       this.b = p2;
       this.c = p3;
    }
    public String getBizType(){
       return this.b;
    }
    public DownloadTask$DownloadTaskType getDownloadPriority(){
       return DownloadTask$DownloadTaskType.IMMEDIATE;
    }
    public String getMd5(){
       Object obj = PatchProxy.apply(null, this, DynamicTextDownloadHelper$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.e();
    }
    public boolean getNeedUnzip(){
       return true;
    }
    public String getProjectName(){
       return ":ks-features:ft-post:edit";
    }
    public List getResourceUrls(){
       Object obj = PatchProxy.apply(null, this, DynamicTextDownloadHelper$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.f();
    }
    public File getUnzipFolder(){
       Object obj = PatchProxy.apply(null, this, DynamicTextDownloadHelper$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.get(this.a);
    }
}
