package com.yxcorp.gifshow.photoad.o;
import mxb.j0;
import java.lang.Object;
import java.util.HashSet;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import wkd.b;
import yx.i0;
import mxb.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import mxb.i0;
import java.lang.Integer;
import brd.a0;
import tkd.b;
import tkd.d;
import ol9.a;
import java.lang.StringBuilder;
import yx.j0;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.photoad.l;
import erd.g;
import crd.b;
import mxb.n0;
import com.yxcorp.gifshow.photoad.r;
import hy.e;
import java.util.Objects;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper$AdLogParamAppender;
import mxb.o0;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$VideoStatEvent;
import java.lang.Long;
import java.lang.Boolean;
import uh5.e;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import lnc.e6;
import lnc.e6$a;
import java.util.ArrayList;
import android.util.LruCache;
import lnc.e6$b;
import kp.r1;
import mxb.k0;
import java.util.List;
import ekd.k1;
import mxb.u0;
import java.lang.Runnable;
import t45.c;
import java.util.Map;
import z1.a;
import mxb.w0;
import java.util.Set;
import ekd.q;
import java.util.Iterator;
import java.util.Map$Entry;
import mxb.m0;
import mxb.l0;

public class o implements j0	// class@000fa3
{
    public final Set b;
    public int c;
    public j d;
    public boolean e;

    public void o(){
       super();
       this.b = new HashSet();
    }
    public void o(int p0,BaseFeed p1,PlcEntryStyleInfo p2){
       super();
       this.b = new HashSet();
       this.c = p0;
       this.d = b.a(0x1d6683e9).b(p1, p2);
    }
    public void o(int p0,j p1){
       super();
       this.b = new HashSet();
       this.c = p0;
       this.d = p1;
    }
    public void o(BaseFeed p0,int p1){
       super();
       this.b = new HashSet();
       this.c = p1;
       this.d = this.g(p0);
    }
    public static j0 z(){
       Object obj = PatchProxy.apply(null, null, o.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return i0.a();
    }
    public final void A(j p0,int p1){
       a0 uoa0;
       o oo = o.class;
       if (PatchProxy.isSupport(oo) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, oo, "21")) {
          return;
       }
       if (PatchProxy.isSupport(oo)) {
          uoa0 = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, oo, "29");
          if (uoa0 != PatchProxyResult.class) {
          label_0057 :
             if (uoa0 == null) {
                return;
             }else if(this.e != null){
                uoa0.T(d.c).Q(l.b);
             }else {
                uoa0.T(d.c).Q(new n0(this, p0));
             }
             return;
          }
       }
       d.a(0x4ffa335e).Si(p1, p0.a, p0);
       Object[] objArray = new Object[0];
       j0.f("AdvertisementLogReport", "adActionType: "+p1, objArray);
       uoa0 = p0.j(p1);
       goto label_0057 ;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, o.class, "2")) {
          return;
       }
       this.b(this.d, this.c);
       return;
    }
    public void b(j p0,int p1){
       o oo = o.class;
       if (PatchProxy.isSupport(oo) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, oo, "11")) {
          return;
       }
       this.A(p0, p1);
       r.h(p0, p1);
       if (p1 == 729) {
          e uoe = e.G();
          Objects.requireNonNull(uoe);
          e uoe1 = e.class;
          if (PatchProxy.isSupport(uoe1) && (!PatchProxy.applyVoidOneRefs(Integer.valueOf(1), uoe, uoe1, "24") && uoe.F())) {
             uoe.x = 1;
          }
       }
       return;
    }
    public void c(j p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "18")) {
          return;
       }
       int i = (p0.h())? 284: 120;
       this.A(p0, i);
       r.h(p0, i);
       return;
    }
    public j0 d(g p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.d.a(p0);
       return this;
    }
    public j0 e(int p0,BaseFeed p1){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, oo, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new o(p1, p0);
    }
    public j0 f(AdDataWrapper$AdLogParamAppender p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          this.d.a(new o0(p0));
       }
       return this;
    }
    public j g(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(0x1d6683e9).c(p0);
    }
    public void h(j p0,ClientStat$VideoStatEvent p1){
       e6$b uob;
       o oo = o.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, oo, "19")) {
          return;
       }
       if (p1 == null) {
          return;
       }
       p0.l("duration", Long.valueOf(p1.duration));
       p0.l("played_duration", Long.valueOf(p1.playedDuration));
       p0.l("downloaded", Boolean.valueOf(p1.downloaded));
       p0.l("prepare_duration", Long.valueOf(p1.prepareDuration));
       p0.l("enter_time", Long.valueOf(p1.enterTime));
       p0.l("leave_time", Long.valueOf(p1.leaveTime));
       p0.l("buffer_duration", Long.valueOf(p1.bufferDuration));
       p0.l("comment_pause_duration", Long.valueOf(p1.commentPauseDuration));
       p0.l("other_pause_duration", Long.valueOf(p1.otherPauseDuration));
       p0.l("comment_stay_duration", Long.valueOf(p1.commentStayDuration));
       p0.l("played_loop_count", Integer.valueOf(p1.playedLoopCount));
       this.A(p0, 160);
       r.h(p0, 160);
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, this, oo, "20") && (e.f() || p1.urlPackage.page == 0x7d42)) {
          e6 uoe6 = b.a(0x7d3bdb89);
          p0 = p0.a;
          ClientStat$VideoStatEvent playedDurati = p1.playedDuration;
          _monitor_enter(uoe6);
          uoe6.e();
          e6 c = uoe6.c;
          if (c == null || c.enable == null) {
             _monitor_exit(uoe6);
          }else {
             String id = p0.getId();
             if (uoe6.a.contains(id)) {
                uob = uoe6.b.get(id);
                if (uob != null) {
                   if (playedDurati - uob.b > 0) {
                      uob.b = playedDurati;
                      uob.c = uoe6.c(playedDurati);
                   }
                   _monitor_exit(uoe6);
                }else {
                   uoe6.f(id);
                }
             }
             if (uoe6.a.size() >= 30) {
                uoe6.f(uoe6.a.get(0));
             }
             uoe6.a.add(id);
             uob = new e6$b(uoe6, r1.i1(p0), playedDurati);
             uoe6.b.put(id, v8);
             _monitor_exit(uoe6);
          }
       }
       return;
    }
    public void i(j p0,int p1){
       o oo = o.class;
       if (PatchProxy.isSupport(oo) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, oo, "15")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f("AdvertisementLogReport", "reportItemImpression photoid:"+p0.b().getId(), objArray);
       p0.a(new k0(p1));
       this.A(p0, 1);
       r.h(p0, 1);
       return;
    }
    public j0 j(int p0,BaseFeed p1,PlcEntryStyleInfo p2){
       if (PatchProxy.isSupport(o.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, p2, this, o.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new o(p0, p1, p2);
    }
    public void k(int p0,List p1){
       o oo = o.class;
       if (PatchProxy.isSupport(oo) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, oo, "25")) {
          return;
       }
       r or = r.class;
       if (!PatchProxy.isSupport(or) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, null, or, "13")) {
          if (k1.g()) {
             c.a(new u0(p0, p1));
          }else {
             r.g(p0, p1, null, null, null);
          }
       }
       return;
    }
    public void l(j p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "14")) {
          return;
       }
       this.A(p0, 11);
       r.h(p0, 11);
       return;
    }
    public void m(String p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, o.class, "24")) {
          return;
       }
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, null, r.class, "11")) {
          if (k1.g()) {
             c.a(new w0(p0, p1));
          }else {
             r.i(p0, p1);
          }
       }
       return;
    }
    public void n(j p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "23")) {
          return;
       }
       String str = "_";
       if (!this.b.contains(p0.b().getId()+str+r1.h1(p0.b()))) {
          this.b.add(p0.b().getId()+str+p0.b().getId());
          if (p0.h()) {
             this.A(p0, 60);
             r.h(p0, 60);
          }
       }
       return;
    }
    public j0 o(Map p0){
       Map$Entry obj = PatchProxy.applyOneRefs(p0, this, o.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!q.h(p0)) {
          Iterator iterator = p0.entrySet().iterator();
          while (iterator.hasNext()) {
             obj = iterator.next();
             String key = obj.getKey();
             this.q(key, obj.getValue());
          }
       }
       return this;
    }
    public j0 p(int p0,j p1){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, oo, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new o(p0, p1);
    }
    public j0 q(String p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, o.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.d.l(p0, p1);
       return this;
    }
    public void r(j p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "12")) {
          return;
       }
       if (p0.h()) {
          this.n(p0);
       }else {
          this.A(p0, 10);
          this.b.add(p0.b().getId()+"_"+r1.h1(p0.b()));
          r.h(p0, 10);
       }
       return;
    }
    public j0 s(boolean p0){
       this.e = p0;
       return this;
    }
    public void t(int p0,BaseFeed p1){
       o oo = o.class;
       if (PatchProxy.isSupport(oo) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, oo, "3")) {
          return;
       }
       j oj = this.g(p1);
       this.A(oj, p0);
       r.h(oj, p0);
       return;
    }
    public void u(j p0,int p1){
       o oo = o.class;
       if (PatchProxy.isSupport(oo) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, oo, "26")) {
          return;
       }
       if (!p0.h()) {
          return;
       }
       if (p1 == 3000) {
          this.A(p0, 62);
          r.h(p0, 62);
       }else if(p1 == 0x36b0){
          this.A(p0, 64);
          r.h(p0, 64);
       }else if(p1 == 0xea60){
          this.A(p0, 63);
          r.h(p0, 63);
       }else if(p1 == 0x30d40){
          this.A(p0, 65);
          r.h(p0, 65);
       }
       return;
    }
    public void v(j p0,int p1,int p2,Map p3){
       if (PatchProxy.isSupport(o.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), p3, this, o.class, "17")) {
          return;
       }
       if (p3 == null || p3.isEmpty()) {
          this.y(p0, p1, p2);
          return;
       }else {
          p0.a(new m0(p1, p2));
          Iterator iterator = p3.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             String key = uEntry.getKey();
             p0.l(key, uEntry.getValue());
          }
          this.A(p0, 2);
          r.h(p0, 2);
          return;
       }
    }
    public void w(j p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "13")) {
          return;
       }
       String str = "_";
       if (!this.b.contains(p0.b().getId()+str+p0.b().getId())) {
          this.b.add(p0.b().getId()+str+r1.h1(p0.b()));
          this.A(p0, 10);
          r.h(p0, 10);
       }
       return;
    }
    public j x(BaseFeed p0,PlcEntryStyleInfo p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, o.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(0x1d6683e9).b(p0, p1);
    }
    public void y(j p0,int p1,int p2){
       if (PatchProxy.isSupport(o.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, o.class, "16")) {
          return;
       }
       p0.a(new l0(p1, p2));
       this.A(p0, 2);
       r.h(p0, 2);
       return;
    }
}
