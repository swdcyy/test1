package com.yxcorp.gifshow.photoad.download.h$a;
import erd.o;
import com.yxcorp.gifshow.photoad.download.h;
import java.lang.Object;
import com.yxcorp.gifshow.commercial.model.APKDownloadTask;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import com.yxcorp.gifshow.photoad.download.h$e;

public class h$a implements o	// class@000f80
{
    public final h b;

    public void h$a(h p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       h$a obj = PatchProxy.applyOneRefs(p0, this, h$a.class, "1");
       if (obj != PatchProxyResult.class) {
          p0 = obj;
       }else {
          obj = this.b;
          h g = obj.g;
          if (g != null) {
             g.a(obj.i());
          }
       }
       return p0;
    }
}
