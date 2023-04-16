package com.kwai.sdk.eve.internal.datacenter.internal.MatcherActionScheduler$schedule$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class MatcherActionScheduler$schedule$2 extends Lambda implements a	// class@0014c0
{
    public final String $scheduleKey;

    public void MatcherActionScheduler$schedule$2(String p0){
       this.$scheduleKey = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object obj = PatchProxy.apply(null, this, MatcherActionScheduler$schedule$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "DataStreamCenter->scheduleAction: timer:"+this.$scheduleKey+" has already added";
    }
}
