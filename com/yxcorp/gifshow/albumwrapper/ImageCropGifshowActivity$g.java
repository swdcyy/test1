package com.yxcorp.gifshow.albumwrapper.ImageCropGifshowActivity$g;
import android.view.View$OnLayoutChangeListener;
import com.yxcorp.gifshow.albumwrapper.ImageCropGifshowActivity;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import gp.a;
import q87.c;
import android.content.Intent;
import android.app.Activity;
import kotlin.jvm.internal.a;
import android.os.Bundle;
import com.albinmathew.photocrop.cropoverlay.CropOverlayView;
import android.os.Parcelable;
import android.net.Uri;
import android.graphics.Bitmap$CompressFormat;
import com.yxcorp.gifshow.albumcontrol.a;
import android.content.ContentResolver;
import v79.a;
import android.database.Cursor;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import zsd.u;
import java.lang.StringBuilder;
import wkd.b;
import j80.c;
import java.io.File;
import java.lang.System;
import com.yxcorp.gifshow.image.KwaiZoomImageView;
import x79.k;
import ub.b;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.Exception;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.yxcorp.gifshow.activity.GifshowActivity;
import kxa.a;
import x79.l;
import kxa.g;

public final class ImageCropGifshowActivity$g implements View$OnLayoutChangeListener	// class@001b4f
{
    public final ImageCropGifshowActivity b;

    public void ImageCropGifshowActivity$g(ImageCropGifshowActivity p0){
       this.b = p0;
       super();
    }
    public final void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       String str;
       Exception uException;
       if (PatchProxy.isSupport(ImageCropGifshowActivity$g.class)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = Integer.valueOf(p4);
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = Integer.valueOf(p8);
          if (PatchProxy.applyVoid(objArray, this, ImageCropGifshowActivity$g.class, "1")) {
             return;
          }
       }
       ImageCropGifshowActivity$g tb = this.b;
       if (tb.R == null) {
          Objects.requireNonNull(tb);
          Object[] objArray1 = null;
          if (!PatchProxy.applyVoid(objArray1, tb, ImageCropGifshowActivity.class, "6")) {
             String x0 = ImageCropGifshowActivity.X0;
             Object[] objArray2 = new Object[0];
             a.C().w(x0, "init", objArray2);
             Intent intent = tb.getIntent();
             a.o(intent, "intent");
             Bundle extras = intent.getExtras();
             if (extras != null) {
                if (extras.getString("circleCrop") != null) {
                   CropOverlayView uCropOverlay = tb.y3();
                   if (uCropOverlay != null) {
                      uCropOverlay.setDrawCircle(1);
                   }
                }
                Uri parcelable = extras.getParcelable("output");
                tb.H = parcelable;
                if (parcelable != null) {
                   str = extras.getString("outputFormat");
                   if (str != null) {
                      tb.z = Bitmap$CompressFormat.valueOf(str);
                   }
                }
                tb.M = extras.getInt("outputX");
                tb.N = extras.getInt("outputY");
             }
             Uri data = intent.getData();
             if (data != null) {
                tb.T = objArray1;
                if (a.g("content", data.getScheme())) {
                   ContentResolver contentResol = tb.getContentResolver();
                   a.o(contentResol, "contentResolver");
                   String[] stringArray = new String[]{"_data"};
                   Cursor uCursor = a.b.f("post_image_crop", contentResol, data, stringArray).a();
                   if (uCursor != null) {
                      if (uCursor.moveToFirst()) {
                         tb.T = uCursor.getString(0);
                      }
                      uCursor.close();
                   }
                }else {
                   str = data.getPath();
                   tb.T = str;
                   if (str == null) {
                      tb.T = data.toString();
                   }
                }
                if (tb.T != null) {
                   ImageCropGifshowActivity h = tb.H;
                   if (h != null) {
                      a.m(h);
                      if (!TextUtils.x(h.getPath())) {
                         ImageCropGifshowActivity h1 = tb.H;
                         a.m(h1);
                         if (u.J1(tb.T, h1.getPath(), 0, 2, objArray1)) {
                            String str1 = b.a(-1504323719).o().getAbsolutePath()+System.currentTimeMillis();
                            new File(tb.T).renameTo(new File(str1));
                            tb.T = str1;
                         }
                      }
                   }
                   tb.z3().w(new File(tb.T), 0, 0, new k(tb));
                }else {
                   uException = new Exception("crop start error no file path"+intent);
                   ExceptionHandler.handleCaughtException(uException);
                   a.C().e(x0, "crop start error no file path "+intent, uException);
                   tb.finish();
                }
             }else {
                uException = new Exception("crop start error no data"+intent);
                ExceptionHandler.handleCaughtException(uException);
                a.C().e(x0, "crop start error no data "+intent, uException);
                tb.finish();
             }
             tb.z3().o0();
             tb.z3().getAttacher().setOnScaleChangeListener(new l(tb));
          }
          tb.R = true;
       }else if(p1 == p5 && (p2 == p6 && (p3 == p7 && p4 == p8))){
          return;
       }else if(tb.S == null){
          KwaiZoomImageView kwaiZoomImag = tb.z3();
          if (kwaiZoomImag != null) {
             kwaiZoomImag.o0();
          }
       }
       return;
    }
}
