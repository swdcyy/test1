package com.yxcorp.gifshow.video.b$c$b;
import com.kwai.video.editorsdk2.ExportEventListenerV2;
import com.yxcorp.gifshow.video.b$c;
import com.yxcorp.gifshow.video.c$b;
import java.lang.Object;
import com.kwai.video.editorsdk2.ExportTask;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.video.c$e;
import com.yxcorp.gifshow.video.c$c;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$RenderRange;
import com.yxcorp.gifshow.video.c$f;
import com.yxcorp.gifshow.video.b$d;
import com.kwai.video.editorsdk2.ExportEventListener;
import jv7.f;
import com.kwai.video.editorsdk2.ExportedPipelineTempFilesState;
import jv7.g;
import java.lang.Double;
import com.kwai.video.editorsdk2.EncodedSegmentInfo;
import com.yxcorp.gifshow.video.b$a;
import com.yxcorp.gifshow.video.c$a;

public class b$c$b implements ExportEventListenerV2	// class@00168c
{
    public final c$b a;
    public final b$c b;

    public void b$c$b(b$c p0,c$b p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onCancelled(ExportTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$c$b.class, "4")) {
          return;
       }
       this.a.a(this.b);
       return;
    }
    public void onError(ExportTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$c$b.class, "3")) {
          return;
       }
       this.a.a(this.b);
       return;
    }
    public void onFinished(ExportTask p0,EditorSdk2$RenderRange[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b$c$b.class, "1")) {
          return;
       }
       c$f[] uofArray = new c$f[p1.length];
       for (int i = 0; i < p1.length; i = i + 1) {
          uofArray[i] = new b$d(p1[i]);
       }
       this.a.e(this.b, uofArray);
       return;
    }
    public void onNewFrame(ExportTask p0,double p1){
       f.a(this, p0, p1);
    }
    public void onPipelineTemporaryFileParsed(ExportTask p0,ExportedPipelineTempFilesState p1){
       g.a(this, p0, p1);
    }
    public void onProgress(ExportTask p0,double p1){
       b$c$b uoc$b = b$c$b.class;
       if (PatchProxy.isSupport(uoc$b) && PatchProxy.applyVoidTwoRefs(p0, Double.valueOf(p1), this, uoc$b, "2")) {
          return;
       }
       this.a.b(this.b, p1);
       return;
    }
    public void onSegmentEncoded(ExportTask p0,EncodedSegmentInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b$c$b.class, "5")) {
          return;
       }
       this.a.c(this.b, new b$a(p1));
       return;
    }
}
