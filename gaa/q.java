package gaa.q;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import gaa.s;
import voc.i;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import m0d.l;
import android.graphics.Bitmap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import android.graphics.Bitmap$Config;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Paint;
import gaa.c;
import com.yxcorp.gifshow.util.BitmapUtil;
import java.io.File;
import java.lang.RuntimeException;
import cq.a;
import java.lang.Throwable;
import q87.c;
import gaa.o;
import java.lang.Runnable;
import ekd.k1;
import java.lang.StringBuilder;
import java.lang.Float;
import gaa.p;

public class q implements ImageCallback	// class@002447
{
    public final i b;
    public final s c;

    public void q(s p0,i p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onCompleted(Drawable p0){
       l.a(this, p0);
    }
    public void onCompletedBitmap(Bitmap p0){
       long l;
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "2")) {
          return;
       }
       try{
          l = System.currentTimeMillis();
          if (p0 != null && (!p0.isRecycled() && (p0.getWidth() > 0 && p0.getHeight() > 0))) {
             Bitmap uBitmap = Bitmap.createBitmap(64, 64, Bitmap$Config.ARGB_8888);
             new Canvas(uBitmap).drawBitmap(p0, new Rect(0, 0, (p0.getWidth() - 1), (p0.getHeight() - 1)), new RectF(0, 0, 63.00f, 63.00f), null);
             this.c.e = c.a(uBitmap, 0x3f000000, 1);
             this.c.f = c.a(uBitmap, 0x3f000000, 0);
             int width = p0.getWidth();
             int height = p0.getHeight();
             if (width > height) {
                p0 = BitmapUtil.o(p0, height, height);
             }else if(width < height){
                p0 = BitmapUtil.o(p0, width, width);
             }
             if (p0 != null) {
                this.c.k = c.b();
                BitmapUtil.O(p0, this.c.k, 100);
             }else {
                throw new RuntimeException("croppedBitmap is null");
             }
          }else {
             this.c.d();
          }
       }catch(java.lang.Exception e12){
          a.D().v("EditMusicDownloadDispatcher", "onCompletedBitmap fetch image error", e12);
          this.c.d();
       }
       k1.o(new o(this.b));
       Object[] objArray = new Object[0];
       a.D().w("EditMusicDownloadDispatcher", "onCompletedBitmap cost:"+k1.t(l), objArray);
       return;
    }
    public void onProgress(float p0){
       q oq = q.class;
       if (PatchProxy.isSupport(oq) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, oq, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("EditMusicDownloadDispatcher", "downloadMusicCover, progress:"+p0, objArray);
       k1.o(new p(this.b, p0));
       return;
    }
}
