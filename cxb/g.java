package cxb.g;
import erd.o;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;
import java.lang.Object;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import cxb.n;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import brd.t;
import ywb.e;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.photo.download.utils.DownloadError;
import java.lang.Throwable;
import java.io.File;
import java.lang.Integer;
import java.util.List;
import java.util.ArrayList;
import java.lang.System;
import com.kuaishou.android.model.mix.CoverMeta;
import jp.a;
import jd.c;
import com.facebook.imagepipeline.request.ImageRequest;
import wb5.b;
import com.yxcorp.gifshow.model.CDNUrl;
import wb5.d;
import wkd.b;
import j80.c;
import cxb.l;
import java.util.concurrent.Callable;
import t45.d;
import brd.z;
import cxb.j;
import java.lang.Iterable;
import cxb.h;
import cxb.k;

public final class g implements o	// class@002092
{
    public final QPhoto b;
    public final String c;
    public final float d;

    public void g(QPhoto p0,String p1,float p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object apply(Object p0){
       t ot;
       Object[] objArray1;
       ImageRequest[] imageRequest;
       String str1;
       g og = this;
       g b = og.b;
       g c = og.c;
       g d = og.d;
       if (PatchProxy.isSupport(n.class)) {
          ot = PatchProxy.applyThreeRefs(b, c, Float.valueOf(d), null, n.class, "3");
          if (ot != PatchProxyResult.class) {
          }else {
          label_002b :
             int i = 0;
             Object[] objArray = new Object[i];
             e.C().s("RxPhotoDownloader", "downloadMultiImagePhotoToVideo qPhoto = ["+b.getPhotoId()+"], saveTo = ["+c+"]", objArray);
             int i1 = 2;
             if (!b.isImageType()) {
                ot = t.error(new DownloadError(i1));
             }else if(new File(c).isFile()){
                objArray1 = new Object[i];
                e.C().w("RxPhotoDownloader", "downloadMultiImagePhotoToVideo: hit cache for "+c, objArray1);
                ot = t.just(Integer.valueOf(100));
             }else {
                CoverMeta uCoverMeta = 1;
                int i2 = (b.isAtlasPhotos() || b.isLongPhotos())? b.getAtlasList().size(): 1;
                ArrayList uArrayList = new ArrayList();
                long l = System.currentTimeMillis();
                int i3 = 0;
                while (true) {
                   if (i3 < i2) {
                      c uoc = null;
                      if (i2 == uCoverMeta) {
                         uCoverMeta = b.getCoverMeta();
                         if (uCoverMeta != null) {
                            imageRequest = b.a(uCoverMeta, a.b, uoc);
                            if (imageRequest == null) {
                               Object[] objArray2 = new Object[i];
                               e.C().t("RxPhotoDownloader", "downloadMultiImagePhotoToVideo: cant generate requests ", objArray2);
                               throw new DownloadError(2);
                            }
                         }else {
                            objArray1 = new Object[i];
                            e.C().t("RxPhotoDownloader", "downloadMultiImagePhotoToVideo: no coverMeta", objArray1);
                            throw new DownloadError(i1);
                         }
                      }else {
                         CDNUrl[] uCDNUrlArray = new CDNUrl[i];
                         imageRequest = d.b(b.getAtlasPhotosCdn(i3).toArray(uCDNUrlArray));
                         if (imageRequest.length < 1) {
                            Object[] objArray3 = new Object[i];
                            e.C().t("RxPhotoDownloader", "downloadMultiImagePhotoToVideo: cant build request qPhoto="+b.getPhotoId()+" idx="+i3, objArray3);
                         label_018b :
                            i3 = i3 + 1;
                            i1 = 2;
                            i = null;
                            uCoverMeta = 1;
                         }
                      }
                      String str = String.valueOf(l);
                      if (PatchProxy.isSupport(n.class)) {
                         str1 = PatchProxy.applyTwoRefs(str, Integer.valueOf(i3), null, n.class, "5");
                         if (str1 != PatchProxyResult.class) {
                         label_0179 :
                            uArrayList.add(t.fromCallable(new l(i3, str1, imageRequest)).subscribeOn(d.c));
                            goto label_018b ;
                         }
                      }
                      str1 = new File(b.a(-1504323719).o(), str+"_"+i3+".jpg").getAbsolutePath();
                      goto label_0179 ;
                   }else {
                      ot = t.zip(uArrayList, j.b).flatMap(new h(c, d)).map(k.b);
                      break ;
                   }
                }
             }
          }
       }else {
          goto label_002b ;
       }
       return ot;
    }
}
