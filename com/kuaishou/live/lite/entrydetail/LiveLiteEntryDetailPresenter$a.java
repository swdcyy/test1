package com.kuaishou.live.lite.entrydetail.LiveLiteEntryDetailPresenter$a;
import java.lang.Runnable;
import com.kuaishou.live.lite.entrydetail.LiveLiteEntryDetailPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xp5.i;
import k2b.e0;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import va3.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import k2b.u1;

public final class LiveLiteEntryDetailPresenter$a implements Runnable	// class@0008df
{
    public final LiveLiteEntryDetailPresenter b;

    public void LiveLiteEntryDetailPresenter$a(LiveLiteEntryDetailPresenter p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, LiveLiteEntryDetailPresenter$a.class, "1")) {
          return;
       }
       e0 page = LiveLiteEntryDetailPresenter.c9(this.b).getPage();
       FeedLogCtx uFeedLogCtx = LiveLiteEntryDetailPresenter.c9(this.b).c0();
       ClientContent$LiveStreamPackage liveStreamPa = LiveLiteEntryDetailPresenter.c9(this.b).a();
       if (!PatchProxy.applyVoidThreeRefs(page, uFeedLogCtx, liveStreamPa, null, a.class, "1")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "LIVE_ROOM_ENTER_BUTTON";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          u1.B0(new ShowMetaData().setType(6).setElementPackage(uElementPack).setFeedLogCtx(uFeedLogCtx).setContentPackage(uContentPack).setLogPage(page));
       }
       return;
    }
}
