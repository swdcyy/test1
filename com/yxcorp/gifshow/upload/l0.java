package com.yxcorp.gifshow.upload.l0;
import erd.o;
import com.yxcorp.gifshow.upload.o0;
import java.lang.String;
import java.lang.Object;
import java.util.Map;
import com.yxcorp.gifshow.upload.UploadInfo;
import com.yxcorp.gifshow.media.util.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import qq.a;
import q87.c;
import lnc.a1;
import gnc.b;
import t45.d;
import brd.z;
import dnc.e1;
import erd.g;
import dnc.f1;

public final class l0 implements o	// class@001e8b
{
    public final o0 b;
    public final String c;

    public void l0(o0 p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       l0 tb = this.b;
       l0 tc = this.c;
       String str = "fileType";
       if (c.l(tb.f.getFilePath()) == 0x48323635) {
          p0.put(str, "h265");
       }else {
          p0.put(str, "normal");
       }
       p0.put("fileKey", tc);
       t ot = PatchProxy.applyOneRefs(p0, tb, o0.class, "5");
       if (ot != PatchProxyResult.class) {
       }else {
          Object[] objArray = new Object[0];
          a.D().w("PipelineUploader", "pipelinePublish params", objArray);
          long l = a1.k();
          p0 = (tb.f.isStory())? tb.b.b(p0): tb.b.c(p0);
          ot = p0.observeOn(d.c).doOnNext(new e1(tb)).doOnError(new f1(tb, l));
       }
       return ot;
    }
}
