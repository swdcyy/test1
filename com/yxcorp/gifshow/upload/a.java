package com.yxcorp.gifshow.upload.a;
import erd.o;
import com.yxcorp.gifshow.upload.AggregatedUploader;
import com.yxcorp.gifshow.upload.UploadInfo;
import ojd.f;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import com.yxcorp.retrofit.model.KwaiException;
import brd.t;
import f36.b;

public class a implements o	// class@001e5f
{
    public final UploadInfo b;
    public final f c;
    public final AggregatedUploader d;

    public void a(AggregatedUploader p0,UploadInfo p1,f p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (ot != PatchProxyResult.class) {
       }else if(p0 instanceof KwaiException){
          if (p0.getErrorCode() != 232) {
             ot = t.error(p0);
          }else {
             this.d.b(this.b, "ks://upload_segment_crc");
          }
       }
       ot = this.d.a.a(this.b, this.c);
       return ot;
    }
}
