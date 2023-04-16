package b97.e;
import java.util.zip.ZipOutputStream;
import java.io.File;
import java.lang.String;
import java.io.FileNotFoundException;
import java.lang.Throwable;
import com.kwai.logger.KwaiLog;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.io.Closeable;
import b97.a;
import java.io.IOException;

public class e	// class@0003f9
{

    public static void a(ZipOutputStream p0,File p1,String p2,byte[] p3){
       BufferedInputStream uBufferedInp;
       String str = "ZipUtils";
       if (p1 != null) {
          if (!p1.exists()) {
             KwaiLog.d(str, p1.toString(), new FileNotFoundException("\(doZip:142\)Target File is missing"));
          }else if(TextUtils.isEmpty(p2)){
             p2 = e.b(p1.getName());
          }else {
             p2 = p2+File.separator+e.b(p1.getName());
          }
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
                goto label_0073 ;
             }
          }else if(p1.isDirectory()){
             File[] uFileArray = p1.listFiles();
             if (uFileArray == null) {
                return;
             }else {
                int len = uFileArray.length;
                for (; i < len; i = i + 1) {
                   e.a(p0, uFileArray[i], p2, p3);
                }
             }
          }
       }else {
          KwaiLog.d(str, "", new IOException("\(dozip:179\) I/O Object got NullPointerException"));
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
}
