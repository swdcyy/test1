package com.kuaishou.live.effect.rescue.c$a;
import rz2.b;
import com.kuaishou.live.effect.rescue.c;
import java.lang.Object;
import rz2.a;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import pz2.c;
import pz2.a;
import java.util.List;
import com.kuaishou.live.effect.rescue.LiveEffectTaskSurvivorPool;
import iy2.g;
import java.util.ArrayList;
import java.lang.Iterable;
import qk.m;
import rz2.g;
import ok.o;
import com.kuaishou.live.effect.rescue.b;
import ok.h;
import java.util.Collection;
import java.util.Objects;
import java.lang.Long;
import java.lang.StringBuilder;
import iy2.h;
import pz2.g;
import iy2.v;

public class c$a implements b	// class@001b1f
{
    public final c a;

    public void c$a(c p0){
       this.a = p0;
       super();
    }
    public void a(a p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, c$a.class, "2")) {
          return;
       }
       c uoc = p0.c();
       this.a.e.d(uoc.b(), this.a.d.a(uoc.b()), p1, p2);
       return;
    }
    public void b(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "1")) {
          return;
       }
       long l = p0.c().b();
       ArrayList uArrayList = new ArrayList();
       ArrayList uArrayList1 = new ArrayList();
       ArrayList uArrayList2 = new ArrayList();
       g og = new g(this, p0, uArrayList, uArrayList1, uArrayList2);
       ArrayList uArrayList3 = new ArrayList();
       m.s(this.a.d.a(l)).p(v12).F(b.b).n(uArrayList3);
       if (uArrayList.size() > 0) {
          this.a.e.d(l, uArrayList, "SURVIVE_TIMEOUT", null);
       }
       if (uArrayList1.size() > 0) {
          this.a.e.d(l, uArrayList1, "EFFECT_IS_EXPIRED", null);
       }
       if (uArrayList2.size() > 0) {
          this.a.e.d(l, uArrayList2, "BANNED_FOR_BIZ", null);
       }
       c e = this.a.e;
       Objects.requireNonNull(e);
       og = g.class;
       if (!PatchProxy.isSupport(og) || !PatchProxy.applyVoidTwoRefs(Long.valueOf(l), uArrayList3, e, og, "8")) {
          h.d("[SURVIVE]", "[onSurviveSucceed]: magicFaceId = "+l+", surviveTaskGroupSize = "+uArrayList3.size());
          g a = e.a;
          if (a != null) {
             a.t(l, uArrayList3);
          }
       }
       this.a.c.b(uArrayList3);
       return;
    }
    public void c(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "3")) {
          return;
       }
       c e = this.a.e;
       c uoc = p0.c();
       Objects.requireNonNull(e);
       if (!PatchProxy.applyVoidOneRefs(uoc, e, g.class, "10")) {
          g a = e.a;
          if (a != null) {
             a.r(uoc);
          }
       }
       return;
    }
}
