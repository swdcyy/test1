package gaa.l0;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import gaa.h0;
import voc.i;
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
import gaa.j0;
import java.lang.Runnable;
import ekd.k1;
import cq.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Float;
import gaa.k0;

public class l0 implements ImageCallback	// class@00243c
{
    public final i b;
    public final h0 c;

    public void l0(h0 p0,i p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onCompleted(Drawable p0){
       l.a(this, p0);
    }
    public void onCompletedBitmap(Bitmap p0){
       int i;
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, l0.class, "2")) {
          return;
       }
       long l = System.currentTimeMillis();
       try{
          i = 0;
          l0 tc = this.c;
          Objects.requireNonNull(tc);
          Bitmap obj = PatchProxy.apply(null, tc, h0.class, "15");
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
                p0.j = c.a(obj, f, i1);
                p0.k = c.a(obj, f, i);
             }
          }else {
             throw new Exception("EditSourcePhotoDownloadDispatcher fetch manual error");
          }
       }catch(java.lang.Exception e13){
          PostUtils.D("EditSourcePictureDownloadDispatcher", "onCompletedBitmap fetch image error", e13);
       }
    label_009d :
       k1.o(new j0(this.b));
       Object[] objArray = new Object[i];
       a.D().w("EditSourcePictureDownloadDispatcher", "computeColor cost:"+k1.t(l), objArray);
       return;
    }
    public void onProgress(float p0){
       l0 ol0 = l0.class;
       if (PatchProxy.isSupport(ol0) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, ol0, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("EditSourcePictureDownloadDispatcher", "fetchImg, progress:"+p0, objArray);
       k1.o(new k0(this.b, p0));
       return;
    }
}
