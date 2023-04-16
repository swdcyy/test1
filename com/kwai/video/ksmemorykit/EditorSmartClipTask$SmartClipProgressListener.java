package com.kwai.video.ksmemorykit.EditorSmartClipTask$SmartClipProgressListener;
import com.kwai.kve.ProgressCallback;
import com.kwai.video.ksmemorykit.EditorSmartClipListener;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;

public final class EditorSmartClipTask$SmartClipProgressListener implements ProgressCallback	// class@0008fe
{
    public EditorSmartClipListener mListener;

    public void EditorSmartClipTask$SmartClipProgressListener(EditorSmartClipListener p0){
       super();
       this.mListener = p0;
    }
    public void update(float p0,String p1){
       EditorSmartClipTask$SmartClipProgressListener smartClipPro = EditorSmartClipTask$SmartClipProgressListener.class;
       if (PatchProxy.isSupport(smartClipPro) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), p1, this, smartClipPro, "1")) {
          return;
       }
       EditorSmartClipTask$SmartClipProgressListener tmListener = this.mListener;
       if (tmListener != null) {
          tmListener.onProgress((double)p0);
       }
       return;
    }
}
