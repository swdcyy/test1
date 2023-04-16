package com.yxcorp.gifshow.apm.TabApmTracker$c;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import com.yxcorp.gifshow.w;

public final class TabApmTracker$c implements Runnable	// class@001b96
{
    public static final TabApmTracker$c b;

    static {
       TabApmTracker$c.b = new TabApmTracker$c();
    }
    public void TabApmTracker$c(){
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, TabApmTracker$c.class, "1")) {
          return;
       }
       b.a(-1343064608).h();
       PatchProxy.onMethodExit(TabApmTracker$c.class, "1");
       return;
    }
}
