package mk.a;
import java.lang.String;
import java.lang.Class;
import java.util.logging.Logger;
import java.lang.Object;
import java.io.RandomAccessFile;
import java.io.OutputStream;
import java.io.InputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.lang.Long;
import com.google.archivepatcher.applier.PatchFormatException;
import java.lang.Math;
import java.io.IOException;

public class a	// class@00268f
{
    public static final Logger a;

    static {
       a.a = Logger.getLogger(a.class.getName());
    }
    public void a(){
       super();
    }
    public static void a(RandomAccessFile p0,OutputStream p1,InputStream p2){
       BufferedOutputStream uBufferedOut = new BufferedOutputStream(p1, 0x4000);
       a.b(p0, uBufferedOut, new BufferedInputStream(p2, 4096), null);
       uBufferedOut.flush();
    }
    public static void b(RandomAccessFile p0,OutputStream p1,InputStream p2,Long p3){
       byte[] uobyteArray4;
       int i5;
       long l8;
       RandomAccessFile randomAccess = p0;
       InputStream inputStream = p2;
       int i = 16;
       byte[] uobyteArray = new byte[i];
       int i1 = 0;
       try{
          a.d(inputStream, uobyteArray, i1, i);
          if (!("ENDSLEY/BSDIFF43").equals(new String(uobyteArray, i1, i, "US-ASCII"))) {
             throw new PatchFormatException("bad signature");
          }
          long l = p0.length();
          int i2 = 0x7fffffff;
          if (l - i2 > 0) {
             throw new PatchFormatException("bad oldSize");
          }
          long l1 = a.c(p2);
          int i3 = 0;
          if (l1 - i3 < 0 || l1 - i2 > 0) {
             throw new PatchFormatException("bad newSize");
          }
          if (p3 != null && p3.longValue() - l1) {
             throw new PatchFormatException("expectedNewSize != newSize");
          }
          byte[] uobyteArray1 = new byte[0xc800];
          byte[] uobyteArray2 = new byte[0xc800];
          long l2 = i3;
          byte[] uobyteArray3 = uobyteArray1;
          long l3 = l2;
          while (true) {
             if (l2 - l1 >= 0) {
                return;
             }
             long l4 = a.c(p2);
             long l5 = a.c(p2);
             long l6 = a.c(p2);
             if ((v7 = l4 - i3) < 0 || l4 - 0x7fffffff > 0) {
                throw new PatchFormatException("bad diffSegmentLength");
             }
             if ((v23 = l5 - i3) < 0 || l5 - 0x7fffffff > 0) {
                throw new PatchFormatException("bad copySegmentLength");
             }
             if (l6 - -2147483648 < 0 || l6 - 0x7fffffff > 0) {
                throw new PatchFormatException("bad offsetToNextInput");
             }
             l2 = l2 + l4;
             l2 = l2 + l5;
             if (l2 - l1 > 0) {
                throw new PatchFormatException("expectedFinalNewDataBytesWritten too large");
             }
             long l7 = l3 + l4;
             l7 = l7 + l6;
             if (l7 - l > 0) {
                throw new PatchFormatException("expectedFinalOldDataOffset too large");
             }
             if (l7 - i3 >= 0) {
                randomAccess.seek(l3);
                if (v7 > 0) {
                   i2 = (int)l4;
                   while (i2 > 0) {
                      int i4 = Math.min(i2, 0xc800);
                      uobyteArray4 = uobyteArray3;
                      i5 = 0;
                      randomAccess.readFully(uobyteArray4, i5, i4);
                      l8 = l5;
                      a.d(p2, uobyteArray2, i5, i4);
                      for (int i6 = 0; i6 < i4; i6 = i6 + 1) {
                         int i7 = uobyteArray4[i6] + uobyteArray2[i6];
                         uobyteArray4[i6] = (byte)i7;
                      }
                      p1.write(uobyteArray4, i5, i4);
                      i2 = i2 - i4;
                      uobyteArray3 = uobyteArray4;
                      l5 = l8;
                      l8 = 0;
                   }
                }
                l8 = l5;
                uobyteArray4 = uobyteArray3;
                i5 = 0;
                OutputStream outputStream = p1;
                InputStream inputStream1 = p2;
                if (v23 > 0) {
                   i2 = (int)l8;
                   while (i2 > 0) {
                      i3 = Math.min(0xc800, i2);
                      a.d(inputStream1, uobyteArray4, i5, i3);
                      outputStream.write(uobyteArray4, i5, i3);
                      i2 = i2 - i3;
                   }
                }
                uobyteArray3 = uobyteArray4;
                l3 = l7;
                l8 = 0;
                OutputStream outputStream1 = outputStream;
             }else {
                break ;
             }
          }
          throw new PatchFormatException("expectedFinalOldDataOffset is negative");
       }catch(java.io.IOException e0){
          throw new PatchFormatException("truncated signature");
       }
    }
    public static final long c(InputStream p0){
       long l2;
       String str = null;
       long l1 = str;
       for (long l = 0; l < 64; l = l + 8) {
          l2 = (long)p0.read() << l;
          l1 = l1 | l2;
       }
       l2 = Long.MIN_VALUE;
       if (!l1 - l2) {
          throw new PatchFormatException("read negative zero");
       }
       if ((l2 & l1) - str) {
          l1 = - (Long.MAX_VALUE & l1);
       }
       return l1;
    }
    public static void d(InputStream p0,byte[] p1,int p2,int p3){
       int i = 0;
       while (true) {
          if (i >= p3) {
             return;
          }
          int i1 = p2 + i;
          int i2 = p3 - i;
          i1 = p0.read(p1, i1, i2);
          if (i1 != -1) {
             i = i + i1;
          }else {
             break ;
          }
       }
       throw new IOException("truncated input stream");
    }
}
