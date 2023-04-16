package com.yxcorp.gifshow.upload.g1;
import erd.o;
import com.yxcorp.gifshow.upload.SegmentUploader;
import com.yxcorp.gifshow.upload.UploadInfo;
import java.lang.Object;
import com.yxcorp.gifshow.upload.SegmentResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import brd.t;
import com.yxcorp.gifshow.upload.f1;
import erd.g;
import com.yxcorp.gifshow.upload.e1;
import com.yxcorp.gifshow.upload.d1;
import com.yxcorp.gifshow.upload.c1;
import com.yxcorp.gifshow.upload.b1;
import com.yxcorp.gifshow.upload.y0;
import com.yxcorp.gifshow.upload.x0;
import java.lang.Boolean;

public class g1 implements o	// class@001e7c
{
    public final int b;
    public final UploadInfo c;
    public final SegmentUploader d;

    public void g1(SegmentUploader p0,int p1,UploadInfo p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, g1.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          ot = t.range(0, this.d.g).doOnNext(new f1(this)).flatMap(new e1(this, p0)).doOnError(new d1(this)).buffer(this.d.g).map(new c1(this)).retryWhen(new b1(this)).doOnNext(new y0(this)).doOnError(new x0(this)).defaultIfEmpty(Boolean.FALSE);
       }
       return ot;
    }
}
