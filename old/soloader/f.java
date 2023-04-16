package old.soloader.f;
import java.io.Closeable;
import java.io.File;
import java.lang.Object;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

public final class f implements Closeable	// class@002014
{
    public final FileOutputStream b;
    public final FileLock c;

    public void f(File p0){
       super();
       FileOutputStream uFileOutputS = new FileOutputStream(p0);
       this.b = uFileOutputS;
       FileLock uFileLock = uFileOutputS.getChannel().lock();
       if (uFileLock == null) {
          uFileOutputS.close();
       }
       this.c = uFileLock;
       return;
    }
    public void close(){
       f tc = this.c;
       if (tc != null) {
          tc.release();
       }
       this.b.close();
       return;
    }
}
