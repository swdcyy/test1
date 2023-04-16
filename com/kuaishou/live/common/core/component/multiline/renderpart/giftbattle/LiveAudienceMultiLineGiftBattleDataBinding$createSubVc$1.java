package com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.LiveAudienceMultiLineGiftBattleDataBinding$createSubVc$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.LiveAudienceMultiLineGiftBattleDataBinding;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import oq1.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import xp5.i;
import kotlin.jvm.internal.a;
import k2b.e0;
import xp5.g;
import sz1.e;
import com.kuaishou.live.common.core.component.multiline.log.a$a;
import ls1.g;
import com.kuaishou.protobuf.livestream.nano.LiveScoreLineChatTeam;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.model.LiveMultiLineGiftBattleModel;
import java.lang.Integer;

public final class LiveAudienceMultiLineGiftBattleDataBinding$createSubVc$1 extends Lambda implements a	// class@001567
{
    public final LiveAudienceMultiLineGiftBattleDataBinding this$0;

    public void LiveAudienceMultiLineGiftBattleDataBinding$createSubVc$1(LiveAudienceMultiLineGiftBattleDataBinding p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveAudienceMultiLineGiftBattleDataBinding$createSubVc$1.class, "1")) {
          return;
       }
       LiveAudienceMultiLineGiftBattleDataBinding$createSubVc$1 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       if (!PatchProxy.applyVoid(objArray, tthis$0, LiveAudienceMultiLineGiftBattleDataBinding.class, "7")) {
          ClientContent$LiveStreamPackage liveStreamPa = tthis$0.s.a();
          a.o(liveStreamPa, "liveLogPackageProvider.liveStreamPackage");
          e0 page = tthis$0.s.getPage();
          a.o(page, "liveLogPackageProvider.page");
          a$a uoa = g.b(tthis$0.r, tthis$0.q.d());
          a.o(uoa, "LiveMultiLineUtils.creat¡­ager.anchorUserId\n      \)");
          a.a.c(liveStreamPa, page, uoa, false, "FALSE", tthis$0.p.Z(), tthis$0.p.T());
       }
       return;
    }
}
