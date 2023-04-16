package com.yxcorp.gifshow.encode.r0;
import com.kwai.video.videoprocessor.JpegBuilderEventListener;
import brd.v;
import java.io.File;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import gq.a;
import q87.c;
import com.kwai.video.videoprocessor.JpegBuilderException;
import java.lang.StringBuilder;
import java.lang.Exception;
import java.lang.Throwable;
import com.yxcorp.gifshow.postwork.PostWorkErrorTips$NoSpaceLeftException;
import brd.g;
import java.lang.RuntimeException;
import pca.r1;
import java.lang.Runnable;
import am8.d;
import java.lang.Double;
import android.util.Pair;
import java.lang.Float;

public class r0 implements JpegBuilderEventListener	// class@000d48
{
    public final v a;
    public final File b;
    public final File c;

    public void r0(v p0,File p1,File p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void onCancelled(){
       if (PatchProxy.applyVoid(null, this, r0.class, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("EncodingUtils", "cancelled", objArray);
       if (this.c.exists()) {
          this.c.delete();
       }
       return;
    }
    public void onError(JpegBuilderException p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r0.class, "2")) {
          return;
       }
       String str = "buildLongPictureFile failed: "+p0.getMessage();
       a.D().z("EncodingUtils", "error", p0);
       if (p0.retcode == -30007) {
          this.a.onError(new PostWorkErrorTips$NoSpaceLeftException(str));
          return;
       }else {
          this.a.onError(new RuntimeException(str));
          return;
       }
    }
    public void onFinished(){
       if (PatchProxy.applyVoid(null, this, r0.class, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("EncodingUtils", "finished", objArray);
       d.d(new r1(this.b, this.c, this.a), "EncodingUtils", 0);
       return;
    }
    public void onProgress(double p0){
       r0 or0 = r0.class;
       if (PatchProxy.isSupport(or0) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, or0, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("EncodingUtils", "±£´æ½ø¶È: "+p0, objArray);
       this.a.onNext(new Pair(null, Float.valueOf(((float)p0 * 0.01f))));
       return;
    }
}
