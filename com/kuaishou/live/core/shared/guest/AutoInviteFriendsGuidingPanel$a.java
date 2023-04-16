package com.kuaishou.live.core.shared.guest.AutoInviteFriendsGuidingPanel$a;
import java.lang.Object;
import nsd.u;
import android.app.Activity;
import qu2.a;
import t02.a0;
import com.kuaishou.live.core.shared.guest.AutoInviteFriendsGuidingPanel$Entrance;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse;
import ry1.b;
import f22.a;
import java.lang.Enum;
import com.kuaishou.live.core.basic.model.LiveVerticalSceneConfig;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse$LiveVoicePartyConfig;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import pm8.a;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import com.kuaishou.live.core.shared.guest.AutoInviteFriendsGuidingPanel;
import u07.t$a;
import u07.a;
import w07.k;
import lnc.a1;
import w07.l;
import f22.e;
import u07.u;
import f22.f;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import f22.d;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;
import android.content.SharedPreferences$Editor;
import oe6.g;
import f22.g;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import java.util.Objects;
import f22.g$a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class AutoInviteFriendsGuidingPanel$a	// class@000920
{

    public void AutoInviteFriendsGuidingPanel$a(){
       super();
    }
    public void AutoInviteFriendsGuidingPanel$a(u p0){
       super();
    }
    public final void a(Activity p0,a p1,a0 p2,AutoInviteFriendsGuidingPanel$Entrance p3){
       String this;
       boolean b1;
       SharedPreferences a;
       g$a a1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, AutoInviteFriendsGuidingPanel$a.class, "1")) {
          return;
       }
       String str = "activity";
       a.p(p0, str);
       a.p(p1, "liveBasicContext");
       String str1 = "livePlayCallerContext";
       a.p(p2, str1);
       String str2 = "entrance";
       a.p(p3, str2);
       this = "2";
       AutoInviteFriendsGuidingPanel obj = PatchProxy.applyTwoRefs(p2, p3, this, AutoInviteFriendsGuidingPanel$a.class, this);
       boolean b = false;
       if (obj != patchProxyRe) {
          b1 = obj.booleanValue();
       }else {
          a.p(p2, str1);
          a.p(p3, str2);
          p2 = p2.b3;
          a.o(p2, "livePlayCallerContext.mL¡­dienceStatusObtainService");
          LiveTimeConsumingUserStatusResponse liveTimeCons = p2.d0();
          int i = a.a[p3.ordinal()];
          if (i != 1) {
             if (i == 2 && liveTimeCons != null) {
                liveTimeCons = liveTimeCons.mLiveVerticalSceneConfig;
                if (liveTimeCons != null) {
                   b1 = liveTimeCons.isAutoInviteFriendsGuidingEnabled;
                }
             }
          }else if(liveTimeCons != null){
             liveTimeCons = liveTimeCons.mLiveVoicePartyConfig;
             if (liveTimeCons != null) {
                b1 = liveTimeCons.isAutoInvitationGuidingPanelEnabled;
             }
          }
          b1 = null;
       }
       if (b1 == null) {
          b.Z(LiveLogTag.GUEST_INVITE_FRIENDS, "AutoInviteFriendsGuidingPanel not enabled");
          return;
       }else {
          a = a.a;
          str1 = "user";
          str2 = "isAutoInviteFriendsGuidingPanelShown";
          if (a.getBoolean(b.d(str1)+str2, b)) {
             return;
          }else {
             b.Z(LiveLogTag.GUEST_INVITE_FRIENDS, "AutoInviteFriendsGuidingPanel shown");
             AutoInviteFriendsGuidingPanel uAutoInviteF = new AutoInviteFriendsGuidingPanel(p1);
             obj = AutoInviteFriendsGuidingPanel.class;
             if (!PatchProxy.applyVoidOneRefs(p0, uAutoInviteF, obj, "1")) {
                a.p(p0, str);
                t$a uoa = a.b(new t$a(p0));
                uoa.B0(R.drawable.arg_RES_7f0805b8);
                uoa.V0(true);
                uoa.a0(new k(R.drawable.arg_RES_7f082541, 0x7f0606da, a1.e(100.00f)));
                uoa.W0(R.string.arg_RES_7f102307);
                uoa.y0(R.string.arg_RES_7f102305);
                uoa.S0(R.string.arg_RES_7f102304);
                uoa.u0(new e(uAutoInviteF));
                uoa.s0(new f(uAutoInviteF));
                d uod = PatchProxy.apply(null, uAutoInviteF, obj, this);
                if (uod != patchProxyRe) {
                }else {
                   uod = new d(uAutoInviteF);
                }
                uoa.Y(uod);
             }
             SharedPreferences$Editor uEditor = a.edit();
             uEditor.putBoolean(b.d(str1)+str2, true);
             g.a(uEditor);
             a1 = g.a;
             e0 uoe0 = p1.c();
             ClientContent$LiveStreamPackage liveStreamPa = p1.a();
             ClientContent$LiveVoicePartyPackageV2 liveVoicePar = p1.y();
             Objects.requireNonNull(a1);
             if (!PatchProxy.applyVoidThreeRefs(uoe0, liveStreamPa, liveVoicePar, a1, g$a.class, "1")) {
                a.p(liveStreamPa, "liveStreamPackage");
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "FIRST_AUTO_INVITE_FRIEND_POPUP";
                ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                uContentPack.liveVoicePartyPackage = liveVoicePar;
                uContentPack.liveStreamPackage = liveStreamPa;
                u1.C0("", uoe0, 10, uElementPack, uContentPack);
             }
             return;
          }
       }
    }
}
