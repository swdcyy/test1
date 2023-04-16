package com.yxcorp.gifshow.comment.utils.a;
import java.lang.Object;
import java.io.InputStream;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.os.Build$VERSION;
import ek9.m1;
import java.lang.Exception;
import q87.c;
import android.content.ContentValues;
import android.app.Application;
import o56.a;
import android.content.ContentResolver;
import com.yxcorp.gifshow.albumcontrol.a;
import android.provider.MediaStore$Images$Media;
import android.net.Uri;
import v79.a;
import java.io.OutputStream;
import ekd.p;
import java.io.IOException;
import java.io.File;
import android.os.Environment;
import qkd.b;
import o56.c;
import android.content.Context;
import qkd.a;

public class a	// class@001104
{

    public void a(){
       super();
    }
    public static boolean a(InputStream p0,String p1,String p2,String p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (Build$VERSION.SDK_INT >= 29) {
          return a.b(p0, p1, p2, p3);
       }
       return a.d(p0, p1, p2);
    }
    public static boolean b(InputStream p0,String p1,String p2,String p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       try{
          a.c(p0, p1, p2, p3);
          return true;
       }catch(java.lang.Exception e7){
          Object[] objArray = new Object[0];
          m1.C().t("CommentImageUtils", e7.getMessage(), objArray);
          return 0;
       }
    }
    public static void c(InputStream p0,String p1,String p2,String p3){
       a uoa = a.class;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, a.class, "4")) {
          return;
       }
       ContentValues uContentValu = new ContentValues();
       uContentValu.put("relative_path", p1);
       uContentValu.put("_display_name", p2);
       p1 = null;
       String str = PatchProxy.applyOneRefs(p2, p1, uoa, "6");
       if (str != PatchProxyResult.class) {
       }else {
          p2 = p2.toLowerCase();
          if (!p2.endsWith("jpg") && !p2.endsWith("jpeg")) {
             if (p2.endsWith("png")) {
                str = "image/png";
             }else if(p2.endsWith("gif")){
                str = "image/gif";
             }
          }
          str = "image/jpeg";
       }
       uContentValu.put("mime_type", str);
       uContentValu.put("is_pending", Boolean.TRUE);
       ContentResolver contentResol = a.b().getContentResolver();
       a uoa1 = a.b.g(p3, contentResol, MediaStore$Images$Media.EXTERNAL_CONTENT_URI, uContentValu);
       if (uoa1.b()) {
          OutputStream outputStream = contentResol.openOutputStream(uoa1.a());
          if (!PatchProxy.applyVoidTwoRefs(outputStream, p0, p1, uoa, "5")) {
             byte[] uobyteArray = new byte[8192];
             int i = p0.read(uobyteArray);
             while (i != -1) {
                outputStream.write(uobyteArray, 0, i);
             }
          }
          p.d(outputStream);
          p.c(p0);
          uContentValu.clear();
          uContentValu.put("is_pending", Boolean.FALSE);
          a.b.l(p3, contentResol, uoa1.a(), uContentValu, null, null);
          return;
       }else {
          throw new IOException("albumControl access deny !!");
       }
    }
    public static boolean d(InputStream p0,String p1,String p2){
       File obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = new File(Environment.getExternalStorageDirectory(), p1);
       if (!b.R(obj)) {
          obj.mkdirs();
       }
       File uFile = new File(obj, p2);
       if (b.l(p0, uFile.getAbsolutePath())) {
          a.b(a.a().a(), uFile);
          return true;
       }else {
          return false;
       }
    }
}
