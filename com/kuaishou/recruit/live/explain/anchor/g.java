package com.kuaishou.recruit.live.explain.anchor.g;
import it4.b;
import z1.k;
import z1.i;
import java.lang.Object;
import java.util.concurrent.CopyOnWriteArraySet;
import crd.a;
import it4.m;
import it4.l;
import com.kuaishou.livestream.message.nano.LivePlusRecruitMessages$LiveRecruitPanelDisplay;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Iterator;
import java.util.Set;
import mt4.b;
import brd.t;
import cjd.e;
import erd.o;
import it4.n;
import com.kuaishou.recruit.live.explain.anchor.f;
import erd.g;
import crd.b;

public class g	// class@000ebd
{
    public final k a;
    public final k b;
    public final k c;
    public final i d;
    public final b e;
    public boolean f;
    public LivePlusRecruitMessages$LiveRecruitPanelDisplay g;
    public final Set h;
    public final a i;
    public final g j;
    public final g k;

    public void g(b p0,k p1,k p2,k p3,i p4){
       super();
       this.h = new CopyOnWriteArraySet();
       this.i = new a();
       this.j = new m(this);
       this.k = new l(this);
       this.e = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
    }
    public final void a(boolean p0,LivePlusRecruitMessages$LiveRecruitPanelDisplay p1){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, og, "7")) {
          return;
       }
       g tf = this.f;
       this.f = p0;
       this.g = p1;
       if (tf != p0 && (!PatchProxy.isSupport(og) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, og, "8"))) {
          b.c0(LiveLogTag.LIVE_RECRUIT_EXPLAIN, "dispatchExplainStatusChanged", "enabled", Boolean.valueOf(p0));
          Iterator iterator1 = this.h.iterator();
          while (iterator1.hasNext()) {
             iterator1.next().a(p0);
          }
       }
       if (!p0 || (p1 != null && !PatchProxy.applyVoidOneRefs(p1, this, og, "9"))) {
          b.Z(LiveLogTag.LIVE_RECRUIT_EXPLAIN, "dispatchExplainPanelChanged");
          Iterator iterator = this.h.iterator();
          while (iterator.hasNext()) {
             iterator.next().b(p1, false);
          }
       }
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, g.class, "13")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_RECRUIT_EXPLAIN, "tryEndRecruitExplain");
       this.i.c(this.e.b(this.a.get(), 0).map(new e()).subscribe(new n(this), f.b));
       return;
    }
}
