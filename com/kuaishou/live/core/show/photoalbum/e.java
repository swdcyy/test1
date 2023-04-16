package com.kuaishou.live.core.show.photoalbum.e;
import java.lang.Runnable;
import com.kuaishou.live.core.show.photoalbum.LiveEntryCoverSelectSupplier;
import android.net.Uri;
import java.lang.Object;
import java.util.Objects;
import java.lang.String;
import java.io.File;
import ekd.w0;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.drawee.backends.pipeline.Fresco;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.util.BitmapUtil;
import fd2.b;
import n3d.a;
import android.content.Context;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;
import java.lang.StringBuilder;

public final class e implements Runnable	// class@000d71
{
    public final LiveEntryCoverSelectSupplier b;
    public final Uri c;

    public void e(LiveEntryCoverSelectSupplier p0,Uri p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       boolean b;
       Bitmap uBitmap1;
       e tb = this.b;
       e tc = this.c;
       Objects.requireNonNull(tb);
       if (tc != null && tb.a != null) {
          String path = tc.getPath();
          if (path != null) {
             Fresco.getImagePipeline().evictFromCache(w0.c(tb.g));
             b = false;
             Bitmap uBitmap = BitmapUtil.t(path, 1280, 1280, b);
             if (uBitmap != null) {
                int width = uBitmap.getWidth();
                int height = uBitmap.getHeight();
                if (width >= height) {
                   tb.g(tc, 258, false, width, height, new b(tb));
                }else if((height * 9) > (width * 16)){
                   int i = (uBitmap.getWidth() * 16) / 9;
                   uBitmap1 = Bitmap.createBitmap(uBitmap, b, ((height / 2) - (i / 2)), width, i);
                }else {
                   uBitmap1 = Bitmap.createBitmap(uBitmap, b, b, width, height);
                }
                try{
                   BitmapUtil.P(tb.a, uBitmap1, tb.g.getAbsolutePath(), 85);
                }catch(java.io.IOException e1){
                   b.I(LiveLogTag.LIVE_ENTRY_COVER, "LiveCoverSelectSupplierFailed to save cover file", e1);
                }
                tb.g(Uri.fromFile(tb.g), 258, false, width, height, new b(tb));
             }
          }else {
             b.B(LiveLogTag.LIVE_ENTRY_COVER, "LiveCoverSelectSuppliercover uri="+tc.getPath());
          }
       }
       return;
    }
}
