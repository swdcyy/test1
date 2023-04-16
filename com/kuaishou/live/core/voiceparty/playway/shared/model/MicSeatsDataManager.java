package com.kuaishou.live.core.voiceparty.playway.shared.model.MicSeatsDataManager;
import com.kuaishou.live.core.voiceparty.playway.shared.model.MicSeatsDataManager$a;
import nsd.u;
import msd.a;
import co2.f2;
import hf3.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import android.os.Handler;
import android.os.Looper;
import wa1.i;
import wa1.h;
import com.kuaishou.live.core.voiceparty.playway.shared.model.MicSeatsDataManager$updateTrigger$1;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$MicSeatDetailInfo;
import com.kuaishou.live.core.voiceparty.micseats.mode.VoicePartyMicSeatData;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import xs2.l;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$MicSeatDecorationInfo;
import xs2.l$a;
import pt2.b;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$MicSeatUserInfo;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.framework.model.user.UserExtraInfo;
import java.lang.CharSequence;
import android.text.TextUtils;
import xx2.b;
import java.util.Objects;
import xx2.b$a;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$MicSeatUserLevelMicSeatDecorationInterest;
import java.util.ArrayList;
import com.kuaishou.protobuf.livestream.nano.LiveCdnNodeView;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$MicSeatUserHatInfo;
import com.kuaishou.live.core.voiceparty.hat.VoicePartyHatInfo;
import java.lang.Boolean;
import com.kuaishou.live.core.voiceparty.playway.shared.model.MicSeatsDataManager$updateMicSeatDataList$1;
import java.lang.Iterable;
import msd.l;
import com.kuaishou.live.core.voiceparty.playway.shared.model.MicSeatsDataManager$updateMicSeatDataList$2;
import java.lang.Integer;
import java.util.Collection;
import trd.u;
import java.util.Iterator;
import qs2.r;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import z12.e;
import com.kuaishou.livestream.message.nano.KtvMusicOrderStatisticsInfo;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$MicSeatsUserApplyInfo;
import tu2.b;
import com.kuaishou.live.core.voiceparty.playway.shared.model.MicSeatsDataManager$c;
import java.lang.Runnable;
import xs2.m;
import ekd.q;
import java.lang.Number;
import com.kuaishou.live.core.voiceparty.playway.shared.model.MicSeatsDataManager$b;
import com.kuaishou.live.core.voiceparty.playway.shared.model.MicSeatsDataManager$d;
import com.kuaishou.livestream.message.nano.SCMicSeatsInfo;
import lf3.g;
import com.kuaishou.live.core.voiceparty.playway.shared.model.MicSeatsDataManager$e;
import com.kuaishou.livestream.message.nano.SCLiveVoicePartyPkOpMicSeats;
import com.kuaishou.live.core.voiceparty.playway.shared.model.MicSeatsDataManager$f;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCMicSeatsApplyInfo;
import com.kuaishou.live.core.voiceparty.playway.shared.model.MicSeatsDataManager$g;
import com.kuaishou.livestream.message.nano.SCLiveVoicePartyPkEnd;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.framework.model.user.User;
import qa6.b;
import com.kuaishou.live.core.voiceparty.teampk.model.VoicePartyTeamPkMicSeatInfo;
import com.kuaishou.live.core.voiceparty.teampk.model.VoicePartyTeamPkMicSeatInfo$MicSeatsUserInfo;
import com.kuaishou.live.core.voiceparty.model.MicSeatLevelInterest$Decoration;
import com.yxcorp.gifshow.model.CDNUrl;

public abstract class MicSeatsDataManager	// class@00187e
{
    public List a;
    public List b;
    public List c;
    public List d;
    public int e;
    public int f;
    public final Handler g;
    public final i h;
    public final h i;
    public final i j;
    public final a k;
    public final a l;
    public final f2 m;
    public final a n;
    public static final MicSeatsDataManager$a o;

    static {
       MicSeatsDataManager.o = new MicSeatsDataManager$a(null);
    }
    public void MicSeatsDataManager(a p0,f2 p1,a p2){
       a.p(p0, "anchorUserIdFetcher");
       a.p(p1, "voicePartyContext");
       a.p(p2, "liveLongConnection");
       super();
       this.l = p0;
       this.m = p1;
       this.n = p2;
       this.a = CollectionsKt__CollectionsKt.E();
       this.b = CollectionsKt__CollectionsKt.E();
       this.c = CollectionsKt__CollectionsKt.E();
       this.d = CollectionsKt__CollectionsKt.E();
       this.g = new Handler(Looper.getMainLooper());
       this.h = new i();
       this.i = new h(p2);
       this.j = new i();
       this.k = new MicSeatsDataManager$updateTrigger$1(this);
    }
    public static void F(MicSeatsDataManager p0,List p1,boolean p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = false;
       }
       p0.C(p1, p2);
       return;
    }
    public static int g(MicSeatsDataManager p0,boolean p1,int p2,Object p3){
       if (p2 & 1) {
          p1 = true;
       }
       return p0.f(p1);
    }
    public static int n(MicSeatsDataManager p0,boolean p1,int p2,Object p3){
       if (p2 & 1) {
          p1 = true;
       }
       return p0.m(p1);
    }
    public static boolean q(MicSeatsDataManager p0,String p1,boolean p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = false;
       }
       return p0.p(p1, p2);
    }
    public final VoicePartyMicSeatData A(LiveStreamMessages$MicSeatDetailInfo p0){
       object oobject;
       ArrayList uArrayList;
       ArrayList uArrayList1;
       ArrayList uArrayList2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       VoicePartyMicSeatData obj = PatchProxy.applyOneRefs(p0, this, MicSeatsDataManager.class, "40");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "$this$toVoicePartyMicSeatData");
       obj = new VoicePartyMicSeatData();
       obj.mId = p0.micSeatId;
       obj.mMicState = p0.state;
       obj.mMicSeatTypes = p0.micSeatType;
       obj.mDecoration = l.c.a(p0.decorationInfo);
       p0 = p0.userInfo;
       if (p0 != null) {
          b uob = new b();
          UserInfo userInfo = UserInfo.convertFromProto(p0.user);
          uob.a = userInfo;
          userInfo = userInfo.mExtraInfo;
          a.m(userInfo);
          userInfo.mAssistantType = p0.liveAssistantType;
          uob.e = TextUtils.equals(userInfo.mId, this.l.invoke());
          uob.b = p0.isMuted;
          uob.f = b.a(p0.userType);
          uob.g = p0.displayKsCoin;
          uob.h = p0.userLevel;
          b$a e = b.e;
          Objects.requireNonNull(e);
          b uob1 = PatchProxy.applyOneRefs(p0, e, b$a.class, "1");
          if (uob1 != patchProxyRe) {
          }else {
             a.p(p0, "userInfo");
             LiveStreamMessages$MicSeatUserInfo avatarFrameP = p0.avatarFramePreference;
             LiveStreamMessages$MicSeatUserInfo micSeatDecor = p0.micSeatDecorationInterests;
             LiveStreamMessages$MicSeatUserLevelMicSeatDecorationInterest micSeatUserL = null;
             int i = 0;
             int i1 = 1;
             if (micSeatDecor != null) {
                int len = micSeatDecor.length;
                int i2 = 0;
                while (true) {
                   if (i2 < len) {
                      oobject = micSeatDecor[i2];
                      object oobject1 = (oobject.type == i1)? 1: null;
                      if (oobject1) {
                      label_00a6 :
                         if (oobject != null) {
                            LiveStreamMessages$MicSeatUserLevelMicSeatDecorationInterest materialUrls = oobject.materialUrls;
                            if (materialUrls != null) {
                               uArrayList = new ArrayList(materialUrls.length);
                               i2 = materialUrls.length;
                               for (int i3 = 0; i3 < i2; i3 = i3 + 1) {
                                  uArrayList.add(materialUrls[i3].url);
                               }
                               micSeatDecor = p0.micSeatDecorationInterests;
                               if (micSeatDecor != null) {
                                  i2 = micSeatDecor.length;
                                  i3 = 0;
                                  while (true) {
                                     if (i3 < i2) {
                                        oobject1 = micSeatDecor[i3];
                                        object oobject2 = (oobject1.type == 2)? 1: null;
                                        if (oobject2) {
                                        label_00dd :
                                           if (oobject1 != null) {
                                              materialUrls = oobject1.materialUrls;
                                              if (materialUrls != null) {
                                                 uArrayList1 = new ArrayList(materialUrls.length);
                                                 i3 = materialUrls.length;
                                                 for (int i4 = 0; i4 < i3; i4 = i4 + 1) {
                                                    uArrayList1.add(materialUrls[i4].url);
                                                 }
                                                 micSeatDecor = p0.micSeatDecorationInterests;
                                                 if (micSeatDecor != null) {
                                                    i3 = micSeatDecor.length;
                                                    i4 = 0;
                                                    while (i4 < i3) {
                                                       oobject2 = micSeatDecor[i4];
                                                       LiveStreamMessages$MicSeatUserLevelMicSeatDecorationInterest micSeatUserL1 = (oobject2.type == 3)? 1: null;
                                                       if (micSeatUserL1) {
                                                          micSeatUserL = oobject2;
                                                       }
                                                       i4 = i4 + 1;
                                                    }
                                                    if (micSeatUserL != null) {
                                                       materialUrls = micSeatUserL.materialUrls;
                                                       if (materialUrls != null) {
                                                          uArrayList2 = new ArrayList(materialUrls.length);
                                                          i1 = materialUrls.length;
                                                          for (; i < i1; i = i + 1) {
                                                             uArrayList2.add(materialUrls[i].url);
                                                          }
                                                          uob1 = new b(avatarFrameP, uArrayList, uArrayList1, uArrayList2);
                                                       }
                                                    }
                                                 }
                                              label_012d :
                                                 uArrayList2 = CollectionsKt__CollectionsKt.E();
                                                 goto label_0131 ;
                                              }
                                           }
                                        }else {
                                           i3 = i3 + 1;
                                        }
                                     }else {
                                        LiveStreamMessages$MicSeatUserLevelMicSeatDecorationInterest micSeatUserL2 = micSeatUserL;
                                        goto label_00dd ;
                                     }
                                  }
                               }
                            label_00f7 :
                               uArrayList1 = CollectionsKt__CollectionsKt.E();
                               goto label_00fb ;
                            }
                         }
                      }else {
                         i2 = i2 + 1;
                      }
                   }else {
                      oobject = micSeatUserL;
                      goto label_00a6 ;
                   }
                }
             }
          label_00c0 :
             uArrayList = CollectionsKt__CollectionsKt.E();
             goto label_00c4 ;
          }
          uob.m = uob1;
          obj.mMicUser = uob;
          uob.l = VoicePartyHatInfo.convertFromProto(p0.userHat);
          obj.mIsVideoOpened = p0.isOpenVideo;
          obj.mReadyTime = p0.readyTime;
       }
       return obj;
    }
    public void B(){
       if (PatchProxy.applyVoid(null, this, MicSeatsDataManager.class, "3")) {
          return;
       }
       this.i.b();
       return;
    }
    public final void C(List p0,boolean p1){
       MicSeatsDataManager micSeatsData = MicSeatsDataManager.class;
       if (PatchProxy.isSupport(micSeatsData) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, micSeatsData, "32")) {
          return;
       }
       a.p(p0, "dataList");
       this.a = p0;
       this.d(this.j, new MicSeatsDataManager$updateMicSeatDataList$1(this, p1));
       this.d(this.h, new MicSeatsDataManager$updateMicSeatDataList$2(this));
       return;
    }
    public final void D(LiveStreamMessages$MicSeatDetailInfo[] p0){
       Iterator iterator1;
       MicSeatsDataManager a;
       Object obj = this;
       Object obj1 = p0;
       MicSeatsDataManager micSeatsData = MicSeatsDataManager.class;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, micSeatsData, "28")) {
          return;
       }
       a.p(obj1, "detailInfoList");
       ArrayList uArrayList = new ArrayList();
       int len = obj1.length;
       boolean b = false;
       int i = 0;
       boolean b1 = false;
       String str = 1;
       while (i < len) {
          object oobject = obj1[i];
          if (obj.s(oobject)) {
             LiveStreamMessages$MicSeatDetailInfo obj2 = PatchProxy.applyOneRefs(oobject, obj, micSeatsData, "38");
             if (obj2 != PatchProxyResult.class) {
                b1 = obj2.booleanValue();
             }else if(oobject != null){
                obj2 = oobject.userInfo;
                if (obj2 != null) {
                   LiveStreamMessages$MicSeatUserInfo userType = obj2.userType;
                   if (userType != null) {
                      int len1 = userType.length;
                      int i1 = 0;
                      while (i1 < len1) {
                         int i2 = userType[i1];
                         Integer integer = (i2 == 4)? 1: null;
                         if (integer) {
                            b1 = Integer.valueOf(i2);
                            break ;
                         }
                         i1 = i1 + 1;
                      }
                   }
                }
             }
             if (b1 != null) {
                b1 = true;
             }else {
                b1 = false;
             }
             if (!b1) {
                str = null;
             }
          }
          if (str) {
             uArrayList.add(oobject);
          }
          i = i + 1;
       }
       ArrayList uArrayList1 = new ArrayList(u.Y(uArrayList, 10));
       Iterator iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          uArrayList1.add(obj.A(iterator.next()));
       }
       List list = obj.v(uArrayList1);
       MicSeatsDataManager.F(obj, list, b, 2, b1);
       if (!PatchProxy.applyVoid(b1, obj, micSeatsData, "33")) {
          micSeatsData = obj.m;
          a = obj.a;
          if (a instanceof Collection && a.isEmpty()) {
             i = 0;
          }else {
             Iterator iterator2 = a.iterator();
             i = 0;
             while (iterator2.hasNext()) {
                VoicePartyMicSeatData mMicUser = iterator2.next().mMicUser;
                if (mMicUser != null) {
                   b1 = mMicUser.f & 0x10;
                   mMicUser = (b1)? 1: 0;
                   if (mMicUser == str) {
                      b1 = true;
                   label_00d1 :
                      if (b1) {
                         i = i + 1;
                         if (i < 0) {
                            CollectionsKt__CollectionsKt.V();
                         }
                      }
                   }
                }
                b1 = false;
                goto label_00d1 ;
             }
          }
          micSeatsData.f = i;
       }
       if (obj.m.E()) {
          if (list instanceof Collection && list.isEmpty()) {
             i = 0;
          }else {
             iterator1 = list.iterator();
             i = 0;
             while (iterator1.hasNext()) {
                if (iterator1.next().isMuted()) {
                   i = i + 1;
                   if (i < 0) {
                      CollectionsKt__CollectionsKt.V();
                   }
                }
             }
          }
       }else {
          i = -1;
       }
       if (obj.m.E()) {
          if (!list instanceof Collection || !list.isEmpty()) {
             iterator1 = list.iterator();
             while (iterator1.hasNext()) {
                if (r.e(iterator1.next().mMicState)) {
                   b = b + 1;
                   if (b < 0) {
                      CollectionsKt__CollectionsKt.V();
                   }
                }
             }
          }
       }else {
          b = -1;
       }
       LiveVoicePartyLogTag mIC_SEATS_MA = LiveVoicePartyLogTag.MIC_SEATS_MANAGE;
       mIC_SEATS_MA.appendTag("VoicePartyMicSeatsDataManager");
       LiveVoicePartyLogTag liveVoicePar = mIC_SEATS_MA;
       b.V(liveVoicePar, "updateMicSeatList", "micSeatDetailInfos length", Integer.valueOf(list.size()), "mOriginMicSeatList size", Integer.valueOf(obj1.length), "muteUser count", Integer.valueOf(i), "lockUser count", Integer.valueOf(b));
       return;
    }
    public final void E(LiveStreamMessages$MicSeatDetailInfo[] p0,int p1){
       MicSeatsDataManager micSeatsData = MicSeatsDataManager.class;
       if (PatchProxy.isSupport(micSeatsData) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, micSeatsData, "29")) {
          return;
       }
       a.p(p0, "detailInfoList");
       micSeatsData = this.m;
       if (micSeatsData.k > p1) {
          String[] stringArray = new String[0];
          e.c("VoicePartyMicSeatsDataManager", "updateMicSeatList error because micSeatsVersion is overdue", stringArray);
       }else {
          micSeatsData.k = p1;
          this.D(p0);
       }
       return;
    }
    public final void G(List p0,boolean p1){
       this.b = p0;
    }
    public final void H(LiveStreamMessages$MicSeatDetailInfo[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MicSeatsDataManager.class, "30")) {
          return;
       }
       a.p(p0, "detailInfoList");
       ArrayList uArrayList = new ArrayList(p0.length);
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          uArrayList.add(this.A(p0[i]));
       }
       this.G(uArrayList, false);
       return;
    }
    public final void I(KtvMusicOrderStatisticsInfo p0){
       MicSeatsDataManager tm = this.m;
       KtvMusicOrderStatisticsInfo ktvMusicOrde = null;
       int i = (p0 != null)? (int)p0.musicOrderCount: 0;
       tm.i = i;
       if (p0 != null) {
          ktvMusicOrde = (int)p0.musicOrderUserCount;
       }
       tm.j = ktvMusicOrde;
       this.f = i;
       this.e = ktvMusicOrde;
       return;
    }
    public final void J(LiveStreamMessages$MicSeatsUserApplyInfo[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MicSeatsDataManager.class, "35")) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       int len = p0.length;
       int i = 0;
       while (i < len) {
          object oobject = p0[i];
          LiveStreamMessages$MicSeatsUserApplyInfo userType = oobject.userType;
          Integer integer = null;
          int i1 = 1;
          if (userType != null) {
             int len1 = userType.length;
             int i2 = 0;
             while (i2 < len1) {
                int i3 = userType[i2];
                int i4 = (i3 == 2)? 1: 0;
                if (i4) {
                   integer = Integer.valueOf(i3);
                   break ;
                }
                i2 = i2 + 1;
             }
          }
          if (integer == null) {
             i1 = 0;
          }
          if (i1) {
             uArrayList.add(oobject);
          }
          i = i + 1;
       }
       ArrayList uArrayList1 = new ArrayList(u.Y(uArrayList, 10));
       Iterator iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          LiveStreamMessages$MicSeatsUserApplyInfo micSeatsUser = iterator.next();
          b uob = new b();
          UserInfo userInfo = UserInfo.convertFromProto(micSeatsUser.user);
          uob.a = userInfo;
          userInfo = userInfo.mExtraInfo;
          if (userInfo != null) {
             userInfo.mAssistantType = micSeatsUser.liveAssistantType;
          }
          uob.f = b.a(micSeatsUser.userType);
          uArrayList1.add(uob);
       }
       this.d = uArrayList1;
       return;
    }
    public final void K(List p0){
       this.c = p0;
    }
    public final void L(LiveStreamMessages$MicSeatDetailInfo[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MicSeatsDataManager.class, "31")) {
          return;
       }
       a.p(p0, "detailInfoList");
       ArrayList uArrayList = new ArrayList();
       int len = p0.length;
       int i = 0;
       while (i < len) {
          object oobject = p0[i];
          if (this.s(oobject)) {
             uArrayList.add(oobject);
          }
          i = i + 1;
       }
       ArrayList uArrayList1 = new ArrayList(u.Y(uArrayList, 10));
       Iterator iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          uArrayList1.add(this.A(iterator.next()));
       }
       this.K(uArrayList1);
       return;
    }
    public final void a(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MicSeatsDataManager.class, "23")) {
          return;
       }
       a.p(p0, "observer");
       if (this.a.isEmpty() ^ 0x01) {
          p0.a(this.a);
       }
       this.h.add(p0);
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, MicSeatsDataManager.class, "34")) {
          return;
       }
       this.K(new ArrayList());
       LiveStreamMessages$MicSeatsUserApplyInfo[] micSeatsUser = new LiveStreamMessages$MicSeatsUserApplyInfo[0];
       this.J(micSeatsUser);
       this.I(null);
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, MicSeatsDataManager.class, "4")) {
          return;
       }
       this.u();
       return;
    }
    public final void d(Iterable p0,l p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MicSeatsDataManager.class, "25")) {
          return;
       }
       a.p(p0, "listeners");
       a.p(p1, "block");
       if (a.g(Looper.myLooper(), Looper.getMainLooper())) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             p1.invoke(iterator.next());
          }
       }else {
          this.g.post(new MicSeatsDataManager$c(p0, p1));
       }
       return;
    }
    public m e(){
       Iterator obj = PatchProxy.apply(null, this, MicSeatsDataManager.class, "42");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0;
       if (q.f(this.a)) {
          return new m(i, i, i);
       }
       obj = this.a.iterator();
       int i1 = 0;
       int i2 = 0;
       while (obj.hasNext()) {
          VoicePartyMicSeatData voicePartyMi = obj.next();
          if (voicePartyMi == null || voicePartyMi.mDecoration == null) {
             continue ;
          }else {
             boolean b = r.g(voicePartyMi);
             VoicePartyMicSeatData mDecoration = voicePartyMi.mDecoration;
             a.m(mDecoration);
             if (mDecoration.c()) {
                i2 = i2 + 1;
                if (b) {
                   i = 2;
                }
             }
             voicePartyMi = voicePartyMi.mDecoration;
             a.m(voicePartyMi);
             if (voicePartyMi.b()) {
                i1 = i1 + 1;
                if (b) {
                   i = 1;
                }
             }
          }
       }
       return new m(i, i1, i2);
    }
    public final int f(boolean p0){
       Iterator obj;
       MicSeatsDataManager micSeatsData = MicSeatsDataManager.class;
       if (PatchProxy.isSupport(micSeatsData)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, micSeatsData, "20");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       micSeatsData = this.a;
       int i = 0;
       if (!micSeatsData instanceof Collection || !micSeatsData.isEmpty()) {
          obj = micSeatsData.iterator();
          int i1 = 0;
          while (obj.hasNext()) {
             VoicePartyMicSeatData voicePartyMi = obj.next();
             boolean b = (p0 || (voicePartyMi.mMicUser != null && r.c(voicePartyMi.mMicSeatTypes)))? true: false;
             if (b) {
                i1 = i1 + 1;
                if (i1 < 0) {
                   CollectionsKt__CollectionsKt.V();
                }
             }
          }
          i = i1;
       }
       if (p0 && i <= 0) {
          i = 4;
       }
       return i;
    }
    public final List h(boolean p0){
       Iterator obj;
       MicSeatsDataManager micSeatsData = MicSeatsDataManager.class;
       if (PatchProxy.isSupport(micSeatsData)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, micSeatsData, "14");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       ArrayList uArrayList = new ArrayList();
       obj = this.a.iterator();
       while (obj.hasNext()) {
          Object obj1 = obj.next();
          Object obj2 = obj1;
          obj2 = (p0 || (obj2.mMicUser != null && r.c(obj2.mMicSeatTypes)))? 1: null;
          if (obj2) {
             uArrayList.add(obj1);
          }
       }
       return uArrayList;
    }
    public final h i(){
       return this.i;
    }
    public final VoicePartyMicSeatData j(String p0){
       b a;
       Iterator obj = PatchProxy.applyOneRefs(p0, this, MicSeatsDataManager.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "userId");
       obj = this.a.iterator();
       UserInfo userInfo = null;
       while (obj.hasNext()) {
          Object obj1 = obj.next();
          VoicePartyMicSeatData mMicUser = obj1.mMicUser;
          if (mMicUser != null) {
             a = mMicUser.a;
             if (a != null) {
                userInfo = a.mId;
             }
          }
          if (a.g(userInfo, p0)) {
             userInfo = obj1;
             break ;
          }
       }
       return userInfo;
    }
    public final List k(){
       return this.a;
    }
    public final List l(){
       return this.b;
    }
    public final int m(boolean p0){
       Iterator obj;
       MicSeatsDataManager micSeatsData = MicSeatsDataManager.class;
       if (PatchProxy.isSupport(micSeatsData)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, micSeatsData, "18");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       micSeatsData = this.a;
       int i = 0;
       if (!micSeatsData instanceof Collection || !micSeatsData.isEmpty()) {
          obj = micSeatsData.iterator();
          int i1 = 0;
          while (obj.hasNext()) {
             VoicePartyMicSeatData voicePartyMi = obj.next();
             boolean b = (p0 || (voicePartyMi.mMicUser != null && r.h(voicePartyMi.mMicSeatTypes)))? true: false;
             if (b) {
                i1 = i1 + 1;
                if (i1 < 0) {
                   CollectionsKt__CollectionsKt.V();
                }
             }
          }
          i = i1;
       }
       if (p0 && i <= 0) {
          i = 4;
       }
       return i;
    }
    public final List o(boolean p0){
       Iterator obj;
       MicSeatsDataManager micSeatsData = MicSeatsDataManager.class;
       if (PatchProxy.isSupport(micSeatsData)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, micSeatsData, "16");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       ArrayList uArrayList = new ArrayList();
       obj = this.a.iterator();
       while (obj.hasNext()) {
          Object obj1 = obj.next();
          Object obj2 = obj1;
          obj2 = (p0 || (obj2.mMicUser != null && r.h(obj2.mMicSeatTypes)))? 1: null;
          if (obj2) {
             uArrayList.add(obj1);
          }
       }
       return uArrayList;
    }
    public final boolean p(String p0,boolean p1){
       Object obj;
       b a;
       MicSeatsDataManager micSeatsData = MicSeatsDataManager.class;
       if (PatchProxy.isSupport(micSeatsData)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, micSeatsData, "6");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "userId");
       MicSeatsDataManager ta = (!p1)? this.a: this.b;
       Iterator iterator = ta.iterator();
       UserInfo userInfo = null;
       while (iterator.hasNext()) {
          obj = iterator.next();
          VoicePartyMicSeatData mMicUser = obj.mMicUser;
          if (mMicUser != null) {
             a = mMicUser.a;
             if (a != null) {
                userInfo = a.mId;
             }
          }
          if (a.g(userInfo, p0)) {
             userInfo = obj;
             break ;
          }
       }
       boolean b = (userInfo != null)? true: false;
       return b;
    }
    public final boolean r(String p0){
       b a;
       Iterator obj = PatchProxy.applyOneRefs(p0, this, MicSeatsDataManager.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "userId");
       obj = this.b.iterator();
       boolean b = true;
       UserInfo userInfo = null;
       while (obj.hasNext()) {
          Object obj1 = obj.next();
          Object obj2 = obj1;
          VoicePartyMicSeatData mMicUser = obj2.mMicUser;
          if (mMicUser != null) {
             a = mMicUser.a;
             if (a != null) {
                userInfo = a.mId;
             }
          }
          Object obj3 = (a.g(userInfo, p0) && obj2.mId == null)? 1: null;
          if (obj3) {
             userInfo = obj1;
             break ;
          }
       }
       if (userInfo == null) {
          b = false;
       }
       return b;
    }
    public final boolean s(LiveStreamMessages$MicSeatDetailInfo p0){
       Integer obj = PatchProxy.applyOneRefs(p0, this, MicSeatsDataManager.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = null;
       boolean b = true;
       if (p0 != null) {
          p0 = p0.userInfo;
          if (p0 != null) {
             LiveStreamMessages$MicSeatUserInfo userType = p0.userType;
             if (userType != null) {
                int len = userType.length;
                int i = 0;
                while (i < len) {
                   int i1 = userType[i];
                   int i2 = (i1 == 3)? 1: 0;
                   if (i2) {
                      obj = Integer.valueOf(i1);
                      break ;
                   }
                   i = i + 1;
                }
             }
          }
       }
       if (obj == null) {
          b = false;
       }
       return b;
    }
    public final boolean t(String p0){
       b a;
       Iterator obj = PatchProxy.applyOneRefs(p0, this, MicSeatsDataManager.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "userId");
       obj = this.c.iterator();
       UserInfo userInfo = null;
       while (obj.hasNext()) {
          Object obj1 = obj.next();
          VoicePartyMicSeatData mMicUser = obj1.mMicUser;
          if (mMicUser != null) {
             a = mMicUser.a;
             if (a != null) {
                userInfo = a.mId;
             }
          }
          if (a.g(userInfo, p0)) {
             userInfo = obj1;
             break ;
          }
       }
       boolean b = (userInfo != null)? true: false;
       return b;
    }
    public void u(){
       if (PatchProxy.applyVoid(null, this, MicSeatsDataManager.class, "5")) {
          return;
       }
       this.B();
       Iterator iterator = this.j.iterator();
       while (iterator.hasNext()) {
          iterator.next().a();
       }
       this.j.clear();
       return;
    }
    public final List v(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MicSeatsDataManager.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "dataList");
       return p0;
    }
    public void w(){
       if (PatchProxy.applyVoid(null, this, MicSeatsDataManager.class, "2")) {
          return;
       }
       this.i.a(439, SCMicSeatsInfo.class, new MicSeatsDataManager$d(this));
       this.i.a(844, SCLiveVoicePartyPkOpMicSeats.class, new MicSeatsDataManager$e(this));
       this.i.a(436, LiveStreamMessages$SCMicSeatsApplyInfo.class, new MicSeatsDataManager$f(this));
       this.i.a(842, SCLiveVoicePartyPkEnd.class, new MicSeatsDataManager$g(this));
       return;
    }
    public final void x(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MicSeatsDataManager.class, "24")) {
          return;
       }
       a.p(p0, "observer");
       this.h.remove(p0);
       return;
    }
    public final b y(QCurrentUser p0){
       b obj = PatchProxy.applyOneRefs(p0, this, MicSeatsDataManager.class, "41");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$this$toVoicePartyChatUserData");
       obj = new b();
       obj.a = UserInfo.convertFromQUser(b.a(p0));
       obj.e = TextUtils.equals(p0.getId(), this.l.invoke());
       obj.d = false;
       obj.h = 0;
       return obj;
    }
    public final VoicePartyMicSeatData z(VoicePartyTeamPkMicSeatInfo p0){
       object oobject1;
       ArrayList uArrayList;
       ArrayList uArrayList1;
       ArrayList uArrayList2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       VoicePartyMicSeatData obj = PatchProxy.applyOneRefs(p0, this, MicSeatsDataManager.class, "39");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "$this$toVoicePartyMicSeatData");
       obj = new VoicePartyMicSeatData();
       obj.mId = p0.mMicSeatId;
       obj.mMicState = p0.mMicState;
       obj.mMicSeatTypes = p0.mMicSeatTypes;
       p0 = p0.mUserInfo;
       if (p0 != null) {
          b uob = new b();
          VoicePartyTeamPkMicSeatInfo$MicSeatsUserInfo mUser = p0.mUser;
          uob.a = mUser;
          uob.b = p0.mIsMuted;
          uob.h = p0.mUserLevel;
          uob.g = p0.mDisplayKsCoin;
          uob.l = p0.mVoicePartyHatInfo;
          UserInfo mExtraInfo = mUser.mExtraInfo;
          a.m(mExtraInfo);
          mExtraInfo.mAssistantType = p0.mLiveAssistantType;
          b$a e = b.e;
          a.o(p0, "it");
          Objects.requireNonNull(e);
          b uob1 = PatchProxy.applyOneRefs(p0, e, b$a.class, "3");
          if (uob1 != patchProxyRe) {
          }else {
             a.p(p0, "userInfo");
             VoicePartyTeamPkMicSeatInfo$MicSeatsUserInfo avatarFrameP = p0.avatarFramePreference;
             mUser = p0.micSeatDecorationInterests;
             MicSeatLevelInterest$Decoration uDecoration = null;
             int i = 0;
             object oobject = 1;
             if (mUser != null) {
                int len = mUser.length;
                int i1 = 0;
                while (true) {
                   if (i1 < len) {
                      oobject1 = mUser[i1];
                      object oobject2 = (oobject1.type == oobject)? 1: null;
                      if (oobject2) {
                      label_0085 :
                         if (oobject1 != null) {
                            MicSeatLevelInterest$Decoration materialUrls = oobject1.materialUrls;
                            if (materialUrls != null) {
                               uArrayList = new ArrayList(materialUrls.length);
                               i1 = materialUrls.length;
                               for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                                  oobject2 = materialUrls[i2];
                                  a.o(oobject2, "it");
                                  uArrayList.add(oobject2.getUrl());
                               }
                               mUser = p0.micSeatDecorationInterests;
                               if (mUser != null) {
                                  i1 = mUser.length;
                                  i2 = 0;
                                  while (true) {
                                     if (i2 < i1) {
                                        oobject2 = mUser[i2];
                                        object oobject3 = (oobject2.type == 2)? 1: null;
                                        if (oobject3) {
                                        label_00c1 :
                                           if (oobject2 != null) {
                                              materialUrls = oobject2.materialUrls;
                                              if (materialUrls != null) {
                                                 uArrayList1 = new ArrayList(materialUrls.length);
                                                 i2 = materialUrls.length;
                                                 for (int i3 = 0; i3 < i2; i3 = i3 + 1) {
                                                    oobject3 = materialUrls[i3];
                                                    a.o(oobject3, "it");
                                                    uArrayList1.add(oobject3.getUrl());
                                                 }
                                                 VoicePartyTeamPkMicSeatInfo$MicSeatsUserInfo micSeatDecor = p0.micSeatDecorationInterests;
                                                 if (micSeatDecor != null) {
                                                    int len1 = micSeatDecor.length;
                                                    i2 = 0;
                                                    while (i2 < len1) {
                                                       oobject2 = micSeatDecor[i2];
                                                       MicSeatLevelInterest$Decoration uDecoration1 = (oobject2.type == 3)? 1: null;
                                                       if (uDecoration1) {
                                                          uDecoration = oobject2;
                                                       }
                                                       i2 = i2 + 1;
                                                    }
                                                    if (uDecoration != null) {
                                                       MicSeatLevelInterest$Decoration materialUrls1 = uDecoration.materialUrls;
                                                       if (materialUrls1 != null) {
                                                          uArrayList2 = new ArrayList(materialUrls1.length);
                                                          int len2 = materialUrls1.length;
                                                          for (; i < len2; i = i + 1) {
                                                             oobject = materialUrls1[i];
                                                             a.o(oobject, "it");
                                                             uArrayList2.add(oobject.getUrl());
                                                          }
                                                          uob1 = new b(avatarFrameP, uArrayList, uArrayList1, uArrayList2);
                                                       }
                                                    }
                                                 }
                                              label_011b :
                                                 uArrayList2 = CollectionsKt__CollectionsKt.E();
                                                 goto label_011f ;
                                              }
                                           }
                                        }else {
                                           i2 = i2 + 1;
                                        }
                                     }else {
                                        MicSeatLevelInterest$Decoration uDecoration2 = uDecoration;
                                        goto label_00c1 ;
                                     }
                                  }
                               }
                            label_00e0 :
                               uArrayList1 = CollectionsKt__CollectionsKt.E();
                               goto label_00e4 ;
                            }
                         }
                      }else {
                         i1 = i1 + 1;
                      }
                   }else {
                      oobject1 = uDecoration;
                      goto label_0085 ;
                   }
                }
             }
          label_00a4 :
             uArrayList = CollectionsKt__CollectionsKt.E();
             goto label_00a8 ;
          }
          uob.m = uob1;
          uob.e = TextUtils.equals(uob.a.mId, this.l.invoke());
          obj.mMicUser = uob;
       }
       return obj;
    }
}
