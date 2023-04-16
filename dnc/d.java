package dnc.d;
import erd.g;
import com.yxcorp.gifshow.upload.RickonWholeUploadInfo;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.PostLogger;
import java.lang.String;
import com.yxcorp.gifshow.upload.UploadInfo;
import com.yxcorp.gifshow.log.PostSubTaskEvent;
import com.yxcorp.gifshow.log.PostLogger$Status;

public final class d implements g	// class@002295
{
    public final RickonWholeUploadInfo b;

    public void d(RickonWholeUploadInfo p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       PostLogger postLogger = new PostLogger().b("CloudVideoUploader");
       postLogger.k(tb.getSessionId());
       postLogger.h(PostSubTaskEvent.UPLOAD_COVER).i(tb.getId()).j(PostLogger$Status.ERROR).l(p0).d();
    }
}
