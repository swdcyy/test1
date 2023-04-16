package com.yxcorp.gifshow.media.watermark.d$b;
import com.kwai.video.editorsdk2.ExportEventListener;
import com.yxcorp.gifshow.media.watermark.d;
import java.lang.Object;
import com.kwai.video.editorsdk2.ExportTask;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$RenderRange;
import jv7.f;
import java.lang.Double;
import androidx.fragment.app.Fragment;
import java.lang.Math;
import com.yxcorp.gifshow.fragment.ProgressFragment;

public class d$b implements ExportEventListener	// class@001d2f
{
    public final d a;

    public void d$b(d p0){
       this.a = p0;
       super();
    }
    public void onCancelled(ExportTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$b.class, "4")) {
          return;
       }
       this.a.d(p0);
       this.a.k(p0);
       this.a.j();
       return;
    }
    public void onError(ExportTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$b.class, "3")) {
          return;
       }
       this.a.e(p0);
       this.a.k(p0);
       this.a.j();
       return;
    }
    public void onFinished(ExportTask p0,EditorSdk2$RenderRange[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d$b.class, "1")) {
          return;
       }
       this.a.f(p0, p1);
       this.a.k(p0);
       this.a.j();
       return;
    }
    public void onNewFrame(ExportTask p0,double p1){
       f.a(this, p0, p1);
    }
    public void onProgress(ExportTask p0,double p1){
       d$b uob = d$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Double.valueOf(p1), this, uob, "2")) {
          return;
       }
       d v = this.a.v;
       if (v != null && v.isAdded()) {
          this.a.v.Nh((int)Math.min(100.00f, (p1 * 100.00f)));
       }
       v = this.a.s;
       if (v != null) {
          v.onProgress(p0, p1);
       }
       return;
    }
}
