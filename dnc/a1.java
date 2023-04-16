package dnc.a1;
import java.lang.Runnable;
import com.ks.ksuploader.KSUploader;
import java.lang.Object;
import qq.a;
import java.lang.String;
import q87.c;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;

public final class a1 implements Runnable	// class@002287
{
    public final KSUploader b;

    public void a1(KSUploader p0){
       this.b = p0;
    }
    public final void run(){
       Object[] objArray = new Object[0];
       a.D().w("PipelineUploadTask", "cancelIfNeeded: switch to Async thread, ksUploader cancel", objArray);
       this.b.cancel();
       return;
    }
}
