package com.yxcorp.gifshow.util.PostBaseResourceDownloadHelper$b;
import com.kwai.middleware.resourcemanager.download.config.DownloadConfig;
import com.yxcorp.gifshow.util.PostBaseResourceDownloadHelper;
import java.util.List;
import java.lang.String;
import com.yxcorp.download.DownloadTask$DownloadTaskType;
import java.io.File;

public class PostBaseResourceDownloadHelper$b extends DownloadConfig	// class@001f14
{
    public final List a;
    public final String b;
    public final String c;
    public final DownloadTask$DownloadTaskType d;
    public final PostBaseResourceDownloadHelper e;

    public void PostBaseResourceDownloadHelper$b(PostBaseResourceDownloadHelper p0,List p1,String p2,String p3,DownloadTask$DownloadTaskType p4){
       this.e = p0;
       super();
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
    }
    public String getBizType(){
       return this.e.d();
    }
    public DownloadTask$DownloadTaskType getDownloadPriority(){
       return this.d;
    }
    public File getFileFolder(){
       return new File(this.b);
    }
    public String getFileName(){
       return this.c;
    }
    public boolean getNeedUnzip(){
       return true;
    }
    public String getProjectName(){
       return ":ks-features:ft-post:internal-shared-impls";
    }
    public List getResourceUrls(){
       return this.a;
    }
}
