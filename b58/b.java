package b58.b;
import java.lang.Runnable;
import java.lang.String;
import com.mini.engine.EngineCallback;
import java.lang.Object;
import java.lang.StringBuilder;
import com.mini.d;
import java.lang.Exception;
import java.lang.Throwable;

public final class b implements Runnable	// class@0002fc
{
    public final String b;
    public final EngineCallback c;

    public void b(String p0,EngineCallback p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       String str = "没有和"+this.b+"对应的so信息";
       d.c("AppSoBackupDownloader", str);
       this.c.failed(new Exception(str));
    }
}
