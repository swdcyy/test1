package com.kwaishou.merchant.daccore.data.PendantDataServer$c;
import erd.g;
import com.kwaishou.merchant.daccore.data.PendantDataServer;
import com.kuaishou.bowl.data.center.data.model.live.signal.SignalPendant;
import java.lang.Object;
import java.lang.Throwable;
import f08.f;
import java.lang.StringBuilder;
import java.lang.String;
import f08.f$a;
import java.util.Map;

public final class PendantDataServer$c implements g	// class@00130e
{
    public final PendantDataServer b;
    public final SignalPendant c;

    public void PendantDataServer$c(PendantDataServer p0,SignalPendant p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       f$a.v(f.a, this.b.i, this.c.pendantCode+" request signal callBack api error:"+this.c.callbackApi, p0, false, null, 24, null);
    }
}
