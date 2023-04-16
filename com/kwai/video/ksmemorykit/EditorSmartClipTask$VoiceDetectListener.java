package com.kwai.video.ksmemorykit.EditorSmartClipTask$VoiceDetectListener;
import com.kwai.kve.VoiceDetectorCallback;
import com.kwai.video.ksmemorykit.EditorSmartClipTask;
import java.lang.Object;
import com.kwai.video.ksmemorykit.EditorSmartClipTask$1;
import com.kwai.kve.VoiceDetectorParam;
import com.kwai.kve.VoiceDetectorResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.ksmemorykit.EditorSmartClipTask$3;
import java.lang.Enum;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$EditorSdkError;
import com.kwai.video.ksmemorykit.EditorSmartClipListener;
import java.util.concurrent.CountDownLatch;

public final class EditorSmartClipTask$VoiceDetectListener implements VoiceDetectorCallback	// class@0008ff
{
    public final EditorSmartClipTask this$0;

    public void EditorSmartClipTask$VoiceDetectListener(EditorSmartClipTask p0){
       this.this$0 = p0;
       super();
    }
    public void EditorSmartClipTask$VoiceDetectListener(EditorSmartClipTask p0,EditorSmartClipTask$1 p1){
       super(p0);
    }
    public VoiceDetectorResult getVoiceDetectorResult(VoiceDetectorParam p0){
       VoiceDetectorResult obj = PatchProxy.applyOneRefs(p0, this, EditorSmartClipTask$VoiceDetectListener.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = null;
          int i = EditorSmartClipTask$3.$SwitchMap$com$kwai$video$ksmemorykit$EditorSmartClipTask$EditorVoiceDetectStatus[this.this$0.mVoiceDetectStatus.ordinal()];
          if (i != 1 && i != 2) {
             if (i != 3) {
                if (i == 4) {
                   EditorSdk2$EditorSdkError uEditorSdkEr = new EditorSdk2$EditorSdkError();
                   uEditorSdkEr.setCode(-3);
                   uEditorSdkEr.setType(0x2712);
                   uEditorSdkEr.setMessage("EditorSmartClipTask Voice Detect error");
                   EditorSmartClipTask mListener = this.this$0.mListener;
                   if (mListener != null) {
                      mListener.onError(uEditorSdkEr);
                   }
                }
             }else {
                obj = this.this$0.getVEVoiceDetectResult(p0);
             }
          }else {
             this.this$0.mVoiceDetectCount.await();
             this.this$0.getVEVoiceDetectResult(p0);
             obj = this.this$0.getVEVoiceDetectResult(p0);
          }
       }catch(java.lang.Exception e0){
       }
       return obj;
    }
}
