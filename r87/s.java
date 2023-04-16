package r87.s;
import q87.e;
import r87.q;
import r87.g;
import java.lang.Object;
import r87.h;
import java.lang.String;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel$MapMode;
import java.nio.MappedByteBuffer;
import java.nio.ByteBuffer;
import java.nio.Buffer;
import java.io.FileOutputStream;
import java.lang.Throwable;
import java.io.IOException;
import r87.a;
import r87.p;
import com.kwai.logger.KwaiLog;
import java.util.Iterator;
import java.lang.Boolean;
import q87.d;
import r87.b;
import r87.y;
import java.util.concurrent.locks.ReentrantLock;
import java.util.LinkedList;
import java.util.concurrent.BlockingQueue;
import r87.m;
import java.util.Objects;
import java.lang.StringBuilder;
import r87.r;
import java.lang.Runnable;
import f97.a;

public class s implements e	// class@00232d
{
    public p a;
    public File b;
    public boolean c;
    public g d;

    public void s(q p0,g p1){
       File uFile2;
       RandomAccessFile randomAccess;
       s os = this;
       q oq = p0;
       g og = p1;
       super();
       File uFile = null;
       os.b = uFile;
       boolean b = false;
       os.c = b;
       os.d = og;
       String str = os.e(p1.k(), p1.i().a);
       int i = 0x28000;
       int i1 = (oq.c != null)? 0x7d000: 0x28000;
       File uFile1 = new File(p1.k());
       if (uFile1.exists() && uFile1.isDirectory()) {
          ArrayList uArrayList = new ArrayList();
          File[] uFileArray = uFile1.listFiles();
          if (uFileArray != null && uFileArray.length) {
             int len = uFileArray.length;
             int i2 = 0;
             while (i2 < len) {
                object oobject = uFileArray[i2];
                if ((oobject.getName()).endsWith(".log")) {
                   uArrayList.add(oobject);
                }
                i2 = i2 + 1;
             }
             if (!uArrayList.isEmpty()) {
                Collections.sort(uArrayList);
                uFile2 = uArrayList.get((uArrayList.size() - 1));
             label_008b :
                os.b = uFile2;
                if (uFile2 == null || (uFile2.exists() && os.b.canWrite())) {
                   String str1 = os.e(p1.k(), p1.i().a);
                   if (oq.c != null) {
                      i = 0x7d000;
                   }
                   File uFile3 = new File(str1);
                   if (uFile3.exists() && !uFile3.length() - (long)i) {
                      long l = uFile3.length();
                      try{
                         str1 = "rw";
                         try{
                            randomAccess = new RandomAccessFile(uFile3, str1);
                            MappedByteBuffer mappedByteBu = randomAccess.getChannel().map(FileChannel$MapMode.READ_WRITE, 0, l);
                            int intx = mappedByteBu.getInt();
                            if ((long)intx - (l - 4) > 0 || intx <= 0) {
                               try{
                               label_0110 :
                                  randomAccess.close();
                               }catch(java.io.IOException e0){
                               }
                            }else {
                               byte[] uobyteArray = new byte[intx];
                               mappedByteBu.get(uobyteArray, b, intx);
                               mappedByteBu.clear();
                               mappedByteBu.putInt(b);
                               randomAccess.close();
                               uFile = uobyteArray;
                            }
                         }catch(java.io.IOException e0){
                         }catch(java.io.IOException e0){
                         }
                         if (uFile != null) {
                            s b1 = os.b;
                            try{
                               b1.getAbsolutePath();
                               FileOutputStream uFileOutputS = new FileOutputStream(os.b, true);
                               uFileOutputS.write(uFile, e0, uFile.length);
                               uFileOutputS.close();
                            }catch(java.io.IOException e0){
                               e0.printStackTrace();
                            }
                         }
                      }catch(java.io.IOException e0){
                         randomAccess = uFile;
                      }
                      if (randomAccess) {
                         goto label_0110 ;
                      }else {
                         goto label_0115 ;
                      }
                   }
                }
             }
          }
       }
       uFile2 = uFile;
       goto label_008b ;
    }
    public List a(List p0){
       s td = this.d;
       if (td == null) {
          return Collections.emptyList();
       }
       _monitor_enter(td);
       ArrayList uArrayList = new ArrayList();
       if (p0 != null && p0.size() > 0) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             File uFile = iterator.next();
             boolean b = false;
             if (uFile != null && uFile.exists()) {
                String absolutePath = uFile.getAbsolutePath();
                String absolutePath1 = td.d.getAbsolutePath();
                if (g.l(absolutePath) && !absolutePath.endsWith(absolutePath1)) {
                   b = uFile.delete();
                }
             }
             uArrayList.add(Boolean.valueOf(b));
          }
       }
       _monitor_exit(td);
       return uArrayList;
    }
    public void b(d p0,b p1){
       this.a.d(p0);
       s ta = this.a;
       ta.n = p1;
       ta.h.lock();
       p g = ta.g;
       if (g != null && g.size() > 0) {
          ta.i.offer(ta.g);
          ta.g = m.a().b();
       }
       ta.p = true;
       ta.h.unlock();
       return;
    }
    public List c(){
       s td = this.d;
       if (td == null) {
          return Collections.emptyList();
       }
       Objects.requireNonNull(td);
       ArrayList uArrayList = new ArrayList();
       g c = td.c;
       if (c != null && (c.exists() && td.c.isDirectory())) {
          File[] uFileArray = td.c.listFiles();
          if (uFileArray != null) {
             int len = uFileArray.length;
             int i = 0;
             while (i < len) {
                object oobject = uFileArray[i];
                String absolutePath = oobject.getAbsolutePath();
                if (g.l(absolutePath) && !absolutePath.equals(td.d.getAbsolutePath())) {
                   uArrayList.add(oobject);
                }
                i = i + 1;
             }
          }
       }
       return uArrayList;
    }
    public void d(d p0){
       this.a.d(p0);
    }
    public final String e(String p0,String p1){
       return p0+File.separator+p1+".mmap";
    }
    public synchronized void k(){
       if (this.c != null) {
          return;
       }
       this.c = true;
       a.a(new r(this));
       return;
    }
}
