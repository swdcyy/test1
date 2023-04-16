package com.yxcorp.gifshow.upload.x;
import f36.b;
import com.yxcorp.gifshow.upload.o1;
import java.lang.Object;
import wkd.b;
import gnc.b;
import ojd.f;
import brd.t;
import com.yxcorp.gifshow.upload.UploadInfo;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.log.PostLogger;
import com.yxcorp.gifshow.log.PostSubTaskEvent;
import com.yxcorp.gifshow.log.PostLogger$Status;
import com.yxcorp.gifshow.media.util.c;
import dnc.a;
import com.yxcorp.gifshow.upload.b2;
import dnc.c0;
import erd.o;
import dnc.d0;
import dnc.a0;
import erd.g;
import dnc.b0;
import java.util.Map;
import okhttp3.MultipartBody$Part;

public class x implements b	// class@001eb9
{
    public final b a;
    public o1 b;

    public void x(o1 p0){
       super();
       this.a = b.a(-1142264700);
       this.b = p0;
    }
    public t a(Object p0,f p1){
       String str;
       t ot;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       x ox = x.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, ox, "1");
       if (obj != patchProxyRe) {
       }else {
          p0.mWholeUploadTryCount = p0.mWholeUploadTryCount + 1;
          Object obj1 = PatchProxy.applyTwoRefs(p0, p1, this, ox, "2");
          if (obj1 != patchProxyRe) {
             obj = obj1;
          }else {
             PostLogger postLogger = new PostLogger().c("FileUploader");
             postLogger.k(p0.getSessionId());
             postLogger.h(PostSubTaskEvent.UPLOAD_PUBLISH).i(p0.getId()).j(PostLogger$Status.BEGIN).g("上传整个文件").d();
             if (c.l(p0.getFilePath()) == 0x48323635) {
                str = String.valueOf(a.a(p0.getFilePath()));
                p0.setUploadFileCrc(str);
                ot = b2.c(p0).flatMap(new c0(this, p0, str, p1));
             }else {
                str = String.valueOf(a.a(p0.getFilePath()));
                p0.setUploadFileCrc(str);
                ot = b2.c(p0).flatMap(new d0(this, p0, str, p1));
             }
             obj = ot.doOnNext(new a0(p0)).doOnError(new b0(p0));
          }
       }
       return obj;
    }
    public final t b(UploadInfo p0,String p1,Map p2,MultipartBody$Part p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, x.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.isStory()) {
          return this.a.o(p1, p2, p3);
       }
       return this.a.p(p1, p2, p3);
    }
    public void cancel(){
    }
}
