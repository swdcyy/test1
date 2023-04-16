package dnc.c1;
import java.lang.Runnable;
import com.yxcorp.gifshow.upload.PipelineUploadTask$a;
import java.lang.Object;
import java.util.Objects;
import com.yxcorp.gifshow.upload.PipelineUploadTask;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qq.a;
import q87.c;
import com.ks.ksuploader.KSUploader;

public final class c1 implements Runnable	// class@00228f
{
    public final PipelineUploadTask$a b;

    public void c1(PipelineUploadTask$a p0){
       this.b = p0;
    }
    public final void run(){
       PipelineUploadTask$a a = this.b.a;
       Objects.requireNonNull(a);
       if (PatchProxy.applyVoid(null, a, PipelineUploadTask.class, "4")) {
       }else if(a.a != null){
          Object[] objArray = new Object[0];
          a.D().w("PipelineUploadTask", "release\(\) mKsUploader", objArray);
          a.a.release();
       }
       return;
    }
}
