package com.yxcorp.gifshow.log.d;
import erd.g;
import k2b.k;
import java.util.List;
import java.lang.Object;
import com.yxcorp.gifshow.log.model.response.OperationCollectResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.google.common.base.Optional;
import com.yxcorp.gifshow.log.realtime.CommentShowDao;
import java.lang.Iterable;
import org.greenrobot.greendao.AbstractDao;

public class d implements g	// class@001afd
{
    public final List b;
    public final k c;

    public void d(k p0,List p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
       }else {
          this.c.g = p0.mNextRequestPeriodInMs;
          if (this.c.f.isPresent()) {
             this.c.f.get().deleteInTx(this.b);
          }
       }
       return;
    }
}
