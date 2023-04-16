package com.kuaishou.recruit.live.explain.audience.d;
import z1.k;
import java.lang.Object;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.ArrayList;
import oy.a;
import com.kuaishou.commercial.reporter.data.SignalMessageData;
import kt4.o;
import kt4.n;
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
import java.lang.System;
import ekd.j;
import com.kuaishou.livestream.message.nano.LivePlusRecruitMessages$LiveRecruitPanelButton;
import java.util.List;

public class d	// class@000ec5
{
    public final k a;
    public final k b;
    public final k c;
    public final k d;
    public final k e;
    public final k f;
    public boolean g;
    public boolean h;
    public LivePlusRecruitMessages$LiveRecruitPanelDisplay i;
    public final Set j;
    public b k;
    public final List l;
    public a m;
    public long n;
    public boolean o;
    public boolean p;
    public final SignalMessageData q;
    public final g r;
    public final g s;

    public void d(k p0,k p1,k p2,k p3,k p4,k p5){
       super();
       this.j = new CopyOnWriteArraySet();
       this.l = new ArrayList();
       this.m = a.k();
       this.q = new SignalMessageData();
       this.r = new o(this);
       this.s = new n(this);
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
    }
    public final void a(boolean p0,LivePlusRecruitMessages$LiveRecruitPanelDisplay p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uod, "8")) {
          return;
       }
       d tg = this.g;
       this.g = p0;
       this.i = p1;
       boolean b = true;
       if (tg != p0 && (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, "9"))) {
          b.c0(LiveLogTag.LIVE_RECRUIT_EXPLAIN, "dispatchExplainStatusChanged", "enabled", Boolean.valueOf(p0));
          Iterator iterator1 = this.j.iterator();
          while (iterator1.hasNext()) {
             iterator1.next().a(p0);
          }
          if (this.p == null) {
             this.q.mRecruitCompleteActionTimePeriodMs = System.currentTimeMillis() - this.n;
             this.p = b;
          }
       }
       if (!p0 || (p1 != null && !PatchProxy.applyVoidOneRefs(p1, this, uod, "10"))) {
          b.Z(LiveLogTag.LIVE_RECRUIT_EXPLAIN, "dispatchExplainPanelChanged");
          int i = 0;
          LivePlusRecruitMessages$LiveRecruitPanelButton type = (!j.h(p1.audienceButtonList))? p1.audienceButtonList[i].type: null;
          if (this.h == null || (p1.isMultiJob == null || (!this.l.contains(p1.jobId) || type == 4))) {
             b = false;
          }
          Iterator iterator = this.j.iterator();
          while (iterator.hasNext()) {
             iterator.next().b(p1, b);
          }
       }
       return;
    }
}
