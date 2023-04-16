package com.kwaishou.merchant.daccore.data.PendantDataServer$e;
import tu.h;
import com.kwaishou.merchant.daccore.data.PendantDataServer;
import com.kuaishou.bowl.data.center.data.model.live.signal.SignalPendant;
import java.lang.Object;
import java.util.Map;
import f08.f;
import java.lang.StringBuilder;
import java.lang.String;
import f08.f$a;
import com.kwaishou.merchant.daccore.data.model.DataSource;
import kotlin.Pair;
import qrd.r0;
import trd.t0;
import java.lang.Throwable;

public final class PendantDataServer$e implements h	// class@001311
{
    public final PendantDataServer a;
    public final SignalPendant b;
    public final long c;
    public final int d;

    public void PendantDataServer$e(PendantDataServer p0,SignalPendant p1,long p2,int p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void b(Map p0){
       if (p0 != null) {
          f$a a = f.a;
          PendantDataServer i = this.a.i;
          StringBuilder str = "requestMaterialFromSignal success:";
          PendantDataServer$e tb = this.b;
          SignalPendant pendantCode = (tb != null)? tb.pendantCode: null;
          f$a.u(a, i, str+pendantCode+'_'+this.c, false, null, 12, null);
          this.a.k(this.d, p0, DataSource.MATERIAL);
       }
       return;
    }
    public void onFailed(String p0){
       f$a a = f.a;
       PendantDataServer i = this.a.i;
       Pair[] pairArray = new Pair[2];
       StringBuilder str = "";
       PendantDataServer$e tb = this.b;
       SignalPendant pendantCode = (tb != null)? tb.pendantCode: null;
       pairArray[0] = r0.a("pendantCode", str+pendantCode+'_'+this.c);
       int i1 = 1;
       if (p0 == null) {
          p0 = "";
       }
       pairArray[i1] = r0.a("errorMsg", p0);
       f$a.v(a, i, "requestMaterialFromSignal failed", null, false, t0.j0(pairArray), 8, null);
       return;
    }
}
