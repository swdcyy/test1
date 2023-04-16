package com.kuaishou.live.core.show.screenrecord.e;
import com.kuaishou.live.core.show.screenrecord.f$b;
import com.kuaishou.live.core.show.screenrecord.LiveAudienceScreenRecordBottomBarPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import j75.i;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;
import e17.i;
import com.kuaishou.live.core.show.screenrecord.m$a;
import com.kuaishou.live.core.show.screenrecord.m;
import com.kuaishou.live.core.show.screenrecord.LiveAudienceScreenRecordBottomBarPresenter$LiveScreenRecordStopReason;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import ij2.n0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import android.view.View;
import k2b.u1;
import dt5.c;

public class e implements f$b	// class@000fdf
{
    public final LiveAudienceScreenRecordBottomBarPresenter a;

    public void e(LiveAudienceScreenRecordBottomBarPresenter p0){
       this.a = p0;
       super();
    }
    public void a(){
       boolean b;
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       e ta = this.a;
       Objects.requireNonNull(ta);
       LiveAudienceScreenRecordBottomBarPresenter liveAudience = LiveAudienceScreenRecordBottomBarPresenter.class;
       if (!PatchProxy.applyVoid(null, ta, liveAudience, "14") && ta.G == null) {
          Object obj = PatchProxy.apply(null, ta, liveAudience, "17");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             long l = i.a();
             b = (l - 0x12c00000 > 0)? true: false;
          }
          if (!b) {
             i.a(R.style.arg_RES_7f11066a, 0x7f103999);
          }else {
             ta.u.a(ta.T);
             ta.H = LiveAudienceScreenRecordBottomBarPresenter$LiveScreenRecordStopReason.REASON_INVALID;
          }
       }
       ClientContent$LiveStreamPackage liveStreamPa = this.a.q.a();
       if (!PatchProxy.applyVoidOneRefs(liveStreamPa, null, n0.class, "4")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "START_RECORD_SUBCARD";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          u1.v(1, uElementPack, uContentPack, null);
       }
       return;
    }
    public void b(boolean p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoe, "2")) {
          return;
       }
       if (p0) {
          this.a.y.i();
       }else {
          this.a.y.f();
       }
       ClientContent$LiveStreamPackage liveStreamPa = this.a.q.a();
       if (!PatchProxy.applyVoidOneRefs(liveStreamPa, null, n0.class, "3")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "CLEAR_SCREEN_SUBCARD";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          u1.v(1, uElementPack, uContentPack, null);
       }
       return;
    }
    public void onDismiss(){
       this.a.B = null;
    }
}
