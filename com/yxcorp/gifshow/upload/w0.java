package com.yxcorp.gifshow.upload.w0;
import erd.o;
import com.yxcorp.gifshow.upload.SegmentUploader;
import com.yxcorp.gifshow.upload.UploadInfo;
import java.lang.Object;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.w;
import com.yxcorp.gifshow.log.PostLogger;
import com.yxcorp.gifshow.log.PostSubTaskEvent;
import com.yxcorp.gifshow.log.PostLogger$Status;
import java.util.Objects;
import brd.t;
import com.yxcorp.gifshow.upload.b2;
import dnc.y1;
import com.yxcorp.gifshow.upload.SegmentUploader$SegmentUploadFailedException;
import java.lang.Throwable;
import com.kwai.framework.network.util.HttpDownloadUtil$UserCancelledException;

public class w0 implements o	// class@001eb4
{
    public final UploadInfo b;
    public final SegmentUploader c;

    public void w0(SegmentUploader p0,UploadInfo p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public Object apply(Object p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = PatchProxy.applyOneRefs(p0, this, w0.class, "1");
       if (obj != patchProxyRe) {
       }else {
          obj = "SegmentUploader";
          if (p0.booleanValue()) {
             p0 = new PostLogger().c(obj);
             p0.k(this.b.getSessionId());
             p0.h(PostSubTaskEvent.UPLOAD_ASSET).i(this.b.getId()).j(PostLogger$Status.FINISH).g(obj).d();
             p0 = this.c;
             w0 tb = this.b;
             Objects.requireNonNull(p0);
             Object obj1 = PatchProxy.applyOneRefs(tb, p0, SegmentUploader.class, "3");
             if (obj1 != patchProxyRe) {
                obj = obj1;
             }else {
                PostLogger postLogger = new PostLogger().c(obj);
                postLogger.k(tb.getSessionId());
                postLogger.h(PostSubTaskEvent.UPLOAD_PUBLISH).i(tb.getId()).j(PostLogger$Status.BEGIN).g("segmentPublish").d();
                obj = b2.c(tb).flatMap(new y1(p0, tb));
             }
          }else if(this.c.j == null){
             p0 = new PostLogger().b(obj);
             p0.k(this.b.getSessionId());
             p0.h(PostSubTaskEvent.UPLOAD_ASSET).i(this.b.getId()).j(PostLogger$Status.ERROR).l(new SegmentUploader$SegmentUploadFailedException()).d();
             obj = t.error(new SegmentUploader$SegmentUploadFailedException());
          }else {
             p0 = new PostLogger().b(obj);
             p0.k(this.b.getSessionId());
             p0.h(PostSubTaskEvent.UPLOAD_ASSET).i(this.b.getId()).j(PostLogger$Status.CANCEL).l(new HttpDownloadUtil$UserCancelledException()).d();
             obj = t.error(new HttpDownloadUtil$UserCancelledException());
          }
       }
       return obj;
    }
}
