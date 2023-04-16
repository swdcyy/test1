package cxb.l;
import java.util.concurrent.Callable;
import java.lang.String;
import com.facebook.imagepipeline.request.ImageRequest;
import java.lang.Object;
import ywb.e;
import java.lang.StringBuilder;
import q87.c;
import java.io.File;
import java.lang.System;
import android.graphics.Bitmap;
import wb5.c;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.gifshow.media.util.c;
import qkd.b;

public final class l implements Callable	// class@002097
{
    public final int b;
    public final String c;
    public final ImageRequest[] d;

    public void l(int p0,String p1,ImageRequest[] p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object call(){
       l tc = this.c;
       l td = this.d;
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "RxPhotoDownloader";
       e.C().w(str, "downloadMultiImagePhotoToVideo: i="+this.b+" des="+tc, objArray);
       File uFile = new File(tc);
       if (uFile.isFile()) {
          Object[] objArray1 = new Object[i];
          e.C().w(str, "downloadMultiImagePhotoToVideo: hit cache "+tc, objArray1);
       }else {
          String str1 = tc+"_"+System.currentTimeMillis()+".jpg";
          Bitmap uBitmap = c.a(td);
          if (uBitmap == null) {
             tc = "";
          }else {
             c.f("feed_image_download", a.b(), uBitmap, uBitmap.getWidth(), uBitmap.getHeight(), 100, str1, true);
             uBitmap.recycle();
             b.k0(new File(str1), uFile);
          }
       }
       return tc;
    }
}
