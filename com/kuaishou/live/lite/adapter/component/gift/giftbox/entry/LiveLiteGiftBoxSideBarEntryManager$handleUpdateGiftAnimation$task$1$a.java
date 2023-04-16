package com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.LiveLiteGiftBoxSideBarEntryManager$handleUpdateGiftAnimation$task$1$a;
import qm1.a;
import com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.LiveLiteGiftBoxSideBarEntryManager$handleUpdateGiftAnimation$task$1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.sidebar.LiveLiteGiftBoxSideBarItem;
import com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.LiveLiteGiftBoxSideBarEntryManager;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import xp5.i;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import k2b.u1;
import com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.sidebar.LiveLiteGiftBoxSideBarItem$ViewHolder;
import android.widget.ImageView;

public final class LiveLiteGiftBoxSideBarEntryManager$handleUpdateGiftAnimation$task$1$a implements a	// class@001dc7
{
    public final LiveLiteGiftBoxSideBarEntryManager$handleUpdateGiftAnimation$task$1 a;

    public void LiveLiteGiftBoxSideBarEntryManager$handleUpdateGiftAnimation$task$1$a(LiveLiteGiftBoxSideBarEntryManager$handleUpdateGiftAnimation$task$1 p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(){
       if (PatchProxy.applyVoid(null, this, LiveLiteGiftBoxSideBarEntryManager$handleUpdateGiftAnimation$task$1$a.class, "2")) {
          return;
       }
       b.P(LiveLogTag.GIFT.appendTag("LiveGiftSideBarManager"), "handleUpdateGiftAnimation onAnimationEnd");
       this.a.this$0.b().n(true);
       return;
    }
    public void onAnimationStart(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveLiteGiftBoxSideBarEntryManager$handleUpdateGiftAnimation$task$1$a.class, "1")) {
          return;
       }
       b.P(LiveLogTag.GIFT.appendTag("LiveGiftSideBarManager"), "handleUpdateGiftAnimation onAnimationStart");
       LiveLiteGiftBoxSideBarEntryManager$handleUpdateGiftAnimation$task$1 this$0 = this.a.this$0;
       ClientContent$LiveStreamPackage liveStreamPa = this$0.j.a();
       a.o(liveStreamPa, "logPackageProvider.liveStreamPackage");
       Objects.requireNonNull(this$0);
       if (!PatchProxy.applyVoidOneRefs(liveStreamPa, this$0, LiveLiteGiftBoxSideBarEntryManager.class, "4")) {
          a.p(liveStreamPa, "liveStreamPackage");
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "GIFT_EFFECT_CARD";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          u1.B0(new ShowMetaData().setType(3).setElementPackage(uElementPack).setContentPackage(uContentPack));
       }
       this.a.this$0.b().n(false);
       this.a.this$0.b().l();
       LiveLiteGiftBoxSideBarItem liveLiteGift = this.a.this$0.b();
       Objects.requireNonNull(liveLiteGift);
       if (!PatchProxy.applyVoid(objArray, liveLiteGift, LiveLiteGiftBoxSideBarItem.class, "7")) {
          liveLiteGift = liveLiteGift.b;
          if (liveLiteGift != null && !PatchProxy.applyVoid(objArray, liveLiteGift, LiveLiteGiftBoxSideBarItem$ViewHolder.class, "8")) {
             liveLiteGift.b.setVisibility(8);
          }
       }
       return;
    }
}
