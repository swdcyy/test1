package com.yxcorp.gifshow.upload.y;
import f36.b;
import java.lang.Object;
import wkd.b;
import gnc.b;
import ojd.f;
import brd.t;
import com.yxcorp.gifshow.upload.UploadInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.log.PostLogger;
import com.yxcorp.gifshow.log.PostSubTaskEvent;
import com.yxcorp.gifshow.log.PostLogger$Status;
import com.yxcorp.gifshow.upload.b2;
import dnc.g0;
import erd.o;
import dnc.e0;
import erd.g;
import dnc.f0;

public class y implements b	// class@001ebc
{
    public final b a;

    public void y(){
       super();
       this.a = b.a(-1142264700);
    }
    public t a(Object p0,f p1){
       t ot = PatchProxy.applyTwoRefs(p0, p1, this, y.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          PostLogger postLogger = new PostLogger().c("ImageUploader");
          postLogger.k(p0.getSessionId());
          postLogger.h(PostSubTaskEvent.UPLOAD_PUBLISH).i(p0.getId()).j(PostLogger$Status.BEGIN).d();
          ot = b2.c(p0).flatMap(new g0(this, p0, p1)).doOnNext(new e0(p0)).doOnError(new f0(p0));
       }
       return ot;
    }
    public void cancel(){
    }
}
