package com.kwai.video.ksmemorykit.EditorSmartClipTask$SmartClipFlashImageListener;
import com.kwai.kve.FlashImageCallback;
import com.kwai.video.ksmemorykit.EditorSmartClipListener;
import java.lang.Object;
import com.kwai.kve.MediaAsset;
import com.kwai.kve.FrameResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.nio.ByteBuffer;
import com.kwai.video.editorsdk2.ExternalFilterDataFormatConfig$CpuDataFormat;
import android.graphics.Bitmap;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import com.kwai.kve.Rotation;
import com.kwai.video.ksmemorykit.EditorSmartClipTask;

public final class EditorSmartClipTask$SmartClipFlashImageListener implements FlashImageCallback	// class@0008fd
{
    public EditorSmartClipListener mListener;

    public void EditorSmartClipTask$SmartClipFlashImageListener(EditorSmartClipListener p0){
       super();
       this.mListener = p0;
    }
    public void notice(MediaAsset p0,FrameResult p1,int p2){
       if (PatchProxy.isSupport(EditorSmartClipTask$SmartClipFlashImageListener.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, EditorSmartClipTask$SmartClipFlashImageListener.class, "1")) {
          return;
       }
       if (this.mListener != null) {
          this.mListener.onFlashImage(p0, EditorSmartClipTask.rotaingImage(p1.getRotation(), EditorSdk2Utils.convertCpuDataFrameToBitmap(p1.getDecodeWidth(), p1.getDecodeHeight(), ExternalFilterDataFormatConfig$CpuDataFormat.CPU_DATA_FORMAT_I420.intValue(), p1.getFrameData(), p1.getLineSizes())), p2);
       }
       return;
    }
}
