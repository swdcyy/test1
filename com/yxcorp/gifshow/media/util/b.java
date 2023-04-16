package com.yxcorp.gifshow.media.util.b;
import java.lang.String;
import java.lang.Object;
import android.net.Uri;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.media.util.a;
import io.reactivex.g;
import brd.t;
import android.os.Build$VERSION;
import ykd.a;
import java.lang.StringBuilder;
import q87.c;
import android.media.MediaMetadataRetriever;
import android.app.Application;
import o56.a;
import android.content.Context;
import java.lang.Number;
import java.lang.Double;
import com.kwai.sdk.switchconfig.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.lang.Long;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import k2b.u1;
import java.lang.System;
import lnc.v5;
import com.kwai.video.kstmf.support.KSTMFMetadata;
import brd.z;
import lrd.b;
import x6b.d;
import erd.g;
import io.reactivex.internal.functions.Functions;
import x6b.c;
import crd.b;
import java.io.FileInputStream;
import java.io.FileDescriptor;
import java.io.InputStream;
import ekd.p;
import android.media.ExifInterface;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public class b	// class@001d1e
{
    public String a;
    public double b;
    public double c;
    public boolean d;

    public void b(String p0){
       super();
       this.a = p0;
    }
    public static Uri d(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.create(new a(p0)).blockingFirst();
    }
    public static String j(String p0){
       Object obj = null;
       Uri obj1 = PatchProxy.applyOneRefs(p0, obj, b.class, "6");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (Build$VERSION.SDK_INT < 30) {
          return obj;
       }
       obj1 = b.d(p0);
       if (obj1 == Uri.EMPTY) {
          Object[] objArray = new Object[0];
          a.C().w("MediaRetriever", "retrieveBySysApi\(\) no uri "+p0, objArray);
          return obj;
       }else {
          MediaMetadataRetriever mediaMetadat = new MediaMetadataRetriever();
          mediaMetadat.setDataSource(a.b(), obj1);
          return mediaMetadat.extractMetadata(23);
       }
    }
    public final double a(String p0){
       String str = "/";
       String[] obj = PatchProxy.applyOneRefs(p0, this, b.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       try{
          int i = 3;
          obj = p0.split(",", i);
          if (obj.length != i) {
             return Double.parseDouble(p0);
          }
          String[] stringArray = (obj[0]).split(str, 2);
          stringArray = (obj[1]).split(str, 2);
          String[] stringArray1 = (obj[2]).split(str, 2);
          return (((Double.parseDouble(stringArray[0]) / Double.parseDouble(stringArray[1])) + ((Double.parseDouble(stringArray[0]) / Double.parseDouble(stringArray[1])) / 60.00f)) + ((Double.parseDouble(stringArray1[0]) / Double.parseDouble(stringArray1[1])) / 3600.00f));
       }catch(java.lang.NumberFormatException e0){
          return 0;
       }
    }
    public String b(){
       Object obj = PatchProxy.apply(null, this, b.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return String.valueOf(this.c);
    }
    public String c(){
       Object obj = PatchProxy.apply(null, this, b.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return String.valueOf(this.b);
    }
    public final long e(){
       Object obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return a.t().b("FetchMediaPoiWay", 1);
    }
    public boolean f(){
       return this.d;
    }
    public final void g(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "12")) {
          return;
       }
       if (TextUtils.isEmpty(p0)) {
          return;
       }
       Matcher matcher = Pattern.compile("\([+-]\\d*\\.\\d*\)\([+-]\\d*\\.\\d*\)").matcher(p0);
       if (matcher.find()) {
          int i = 2;
          if (matcher.groupCount() == i) {
             this.c = Double.parseDouble(matcher.group(1));
             this.b = Double.parseDouble(matcher.group(i));
             this.d = true;
          }
       }
       return;
    }
    public final void h(String p0,long p1,String p2,String p3){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidFourRefs(p0, Long.valueOf(p1), p2, p3, this, b.class, "10")) {
          return;
       }
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("way", p0);
       jsonObject.a0("cost", Long.valueOf(p1));
       jsonObject.c0("location", p2);
       jsonObject.c0("path", p3);
       u1.Y("post_poi_stat", jsonObject.toString(), 2);
       return;
    }
    public void i(){
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "2")) {
          return;
       }
       System.currentTimeMillis();
       a uoa = null;
       if (this.e() - uoa) {
          if (TextUtils.isEmpty(this.a)) {
             return;
          }else if(v5.c().matcher(this.a).matches()){
             if (!PatchProxy.applyVoid(objArray, this, uob, "3")) {
                long l = this.e();
                if (l - uoa) {
                   Object[] objArray1 = new Object[0];
                   a.C().w("MediaRetriever", "retrieveByFFmpeg\(\) way="+l, objArray1);
                   long l1 = System.currentTimeMillis();
                   b ta = this.a;
                   String str = PatchProxy.applyOneRefs(ta, objArray, uob, "4");
                   if (str != PatchProxyResult.class) {
                   }else {
                      str = KSTMFMetadata.getVideoLocation(ta);
                   }
                   Object obj = str;
                   long l2 = System.currentTimeMillis() - l1;
                   this.g(obj);
                   if (!l - 2) {
                      this.h("ffmpeg", l2, obj, this.a);
                      t.just(this.a).subscribeOn(b.e()).doOnNext(new d(this)).subscribe(Functions.d(), new c(l));
                   }
                }
             }
          }else {
             this.k();
          }
       }else {
          this.k();
          if (!this.f() && !PatchProxy.applyVoid(objArray, this, uob, "11")) {
             MediaMetadataRetriever mediaMetadat = new MediaMetadataRetriever();
             FileInputStream uFileInputSt = new FileInputStream(this.a);
             mediaMetadat.setDataSource(uFileInputSt.getFD());
             this.g(mediaMetadat.extractMetadata(23));
             p.c(uFileInputSt);
          }
       }
       return;
    }
    public final void k(){
       if (PatchProxy.applyVoid(null, this, b.class, "7")) {
          return;
       }
       try{
          ExifInterface uExifInterfa = new ExifInterface(this.a);
          String attribute = uExifInterfa.getAttribute("GPSLatitude");
          String attribute1 = uExifInterfa.getAttribute("GPSLongitude");
          String attribute2 = uExifInterfa.getAttribute("GPSLatitudeRef");
          String attribute3 = uExifInterfa.getAttribute("GPSLongitudeRef");
          if (!TextUtils.isEmpty(attribute) && (!TextUtils.isEmpty(attribute1) && (TextUtils.isEmpty(attribute2) || TextUtils.isEmpty(attribute3)))) {
             return;
          }else {
             double d = this.a(attribute);
             double d1 = this.a(attribute1);
             if (!("N").equalsIgnoreCase(attribute2)) {
                d = - d;
             }
             this.c = d;
             if (!("E").equalsIgnoreCase(attribute3)) {
                d1 = - d1;
             }
             this.b = d1;
             this.d = true;
          }
       }catch(java.io.IOException e0){
       }catch(java.lang.RuntimeException e0){
          ExceptionHandler.handleCaughtException(e0);
          a.C().e("MediaRetriever", "retrieveFromExif: ", e0);
       }
       return;
    }
}
