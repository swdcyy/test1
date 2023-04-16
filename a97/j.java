package a97.j;
import java.util.zip.ZipOutputStream;
import java.io.File;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.io.Closeable;
import a97.a;
import java.io.IOException;
import a97.b;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class j	// class@000089
{

    public static void a(ZipOutputStream p0,File p1,String p2,byte[] p3){
       BufferedInputStream uBufferedInp;
       if (p1 != null && p1.exists()) {
          p2 = (TextUtils.isEmpty(p2))? j.b(p1.getName()): p2+File.separator+j.b(p1.getName());
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
                   a.a(uBufferedInp);
                }catch(java.io.IOException e4){
                   Closeable uCloseable = uBufferedInp;
                }
                e4.printStackTrace();
                a.a(false);
                throw e4;
             }catch(java.io.IOException e4){
                goto label_0063 ;
             }
          }else if(p1.isDirectory()){
             File[] uFileArray = p1.listFiles();
             if (uFileArray == null) {
                return;
             }else {
                int len = uFileArray.length;
                for (; i < len; i = i + 1) {
                   j.a(p0, uFileArray[i], p2, p3);
                }
             }
          }
       }
       return;
    }
    public static String b(String p0){
       if (TextUtils.isEmpty(p0) && p0.length() > 1) {
          return p0;
       }
       if (!TextUtils.isEmpty(p0) && p0.charAt(0) == '.') {
          p0 = p0.substring(1);
       }
       return p0;
    }
    public static boolean c(File p0,File p1){
       int i = 1;
       File[] uFileArray = new File[i];
       uFileArray[0] = p0;
       int i1 = 4096;
       String str = null;
       try{
          byte[] uobyteArray = new byte[i1];
          b uob = new b(new BufferedOutputStream(new FileOutputStream(p1, 0)));
          try{
             for (int i2 = 0; i2 < i; i2++) {
                j.a(uob, uFileArray[i2], str, uobyteArray);
             }
             uob.flush();
             uob.closeEntry();
             a.a(uob);
          label_003e :
             return i;
          }catch(java.io.IOException e7){
             Closeable uCloseable = uob;
          }
          e7.printStackTrace();
          a.a(str);
          i = false;
          goto label_003e ;
       }catch(java.io.IOException e7){
          goto label_0037 ;
       }
    }
}
