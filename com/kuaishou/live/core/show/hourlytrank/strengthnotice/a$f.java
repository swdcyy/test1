package com.kuaishou.live.core.show.hourlytrank.strengthnotice.a$f;
import ky1.c;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.a;
import hy1.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import my1.c;
import com.kuaishou.livestream.message.nano.LiveDistrictRankFinalBattle$SCLiveBattleDistrictRank;
import p91.m;
import java.lang.Math;
import android.view.View;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeView;
import java.lang.Boolean;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.List;
import android.content.Context;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeView$e;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.b;
import fa2.c;
import java.lang.Runnable;
import ba2.p;
import ba2.r;
import my1.e;
import java.lang.StringBuilder;
import java.lang.System;
import java.lang.Integer;

public class a$f extends c	// class@000c42
{
    public int b;
    public long c;
    public final a d;

    public void a$f(a p0){
       this.d = p0;
       super();
       this.c = 0xea60;
    }
    public void b(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$f.class, "1")) {
          return;
       }
       e d = p0.d;
       if (!d instanceof c) {
          return;
       }
       p0.b = (Math.max((d.d.waitEndTimestamp - this.d.b.s()), 3000) + 400) + 300;
       return;
    }
    public ViewGroup c(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$f.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       return p0.findViewById(0x7f0a2690);
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, a$f.class, "9")) {
          return;
       }
       super.e();
       a$f td = this.d;
       a n = td.n;
       if (n != null) {
          td.c(n);
       }
       return;
    }
    public boolean g(){
       ViewGroup obj = PatchProxy.apply(null, this, a$f.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.c(this.d.a);
       boolean b = (obj != null && !obj.getVisibility())? true: false;
       return b;
    }
    public boolean h(e p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a$f uof = a$f.class;
       c obj = PatchProxy.applyOneRefs(p0, this, uof, "2");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.applyOneRefs(p0, this, uof, "4");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          a$f td2 = this.d;
          b = (td2.d == null || (!p0.d instanceof c || td2.b() <= 0))? false: true;
       }
       if (!b) {
          return false;
       }else {
          b.Z(LiveLogTag.LIVE_ENHANCE_MESSAGE, "onShow hourly rank strength message");
          obj = p0.d.d;
          if (obj == null) {
             b.P(LiveLogTag.HOURLY_RANK.appendTag("LiveHourlyRankStrengthNoticeController"), "try show Strength Notice info is null");
             return false;
          }else if((obj.battleDistrictRankEndTime - this.d.b.s()) - 0x2710 < 0){
             b.P(LiveLogTag.HOURLY_RANK.appendTag("LiveHourlyRankStrengthNoticeController"), "try show Strength Notice lft time less than 10s");
             return false;
          }else {
             this.b = obj.rankRegionType;
             LiveHourlyRankStrengthNoticeView liveHourlyRa = new LiveHourlyRankStrengthNoticeView(this.d.d);
             this.d.n = liveHourlyRa;
             this.c = obj.unfoldDuration;
             b uob = PatchProxy.apply(null, this, uof, "3");
             if (uob != patchProxyRe) {
             }else {
                uob = new b(this);
             }
             liveHourlyRa.setNoticeViewDelegate(uob);
             ViewGroup viewGroup = this.c(this.d.a);
             if (viewGroup == null) {
                b.P(LiveLogTag.HOURLY_RANK.appendTag("LiveHourlyRankStrengthNoticeController"), "try show Strength Notice container is null");
                return false;
             }else {
                viewGroup.addView(liveHourlyRa);
                this.d.n.j(obj);
                a$f td = this.d;
                td.a(td.n);
                this.d(p0, new c(this, liveHourlyRa));
                a$f td1 = this.d;
                td1.k = true;
                a f = td1.f;
                if (f != null) {
                   f.h(td1.w);
                }
                return true;
             }
          }
       }
    }
    public boolean i(e p0){
       c obj = PatchProxy.applyOneRefs(p0, this, a$f.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!p0 instanceof c) {
          return b;
       }
       if (this.d.k == null) {
          return b;
       }
       obj = p0.d;
       this.b = obj.rankRegionType;
       this.c = obj.unfoldDuration;
       b.P(LiveLogTag.HOURLY_RANK.appendTag("LiveHourlyRankStrengthNoticeController"), "update hourly rank showing strength notice");
       c d = p0.d;
       a n = this.d.n;
       if (n != null) {
          n.o(d);
       }
       return true;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a$f.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveHourlyRankStrengthHandler@"+Integer.toHexString(System.identityHashCode(this));
    }
}
