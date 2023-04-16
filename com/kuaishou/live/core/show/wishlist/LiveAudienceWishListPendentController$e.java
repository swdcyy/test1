package com.kuaishou.live.core.show.wishlist.LiveAudienceWishListPendentController$e;
import java.lang.Runnable;
import com.kuaishou.live.core.show.wishlist.LiveAudienceWishListPendentController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.basic.activity.x;
import t02.a0;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import nn2.r1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.e0;
import k2b.u1;

public final class LiveAudienceWishListPendentController$e implements Runnable	// class@0012c6
{
    public final LiveAudienceWishListPendentController b;

    public void LiveAudienceWishListPendentController$e(LiveAudienceWishListPendentController p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceWishListPendentController$e.class, "1")) {
          return;
       }
       x ox = this.b.y.R();
       a.o(ox, "mLivePlayCallerContext.playFragmentService");
       LivePlayFragment livePlayFrag = ox.t0();
       a0 z2 = this.b.y.Z2;
       a.o(z2, "mLivePlayCallerContext.mLiveBasicContext");
       ClientContent$LiveStreamPackage liveStreamPa = z2.a();
       a0 z21 = this.b.y.Z2;
       a.o(z21, "mLivePlayCallerContext.mLiveBasicContext");
       ClientContent$LiveVoicePartyPackageV2 liveVoicePar = z21.y();
       if (!PatchProxy.applyVoidThreeRefs(livePlayFrag, liveStreamPa, liveVoicePar, null, r1.class, "8")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "SHOW_WISH_LIST_PENDANT";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          uContentPack.liveVoicePartyPackage = r1.e(liveVoicePar);
          u1.C0("", livePlayFrag, 10, uElementPack, uContentPack);
       }
       this.b.O("PRE_SEND_GIFT", "CLIENT_AUDIENCE_WISH_LIST_WIDGET_SHOW", "[LiveAudienceWishListPendentController] [onShowLiveWishListPendantView] wish list pendant show ", 1);
       return;
    }
}
