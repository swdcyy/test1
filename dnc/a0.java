package dnc.a0;
import erd.g;
import com.yxcorp.gifshow.upload.UploadInfo;
import java.lang.Object;
import njd.a;
import com.yxcorp.gifshow.log.PostLogger;
import java.lang.String;
import com.yxcorp.gifshow.log.PostSubTaskEvent;
import com.yxcorp.gifshow.log.PostLogger$Status;

public final class a0 implements g	// class@002286
{
    public final UploadInfo b;

    public void a0(UploadInfo p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a0 tb = this.b;
       p0 = new PostLogger().c("FileUploader");
       p0.k(tb.getSessionId());
       p0.h(PostSubTaskEvent.UPLOAD_PUBLISH).i(tb.getId()).j(PostLogger$Status.FINISH).d();
    }
}
