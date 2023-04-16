package com.kwai.video.ksmemorykit.EditorEnhanceTask;
import java.lang.Object;
import com.kwai.kve.ErrorInfo$ErrorCode;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.kve.ErrorInfo;
import com.kwai.video.ksmemorykit.EditorEnhanceTask$EventListener;
import com.kwai.kve.LutEnhancer;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import java.util.List;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import java.lang.Thread;
import com.kwai.video.ksmemorykit.EditorEnhanceTask$1;
import java.lang.Runnable;

public class EditorEnhanceTask	// class@0008e8
{
    public List mCPUImageFrames;
    public boolean mCancelled;
    public EditorEnhanceTask$EventListener mEventListener;
    public LutEnhancer mLutEnhancer;
    public String mLutPath;

    public void EditorEnhanceTask(){
       super();
    }
    public void callOnError(ErrorInfo$ErrorCode p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EditorEnhanceTask.class, "4")) {
          return;
       }
       _monitor_enter(this);
       EditorEnhanceTask tmEventListe = this.mEventListener;
       if (tmEventListe != null) {
          tmEventListe.onError(new ErrorInfo(p0, p1));
       }
       _monitor_exit(this);
       return;
    }
    public void cancel(){
       if (PatchProxy.applyVoid(null, this, EditorEnhanceTask.class, "3")) {
          return;
       }
       this.mCancelled = true;
       EditorEnhanceTask tmLutEnhance = this.mLutEnhancer;
       if (tmLutEnhance != null) {
          tmLutEnhance.cancel();
       }
       return;
    }
    public void setEventListener(EditorEnhanceTask$EventListener p0){
       _monitor_enter(this);
       this.mEventListener = p0;
       _monitor_exit(this);
    }
    public void start(EditorSdk2V2$VideoEditorProject p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EditorEnhanceTask.class, "1")) {
          return;
       }
       this.start(p0, p1, null);
       return;
    }
    public void start(EditorSdk2V2$VideoEditorProject p0,String p1,List p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, EditorEnhanceTask.class, "2")) {
          return;
       }
       if (p0 != null && (p0.trackAssets() == null || (p0.trackAssetsSize() || (p2 != null && (!p2.size() || p1 == null))))) {
          this.callOnError(ErrorInfo$ErrorCode.INVALID_PARAMETER, "Failed to start enhance task. Invalid number of track assets.");
          return;
       }else {
          this.mCancelled = false;
          new Thread(new EditorEnhanceTask$1(this, p2, p0, p1)).start();
          return;
       }
    }
}
