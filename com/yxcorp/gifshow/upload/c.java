package com.yxcorp.gifshow.upload.c;
import erd.o;
import com.yxcorp.gifshow.upload.g;
import com.yxcorp.gifshow.upload.RickonWholeUploadInfo;
import java.lang.Object;
import njd.a;
import java.util.Objects;
import qq.a;
import com.yxcorp.gifshow.upload.UploadCoverResult;
import java.lang.String;
import q87.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import com.yxcorp.gifshow.log.PostLogger;
import com.yxcorp.gifshow.upload.UploadInfo;
import com.yxcorp.gifshow.log.PostSubTaskEvent;
import com.yxcorp.gifshow.log.PostLogger$Status;
import java.lang.StringBuilder;
import dnc.b;
import java.util.List;
import io.reactivex.g;
import t45.d;
import brd.z;

public final class c implements o	// class@001e66
{
    public final g b;
    public final RickonWholeUploadInfo c;

    public void c(g p0,RickonWholeUploadInfo p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       c tb = this.b;
       c tc = this.c;
       Objects.requireNonNull(tb);
       Object[] objArray = new Object[0];
       a.D().w("CloudVideoUploader", p0.a().toString(), objArray);
       p0 = tc.mHttpEndpoint;
       RickonWholeUploadInfo mServerInfoL = tc.mServerInfoList;
       RickonWholeUploadInfo mUploadToken = tc.mUploadToken;
       t ot = PatchProxy.applyFourRefs(p0, mServerInfoL, mUploadToken, tc, tb, g.class, "2");
       if (ot != PatchProxyResult.class) {
       }else {
          PostLogger postLogger = new PostLogger().c("CloudVideoUploader");
          postLogger.k(tc.getSessionId());
          postLogger.h(PostSubTaskEvent.UPLOAD_ASSET).i(tc.getId()).j(PostLogger$Status.BEGIN).g("startPipelineUpload fileKey: "+mUploadToken+" resumeUrl="+p0).d();
          b uob = new b(tb, tc, mUploadToken, mServerInfoL, p0);
          ot = t.create(v6);
       }
       return ot.subscribeOn(d.c);
    }
}
