package rg.b;
import rg.d$a;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import java.io.File;
import rg.e;
import rg.b$a;
import java.util.Objects;
import java.util.zip.ZipEntry;
import java.io.InputStream;
import java.util.zip.ZipFile;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.FileDescriptor;
import java.io.Closeable;
import com.getkeepsafe.relinker.MissingLibraryException;
import android.content.pm.ApplicationInfo;
import java.lang.System;
import java.lang.StringBuilder;

public class b implements d$a	// class@002379
{

    public void b(){
       super();
    }
    public void a(Context p0,String[] p1,String p2,File p3,e p4){
       Closeable uCloseable;
       Closeable uCloseable1;
       b$a uoa = this.c(p0, p1, p2, p4);
       if (uoa == null) {
          throw new MissingLibraryException(p2);
       }
       int i = 0;
       while (true) {
          int i1 = i + 1;
          if (i < 5) {
             try{
                Objects.requireNonNull(p4);
                if (p3.exists() || p3.createNewFile()) {
                   try{
                      InputStream inputStream = uoa.a.getInputStream(uoa.b);
                      try{
                         uCloseable1 = new FileOutputStream(p3);
                         try{
                            int i2 = 4096;
                            byte[] uobyteArray = new byte[i2];
                            long l = 0;
                            try{
                               int i3 = inputStream.read(uobyteArray);
                               while (i3 != -1) {
                                  uCloseable1.write(uobyteArray, false, i3);
                                  l = l + (long)i3;
                               }
                               uCloseable1.flush();
                               uCloseable1.getFD().sync();
                               if (l - p3.length()) {
                                  this.b(inputStream);
                               }else {
                                  this.b(inputStream);
                                  this.b(uCloseable1);
                                  p3.setReadable(true, false);
                                  p3.setExecutable(true, false);
                                  try{
                                     p3.setWritable(true);
                                     uoa = uoa.a;
                                     if (uoa != null) {
                                        uoa.close();
                                     }
                                  }catch(java.io.IOException e0){
                                  }
                               }
                            }catch(java.io.FileNotFoundException e0){
                            }catch(java.io.IOException e0){
                            }
                         label_004e :
                            this.b(uCloseable1);
                         }catch(java.io.FileNotFoundException e0){
                         }catch(java.io.IOException e0){
                         }
                      }catch(java.io.FileNotFoundException e0){
                         uCloseable1 = e0;
                      }catch(java.io.IOException e0){
                         uCloseable1 = e0;
                      }
                      this.b(uCloseable);
                      goto label_004e ;
                   }catch(java.io.FileNotFoundException e0){
                      uCloseable = e0;
                      uCloseable1 = uCloseable;
                   }catch(java.io.IOException e0){
                      uCloseable = e0;
                      uCloseable1 = uCloseable;
                      goto label_0085 ;
                   }
                }
                i = i1;
             }catch(java.io.IOException e0){
             }
          }else {
             try{
                Objects.requireNonNull(p4);
                uoa = uoa.a;
                if (uoa != null) {
                   uoa.close();
                }
                return;
             }catch(java.io.IOException e0){
             }
          }
       }
       return;
    }
    public final void b(Closeable p0){
       try{
          if (p0 != null) {
             p0.close();
          }
          return;
       }catch(java.io.IOException e0){
       }
    }
    public final b$a c(Context p0,String[] p1,String p2,e p3){
       String[] stringArray;
       ZipEntry entry;
       int i = p1;
       ApplicationInfo applicationI = p0.getApplicationInfo();
       ApplicationInfo splitSourceD = applicationI.splitSourceDirs;
       if (splitSourceD != null && splitSourceD.length) {
          stringArray = new String[(splitSourceD.length + 1)];
          stringArray[0] = applicationI.sourceDir;
          System.arraycopy(splitSourceD, 0, stringArray, 1, splitSourceD.length);
       }else {
          stringArray = new String[]{applicationI.sourceDir};
       }
       int len = stringArray.length;
       ZipFile zipFile = null;
       int i1 = 0;
       while (true) {
          if (i1 >= len) {
             return null;
          }
          object oobject = stringArray[i1];
          int i2 = 0;
       label_002b :
          int i3 = i2 + 1;
          if (i2 < 5) {
             try{
                zipFile = new ZipFile(new File(oobject), 1);
             }catch(java.io.IOException e0){
                i2 = i3;
                goto label_002b ;
             }
          }
          if (zipFile != null) {
             int i5 = 0;
             while (true) {
                i2 = i5 + 1;
                if (i5 < 5) {
                   i5 = i.length;
                   i3 = 0;
                   while (true) {
                      if (i3 < i5) {
                         Objects.requireNonNull(p3);
                         entry = zipFile.getEntry("lib"+File.separatorChar+i[i3]+File.separatorChar+p2);
                         if (entry != null) {
                            break ;
                         }else {
                            i3 = i3 + 1;
                         }
                      }else {
                         i5 = i2;
                      }
                   }
                   return new b$a(zipFile, entry);
                }
             }
          }
          int i4 = p2;
          i1 = i1 + 1;
       }
    }
}
