package com.feature.post.bridge.q;
import java.io.File;
import java.lang.String;
import com.kuaishou.gifshow.files.a;
import android.os.Build$VERSION;
import com.yxcorp.gifshow.util.PostUtils;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import qkd.a;
import android.content.ContentResolver;
import android.content.ContentValues;
import java.lang.StringBuilder;
import android.os.Environment;
import com.yxcorp.gifshow.albumcontrol.a;
import android.provider.MediaStore$Video$Media;
import android.net.Uri;
import java.io.OutputStream;
import qkd.b;
import ekd.p;
import og.l;
import java.lang.Throwable;
import w46.b;
import z55.b;
import java.lang.Object;
import com.kwai.feature.post.api.feature.bridge.JSSelectFileAndUploadOptions;
import q87.c;
import com.kwai.feature.post.api.feature.bridge.JSSelectFileAndUploadOptions$ErrorInfo;
import com.kwai.feature.post.api.feature.bridge.JSSelectFileAndUploadOptions$b;
import java.util.Objects;
import com.kwai.feature.post.api.feature.bridge.JSSelectFileAndUploadOptions$b$a;
import com.kwai.feature.post.api.feature.bridge.JSSelectFileAndUploadOptions$UploadConfig;
import java.lang.Short;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ln.b;
import java.util.LinkedList;
import ln.b$a;
import pm6.e;
import java.lang.Boolean;
import java.util.List;
import brd.t;
import mg.p1;
import erd.o;
import mg.n1;
import mg.m1;
import erd.g;
import crd.b;

public class q	// class@0014b5
{

    public static void a(File p0,long p1){
       try{
          File uFile = a.b(".mp4");
          if (Build$VERSION.SDK_INT < 30) {
             PostUtils.c(p0, uFile);
             a.d(a.a().a(), uFile, p1);
          }else {
             ContentResolver contentResol = a.a().a().getContentResolver();
             ContentValues uContentValu = new ContentValues();
             uContentValu.put("relative_path", Environment.DIRECTORY_DCIM+"/Camera/");
             uContentValu.put("_display_name", uFile.getName());
             OutputStream outputStream = contentResol.openOutputStream(a.b.h("post_js_record_and_update", contentResol, MediaStore$Video$Media.EXTERNAL_CONTENT_URI, uContentValu));
             b.f(p0, outputStream);
             p.d(outputStream);
          }
       }catch(java.io.IOException e4){
          l.D().e("JsSelectVideoUpdateFunction", "saveFileToAlbum error", e4);
       }
       return;
    }
    public static void b(b p0,String p1,Object p2){
       if (p0 == null) {
          return;
       }
       p0.a(p1, p2);
       return;
    }
    public static void c(JSSelectFileAndUploadOptions p0,String p1,b p2){
       Object[] objArray1;
       String failEventNam;
       int i = 0;
       Object[] objArray = new Object[i];
       l.D().w("JsSelectVideoUpdateFunction", "uploadFile\(\) called with: params = ["+p0+"], path = ["+p1+"]", objArray);
       String str = "";
       if (p0.getLimitSize() - new File(p1).length() < 0) {
          objArray1 = new Object[i];
          l.D().A("JsSelectVideoUpdateFunction", "file length bigger than limit", objArray1);
          Objects.requireNonNull(JSSelectFileAndUploadOptions$b.p);
          failEventNam = p0.getFailEventName();
          Objects.requireNonNull(failEventNam);
          q.b(p2, failEventNam, new JSSelectFileAndUploadOptions$ErrorInfo(str, JSSelectFileAndUploadOptions$b$a.b).toString());
          return;
       }else if(!p0.isFitMineType(p1)){
          objArray1 = new Object[i];
          l.D().A("JsSelectVideoUpdateFunction", "file format is not support", objArray1);
          Objects.requireNonNull(JSSelectFileAndUploadOptions$b.p);
          failEventNam = p0.getFailEventName();
          Objects.requireNonNull(failEventNam);
          q.b(p2, failEventNam, new JSSelectFileAndUploadOptions$ErrorInfo(str, JSSelectFileAndUploadOptions$b$a.d).toString());
          return;
       }else {
          Short shortx = null;
          JSSelectFileAndUploadOptions$UploadConfig uploadConfig = p0.getUploadConfig();
          if (uploadConfig != null && uploadConfig.getToken() != null) {
             shortx = uploadConfig.getPort();
             if (shortx == null) {
                shortx = Short.valueOf(443);
             }
             str = uploadConfig.getProtocol();
             if (TextUtils.x(str)) {
                str = "KTP";
             }
             b uob = new b();
             uob.b = i;
             uob.a = uploadConfig.getToken();
             LinkedList linkedList = new LinkedList();
             uob.d = linkedList;
             linkedList.add(new b$a(uploadConfig.getHost(), shortx.shortValue(), str));
             shortx = uob;
          }
          if (shortx == null) {
             objArray1 = new Object[i];
             l.D().A("JsSelectVideoUpdateFunction", "RickonTokenResponse create failed", objArray1);
             failEventNam = p0.getFailEventName();
             Objects.requireNonNull(failEventNam);
             q.b(p2, failEventNam, new JSSelectFileAndUploadOptions$ErrorInfo("response token is empty", JSSelectFileAndUploadOptions$b.p.b()).toString());
             return;
          }else {
             e.e(e.a, Boolean.TRUE).flatMap(new p1(p1, shortx)).subscribe(new n1(p2, p0), new m1(p2, p0));
             return;
          }
       }
    }
}
