package com.yxcorp.gifshow.upload.u;
import erd.g;
import com.yxcorp.gifshow.upload.v;
import com.yxcorp.gifshow.upload.UploadInfo;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import retrofit2.HttpException;
import retrofit2.p;
import okhttp3.Response;
import okhttp3.Request;
import okhttp3.HttpUrl;
import java.net.URL;
import ekd.p0;
import com.yxcorp.gifshow.upload.o1;
import java.lang.System;
import com.yxcorp.gifshow.log.PostLogger;
import com.yxcorp.gifshow.log.PostSubTaskEvent;
import com.yxcorp.gifshow.log.PostLogger$Status;
import com.yxcorp.gifshow.postwork.e;

public class u implements g	// class@001eb0
{
    public final UploadInfo b;
    public final v c;

    public void u(v p0,UploadInfo p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u.class, "1")) {
       }else if(p0 instanceof HttpException){
          p op = p0.response();
          this.c.b.m(op.g().request().url().host(), p0.o(op.g().request().url().url().toString()), op.g().sentRequestAtMillis(), this.b, p0);
       }else {
          this.c.b.m("unkownHost", "unkownIp", System.currentTimeMillis(), this.b, p0);
       }
       PostLogger postLogger = new PostLogger().b("CoverAndFileUpload");
       postLogger.k(this.b.getSessionId());
       postLogger.h(PostSubTaskEvent.UPLOAD_COVER).i(this.b.getId()).j(PostLogger$Status.ERROR).l(p0).d();
       e.a().d(e.c(this.b), "end_upload_cover_fail");
       return;
    }
}
