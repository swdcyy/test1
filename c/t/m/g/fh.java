package c.t.m.g.fh;
import android.content.Context;
import java.lang.Object;
import java.util.HashMap;
import java.lang.String;
import java.io.File;
import java.util.Map;
import java.nio.channels.FileChannel;
import java.io.FileOutputStream;
import java.nio.channels.FileLock;
import c.t.m.g.ex;
import java.lang.StringBuilder;
import java.lang.Throwable;
import c.t.m.g.fj;

public class fh	// class@000c8e
{
    public Context a;
    public Map b;
    public static fh c;
    public static final String d;

    public void fh(Context p0){
       super();
       this.a = null;
       this.b = null;
       this.a = p0;
       this.b = new HashMap(5);
    }
    public static synchronized fh a(Context p0){
       _monitor_enter(fh.class);
       if (fh.c == null) {
          fh.c = new fh(p0);
       }
       _monitor_exit(fh.class);
       return fh.c;
    }
    public synchronized boolean a(String p0){
       if (p0 == null || (p0.trim()).length() <= 0) {
          if (ex.a) {
             ex.a(fh.d, "taskName="+p0+" is null");
          }
          return false;
       }else {
          File uFile = this.c(p0);
          if (uFile == null) {
             return true;
          }
          FileChannel uFileChannel = this.b.get(p0);
          if (uFileChannel == null || !uFileChannel.isOpen()) {
             uFileChannel = new FileOutputStream(uFile).getChannel();
             this.b.put(p0, uFileChannel);
          }
          FileLock uFileLock = uFileChannel.lock();
          if (uFileLock != null && uFileLock.isValid()) {
             if (ex.a) {
                ex.a(fh.d, "task "+p0+"is locked!!");
             }
             return true;
          }else {
             return false;
          }
       }
    }
    public synchronized void b(String p0){
       if (p0 == null || (p0.trim()).length() <= 0) {
          return;
       }
       FileChannel uFileChannel = this.b.get(p0);
       if (uFileChannel != null) {
          uFileChannel.close();
          if (ex.a) {
             ex.b(fh.d, "taskName="+p0+" is released");
          }
       }
       return;
    }
    public synchronized File c(String p0){
       File uFile;
       try{
          uFile = new File(fj.b(this.a, "TMLSDK_lock"+File.separator+p0+".lock"));
          if (!uFile.exists()) {
             File uFile1 = new File(uFile.getParent());
             if (!uFile1.exists()) {
                uFile1.mkdirs();
                uFile.createNewFile();
             }
          }
       }catch(java.io.IOException e0){
          uFile = null;
       }
       return uFile;
    }
}
