package com.ks.ksuploader.KSUploader$UploadInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.io.File;

public class KSUploader$UploadInfo	// class@000763
{
    public long duration;
    public boolean enableResume;
    public KSEncryptConfig encryptConfig;
    public String fileID;
    public String filePath;
    public int fragNum;
    public boolean isStreaming;
    public long lastModifiedTime;
    public long overwrittenSize;
    public long sentDuration;
    public long sentSize;
    public long size;
    public long skipedDuration;
    public long skipedSize;
    public long startIndex;
    public long startIndexSize;
    public String taskId;
    public long totalSegmentSize;

    public void KSUploader$UploadInfo(){
       super();
       this.enableResume = false;
       this.isStreaming = false;
       this.lastModifiedTime = 0;
       this.overwrittenSize = 0;
    }
    public long getFileSize(){
       Object obj = PatchProxy.apply(null, this, KSUploader$UploadInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (this.filePath == null) {
          return (this.totalSegmentSize - this.overwrittenSize);
       }
       if (!this.size) {
          this.size = new File(this.filePath).length();
       }
       return this.size;
    }
    public long getLastModifiedTime(){
       Object obj = PatchProxy.apply(null, this, KSUploader$UploadInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (!this.lastModifiedTime) {
          this.lastModifiedTime = new File(this.filePath).lastModified();
       }
       return this.lastModifiedTime;
    }
    public void update(String p0,String p1,long p2,long p3){
       this.filePath = p0;
       this.taskId = p1;
       this.duration = p2;
       this.size = p3;
    }
}
