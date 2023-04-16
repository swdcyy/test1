package com.yxcorp.gifshow.imagecrop.ImageCropActivity$d;
import android.view.View$OnLayoutChangeListener;
import com.yxcorp.gifshow.imagecrop.ImageCropActivity;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
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
import com.kwai.moved.ks_page.fragment.AttrAnimProgressFragment;
import com.yxcorp.gifshow.imagecrop.NoBackProgressFragment;
import java.lang.CharSequence;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.AlbumKwaiDialogFragment;
import java.lang.Exception;
import g79.a;
import w69.l;
import java.lang.Throwable;
import c79.a;
import com.yxcorp.gifshow.album.imageloader.CompatZoomImageView;
import java.io.File;
import mxa.b;
import com.yxcorp.gifshow.album.imageloader.CompatImageView;
import c79.c;
import c79.e;
import c79.d;
import c79.a$a;
import java.lang.StringBuilder;

public final class ImageCropActivity$d implements View$OnLayoutChangeListener	// class@00194f
{
    public final ImageCropActivity b;

    public void ImageCropActivity$d(ImageCropActivity p0){
       this.b = p0;
       super();
    }
    public final void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       String str;
       if (PatchProxy.isSupport(ImageCropActivity$d.class)) {
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
          if (PatchProxy.applyVoid(objArray, this, ImageCropActivity$d.class, "1")) {
             return;
          }
       }
       ImageCropActivity$d tb = this.b;
       if (tb.t == null) {
          Objects.requireNonNull(tb);
          Object[] objArray1 = null;
          if (!PatchProxy.applyVoid(objArray1, tb, ImageCropActivity.class, "7")) {
             Intent intent = tb.getIntent();
             a.h(intent, "intent");
             Bundle extras = intent.getExtras();
             if (extras != null) {
                if (extras.getString("circleCrop") != null) {
                   tb.M2().setDrawCircle(1);
                }
                Uri parcelable = extras.getParcelable("output");
                tb.l = parcelable;
                if (parcelable != null) {
                   str = extras.getString("outputFormat");
                   if (str != null) {
                      tb.e = Bitmap$CompressFormat.valueOf(str);
                   }
                }
                tb.q = extras.getInt("outputX");
                tb.r = extras.getInt("outputY");
             }
             Uri data = intent.getData();
             if (data != null) {
                tb.u = objArray1;
                if (a.g("content", data.getScheme())) {
                   ContentResolver contentResol = tb.getContentResolver();
                   a.h(contentResol, "contentResolver");
                   String[] stringArray = new String[]{"_data"};
                   Cursor uCursor = a.b.f("post_asset_picker", contentResol, data, stringArray).a();
                   if (uCursor != null) {
                      if (uCursor.moveToFirst()) {
                         tb.u = uCursor.getString(0);
                      }
                      uCursor.close();
                   }
                }else {
                   str = data.getPath();
                   tb.u = str;
                   if (str == null) {
                      tb.u = data.toString();
                   }
                }
                if (tb.u != null) {
                   try{
                      if (!PatchProxy.applyVoid(objArray1, tb, ImageCropActivity.class, "8")) {
                         ImageCropActivity w = tb.w;
                         if (w != null) {
                            w.dismiss();
                            tb.w = objArray1;
                         }
                         NoBackProgressFragment noBackProgre = new NoBackProgressFragment();
                         tb.w = noBackProgre;
                         noBackProgre.kh("");
                         w = tb.w;
                         if (w == null) {
                            a.L();
                         }
                         w.setCancelable(0);
                         w = tb.w;
                         if (w == null) {
                            a.L();
                         }
                         w.ih(0);
                         w = tb.w;
                         if (w == null) {
                            a.L();
                         }
                         w.show(tb.getSupportFragmentManager(), "loading");
                      }
                   }catch(java.lang.Exception e6){
                      tb.w = objArray1;
                      e6.printStackTrace();
                      a.c.c().onException(e6);
                   }
                   Uri uri = Uri.fromFile(new File(tb.u));
                   a.h(uri, "Uri.fromFile\(File\(mFile\)\)");
                   a.a.c(tb.N2(), uri, null, null, new b(tb));
                }else {
                   a.c.c().onException(new Exception("crop start error no file path"+intent));
                   tb.finish();
                }
             }else {
                a.c.c().onException(new Exception("crop start error no data"+intent));
                tb.finish();
             }
             tb.N2().t0();
          }
          tb.t = true;
       }else if(p1 == p5 && (p2 == p6 && (p3 == p7 && p4 == p8))){
          return;
       }else {
          tb.N2().t0();
       }
       return;
    }
}
