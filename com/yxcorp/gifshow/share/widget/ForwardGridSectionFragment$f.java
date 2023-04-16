package com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment$f;
import mhc.f0;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.Pair;
import mhc.h2;
import kotlin.jvm.internal.a;
import java.lang.Number;
import mhc.q;
import mhc.e0;
import com.kwai.sharelib.model.ShareInitResponse$SharePanelElement;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment$f$b;
import msd.q;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment$f$a;
import uo7.i0;
import mhc.u;
import mhc.o0;

public final class ForwardGridSectionFragment$f implements f0	// class@001ccb
{
    public final ForwardGridSectionFragment b;

    public void ForwardGridSectionFragment$f(ForwardGridSectionFragment p0){
       this.b = p0;
       super();
    }
    public void a(Object p0,int p1){
       ForwardGridSectionFragment$f uof = ForwardGridSectionFragment$f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uof, "2")) {
          return;
       }
       Iterator iterator = this.b.Q.iterator();
       while (iterator.hasNext()) {
          iterator.next().getSecond().a(p0, p1);
       }
       return;
    }
    public void b(h2 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ForwardGridSectionFragment$f.class, "3")) {
          return;
       }
       a.p(p0, "event");
       Iterator iterator = this.b.Q.iterator();
       while (iterator.hasNext()) {
          Pair pair = iterator.next();
          if (pair.getFirst().intValue() < 0 || pair.getFirst().intValue() == p0.c()) {
             pair.getSecond().b(p0);
          }
       }
       int i = p0.c();
       if (i != 1) {
          if (i != 2) {
             if (i == 3) {
                q oq = this.b.Sh();
                if (oq != null) {
                   oq.b();
                }
             }
          }else {
             e0 uoe0 = this.b.Oh();
             if (uoe0 != null) {
                ShareInitResponse$SharePanelElement sharePanelEl = p0.a();
                a.m(sharePanelEl);
                uoe0.b(sharePanelEl);
             }
          }
       }else {
          h2 b = p0.b;
          a.m(b);
          this.b.L.invoke(new ForwardGridSectionFragment$f$b(p0), b, Integer.valueOf(p0.b()));
       }
       return;
    }
    public void c(h2 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ForwardGridSectionFragment$f.class, "4")) {
          return;
       }
       a.p(p0, "event");
       Iterator iterator = this.b.Q.iterator();
       while (iterator.hasNext()) {
          Pair pair = iterator.next();
          if (pair.getFirst().intValue() < 0 || pair.getFirst().intValue() == p0.c()) {
             pair.getSecond().c(p0);
          }
       }
       int i = p0.c();
       if (i != 1) {
          if (i != 2) {
             if (i == 3) {
                q oq = this.b.Sh();
                if (oq != null) {
                   oq.a();
                }
             }
          }else {
             e0 uoe0 = this.b.Oh();
             if (uoe0 != null) {
                ShareInitResponse$SharePanelElement sharePanelEl = p0.a();
                a.m(sharePanelEl);
                uoe0.a(sharePanelEl);
             }
          }
       }else {
          ForwardGridSectionFragment j = this.b.J;
          if (j != null) {
             j.a(new ForwardGridSectionFragment$f$a(p0), p0.b());
          }
       }
       return;
    }
    public void d(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ForwardGridSectionFragment$f.class, "1")) {
          return;
       }
       o0 oo0 = this.b.Rh();
       if (oo0 != null) {
          oo0.a(p0);
       }
       Iterator iterator = this.b.Q.iterator();
       while (iterator.hasNext()) {
          iterator.next().getSecond().d(p0);
       }
       return;
    }
}
