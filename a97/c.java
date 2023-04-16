package a97.c;
import java.lang.String;
import java.lang.Object;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.Closeable;
import a97.a;
import java.io.IOException;
import u87.b;
import java.io.File;
import java.lang.StringBuilder;
import android.content.Context;
import android.os.Environment;

public class c	// class@000080
{

    public static void a(String p0,String p1){
       Closeable uCloseable;
       if (!p0.equals(p1)) {
          int i = 0;
          try{
             try{
                FileInputStream uFileInputSt = new FileInputStream(p0);
                uCloseable = new FileOutputStream(p1);
                try{
                   int i1 = 1024;
                   byte[] uobyteArray = new byte[i1];
                   i = uFileInputSt.read(uobyteArray);
                   while (i >= 0) {
                      uCloseable.write(uobyteArray, 0, i);
                   }
                   a.a(uFileInputSt);
                label_003b :
                   a.a(uCloseable);
                }catch(java.io.IOException e4){
                }
                Closeable uCloseable1 = uFileInputSt;
             }catch(java.io.IOException e4){
                uCloseable = i;
                goto label_002e ;
             }
          }catch(java.io.IOException e4){
             uCloseable = i;
          }
          e4.printStackTrace();
          a.a(i);
          goto label_003b ;
       }
       return;
    }
    public static void b(String p0,String p1,b p2){
       if (!p0.equals(p1)) {
          File[] uFileArray = new File(p0).listFiles();
          if (uFileArray != null && uFileArray.length) {
             File uFile = new File(p1);
             if (!uFile.exists()) {
                uFile.mkdirs();
             }
             int len = uFileArray.length;
             int i = 0;
             while (i < len) {
                object oobject = uFileArray[i];
                if (oobject.isFile()) {
                   if (p2 == null || p2.accept(oobject)) {
                      c.a(oobject.getAbsolutePath(), p1+File.separator+oobject.getName());
                   }
                }else if(oobject.isDirectory()){
                   String separator = File.separator;
                   c.b(oobject.getPath(), p1+separator+oobject.getName()+separator, p2);
                }
                i = i + 1;
             }
          }
       }
       return;
    }
    public static boolean c(File p0){
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       if (p0.isFile()) {
          if (!p0.delete()) {
             p0.deleteOnExit();
             return b;
          }else {
             return true;
          }
       }else if(!p0.isDirectory()){
          return b;
       }else {
          File[] uFileArray = p0.listFiles();
          if (uFileArray != null) {
             int len = uFileArray.length;
             for (; b < len; b = b + 1) {
                c.c(uFileArray[b]);
             }
          }
          return p0.delete();
       }
    }
    public static File d(Context p0){
       File uFile = new File(Environment.getDataDirectory().getPath()+"/data/"+p0.getPackageName()+"/temp/");
       if (uFile.exists()) {
          uFile.delete();
       }
       uFile.mkdirs();
       return uFile;
    }
}
