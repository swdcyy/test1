package com.yxcorp.gifshow.share.util.PhotoForward$DefaultImpls;
import com.yxcorp.gifshow.share.util.PhotoForward;
import com.yxcorp.gifshow.share.OperationModel;
import brd.t;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.share.util.PhotoForward$DefaultImpls$a;
import java.util.concurrent.Callable;
import t45.d;
import brd.z;
import io.reactivex.android.schedulers.a;
import java.lang.IllegalArgumentException;
import android.graphics.Bitmap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import msd.p;
import java.lang.Boolean;
import com.yxcorp.gifshow.model.SharePlatformData$ShareConfig;
import com.yxcorp.gifshow.share.util.PhotoForward$DefaultImpls$b;
import com.yxcorp.gifshow.share.util.PhotoForward$DefaultImpls$c;
import erd.o;
import com.yxcorp.gifshow.share.util.PhotoForward$downloadImageOrVideo$1;
import com.yxcorp.gifshow.share.util.PhotoForward$DefaultImpls$d;
import com.yxcorp.gifshow.share.util.PhotoForward$DefaultImpls$e;
import com.yxcorp.gifshow.share.util.PhotoForward$DefaultImpls$f;
import com.yxcorp.gifshow.share.util.PhotoForward$DefaultImpls$g;
import com.yxcorp.gifshow.share.util.PhotoForward$DefaultImpls$h;
import com.yxcorp.gifshow.share.util.PhotoForward$DefaultImpls$i;
import com.yxcorp.gifshow.share.util.PhotoForward$DefaultImpls$j;
import yic.n0;
import kp.r1;
import java.util.ArrayList;
import com.kuaishou.android.model.mix.ImageMeta;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.android.model.mix.ImageMetaExt;
import yic.v;
import com.yxcorp.gifshow.share.OperationModel$Type;
import android.content.res.Resources;
import lnc.a1;
import android.graphics.BitmapFactory;
import lnc.v4;
import com.kuaishou.android.model.mix.w;
import com.yxcorp.utility.TextUtils;
import jp.a;
import java.lang.Integer;
import com.kuaishou.android.model.mix.CoverMeta;
import jd.c;
import com.facebook.imagepipeline.request.ImageRequest;
import wb5.b;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import uc.d;
import com.yxcorp.image.fresco.wrapper.c;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import com.yxcorp.image.fresco.wrapper.a;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.BitmapDrawable;
import java.lang.Exception;

public final class PhotoForward$DefaultImpls	// class@001c8d
{

    public static t a(PhotoForward p0,OperationModel p1){
       a.p(p1, "model");
       BaseFeed uBaseFeed = p1.i();
       if (uBaseFeed == null) {
          throw new IllegalArgumentException("photo is null");
       }
       t ot = t.fromCallable(new PhotoForward$DefaultImpls$a(p0, p1, uBaseFeed)).subscribeOn(d.c).observeOn(a.c());
       a.o(ot, "Observable.fromCallable ¡­dSchedulers.mainThread\(\)\)");
       return ot;
    }
    public static Bitmap b(PhotoForward p0,OperationModel p1,Bitmap p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, null, PhotoForward$DefaultImpls.class, "4");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       a.p(p1, "model");
       a.p(p2, "bitmap");
       return p2;
    }
    public static t c(PhotoForward p0,OperationModel p1,boolean p2,boolean p3,p p4){
       PhotoForward$DefaultImpls uDefaultImpl = PhotoForward$DefaultImpls.class;
       if (PatchProxy.isSupport(uDefaultImpl)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),Boolean.valueOf(p3),p4};
          Object obj = PatchProxy.apply(objArray, null, uDefaultImpl, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p1, "model");
       a.p(p4, "bitmapHandler");
       PhotoForward$DefaultImpls$c uDefaultImpl1 = new PhotoForward$DefaultImpls$c(p0, p1, p2, p3, p4);
       t ot = t.fromCallable(new PhotoForward$DefaultImpls$b(p0.a(p1), p4, p1)).flatMap(v7).subscribeOn(d.c).observeOn(a.c());
       a.o(ot, "Observable.fromCallable ¡­dSchedulers.mainThread\(\)\)");
       return ot;
    }
    public static t d(PhotoForward p0,OperationModel p1,boolean p2,boolean p3,p p4,int p5,Object p6){
       PhotoForward$downloadImageOrVideo$1 uodownloadIm = (p5 & 0x08)? new PhotoForward$downloadImageOrVideo$1(p0): null;
       return p0.W(p1, p2, p3, uodownloadIm);
    }
    public static t e(PhotoForward p0,OperationModel p1,boolean p2,boolean p3,p p4){
       PhotoForward$DefaultImpls uDefaultImpl = PhotoForward$DefaultImpls.class;
       if (PatchProxy.isSupport(uDefaultImpl)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),Boolean.valueOf(p3),p4};
          Object obj = PatchProxy.apply(objArray, null, uDefaultImpl, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p1, "model");
       a.p(p4, "bitmapHandler");
       t ot = t.fromCallable(new PhotoForward$DefaultImpls$d(p0, p1)).flatMap(new PhotoForward$DefaultImpls$e(p1, p2, p3)).map(new PhotoForward$DefaultImpls$f(p4, p1)).map(new PhotoForward$DefaultImpls$g(p1));
       a.o(ot, "Observable.fromCallable ¡­erFile = it\n      }\n    }");
       return ot;
    }
    public static t f(PhotoForward p0,OperationModel p1,boolean p2,boolean p3,p p4){
       PhotoForward$DefaultImpls uDefaultImpl = PhotoForward$DefaultImpls.class;
       if (PatchProxy.isSupport(uDefaultImpl)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),Boolean.valueOf(p3),p4};
          Object obj = PatchProxy.apply(objArray, null, uDefaultImpl, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p1, "model");
       a.p(p4, "bitmapHandler");
       t ot = t.fromCallable(new PhotoForward$DefaultImpls$h(p0, p1, p4)).flatMap(new PhotoForward$DefaultImpls$i(p2, p3)).map(new PhotoForward$DefaultImpls$j(p1));
       a.o(ot, "Observable.fromCallable ¡­reFile = it\n      }\n    }");
       return ot;
    }
    public static Bitmap g(PhotoForward p0,OperationModel p1){
       String str2;
       a.p(p1, "model");
       BaseFeed uBaseFeed = p1.i();
       if (uBaseFeed == null) {
          throw new IllegalArgumentException("photo is null");
       }
       SharePlatformData$ShareConfig shareConfig = p0.a(p1);
       Bitmap uBitmap = n0.d(shareConfig);
       if (uBitmap != null) {
          return uBitmap;
       }
       uBitmap = (!r1.S2(uBaseFeed) && (r1.D3(uBaseFeed) || r1.O2(uBaseFeed)))? 1: 0;
       ArrayList uArrayList = new ArrayList();
       if (r1.f2(uBaseFeed) || r1.X2(uBaseFeed)) {
          ArrayList uArrayList1 = new ArrayList();
          ImageMeta imageMeta = r1.W0(uBaseFeed);
          if (imageMeta != null) {
             List atlasList = imageMeta.getAtlasList();
             a.o(atlasList, "imageMeta.atlasList");
             Iterator iterator = atlasList.iterator();
             int i = 0;
             while (iterator.hasNext()) {
                String str = iterator.next();
                List atlasPhotoCd = ImageMetaExt.getAtlasPhotoCdn(imageMeta, i);
                if (atlasPhotoCd != null && atlasPhotoCd.size() > 0) {
                   uArrayList1.add(atlasPhotoCd);
                }
                if (uArrayList1.size() >= 3) {
                   break ;
                }
                i = i + 1;
             }
             uArrayList = v.a(uArrayList1);
          }
       }
       if (uArrayList.isEmpty()) {
          Bitmap uBitmap1 = n0.b(shareConfig, p1.i());
          if (uBitmap1 != null) {
             uArrayList.add(uBitmap1);
          }
       }
       int i1 = (p1.q() == OperationModel$Type.PHOTO_COMMENT)? 1: 0;
       String str1 = "";
       if (!i1) {
          str2 = r1.V1(uBaseFeed);
       }else {
          str2 = shareConfig.mSubTitle;
          if (str2 == null) {
             str2 = str1;
          }
       }
       Bitmap uBitmap2 = BitmapFactory.decodeResource(a1.m(), R.drawable.arg_RES_7f08183f);
       v4 ov4 = new v4();
       if (!i1) {
          Object[] objArray = new Object[]{TextUtils.N(w.d0(uBaseFeed))};
          str1 = a1.m().getString(R.string.arg_RES_7f103609, objArray);
          a.o(str1, "CommonUtil.res\(\).getStri¡­play_count, playCountStr\)");
       }
       ov4.e(str2, (i1 ^ 1));
       ov4.c(str1);
       ov4.b(uArrayList);
       if (uBitmap) {
          ov4.d(uBitmap2);
       }
       return ov4.a();
    }
    public static Bitmap h(PhotoForward p0,BaseFeed p1,a p2,int p3){
       ImageRequest imageRequest2;
       if (PatchProxy.isSupport(PhotoForward$DefaultImpls.class)) {
          p0 = PatchProxy.applyFourRefs(p0, p1, p2, Integer.valueOf(p3), null, PhotoForward$DefaultImpls.class, "7");
          if (p0 != PatchProxyResult.class) {
             return p0;
          }
       }
       CoverMeta uCoverMeta = r1.D0(p1);
       c uoc = null;
       if (uCoverMeta != null) {
          try{
             a.o(uCoverMeta, "FeedExt.getCoverMeta\(feed\) ?: return null");
             ImageRequest[] imageRequest = b.f(uCoverMeta, p2, uoc);
             a.o(imageRequest, "CoverMetaImageRequestUti¡­verMeta, imageSize, null\)");
             int i = 0;
             if (p3 > 0) {
                ImageRequestBuilder imageRequest1 = ImageRequestBuilder.d(imageRequest[i]);
                imageRequest1.v(new d(p3, p3));
                imageRequest2 = imageRequest1.a();
                a.o(imageRequest2, "ImageRequestBuilder.from¡­imit, sizeLimit\)\).build\(\)");
             }else {
                imageRequest2 = imageRequest[i];
                a.o(imageRequest2, "requests[0]");
             }
             c uoc1 = c.w();
             a.d(imageRequest2, uoc1);
             Drawable uDrawable = uoc1.q();
             if (!uDrawable instanceof BitmapDrawable) {
                uDrawable = uoc;
             }
             if (uDrawable != null) {
                uoc = uDrawable.getBitmap();
             }
             return uoc;
          }catch(java.lang.Exception e8){
             e8.printStackTrace();
          }
          return uoc;
       }else {
          goto label_0073 ;
       }
    }
    public static t i(PhotoForward p0,OperationModel p1,p p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, PhotoForward$DefaultImpls.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "model");
       a.p(p2, "bitmapHandler");
       return p0.F0(p1, false, false, p2);
    }
}
