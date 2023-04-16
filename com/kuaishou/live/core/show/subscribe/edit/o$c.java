package com.kuaishou.live.core.show.subscribe.edit.o$c;
import com.kuaishou.live.core.show.subscribe.edit.LiveSubscribeEditFragment$a;
import com.kuaishou.live.core.show.subscribe.edit.o;
import com.kuaishou.live.core.show.subscribe.edit.SubscribeDialogParams;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.subscribe.model.LiveAnchorSubscriberCreateConfig$LiveEntrySubscribeDetail;
import java.util.Collection;
import ekd.q;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;
import com.kuaishou.live.core.show.subscribe.edit.LiveAnchorSubscribeContainerFragment;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import wk2.s;
import java.util.List;
import java.lang.Long;
import java.lang.Integer;
import pk2.c;
import pk2.b;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.concurrent.TimeUnit;
import brd.t;
import cjd.e;
import erd.o;
import com.kuaishou.live.core.show.subscribe.edit.d;
import sfc.a;
import erd.g;
import crd.b;
import crd.a;

public class o$c implements LiveSubscribeEditFragment$a	// class@001120
{
    public final SubscribeDialogParams a;
    public final o b;

    public void o$c(o p0,SubscribeDialogParams p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, o$c.class, "1")) {
          return;
       }
       o$c tb = this.b;
       if (tb.j != null) {
          o l = tb.l;
          if (l != null && q.f(l.mSubscribeInfoList)) {
             this.b.j.dismissAllowingStateLoss();
          }else {
             this.b.j.Eh(true);
          }
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, o$c.class, "2")) {
          return;
       }
       o$c tb = this.b;
       if (tb.l != null) {
          s.v(tb.f(), this.b.i());
          tb = this.b;
          tb.n(tb.l);
       }
       return;
    }
    public void d(int p0,List p1,String p2,Long p3){
       long l1;
       if (PatchProxy.isSupport(o$c.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, p2, p3, this, o$c.class, "3")) {
          return;
       }
       o$c tb = this.b;
       c uoc = b.b();
       o$c tb1 = this.b;
       long l = p3.longValue();
       Objects.requireNonNull(tb1);
       if (PatchProxy.isSupport(o.class)) {
          p3 = PatchProxy.applyOneRefs(Long.valueOf(l), tb1, o.class, "14");
          if (p3 != PatchProxyResult.class) {
             l1 = p3.longValue();
          label_0054 :
             t ot = uoc.u0(p2, p0, l1, p1, this.a.b).map(new e());
             o$c ta = this.a;
             Objects.requireNonNull(tb);
             if (!PatchProxy.applyVoidTwoRefs(ot, ta, tb, o.class, "15")) {
                tb.h.c(ot.subscribe(new d(tb, ta), new a()));
             }
             return;
          }
       }
       long l2 = TimeUnit.MINUTES.toMillis(1);
       l1 = (l / l2) * l2;
       goto label_0054 ;
    }
}
