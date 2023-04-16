package gaa.c;
import com.kwai.feature.post.api.core.model.EditCoverConfiguration;
import java.lang.Object;
import android.graphics.Bitmap;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Boolean;
import java.lang.String;
import java.lang.Number;
import cq.a;
import java.lang.StringBuilder;
import q87.c;
import wba.d$a;
import wba.d;
import kotlin.jvm.internal.a;
import java.lang.System;
import java.io.File;
import com.yxcorp.gifshow.util.PostUtils;
import qkd.b;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.android.model.mix.ImageMeta$Atlas;
import com.kuaishou.android.model.mix.ImageMeta$SinglePicture;
import com.kuaishou.android.model.mix.CoverMeta;
import yb7.a;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.ImageMeta;
import kp.r1;
import java.util.List;
import com.kuaishou.android.model.mix.ImageMetaExt;
import java.util.Collection;
import ekd.q;
import java.lang.IllegalStateException;
import java.lang.Throwable;

public class c	// class@002429
{
    public static final EditCoverConfiguration a;

    static {
       c.a = new EditCoverConfiguration(0x3f847ae147ae147b, true);
    }
    public void c(){
       super();
    }
    public static int a(Bitmap p0,float p1,boolean p2){
       d$a obj;
       String str3;
       String str4;
       float f2;
       int i3;
       Bitmap uBitmap = p0;
       float f = p1;
       int b = p2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(c.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Float.valueOf(p1), Boolean.valueOf(p2), null, c.class, "1");
          if (obj != patchProxyRe) {
             return obj.intValue();
          }
       }
       float f1 = 64.00f * f;
       Object[] objArray = new Object[0];
       a.D().w("DownloadSourceUtils", "computeColor ratio:"+f+",fromTop:"+b+",bitmapHeight:"+p0.getHeight()+",bitmapWidth:"+p0.getWidth()+",middle:"+f1, objArray);
       obj = new d$a();
       double d = 0;
       double d1 = d;
       double d2 = d1;
       double d3 = d2;
       int i = 0;
       int i1 = 0;
       while (i < 64) {
          StringBuilder str = "is zero";
          String str1 = ",y:";
          PatchProxyResult patchProxyRe1 = patchProxyRe;
          String str2 = "computeColor x:";
          if (b) {
             double d4 = d2;
             b = 0;
             while ((float)b - f1 < 0) {
                int pixel = uBitmap.getPixel(i, b);
                if (!pixel) {
                   str3 = str1;
                   str4 = str;
                   Object[] objArray1 = new Object[0];
                   a.D().w("DownloadSourceUtils", str2+i+str1+b+str, objArray1);
                }else {
                   str3 = str1;
                   str4 = str;
                   i1 = i1 + 1;
                   d.c(pixel, obj);
                   d = d + (double)obj.a();
                   d1 = d1 + (double)obj.d();
                   d4 = d4 + (double)obj.c();
                   d3 = d3 + (double)obj.b();
                }
                b = b + 1;
                str = str4;
                str1 = str3;
             }
             d2 = d4;
          }else {
             str3 = str1;
             str4 = str;
             int i2 = (int)f1;
             str = 64;
             while (i2 < str) {
                b = uBitmap.getPixel(i, i2);
                if (!b) {
                   f2 = f1;
                   Object[] objArray2 = new Object[0];
                   a.D().w("DownloadSourceUtils", str2+i+str3+i2+str4, objArray2);
                }else {
                   f2 = f1;
                   i1 = i1 + 1;
                   d.c(b, obj);
                   d = d + (double)obj.a();
                   d1 = d1 + (double)obj.d();
                   d2 = d2 + (double)obj.c();
                   d3 = d3 + (double)obj.b();
                }
                i2 = i2 + 1;
                str = 64;
                uBitmap = p0;
                f1 = f2;
             }
          }
          i = i + 1;
          uBitmap = p0;
          b = p2;
          patchProxyRe = patchProxyRe1;
          f1 = f1;
          str1 = null;
       }
       double d5 = (double)i1;
       obj.e((float)(d / d5));
       obj.h((float)(d1 / d5));
       obj.g((float)(d2 / d5));
       obj.f((float)(d3 / d5));
       Object obj1 = PatchProxy.applyOneRefs(obj, null, d.class, "11");
       if (obj1 != patchProxyRe) {
          i3 = obj1.intValue();
       }else {
          a.p(obj, "argb");
          i3 = (int)obj.b() | ((((int)obj.a() << 24) | ((int)obj.d() << 16)) | ((int)obj.c() << 8));
       }
       return i3;
    }
    public static String b(){
       Object obj = PatchProxy.apply(null, null, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       File uFile = new File(PostUtils.f(), "MUSIC_RECREATION_COVER_"+System.currentTimeMillis()+".png");
       b.q(uFile);
       return uFile.getAbsolutePath();
    }
    public static CDNUrl[] c(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.getAtlasInfo() != null) {
          return p0.getAtlasMusicCdn();
       }
       if (p0.getSinglePicture() != null) {
          return p0.getSinglePictureMusicCdn();
       }
       if (p0.isKtvSong()) {
          return p0.getKtvMusicCdn();
       }
       return null;
    }
    public static CDNUrl[] d(QPhoto p0){
       CoverMeta obj = PatchProxy.applyOneRefs(p0, null, c.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.getCoverMeta();
       if (obj != null && !a.c(obj.mCoverUrls)) {
          return obj.mCoverUrls;
       }
       List singlePictur = ImageMetaExt.getSinglePicturePhotoCdn(r1.W0(p0.mEntity));
       if (q.f(singlePictur)) {
          PostUtils.D("DownloadSourceUtils", "getSinglePictureUrls", new IllegalStateException("empty coverUrls and singlePicturePhotoCdn: photoId:"+p0.getPhotoId()));
          return obj.mCoverThumbnailUrls;
       }else {
          CDNUrl[] uCDNUrlArray = new CDNUrl[singlePictur.size()];
          return singlePictur.toArray(uCDNUrlArray);
       }
    }
}
