package com.kuaishou.live.core.voiceparty.core.shared.ktv.FailWithReason;
import java.lang.RuntimeException;
import java.lang.Throwable;
import nsd.u;

public final class FailWithReason extends RuntimeException	// class@001401
{
    public final int reason;

    public void FailWithReason(int p0,Throwable p1){
       super(p1);
       this.reason = p0;
    }
    public void FailWithReason(int p0,Throwable p1,int p2,u p3){
       if (p2 & 0x02) {
          p1 = null;
       }
       super(p0, p1);
       return;
    }
    public final int getReason(){
       return this.reason;
    }
}
