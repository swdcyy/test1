package com.yxcorp.gifshow.upload.w;
import erd.o;
import dnc.z;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import qq.a;
import q87.c;
import njd.a;
import com.kwai.feature.post.api.feature.upload.model.UploadResult;
import brd.t;

public class w implements o	// class@001eb6
{
    public final z b;

    public void w(z p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       p0 = PatchProxy.applyOneRefs(p0, this, w.class, "1");
       if (p0 != PatchProxyResult.class) {
       }else {
          Object[] objArray = new Object[0];
          a.D().w("FakeUploader", "upload fake complete", objArray);
          a uoa = new a(UploadResult.FAKE_UPLOAD_RESULT, 0, "success", "", -1, -1);
          p0 = t.just(a.D());
       }
       return p0;
    }
}
