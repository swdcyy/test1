package com.yxcorp.gifshow.media.watermark.d$a;
import com.kwai.video.editorsdk2.ExportEventListener;
import com.yxcorp.gifshow.media.watermark.d;
import java.lang.Object;
import com.kwai.video.editorsdk2.ExportTask;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.yxcorp.utility.Log;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$RenderRange;
import java.lang.StringBuilder;
import java.io.File;
import jv7.f;
import java.lang.Double;
import java.lang.Math;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.fragment.ProgressFragment;

public class d$a implements ExportEventListener	// class@001d2e
{
    public final d a;

    public void d$a(d p0){
       this.a = p0;
       super();
    }
    public void onCancelled(ExportTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "4")) {
          return;
       }
       this.a.d(p0);
       d$a ta = this.a;
       ta.b(ta.q);
       p0.release();
       this.a.j();
       return;
    }
    public void onError(ExportTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "3")) {
          return;
       }
       this.a.e(p0);
       d$a ta = this.a;
       ta.b(ta.q);
       p0.release();
       this.a.j();
       Log.g(this.a.a, "savePhotoMovie FrameRatePromote, download video error");
       return;
    }
    public void onFinished(ExportTask p0,EditorSdk2$RenderRange[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d$a.class, "1")) {
          return;
       }
       this.a.f(p0, p1);
       d$a ta = this.a;
       ta.b(ta.q);
       Log.g(this.a.a, "savePhotoMovie FrameRatePromote, download video success outputFile"+this.a.c.getAbsolutePath()+"--------------------");
       p0.release();
       this.a.j();
       return;
    }
    public void onNewFrame(ExportTask p0,double p1){
       f.a(this, p0, p1);
    }
    public void onProgress(ExportTask p0,double p1){
       d$a uoa = d$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Double.valueOf(p1), this, uoa, "2")) {
          return;
       }
       int i = Math.min((int)((80.00f * p1) + 20.00f), 100);
       d v = this.a.v;
       if (v != null && v.isAdded()) {
          this.a.v.Nh(i);
       }
       v = this.a.s;
       if (v != null) {
          v.onProgress(p0, p1);
       }
       Log.b(this.a.a, "savePhotoMovie FrameRatePromote, download video progress:"+i);
       return;
    }
}
