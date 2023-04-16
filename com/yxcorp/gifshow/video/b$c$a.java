package com.yxcorp.gifshow.video.b$c$a;
import com.kwai.video.editorsdk2.ExportEventListener;
import com.yxcorp.gifshow.video.b$c;
import com.yxcorp.gifshow.video.c$c;
import java.lang.Object;
import com.kwai.video.editorsdk2.ExportTask;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.video.c$e;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$RenderRange;
import com.yxcorp.gifshow.video.c$f;
import com.yxcorp.gifshow.video.b$d;
import jv7.f;
import java.lang.Double;

public class b$c$a implements ExportEventListener	// class@00168b
{
    public final c$c a;
    public final b$c b;

    public void b$c$a(b$c p0,c$c p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onCancelled(ExportTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$c$a.class, "4")) {
          return;
       }
       this.a.a(this.b);
       return;
    }
    public void onError(ExportTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$c$a.class, "3")) {
          return;
       }
       this.a.a(this.b);
       return;
    }
    public void onFinished(ExportTask p0,EditorSdk2$RenderRange[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b$c$a.class, "1")) {
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
    public void onProgress(ExportTask p0,double p1){
       b$c$a uoc$a = b$c$a.class;
       if (PatchProxy.isSupport(uoc$a) && PatchProxy.applyVoidTwoRefs(p0, Double.valueOf(p1), this, uoc$a, "2")) {
          return;
       }
       this.a.b(this.b, p1);
       return;
    }
}
