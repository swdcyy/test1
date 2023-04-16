package j89.l$c;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j89.l;
import com.yxcorp.gifshow.apm.SampleState;
import kotlin.jvm.internal.a;
import java.lang.Thread;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.concurrent.ConcurrentLinkedQueue;
import com.yxcorp.zcompress.ZstdDirectBufferCompressingStream;
import java.nio.channels.FileChannel;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.io.File;
import msd.p;

public final class l$c implements Runnable	// class@0027b4
{
    public static final l$c b;

    static {
       l$c.b = new l$c();
    }
    public void l$c(){
       super();
    }
    public final void run(){
       String str;
       String absolutePath;
       if (PatchProxy.applyVoid(null, this, l$c.class, "1")) {
          return;
       }
       l c = l.C;
       l.j = SampleState.BEFORE_END_TRACE;
       Thread y = l.y;
       if (y == null) {
          a.S("mSamplingThread");
       }
       y.join();
       y = l.z;
       if (y == null) {
          a.S("mDataProcessThread");
       }
       y.join();
       if (!l.a(c).isEmpty()) {
          str = CollectionsKt___CollectionsKt.Y2(l.a(c));
       }
       l.a(c).clear();
       l.l.clear();
       l.m.clear();
       ZstdDirectBufferCompressingStream w = l.w;
       if (w == null) {
          a.S("mOutputZstdStream");
       }
       w.close();
       FileChannel s = l.s;
       if (s == null) {
          a.S("mOutputZstdFileChannel");
       }
       s.close();
       FileOutputStream r = l.r;
       if (r == null) {
          a.S("mOutputZstdOutputStream");
       }
       r.close();
       s = l.v;
       if (s == null) {
          a.S("mOutputMmapRAFFileChannel");
       }
       s.close();
       RandomAccessFile u = l.u;
       if (u == null) {
          a.S("mOutputMmapRAFFile");
       }
       u.close();
       p h = l.h;
       if (h != null) {
          File q = l.q;
          if (q == null) {
             a.S("mOutputZstdFile");
          }
          str = q.getAbsolutePath();
          a.o(str, "mOutputZstdFile.absolutePath");
          File t = l.t;
          if (t == null) {
             a.S("mOutputMmapFile");
          }
          absolutePath = t.getAbsolutePath();
          a.o(absolutePath, "mOutputMmapFile.absolutePath");
          h.invoke(str, absolutePath);
       }
       return;
    }
}
