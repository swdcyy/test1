package com.yxcorp.gifshow.magic.util.b;
import java.lang.Object;
import java.io.Closeable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.io.Flushable;
import s5b.b;
import java.lang.Throwable;
import w46.b;
import java.util.zip.ZipOutputStream;
import java.io.File;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class b	// class@001c5a
{

    public void b(){
       super();
    }
    public static void a(Closeable p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, b.class, "5")) {
          return;
       }
       if (p0 != null) {
          if (p0 instanceof Flushable) {
             try{
                p0.flush();
             }catch(java.lang.Exception e0){
                b.D().e("magic_zip", "closeable.flush error", e0);
             }
          }
       }
    }
    public static void b(ZipOutputStream p0,File p1,String p2,byte[] p3){
       BufferedInputStream uBufferedInp;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, b.class, "3")) {
          return;
       }
       if (p1 != null && p1.exists()) {
          p2 = (TextUtils.isEmpty(p2))? b.c(p1.getName()): p2+File.separator+b.c(p1.getName());
          int i = 0;
          if (p1.isFile()) {
             try{
                FileInputStream uFileInputSt = new FileInputStream(p1);
                try{
                   uBufferedInp = new BufferedInputStream(uFileInputSt);
                   p0.putNextEntry(new ZipEntry(p2));
                   int i1 = uBufferedInp.read(p3, i, p3.length);
                   while (-1 != i1) {
                      p0.write(p3, i, i1);
                   }
                   b.a(uBufferedInp);
                }catch(java.io.IOException e7){
                   Closeable uCloseable = uBufferedInp;
                }
                b.D().e("magic_zip", "doZip error", e7);
                b.a(false);
             }catch(java.io.IOException e7){
                goto label_0075 ;
             }
          }else if(p1.isDirectory()){
             File[] uFileArray = p1.listFiles();
             if (uFileArray == null) {
                return;
             }else {
                int len = uFileArray.length;
                for (; i < len; i = i + 1) {
                   b.b(p0, uFileArray[i], p2, p3);
                }
             }
          }
       }
       return;
    }
    public static String c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(p0) && p0.length() > 1) {
          return p0;
       }
       if (!TextUtils.isEmpty(p0) && p0.charAt(0) == '.') {
          p0 = p0.substring(1);
       }
       return p0;
    }
    public static boolean d(File[] p0,File p1){
       boolean b;
       ZipOutputStream zipOutputStr;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = false;
       if (p0 == null || p0.length < 1) {
          return b;
       }
       int i = 4096;
       try{
          byte[] uobyteArray = new byte[i];
          BufferedOutputStream uBufferedOut = new BufferedOutputStream(new FileOutputStream(p1, b));
          try{
             zipOutputStr = new ZipOutputStream(uBufferedOut);
             int len = p0.length;
             for (int i1 = 0; i1 < len; i1 = i1 + 1) {
                b.b(zipOutputStr, p0[i1], null, uobyteArray);
             }
             zipOutputStr.flush();
             zipOutputStr.closeEntry();
             b.a(zipOutputStr);
             b = true;
          label_005b :
             return b;
          }catch(java.io.IOException e7){
             Closeable uCloseable = zipOutputStr;
          }
          b.D().e("magic_zip", "zip error", e7);
          b.a(null);
          goto label_005b ;
       }catch(java.io.IOException e7){
          goto label_004d ;
       }
    }
}
