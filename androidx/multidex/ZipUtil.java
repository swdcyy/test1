package androidx.multidex.ZipUtil;
import java.lang.Object;
import java.io.RandomAccessFile;
import androidx.multidex.ZipUtil$CentralDirectory;
import java.util.zip.CRC32;
import java.lang.Math;
import java.lang.Integer;
import java.util.zip.ZipException;
import java.lang.String;
import java.lang.StringBuilder;
import java.io.File;

public final class ZipUtil	// class@00085d
{

    public void ZipUtil(){
       super();
    }
    public static long computeCrcOfCentralDir(RandomAccessFile p0,ZipUtil$CentralDirectory p1){
       CRC32 uCRC32 = new CRC32();
       ZipUtil$CentralDirectory size = p1.size;
       p0.seek(p1.offset);
       byte[] uobyteArray = new byte[0x4000];
       for (int i = p0.read(uobyteArray, 0, (int)Math.min(0x4000, size)); i != -1; i = p0.read(uobyteArray, 0, (int)Math.min(0x4000, l))) {
          uCRC32.update(uobyteArray, 0, i);
          long l = size - (long)i;
          if (!l) {
             break ;
          }else {
          }
       }
       return uCRC32.getValue();
    }
    public static ZipUtil$CentralDirectory findCentralDirectory(RandomAccessFile p0){
       long l = p0.length() - 22;
       String str = null;
       if (l - str < 0) {
          throw new ZipException("File too short to be a zip file: "+p0.length());
       }
       long l1 = l - 0x10000;
       if (l1 - str >= 0) {
          str = l1;
       }
       int i = Integer.reverseBytes(0x6054b50);
       while (true) {
          p0.seek(l);
          if (p0.readInt() == i) {
             p0.skipBytes(2);
             p0.skipBytes(2);
             p0.skipBytes(2);
             p0.skipBytes(2);
             ZipUtil$CentralDirectory uCentralDire = new ZipUtil$CentralDirectory();
             uCentralDire.size = (long)Integer.reverseBytes(p0.readInt()) & 0xffffffff;
             uCentralDire.offset = (long)Integer.reverseBytes(p0.readInt()) & 0xffffffff;
             return uCentralDire;
          }else {
             l = l - 1;
             if (l - str >= 0) {
             }else {
                break ;
             }
          }
       }
       throw new ZipException("End Of Central Directory signature not found");
    }
    public static long getZipCrc(File p0){
       RandomAccessFile randomAccess = new RandomAccessFile(p0, "r");
       randomAccess.close();
       return ZipUtil.computeCrcOfCentralDir(randomAccess, ZipUtil.findCentralDirectory(randomAccess));
    }
}
