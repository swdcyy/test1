package com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.LiveAudienceMultiLineGiftBattleDataBinding$createSubVc$2;
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
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.util.Map;
import com.kuaishou.live.common.core.component.multiline.log.LiveMultiLineLogger;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BatchUserPackage;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import java.util.ArrayList;
import com.kuaishou.protobuf.livestream.nano.LiveScoreLineChatTeamMember;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.u1;

public final class LiveAudienceMultiLineGiftBattleDataBinding$createSubVc$2 extends Lambda implements a	// class@001568
{
    public final LiveAudienceMultiLineGiftBattleDataBinding this$0;

    public void LiveAudienceMultiLineGiftBattleDataBinding$createSubVc$2(LiveAudienceMultiLineGiftBattleDataBinding p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       ClientEvent$ElementPackage uElementPack;
       ClientContent$ContentPackage uContentPack;
       ClientContent$BatchUserPackage uBatchUserPa;
       Object[] objArray2;
       ArrayList uArrayList;
       ClientContent$UserPackage[] userPackageA;
       Object[] objArray3;
       int len;
       int i;
       ClientContent$UserPackage userPackage;
       object oobject;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveAudienceMultiLineGiftBattleDataBinding$createSubVc$2.class, "1")) {
          return;
       }
       LiveAudienceMultiLineGiftBattleDataBinding$createSubVc$2 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       if (!PatchProxy.applyVoid(objArray, tthis$0, LiveAudienceMultiLineGiftBattleDataBinding.class, "8")) {
          a a = a.a;
          ClientContent$LiveStreamPackage liveStreamPa = tthis$0.s.a();
          a.o(liveStreamPa, "liveLogPackageProvider.liveStreamPackage");
          e0 page = tthis$0.s.getPage();
          a.o(page, "liveLogPackageProvider.page");
          a$a uoa = g.b(tthis$0.r, tthis$0.q.d());
          a.o(uoa, "LiveMultiLineUtils.creat¡­ager.anchorUserId\n      \)");
          LiveScoreLineChatTeam[] liveScoreLin = tthis$0.p.Z();
          Integer integer = tthis$0.p.T();
          Objects.requireNonNull(a);
          a uoa1 = a.class;
          if (PatchProxy.isSupport(uoa1)) {
             Object[] objArray1 = new Object[]{liveStreamPa,page,uoa,liveScoreLin,integer};
             if (!PatchProxy.applyVoid(objArray1, a, uoa1, "4")) {
             }
          }else {
          }
       }
    label_0123 :
       return;
    }
}
