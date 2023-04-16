package com.kuaishou.live.core.show.fansgroup.audience.superfansgroupluckybagpendant.a;
import oj0.a;
import com.kuaishou.live.core.show.fansgroup.audience.superfansgroupluckybagpendant.e;
import java.lang.Object;
import java.util.Map;
import crd.b;
import lnc.b9;
import l82.a;
import o02.e;
import java.lang.String;
import p91.m;
import t02.a0;
import brd.t;
import cjd.e;
import erd.o;
import i82.k;
import com.kuaishou.live.core.show.fansgroup.audience.superfansgroupluckybagpendant.b;
import erd.g;

public final class a implements a	// class@000b2e
{
    public final e b;

    public void a(e p0){
       this.b = p0;
    }
    public final void W(Map p0){
       a tb = this.b;
       b9.a(tb.R);
       tb.R = e.g().a(tb.L.getLiveStreamId(), tb.K.Z2.h("")).map(new e()).subscribe(new k(tb), b.b);
    }
}
