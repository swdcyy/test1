package com.kuaishou.live.core.show.screenrecord.d;
import com.kuaishou.live.common.core.basic.widget.LiveAudienceScreenRecordControllerView$a;
import com.kuaishou.live.core.show.screenrecord.LiveAudienceScreenRecordBottomBarPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.screenrecord.LiveAudienceScreenRecordBottomBarPresenter$LiveScreenRecordStopReason;
import java.lang.System;
import android.view.View;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import ij2.n0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public class d implements LiveAudienceScreenRecordControllerView$a	// class@000fde
{
    public final LiveAudienceScreenRecordBottomBarPresenter a;

    public void d(LiveAudienceScreenRecordBottomBarPresenter p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       this.a.V8(LiveAudienceScreenRecordBottomBarPresenter$LiveScreenRecordStopReason.REASON_PUBLISH, "");
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.a.I = System.currentTimeMillis();
       this.a.D.bringToFront();
       this.a.D.setVisibility(0);
       ClientContent$LiveStreamPackage liveStreamPa = this.a.q.a();
       if (!PatchProxy.applyVoidOneRefs(liveStreamPa, null, n0.class, "6")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "RECORD_STATUS_SUBCARD";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          u1.v0(3, uElementPack, uContentPack, null);
       }
       return;
    }
}
