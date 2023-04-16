package lud.a;
import java.lang.Runnable;
import java.io.RandomAccessFile;
import java.lang.StringBuilder;
import java.lang.String;
import lud.b;
import java.io.File;
import java.lang.Thread;
import java.lang.System;
import qkd.b;
import java.io.Closeable;
import ekd.p;
import java.lang.IllegalArgumentException;
import java.lang.Exception;

public class a implements Runnable	// class@001cea
{
    public final byte[] b;
    public final File c;
    public final long d;
    public final boolean e;
    public final b f;
    public final boolean g;
    public boolean h;

    public final long a(RandomAccessFile p0){
       StringBuilder str = "";
       long filePointer = p0.getFilePointer();
       long l = filePointer;
       int i = 0;
       while (this.h != null) {
          int i1 = p0.read(this.b);
          if (i1 != -1) {
             int i2 = 0;
             while (i2 < i1) {
                byte b = this.b[i2];
                if (b != 10) {
                   char c = 13;
                   if (b != c) {
                      if (i) {
                         this.f.d(str);
                         str.setLength(0);
                         filePointer = (long)i2 + l;
                         filePointer = filePointer + 1;
                         i = 0;
                      }
                      str = str+(char)b;
                   }else if(i){
                      str = str+c;
                   }
                   i = 1;
                }else {
                   this.f.d(str);
                   str.setLength(0);
                   filePointer = (long)i2 + l;
                   filePointer = filePointer + 1;
                   i = 0;
                }
                i2 = i2 + 1;
             }
             l = p0.getFilePointer();
          }else {
             break ;
          }
       }
       p0.seek(filePointer);
       return filePointer;
    }
    public void run(){
       a tc1;
       RandomAccessFile randomAccess;
       long l2;
       long l = 0;
       Closeable uCloseable = null;
       int i = l;
       long l1 = i;
       try{
          while (this.h != null && uCloseable == null) {
             uCloseable = new RandomAccessFile(this.c, "r");
             Thread.sleep(this.d);
          }
          while (this.h != null) {
             a tc = this.c;
             if (tc == null) {
                throw new IllegalArgumentException("No specified file");
             }
             int i1 = 0;
             if (tc.exists() && tc.lastModified() - i > 0) {
                i1 = 1;
             }
             v7 = this.c.length() - l1;
             if (tc < 0) {
                tc = this.f;
                tc.c();
                tc1 = this.c;
                randomAccess = new RandomAccessFile(tc1, "r");
                p.b(uCloseable);
                l1 = l;
             }else if(tc > 0){
                l2 = this.a(uCloseable);
                l1 = System.currentTimeMillis();
             }else if(i1){
                uCloseable.seek(l);
                l2 = this.a(uCloseable);
                l1 = System.currentTimeMillis();
             }else if(this.g != null){
                p.b(uCloseable);
             }
             Thread.sleep(this.d);
             if (this.h != null && this.g != null) {
                tc1 = this.c;
                randomAccess = new RandomAccessFile(tc1, "r");
                randomAccess.seek(l1);
             }
             l2 = l1;
             l1 = l2;
             goto label_0099 ;
             uCloseable = randomAccess;
          }
          p.b(uCloseable);
          return;
       }catch(java.lang.Exception e0){
       }catch(java.io.FileNotFoundException e0){
          this.f.b();
       }catch(java.lang.InterruptedException e0){
       }catch(java.lang.InterruptedException e0){
       }catch(java.io.FileNotFoundException e0){
          this.f.b();
          goto label_0038 ;
       }catch(java.lang.Exception e0){
          uCloseable = randomAccess;
       }catch(java.io.FileNotFoundException e0){
          l1 = e0;
          uCloseable = randomAccess;
          goto label_0077 ;
       }
       this.f.a(e0);
       goto label_00c8 ;
    }
}
