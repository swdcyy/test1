package com.kuaishou.live.core.show.activityredpacket.LiveActivityRedPacketPresenter$d;
import lf3.g;
import com.kuaishou.live.core.show.activityredpacket.LiveActivityRedPacketPresenter;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveTreasureBoxMessage$SCLiveTreasureBoxShow;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.conditionredpacket.logger.LiveRedPacketAction;
import com.kuaishou.livestream.message.nano.LiveTreasureBoxMessage$LiveTreasureBoxShow;
import y22.q;
import java.lang.Boolean;
import java.util.List;
import com.kuaishou.android.live.log.b;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import tw1.f;
import java.lang.Long;
import java.util.Map;
import tw1.a;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.StringBuilder;
import o22.b;
import java.util.Objects;
import cx1.a;
import p91.m;
import com.yxcorp.utility.TextUtils;
import yw1.a;
import n22.b;
import java.util.Set;
import java.util.Iterator;
import pg2.a;
import com.kuaishou.livestream.message.nano.LiveTreasureBoxMessage$MagicEffectsInfo;
import com.kuaishou.live.common.core.component.magiceffect.LiveMagicEffectUtil;
import sz2.g;
import com.kuaishou.live.core.show.redpacket.activity.effect.LiveRedPacketActivityEffectParams$b;
import com.kuaishou.live.core.show.redpacket.activity.effect.LiveRedPacketActivityEffectParams;
import g03.a;
import sz2.c;
import crd.b;
import pz2.c;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import n22.a;
import erd.g;
import eg1.e;
import lf3.f;

public class LiveActivityRedPacketPresenter$d implements g	// class@000935
{
    public final LiveActivityRedPacketPresenter b;

    public void LiveActivityRedPacketPresenter$d(LiveActivityRedPacketPresenter p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       boolean b;
       int i1;
       LiveTreasureBoxMessage$SCLiveTreasureBoxShow sCLiveTreasu;
       int i2;
       LiveTreasureBoxMessage$LiveTreasureBoxShow treasureBoxI;
       LiveTreasureBoxMessage$LiveTreasureBoxShow grabTime;
       boolean b2;
       String str3;
       List a;
       Object obj = this;
       LiveTreasureBoxMessage$SCLiveTreasureBoxShow obj1 = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, LiveActivityRedPacketPresenter$d.class, "1")) {
       }else {
          obj1 = obj1.show;
          LiveTreasureBoxMessage$LiveTreasureBoxShow obj2 = null;
          List list = -1;
          if (obj1 == null || obj1.length <= 0) {
             b.P(LiveActivityRedPacketPresenter.I, "onInvalidReceiveActivityRedPacketInfo");
             q.l(-1011, null, -1);
          }else {
             boolean len = obj1.length;
             b obj3 = obj;
             int i = 0;
             while (i < len) {
                object oobject = obj1[i];
                obj3.b.S8(oobject, LiveRedPacketAction.RED_PACK_RECEIVE_NEW_SIGNAL);
                List obj4 = PatchProxy.applyOneRefs(oobject, obj2, q.class, "17");
                String str = "redPacketId";
                if (obj4 != patchProxyRe) {
                   b = obj4.booleanValue();
                   i1 = len;
                }else if(oobject == null){
                   b.P(q.a, "redPacketShownInfo is null");
                   q.l(-1012, obj2, list);
                label_0052 :
                   i1 = len;
                }else if(TextUtils.isEmpty(oobject.treasureBoxId)){
                   b.P(q.a, "invalidRedPacketShownInfo redPacketId is null");
                   q.l(-1013, obj2, oobject.boxType);
                   goto label_0052 ;
                }else {
                   LiveTreasureBoxMessage$LiveTreasureBoxShow userInfo = oobject.userInfo;
                   if (userInfo != null) {
                      i1 = 0;
                      if (userInfo.userId - i1) {
                         userInfo = oobject.showPage;
                         if (userInfo == null || userInfo.length <= 0) {
                            i1 = len;
                            b.S(q.a, "invalidRedPacketShownInfo showPage is null", str, oobject.treasureBoxId);
                            q.l(-1006, obj2, oobject.boxType);
                         }else {
                            LiveTreasureBoxMessage$LiveTreasureBoxShow grabTime1 = oobject.grabTime;
                            i1 = len;
                            if (grabTime1 - i1 > 0 && oobject.startShowTime - grabTime1 <= 0) {
                               treasureBoxI = oobject.showDeadline;
                               if (treasureBoxI - grabTime1 >= 0) {
                                  if (treasureBoxI - f.a() <= 0) {
                                     b.S(q.a, "invalidRedPacketShownInfo showDeadline invalid", str, oobject.treasureBoxId);
                                     q.l(-1001, obj2, oobject.boxType);
                                  }else {
                                     b = true;
                                  }
                               }
                            }
                            b.V(q.a, "invalidRedPacketShownInfo grabTime or startShowTime invalid", "redPacketId", oobject.treasureBoxId, "grabTime", Long.valueOf(grabTime1), "startShowTime", Long.valueOf(oobject.startShowTime), "showDeadline", Long.valueOf(oobject.showDeadline));
                            q.l(-1008, obj2, oobject.boxType);
                         }
                      }
                   }
                   i1 = len;
                   a = q.a;
                   treasureBoxI = oobject.treasureBoxId;
                   String str4 = (userInfo == null)? "null": Long.valueOf(userInfo.userId);
                   b.T(a, "invalidRedPacketShownInfo userInfo is invalid", "redPacketId", treasureBoxI, "userId", str4);
                   q.l(-1007, obj2, oobject.boxType);
                }
                b = false;
                if (!b) {
                   b.S(LiveActivityRedPacketPresenter.I, "receiveRedPacketInfo but invalid", str, oobject.treasureBoxId);
                }else {
                   treasureBoxI = oobject.treasureBoxId;
                   len = obj3.b.u.containsKey(treasureBoxI);
                   if (obj3.b.w.containsKey(treasureBoxI) && !len) {
                      b.S(LiveActivityRedPacketPresenter.I, "receiveRedPacketInfo but can not display", str, treasureBoxI);
                      q.l(-1014, obj2, oobject.boxType);
                   }else if(a.a(a.c(oobject))){
                      a.e(LiveLogTag.ACTIVITY_LEEE, a.c(oobject));
                      q.l(-1009, obj2, oobject.boxType);
                      b.P(LiveActivityRedPacketPresenter.I, "has grab redPacket£¬continue£¬redPacketId = "+treasureBoxI);
                   }else {
                      obj4 = LiveActivityRedPacketPresenter.I;
                      b.S(obj4, "receiveRedPacketInfo and update", str, treasureBoxI);
                      b uob = new b(oobject);
                      obj3.b.t.put(treasureBoxI, uob);
                      LiveActivityRedPacketPresenter$d b1 = obj3.b;
                      Objects.requireNonNull(b1);
                      String str1 = "2";
                      if (!PatchProxy.applyVoidOneRefs(oobject, b1, LiveActivityRedPacketPresenter.class, str1)) {
                         a uoa2 = b1.p.n();
                         if (uoa2 != null) {
                            if (TextUtils.x(oobject.grabUrl)) {
                               str3 = "redPacketShownInfo.grabUrl is empty";
                               b.P(obj4, str3);
                               b1.W8(str3);
                            }
                            if (TextUtils.x(oobject.tokenUrl)) {
                               str3 = "redPacketShownInfo.tokenUrl is empty";
                               b.P(obj4, str3);
                               b1.W8(str3);
                            }
                            if (TextUtils.x(oobject.topLuckyUrl)) {
                               str3 = "redPacketShownInfo.topLuckyUrl is empty";
                               b.P(obj4, str3);
                               b1.W8(str3);
                            }
                            sCLiveTreasu = obj1;
                            uoa2.b(oobject.bizType, oobject.treasureBoxId, new a(oobject.grabUrl, oobject.topLuckyUrl, oobject.tokenUrl));
                         label_01ec :
                            if (!len) {
                               LiveActivityRedPacketPresenter s = obj3.b.s;
                               obj2 = oobject.magicEffects;
                               grabTime = oobject.grabTime;
                               Objects.requireNonNull(s);
                               obj3 = b.class;
                               if (PatchProxy.isSupport(obj3)) {
                                  Iterator obj5 = PatchProxy.applyThreeRefs(treasureBoxI, obj2, Long.valueOf(grabTime), s, b.class, "1");
                                  if (obj5 != patchProxyRe) {
                                     b2 = obj5.booleanValue();
                                     i2 = i1;
                                  }else {
                                  label_021f :
                                     obj5 = s.d.keySet().iterator();
                                     while (true) {
                                        if (obj5.hasNext()) {
                                           if (TextUtils.equals(obj5.next().K(), treasureBoxI)) {
                                              i2 = i1;
                                              LiveActivityRedPacketPresenter$d uod = 1;
                                           }
                                        }else if(obj2 == null){
                                           i2 = i1;
                                        }else {
                                           i2 = i1;
                                           long l = LiveMagicEffectUtil.a(obj2.magicEffectKey, 0);
                                           String str2 = "LiveActivityRedPacketEffectController";
                                           if (!g.e(l)) {
                                              b.S(LiveLogTag.LIVE_ACTIVITY_RED_PACKET.appendTag(str2), "magicFaceId invalid", str, treasureBoxI);
                                           }else {
                                              LiveTreasureBoxMessage$MagicEffectsInfo rank = obj2.rank;
                                              Iterator iterator = s.d.keySet().iterator();
                                              while (true) {
                                                 if (iterator.hasNext()) {
                                                    a uoa = iterator.next();
                                                    Iterator iterator1 = iterator;
                                                    if (uoa.z() == rank) {
                                                       b.T(LiveLogTag.LIVE_ACTIVITY_RED_PACKET.appendTag(str2), "has equal rank", "redPacketId", treasureBoxI, "displaying effect redPacketId", uoa.K());
                                                    }else {
                                                       iterator = iterator1;
                                                    }
                                                 }else {
                                                    LiveRedPacketActivityEffectParams$b uob1 = new LiveRedPacketActivityEffectParams$b(treasureBoxI, l, obj2.rank);
                                                    uob1.b(obj2.isDisplayImmediately);
                                                    int i3 = obj2.cannotBeBreak ^ 1;
                                                    uob1.e = i3;
                                                    uob1.f = grabTime;
                                                    a uoa1 = new a(uob1.a(), s.c.Bl());
                                                    b d = s.d;
                                                    if (PatchProxy.isSupport(obj3)) {
                                                       obj3 = PatchProxy.applyTwoRefs(uoa1, Long.valueOf(grabTime), s, obj3, str1);
                                                       if (obj3 != patchProxyRe) {
                                                       label_02f7 :
                                                          d.put(uoa1, obj3);
                                                          s.b.o1(uoa1);
                                                       }
                                                    }
                                                    s.a(uoa1);
                                                    long l1 = grabTime - f.a();
                                                    obj3 = t.timer(l1, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new a(s, uoa1));
                                                    goto label_02f7 ;
                                                 }
                                              }
                                           }
                                        }
                                        b2 = false;
                                        break ;
                                        b2 = true;
                                        break ;
                                     }
                                  }
                               }else {
                                  goto label_021f ;
                               }
                               if (b2) {
                               label_030a :
                                  obj3 = obj;
                               label_030b :
                                  i = i + 1;
                                  len = i2;
                                  obj1 = sCLiveTreasu;
                                  obj2 = null;
                                  list = -1;
                               }
                            }else {
                               i2 = i1;
                            }
                            obj.b.P8(treasureBoxI, uob);
                            goto label_030a ;
                         }
                      }
                      sCLiveTreasu = obj1;
                      goto label_01ec ;
                   }
                }
                sCLiveTreasu = obj1;
                i2 = i1;
                goto label_030b ;
             }
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
