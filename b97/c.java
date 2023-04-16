package b97.c;
import java.lang.ThreadLocal;
import java.io.File;
import java.lang.Exception;
import java.lang.String;
import java.lang.StringBuilder;
import b97.b;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.zip.ZipOutputStream;
import b97.e;
import java.io.Closeable;
import b97.a;
import java.io.IOException;

public class c	// class@0002c8
{
    public static final ThreadLocal a;

    static {
       c.a = new ThreadLocal();
    }
    public static boolean a(File p0){
       if (p0 == null) {
          return false;
       }
       try{
          if (p0.isFile()) {
             if (!p0.delete()) {
                p0.deleteOnExit();
                return false;
             }else {
                return true;
             }
          }else if(!p0.isDirectory()){
             return false;
          }else {
             File[] uFileArray = p0.listFiles();
             if (uFileArray != null) {
                int len = uFileArray.length;
                for (int i = 0; i < len; i = i + 1) {
                   c.a(uFileArray[i]);
                }
             }
             return p0.delete();
          }
       }catch(java.lang.Exception e5){
          e5.printStackTrace();
          return false;
       }
    }
    public static long b(File p0){
       long l = 0;
       if (p0 == null) {
          return l;
       }
       try{
          if (p0.exists() && p0.canRead()) {
             if (p0.isDirectory()) {
                File[] uFileArray = p0.listFiles();
                if (uFileArray == null) {
                   return l;
                }else {
                   int len = uFileArray.length;
                   long l1 = l;
                   for (int i = 0; i < len; i = i + 1) {
                      l1 = l1 + c.b(uFileArray[i]);
                   }
                   return l1;
                }
             }else {
                l = p0.length();
             }
          }
          return l;
       }catch(java.lang.Exception e0){
       }
    }
    public static void c(File p0){
       if (p0 != null && p0.exists()) {
          String absolutePath = p0.getAbsolutePath();
          String str = ".zip";
          if (!absolutePath.endsWith(str)) {
             File uFile = new File(absolutePath+str);
             File[] uFileArray = new File[]{p0};
             int i = 4096;
             try{
                int i1 = 0;
                byte[] uobyteArray = new byte[i];
                b uob = new b(new BufferedOutputStream(new FileOutputStream(uFile, 0)));
                try{
                   for (int i2 = 0; i2 < 1; i2 = i2 + 1) {
                      e.a(uob, uFileArray[i2], i1, uobyteArray);
                   }
                   uob.flush();
                   uob.closeEntry();
                   a.a(uob);
                label_0067 :
                   if (i3) {
                      p0.delete();
                   }
                }catch(java.io.IOException e0){
                   Closeable uCloseable = uob;
                }
                e0.printStackTrace();
                a.a(i1);
                int i3 = 0;
                goto label_0067 ;
             }catch(java.io.IOException e0){
                goto label_0060 ;
             }
          }
       }
       return;
    }
}
