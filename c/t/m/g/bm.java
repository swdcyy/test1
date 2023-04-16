package c.t.m.g.bm;
import java.io.Closeable;
import c.t.m.g.br;
import java.lang.String;
import c.t.m.g.by;
import java.io.File;
import c.t.m.g.bt;
import java.lang.StringBuilder;
import java.lang.Throwable;
import java.io.FileOutputStream;
import java.io.ByteArrayOutputStream;
import c.t.m.g.az;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import c.t.m.g.ba;

public class bm	// class@000beb
{

    public static void a(Closeable p0){
       br.a(p0);
    }
    public static void a(String p0,long p1){
       if (by.a(p0)) {
          return;
       }
       long l = 0;
       File uFile = null;
       File[] uFileArray = new File(p0).listFiles();
       int len = uFileArray.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = uFileArray[i];
          if (uFile == null || uFile.lastModified() - oobject.lastModified() > 0) {
             uFile = oobject;
          }
          l = l + oobject.length();
       }
       if (l - p1 >= 0 && uFile != null) {
          if (bt.a()) {
             bt.a("FileUtil", "delete file "+uFile.getName()+":"+uFile.length()+",sumS:"+l+",maxS:"+p1);
          }
          uFile.delete();
       }
    label_007c :
       return;
    }
    public static boolean a(File p0,byte[] p1,boolean p2){
       FileOutputStream uFileOutputS = new FileOutputStream(p0, p2);
       uFileOutputS.write(p1);
       br.a(uFileOutputS);
       return true;
    }
    public static byte[] a(File p0){
       if (!p0.exists() || !p0.length() - null) {
          return ba.a;
       }
       ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
       byte[] uobyteArray = az.a().a(2048);
       BufferedInputStream uBufferedInp = new BufferedInputStream(new FileInputStream(p0));
       int i = uBufferedInp.read(uobyteArray);
       while (i != -1) {
          uByteArrayOu.write(uobyteArray, 0, i);
       }
       byte[] uobyteArray1 = uByteArrayOu.toByteArray();
       az.a().a(uobyteArray);
       br.a(uBufferedInp);
       br.a(uByteArrayOu);
       return uobyteArray1;
    }
}
