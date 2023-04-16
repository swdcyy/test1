package com.kuaishou.live.core.show.redpacket.krn.g;
import erd.g;
import com.kuaishou.live.core.show.redpacket.krn.j;
import java.lang.Object;
import java.util.Map;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.kuaishou.android.live.log.b;
import java.lang.Iterable;
import qk.m;
import ch2.e;
import ok.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import com.kuaishou.livestream.message.nano.LiveKrnRedPackMessage$LiveKrnRedPack;
import com.kwai.robust.PatchProxyResult;
import ch2.f;
import com.google.common.base.Optional;
import qk.y;
import com.kuaishou.live.core.show.redpacket.krn.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.common.core.component.newpendant.top.helper.b;
import android.content.Context;
import ch2.h;
import com.kuaishou.livestream.message.nano.LiveKrnRedPackMessage$LiveKrnRedPackShowPage;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import k2b.e0;
import tw1.d;
import android.view.View;
import ch2.g;
import java.lang.StringBuilder;
import xw1.a;
import ng2.s;

public final class g implements g	// class@000ed9
{
    public final j b;

    public void g(j p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       g b = this.b;
       Iterator obj = p0;
       Objects.requireNonNull(b);
       if (PatchProxy.applyVoidOneRefs(obj, b, j.class, "4")) {
       }else {
          b.P(j.A, "onRedPacketInfoUpdate");
          ArrayList uArrayList = new ArrayList();
          m.s(b.z).p(new e(b, obj)).n(uArrayList);
          b.z = uArrayList;
          obj = obj.values().iterator();
          while (obj.hasNext()) {
             LiveKrnRedPackMessage$LiveKrnRedPack liveKrnRedPa = obj.next();
             if (liveKrnRedPa != null) {
                PatchProxyResult patchProxyRe = PatchProxyResult.class;
                if (PatchProxy.applyVoidOneRefs(liveKrnRedPa, b, j.class, "5")) {
                   continue ;
                }else {
                   LiveKrnRedPackMessage$LiveKrnRedPack redPackId = liveKrnRedPa.redPackId;
                   f uof = y.y(b.z, new f(redPackId)).orNull();
                   String str = "redPacketId";
                   if (uof == null) {
                      b.S(j.A, "updateRedPacketPendant-create", str, redPackId);
                      uof = PatchProxy.applyOneRefs(liveKrnRedPa, b, j.class, "7");
                      if (uof != patchProxyRe) {
                      }else {
                         boolean b1 = b.d(b);
                         Context context = b.getContext();
                         LiveKrnRedPackMessage$LiveKrnRedPack redPackId1 = liveKrnRedPa.redPackId;
                         int i1 = (b1)? 0x7f0d09b2: 0x7f0d09b3;
                         f uof1 = new f(context, redPackId1, i1, b1);
                         uof1.h = new h(b, liveKrnRedPa);
                         uof1.g(liveKrnRedPa.redPackId, liveKrnRedPa.showPage, liveKrnRedPa.grabTime);
                         d.f(null, b.v.b(), b.v.a(), b.v.y(), liveKrnRedPa.redPackId, 17);
                         b.S8(liveKrnRedPa);
                         uof = uof1;
                      }
                      b.z.add(uof);
                      j x = b.x;
                      View view = uof.b();
                      LiveKrnRedPackMessage$LiveKrnRedPack grabTime = liveKrnRedPa.grabTime;
                      int i = 1;
                      g og = new g(redPackId);
                      Object obj1 = PatchProxy.applyOneRefs(liveKrnRedPa, b, j.class, "6");
                      String str1 = (obj1 != patchProxyRe)? obj1: " redPacketId = "+liveKrnRedPa.redPackId+" bundleId = "+liveKrnRedPa.bundleId;
                      x.T5(view, grabTime, i, og, str1);
                   }else {
                      b.S(j.A, "updateRedPacketPendant-update", str, redPackId);
                      uof.g(liveKrnRedPa.redPackId, liveKrnRedPa.showPage, liveKrnRedPa.grabTime);
                   }
                }
             }
          }
       }
       return;
    }
}
