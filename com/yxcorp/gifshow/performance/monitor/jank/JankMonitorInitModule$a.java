package com.yxcorp.gifshow.performance.monitor.jank.JankMonitorInitModule$a;
import msd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import com.kwai.sdk.switchconfig.a;

public final class JankMonitorInitModule$a implements a	// class@000e88
{
    public int b;

    public void JankMonitorInitModule$a(){
       super();
       this.b = -1;
    }
    public Object invoke(){
       Integer integer = PatchProxy.apply(null, this, JankMonitorInitModule$a.class, "1");
       if (integer != PatchProxyResult.class) {
       }else if(this.b == -1){
          this.b = a.t().a("JankOptimizeThreshold", 42);
       }
       integer = Integer.valueOf(this.b);
       return integer;
    }
}
