package azb.l;
import java.lang.Runnable;
import com.yxcorp.gifshow.upload.UploadInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import azb.l$a;
import t45.c;

public final class l implements Runnable	// class@000378
{
    public final UploadInfo b;

    public void l(UploadInfo p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, l.class, "1")) {
          return;
       }
       String taskIdFromPh = this.b.getTaskIdFromPhotoMeta();
       a.o(taskIdFromPh, "uploadInfo.taskIdFromPhotoMeta");
       c.a(new l$a(this, taskIdFromPh));
       return;
    }
}
