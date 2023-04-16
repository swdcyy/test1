package com.yxcorp.gifshow.log.a0;
import erd.g;
import com.yxcorp.gifshow.log.c0;
import java.util.List;
import java.lang.Object;
import com.yxcorp.gifshow.log.model.response.UploadLogResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.log.policy.LogPolicy;
import com.yxcorp.gifshow.log.v;
import com.google.common.base.Optional;
import com.yxcorp.gifshow.log.realtime.RealShowDao;
import java.lang.Iterable;
import org.greenrobot.greendao.AbstractDao;

public class a0 implements g	// class@001af1
{
    public final List b;
    public final c0 c;

    public void a0(c0 p0,List p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a0.class, "1")) {
       }else {
          this.c.h(p0.mLogPolicy);
          a0 tc = this.c;
          tc.i = p0.mNextRequestPeriodInMs;
          if (tc.h.isPresent()) {
             this.c.h.get().deleteInTx(this.b);
          }
       }
       return;
    }
}
