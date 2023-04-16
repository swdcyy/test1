package com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager$j;
import zh2.b;
import com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.redpacket.richcard.core.LiveRichCardStateManager;
import pp.c;
import java.util.List;
import com.kuaishou.android.live.log.b;
import uw1.m;
import java.util.Map;
import java.util.Objects;
import com.kuaishou.live.core.show.redpacket.richcard.handler.KrnDialogHandler;
import oa1.a;
import nsd.u;
import p63.a;
import p63.a$a;
import p63.a$b;
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import bi2.g;
import com.kuaishou.live.core.show.redpacket.richcard.http.RichCardInfo;
import com.kuaishou.live.core.show.redpacket.richcard.http.UsingCardInfo;
import oa1.b;
import com.kuaishou.live.jsbridge.LiveKrnPageKey;
import o63.a;
import msd.l;
import o63.d;
import uw1.f;
import java.lang.Integer;
import di2.a;
import xp5.i;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import kotlin.jvm.internal.a;
import di2.a$a;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import java.lang.Number;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MoreInfoPackageV2;
import k2b.u1;

public final class LiveRichCardCoreManager$j implements b	// class@000f4d
{
    public final LiveRichCardCoreManager a;

    public void LiveRichCardCoreManager$j(LiveRichCardCoreManager p0){
       this.a = p0;
       super();
    }
    public void a(){
       Object obj = this;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, LiveRichCardCoreManager$j.class, "2")) {
          return;
       }
       LiveRichCardStateManager h = LiveRichCardStateManager.h;
       b.P(h.f().appendTag(obj.a.m()), "点击小黑条的使用按钮");
       obj.a.l().D0();
       LiveRichCardCoreManager$j a = obj.a;
       LiveRichCardCoreManager q = a.q;
       String str = LiveRichCardCoreManager.g(a, objArray, 1, objArray);
       Objects.requireNonNull(q);
       if (!PatchProxy.applyVoidOneRefs(str, q, KrnDialogHandler.class, "1")) {
          b.c0(h.f(), "[openPrivacyDialog]", "activityBiz", str);
          a uoa = new a(0, 0, 0x3f800000, 0x3f800000, 0, 0, null, true, 0, 355, null);
          a$a uoa1 = a.b.a();
          g og = q.b.a();
          if (og != null) {
             RichCardInfo richCardInfo = og.b();
             if (richCardInfo != null) {
                UsingCardInfo usingCardInf = richCardInfo.getUsingCardInfo();
                if (usingCardInf != null) {
                   objArray = String.valueOf(usingCardInf.getCardId());
                }
             }
          }
          b.d(b.a, q.a, LiveKrnPageKey.LiveRichCardPrivacyDialog, uoa1.a("cardId", objArray).a("activityBiz", str).b(), h, null, 16, null);
       }
       return;
    }
    public void b(){
       Object obj = this;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, LiveRichCardCoreManager$j.class, "1")) {
          return;
       }
       b.P(LiveRichCardStateManager.h.f().appendTag(obj.a.m()), "点击小黑条的退出按钮");
       obj.a.l().D0();
       LiveRichCardCoreManager$j a = obj.a;
       LiveRichCardCoreManager q = a.q;
       String str = LiveRichCardCoreManager.g(a, objArray, 1, objArray);
       f uof = obj.a.h();
       Integer integer = (uof != null)? Integer.valueOf(uof.g()): objArray;
       uof = obj.a.h();
       String str1 = (uof != null)? uof.a(): objArray;
       KrnDialogHandler.b(q, str, integer, str1, false, 8, null);
       a$a a1 = a.a;
       ClientContent$LiveStreamPackage liveStreamPa = obj.a.k().a();
       a.o(liveStreamPa, "logPackageProvider.liveStreamPackage");
       String str2 = LiveRichCardCoreManager.g(obj.a, objArray, 1, objArray);
       str = "";
       if (str2 == null) {
          str2 = str;
       }
       f uof1 = obj.a.h();
       if (uof1 != null) {
          objArray = Integer.valueOf(uof1.g());
       }
       uof1 = obj.a.h();
       if (uof1 != null) {
          String str3 = uof1.a();
          if (str3 != null) {
             str = str3;
          }
       }
       Objects.requireNonNull(a1);
       if (!PatchProxy.applyVoidFourRefs(liveStreamPa, str2, objArray, str, a1, a$a.class, "2")) {
          a.p(liveStreamPa, "liveStreamPackage");
          ClickMetaData uClickMetaDa = new ClickMetaData();
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "OP_ACTIVITY_DRAW_PRIZE_ROLL_RICHES_CARD";
          JsonObject jsonObject = new JsonObject();
          jsonObject.c0("activity_name", str2);
          jsonObject.a0("box_type", objArray);
          jsonObject.c0("id", str);
          uElementPack.params = jsonObject.toString();
          uClickMetaDa.setElementPackage(uElementPack);
          uClickMetaDa.setContentPackage(new ClientContent$ContentPackage());
          uClickMetaDa.getContentPackage().moreInfoPackage = new ClientContent$MoreInfoPackageV2();
          uClickMetaDa.getContentPackage().liveStreamPackage = liveStreamPa;
          u1.B(uClickMetaDa);
       }
       return;
    }
}
