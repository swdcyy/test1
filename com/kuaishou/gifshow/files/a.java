package com.kuaishou.gifshow.files.a;
import java.lang.Object;
import java.io.File;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import com.kwai.robust.PatchProxyResult;
import android.os.Environment;
import java.lang.StringBuilder;
import java.text.SimpleDateFormat;
import ekd.n0;
import java.util.Date;
import android.content.ContentResolver;
import android.net.Uri;
import xkd.b;
import com.kwai.sdk.switchconfig.a;
import wkd.b;
import j80.c;
import java.io.InputStream;
import qkd.b;
import java.lang.Exception;
import java.lang.Boolean;
import android.content.Context;
import android.content.Intent;
import ekd.w0;
import com.yxcorp.gifshow.util.u0;

public class a	// class@000843
{

    public void a(){
       super();
    }
    public static void a(File p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, a.class, "16")) {
          return;
       }
       if (!p0.exists()) {
          return;
       }
       File uFile = new File(p0, ".nomedia");
       if (!uFile.exists()) {
          uFile.createNewFile();
       }
       return;
    }
    public static File b(String p0){
       File obj = PatchProxy.applyOneRefs(p0, null, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM), "Camera");
       if (!obj.exists()) {
          boolean b = obj.mkdirs();
          Log.b("createCameraMediaFile", "createCameraFile: "+b);
          if (!b) {
             obj = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
          }
       }
       return new File(obj, n0.c("yyyyMMdd_kkmmssSSS").format(new Date())+p0);
    }
    public static File c(){
       File uFile1;
       String obj = PatchProxy.apply(null, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "IMG_"+n0.c("yyyyMMdd_kkmmssSSS").format(new Date());
       int i = 0;
       while (true) {
          String str = ".jpg";
          if (!i) {
             str = obj+str;
          label_005c :
             File uFile = PatchProxy.apply(null, null, a.class, "2");
             if (uFile != PatchProxyResult.class) {
             }else {
                uFile = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM), "Camera");
             }
             uFile1 = new File(uFile, str);
             if (!uFile1.exists()) {
                break ;
             }else {
                i = i + 1;
             }
          }else {
             str = obj+"_"+i+str;
             goto label_005c ;
          }
       }
       return uFile1;
    }
    public static String d(ContentResolver p0,Uri p1){
       String obj = PatchProxy.applyTwoRefs(p0, p1, null, a.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1 == null) {
          return null;
       }
       try{
          obj = b.a(p0, p1);
       }catch(java.lang.SecurityException e0){
          obj = null;
       }
       if (obj != null && new File(obj).exists()) {
          return obj;
       }
       if (obj == null) {
          obj = p1.toString();
       }
       obj = obj.substring(obj.lastIndexOf(47));
       int i = -1504323719;
       obj = (a.t().d("fileUtilsWriteTmpFileToPrivateDir", false))? b.a(i).l()+obj: b.a(i).o()+obj;
       try{
          if (!b.l(p0.openInputStream(p1), obj)) {
             return null;
          }
       }catch(java.lang.Exception e5){
          e5.printStackTrace();
       }
       return obj;
    }
    public static boolean e(File p0,File p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, a.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null) {
          return false;
       }
       if (p0.equals(p1)) {
          return true;
       }
       return a.e(p0.getParentFile(), p1);
    }
    public static void f(File p0,Context p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "6")) {
          return;
       }
       try{
          Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
          intent.setData(w0.c(p0));
          p1.sendBroadcast(intent);
       }catch(java.lang.Exception e3){
          e3.printStackTrace();
       }
       return;
    }
    public static File g(Context p0,File p1){
       File obj = PatchProxy.applyTwoRefs(p0, p1, null, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.c();
       Object obj1 = PatchProxy.applyThreeRefs(p0, p1, obj, null, a.class, "5");
       if (obj1 != PatchProxyResult.class) {
          obj = obj1;
       }else {
          b.g(p1, obj);
          a.f(obj, p0);
       }
       return obj;
    }
    public static void h(File p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "10")) {
          return;
       }
       u0.i(p0, p1);
       return;
    }
}
