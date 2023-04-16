package com.kuaishou.live.lite.longconnection.v2.ReconnectLogic;
import com.kuaishou.live.lite.longconnection.v2.ReconnectLogic$b;
import nsd.u;
import hf3.a;
import brd.t;
import msd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import crd.a;
import io.reactivex.subjects.PublishSubject;
import com.kuaishou.live.lite.longconnection.v2.ReconnectLogic$connectionInterruptHandler$1;
import com.kuaishou.live.lite.longconnection.v2.ReconnectLogic$c;
import lf3.a;
import com.kuaishou.live.lite.longconnection.v2.ReconnectLogic$a;
import erd.g;
import crd.b;
import krd.a;

public final class ReconnectLogic	// class@000a2e
{
    public final a a;
    public b b;
    public int c;
    public boolean d;
    public final PublishSubject e;
    public l f;
    public final ReconnectLogic$c g;
    public final a h;
    public final t i;
    public final a j;
    public static final ReconnectLogic$b k;

    static {
       ReconnectLogic.k = new ReconnectLogic$b(null);
    }
    public void ReconnectLogic(a p0,t p1,a p2){
       a.p(p0, "liveLongConnection");
       a.p(p1, "networkStateSignal");
       a.p(p2, "newRaceInfoFetcher");
       super();
       this.h = p0;
       this.i = p1;
       this.j = p2;
       p2 = new a();
       this.a = p2;
       this.d = true;
       PublishSubject publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create<Throwable>\(\)");
       this.e = publishSubje;
       this.f = ReconnectLogic$connectionInterruptHandler$1.INSTANCE;
       ReconnectLogic$c uoc = new ReconnectLogic$c(this);
       this.g = uoc;
       p0.B0(uoc);
       b uob = p1.subscribe(new ReconnectLogic$a(this));
       a.o(uob, "networkStateSignal.subsc¡­ndler\(true\)\n      }\n    }");
       a.b(p2, uob);
    }
}
