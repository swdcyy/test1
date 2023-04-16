package gaa.v0;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import gaa.w0;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import m0d.l;
import android.graphics.Bitmap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import o56.c;
import o56.a;
import xf6.g;
import android.graphics.Bitmap$Config;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Paint;
import gaa.c;
import java.lang.Exception;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import gaa.u0;
import java.lang.Runnable;
import ekd.k1;
import cq.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Float;

public class v0 implements ImageCallback	// class@002450
{
    public final w0 b;

    public void v0(w0 p0){
       this.b = p0;
       super();
    }
    public void onCompleted(Drawable p0){
       l.a(this, p0);
    }
    public void onCompletedBitmap(Bitmap p0){
       int i;
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, v0.class, "2")) {
          return;
       }
       long l = System.currentTimeMillis();
       try{
          i = 0;
          v0 tb = this.b;
          Objects.requireNonNull(tb);
          Bitmap obj = PatchProxy.apply(null, tb, w0.class, "10");
          int i1 = 1;
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(a.a().c() && g.E0()){
             b = true;
          }else {
             b = false;
          }
          if (!b) {
             if (p0 != null && (!p0.isRecycled() && (p0.getWidth() > 0 && p0.getHeight() > 0))) {
                obj = Bitmap.createBitmap(64, 64, Bitmap$Config.ARGB_8888);
                new Canvas(obj).drawBitmap(p0, new Rect(i, i, (p0.getWidth() - i1), (p0.getHeight() - i1)), new RectF(0, 0, 63.00f, 63.00f), null);
                float f = 0x3f000000;
                p0.i = c.a(obj, f, i1);
                p0.j = c.a(obj, f, i);
             }
          }else {
             throw new Exception("EditSourcePhotoDownloadDispatcher fetch manual error");
          }
       }catch(java.lang.Exception e13){
          PostUtils.D("EditSourcePhotoDownloadDispatcher", "onCompletedBitmap fetch image error", e13);
       }
    label_009d :
       k1.o(new u0(this));
       Object[] objArray = new Object[i];
       a.D().w("EditSourcePhotoDownloadDispatcher", "computeColor cost:"+k1.t(l), objArray);
       return;
    }
    public void onProgress(float p0){
       v0 ov0 = v0.class;
       if (PatchProxy.isSupport(ov0) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, ov0, "1")) {
          return;
       }
       a uoa = a.D();
       Object[] objArray = new Object[0];
       uoa.w("EditSourcePhotoDownloadDispatcher", "fetchImg, progress:"+p0, objArray);
       ov0 = this.b;
       ov0.l = p0;
       ov0.d((int)ov0.k, ov0.m, true);
       return;
    }
}
