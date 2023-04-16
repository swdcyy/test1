package com.yxcorp.gifshow.upload.i1;
import erd.g;
import com.yxcorp.gifshow.upload.SegmentUploader;
import com.yxcorp.gifshow.upload.UploadInfo;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.log.PostLogger;
import com.yxcorp.gifshow.log.PostSubTaskEvent;
import com.yxcorp.gifshow.log.PostLogger$Status;
import zb6.a;
import java.util.Objects;
import com.yxcorp.gifshow.upload.o1;
import java.lang.Long;

public class i1 implements g	// class@001e83
{
    public final UploadInfo b;
    public final long c;
    public final long d;
    public final SegmentUploader e;

    public void i1(SegmentUploader p0,UploadInfo p1,long p2,long p3){
       this.e = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void accept(Object p0){
       Object obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, this, i1.class, "1")) {
       }else {
          p0 = new PostLogger().b("SegmentUploader");
          p0.k(this.b.getSessionId());
          p0.h(PostSubTaskEvent.UPLOAD_ASSET).i(this.b.getId()).j(PostLogger$Status.ERROR).l(obj).d();
          p0 = this.e;
          SegmentUploader e = p0.e;
          i1 tc = this.c;
          i1 td = this.d;
          SegmentUploader n = p0.n;
          String str = a.d(obj);
          String str1 = a.c(obj);
          i1 tb = this.b;
          Objects.requireNonNull(e);
          p0 = o1.class;
          if (PatchProxy.isSupport(p0)) {
             Object[] objArray = new Object[]{Long.valueOf(tc),Long.valueOf(td),Long.valueOf(n),str,str1,obj,tb};
             if (!PatchProxy.applyVoid(objArray, e, p0, "2")) {
             }
          }else {
          }
       }
       return;
    }
}
