package com.yxcorp.gifshow.upload.t;
import erd.g;
import com.yxcorp.gifshow.upload.v;
import com.yxcorp.gifshow.upload.UploadInfo;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import okhttp3.Response;
import okhttp3.Request;
import okhttp3.HttpUrl;
import java.net.URL;
import ekd.p0;
import com.yxcorp.gifshow.upload.o1;
import com.yxcorp.gifshow.log.PostLogger;
import com.yxcorp.gifshow.log.PostSubTaskEvent;
import com.yxcorp.gifshow.log.PostLogger$Status;
import com.yxcorp.gifshow.postwork.e;

public class t implements g	// class@001ead
{
    public final UploadInfo b;
    public final v c;

    public void t(v p0,UploadInfo p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "1")) {
       }else {
          this.c.b.n(p0.n().request().url().host(), p0.o(p0.n().request().url().url().toString()), p0.n().sentRequestAtMillis(), this.b);
          p0 = new PostLogger().c("CoverAndFileUpload");
          p0.k(this.b.getSessionId());
          p0.h(PostSubTaskEvent.UPLOAD_COVER).i(this.b.getId()).j(PostLogger$Status.FINISH).d();
          e.a().d(e.c(this.b), "end_upload_cover");
       }
       return;
    }
}
