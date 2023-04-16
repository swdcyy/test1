package com.yxcorp.gifshow.media.util.f;
import com.kwai.video.editorsdk2.ExportEventListener;
import com.yxcorp.gifshow.media.util.g;
import brd.v;
import java.lang.String;
import java.lang.Object;
import com.kwai.video.editorsdk2.ExportTask;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import hxc.a;
import ekd.k1;
import ykd.a;
import q87.c;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$EditorSdkError;
import java.lang.StringBuilder;
import java.io.IOException;
import java.lang.Throwable;
import brd.g;
import java.lang.RuntimeException;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$RenderRange;
import android.util.Pair;
import java.io.File;
import java.lang.Float;
import jv7.f;
import java.lang.Double;

public class f implements ExportEventListener	// class@001d23
{
    public final v a;
    public final String b;
    public final String c;
    public final g d;

    public void f(g p0,v p1,String p2,String p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void onCancelled(ExportTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "4")) {
          return;
       }
       g a = this.d.a;
       if (a != null) {
          a.g = 9;
          a.e = k1.t(a.j);
       }
       g.e(p0);
       Object[] objArray = new Object[0];
       a.C().w(g.b, "FrameRatePromote re export high frame rate video cancel!", objArray);
       return;
    }
    public void onError(ExportTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "3")) {
          return;
       }
       g a = this.d.a;
       if (a != null) {
          a.g = 8;
          a.e = k1.t(a.j);
       }
       EditorSdk2$EditorSdkError error = p0.getError();
       Object[] objArray = new Object[0];
       a.C().t(g.b, "adjustFrameRate FrameRatePromote export error inputFile:"+this.c+",errorCode:"+error.code()+",errorMessage:"+error.message()+",errorType:"+error.type(), objArray);
       if (error.code() == -28) {
          this.a.onError(new IOException("No space left on device"));
          return;
       }else {
          this.a.onError(new RuntimeException("adjust frame rate export error!"));
          g.e(p0);
          return;
       }
    }
    public void onFinished(ExportTask p0,EditorSdk2$RenderRange[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f.class, "1")) {
          return;
       }
       g a = this.d.a;
       if (a != null) {
          a.g = 7;
          a.e = k1.t(a.j);
       }
       this.a.onNext(new Pair(new File(this.b), Float.valueOf(0x3f800000)));
       this.a.onComplete();
       g.e(p0);
       Object[] objArray = new Object[0];
       a.C().w(g.b, "adjustFrameRate FrameRatePromote export finished outputFile:"+this.b, objArray);
       return;
    }
    public void onNewFrame(ExportTask p0,double p1){
       f.a(this, p0, p1);
    }
    public void onProgress(ExportTask p0,double p1){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(p0, Double.valueOf(p1), this, uof, "2")) {
          return;
       }
       this.a.onNext(new Pair(null, Float.valueOf((float)p1)));
       return;
    }
}
