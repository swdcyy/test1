package com.yxcorp.gifshow.upload.m0;
import com.ks.ksapi.b;
import com.yxcorp.gifshow.upload.o0;
import java.lang.Object;
import java.lang.String;
import ln.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import qq.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.log.PostLogger;
import com.yxcorp.gifshow.upload.UploadInfo;
import com.yxcorp.gifshow.log.PostSubTaskEvent;
import com.yxcorp.gifshow.log.PostLogger$Status;
import jnc.c;

public class m0 implements b	// class@001e8e
{
    public final o0 a;

    public void m0(o0 p0){
       this.a = p0;
       super();
    }
    public b fetchResumeInfo(String p0){
       PostLogger obj = PatchProxy.applyOneRefs(p0, this, m0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[0];
       a.D().s("PipelineUploader", "fetchResumeInfo fileKey: "+p0, objArray);
       obj = new PostLogger().c("PipelineUploader");
       obj.k(this.a.f.getSessionId());
       obj.h(PostSubTaskEvent.UPLOAD_ASSET).i(this.a.f.getId()).j(PostLogger$Status.PROCESSING).g("fetchResumeInfo fileKey: "+p0).d();
       return c.a(this.a.f.getSessionId(), p0, this.a.f);
    }
    public b fetchRickonToken(){
       PostLogger obj = PatchProxy.apply(null, this, m0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PostLogger().c("PipelineUploader");
       obj.k(this.a.f.getSessionId());
       obj.h(PostSubTaskEvent.UPLOAD_ASSET).i(this.a.f.getId()).j(PostLogger$Status.PROCESSING).g("fetchRickonToken").d();
       return c.a(this.a.f.getSessionId(), null, this.a.f);
    }
}
