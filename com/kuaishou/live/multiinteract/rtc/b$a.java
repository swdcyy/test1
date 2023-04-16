package com.kuaishou.live.multiinteract.rtc.b$a;
import mh3.d$a;
import com.kuaishou.live.multiinteract.rtc.b;
import java.lang.Object;
import mh3.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import oh3.f;
import com.kuaishou.live.multiinteract.rtc.a;
import com.kuaishou.live.multiinteract.rtc.RtcLeaveReason;

public class b$a implements d$a	// class@000d00
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public void a(){
       c.a(this);
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, b$a.class, "1")) {
          return;
       }
       this.a.b.a("onRtcStateIdle");
       b o = this.a.o;
       if (o != null) {
          o.d();
       }
       this.a.y(RtcLeaveReason.ARYA_STOP);
       return;
    }
}
