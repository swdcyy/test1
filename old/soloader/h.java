package old.soloader.h;
import java.io.File;
import java.io.IOException;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Object;
import java.io.RandomAccessFile;
import java.io.FileDescriptor;
import java.lang.Throwable;
import old.soloader.h$a;
import android.os.Build;

public final class h	// class@002017
{

    public static void a(File p0){
       if (p0.isDirectory()) {
          File[] uFileArray = p0.listFiles();
          if (uFileArray == null) {
             return;
          }else {
             int len = uFileArray.length;
             for (int i = 0; i < len; i = i + 1) {
                h.a(uFileArray[i]);
             }
          }
       }
       if (p0.delete() || !p0.exists()) {
          return;
       }else {
          throw new IOException("could not delete: "+p0);
       }
    }
    public static void b(File p0){
       if (p0.isDirectory()) {
          File[] uFileArray = p0.listFiles();
          if (uFileArray != null) {
             for (int i = 0; i < uFileArray.length; i++) {
                h.b(uFileArray[i]);
             }
          }else {
             throw new IOException("cannot list directory "+p0);
          }
       }else if((p0.getPath()).endsWith("_lock")){
          RandomAccessFile randomAccess = new RandomAccessFile(p0, "r");
          randomAccess.getFD().sync();
          randomAccess.close();
       }
       return;
    }
    public static String[] c(){
       h$a.b();
       return Build.SUPPORTED_ABIS;
    }
}
