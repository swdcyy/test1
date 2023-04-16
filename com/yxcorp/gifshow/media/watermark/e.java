package com.yxcorp.gifshow.media.watermark.e;
import com.kwai.video.editorsdk2.ExportEventListener;
import com.yxcorp.gifshow.media.watermark.VideoWatermarkTask;
import java.lang.Object;
import com.kwai.video.editorsdk2.ExportTask;
import com.yxcorp.gifshow.media.watermark.VideoWatermarkTask$TaskState;
import com.yxcorp.gifshow.media.watermark.VideoWatermarkTask$a;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$RenderRange;
import jv7.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Double;
import java.lang.String;
import java.lang.Math;

public class e implements ExportEventListener	// class@001d33
{
    public final VideoWatermarkTask a;

    public void e(VideoWatermarkTask p0){
       this.a = p0;
       super();
    }
    public void onCancelled(ExportTask p0){
       p0.a = VideoWatermarkTask$TaskState.CANCEL;
    }
    public void onError(ExportTask p0){
       VideoWatermarkTask m = this.a.m;
       m.a = VideoWatermarkTask$TaskState.ERROR;
       m.b = 0;
    }
    public void onFinished(ExportTask p0,EditorSdk2$RenderRange[] p1){
       VideoWatermarkTask m = this.a.m;
       m.a = VideoWatermarkTask$TaskState.FINISH;
       m.b = 100;
    }
    public void onNewFrame(ExportTask p0,double p1){
       f.a(this, p0, p1);
    }
    public void onProgress(ExportTask p0,double p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(p0, Double.valueOf(p1), this, uoe, "1")) {
          return;
       }
       VideoWatermarkTask m = this.a.m;
       m.a = VideoWatermarkTask$TaskState.PROGRESS;
       m.b = (int)Math.min(100.00f, (p1 * 100.00f));
       return;
    }
}
