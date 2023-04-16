package dnc.e0;
import erd.g;
import com.yxcorp.gifshow.upload.UploadInfo;
import java.lang.Object;
import njd.a;
import com.yxcorp.gifshow.log.PostLogger;
import java.lang.String;
import com.yxcorp.gifshow.log.PostSubTaskEvent;
import com.yxcorp.gifshow.log.PostLogger$Status;

public final class e0 implements g	// class@002296
{
    public final UploadInfo b;

    public void e0(UploadInfo p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       e0 tb = this.b;
       p0 = new PostLogger().c("ImageUploader");
       p0.k(tb.getSessionId());
       p0.h(PostSubTaskEvent.UPLOAD_PUBLISH).i(tb.getId()).j(PostLogger$Status.FINISH).d();
    }
}
