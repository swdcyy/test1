package com.yxcorp.gifshow.photo.download.task.r;
import java.lang.Runnable;
import android.util.Pair;
import com.yxcorp.gifshow.entity.QPhoto;
import java.io.File;
import com.yxcorp.gifshow.photo.download.model.StatModel;
import exb.b;
import java.lang.Object;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.photo.download.task.s;
import android.app.Application;
import o56.a;
import java.lang.String;
import android.content.Context;
import com.yxcorp.gifshow.media.util.c;
import o56.c;
import jxb.a;
import com.yxcorp.plugin.kwaitoken.KwaiToken;
import ixb.e0;
import com.kwai.video.videoprocessor.JpegBuilderException;
import ekd.k1;
import ywb.e;
import java.lang.Exception;
import q87.c;

public final class r implements Runnable	// class@000f16
{
    public final Pair b;
    public final QPhoto c;
    public final File d;
    public final StatModel e;
    public final b f;

    public void r(Pair p0,QPhoto p1,File p2,StatModel p3,b p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void run(){
       Bitmap uBitmap;
       r tb = this.b;
       r tc = this.c;
       r td = this.d;
       r te = this.e;
       Pair first = tb.first;
       Pair second = tb.second;
       if (second.getHeight() == 1) {
          second.recycle();
          uBitmap = s.o(first, tc);
       }else {
          uBitmap = s.f(first, second, tc);
       }
       Bitmap uBitmap1 = uBitmap;
       boolean b = false;
       try{
          c.d("feed_image_download", a.b(), uBitmap1, uBitmap1.getWidth(), uBitmap1.getHeight(), 100, td.getAbsolutePath(), true);
          a.c(a.a().f(), td);
          te.mIsNetDownload = b;
          KwaiToken.k().F1(td.getName());
       }catch(com.kwai.video.videoprocessor.JpegBuilderException e1){
          k1.o(new e0(this.f, e1));
          Object[] objArray = new Object[b];
          e.C().t("ImageDownloadTask", e1.getMessage(), objArray);
       }
       return;
    }
}
