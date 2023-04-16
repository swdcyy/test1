package b65.j;
import java.lang.Runnable;
import com.kwai.camerasdk.Daenerys;
import java.lang.Object;
import com.kwai.camerasdk.ErrorCode$Result;
import java.lang.StringBuilder;
import java.lang.String;
import com.kwai.camerasdk.log.Log;

public final class j implements Runnable	// class@00034f
{
    public final Daenerys b;

    public void j(Daenerys p0){
       this.b = p0;
    }
    public final void run(){
       j tb = this.b;
       int i = tb.nativeCreateSubPipeline(tb.c);
       if (i != ErrorCode$Result.kOk.getCode()) {
          Log.e("Daenerys", "call native createSubPipeline failed, ret:"+i);
       }
       return;
    }
}
