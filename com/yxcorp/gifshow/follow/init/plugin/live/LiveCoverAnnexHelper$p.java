package com.yxcorp.gifshow.follow.init.plugin.live.LiveCoverAnnexHelper$p;
import com.kwai.component.feedstaggercard.widget.SimpleDanmakuView$d;
import com.yxcorp.gifshow.follow.init.plugin.live.LiveCoverAnnexHelper;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.List;
import com.yxcorp.gifshow.follow.init.plugin.live.LiveCoverAnnexHelper$c;
import sp.c;
import com.kuaishou.android.model.feed.LiveInfo;
import oha.t;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import kp.r1;
import com.kuaishou.android.model.mix.CommonMeta;
import crd.b;
import lnc.b9;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import brd.t;
import oha.d;
import erd.o;
import t45.d;
import brd.z;
import oha.e;
import oha.f;
import erd.g;

public final class LiveCoverAnnexHelper$p implements SimpleDanmakuView$d	// class@0010d9
{
    public final LiveCoverAnnexHelper a;

    public void LiveCoverAnnexHelper$p(LiveCoverAnnexHelper p0){
       this.a = p0;
       super();
    }
    public final void a(int p0){
       LiveCoverAnnexHelper c1;
       BaseFeed entity;
       Object obj = this;
       int i = p0;
       LiveCoverAnnexHelper liveCoverAnn = LiveCoverAnnexHelper.class;
       LiveCoverAnnexHelper$p op = LiveCoverAnnexHelper$p.class;
       if (PatchProxy.isSupport(op) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), obj, op, "1")) {
          return;
       }
       op = obj.a;
       Objects.requireNonNull(op);
       if (!PatchProxy.isSupport(liveCoverAnn) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), op, liveCoverAnn, "20")) {
          LiveCoverAnnexHelper b = op.b;
          if (b != null) {
             List list = b.g();
             if (list != null) {
                c uoc = list.get(i);
                if (uoc != null) {
                   if (uoc.getType() == 3) {
                      LiveCoverAnnexHelper c = op.c;
                      LiveInfo content = uoc.getContent();
                      LiveInfo mType = uoc.mType;
                      if (!PatchProxy.isSupport(t.class) || !PatchProxy.applyVoidThreeRefs(c, content, Integer.valueOf(mType), null, t.class, "4")) {
                         ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                         uContentPack.photoPackage = w1.f(c.getEntity());
                         ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                         uElementPack.action2 = "NEARBY_LIVE_INFOS_CARD";
                         i3 oi3 = i3.f();
                         oi3.d("live_info_content", content);
                         oi3.c("live_info_type", Integer.valueOf(mType));
                         uElementPack.params = oi3.e();
                         u1.D0("2933296", null, 3, uElementPack, uContentPack, null);
                      }
                      c1 = op.c;
                      if (c1 != null) {
                         entity = c1.getEntity();
                         if (entity != null) {
                            r1.a5(entity, uoc);
                         }
                      }
                   }else {
                      c1 = op.c;
                      if (c1 != null) {
                         entity = c1.getEntity();
                         if (entity != null) {
                            r1.a5(entity, null);
                         }
                      }
                   }
                }
             }
          }
       }
       op = obj.a;
       Objects.requireNonNull(op);
       if (!PatchProxy.isSupport(liveCoverAnn) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), op, liveCoverAnn, "21")) {
          op.G = i;
          if (op.n == null && op.p < (op.k - 1)) {
             liveCoverAnn = op.F;
             if (liveCoverAnn == null || liveCoverAnn.mTransientShowedCommodity != 1) {
                liveCoverAnn = op.b;
                int i1 = (liveCoverAnn != null)? liveCoverAnn.c(): Integer.MAX_VALUE;
                if ((i1 - i) <= 10) {
                   b9.a(op.h);
                   op.h = t.timer(((op.m + op.j) - SystemClock.elapsedRealtime()), TimeUnit.MILLISECONDS).flatMap(new d(op)).observeOn(d.a).subscribe(new e(op), f.b);
                }
             }
          }
       }
       return;
    }
}
