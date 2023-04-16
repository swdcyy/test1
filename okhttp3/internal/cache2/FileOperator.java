package okhttp3.internal.cache2.FileOperator;
import java.nio.channels.FileChannel;
import java.lang.Object;
import okio.b;
import java.nio.channels.WritableByteChannel;
import java.lang.IndexOutOfBoundsException;
import java.nio.channels.ReadableByteChannel;

public final class FileOperator	// class@001f81
{
    public final FileChannel fileChannel;

    public void FileOperator(FileChannel p0){
       super();
       this.fileChannel = p0;
    }
    public void read(long p0,b p1,long p2){
       if (p2 < 0) {
       label_0017 :
          throw new IndexOutOfBoundsException();
       }
       while (p2 > 0) {
          long l = this.fileChannel.transferTo(p0, p2, p1);
          p0 = p0 + l;
          p2 = p2 - l;
       }
       return;
    }
    public void write(long p0,b p1,long p2){
       IndexOutOfBoundsException indexOutOfBo = null;
       if (p2 - indexOutOfBo < 0 || p2 - p1.p() > 0) {
          throw new IndexOutOfBoundsException();
       }
       long l = p0;
       long l1 = p2;
       while (l1 - indexOutOfBo > 0) {
          long l2 = this.fileChannel.transferFrom(p1, l, l1);
          l = l + l2;
          l1 = l1 - l2;
       }
       return;
    }
}
