package com.yxcorp.gifshow.photoad.download.h$c;
import erd.o;
import com.yxcorp.gifshow.photoad.download.h;
import java.lang.Object;
import com.yxcorp.gifshow.commercial.model.APKDownloadTask;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import java.util.Map;

public class h$c implements o	// class@000f82
{
    public final h b;

    public void h$c(h p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       h obj = PatchProxy.applyOneRefs(p0, this, h$c.class, "1");
       if (obj != PatchProxyResult.class) {
          p0 = obj;
       }else {
          obj = this.b.k;
          if (obj != null && obj.get(Integer.valueOf(p0.mId)) != null) {
             this.b.k.remove(Integer.valueOf(p0.mId));
          }
       }
       return p0;
    }
}
