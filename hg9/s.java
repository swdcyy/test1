package hg9.s;
import java.lang.Object;
import java.io.File;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import android.graphics.Bitmap;
import k2b.e0;
import android.content.Context;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Number;
import x8c.a;
import q87.c;
import w46.b;
import android.graphics.Bitmap$Config;
import com.yxcorp.gifshow.util.BitmapUtil;
import android.os.Build$VERSION;
import android.os.Environment;
import wkd.b;
import j80.c;
import qkd.b;
import java.util.HashMap;
import o56.a;
import java.text.SimpleDateFormat;
import ekd.n0;
import java.lang.System;
import java.lang.Long;
import java.util.Map;
import s16.j;
import java.lang.Throwable;
import tkd.b;
import tkd.d;
import com.yxcorp.gifshow.prettify.PrettifyPlugin;
import android.net.Uri;
import java.io.OutputStream;
import oh7.c;
import ekd.p;
import com.yxcorp.gifshow.util.PostUtils;
import java.io.IOException;

public class s	// class@002676
{

    public void s(){
       super();
    }
    public static String a(File p0){
       StringBuilder obj = PatchProxy.applyOneRefs(p0, null, s.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "filePath: "+p0.getAbsolutePath()+", exists: "+p0.exists();
       boolean b = 3;
       int i = 0;
       File parentFile = p0.getParentFile();
       while (i < b && parentFile != null) {
          i = i + 1;
          obj = obj+", L"+i+"parent: "+parentFile.exists();
          parentFile = parentFile.getParentFile();
       }
       if (p0.exists()) {
          obj = obj+", canExecute: "+p0.canExecute()+", canRead: "+p0.canRead()+", canWrite: "+p0.canWrite()+", length: "+p0.length()+", lastModify: "+p0.lastModified();
       }
       return obj;
    }
    public static int b(String p0,Bitmap p1,File p2,int p3,int p4,int p5,boolean p6,e0 p7,Context p8){
       Bitmap$Config obj;
       Object[] objArray2;
       OutputStream outputStream;
       object oobject5;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       int i = p3;
       int i1 = p4;
       int i2 = p5;
       boolean b = p6;
       object oobject3 = p7;
       object oobject4 = p8;
       s os = s.class;
       int i3 = 8;
       int i4 = 1;
       int i5 = 3;
       if (PatchProxy.isSupport(os)) {
          Object[] objArray = new Object[9];
          objArray[0] = oobject;
          objArray[i4] = oobject1;
          objArray[2] = oobject2;
          objArray[i5] = Integer.valueOf(p3);
          objArray[4] = Integer.valueOf(p4);
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Boolean.valueOf(p6);
          objArray[7] = oobject3;
          objArray[i3] = oobject4;
          obj = PatchProxy.apply(objArray, null, os, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       String str = " ";
       Object[] objArray1 = new Object[0];
       a.D().w("TakePicture", "handlePicture "+i+str+i1+" , isHD:"+b, objArray1);
       if (oobject1 == null) {
          objArray2 = new Object[0];
          a.D().t("TakePicture", "bitmap null", objArray2);
          return 2;
       }else {
          objArray1 = new Object[0];
          a.D().w("TakePicture", "bitmap size:"+p1.getWidth()+str+p1.getHeight(), objArray1);
          obj = null;
          if (i > 0) {
             oobject1 = BitmapUtil.V(oobject1, i, obj);
             Object[] objArray3 = new Object[0];
             a.D().w("TakePicture", "scale size:"+oobject1.getWidth()+str+oobject1.getHeight(), objArray3);
          }
          File parentFile = p2.getParentFile();
          if (!parentFile.exists()) {
             objArray1 = new Object[0];
             a.D().A("TakePicture", "parentDir = "+parentFile+" is not exist!", objArray1);
             parentFile.mkdirs();
          }
          parentFile = (Build$VERSION.SDK_INT >= 30 && (p2.getAbsolutePath()).startsWith(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getAbsolutePath()))? b.X(b.a(-1504323719).o(), ".jpg"): oobject2;
          try{
             objArray1 = new Object[0];
             a.D().w("TakePicture", "saveToFile = "+s.a(parentFile), objArray1);
             BitmapUtil.P(oobject4, oobject1, parentFile.getAbsolutePath(), 100);
             if (!parentFile.exists()) {
                objArray2 = new Object[0];
                a.D().t("TakePicture", "saveToFile error: file does not exists", objArray2);
                return 5;
             }else if(i1 > 0 && parentFile.length() - (long)i1 > 0){
                Object[] objArray4 = new Object[0];
                a.D().w("TakePicture", "reduceImageFileSize", objArray4);
                BitmapUtil.L(parentFile, i1, 40);
             }
             a uoa = a.D();
             Object[] objArray5 = new Object[0];
             try{
                uoa.w("TakePicture", "setexif", objArray5);
                HashMap hashMap = new HashMap();
                hashMap.put("Model", a.j);
                hashMap.put("DateTime", n0.c("yyyy:MM:dd HH:mm:ss").format(Long.valueOf(System.currentTimeMillis())));
                String str1 = "Software";
                StringBuilder str2 = "Kuaishou Android "+a.m+"&";
                String str3 = (b)? "HD": "Normal";
                hashMap.put(str1, str2+str3);
                if (i2 >= 0) {
                   if (i2 == 90) {
                      i3 = 8;
                   }else if(i2 == 180){
                      i3 = 3;
                   }else if(i2 == 270){
                      i3 = 6;
                   }else {
                      i3 = 1;
                   }
                   hashMap.put("Orientation", String.valueOf(i3));
                }
                j.j(parentFile.getAbsolutePath(), hashMap);
             }catch(java.lang.Exception e0){
                a.D().e("TakePicture", "setexif", e0);
                d.a(0x76e9c37c).Al(oobject3);
             }
             objArray5 = new Object[0];
             a.D().w("TakePicture", "setexif end", objArray5);
             if (parentFile != oobject2 && Build$VERSION.SDK_INT >= 30) {
                try{
                   Uri uri = BitmapUtil.H(oobject, oobject2, "jpeg");
                   if (uri != null) {
                      outputStream = c.c(uri);
                      try{
                         b.f(parentFile, outputStream);
                      }catch(java.lang.Exception e0){
                      }
                      a.D().e("TakePicture", "copyFileToDCIM", e0);
                   }else {
                      outputStream = null;
                   }
                   p.d(outputStream);
                }catch(java.lang.Exception e0){
                   outputStream = null;
                   goto label_025f ;
                }
             }
             if (!p2.exists()) {
                try{
                   PostUtils.c(parentFile, oobject2);
                   parentFile.delete();
                }catch(java.io.IOException e0){
                   a.D().e("TakePicture", "copyFileToDCIM", e0);
                   parentFile.delete();
                   return 5;
                }
             }
             return 0;
          }catch(java.io.IOException e0){
             a.D().e("TakePicture", "saveToFile\n"+e0.toString(), e0);
             return 5;
          }
       }
    }
}
