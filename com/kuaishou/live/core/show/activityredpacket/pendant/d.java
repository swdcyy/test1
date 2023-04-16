package com.kuaishou.live.core.show.activityredpacket.pendant.d;
import erd.g;
import com.kuaishou.live.core.show.activityredpacket.pendant.e;
import java.lang.Object;
import java.util.Map;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import java.util.List;
import com.kuaishou.android.live.log.b;
import java.lang.Iterable;
import qk.m;
import s22.b;
import ok.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import o22.b;
import androidx.lifecycle.LiveData;
import com.kuaishou.livestream.message.nano.LiveTreasureBoxMessage$LiveTreasureBoxShow;
import s22.c;
import com.google.common.base.Optional;
import qk.y;
import com.kuaishou.live.core.show.activityredpacket.pendant.c;
import com.kwai.robust.PatchProxyResult;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.common.core.component.newpendant.top.helper.b;
import android.content.Context;
import s22.e;
import com.kuaishou.livestream.message.nano.LiveTreasureBoxMessage$LiveTreasureBoxShowPage;
import y22.q;
import android.view.View;
import s22.d;
import xw1.a;
import ng2.s;

public final class d implements g	// class@000973
{
    public final e b;

    public void d(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       boolean b;
       d tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, e.class, "4")) {
       }else {
          List a = e.A;
          b.P(a, "filter redPacket, map size = "+p0.size());
          ArrayList uArrayList = new ArrayList();
          m.s(tb.z).p(new b(tb, p0)).n(uArrayList);
          tb.z = uArrayList;
          b.P(a, "updateRedPacketPendant, map size = "+p0.size());
          p0 = p0.values().iterator();
          while (p0.hasNext()) {
             LiveTreasureBoxMessage$LiveTreasureBoxShow value = p0.next().c.getValue();
             if (PatchProxy.applyVoidOneRefs(value, tb, e.class, "5")) {
                continue ;
             }else {
                c uoc = y.y(tb.z, new c(value.treasureBoxId)).orNull();
                if (uoc == null) {
                   uoc = PatchProxy.applyOneRefs(value, tb, e.class, "7");
                   if (uoc != PatchProxyResult.class) {
                   }else {
                      b = b.d(tb);
                      Context context = tb.getContext();
                      LiveTreasureBoxMessage$LiveTreasureBoxShow treasureBoxI = value.treasureBoxId;
                      int i = (b)? 0x7f0d09b2: 0x7f0d09b3;
                      c uoc1 = new c(context, treasureBoxI, i, b);
                      uoc1.h = new e(tb, value);
                      uoc1.g(value.treasureBoxId, value.showPage, value.grabTime);
                      uoc = uoc1;
                   }
                   tb.z.add(uoc);
                   b.P(e.A, "addPendant, key = "+q.c(value));
                   tb.x.T5(uoc.b(), value.grabTime, 1, new d(tb, value), q.c(value));
                }else {
                   uoc.g(value.treasureBoxId, value.showPage, value.grabTime);
                }
             }
          }
       }
       return;
    }
}
