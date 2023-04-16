package v75.c;
import java.lang.Runnable;
import java.lang.Object;
import v75.d;
import java.io.File;
import android.content.Context;
import com.kwai.chat.kwailink.base.b;
import java.lang.String;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import v75.d$a;
import android.os.SystemClock;
import java.lang.StringBuilder;
import com.kwai.chat.kwailink.log.a;

public final class c implements Runnable	// class@002677
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final void run(){
       FileLock c;
       FileOutputStream b;
       File a = d.a;
       try{
          if (d.a == null) {
             d.a = new File(b.b().getFilesDir(), "kwailink.lock");
          label_0017 :
             if (!d.a.exists()) {
                d.a.createNewFile();
             }
             if (d.b == null) {
                d.b = new FileOutputStream(d.a.getAbsolutePath());
             }
             c = d.b.getChannel().lock();
             d.c = c;
             if (c != null && c.isValid()) {
                d$a e = d.e;
                if (e != null) {
                   e.a();
                }
             }
          }else {
             goto label_0017 ;
          }
       }catch(java.lang.Exception e0){
          long l = SystemClock.elapsedRealtime();
          if ((l - d.d) - 0xea60 >= 0) {
             d.d = l;
             a.b("FileLocker", "lockInternal, exception:"+e0);
          }
          c = d.c;
          if (c != null) {
             try{
                c.release();
                d.c = null;
             }catch(java.lang.Exception e0){
             }
          }
       }catch(java.lang.Exception e0){
       }
    }
}
