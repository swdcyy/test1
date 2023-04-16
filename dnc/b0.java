package dnc.b0;
import erd.g;
import com.yxcorp.gifshow.upload.UploadInfo;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.PostLogger;
import java.lang.String;
import com.yxcorp.gifshow.log.PostSubTaskEvent;
import com.yxcorp.gifshow.log.PostLogger$Status;

public final class b0 implements g	// class@00228a
{
    public final UploadInfo b;

    public void b0(UploadInfo p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b0 tb = this.b;
       PostLogger postLogger = new PostLogger().b("FileUploader");
       postLogger.k(tb.getSessionId());
       postLogger.h(PostSubTaskEvent.UPLOAD_PUBLISH).i(tb.getId()).j(PostLogger$Status.ERROR).l(p0).d();
    }
}
