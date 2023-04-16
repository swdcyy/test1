package com.kwai.video.clipkit.ClipExportHandler$1;
import java.lang.Thread;
import com.kwai.video.clipkit.ClipExportHandler;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.clipkit.ClipKitUtils;
import java.lang.Throwable;
import com.kwai.video.clipkit.KSClipLog;
import com.kwai.video.clipkit.ClipExportException;

public class ClipExportHandler$1 extends Thread	// class@001a0c
{
    public final ClipExportHandler this$0;

    public void ClipExportHandler$1(ClipExportHandler p0,String p1){
       this.this$0 = p0;
       super(p1);
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, ClipExportHandler$1.class, "1")) {
          return;
       }
       try{
          ClipKitUtils.copyFile(this.this$0.mProject.trackAssets(0).assetPath(), this.this$0.mExportPath);
          this.this$0.notifyFinishCallback("CopyFile");
       }catch(java.io.IOException e1){
          KSClipLog.e("ClipExportHandler", "copyFile IOException", e1);
          this.this$0.notifyErrorCallback("CopyFile", new ClipExportException(100, -100001, "file copy failed"));
       }
       return;
    }
}
