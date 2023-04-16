package com.kwai.sdk.eve.internal.datacenter.internal.MatcherActionScheduler$schedule$timerTask$1$run$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.sdk.eve.internal.datacenter.internal.MatcherActionScheduler$schedule$timerTask$1;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class MatcherActionScheduler$schedule$timerTask$1$run$1 extends Lambda implements a	// class@0014c1
{
    public final MatcherActionScheduler$schedule$timerTask$1 this$0;

    public void MatcherActionScheduler$schedule$timerTask$1$run$1(MatcherActionScheduler$schedule$timerTask$1 p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object obj = PatchProxy.apply(null, this, MatcherActionScheduler$schedule$timerTask$1$run$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "DataStreamCenter->scheduleAction: timer:"+this.this$0.c+" is in background, ignore this tick";
    }
}
