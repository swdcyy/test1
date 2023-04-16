package com.kwai.live.gzone.accompanyplay.edit.a0$c;
import android.view.View$OnClickListener;
import com.kwai.live.gzone.accompanyplay.edit.a0;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.accompanyplay.edit.m;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import fq5.b;
import n37.k;
import h37.n0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyGameInfo;
import k2b.u1;

public class a0$c implements View$OnClickListener	// class@000bd1
{
    public final a0 b;

    public void a0$c(a0 p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a0$c.class, "1")) {
          return;
       }
       ClientContent$LiveStreamPackage liveStreamPa = this.b.p.o.a();
       k b = this.b.s.b;
       if (!PatchProxy.applyVoidTwoRefs(liveStreamPa, b, null, n0.class, "28")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "ACCOMPANY_AUTHOR_GAME_INFO_BIND_BUTTON";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          liveStreamPa.gameId = b.mGameId;
          liveStreamPa.gameName = b.mGameName;
          uContentPack.liveStreamPackage = liveStreamPa;
          u1.u(true, uElementPack, uContentPack);
       }
       this.b.P8(true);
       return;
    }
}
