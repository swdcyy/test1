package com.kwai.video.ksmemorykit.EditorSmartClipTask$SmartClipDecoderListener;
import com.kwai.video.editorsdk2.kve.EditorKveDecoder$Listener;
import com.kwai.video.ksmemorykit.EditorSmartClipListener;
import java.lang.Object;
import com.kwai.kve.FrameResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.nio.ByteBuffer;
import com.kwai.video.editorsdk2.ExternalFilterDataFormatConfig$CpuDataFormat;
import android.graphics.Bitmap;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import com.kwai.kve.Rotation;
import com.kwai.video.ksmemorykit.EditorSmartClipTask;

public final class EditorSmartClipTask$SmartClipDecoderListener implements EditorKveDecoder$Listener	// class@0008fc
{
    public EditorSmartClipListener mListener;

    public void EditorSmartClipTask$SmartClipDecoderListener(EditorSmartClipListener p0){
       super();
       this.mListener = p0;
    }
    public void onGotFrame(FrameResult p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSmartClipTask$SmartClipDecoderListener.class, "1")) {
          return;
       }
       if (this.mListener != null) {
          this.mListener.onFrameResult(EditorSmartClipTask.rotaingImage(p0.getRotation(), EditorSdk2Utils.convertCpuDataFrameToBitmap(p0.getDecodeWidth(), p0.getDecodeHeight(), ExternalFilterDataFormatConfig$CpuDataFormat.CPU_DATA_FORMAT_I420.intValue(), p0.getFrameData(), p0.getLineSizes())));
       }
       return;
    }
}
