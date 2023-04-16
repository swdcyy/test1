package dnc.c;
import erd.g;
import com.yxcorp.gifshow.upload.RickonWholeUploadInfo;
import java.lang.Object;
import njd.a;
import com.yxcorp.gifshow.upload.UploadCoverResult;
import java.lang.String;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.upload.UploadInfo;
import com.yxcorp.gifshow.log.PostLogger;
import com.yxcorp.gifshow.log.PostSubTaskEvent;
import com.yxcorp.gifshow.log.PostLogger$Status;
import java.lang.StringBuilder;

public final class c implements g	// class@002291
{
    public final RickonWholeUploadInfo b;

    public void c(RickonWholeUploadInfo p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       if (!TextUtils.x(p0.a().getCoverKey())) {
          tb.setCoverKey(p0.a().getCoverKey());
          PostLogger postLogger = new PostLogger().c("CloudVideoUploader");
          postLogger.k(tb.getSessionId());
          postLogger.h(PostSubTaskEvent.UPLOAD_COVER).i(tb.getId()).j(PostLogger$Status.FINISH).g("cover key: "+p0.a().getCoverKey()).d();
       }
       return;
    }
}
