package com.yxcorp.gifshow.dialog.kem.i;
import xx6.f$b;
import com.yxcorp.gifshow.dialog.kem.h$b;
import java.lang.Object;
import xx6.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.yxcorp.gifshow.log.model.StatMetaData;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$StatPackage;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$VideoStatEvent;
import com.yxcorp.gifshow.model.response.dialog.KemCommonVideoDialogResponse;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import k2b.u1;
import lnc.i3;
import nc6.b;
import qrd.l1;

public final class i implements f$b	// class@001ac0
{
    public final h$b b;

    public void i(h$b p0){
       this.b = p0;
       super();
    }
    public void onSessionReport(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
          return;
       }
       a.p(p0, "data");
       i tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(p0, tb, h$b.class, "6")) {
          StatMetaData statMetaData = new StatMetaData();
          ClientStat$StatPackage statPackage = new ClientStat$StatPackage();
          ClientStat$VideoStatEvent videoStatEve = new ClientStat$VideoStatEvent();
          videoStatEve.bizType = "cny_2023";
          videoStatEve.playUrl = tb.g.mVideoUrl;
          videoStatEve.playVideoType = 0;
          videoStatEve.mediaType = 1;
          h$b b = tb.b;
          if (b == null) {
             b = u1.k();
          }
          videoStatEve.urlPackage = b;
          i3 oi3 = i3.f();
          oi3.d("cny23_action", "eve_popup");
          videoStatEve.expParams = oi3.e();
          videoStatEve.duration = p0.b;
          videoStatEve.playedDuration = p0.c;
          p0 = (b.a())? p0.o: p0.p;
          videoStatEve.videoQosJson = p0;
          statPackage.videoStatEvent = videoStatEve;
          u1.F0(statMetaData.setStatPackage(statPackage));
       }
       return;
    }
}
