package com.kuaishou.live.core.show.hourlytrank.c$e;
import ky1.h;
import com.kuaishou.live.core.show.hourlytrank.c;
import lp3.e;
import my1.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import my1.b;
import com.kuaishou.livestream.message.nano.TopDistrictRank;
import com.kwai.feature.api.live.service.show.hourlytrank.ranklist.LiveHourlyRankType;
import ba2.v;
import jt5.b;

public class c$e extends h	// class@000c00
{
    public final c f;

    public void c$e(c p0,e p1){
       this.f = p0;
       super(p1);
    }
    public void l(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$e.class, "1")) {
          return;
       }
       if (!p0 instanceof b) {
          return;
       }
       b d = p0.d;
       if (d.actionType == 1) {
          this.n(p0);
          c s = this.f.s;
          if (s != null) {
             s.a(v.d(d.jumpToTab), "PK_INVITE_NOTICE");
          }
       }
       return;
    }
}
