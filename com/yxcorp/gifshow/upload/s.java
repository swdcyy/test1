package com.yxcorp.gifshow.upload.s;
import erd.o;
import com.yxcorp.gifshow.upload.v;
import com.yxcorp.gifshow.upload.UploadInfo;
import ojd.f;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import com.yxcorp.gifshow.upload.UploadCoverResult;
import brd.t;
import f36.b;

public class s implements o	// class@001eaa
{
    public final UploadInfo b;
    public final f c;
    public final v d;

    public void s(v p0,UploadInfo p1,f p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, s.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          this.b.setCoverKey(p0.a().getCoverKey());
          ot = this.d.a.a(this.b, this.c);
       }
       return ot;
    }
}
