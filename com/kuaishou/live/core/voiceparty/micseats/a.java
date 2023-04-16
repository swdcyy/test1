package com.kuaishou.live.core.voiceparty.micseats.a;
import qs2.a;
import yx2.i;
import com.kuaishou.live.core.voiceparty.micseats.a$b;
import nsd.u;
import android.app.Activity;
import androidx.fragment.app.c;
import qu2.a;
import t02.a0;
import co2.f2;
import com.kuaishou.live.core.voiceparty.core.audience.AudienceVoicePartyManager;
import com.kuaishou.live.core.voiceparty.h;
import com.kuaishou.live.core.voiceparty.b;
import com.kuaishou.live.core.voiceparty.playway.shared.model.audience.AudienceMicSeatsDataManager;
import tu2.c;
import w02.g;
import zt2.a;
import mrd.c;
import lp3.e;
import s51.c;
import o63.a;
import bb1.o;
import wj2.r0;
import m91.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import co2.y1;
import co2.y1$a;
import wa1.i;
import xs2.a;
import vu2.f;
import com.kuaishou.live.core.voiceparty.micseats.a$j;
import hp2.e;
import com.kuaishou.live.core.voiceparty.core.shared.a;
import brd.t;
import brd.x;
import com.kuaishou.live.core.voiceparty.micseats.a$a;
import erd.g;
import crd.b;
import co2.r;
import java.util.Objects;
import com.kuaishou.live.core.voiceparty.playway.shared.model.MicSeatsDataManager;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import msd.a;
import com.kuaishou.live.core.voiceparty.playway.shared.model.MicSeatsDataManager$b;
import com.kuaishou.live.core.voiceparty.micseats.mode.VoicePartyMicSeatData;
import lnc.i3;
import qs2.r;
import java.lang.Integer;
import java.lang.Number;
import java.lang.Boolean;
import yx2.n;
import yx2.d;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import yx2.f;
import com.kuaishou.live.core.voiceparty.micseats.dialog.LiveVoicePartyInvitationPanelFragment;
import qs2.f;
import com.kuaishou.live.core.voiceparty.micseats.dialog.LiveVoicePartyInvitationPanelFragment$b;
import qs2.q;
import android.content.DialogInterface$OnDismissListener;
import com.kuaishou.live.core.voiceparty.micseats.widget.action.ActionsController$b;
import qrd.l1;
import cs2.a;
import cs2.a$a;
import pt2.b;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.framework.model.user.QCurrentUser;
import com.kuaishou.live.core.voiceparty.micseats.dialog.LiveVoicePartyActionPanelFragment;
import qs2.g;
import qs2.h;
import qs2.i;
import com.kuaishou.live.core.voiceparty.micseats.dialog.LiveVoicePartyActionPanelFragment$d;
import com.kuaishou.live.core.voiceparty.micseats.dialog.LiveVoicePartyActionPanelFragment$a;
import ry1.b;
import com.kuaishou.live.core.voiceparty.invitation.GuestInvitationPanel;
import com.kuaishou.live.core.voiceparty.invitation.GuestInvitationPanel$a;
import qs2.p;
import com.kuaishou.live.dialog.base.LiveBaseDialogFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import k2b.e0;
import au2.c;
import java.util.List;
import qs2.k;
import qs2.l;
import qs2.m;
import co2.q1;
import e17.i;
import qs2.b;
import java.lang.StringBuilder;
import bs2.d;
import com.kuaishou.live.core.voiceparty.http.LiveVoicePartyApi;
import cjd.e;
import erd.o;
import qs2.o;
import com.kuaishou.live.core.voiceparty.micseats.c;
import android.app.Dialog;
import com.kuaishou.live.core.voiceparty.d0;
import androidx.fragment.app.KwaiDialogFragment;
import z12.f;
import bs2.a;
import com.kuaishou.live.core.voiceparty.micseats.a$c;
import com.kuaishou.live.core.voiceparty.micseats.a$d;
import z12.x;
import co2.k1;
import tkd.b;
import tkd.d;
import ou5.b;
import android.content.Context;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import n3d.d;
import com.kuaishou.live.core.voiceparty.micseats.a$e;
import com.kuaishou.android.live.log.LiveLogTag;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.a;
import com.kuaishou.live.core.voiceparty.micseats.a$f;
import com.kuaishou.live.core.voiceparty.micseats.a$g;
import y41.i$a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.live.core.basic.utils.e;
import jga.c;
import wca.b;
import y41.i;
import yx2.a;
import com.kuaishou.live.basic.api.LiveApiParams$AssistantType;
import com.kuaishou.live.core.voiceparty.micseats.a$h;
import com.kuaishou.live.core.voiceparty.micseats.a$i;
import com.kwai.framework.model.live.LiveAdminPrivilege;
import com.kuaishou.live.core.voiceparty.micseats.a$k;
import sfc.a;
import com.google.common.base.Optional;
import com.kuaishou.live.core.voiceparty.micseats.core.data.MicSeatTeam;
import io.reactivex.subjects.PublishSubject;
import com.kuaishou.live.core.voiceparty.micseats.a$l;
import com.kuaishou.live.core.voiceparty.micseats.a$m;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import e92.a;
import com.kuaishou.live.core.voiceparty.util.b;
import xs2.h;
import f22.m;
import com.kuaishou.live.core.voiceparty.mute.VoicePartyMuteServiceImpl;
import qs2.n;
import com.kuaishou.live.core.voiceparty.micseats.a$n;
import com.kuaishou.live.core.voiceparty.micseats.dialog.matchroom.VoicePartyMatchRoomFragment;
import d61.y;
import com.kuaishou.live.core.voiceparty.micseats.a$o;
import zs2.a;
import com.kuaishou.live.core.voiceparty.micseats.a$p;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.feature.api.live.base.service.model.LiveStreamClickType;
import crd.a;
import qs2.c;
import np2.a;
import com.kuaishou.live.core.voiceparty.micseats.a$s;
import ss2.f;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyCommonConfig;
import java.lang.reflect.Type;
import wg3.a;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.CharSequence;
import android.text.TextUtils;
import lt2.a;
import com.yxcorp.utility.TextUtils;
import sr2.m;
import sr2.m$a;
import com.kuaishou.live.core.voiceparty.micseats.a$q;
import java.util.Map;
import com.kuaishou.live.core.voiceparty.micseats.a$r;
import mz6.b;
import java.util.Set;
import mz6.a;
import mz6.b$d;
import sr2.k;
import android.content.DialogInterface$OnClickListener;
import sr2.j;
import android.content.DialogInterface$OnCancelListener;
import sr2.l;
import mz6.b$e;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$LiveVoicePartyPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class a extends i implements a	// class@001576
{
    public final c A;
    public final e B;
    public final c C;
    public final a D;
    public final o E;
    public final r0 F;
    public final b G;
    public Dialog d;
    public final PublishSubject e;
    public y1 f;
    public LiveVoicePartyInvitationPanelFragment g;
    public LiveVoicePartyActionPanelFragment h;
    public VoicePartyMatchRoomFragment i;
    public m j;
    public final i k;
    public a l;
    public final f m;
    public final r n;
    public final Activity o;
    public final c p;
    public final a q;
    public final a0 r;
    public final f2 s;
    public final AudienceVoicePartyManager t;
    public final h u;
    public final b v;
    public final AudienceMicSeatsDataManager w;
    public final c x;
    public final g y;
    public final a z;
    public static final a$b H;

    static {
       a.H = new a$b(null);
    }
    public void a(Activity p0,c p1,a p2,a0 p3,f2 p4,AudienceVoicePartyManager p5,h p6,b p7,AudienceMicSeatsDataManager p8,c p9,g p10,a p11,c p12,e p13,c p14,a p15,o p16,r0 p17,b p18){
       f obj = p0;
       a$j obj1 = p1;
       Object obj2 = p2;
       b obj3 = p3;
       Object obj4 = p4;
       Object obj5 = p5;
       Object obj6 = p8;
       Object obj7 = p9;
       Object obj8 = p10;
       Object obj9 = p11;
       Object obj10 = p12;
       Object obj11 = p13;
       Object obj12 = p14;
       Object obj13 = p15;
       a.p(obj, "activity");
       a.p(obj1, "fragmentManager");
       a.p(obj2, "liveBasicContext");
       a.p(obj3, "playCallerContext");
       a.p(obj4, "voicePartyContext");
       a.p(obj5, "voicePartyManager");
       a.p(obj6, "micSeatsDataManager");
       a.p(obj7, "mMicSeatsEmojiDispatchService");
       a.p(obj8, "mAudienceEventBusService");
       a.p(obj9, "mMuteService");
       a.p(obj10, "switchMicSeatSubject");
       a.p(obj11, "serviceManager");
       a.p(obj12, "routerService");
       a.p(obj13, "jsBridgeService");
       a.p(p16, "adminService");
       a.p(p17, "liveProfileService");
       a.p(p18, "liveBizRelationService");
       super();
       i oi = this;
       oi.o = obj;
       oi.p = obj1;
       oi.q = obj2;
       oi.r = obj3;
       oi.s = obj4;
       oi.t = obj5;
       oi.u = p6;
       obj3 = p7;
       oi.v = obj3;
       oi.w = obj6;
       oi.x = obj7;
       oi.y = obj8;
       oi.z = obj9;
       oi.A = obj10;
       oi.B = obj11;
       oi.C = obj12;
       oi.D = obj13;
       oi.E = p16;
       oi.F = p17;
       oi.G = p18;
       oi.e = obj4.o;
       oi.f = y1.d.a();
       oi.k = new i();
       oi.l = new a(obj, obj1, obj2, obj4);
       obj = new f(obj4, oi);
       oi.m = obj;
       obj1 = new a$j(oi);
       oi.n = obj1;
       obj4.p = oi;
       p5.f().getMode().compose(this.L()).subscribe(new a$a(oi));
       if (obj3 != null) {
          obj3.a(obj1);
       }
       Objects.requireNonNull(p8);
       if (!PatchProxy.applyVoidOneRefs(obj, obj6, MicSeatsDataManager.class, "26")) {
          a.p(obj, "dataProcessor");
          obj6.j.add(obj);
          obj.c(obj6.k);
          obj.d();
       }
       return;
    }
    public void B(VoicePartyMicSeatData p0){
       a s;
       a q;
       VoicePartyMicSeatData mMicUser;
       b a;
       String id;
       VoicePartyMicSeatData voicePartyMi;
       LiveVoicePartyActionPanelFragment obj2;
       int i2;
       LiveVoicePartyActionPanelFragment liveVoicePar1;
       int i3;
       Object obj3;
       boolean b;
       int i6;
       boolean b2;
       int i7;
       Object obj = this;
       Object obj1 = p0;
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, uoa, "57")) {
          return;
       }
       a.p(obj1, "micInfo");
       i3 oi3 = i3.f();
       int i = 1;
       oi3.c("if_mic", Integer.valueOf((r.d(p0) ^ i)));
       oi3.a("if_assistant", Boolean.valueOf(this.Y()));
       a.o(oi3, "JsonStringBuilder\n      ¡­ant\", isCurrentUserAdmin\)");
       n.a(obj.s, oi3);
       String str = oi3.e();
       a.o(str, "jsonBuilder.build\(\)");
       new d("VOICE_PARTY_SEATS", obj.s, obj.q).a(str).f();
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       str = "1";
       if (!PatchProxy.applyVoidOneRefs(obj1, obj, uoa, str)) {
          LiveVoicePartyLogTag oTHER = LiveVoicePartyLogTag.OTHER;
          b.Z(oTHER, "VoicePartyAudienceMicManager handleMicSeatClickV2");
          if (f.a()) {
             b.B(oTHER, "VoicePartyAudienceMicManager handleMicSeatClickV2 too fast");
          }else {
             Object[] objArray = null;
             a uoa1 = 35;
             String str1 = "clickingMicSeatData.mMicUser!!.mUser";
             String str2 = "QCurrentUser.me\(\).id";
             String str3 = "QCurrentUser.me\(\)";
             if (this.Y()) {
                if (!PatchProxy.applyVoidOneRefs(obj1, obj, uoa, "8")) {
                   b.Z(oTHER, "VoicePartyAudienceMicManager adminClickMicSeat");
                   if (obj1.mMicUser == null) {
                      if (this.b()) {
                         s = obj.s;
                         q = obj.q;
                         uoa1 = obj.r;
                         f uof = new f(obj);
                         q oq = PatchProxy.apply(objArray, obj, uoa, "16");
                         if (oq != patchProxyRe) {
                         }else {
                            oq = new q(obj);
                         }
                         LiveVoicePartyInvitationPanelFragment liveVoicePar = new LiveVoicePartyInvitationPanelFragment(s, q, uoa1, uof, p0, oq, 7, this.W());
                         v10.Ah(this.d0());
                         v10.Bh(obj.p);
                         obj.g = v10;
                         a.b.c();
                      }else {
                         this.R(p0);
                      }
                   }else if(!this.Z()){
                      mMicUser = obj1.mMicUser;
                      if (mMicUser != null && mMicUser.e == i) {
                         a.m(mMicUser);
                         a = mMicUser.a;
                         a.o(a, str1);
                         if (!obj.s.J()) {
                            uoa1 = 32;
                         }
                         obj.h0(a, uoa1);
                      }
                   }
                   int i1 = this.W();
                   QCurrentUser qCurrentUser = QCurrentUser.me();
                   a.o(qCurrentUser, str3);
                   id = qCurrentUser.getId();
                   a.o(id, str2);
                   voicePartyMi = obj.w.j(id);
                   obj2 = PatchProxy.applyTwoRefs(obj1, voicePartyMi, obj, uoa, "14");
                   if (obj2 != patchProxyRe) {
                      i2 = obj2.intValue();
                   }else if(voicePartyMi != null && obj1.mId == voicePartyMi.mId){
                      i2 = 9;
                   }else {
                      mMicUser = obj1.mMicUser;
                      if (mMicUser != null) {
                         a.m(mMicUser);
                         if (mMicUser.e != null) {
                            i2 = 10;
                         }
                      }
                      i2 = 8;
                   }
                   obj2 = objArray;
                   liveVoicePar1 = objArray;
                   i3 = i2;
                   int i4 = i1;
                   int i5 = i4;
                   obj2 = new LiveVoicePartyActionPanelFragment(obj.s, obj.q, obj.B, new g(obj), new h(obj), p0, voicePartyMi, new i(obj), i3, i4);
                   if (PatchProxy.isSupport(uoa)) {
                      obj3 = PatchProxy.applyTwoRefs(Integer.valueOf(i5), Integer.valueOf(i3), obj, uoa, "18");
                      if (obj3 != patchProxyRe) {
                         b = obj3.booleanValue();
                      label_01d0 :
                         if (b) {
                            liveVoicePar1.zh(false);
                         }
                         liveVoicePar1.yh(this.d0());
                         liveVoicePar1.Ah(obj.p);
                         obj.h = liveVoicePar1;
                      }
                   }
                   if (this.Z()) {
                      b = i5;
                      if (b) {
                         if (b != 5) {
                            if (b == 6) {
                               b = i3;
                               if (b != 10 && b != 8) {
                               }
                            }
                         }else if(i3 == 8){
                         }
                      }
                   }
                label_01cc :
                   i6 = 1;
                label_01ce :
                   b = i6;
                   goto label_01d0 ;
                }
             }else if(PatchProxy.applyVoidOneRefs(obj1, obj, uoa, "9")){
                b.Z(oTHER, "VoicePartyAudienceMicManager audienceClickMicSeat");
                if (obj1.mMicUser == null) {
                   if (!PatchProxy.applyVoidOneRefs(obj1, obj, uoa, "10")) {
                      if (this.Z()) {
                         a$a b1 = a.b;
                         q = obj.r;
                         Objects.requireNonNull(b1);
                         Object obj4 = PatchProxy.applyOneRefs(q, b1, a$a.class, "3");
                         if (obj4 != patchProxyRe) {
                            b2 = obj4.booleanValue();
                         }else {
                            a.p(q, "playCallerContext");
                            b2 = b1.a(q.b3);
                         }
                         if (b2) {
                            uoa1 = obj.r;
                            str1 = this.V();
                            str2 = obj.s.y();
                            a.o(str2, "voicePartyContext.voicePartyId");
                            p op = PatchProxy.applyOneRefs(obj1, obj, uoa, "48");
                            if (op != patchProxyRe) {
                            }else {
                               op = new p(obj, obj1);
                            }
                            GuestInvitationPanel guestInvitat = new GuestInvitationPanel(uoa1, str1, str2, op);
                            uoa1 = obj.p;
                            if (PatchProxy.applyVoidOneRefs(uoa1, guestInvitat, GuestInvitationPanel.class, "6")) {
                               i = true;
                            }else {
                               a.p(uoa1, "fragmentManager");
                               guestInvitat.show(uoa1, guestInvitat.s);
                               b1.c();
                               a0 z2 = guestInvitat.u.Z2;
                               a.o(z2, "playCallerContext.mLiveBasicContext");
                               a0 z21 = guestInvitat.u.Z2;
                               a.o(z21, "playCallerContext.mLiveBasicContext");
                               a0 z22 = guestInvitat.u.Z2;
                               a.o(z22, "playCallerContext.mLiveBasicContext");
                               i = 1;
                               c.b(z2.b(), z21.a(), z22.y(), i);
                            }
                            s = obj.w;
                            Objects.requireNonNull(s);
                            if (!PatchProxy.applyVoid(objArray, s, MicSeatsDataManager.class, str)) {
                               s.C(s.a, i);
                            }
                         }
                      }
                      this.R(p0);
                   }
                }else {
                   QCurrentUser qCurrentUser1 = QCurrentUser.me();
                   a.o(qCurrentUser1, str3);
                   String id1 = qCurrentUser1.getId();
                   a.o(id1, str2);
                   voicePartyMi = obj.w.j(id1);
                   obj3 = PatchProxy.applyTwoRefs(obj1, voicePartyMi, obj, uoa, "15");
                   if (obj3 != patchProxyRe) {
                      i7 = obj3.intValue();
                   }else if(voicePartyMi != null && obj1.mId == voicePartyMi.mId){
                      i7 = 6;
                   }else {
                      mMicUser = obj1.mMicUser;
                      if (mMicUser != null) {
                         a.m(mMicUser);
                         if (mMicUser.e != null) {
                            i7 = 4;
                         }
                      }
                      i7 = 5;
                   }
                   int i8 = this.W();
                   b = 5;
                   b = (i8 == b && i7 == b)? true: false;
                   if (b || !this.Z()) {
                      b.Z(oTHER, "VoicePartyAudienceMicManager audienceClickMicSeat showProfileCard");
                      mMicUser = obj1.mMicUser;
                      a.m(mMicUser);
                      a = mMicUser.a;
                      a.o(a, str1);
                      if (!obj.s.J()) {
                         i2 = 32;
                      }
                      obj.h0(a, uoa1);
                   }else {
                      obj2 = v11;
                      liveVoicePar1 = v11;
                      obj2 = new LiveVoicePartyActionPanelFragment(obj.s, obj.q, obj.B, new k(obj), new l(obj), p0, voicePartyMi, new m(obj), i7, i8);
                      i6 = (!i8 || (i8 == 6 && i7 == 5))? 1: 0;
                      if (i6) {
                         liveVoicePar1.zh(false);
                      }
                      liveVoicePar1.yh(this.d0());
                      liveVoicePar1.Ah(obj.p);
                      obj.h = liveVoicePar1;
                   }
                }
             }
          }
       }
       return;
    }
    public void D(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "54")) {
          return;
       }
       q1.a(this.q.c(), this.s, this.q.a(), null, 2, 3);
       QCurrentUser qCurrentUser = QCurrentUser.me();
       a.o(qCurrentUser, "QCurrentUser.me\(\)");
       String id = qCurrentUser.getId();
       a.o(id, "QCurrentUser.me\(\).id");
       if (this.w.t(id)) {
          b.Z(LiveVoicePartyLogTag.AUDIENCE, "can not leave mic because user is singing");
          i.a(R.style.arg_RES_7f11066a, 0x7f102e62);
          return;
       }else if(PatchProxy.applyVoid(objArray, this, uoa, "22")){
          uoa = this.u;
          if (uoa != null) {
             uoa.f(2);
          }
       }
       return;
    }
    public void G(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "62")) {
          return;
       }
       a.p(p0, "interceptor");
       this.k.remove(p0);
       return;
    }
    public void H(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "50")) {
          return;
       }
       this.Q(null, p0);
       return;
    }
    public void I(int p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "51")) {
          return;
       }
       if (p1 != 1) {
          if (p1 != 2) {
             b.Z(LiveVoicePartyLogTag.TEAM_PK_AUDIENCE, "joinTeamPk unsupported aboard type "+p1);
          }else if(PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "53")){
             e uoe = this.s.e();
             a.m(uoe);
             LiveVoicePartyApi.d().c(this.V(), this.s.y(), uoe.c(), p0).compose(this.L()).map(new e()).subscribe(new o(this, p0), new c(this, p0));
          }
       }else {
          this.a0(p0);
       }
       return;
    }
    public void J(String p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "64")) {
          return;
       }
       a.p(p0, "sourceType");
       this.g0(p0, p1);
       return;
    }
    public void N(){
       if (PatchProxy.applyVoid(null, this, a.class, "45")) {
          return;
       }
       d0.b(this.d);
       f.a(this.i);
       this.T();
       a tv = this.v;
       if (tv != null) {
          tv.b(this.n);
       }
       this.i0();
       tv = this.w;
       a tm = this.m;
       Objects.requireNonNull(tv);
       if (!PatchProxy.applyVoidOneRefs(tm, tv, MicSeatsDataManager.class, "27")) {
          a.p(tm, "dataProcessor");
          tv.j.remove(tm);
          tm.a();
          tm.c(null);
       }
       return;
    }
    public final void P(VoicePartyMicSeatData p0,int p1){
       int i;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "28")) {
          return;
       }
       p0 = (p0 != null)? p0.mId: 0;
       this.k(p0);
       LiveVoicePartyApi.b().G(this.V(), this.s.y(), p0, p1).compose(this.L()).map(new e()).subscribe(new a$c(this, p0), new a$d(this));
       return;
    }
    public final void Q(VoicePartyMicSeatData p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "24")) {
          return;
       }
       e0 uoe0 = x.l(this.r);
       a ts = this.s;
       ClientContent$LiveStreamPackage liveStreamPa = this.q.a();
       VoicePartyMicSeatData voicePartyMi = null;
       int i = (p1 == 5 || p1 == 6)? 2: p1;
       q1.a(uoe0, ts, liveStreamPa, voicePartyMi, i, 1);
       ClientContent$LiveStreamPackage liveStreamPa1 = this.q.a();
       ts = this.s;
       String str = (p0 != null)? this.X(p0): "";
       k1.b(liveStreamPa1, ts, p0, str, 0, 13);
       QCurrentUser qCurrentUser = QCurrentUser.me();
       a.o(qCurrentUser, "QCurrentUser.me\(\)");
       if (!qCurrentUser.isLogined()) {
          a to = this.o;
          d.a(-1712118428).ne(to, "live_play", "live_play_apply_mic_seat", 0, to.getString(R.string.arg_RES_7f103078), null, null, null, null).h();
          return;
       }else {
          d0.a(this.o).compose(this.L()).subscribe(new a$e(this, p0, p1), d0.s("VoicePartyAudienceMicManager", "applyMicSeat"));
          return;
       }
    }
    public final void R(VoicePartyMicSeatData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "12")) {
          return;
       }
       if (this.Z()) {
          this.j0(p0);
       }else {
          this.Q(p0, 1);
       }
       return;
    }
    public final boolean S(VoicePartyMicSeatData p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "30");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       QCurrentUser qCurrentUser = QCurrentUser.me();
       a.o(qCurrentUser, "QCurrentUser.me\(\)");
       String id = qCurrentUser.getId();
       a.o(id, "QCurrentUser.me\(\).id");
       boolean b = this.w.t(id);
       if (b) {
          b.P(LiveLogTag.LIVE_VOICE_PARTY.appendTag("VoicePartyAudienceMicManager"), "audience can not ApplyMic ,because user is singing");
          i.a(R.style.arg_RES_7f11066a, 0x7f102e61);
          return false;
       }else if(!this.Z() && !r.b(this.w.k())){
          this.g0("MIC_FULL", p1);
          return false;
       }else if(p0 != null && r.e(p0.mMicState)){
          i.a(R.style.arg_RES_7f11066a, 0x7f102e31);
          return false;
       }else if(!r.b(this.w.k())){
          i.a(R.style.arg_RES_7f11066a, 0x7f102e41);
          return false;
       }else if(this.G.r2(AudienceBizRelation.SPECIAL_ROLE)){
          i.a(R.style.arg_RES_7f11066a, 0x7f10381e);
          return false;
       }else {
          return true;
       }
    }
    public final void T(){
       if (PatchProxy.applyVoid(null, this, a.class, "47")) {
          return;
       }
       d0.c(this.g);
       d0.c(this.h);
       return;
    }
    public final void U(UserInfo p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "46")) {
          return;
       }
       if (p0 != null) {
          i$a uoa1 = new i$a(this.o, this.q.getLiveStreamId());
          uoa1.o(UserInfo.convertToQUser(p0));
          uoa1.m(e.j(this.r.c));
          uoa1.n(p1);
          uoa1.f(b.c(this.r.c.mEntity));
          uoa1.r(true);
          i$a uoa2 = uoa1.i(a$f.b);
          uoa2.j(a$g.b);
          uoa2.a().c();
       }
       return;
    }
    public final String V(){
       Object obj = PatchProxy.apply(null, this, a.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.q.getLiveStreamId();
    }
    public final int W(){
       Object obj = PatchProxy.apply(null, this, a.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a.a(this.s.h());
    }
    public final String X(VoicePartyMicSeatData p0){
       UserInfo mId;
       p0 = p0.mMicUser;
       if (p0 != null) {
          b a = p0.a;
          if (a != null) {
             mId = a.mId;
             if (mId != null) {
             label_000f :
                return mId;
             }
          }
       }
       mId = "";
       goto label_000f ;
    }
    public final boolean Y(){
       LiveApiParams$AssistantType obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       QCurrentUser qCurrentUser = QCurrentUser.me();
       a.o(qCurrentUser, "QCurrentUser.me\(\)");
       obj = this.E.d(qCurrentUser.getId());
       a.o(obj, "adminService.getAssistan¡­ype\(QCurrentUser.me\(\).id\)");
       return obj.isAdmin();
    }
    public final boolean Z(){
       Object obj = PatchProxy.apply(null, this, a.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       QCurrentUser qCurrentUser = QCurrentUser.me();
       a.o(qCurrentUser, "QCurrentUser.me\(\)");
       String id = qCurrentUser.getId();
       a.o(id, "QCurrentUser.me\(\).id");
       return MicSeatsDataManager.q(this.w, id, false, 2, null);
    }
    public final void a0(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "52")) {
          return;
       }
       this.c(p0);
       e uoe = this.s.e();
       a.m(uoe);
       LiveVoicePartyApi.d().f(this.V(), this.s.y(), uoe.c(), p0).compose(this.L()).map(new e()).subscribe(new a$h(this), new a$i(this));
       return;
    }
    public boolean b(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, uoa, "4");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       if (this.Y()) {
          QCurrentUser obj1 = PatchProxy.apply(objArray, this, uoa, "3");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else {
             obj1 = QCurrentUser.me();
             a.o(obj1, "QCurrentUser.me\(\)");
             b = this.E.a(obj1.getId()).mControl;
          }
          if (b != null) {
             b = true;
          label_0043 :
             return b;
          }
       }
       b = false;
       goto label_0043 ;
    }
    public final void b0(VoicePartyMicSeatData p0,boolean p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "37")) {
          return;
       }
       LiveVoicePartyApi.b().d0(this.V(), this.s.y(), p0.mId, p1).compose(this.L()).subscribe(a$k.b, new a());
       ClientContent$LiveStreamPackage liveStreamPa = this.q.a();
       a ts = this.s;
       String str = this.X(p0);
       Optional optional = r.a(p0);
       a.o(optional, "VoicePartyMicSeatUtils.getUserInfo\(seatData\)");
       boolean b = optional.isPresent();
       int i = (p1)? 12: 11;
       k1.b(liveStreamPa, ts, p0, str, b, i);
       return;
    }
    public void c(int p0){
       y1 oy1;
       MicSeatTeam nONE;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "6")) {
          return;
       }
       y1$a d = y1.d;
       Objects.requireNonNull(d);
       y1$a uoa1 = y1$a.class;
       if (PatchProxy.isSupport(uoa1)) {
          oy1 = PatchProxy.applyOneRefs(Integer.valueOf(p0), d, uoa1, "1");
          if (oy1 != PatchProxyResult.class) {
          label_0048 :
             this.f = oy1;
             this.e.onNext(Boolean.TRUE);
             return;
          }
       }
       int i = 1;
       if (p0 != i) {
          nONE = (p0 != 2)? MicSeatTeam.NONE: MicSeatTeam.BLUE;
       }else {
          nONE = MicSeatTeam.YELLOW;
       }
       oy1 = new y1(i, null, nONE);
       goto label_0048 ;
    }
    public final void c0(VoicePartyMicSeatData p0,boolean p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "36")) {
          return;
       }
       LiveVoicePartyApi.b().g0(this.V(), this.s.y(), p0.mId, p1).compose(this.L()).subscribe(a$l.b, new a());
       ClientContent$LiveStreamPackage liveStreamPa = this.q.a();
       a ts = this.s;
       String str = this.X(p0);
       Optional optional = r.a(p0);
       a.o(optional, "VoicePartyMicSeatUtils.getUserInfo\(seatData\)");
       boolean b = optional.isPresent();
       int i = (p1)? 2: 3;
       k1.b(liveStreamPa, ts, p0, str, b, i);
       return;
    }
    public y1 d(){
       return this.f;
    }
    public final ActionsController$b d0(){
       Object obj = PatchProxy.apply(null, this, a.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a$m(this);
    }
    public final void e0(int p0,VoicePartyMicSeatData p1){
       UserInfo userInfo1;
       l1 a;
       boolean b;
       VoicePartyMicSeatData mMicUser;
       a tr;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "19")) {
          return;
       }
       b.Z(LiveVoicePartyLogTag.OTHER, "VoicePartyAudienceMicManager processAction: "+p0);
       Iterator iterator = this.k.iterator();
       while (true) {
          UserInfo userInfo = null;
          if (iterator.hasNext()) {
             userInfo1 = iterator.next();
             if (!userInfo1.F1(p0, p1)) {
                continue ;
             }
          }else {
             userInfo1 = userInfo;
          }
          if (userInfo1 == null) {
             if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "20")) {
                int i = 2;
                int i1 = 5;
                if (p0 != i1) {
                   b = true;
                   if (p0 != 6) {
                      if (p0 != 7) {
                         if (p0 != 8) {
                            boolean b1 = false;
                            if (p0 != 10) {
                               if (p0 != 11) {
                                  if (p0 != 33) {
                                     switch (p0){
                                         case 16:
                                         case 19:
                                           mMicUser = p1.mMicUser;
                                           a.m(mMicUser);
                                           this.U(mMicUser.a, 173);
                                           break;
                                         case 17:
                                         case 18:
                                           mMicUser = p1.mMicUser;
                                           if (mMicUser != null) {
                                              a.m(mMicUser);
                                              if (mMicUser.a != null) {
                                                 p1 = p1.mMicUser;
                                                 a.m(p1);
                                                 b.a(this.o, p1.a.mId, this.V());
                                              }
                                           }
                                           break;
                                         case 20:
                                           mMicUser = p1.mMicUser;
                                           a.m(mMicUser);
                                           b a1 = mMicUser.a;
                                           a.o(a1, "clickingMicSeatData.mMicUser!!.mUser");
                                           int i2 = (this.s.J())? 35: 32;
                                           this.h0(a1, i2);
                                           break;
                                         case 21:
                                           tr = this.r;
                                           GiftTab normalGift = GiftTab.NormalGift;
                                           p1 = p1.mMicUser;
                                           if (p1 != null) {
                                              a.m(p1);
                                              userInfo = p1.a;
                                           }
                                           a.f(tr, normalGift, b1, userInfo, i);
                                           break;
                                         default:
                                           switch (p0){
                                               case 26:
                                                 this.c0(p1, b);
                                                 break;
                                               case 27:
                                                 this.c0(p1, b1);
                                                 break;
                                               case 28:
                                                 if (!PatchProxy.applyVoidOneRefs(p1, this, uoa, "39")) {
                                                    b.Z(LiveVoicePartyLogTag.MIC_SEATS_MANAGE, "admin setMicSeatName");
                                                    this.l.i(p1);
                                                    this.l.c();
                                                 }
                                                 break;
                                               case 29:
                                                 if (!PatchProxy.applyVoidOneRefs(p1, this, uoa, "40")) {
                                                    b.Z(LiveVoicePartyLogTag.MIC_SEATS_MANAGE, "admin setVIPSeat");
                                                    this.l.m(p1);
                                                    this.l.d();
                                                 }
                                                 break;
                                               case 30:
                                                 if (!PatchProxy.applyVoidOneRefs(p1, this, uoa, "41")) {
                                                    b.Z(LiveVoicePartyLogTag.MIC_SEATS_MANAGE, "admin removeVIPSeat");
                                                    this.l.a(p1);
                                                    this.l.d();
                                                 }
                                                 break;
                                               default:
                                                 b.B(LiveVoicePartyLogTag.OTHER, "VoicePartyAudienceMicManager processAction switch to default");
                                           }
                                     }
                                  }else if(PatchProxy.applyVoid(userInfo, this, uoa, "44")){
                                     this.i0();
                                     m om = new m(this.p, this.q.c(), this.q.a(), this.q.y(), "INTERACTIVE_PANEL", this.s.l(), this.s.f());
                                     this.j = PatchProxy.applyVoid(userInfo, this, uoa, "44");
                                     a.m(PatchProxy.applyVoid(userInfo, this, uoa, "44"));
                                     PatchProxy.applyVoid(userInfo, this, uoa, "44").a();
                                  }
                               }else {
                                  this.b0(p1, b);
                               }
                            }else {
                               this.b0(p1, b1);
                            }
                         }else if(this.Z()){
                            this.j0(p1);
                         }else {
                            this.Q(p1, i1);
                         }
                      }else if(r.g(p1)){
                         this.z.s(b);
                      }
                   }else if(r.g(p1)){
                      this.z.u(b);
                   }
                }else if(r.g(p1)){
                   if (!PatchProxy.applyVoid(userInfo, this, uoa, "54")) {
                      q1.a(this.q.c(), this.s, this.q.a(), null, 2, 3);
                      QCurrentUser qCurrentUser = QCurrentUser.me();
                      a.o(qCurrentUser, "QCurrentUser.me\(\)");
                      String id = qCurrentUser.getId();
                      a.o(id, "QCurrentUser.me\(\).id");
                      if (this.w.t(id)) {
                         b.Z(LiveVoicePartyLogTag.AUDIENCE, "can not leave mic because user is singing");
                         i.a(R.style.arg_RES_7f11066a, 0x7f102e62);
                      }else if(PatchProxy.applyVoid(userInfo, this, uoa, "22")){
                         tr = this.u;
                         if (tr != null) {
                            tr.f(i);
                         }
                      }
                   }
                }else if(this.b()){
                   mMicUser = p1.mMicUser;
                   if (mMicUser != null) {
                      a.m(mMicUser);
                      if (mMicUser.a != null) {
                         mMicUser = p1.mMicUser;
                         a.m(mMicUser);
                         UserInfo mId = mMicUser.a.mId;
                         a.o(mId, "clickingMicSeatData.mMicUser!!.mUser.mId");
                         if (!PatchProxy.applyVoidTwoRefs(p1, mId, this, uoa, "38")) {
                            LiveVoicePartyApi.b().F0(this.V(), this.s.y(), mId).compose(this.L()).subscribe(n.b, new a());
                            Optional optional = r.a(p1);
                            a.o(optional, "VoicePartyMicSeatUtils.getUserInfo\(seatData\)");
                            k1.b(this.q.a(), this.s, p1, this.X(p1), optional.isPresent(), 6);
                         }
                      }
                   }
                }
             }
             a = l1.a;
             break ;
          }
          break ;
       }
       return;
    }
    public final void f0(){
       if (PatchProxy.applyVoid(null, this, a.class, "23")) {
          return;
       }
       k1.h(this.q.a(), this.s, "REFUSE_INVITE");
       LiveVoicePartyApi.b().P(this.V(), this.s.y()).compose(this.L()).map(new e()).subscribe(new a$n(this), new a());
       return;
    }
    public final void g0(String p0,int p1){
       String str;
       String str1;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "42")) {
          return;
       }
       a ti = this.i;
       if (ti != null) {
          a.m(ti);
          ti.A7();
          return;
       }else {
          boolean b = y.d(this.o);
          if (PatchProxy.isSupport(uoa)) {
             Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p1), this, uoa, "43");
             if (obj != PatchProxyResult.class) {
                str = obj;
             label_0061 :
                VoicePartyMatchRoomFragment voicePartyMa = new VoicePartyMatchRoomFragment(b, p0, str, this.s, this.q, this.C, new a$o(this), this.y);
                this.i = ti;
                a.m(ti);
                ti.k0(new a$p(this));
                a ti1 = this.i;
                a.m(ti1);
                ti1.Cb(this.p, "LiveVoicePartyMatchRoomFragment");
                return;
             }
          }
          if (p1 != 1) {
             if (p1 != 2) {
                if (p1 != 5) {
                   if (p1 != 6) {
                      str1 = "";
                   }else {
                      str1 = "AUTO";
                   }
                }else if(this.Y()){
                   str1 = "OP_MIC";
                }
             }
             str1 = "BOTTOM";
          }else {
             str1 = "MIC";
          }
          str = str1;
          goto label_0061 ;
       }
    }
    public final void h0(UserInfo p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "21")) {
          return;
       }
       QCurrentUser qCurrentUser = QCurrentUser.me();
       a.o(qCurrentUser, "QCurrentUser.me\(\)");
       if (a.g(qCurrentUser.getId(), p0.mId)) {
          return;
       }
       this.F.w0(new UserProfile(p0), LiveStreamClickType.VOICE_PARTY, 18, false, p1);
       return;
    }
    public void i(VoicePartyMicSeatData p0){
       b a;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "58")) {
          return;
       }
       a.p(p0, "micSeat");
       p0 = p0.mMicUser;
       if (p0 == null) {
          return;
       }
       a.m(p0);
       a = p0.a;
       a.o(a, "micSeat.mMicUser!!.mUser");
       this.h0(a, 32);
       return;
    }
    public final void i0(){
       if (PatchProxy.applyVoid(null, this, a.class, "49")) {
          return;
       }
       a tj = this.j;
       if (tj != null) {
          a.m(tj);
          Objects.requireNonNull(tj);
          if (!PatchProxy.applyVoid(null, tj, m.class, "2")) {
             b.Z(LiveLogTag.GUEST_INVITE_FRIENDS, tj.a+" stop");
             tj.b.d();
             m c = tj.c;
             if (c != null) {
                f.a(c);
             }
          }
          this.j = null;
       }
       return;
    }
    public void j(int p0,c p1){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, a.class, "63")) {
          return;
       }
       a.p(p1, "delegate");
       return;
    }
    public final void j0(VoicePartyMicSeatData p0){
       boolean b;
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "32")) {
          return;
       }
       LiveVoicePartyLogTag oTHER = LiveVoicePartyLogTag.OTHER;
       b.Z(oTHER, "VoicePartyAudienceMicManager switchMic");
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, uoa, "31");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          switch (this.s.h()){
              case 1:
              case 3:
              case 4:
              case 6:
              case 7:
              case 2:
             label_0056 :
                b = true;
                break;
              case 5:
                if (this.Z()) {
                   if (this.s.e() != null) {
                      objArray = this.s.q();
                   }
                   if (objArray != null && objArray.b()) {
                      i.a(R.style.arg_RES_7f11066a, 0x7f1004af);
                   label_0058 :
                      b = false;
                   }else {
                      goto label_0056 ;
                   }
                }else {
                   goto label_0058 ;
                }
                break;
              default:
                goto label_0058 ;
          }
       }
       if (!b) {
          b.Z(oTHER, "VoicePartyAudienceMicManager switchMic block");
          return;
       }else if(!this.S(p0, 1)){
          return;
       }else {
          LiveVoicePartyApi.b().m0(this.V(), this.s.y(), p0.mId).compose(this.L()).map(new e()).subscribe(new a$s(this, p0), new a());
          return;
       }
    }
    public void k(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "5")) {
          return;
       }
       y1$a d = y1.d;
       Objects.requireNonNull(d);
       y1$a uoa1 = y1$a.class;
       if (PatchProxy.isSupport(uoa1)) {
          y1 oy1 = PatchProxy.applyOneRefs(Integer.valueOf(p0), d, uoa1, "2");
          if (oy1 != PatchProxyResult.class) {
          label_0041 :
             this.f = oy1;
             this.e.onNext(Boolean.TRUE);
             return;
          }
       }
       y1 oy11 = new y1(true, Integer.valueOf(p0), null, 4, null);
       goto label_0041 ;
    }
    public void l(f p0,int p1){
       a a;
       boolean b;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "59")) {
          return;
       }
       a.p(p0, "micSeatData");
       q1.e(this.s, this.q.a(), p0, p1, this.o);
       if (!PatchProxy.applyVoidOneRefs(p0, this, uoa, "34")) {
          LiveVoicePartyCommonConfig liveVoicePar = a.M(LiveVoicePartyCommonConfig.class);
          LiveVoicePartyCommonConfig mMicSeatsLev = (liveVoicePar != null)? liveVoicePar.mMicSeatsLevelContributionRule: null;
          if (mMicSeatsLev == null) {
             b.B(LiveVoicePartyLogTag.AUDIENCE, "no rank rule found");
          }else {
             UserInfo userInfo = p0.c();
             if (userInfo != null) {
                UserInfo mHeadUrls = userInfo.mHeadUrls;
                if (mHeadUrls != null && (!mHeadUrls.length || TextUtils.isEmpty(mHeadUrls[0].mUrl))) {
                   b.B(LiveVoicePartyLogTag.AUDIENCE, "no user head url");
                }else {
                   a = a.a;
                   a tD = this.D;
                   UserInfo userInfo1 = p0.c();
                   Object obj = PatchProxy.applyOneRefs(userInfo, this, uoa, "33");
                   if (obj != PatchProxyResult.class) {
                      b = obj.booleanValue();
                   }else {
                      QCurrentUser qCurrentUser = QCurrentUser.me();
                      a.o(qCurrentUser, "QCurrentUser.me\(\)");
                      b = TextUtils.n(userInfo.mId, qCurrentUser.getId()) ^ 0x01;
                   }
                   LiveVoicePartyCommonConfig mMicSeatsLev1 = liveVoicePar.mMicSeatsLevelContributionRule;
                   a.o(mMicSeatsLev1, "config.mMicSeatsLevelContributionRule");
                   String str = this.s.y();
                   a.o(str, "voicePartyContext.voicePartyId");
                   a.a(tD, userInfo1, p0, b, mMicSeatsLev1, str, this.V());
                }
             }
          }
       }
       return;
    }
    public void p(){
       if (PatchProxy.applyVoid(null, this, a.class, "7")) {
          return;
       }
       this.f = y1.d.a();
       this.e.onNext(Boolean.FALSE);
       return;
    }
    public void t(){
       Dialog uDialog1;
       Dialog uDialog = this;
       m om = m.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, uDialog, a.class, "55")) {
          return;
       }
       q1.a(uDialog.q.c(), uDialog.s, uDialog.q.a(), null, 2, 2);
       m om1 = new m();
       m$a uoa = new m$a(0x7f102e55);
       a$q oq = new a$q(uDialog);
       if (!PatchProxy.applyVoidTwoRefs(uoa, oq, om1, om, "1")) {
          om1.a.put(uoa, oq);
       }
       d0.b(uDialog.d);
       a o = uDialog.o;
       a$r or = new a$r(uDialog);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a obj = PatchProxy.applyTwoRefs(o, or, om1, om, "2");
       if (obj != patchProxyRe) {
       }else if(PatchProxy.isSupport(om)){
          uDialog1 = PatchProxy.applyFourRefs(o, or, null, Boolean.FALSE, om1, m.class, "3");
          if (uDialog1 != patchProxyRe) {
          label_0076 :
             obj = uDialog1;
          }
       }
       b uob = new b(o);
       Iterator iterator = om1.a.keySet().iterator();
       while (iterator.hasNext()) {
          m$a uoa1 = iterator.next();
          obj = a.b();
          if (TextUtils.isEmpty(uoa1.b)) {
             obj.i(0);
             obj.o(R.color.arg_RES_7f061f91);
             obj.d(uoa1.c);
             obj.g(uoa1.a);
          }else {
             obj.i(1);
             obj.o(R.color.arg_RES_7f061f91);
             obj.g(uoa1.a);
             obj.j(uoa1.b);
             obj.d(uoa1.c);
             obj.k(R.color.arg_RES_7f061f92);
             obj.m(R.dimen.arg_RES_7f070f71);
             obj.w = false;
          }
          om1.b.add(obj.h.toString());
          uob.a(obj.a());
       }
       uob.l(new k(om1));
       uob.k(new j(or));
       uob.m(new l(om1, objArray));
       uDialog1 = uob.q();
       goto label_0076 ;
       uDialog.d = obj;
       ClientContent$LiveStreamPackage liveStreamPa = uDialog.q.a();
       a s = uDialog.s;
       if (!PatchProxy.applyVoidTwoRefs(liveStreamPa, s, objArray, k1.class, "18")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "MIC_INVITE_POPUP";
          ClientContentWrapper$ContentWrapper uContentWrap = new ClientContentWrapper$ContentWrapper();
          uContentWrap.liveVoicePartyPackage = n.g(s);
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          u1.v0(9, uElementPack, uContentPack, uContentWrap);
       }
       return;
    }
    public void v(int p0){
    }
    public void x(f p0,int p1){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, a.class, "60")) {
          return;
       }
       a.p(p0, "micSeatInfo");
       if (p0.c() != null) {
          this.U(p0.c(), 173);
       }
       return;
    }
    public void y(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "61")) {
          return;
       }
       a.p(p0, "interceptor");
       this.k.add(p0);
       return;
    }
    public c z(){
       a uoa = PatchProxy.apply(null, this, a.class, "56");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = this.e;
          a.o(uoa, "isApplyingAboardMicSubject");
       }
       return uoa;
    }
}
