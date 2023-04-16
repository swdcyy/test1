package c.t.m.g.bf;
import java.io.File;
import c.t.m.g.az;
import java.lang.StringBuilder;
import java.lang.String;
import java.util.zip.GZIPOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.util.Locale;
import java.lang.Object;
import java.lang.Long;
import java.lang.Double;
import c.t.m.g.bt;
import java.lang.Throwable;
import c.t.m.g.bx;
import java.io.ByteArrayOutputStream;
import c.t.m.g.ba;

public class bf	// class@000be3
{

    public static boolean a(File p0,File p1,boolean p2){
       byte[] uobyteArray = az.a().a(2048);
       long l = p0.length();
       File uFile = new File(p0.getAbsolutePath()+".tmp");
       GZIPOutputStream gZIPOutputSt = new GZIPOutputStream(new FileOutputStream(uFile));
       FileInputStream uFileInputSt = new FileInputStream(p0);
       int i = uFileInputSt.read(uobyteArray);
       while (i != -1) {
          gZIPOutputSt.write(uobyteArray, 0, i);
       }
       uFileInputSt.close();
       gZIPOutputSt.close();
       if (p2) {
          p0.delete();
       }
       uFile.renameTo(p1);
       long l1 = p1.length();
       Object[] objArray = new Object[]{p0.getName(),Long.valueOf(l),p1.getName(),Long.valueOf(l1),Double.valueOf(((double)l1 / (double)l))};
       bt.a("CompressUtil", String.format(Locale.ENGLISH, "compressFileGzip:%s,%d,%s,%d,%.2f", objArray));
       az.a().a(uobyteArray);
       return 1;
    }
    public static byte[] a(byte[] p0){
       bx.a(p0);
       ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream(p0.length);
       GZIPOutputStream gZIPOutputSt = new GZIPOutputStream(uByteArrayOu);
       gZIPOutputSt.write(p0);
       gZIPOutputSt.close();
       p0 = uByteArrayOu.toByteArray();
       uByteArrayOu.close();
       return p0;
    }
}
