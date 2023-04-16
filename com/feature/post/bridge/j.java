package com.feature.post.bridge.j;
import q46.r;
import java.lang.String;
import f55.g;
import com.kwai.feature.post.api.feature.bridge.JsUploadVideoFromAlbumResult$UploadData;
import com.feature.post.bridge.j$b;
import r26.e;
import brd.a0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.io.File;
import og.l;
import java.lang.Object;
import q87.c;
import com.feature.post.bridge.f;
import erd.o;
import com.feature.post.bridge.e;
import android.app.Activity;
import com.kwai.feature.post.api.feature.bridge.JsVideoUploadStatusParams;
import w46.b;
import r16.f;
import com.yxcorp.gifshow.util.LoadPolicy;
import java.lang.Class;
import lnc.y6;
import mg.t0;
import mg.x0;
import erd.g;
import crd.b;
import com.kwai.feature.post.api.feature.bridge.JSReeditPhotoParams;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.activity.GifshowActivity;
import brd.t;
import com.yxcorp.gifshow.feed.g;
import mg.u0;
import com.feature.post.bridge.g;
import android.os.Bundle;
import mg.s0;
import mg.w0;
import com.kwai.feature.post.api.feature.bridge.JsUploadVideoFromAlbumParams;
import pm6.e;
import com.feature.post.bridge.j$a;
import androidx.fragment.app.FragmentActivity;
import java.util.List;
import pm6.e$b;

public class j	// class@001482
{

    public static void a(r p0,String p1,g p2){
       p0.a(new j$b(p1, new JsUploadVideoFromAlbumResult$UploadData(), p2, p0));
    }
    public static a0 b(String p0,String p1){
       Object[] objArray;
       int i = 0;
       if (!TextUtils.x(p0) && new File(p0).exists()) {
          objArray = new Object[i];
          l.D().w("JsPublishFun", "getThumbnailBitmap from cover", objArray);
          return a0.B(p0).C(f.b);
       }else if(!TextUtils.x(p1) && new File(p1).exists()){
          objArray = new Object[i];
          l.D().w("JsPublishFun", "getThumbnailBitmap from video", objArray);
          return a0.B(p1).C(e.b);
       }else {
          Object[] objArray1 = new Object[i];
          l.D().w("JsPublishFun", "getThumbnailBitmap empty", objArray1);
          return a0.B("");
       }
    }
    public static void c(Activity p0,JsVideoUploadStatusParams p1,g p2){
       int i = 0;
       Object[] objArray = new Object[i];
       l.D().w("JsPublishFun", "getVideoUploadStatus: ", objArray);
       if (p0 == null) {
          Object[] objArray1 = new Object[i];
          l.D().t("JsPublishFun", "getVideoUploadStatus: activity is null", objArray1);
          return;
       }else {
          y6.s(f.class, LoadPolicy.DIALOG).R(new t0(p0, p1, p2), new x0(p2));
          return;
       }
    }
    public static void d(Activity p0,JSReeditPhotoParams p1,g p2){
       Object[] objArray = new Object[0];
       l.D().w("JsPublishFun", "reeditPhoto, photoId"+p1.mPhotoId, objArray);
       if (!p0 instanceof GifshowActivity || TextUtils.x(p1.mPhotoId)) {
          Object[] objArray1 = new Object[0];
          l.D().t("JsPublishFun", "reeditPhoto params is invalid", objArray1);
          p2.a(0x1e84f, "reeditPhoto params is invalid", null);
          return;
       }else {
          g.e(p1.mPhotoId, null).doOnError(new u0(p2)).subscribe(new g(p0, p2));
          return;
       }
    }
    public static void e(Activity p0,JsVideoUploadStatusParams p1,g p2){
       Object[] objArray = new Object[0];
       l.D().w("JsPublishFun", "resumeVideoUpload: ", objArray);
       y6.s(f.class, LoadPolicy.DIALOG).R(new s0(p0, p1, p2), new w0(p2));
    }
    public static void f(Activity p0,JsUploadVideoFromAlbumParams p1,g p2){
       Object[] objArray = new Object[0];
       l.D().w("JsPublishFun", "uploadVideoFromAlbum: ", objArray);
       if (!p0 instanceof GifshowActivity) {
          return;
       }
       e.c(p0, e.a, new j$a(p0, p1, p2));
       return;
    }
}
