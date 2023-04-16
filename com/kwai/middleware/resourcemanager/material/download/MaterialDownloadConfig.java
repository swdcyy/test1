package com.kwai.middleware.resourcemanager.material.download.MaterialDownloadConfig;
import com.kwai.middleware.resourcemanager.download.config.DownloadConfig;
import java.lang.String;
import pb7.a;
import com.yxcorp.download.DownloadTask$DownloadBizExtra;
import com.yxcorp.download.DownloadTask$DownloadTaskType;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kwai.middleware.resourcemanager.material.download.MaterialDownloadConfig$fileFolder$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.middleware.resourcemanager.material.download.MaterialDownloadConfig$fileName$2;
import com.kwai.middleware.resourcemanager.material.download.MaterialDownloadConfig$unzipFolder$2;
import java.lang.StringBuilder;
import nsd.u;
import java.io.File;
import java.util.List;

public class MaterialDownloadConfig extends DownloadConfig	// class@000f5d
{
    public final p a;
    public final p b;
    public final p c;
    public final String d;
    public final String e;
    public final a f;
    public final String g;
    public final DownloadTask$DownloadBizExtra h;
    public final DownloadTask$DownloadTaskType i;

    public void MaterialDownloadConfig(String p0,a p1,String p2,DownloadTask$DownloadBizExtra p3,DownloadTask$DownloadTaskType p4){
       a.p(p0, "subBiz");
       a.p(p1, "info");
       a.p(p2, "projectName");
       a.p(p4, "downloadPriority");
       super();
       this.e = p0;
       this.f = p1;
       this.g = p2;
       this.h = p3;
       this.i = p4;
       this.a = s.c(new MaterialDownloadConfig$fileFolder$2(this));
       this.b = s.c(new MaterialDownloadConfig$fileName$2(this));
       this.c = s.c(new MaterialDownloadConfig$unzipFolder$2(this));
       this.d = "RM_"+p0;
    }
    public void MaterialDownloadConfig(String p0,a p1,String p2,DownloadTask$DownloadBizExtra p3,DownloadTask$DownloadTaskType p4,int p5,u p6){
       if (p5 & 0x10) {
          p4 = DownloadTask$DownloadTaskType.ENQUEUE;
       }
       super(p0, p1, p2, null, p4);
       return;
    }
    public final a a(){
       return this.f;
    }
    public final String b(){
       return this.e;
    }
    public DownloadTask$DownloadBizExtra getBizExtra(){
       return this.h;
    }
    public String getBizType(){
       return this.d;
    }
    public DownloadTask$DownloadTaskType getDownloadPriority(){
       return this.i;
    }
    public File getFileFolder(){
       return this.a.getValue();
    }
    public String getFileName(){
       return this.b.getValue();
    }
    public String getMd5(){
       return this.f.getMd5();
    }
    public boolean getNeedUnzip(){
       return true;
    }
    public String getProjectName(){
       return this.g;
    }
    public List getResourceUrls(){
       return this.f.getResourceUrls();
    }
    public File getUnzipFolder(){
       return this.c.getValue();
    }
}
