package com.kwai.video.clipkit.ClipExportHandler$10;
import java.lang.Thread;
import com.kwai.video.clipkit.ClipExportHandler;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.io.File;
import java.lang.StringBuilder;
import com.kwai.video.clipkit.KSClipLog;
import com.kwai.video.clipkit.ClipKitUtils;
import java.lang.Throwable;
import com.kwai.video.clipkit.ClipExportException;

public class ClipExportHandler$10 extends Thread	// class@001a07
{
    public final ClipExportHandler this$0;
    public final String val$remuxPath;
    public final String val$targetPath;

    public void ClipExportHandler$10(ClipExportHandler p0,String p1,String p2,String p3){
       this.this$0 = p0;
       this.val$targetPath = p2;
       this.val$remuxPath = p3;
       super(p1);
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, ClipExportHandler$10.class, "1")) {
          return;
       }
       File uFile = new File(this.val$targetPath);
       String str = "ClipExportHandler";
       if (uFile.exists()) {
          uFile.delete();
          KSClipLog.i(str, "copyPipelineRemuxFile delete old targetFile "+this.val$targetPath);
       }
       try{
          ClipKitUtils.copyFile(this.val$remuxPath, this.val$targetPath);
          this.this$0.notifyFinishCallback("Transcode");
          return;
       }catch(java.io.IOException e0){
          KSClipLog.e(str, "startPipelineRemux copy IOException", e0);
          this.this$0.notifyErrorCallback("CopyFile", new ClipExportException(100, -100001, "file copy failed"));
          return;
       }
    }
}
