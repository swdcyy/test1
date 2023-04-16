package com.kwai.sdk.eve.internal.common.scheduler.LabeledFutureTask;
import cn7.a;
import java.util.concurrent.FutureTask;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Runnable;
import com.kwai.sdk.eve.internal.common.scheduler.LabeledFutureTask$idHash$2;
import msd.a;
import qrd.p;
import qrd.s;
import cn7.d;
import java.util.concurrent.Callable;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import cn7.g;
import com.kuaishou.eve.packageinfo.model.ResourceType;
import cn7.c;

public final class LabeledFutureTask extends FutureTask implements a	// class@001481
{
    public final c b;
    public final g c;
    public final p d;

    public void LabeledFutureTask(a p0,Object p1){
       a.p(p0, "runnable");
       super(p0, p1);
       this.d = s.c(new LabeledFutureTask$idHash$2(this));
       this.b = p0;
       this.c = p0;
    }
    public void LabeledFutureTask(d p0){
       a.p(p0, "callable");
       super(p0);
       this.d = s.c(new LabeledFutureTask$idHash$2(this));
       this.b = p0;
       this.c = p0;
    }
    public List H(){
       Object obj = PatchProxy.apply(null, this, LabeledFutureTask.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.H();
    }
    public String dc(){
       Object obj = PatchProxy.apply(null, this, LabeledFutureTask.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.getValue();
    }
    public ResourceType getResource(){
       Object obj = PatchProxy.apply(null, this, LabeledFutureTask.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getResource();
    }
    public String m(){
       Object obj = PatchProxy.apply(null, this, LabeledFutureTask.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.m();
    }
    public String q(){
       Object obj = PatchProxy.apply(null, this, LabeledFutureTask.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.q();
    }
}
