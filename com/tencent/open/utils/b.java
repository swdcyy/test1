package com.tencent.open.utils.b;
import com.tencent.open.utils.l;
import com.tencent.open.utils.m;
import java.io.File;
import java.lang.String;
import java.io.RandomAccessFile;
import com.tencent.open.utils.b$a;
import com.tencent.open.utils.b$1;
import java.util.Properties;
import java.util.zip.ZipException;

public final class b	// class@000f75
{
    public static final l a;
    public static final m b;

    static {
       b.a = new l(0x6054b50);
       b.b = new m(0x96fb);
    }
    public static m a(){
       return b.b;
    }
    public static String a(File p0){
       return b.a(p0, "channelNo");
    }
    public static String a(File p0,String p1){
       RandomAccessFile randomAccess = new RandomAccessFile(p0, "r");
       byte[] uobyteArray = b.a(randomAccess);
       if (uobyteArray == null) {
          randomAccess.close();
          return null;
       }else {
          b$a uoa = new b$a(null);
          uoa.a(uobyteArray);
          randomAccess.close();
          return uoa.a.getProperty(p1);
       }
    }
    public static byte[] a(RandomAccessFile p0){
       long l = p0.length() - 22;
       p0.seek(l);
       byte[] uobyteArray = b.a.a();
       int i = p0.read();
       while (true) {
          int i1 = 1;
          if (i != -1) {
             if (i == uobyteArray[0] && (p0.read() == uobyteArray[i1] && (p0.read() == uobyteArray[2] && p0.read() == uobyteArray[3]))) {
             label_0044 :
                if (!i1) {
                   throw new ZipException("archive is not a ZIP archive");
                }
                p0.seek(((l + 16) + 4));
                byte[] uobyteArray1 = new byte[2];
                p0.readFully(uobyteArray1);
                int i2 = new m(uobyteArray1).b();
                if (!i2) {
                   break ;
                }else {
                   uobyteArray1 = new byte[i2];
                   p0.read(uobyteArray1);
                   return uobyteArray1;
                }
             }else {
                l = l - 1;
                p0.seek(l);
                i = p0.read();
             }
          }else {
             i1 = 0;
             goto label_0044 ;
          }
       }
       return null;
    }
}
