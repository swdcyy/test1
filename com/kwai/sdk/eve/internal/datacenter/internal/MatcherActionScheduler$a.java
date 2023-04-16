package com.kwai.sdk.eve.internal.datacenter.internal.MatcherActionScheduler$a;
import java.lang.Runnable;
import msd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class MatcherActionScheduler$a implements Runnable	// class@0014bf
{
    public final a b;

    public void MatcherActionScheduler$a(a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, MatcherActionScheduler$a.class, "1")) {
          return;
       }
       this.b.invoke();
       return;
    }
}
