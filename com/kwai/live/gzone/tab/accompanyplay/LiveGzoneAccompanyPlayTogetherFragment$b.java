package com.kwai.live.gzone.tab.accompanyplay.LiveGzoneAccompanyPlayTogetherFragment$b;
import com.yxcorp.gifshow.widget.m;
import com.kwai.live.gzone.tab.accompanyplay.LiveGzoneAccompanyPlayTogetherFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qvb.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import d77.h;
import dz1.a;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public class LiveGzoneAccompanyPlayTogetherFragment$b extends m	// class@000dfa
{
    public final LiveGzoneAccompanyPlayTogetherFragment c;

    public void LiveGzoneAccompanyPlayTogetherFragment$b(LiveGzoneAccompanyPlayTogetherFragment p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneAccompanyPlayTogetherFragment$b.class, "1")) {
          return;
       }
       int b = this.c.J.isEmpty();
       ClientContent$LiveStreamPackage liveStreamPa = this.c.Gh();
       String str = this.c.J.i2();
       String str1 = this.c.J.h2();
       if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidFourRefs(Boolean.valueOf(b), liveStreamPa, str, str1, null, a.class, "43")) {
          liveStreamPa.gameId = str1;
          liveStreamPa.gameName = str;
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "FIND_MORE_ACCOMPANY_AUTHOR_BUTTON";
          i3 oi3 = i3.f();
          b = (b)? 1: 2;
          oi3.c("tab_status", Integer.valueOf(b));
          uElementPack.params = oi3.e();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          u1.v(1, uElementPack, uContentPack, null);
       }
       this.c.Hh("");
       return;
    }
}
