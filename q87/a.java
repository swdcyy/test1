package q87.a;
import java.lang.Runnable;
import java.lang.Object;
import r87.i;
import r87.l;
import java.io.File;
import com.kwai.logger.KwaiLog;
import java.lang.String;
import q87.b;
import r87.g;
import s87.c;
import java.lang.Throwable;
import android.util.Log;

public final class a implements Runnable	// class@002245
{
    public final long b;

    public void a(long p0){
       this.b = p0;
    }
    public final void run(){
       a tb = this.b;
       int i = 3;
       try{
          i.a();
          l.b();
          File uFile = new File(KwaiLog.a.b());
          if (!uFile.exists()) {
             uFile.mkdirs();
          label_001d :
             g.b();
          }else {
             goto label_001d ;
          }
       }catch(java.lang.Exception e3){
          c.b().c(tb, i, Log.getStackTraceString(e3));
       }catch(java.lang.StackOverflowError e3){
          c.b().c(tb, i, Log.getStackTraceString(e3));
       }
       return;
    }
}
