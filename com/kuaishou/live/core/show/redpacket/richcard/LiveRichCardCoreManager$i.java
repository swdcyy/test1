package com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager$i;
import uw1.d;
import com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.show.redpacket.richcard.core.LiveRichCardStateManager;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import bi2.g;
import pp.c;
import java.util.List;
import com.kuaishou.android.live.log.b;
import uw1.f;
import java.util.Map;
import java.lang.Long;
import z12.x;
import crd.b;
import ci2.b;
import ci2.b$a;
import brd.t;
import java.util.concurrent.TimeUnit;
import com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager$i$a;
import com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager$i$b;
import erd.g;
import java.lang.Integer;
import bi2.e;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.HashSet;
import java.util.Collection;
import com.kuaishou.live.core.show.redpacket.richcard.http.RichCardInfo;
import com.kuaishou.live.core.show.redpacket.richcard.http.UsingCardInfo;
import java.lang.Runnable;
import ekd.k1;
import ei2.a;
import z1.k;
import com.kuaishou.live.core.show.redpacket.container.LiveRedPacketContainerDialogFragment;
import android.view.ViewGroup;
import di2.a;
import xp5.i;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import di2.a$a;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import java.lang.Number;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MoreInfoPackageV2;
import k2b.u1;

public final class LiveRichCardCoreManager$i implements d	// class@000f4c
{
    public final LiveRichCardCoreManager a;

    public void LiveRichCardCoreManager$i(LiveRichCardCoreManager p0){
       this.a = p0;
       super();
    }
    public void a(String p0){
       boolean b1;
       String str1;
       Map map2;
       Object[] objArray1;
       long l;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveRichCardCoreManager$i.class, "1")) {
          return;
       }
       a.p(p0, "redPacketId");
       LiveRichCardStateManager h = LiveRichCardStateManager.h;
       Objects.requireNonNull(h);
       Object[] objArray = null;
       Map obj = PatchProxy.apply(objArray, h, LiveRichCardStateManager.class, "9");
       String str = 1;
       boolean b = false;
       if (obj != PatchProxyResult.class) {
          b1 = obj.booleanValue();
       }else {
          e c1 = LiveRichCardStateManager.c;
          if (c1.a() != null) {
             g og = c1.a();
             if (og == null || og.d() != 5) {
                b1 = true;
             }
          }
          b1 = false;
       }
       if (b1) {
          b.P(h.f().appendTag(this.a.m()), "[onGrabBtnClick] hasRichCard");
          return;
       }else {
          f uof = LiveRichCardCoreManager.e(this.a, p0, b, 2, objArray);
          if (uof != null) {
             obj = uof.i();
             if (obj != null) {
                str1 = obj.get("activity_biz");
                if (str1 != null) {
                label_0077 :
                   LiveRichCardCoreManager$i ta = this.a;
                   Map map = (uof != null)? uof.i(): objArray;
                   String str2 = "closeHandGrabCounter";
                   if (ta.p(map)) {
                      if (uof != null) {
                         Map map1 = uof.i();
                         if (map1 != null) {
                            String str3 = map1.get(str2);
                            if (str3 == null || Boolean.parseBoolean(str3) != str) {
                            }
                         }else if(uof != null){
                            map2 = uof.i();
                            if (map2 != null) {
                               map2 = map2.get("handGrabEventReportDelayTime");
                               if (map2 != null) {
                                  l = Long.parseLong(map2);
                               label_00b9 :
                                  l = x.B(l);
                                  b.S(h.f().appendTag(this.a.m()), "[onGrabBtnClick] reportHandleGrap start", "random", Long.valueOf(l));
                                  LiveRichCardCoreManager c = this.a.C;
                                  if (c != null) {
                                     c.dispose();
                                  }
                                  c.C = b.a.a().b(str1, this.a.j()).delaySubscription(l, TimeUnit.SECONDS).subscribe(new LiveRichCardCoreManager$i$a(this), new LiveRichCardCoreManager$i$b(this));
                                  return;
                               }
                            }
                         }
                         l = 5;
                         goto label_00b9 ;
                      }else {
                         goto label_00a0 ;
                      }
                   }
                   c uoc = h.f();
                   uoc.appendTag(this.a.m());
                   c uoc1 = uoc;
                   LiveRichCardCoreManager$i ta1 = this.a;
                   obj = (uof != null)? uof.i(): objArray;
                   Boolean uBoolean = Boolean.valueOf(ta1.p(obj));
                   if (uof != null) {
                      map2 = uof.i();
                      if (map2 != null) {
                         objArray = map2.get(str2);
                      }
                   }
                   b.T(uoc1, "[onGrabBtnClick] reportHandleGrap", "isAutoGrabRedPacket", uBoolean, "CLOSE_HAND_GRAB_COUNTER", objArray);
                   return;
                }
             }
          }
          str1 = "";
          goto label_0077 ;
       }
    }
    public void b(String p0,List p1){
       boolean b;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveRichCardCoreManager$i.class, "2")) {
          return;
       }
       String str = "redPacketId";
       a.p(p0, str);
       LiveRichCardStateManager h = LiveRichCardStateManager.h;
       c uoc = h.f();
       uoc.appendTag(this.a.m());
       c uoc1 = uoc;
       g og = this.a.o.a();
       String str1 = null;
       Integer integer = (og != null)? Integer.valueOf(og.d()): str1;
       b.T(uoc1, "拿到了红包结果", "item", p1, "state", integer);
       if (!this.a.o.g()) {
          return;
       }else {
          f uof = this.a.h();
          String str2 = (uof != null)? uof.a(): str1;
          int i = 1;
          b = false;
          boolean b1 = (!a.g(p0, str2) || (h.a() || !h.a()))? true: false;
          if (!b1) {
             b.S(h.f().appendTag(this.a.m()), "[当前红包不支持自动抢]", "enableAutoGrab", Boolean.valueOf(b1));
             return;
          }else if(LiveRichCardCoreManager.e(this.a, p0, b, 2, str1) == null){
             uof = this.a.h();
             str2 = (uof != null)? uof.a(): str1;
             if (TextUtils.n(p0, str2)) {
             label_00d3 :
                LiveRichCardCoreManager$i ta = this.a;
                Objects.requireNonNull(ta);
                if (!PatchProxy.applyVoidTwoRefs(p0, p1, ta, LiveRichCardCoreManager.class, "9")) {
                   a.p(p0, str);
                   ta.l.add(p0);
                   if (p1 != null && (p1.isEmpty() ^ i)) {
                      g og1 = ta.o.a();
                      if (og1 != null) {
                         RichCardInfo richCardInfo = og1.b();
                         if (richCardInfo != null) {
                            UsingCardInfo usingCardInf = richCardInfo.getUsingCardInfo();
                            if (usingCardInf != null) {
                               b = usingCardInf.getCardCanUseRemainCount();
                            }
                         }
                      }
                      if ((b - 1) <= 0) {
                         b.P(h.f().appendTag(ta.a), "[onGrabResult] 次数用光了");
                         ta.o.i(p1);
                         k1.m(ta.G);
                         k1.r(ta.G, ta.c);
                      }
                   }
                label_0133 :
                   LiveRichCardCoreManager g = ta.g;
                   if (g != null) {
                      str1 = g.a();
                   }
                   if (a.g(p0, str1)) {
                      ta.y(ta.i());
                   }
                   ta.o.i(p1);
                }
             }else {
                c uoc2 = h.f();
                uoc2.appendTag(this.a.m());
                uoc1 = uoc2;
                f uof1 = this.a.h();
                if (uof1 != null) {
                   str1 = uof1.a();
                }
                b.T(uoc1, "[onGrabResult] 没有找到对应的红包", "grab redPacketId", p0, "holder redPacketId", str1);
             }
          }else {
             goto label_00d3 ;
          }
          return;
       }
    }
    public void c(String p0){
       boolean b;
       boolean b1;
       a$a a;
       LiveRedPacketContainerDialogFragment liveRedPacke;
       ViewGroup viewGroup;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveRichCardCoreManager$i.class, "3")) {
          return;
       }
       a.p(p0, "redPacketId");
       g og = this.a.o.a();
       if (og != null && og.d() == 5) {
          b.P(LiveRichCardStateManager.h.f().appendTag(this.a.m()), "[onRedPacketSelect] 当前没有暴富卡");
          return;
       }else {
          b = false;
          Integer integer = null;
          f uof = LiveRichCardCoreManager.e(this.a, p0, b, 2, integer);
          int i = 1;
          if (uof != null) {
             f uof1 = this.a.h();
             String str = (uof1 != null)? uof1.a(): integer;
             if (!TextUtils.n(p0, str) || (this.a.o.g() || this.a.o.f())) {
                b1 = true;
             label_0070 :
                a uoa = LiveRichCardCoreManager.a(this.a);
                Objects.requireNonNull(uoa);
                a uoa1 = a.class;
                if (PatchProxy.isSupport(uoa1) && (!PatchProxy.applyVoidOneRefs(Boolean.valueOf(b1), uoa, uoa1, "10") && uoa.f.get() != null)) {
                   if (b1) {
                      uoa.b();
                      liveRedPacke = uoa.f.get();
                      if (liveRedPacke != null) {
                         viewGroup = liveRedPacke.Ch();
                         if (viewGroup != null) {
                            viewGroup.setVisibility(b);
                         }
                      }
                   }else {
                      liveRedPacke = uoa.f.get();
                      if (liveRedPacke != null) {
                         viewGroup = liveRedPacke.Ch();
                         if (viewGroup != null) {
                            viewGroup.setVisibility(8);
                         }
                      }
                   }
                }
                if (uof != null) {
                   a = a.a;
                   ClientContent$LiveStreamPackage liveStreamPa = this.a.k().a();
                   a.o(liveStreamPa, "logPackageProvider.liveStreamPackage");
                   String str1 = LiveRichCardCoreManager.g(this.a, integer, i, integer);
                   String str2 = "";
                   if (str1 == null) {
                      str1 = str2;
                   }
                   f uof2 = this.a.h();
                   if (uof2 != null) {
                      integer = Integer.valueOf(uof2.g());
                   }
                   uof2 = this.a.h();
                   if (uof2 != null) {
                      String str3 = uof2.a();
                      if (str3 != null) {
                         str2 = str3;
                      }
                   }
                   Objects.requireNonNull(a);
                   if (!PatchProxy.applyVoidFourRefs(liveStreamPa, str1, integer, str2, a, a$a.class, "1")) {
                      a.p(liveStreamPa, "liveStreamPackage");
                      ShowMetaData showMetaData = new ShowMetaData();
                      ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                      uElementPack.action2 = "OP_ACTIVITY_DRAW_PRIZE_ROLL_RICHES_CARD";
                      JsonObject jsonObject = new JsonObject();
                      jsonObject.c0("activity_name", str1);
                      jsonObject.a0("box_type", integer);
                      jsonObject.c0("id", str2);
                      uElementPack.params = jsonObject.toString();
                      showMetaData.setElementPackage(uElementPack);
                      showMetaData.setContentPackage(new ClientContent$ContentPackage());
                      showMetaData.getContentPackage().moreInfoPackage = new ClientContent$MoreInfoPackageV2();
                      showMetaData.getContentPackage().liveStreamPackage = liveStreamPa;
                      u1.B0(showMetaData);
                   }
                }
                return;
             }
          }
          b1 = false;
          goto label_0070 ;
       }
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, LiveRichCardCoreManager$i.class, "5")) {
          return;
       }
       LiveRichCardCoreManager.a(this.a).c();
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, LiveRichCardCoreManager$i.class, "4")) {
          return;
       }
       LiveRichCardCoreManager.a(this.a).b();
       return;
    }
}
