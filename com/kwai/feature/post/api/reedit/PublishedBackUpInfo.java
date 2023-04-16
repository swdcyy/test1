package com.kwai.feature.post.api.reedit.PublishedBackUpInfo;
import java.io.Serializable;
import com.kwai.feature.post.api.reedit.PublishedBackUpInfo$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class PublishedBackUpInfo implements Serializable	// class@00142b
{
    public final boolean isAutoSave;
    public final String photoId;
    public final long publishedDate;
    public final String taskId;
    public static final PublishedBackUpInfo$a Companion;
    public static final long serialVersionUID;

    static {
       PublishedBackUpInfo.Companion = new PublishedBackUpInfo$a(null);
    }
    public void PublishedBackUpInfo(){
       super(null, 0, false, null, 15, null);
    }
    public void PublishedBackUpInfo(String p0,long p1,boolean p2,String p3){
       super();
       this.photoId = p0;
       this.publishedDate = p1;
       this.isAutoSave = p2;
       this.taskId = p3;
    }
    public void PublishedBackUpInfo(String p0,long p1,boolean p2,String p3,int p4,u p5){
       String str = (p4 & 0x01)? "": p0;
       if (p4 & 0x02) {
          p1 = -1;
       }
       long l = p1;
       int i = (p4 & 0x04)? 0: p2;
       String str1 = (p4 & 0x08)? "": p3;
       super(str, l, i, str1);
       return;
    }
    public final String getPhotoId(){
       return this.photoId;
    }
    public final long getPublishedDate(){
       return this.publishedDate;
    }
    public final String getTaskId(){
       return this.taskId;
    }
    public final boolean isAutoSave(){
       return this.isAutoSave;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PublishedBackUpInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PublishedBackUpInfo\(photoId="+this.photoId+", publishedDate="+this.publishedDate+", isAutoSave="+this.isAutoSave+", taskId="+this.taskId+')';
    }
}
