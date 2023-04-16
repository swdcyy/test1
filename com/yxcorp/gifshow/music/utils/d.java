package com.yxcorp.gifshow.music.utils.d;
import lnc.a1;
import pm6.l;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import android.graphics.Bitmap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Bitmap$Config;
import android.graphics.Canvas;
import java.lang.IllegalArgumentException;
import lnc.s6;
import android.graphics.Paint;
import android.graphics.BitmapShader;
import android.graphics.Shader$TileMode;
import android.graphics.Matrix;
import android.graphics.Shader;
import com.kuaishou.android.model.music.Music;
import com.facebook.imagepipeline.request.ImageRequest;
import ekd.j;
import com.yxcorp.image.fresco.wrapper.a;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.drawee.backends.pipeline.Fresco;
import kb.c;
import kqb.j;
import io.reactivex.g;
import brd.t;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.io.File;
import android.net.Uri;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import uc.d;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import java.util.List;
import java.util.Arrays;
import java.lang.Iterable;
import jd.c;
import wb5.d;

public class d	// class@002090
{
    public static final int a;
    public static final int b;
    public static final int c;
    public static final int d;

    static {
       d.a = a1.e(28.00f);
       d.b = l.a();
       d.c = a1.e(60.00f);
       d.d = a1.e(110.00f);
    }
    public void d(){
       super();
    }
    public static Bitmap a(Drawable p0){
       BitmapDrawable obj = PatchProxy.applyOneRefs(p0, null, d.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof BitmapDrawable) {
          obj = p0;
          if (obj.getBitmap() != null) {
             return obj.getBitmap();
          }
       }
       if (p0.getIntrinsicWidth() > 0 && p0.getIntrinsicHeight() > 0) {
          Bitmap uBitmap = Bitmap.createBitmap(p0.getIntrinsicWidth(), p0.getIntrinsicHeight(), Bitmap$Config.ARGB_8888);
          Canvas uCanvas = new Canvas(uBitmap);
          p0.setBounds(0, 0, uCanvas.getWidth(), uCanvas.getHeight());
          p0.draw(uCanvas);
          return uBitmap;
       }else {
          throw new IllegalArgumentException("wrong size");
       }
    }
    public static Bitmap b(Bitmap p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, d.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int a = (s6.z())? d.a: d.b;
       Paint paint = new Paint();
       paint.setAntiAlias(true);
       Bitmap uBitmap = Bitmap.createBitmap(a, a, Bitmap$Config.ARGB_8888);
       BitmapShader uBitmapShade = new BitmapShader(p0, Shader$TileMode.CLAMP, Shader$TileMode.CLAMP);
       float f = (float)a;
       float f1 = f / (float)p0.getWidth();
       Matrix matrix = new Matrix();
       matrix.postScale(f1, (f / (float)p0.getHeight()));
       uBitmapShade.setLocalMatrix(matrix);
       paint.setShader(uBitmapShade);
       new Canvas(uBitmap).drawCircle((float)(a / 2), (float)(a / 2), (float)(a / 2), paint);
       return uBitmap;
    }
    public static Bitmap c(Music p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.b(d.d(p0));
    }
    public static Bitmap d(Music p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       Bitmap obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, uod, "1");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       Bitmap uBitmap = PatchProxy.applyOneRefs(p0, obj, uod, "10");
       if (uBitmap != patchProxyRe) {
       }else {
          ImageRequest[] imageRequest = d.f(p0);
          if (!j.h(imageRequest)) {
             int len = imageRequest.length;
             int i = 0;
             while (true) {
                if (i < len) {
                   Bitmap uBitmap1 = a.f(imageRequest[i]);
                   if (uBitmap1 != null) {
                      uBitmap = uBitmap1;
                   }else {
                      i = i + 1;
                   }
                }
             }
          }
          uBitmap = obj;
       }
       obj = (uBitmap == null)? d.e(p0): uBitmap;
    }
    public static Bitmap e(Music p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, d.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       ImageRequest[] imageRequest = d.f(p0);
       if (!j.h(imageRequest)) {
          return t.create(new j(Fresco.getImagePipeline().fetchDecodedImage(imageRequest[0], null))).blockingFirst();
       }
       return null;
    }
    public static ImageRequest[] f(Music p0){
       int c;
       ImageRequestBuilder imageRequest1;
       ImageRequest[] imageRequest = null;
       Music obj = PatchProxy.applyOneRefs(p0, imageRequest, d.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.mCoverWidth;
       if (obj == null) {
          c = d.c;
       }
       Music mCoverHeight = p0.mCoverHeight;
       if (mCoverHeight == null) {
          mCoverHeight = d.c;
       }
       if (!j.h(p0.mAvatarUrls) || !TextUtils.x(p0.mAvatarUrl)) {
          return d.a(Arrays.asList(e0.b(p0.mAvatarUrls, p0.mAvatarUrl)), c, mCoverHeight, imageRequest);
       }else if(!TextUtils.x(p0.mCoverPath) && new File(p0.mCoverPath).isFile()){
          imageRequest = new ImageRequest[]{imageRequest1.a()};
          imageRequest1 = ImageRequestBuilder.k(Uri.fromFile(new File(p0.mCoverPath)));
          imageRequest1.v(new d(c, mCoverHeight));
       }
       return imageRequest;
    }
}
