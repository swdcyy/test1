package com.kuaishou.live.common.core.component.multichat.render.cell.audience.LiveMultiChatAudienceBaseCellController$b;
import android.view.View$OnClickListener;
import com.kuaishou.live.common.core.component.multichat.render.cell.audience.LiveMultiChatAudienceBaseCellController;
import zp1.b;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import zp1.c;
import k2b.e0;
import yp1.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.util.Map;
import yp1.a;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.u1;
import java.lang.Boolean;
import zp1.q$b;
import zp1.q;

public final class LiveMultiChatAudienceBaseCellController$b implements View$OnClickListener	// class@0014dd
{
    public final LiveMultiChatAudienceBaseCellController b;
    public final b c;

    public void LiveMultiChatAudienceBaseCellController$b(LiveMultiChatAudienceBaseCellController p0,b p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       e0 uoe0;
       ClientEvent$ElementPackage uElementPack;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiChatAudienceBaseCellController$b.class, "1")) {
          return;
       }
       q$b uob = 9;
       String str = "liveStreamPackage";
       String str1 = "logPage";
       if (this.b.y3()) {
          LiveMultiChatAudienceBaseCellController$b tb = this.b;
          LiveMultiChatAudienceBaseCellController k = tb.K;
          uoe0 = tb.L.d();
          ClientContent$LiveStreamPackage liveStreamPa = this.b.L.f();
          LiveMultiChatAudienceBaseCellController$b tb1 = this.b;
          Map map = tb1.L.e(tb1.K);
          if (!PatchProxy.applyVoidFourRefs(k, uoe0, liveStreamPa, map, null, a.class, "8")) {
             a.p(k, "userId");
             a.p(uoe0, str1);
             a.p(liveStreamPa, str);
             a.p(map, "interactiveParams");
             uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "MULTI_FOLLOW_BUTTON";
             i3 oi3 = i3.f();
             a.o(oi3, "jsonObject");
             a.a(map, oi3);
             uElementPack.params = oi3.e();
             ClientContent$ContentPackage uContentPack = a.b(liveStreamPa);
             ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
             uContentPack.userPackage = userPackage;
             userPackage.identity = k;
             u1.B(new ClickMetaData().setLogPage(uoe0).setType(uob).setElementPackage(uElementPack).setContentPackage(uContentPack));
          }
       }else {
          uoe0 = this.b.L.d();
          ClientContent$LiveStreamPackage liveStreamPa1 = this.b.L.f();
          boolean b = this.b.z3();
          if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidThreeRefs(uoe0, liveStreamPa1, Boolean.valueOf(b), null, a.class, "2")) {
             a.p(uoe0, str1);
             a.p(liveStreamPa1, str);
             uElementPack = new ClientEvent$ElementPackage();
             str1 = (b)? "CLICK_ANCHOR_AUDIENCE_VIDEO_CHAT_FOLLOW": "CLICK_ANCHOR_AUDIENCE_VOICE_CHAT_FOLLOW";
             uElementPack.action2 = str1;
             u1.B(new ClickMetaData().setLogPage(uoe0).setType(uob).setElementPackage(uElementPack).setContentPackage(a.b(liveStreamPa1)));
          }
       }
       this.c.x0(q$b.a);
       return;
    }
}
