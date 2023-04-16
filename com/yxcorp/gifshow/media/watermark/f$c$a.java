package com.yxcorp.gifshow.media.watermark.f$c$a;
import com.kwai.video.editorsdk2.ExportEventListener;
import com.yxcorp.gifshow.media.watermark.f$c;
import com.yxcorp.gifshow.video.c$c;
import java.lang.Object;
import com.kwai.video.editorsdk2.ExportTask;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.video.b$c;
import com.yxcorp.gifshow.video.c$e;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$RenderRange;
import com.yxcorp.gifshow.video.c$f;
import com.yxcorp.gifshow.video.b$d;
import jv7.f;
import java.lang.Double;

public class f$c$a implements ExportEventListener	// class@001d36
{
    public final c$c a;
    public final f$c b;

    public void f$c$a(f$c p0,c$c p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onCancelled(ExportTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$c$a.class, "4")) {
          return;
       }
       this.a.f(new b$c(p0));
       return;
    }
    public void onError(ExportTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$c$a.class, "3")) {
          return;
       }
       this.a.a(new b$c(p0));
       return;
    }
    public void onFinished(ExportTask p0,EditorSdk2$RenderRange[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f$c$a.class, "1")) {
          return;
       }
       c$f[] uofArray = new c$f[p1.length];
       for (int i = 0; i < p1.length; i = i + 1) {
          uofArray[i] = new b$d(p1[i]);
       }
       this.a.e(new b$c(p0), uofArray);
       return;
    }
    public void onNewFrame(ExportTask p0,double p1){
       f.a(this, p0, p1);
    }
    public void onProgress(ExportTask p0,double p1){
       f$c$a uoc$a = f$c$a.class;
       if (PatchProxy.isSupport(uoc$a) && PatchProxy.applyVoidTwoRefs(p0, Double.valueOf(p1), this, uoc$a, "2")) {
          return;
       }
       this.a.b(new b$c(p0), p1);
       return;
    }
}
