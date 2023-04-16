package com.kuaishou.live.rerank.d;
import bp3.c;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import lnc.b9;
import java.lang.System;
import com.yxcorp.gifshow.entity.QPhoto;
import bp3.k;
import bp3.b;
import bp3.a;
import brd.t;
import cjd.e;
import erd.o;
import com.kuaishou.live.rerank.c;
import bp3.e;
import erd.g;
import com.kuaishou.live.rerank.LiveRerankLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import ekd.k1;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;
import ekd.q;
import java.lang.Iterable;
import qk.m;
import bp3.d;
import ok.o;
import com.google.common.collect.ImmutableList;
import com.kuaishou.live.rerank.b;
import java.lang.Long;
import java.util.Iterator;
import com.kwai.framework.model.feed.BaseFeed;
import yp.x;
import bp3.g;
import java.lang.Runnable;

public class d	// class@000f66
{
    public final c a;
    public long b;
    public long c;
    public int d;
    public b e;

    public void d(c p0){
       super();
       this.c = 30;
       this.a = p0;
    }
    public boolean a(){
       boolean b = true;
       if (this.d == b) {
       }else {
          b = false;
       }
       return b;
    }
    public final void b(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "4")) {
          return;
       }
       b9.a(this.e);
       this.d = 1;
       this.b = System.currentTimeMillis();
       String str = k.a(p0, this.a.f(), this.a.e0(), this.a.getCurrentPhoto());
       this.e = a.b().b(str).map(new e()).subscribe(new c(this, p0), new e(this, p0));
       b.S(LiveRerankLogTag.LIVE_RERANK.appendTag("LiveRerankManager"), "requestRerankService", "request param", str);
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       b.P(LiveRerankLogTag.LIVE_RERANK.appendTag("LiveRerankManager"), "stopRequestTask");
       b9.a(this.e);
       this.d = 0;
       k1.n(this);
       return;
    }
    public void d(){
       d d;
       int i = this;
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, i, uod, "2")) {
          return;
       }
       LiveRerankLogTag lIVE_RERANK = LiveRerankLogTag.LIVE_RERANK;
       lIVE_RERANK.appendTag("LiveRerankManager");
       b.P(lIVE_RERANK, "tryStartRequestTask");
       if (!i.a.g0()) {
          lIVE_RERANK.appendTag("LiveRerankManager");
          b.P(lIVE_RERANK, "startRequestTask failed, current page is NOT showing");
          return;
       }else {
          d = i.d;
          if (d == 1 || d == 2) {
             lIVE_RERANK.appendTag("LiveRerankManager");
             b.P(lIVE_RERANK, "startRequestTask failed, already in request");
             return;
          }else {
             Iterator obj = PatchProxy.apply(objArray, i, uod, "3");
             if (obj != PatchProxyResult.class) {
                objArray = obj;
             }else {
                List list = i.a.e0();
                if (!q.f(list)) {
                   ImmutableList immutableLis = m.s(list).p(new d(i)).B();
                   if (!q.f(immutableLis) && !immutableLis.get(0).isAd()) {
                      immutableLis = m.s(immutableLis).p(b.b).B();
                   }
                   objArray = immutableLis;
                }
             }
             if (q.f(objArray)) {
                lIVE_RERANK.appendTag("LiveRerankManager");
                b.P(lIVE_RERANK, "startRequestTask failed, there is NO liveStreamFeed available");
                return;
             }else {
                long l = System.currentTimeMillis() - i.b;
                long l1 = i.c * 1000;
                if (l - l1 >= 0) {
                   lIVE_RERANK.appendTag("LiveRerankManager");
                   b.T(lIVE_RERANK, "over the request interval, request rerank service immediately", "limitInterval", Long.valueOf(l1), "requestInterval", Long.valueOf(l));
                   i.b(objArray);
                }else {
                   lIVE_RERANK.appendTag("LiveRerankManager");
                   l1 = l1 - l;
                   b.U(lIVE_RERANK, "between the request interval, delay request rerank service", "limitInterval", Long.valueOf(l1), "requestInterval", Long.valueOf(l), "delayTime", Long.valueOf(l1));
                   i.d = 2;
                   obj = objArray.iterator();
                   while (obj.hasNext()) {
                      x.z(obj.next().mEntity, 2);
                   }
                   k1.s(new g(i, objArray), i, l1);
                }
                return;
             }
          }
       }
    }
}
