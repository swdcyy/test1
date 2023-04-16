package com.kwai.video.clipkit.ClipExportHandler$2;
import com.kwai.video.editorsdk2.Mp4RemuxerEventListener;
import com.kwai.video.clipkit.ClipExportHandler;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.editorsdk2.Mp4RemuxerException;
import com.kwai.video.clipkit.ClipExportException;
import com.kwai.video.editorsdk2.CommonException;
import java.lang.Exception;
import com.kwai.video.minecraft.model.EditorSdk2V2$AudioAsset;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Double;

public class ClipExportHandler$2 implements Mp4RemuxerEventListener	// class@001a0d
{
    public final ClipExportHandler this$0;
    public final boolean val$isConcat;
    public final String val$outputPath;

    public void ClipExportHandler$2(ClipExportHandler p0,boolean p1,String p2){
       this.this$0 = p0;
       this.val$isConcat = p1;
       this.val$outputPath = p2;
       super();
    }
    public void onCancelled(){
       if (PatchProxy.applyVoid(null, this, ClipExportHandler$2.class, "4")) {
          return;
       }
       this.this$0.notifyCancelCallback("Mp4Remuxer");
       return;
    }
    public void onError(Mp4RemuxerException p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipExportHandler$2.class, "2")) {
          return;
       }
       if (this.val$isConcat == null) {
          this.this$0.notifyErrorCallback("ConcatVideo", new ClipExportException(p0.type, p0.retcode, p0.getMessage()));
       }else {
          this.this$0.concatVideo(this.val$outputPath, false);
       }
       return;
    }
    public void onFinished(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ClipExportHandler$2.class, "3")) {
          return;
       }
       ClipExportHandler$2 tthis$0 = this.this$0;
       if (tthis$0.mIsCancel != null) {
          tthis$0.notifyCancelCallback("ConcatVideo");
          return;
       }else if(tthis$0.mExportFlag <= 2){
          tthis$0.notifyFinishCallback("ConcatVideo");
          return;
       }else {
          ClipExportHandler mLock = tthis$0.mLock;
          _monitor_enter(mLock);
          ClipExportHandler$2 tthis$01 = this.this$0;
          tthis$01.mConcatVideoTempPath = this.val$outputPath;
          ClipExportHandler mExportFlag = tthis$01.mExportFlag;
          if ((mExportFlag & 0x04) == 4) {
             objArray = tthis$01.mConcatAudioTempPath;
          }else if((mExportFlag & 0x08) == 8){
             objArray = tthis$01.mTranscodeAudioTempPath;
          }else {
             int i = 16;
             if ((mExportFlag & i) == i) {
                objArray = tthis$01.mProject.audioAssets(0).assetPath();
             }else {
                tthis$01.notifyErrorCallback("ConcatVideo", new ClipExportException(100, -100004, "concat video finish but do not have next step"));
             }
          }
          if (!TextUtils.isEmpty(objArray)) {
             tthis$01 = this.this$0;
             tthis$01.combineVideoAndAudio(this.val$outputPath, objArray, tthis$01.mExportPath);
          }
          _monitor_exit(mLock);
          return;
       }
    }
    public void onProgress(double p0){
       ClipExportHandler$2 u2 = ClipExportHandler$2.class;
       if (PatchProxy.isSupport(u2) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, u2, "1")) {
          return;
       }
       u2 = this.this$0;
       u2.notifyProgressCallback("ConcatVideo", u2.getCallBackProgress(1, p0));
       return;
    }
}
