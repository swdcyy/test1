package com.kuaishou.live.core.show.hourlytrank.strengthnotice.i$f;
import ky1.c;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.i;
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
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.j;
import fa2.a0;
import java.lang.Runnable;
import ba2.p;
import ba2.r;
import my1.e;
import java.lang.StringBuilder;
import java.lang.System;
import java.lang.Integer;

public class i$f extends c	// class@000c51
{
    public int b;
    public int c;
    public long d;
    public final i e;

    public void i$f(i p0){
       this.e = p0;
       super();
       this.d = 0xea60;
    }
    public void b(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$f.class, "1")) {
          return;
       }
       e d = p0.d;
       if (!d instanceof c) {
          return;
       }
       p0.b = (Math.max((d.d.waitEndTimestamp - this.e.b.s()), 3000) + 400) + 300;
       return;
    }
    public ViewGroup c(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i$f.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       return p0.findViewById(0x7f0a2690);
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, i$f.class, "9")) {
          return;
       }
       super.e();
       i$f te = this.e;
       i o = te.o;
       if (o != null) {
          te.c(o);
       }
       return;
    }
    public boolean g(){
       ViewGroup obj = PatchProxy.apply(null, this, i$f.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.c(this.e.a);
       boolean b = (obj != null && !obj.getVisibility())? true: false;
       return b;
    }
    public boolean h(e p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       i$f uof = i$f.class;
       e obj = PatchProxy.applyOneRefs(p0, this, uof, "2");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.applyOneRefs(p0, this, uof, "4");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          i$f te2 = this.e;
          b = (te2.d == null || (!p0.d instanceof c || te2.b() <= 0))? false: true;
       }
       if (!b) {
          return false;
       }else {
          obj = p0.d;
          if (!obj instanceof c) {
             return false;
          }else {
             this.c = obj.e;
             b.Z(LiveLogTag.LIVE_ENHANCE_MESSAGE, "onShow hourly rank strength message");
             c d = p0.d.d;
             if (d == null) {
                b.P(LiveLogTag.HOURLY_RANK.appendTag("LivePopularityRankStrengthNoticeController"), "try show Strength Notice info is null");
                return false;
             }else if((d.battleDistrictRankEndTime - this.e.b.s()) - 0x2710 < 0){
                b.P(LiveLogTag.HOURLY_RANK.appendTag("LivePopularityRankStrengthNoticeController"), "try show Strength Notice lft time less than 10s");
                return false;
             }else {
                LiveHourlyRankStrengthNoticeView liveHourlyRa = new LiveHourlyRankStrengthNoticeView(this.e.d);
                this.e.o = liveHourlyRa;
                this.d = d.unfoldDuration;
                j oj = PatchProxy.apply(null, this, uof, "3");
                if (oj != patchProxyRe) {
                }else {
                   oj = new j(this);
                }
                liveHourlyRa.setNoticeViewDelegate(oj);
                ViewGroup viewGroup = this.c(this.e.a);
                if (viewGroup == null) {
                   b.P(LiveLogTag.HOURLY_RANK.appendTag("LivePopularityRankStrengthNoticeController"), "try show Strength Notice container is null");
                   return false;
                }else {
                   viewGroup.addView(liveHourlyRa);
                   this.e.o.j(d);
                   i$f te = this.e;
                   te.a(te.o);
                   this.d(p0, new a0(this, liveHourlyRa));
                   i$f te1 = this.e;
                   te1.l = true;
                   i f = te1.f;
                   if (f != null) {
                      f.h(te1.x);
                   }
                   return true;
                }
             }
          }
       }
    }
    public boolean i(e p0){
       LiveLogTag obj = PatchProxy.applyOneRefs(p0, this, i$f.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!p0 instanceof c) {
          return b;
       }
       if (this.e.l == null) {
          return b;
       }
       this.c = p0.e;
       obj = LiveLogTag.HOURLY_RANK;
       obj.appendTag("LivePopularityRankStrengthNoticeController");
       b.P(obj, "do update strength view");
       this.d = p0.d.unfoldDuration;
       b.P(obj.appendTag("LivePopularityRankStrengthNoticeController"), "update hourly rank showing strength notice");
       c d = p0.d;
       i o = this.e.o;
       if (o != null) {
          o.o(d);
       }
       return true;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, i$f.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveHourlyRankStrengthHandler@"+Integer.toHexString(System.identityHashCode(this));
    }
}
