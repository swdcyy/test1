package com.yxcorp.gifshow.log.p;
import erd.g;
import com.yxcorp.gifshow.log.q;
import java.util.List;
import java.lang.Object;
import com.yxcorp.gifshow.log.model.response.UploadLogResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.log.policy.LogPolicy;
import com.yxcorp.gifshow.log.v;
import com.google.common.base.Optional;
import java.util.Iterator;
import com.yxcorp.gifshow.log.realtime.Operation;
import com.yxcorp.gifshow.log.realtime.OperationDao;
import org.greenrobot.greendao.AbstractDao;

public class p implements g	// class@001b24
{
    public final List b;
    public final q c;

    public void p(q p0,List p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "1")) {
       }else {
          this.c.h(p0.mLogPolicy);
          p tc = this.c;
          tc.g = p0.mNextRequestPeriodInMs;
          if (tc.f.isPresent()) {
             p0 = this.b.iterator();
             while (p0.hasNext()) {
                this.c.f.get().delete(p0.next());
             }
          }
       }
       return;
    }
}
