package dnc.e1;
import erd.g;
import com.yxcorp.gifshow.upload.o0;
import java.lang.Object;
import njd.a;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import okhttp3.Response;
import okhttp3.Request;
import okhttp3.HttpUrl;
import java.net.URL;
import ekd.p0;
import com.yxcorp.gifshow.upload.UploadInfo;
import dnc.x0;
import com.yxcorp.gifshow.upload.o1;
import com.yxcorp.gifshow.postwork.e;
import com.yxcorp.gifshow.log.PostLogger;
import com.yxcorp.gifshow.log.PostSubTaskEvent;
import com.yxcorp.gifshow.log.PostLogger$Status;

public final class e1 implements g	// class@002297
{
    public final o0 b;

    public void e1(o0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       e1 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, o0.class, "7")) {
       }else {
          tb.c.k(p0.o(p0.n().request().url().url().toString()), p0.n().request().url().host(), p0.n().sentRequestAtMillis(), tb.f.mSessionId, tb.a.c(tb.f));
          e.a().d(e.c(tb.f), "end_publish_task");
          p0 = new PostLogger().c("PipelineUploader");
          p0.k(tb.f.getSessionId());
          p0.h(PostSubTaskEvent.UPLOAD_PUBLISH).i(tb.f.getId()).j(PostLogger$Status.FINISH).d();
       }
       return;
    }
}
