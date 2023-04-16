package com.kuaishou.live.core.voiceparty.playway.VoicePartyAudienceViewController$vcFactory$1;
import msd.q;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.playway.VoicePartyAudienceViewController;
import msd.a;
import java.lang.Object;
import com.kuaishou.live.viewcontroller.ViewController;
import pu2.e;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.util.Objects;
import zo2.d;
import android.app.Activity;
import hu2.g;
import hu2.i;
import qu2.a;
import co2.f2;
import qu2.c;
import com.kuaishou.live.core.voiceparty.b;
import hu2.j;
import mrd.c;
import ru2.f;
import ru2.d;
import hu2.k;
import com.kuaishou.live.livestage.g;
import com.kwai.feature.api.live.service.voiceparty.LiveVoicePartyPlayViewService;
import com.kuaishou.live.core.voiceparty.h;
import hf3.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import w02.g;
import fe3.b;
import hp2.g;
import su2.d;
import mrd.a;
import ss2.h;
import brd.t;
import com.kuaishou.live.core.voiceparty.playway.video.VoicePartyAudienceVideoViewController;
import ss2.e;
import ss2.e$a;
import ss2.e$b;
import ss2.c;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCVoicePartyGridChatOpened;
import java.util.ArrayList;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$MicSeatDetailInfo;
import ss2.d;
import ss2.l;
import java.util.List;
import com.kuaishou.live.core.voiceparty.playway.shared.VoicePartyPlayTypeAudienceViewControllerFactory$createGridChatViewController$1;
import msd.l;
import com.kuaishou.live.core.voiceparty.playway.shared.VoicePartyPlayTypeAudienceViewControllerFactory$createGridChatViewController$2;
import com.kuaishou.live.core.voiceparty.playway.shared.VoicePartyPlayTypeAudienceViewControllerFactory$createGridChatViewController$3;
import jv2.e;
import jv2.g;
import com.kuaishou.live.core.voiceparty.playway.video.pendant.VoicePartyPlayType;
import jv2.f;
import java.util.Set;
import nsd.u;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatStyle;
import com.kuaishou.live.core.voiceparty.playway.video.livestage.GridLegacyLayoutConfigDelegate;
import msd.p;
import com.kuaishou.live.core.voiceparty.playway.video.livestage.GridLegacyLayoutConfigDelegate$Companion;
import gv2.a;
import h12.a;
import pu2.b;
import erd.o;
import hv2.b;
import com.kuaishou.live.core.voiceparty.playway.video.camera.CameraRequestApi;
import com.kuaishou.live.core.voiceparty.playway.shared.VoicePartyPlayTypeAudienceViewControllerFactory$createGridChatViewController$5;
import msd.t;
import ee3.a0;
import qs2.a;
import zo2.c;
import iu2.a;
import com.kuaishou.live.core.voiceparty.playway.shared.model.audience.AudienceMicSeatsDataManager;
import wu2.a;
import lk2.c;
import i81.f;
import com.kuaishou.live.comments.bulletin.LiveBulletinLayoutManager;
import ws5.c;
import t02.a0;
import com.kuaishou.live.core.voiceparty.a;
import ee1.a;
import vq5.d;
import x61.c;
import com.kuaishou.live.core.voiceparty.playway.shared.model.MicSeatsDataManager;
import ru2.a;
import com.kuaishou.live.core.voiceparty.g0;
import p91.m;
import fo2.d;
import i81.g;
import co2.n1;
import m91.b;
import com.kuaishou.live.core.voiceparty.playway.crosspk.VoicePartyAudienceCrossRoomPkController;
import ru2.c;
import hu2.l;
import eu2.g;
import com.kuaishou.live.core.voiceparty.playway.crosspk.VoicePartyAudienceCrossRoomPkController$a;
import zo2.f;
import com.kuaishou.live.core.voiceparty.teampk.AudienceTeamPkViewController;
import fq5.b;
import qc2.a;
import lp3.e;
import com.kuaishou.live.core.voiceparty.playway.VoicePartyAudienceViewController$createTeamPkController$1;
import com.kuaishou.live.core.voiceparty.core.audience.AudienceVoicePartyManager;
import wj2.r0;
import zo2.g;
import kw2.d;
import kw2.b;
import com.kuaishou.live.core.voiceparty.player.VoicePartyPlayerController;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager;
import lw2.a;
import kw2.f;
import ft5.b;
import gq5.f;
import dt5.c;
import u32.k;
import pq5.c;
import j47.a;
import kw2.a;
import pb1.c;
import g81.c;
import kw2.e;
import q12.c;
import tq5.c;
import jv1.b;
import oq5.b;
import kw2.c;
import com.kuaishou.live.core.voiceparty.theater.VoicePartyTheaterAudienceController;
import com.kuaishou.live.core.voiceparty.playway.VoicePartyAudienceViewController$createTheaterController$1;
import com.kuaishou.live.core.voiceparty.playway.sixseats.AudienceAudioPlaywayViewController;
import trd.c1;
import com.kuaishou.live.core.voiceparty.model.VoicePartyAbParams;
import trd.d1;
import com.kuaishou.live.core.voiceparty.playway.shared.VoicePartyPlayTypeAudienceViewControllerFactory$createVideoChatViewController$1;
import com.kuaishou.live.core.voiceparty.playway.shared.VoicePartyPlayTypeAudienceViewControllerFactory$createVideoChatViewController$2;
import com.kuaishou.live.core.voiceparty.playway.shared.VoicePartyPlayTypeAudienceViewControllerFactory$createVideoChatViewController$3;
import pu2.c;
import com.kuaishou.live.core.voiceparty.playway.video.livestage.VideoLegacyLayoutConfigDelegate;
import com.kuaishou.live.core.voiceparty.playway.video.livestage.VideoLegacyLayoutConfigDelegate$Companion;
import gv2.c;
import pu2.d;
import com.kuaishou.live.core.voiceparty.playway.shared.VoicePartyPlayTypeAudienceViewControllerFactory$createVideoChatViewController$6;
import zo2.e;
import com.kuaishou.live.core.voiceparty.ktv.VoicePartyKtvAudienceController;
import ry1.b;
import hu2.m;
import fs2.l;
import androidx.fragment.app.FragmentActivity;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyKtvCommonConfig;
import fs2.a;
import nc1.k;
import ne1.h;
import v12.f;
import yt2.d;
import com.kuaishou.live.core.voiceparty.playway.VoicePartyAudienceViewController$createKtvController$1;
import java.lang.Number;

public final class VoicePartyAudienceViewController$vcFactory$1 extends Lambda implements q	// class@001849
{
    public final VoicePartyAudienceViewController this$0;

    public void VoicePartyAudienceViewController$vcFactory$1(VoicePartyAudienceViewController p0){
       this.this$0 = p0;
       super(3);
    }
    public final ViewController invoke(int p0,a p1,Object p2){
       VoicePartyAudienceViewController$vcFactory$1 obj2;
       String this;
       e obj4;
       VoicePartyAudienceCrossRoomPkController voicePartyAu1;
       t ot;
       t ot1;
       f2 uof2;
       a0 uoa01;
       a uoa2;
       a uoa3;
       k i2;
       k j;
       a0 uoa04;
       a0 uoa06;
       VoicePartyAudienceViewController l;
       PatchProxyResult patchProxyRe1;
       VoicePartyAudienceViewController$vcFactory$1 this$01;
       a uoa5;
       b uob1;
       c uoc2;
       f uof2;
       PatchProxyResult patchProxyRe2;
       VoicePartyAudienceViewController voicePartyAu2;
       g og1;
       VoicePartyAudienceViewController$vcFactory$1 ovcFactory$11;
       h oh1;
       VoicePartyAudienceVideoViewController voicePartyAu3;
       a uoa7;
       Set obj4;
       d uod2;
       e uoe2;
       f2 uof22;
       a uoa8;
       a uoa9;
       a0 uoa012;
       VoicePartyTheaterAudienceController voicePartyTh;
       a uoa10;
       c uoc8;
       d uod3;
       a uoa13;
       BaseFragment uoa0251;
       VoicePartyAudienceViewController uoa0251;
       b uob7;
       e a;
       VoicePartyAudienceViewController m;
       VoicePartyAudienceViewController$vcFactory$1 ovcFactory$12;
       String obj7;
       l ol1;
       VoicePartyAudienceViewController$vcFactory$1 ovcFactory$1 = this;
       int i = p0;
       LiveVoicePartyPlayViewService obj = p1;
       VoicePartyAudienceViewController obj1 = p2;
       e uoe = e.class;
       VoicePartyAudienceViewController voicePartyAu = VoicePartyAudienceViewController.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(VoicePartyAudienceViewController$vcFactory$1.class)) {
          obj2 = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, p2, this, VoicePartyAudienceViewController$vcFactory$1.class, "1");
          if (obj2 != patchProxyRe) {
             return obj2;
          }
       }
       a.p(obj, "closeReasonFetcher");
       int i1 = 2;
       String str = "voicePartyManager";
       String str1 = "dependence.baseDependenc¡­ment.childFragmentManager";
       this = 1;
       Activity obj3 = null;
       String str2 = null;
       switch (i){
           case 1:
             obj2 = ovcFactory$1;
             obj2.this$0.H.e().l().release();
             VoicePartyAudienceViewController$vcFactory$1 this$0 = obj2.this$0;
             Objects.requireNonNull(obj1, "null cannot be cast to non-null type com.kuaishou.live.core.voiceparty.core.audience.AudienceKtvParam");
             obj4 = obj1;
             Objects.requireNonNull(this$0);
             VoicePartyAudienceViewController obj5 = PatchProxy.applyTwoRefs(obj4, obj, this$0, voicePartyAu, "16");
             if (obj5 != patchProxyRe) {
                voicePartyAu1 = obj5;
             }else {
                BaseFragment uBaseFragmen = this$0.H.b().c();
                a0 uoa0 = this$0.H.b().f();
                if (uoa0 != null) {
                   uoa0 = uoa0.b3;
                   if (uoa0 != null) {
                      ot = uoa0.T3();
                      if (ot != null) {
                         ot1 = ot.map(m.b);
                      label_0be4 :
                         uof2 = this$0.H.b().l();
                         a uoa = this$0.H.b().d();
                         FragmentActivity uFragmentAct = uBaseFragmen.requireActivity();
                         a.o(uFragmentAct, "currentFragment.requireActivity\(\)");
                         obj5 = this$0.j;
                         if (obj5 == null) {
                            a.S(str);
                         }
                         c uoc = this$0.H.e().n();
                         uoa01 = this$0.H.b().f();
                         b uob = (uoa01 != null)? uoa01.N(): null;
                         a uoa1 = this$0.H.b().h();
                         c uoc1 = this$0.H.e().g();
                         uoa2 = this$0.H.b().b();
                         uoa3 = this$0.H.b().e();
                         i2 = this$0.H.e().i;
                         a uoa4 = this$0.H.e().m();
                         VoicePartyPlayerController voicePartyPl = this$0.H.b().g();
                         a0 uoa02 = this$0.H.b().f();
                         a0 uoa03 = (uoa02 != null)? uoa02.j2: null;
                         j = this$0.H.e().j;
                         uoa04 = this$0.H.b().f();
                         a0 uoa05 = (uoa04 != null)? uoa04.X: null;
                         uoa04 = this$0.H.b().f();
                         uoa06 = (uoa04 != null)? uoa04.L2: null;
                         uoa04 = this$0.H.b().f();
                         a0 uoa07 = (uoa04 != null)? uoa04.x: null;
                         VoicePartyAudienceViewController u = this$0.u;
                         if (u == null) {
                            a.S("muteService");
                         }
                         voicePartyAu = this$0.B;
                         AudienceMicSeatsDataManager uAudienceMic = this$0.H.d().c();
                         d uod = this$0.H.d().a();
                         VoicePartyAudienceViewController o = this$0.o;
                         f uof = this$0.H.e().e();
                         LiveBulletinLayoutManager liveBulletin = this$0.H.e().d();
                         l = this$0.l;
                         RtcManager rtcManager = this$0.H.b().k().a();
                         k v = this$0.H.e().v;
                         t ot2 = this$0.H.b().i();
                         a0 uoa08 = this$0.H.b().f();
                         a0 uoa09 = (uoa08 != null)? uoa08.U: null;
                         uoa08 = this$0.H.b().f();
                         a0 uoa010 = (uoa08 != null)? uoa08.Y0: null;
                         l ol = new l(obj4, uof2, uoa, null, ot1, uFragmentAct, uBaseFragmen, obj5, uoc, uob, uoa1, uoc1, uoa2, uoa3, i2, uoa4, voicePartyPl, uoa03, j, uoa05, uoa06, uoa07, u, voicePartyAu, uAudienceMic, uod, o, uof, liveBulletin, l, rtcManager, v, ot2, uoa010, this$0.H.e().k(), this$0.H.e().c(), uoa09);
                         f uof1 = new f(this$0.H.d().a().a(), false, null, null, null, 30, null);
                         VoicePartyKtvAudienceController voicePartyKt = new VoicePartyKtvAudienceController(obj1, this$0.w, this$0.X2(), new e(VoicePartyAudienceViewController.Z2(this$0, false, 1, null), new g(VoicePartyPlayType.KTV, false), obj5, MicSeatStyle.Media), p1, new VoicePartyAudienceViewController$createKtvController$1(this$0));
                         this$0.x2(R.id.live_voice_party_content, uFragmentAct);
                         voicePartyAu1 = uFragmentAct;
                      }
                   }
                }
                ot1 = null;
                goto label_0be4 ;
             }
             break;
           case 2:
             patchProxyRe1 = patchProxyRe;
             this$01 = ovcFactory$1.this$0;
             Objects.requireNonNull(this$01);
             obj4 = PatchProxy.apply(null, this$01, voicePartyAu, "15");
             if (obj4 != patchProxyRe1) {
                voicePartyAu1 = obj4;
             label_0b89 :
                int i3 = this;
             }else {
                obj4 = e.a;
                obj3 = this$01.B2();
                uoa5 = this$01.H.b().d();
                f2 uof21 = this$01.H.b().l();
                obj1 = this$01.m;
                uob1 = this$01.H.b().k().c();
                uoc2 = this$01.H.d().d();
                uof2 = VoicePartyAudienceViewController.Z2(this$01, false, 1, null);
                d uod1 = this$01.H.d().a();
                g og = this$01.H.e().l();
                obj = this$01.H.e().i();
                h oh = this$01.H.d().b();
                patchProxyRe2 = patchProxyRe1;
                voicePartyAu2 = this$01.o;
                a uoa6 = this$01.H.b().e();
                c childFragmen = this$01.H.b().c().getChildFragmentManager();
                a.o(childFragmen, str1);
                og1 = this$01.H.e().f();
                Objects.requireNonNull(obj4);
                Integer integer = Integer.valueOf(0);
                if (PatchProxy.isSupport(uoe)) {
                   ovcFactory$11 = this$01;
                   Object[] objArray = new Object[15];
                   objArray[0] = obj3;
                   objArray[1] = uoa5;
                   objArray[i1] = uof21;
                   objArray[3] = obj1;
                   objArray[4] = uob1;
                   objArray[5] = uoc2;
                   objArray[6] = uof2;
                   objArray[7] = uod1;
                   objArray[8] = og;
                   objArray[9] = obj;
                   objArray[10] = oh;
                   objArray[11] = voicePartyAu2;
                   objArray[12] = uoa6;
                   objArray[13] = childFragmen;
                   objArray[14] = og1;
                   oh1 = oh;
                   voicePartyAu3 = PatchProxy.apply(objArray, obj4, uoe, "2");
                   if (voicePartyAu3 != patchProxyRe2) {
                   label_0b80 :
                      ovcFactory$11.x2(R.id.live_voice_party_video_mode_container, voicePartyAu3);
                      voicePartyAu1 = voicePartyAu3;
                      goto label_0b89 ;
                   }
                }else {
                   oh1 = oh;
                   ovcFactory$11 = this$01;
                }
                a.p(obj3, "activity");
                a.p(uoa5, "liveBaseContext");
                a.p(uof21, "voicePartyContext");
                a.p(obj1, "micSeatLongConnection");
                a.p(uof2, "micSeatPendantDependency");
                a.p(uod1, "micSeatDisplayConfig");
                a.p(og, "liveStageManager");
                a.p(obj, "livePlayViewService");
                uoa7 = uoa6;
                a.p(uoa7, "liveLongConnection");
                a.p(childFragmen, "childFragmentManager");
                a.p(og1, "liveAudienceEventBusService");
                Set set = c1.f(uoa5.d());
                obj4 = (uof21.u().mEnableGuestOpenVideo != null)? c1.f(integer): d1.k();
                b uob2 = obj4;
                uod2 = new d(obj1.a());
                VoicePartyAudienceVideoViewController voicePartyAu4 = uoe;
                p2 = uoe;
                e uoe1 = childFragmen;
                f uof3 = new f(uod1.a(), false, set, c1.f(uoa5.d()), obj4, 2, null);
                uoe2 = new e(uof2, new g(VoicePartyPlayType.VideoChat, false), uoa7, MicSeatStyle.Video);
                ot = uod2.c().map(new c(set));
                t ot3 = ot;
                a.o(ot, "pendantDataSource.openVi¡­t + forceOpenVideoUsers }");
                c uoc3 = set;
                c uoc4 = new c(new b(5, uof21.y()));
                t ot4 = uod2.d().map(d.b);
                t ot5 = ot4;
                a.o(ot4, "pendantDataSource.userMu¡­f\(\)\) { User\(it\) }\n      }");
                b uob3 = ot4;
                b uob4 = new b(obj3, 0x7f08110d, c1.f(integer));
                CameraRequestApi uCameraReque = uob4;
                str1 = uof21.y();
                a.o(str1, "voicePartyContext.voicePartyId");
                CameraRequestApi uCameraReque1 = new CameraRequestApi(obj3, obj1, new VoicePartyPlayTypeAudienceViewControllerFactory$createVideoChatViewController$6(uoa5), str1);
                voicePartyAu4 = new VoicePartyAudienceVideoViewController(uoa5, uof21, e.d.a().b(c.b(obj1.a())).c(new VoicePartyPlayTypeAudienceViewControllerFactory$createVideoChatViewController$1(uob1)).c(new VoicePartyPlayTypeAudienceViewControllerFactory$createVideoChatViewController$2(uoc2)).c(new VoicePartyPlayTypeAudienceViewControllerFactory$createVideoChatViewController$3(uof21)).a(), uoe1, ot3, og, uob2, VideoLegacyLayoutConfigDelegate.d.a(set), uoc3, a.a(uob1, oh1), ot5, uob3, obj, uCameraReque, voicePartyAu2, uoa7, childFragmen, og1);
                voicePartyAu3 = p2;
                goto label_0b80 ;
             }
             break;
           case 3:
             obj2 = ovcFactory$1;
             obj2.this$0.H.e().l().release();
             this$01 = obj2.this$0;
             Objects.requireNonNull(this$01);
             AudienceAudioPlaywayViewController uAudienceAud = PatchProxy.apply(null, this$01, voicePartyAu, "10");
             if (uAudienceAud != patchProxyRe) {
             }else {
                uof22 = this$01.H.b().l();
                uoa5 = this$01.H.b().d();
                c uoc5 = this$01.H.e().n();
                AudienceMicSeatsDataManager uAudienceMic1 = this$01.H.d().c();
                obj1 = this$01.B;
                uoa8 = this$01.H.e().m();
                uoa9 = this$01.H.e().a();
                f uof4 = this$01.H.e().e();
                LiveBulletinLayoutManager liveBulletin1 = this$01.H.e().d();
                c uoc6 = this$01.X2();
                f uof5 = new f(this$01.H.d().a().a(), true, null, null, null, 28, null);
                e uoe3 = new e(VoicePartyAudienceViewController.Z2(this$01, false, 1, null), new g(VoicePartyPlayType.SixSeat, false), v13, MicSeatStyle.SixSeat);
                a0 uoa011 = this$01.H.b().f();
                b uob5 = (uoa011 != null)? uoa011.N(): null;
                c uoc7 = this$01.H.e().c();
                uoa011 = this$01.H.b().f();
                uoa012 = (uoa011 != null)? uoa011.p2: null;
                AudienceAudioPlaywayViewController uAudienceAud1 = new AudienceAudioPlaywayViewController(uof22, uoa5, uoc5, uAudienceMic1, obj1, uoa8, uoa9, uof4, liveBulletin1, uoc6, uoe3, uob5, uoc7, uoa012);
                this$01.x2(R.id.live_voice_party_content, uAudienceAud);
             }
             voicePartyAu1 = uAudienceAud;
             goto label_0b89 ;
             break;
           case 4:
             obj2 = ovcFactory$1;
             obj2.this$0.H.e().l().release();
             this$01 = obj2.this$0;
             Objects.requireNonNull(obj1, "null cannot be cast to non-null type com.kuaishou.live.core.voiceparty.core.audience.AudienceTheaterParam");
             Objects.requireNonNull(this$01);
             voicePartyTh = PatchProxy.applyTwoRefs(obj1, p1, this$01, voicePartyAu, "12");
             if (voicePartyTh != patchProxyRe) {
             label_030a :
                voicePartyAu1 = voicePartyTh;
             }else {
                d voicePartyTh1 = new d(this$01.B, this$01.H.d().c(), this$01.H.d().a(), this$01.o);
                uoa10 = this$01.H.b().d();
                l = this$01.j;
                if (l == null) {
                   a.S(str);
                }
                uob1 = new b(uoa10, l, this$01.H.b().e(), this$01.H.b().g(), this$01.H.b().k().a(), this$01.H.b().i());
                g o1 = this$01.H.b().o;
                uoa01 = this$01.H.b().f();
                a0 uoa013 = (uoa01 != null)? uoa01.Y1: null;
                uoa01 = this$01.H.b().f();
                a0 uoa014 = (uoa01 != null)? uoa01.g2: null;
                uoa01 = this$01.H.b().f();
                a0 uoa015 = (uoa01 != null)? uoa01.i1: null;
                uoc8 = this$01.H.e().c();
                uoa01 = this$01.H.b().f();
                a0 uoa016 = (uoa01 != null)? uoa01.a2: null;
                uoa01 = this$01.H.b().f();
                a0 uoa017 = (uoa01 != null)? uoa01.j2: null;
                uoa01 = this$01.H.b().f();
                uoa012 = (uoa01 != null)? uoa01.E1: null;
                a uoa11 = this$01.H.e().m();
                c uoc9 = this$01.H.e().g();
                uoa01 = this$01.H.b().f();
                a uoa12 = (uoa01 != null)? new a(uoa01): null;
                uoa01 = this$01.H.b().f();
                a0 uoa018 = (uoa01 != null)? uoa01.F1: null;
                uoa01 = this$01.H.b().f();
                a0 uoa019 = (uoa01 != null)? uoa01.H: null;
                f uof6 = new f(o1, uoa013, uoa014, uoa015, uoc8, uoa016, uoa017, uoa012, uoa11, uoc9, uoa12, uoa018, uoa019, this$01.H.e().e(), this$01.H.e().d(), this$01.v);
                g og2 = this$01.H.e().f();
                uoa04 = this$01.H.b().f();
                a0 uoa020 = (uoa04 != null)? uoa04.E2: null;
                uoa04 = this$01.H.b().f();
                b uob6 = (uoa04 != null)? uoa04.N(): null;
                uod3 = this$01.H.e().k();
                uoa04 = this$01.H.b().f();
                a0 uoa021 = (uoa04 != null)? uoa04.M1: null;
                uoa04 = this$01.H.b().f();
                a0 uoa022 = (uoa04 != null)? uoa04.U: null;
                uoa04 = this$01.H.b().f();
                a0 uoa023 = (uoa04 != null)? uoa04.x: null;
                uoa04 = this$01.H.b().f();
                a0 uoa024 = (uoa04 != null)? uoa04.p1: null;
                e uoe4 = new e(og2, uoa020, uob6, uod3, uoa021, uoa022, uoa023, uoa024, this$01.l, this$01.H.e().c());
                c childFragmen1 = this$01.H.b().c().getChildFragmentManager();
                a.o(childFragmen1, str1);
                VoicePartyTheaterAudienceController voicePartyTh2 = new VoicePartyTheaterAudienceController(obj1, this$01.H.b().l(), new c(str2, uoa01, voicePartyTh1, i), this$01.H.b().c(), this$01.H.b().c().getFragmentManager(), childFragmen1, this$01.X2(), VoicePartyAudienceViewController.Z2(this$01, false, 1, null), p1, new VoicePartyAudienceViewController$createTheaterController$1(this$01));
                this$01.x2(R.id.live_voice_party_content, voicePartyTh1);
                goto label_030a ;
             }
             break;
           case 5:
             obj2 = ovcFactory$1;
             obj2.this$0.H.e().l().release();
             this$01 = obj2.this$0;
             Objects.requireNonNull(obj1, "null cannot be cast to non-null type com.kuaishou.live.core.voiceparty.core.audience.AudienceTeamPkParam");
             Objects.requireNonNull(this$01);
             VoicePartyAudienceCrossRoomPkController voicePartyAu5 = PatchProxy.applyTwoRefs(obj1, obj, this$01, voicePartyAu, "13");
             if (voicePartyAu5 != patchProxyRe) {
             label_047f :
                voicePartyAu1 = voicePartyAu5;
             }else {
                uoa8 = this$01.H.b().d();
                f2 uof23 = this$01.H.b().l();
                uoa10 = this$01.H.b().e();
                AudienceMicSeatsDataManager uAudienceMic2 = this$01.H.d().c();
                a0 b uoa025 = this$01.H.b().f();
                if (uoa025 != null) {
                   uoa025 = uoa025.b();
                   if (uoa025 != null) {
                      uoa0251 = uoa025.b();
                      if (uoa0251 != null) {
                         uoc8 = uoa0251.getFragmentManager();
                      label_04f3 :
                         uoa0251 = this$01.j;
                         if (uoa0251 == null) {
                            a.S(str);
                         }
                         h oh2 = this$01.H.d().b();
                         VoicePartyAudienceViewController o2 = this$01.o;
                         a0 uoa026 = this$01.H.b().f();
                         a0 uoa027 = (uoa026 != null)? uoa026.U: null;
                         uoa026 = this$01.H.b().f();
                         a0 uoa028 = (uoa026 != null)? uoa026.Y0: null;
                         e uoe5 = uoa026;
                         f uof7 = new f(this$01.H.d().a().a(), true, null, null, null, 28, null);
                         e uoe6 = new e(VoicePartyAudienceViewController.Z2(this$01, false, 1, null), new g(VoicePartyPlayType.TeamPK, false), i, MicSeatStyle.PK);
                         VoicePartyAudienceViewController$createTeamPkController$1 uocreateTeam = uoe6;
                         VoicePartyAudienceViewController$createTeamPkController$1 uocreateTeam1 = new VoicePartyAudienceViewController$createTeamPkController$1(this$01);
                         AudienceTeamPkViewController uAudienceTea = new AudienceTeamPkViewController(obj1, uoa8, uof23, uoa10, p1, uAudienceMic2, uoc8, uoa0251, oh2, o2, uoa027, uoa028, this$01.H.e().m(), this$01.H.e().g(), this$01.H.e().a(), this$01.H.e().e(), this$01.H.e().d(), this$01.l, this$01.X2(), uoe5, this$01.H.c(), this$01.H.e().n(), uocreateTeam, this$01.H.e().c(), this$01.H.e().k());
                         this$01.x2(R.id.live_voice_party_content, voicePartyAu5);
                         goto label_047f ;
                      }
                   }
                }
                uoc8 = null;
                goto label_04f3 ;
             }
             break;
           case 6:
             obj2 = ovcFactory$1;
             obj2.this$0.H.e().l().release();
             this$01 = obj2.this$0;
             Objects.requireNonNull(obj1, "null cannot be cast to non-null type com.kuaishou.live.core.voiceparty.core.audience.AudienceCrossRoomPkParam");
             Object obj6 = obj1;
             Objects.requireNonNull(this$01);
             voicePartyTh = PatchProxy.applyOneRefs(obj6, this$01, voicePartyAu, "14");
             if (voicePartyTh != patchProxyRe) {
                goto label_030a ;
             }else {
                AudienceMicSeatsDataManager uAudienceMic3 = this$01.H.d().c();
                uoa0251 = this$01.B;
                uod3 = this$01.H.d().a();
                a uoa14 = this$01.H.e().m();
                uof22 = this$01.H.b().l().t;
                c uoc10 = this$01.H.e().g();
                f uof8 = this$01.H.e().e();
                LiveBulletinLayoutManager liveBulletin2 = this$01.H.e().d();
                f2 uof24 = this$01.H.b().l();
                c uoc11 = this$01.H.e().n();
                uoa01 = this$01.H.b().f();
                a0 uoa029 = (uoa01 != null)? uoa01.Z2: null;
                uoa2 = this$01.H.b().e();
                uoa3 = this$01.H.b().b();
                i2 = this$01.H.e().w;
                a0 uoa030 = this$01.H.b().f();
                j = this$01.H.e().x;
                a uoa15 = this$01.H.b().h();
                k y = this$01.H.e().y;
                h oh3 = this$01.H.d().b();
                uoa04 = this$01.H.b().f();
                uoa06 = (uoa04 != null)? uoa04.Y0: null;
                a uoa16 = new a(obj6, uAudienceMic3, uoa0251, uod3, uoa14, uof22, uoc10, uof8, liveBulletin2, uof24, uoc11, uoa029, uoa2, uoa3, i2, uoa030, j, uoa15, y, oh3, uoa06, this$01.H.e().k(), this$01.H.e().c());
                VoicePartyPlayType crossRoomPK = VoicePartyPlayType.CrossRoomPK;
                f uof9 = new f(this$01.H.d().a().a(), false, null, null, null, 30, null);
                MicSeatStyle pK = MicSeatStyle.PK;
                uoe2 = new e(VoicePartyAudienceViewController.Z2(this$01, false, 1, null), new g(crossRoomPK, false), uof22, pK);
                g og3 = new g(crossRoomPK, false);
                uof2 = new f(this$01.H.d().a().a(), false, 0, 0, 0, 30, null);
                e uoe7 = new e(this$01.Y2(true), og3, crossRoomPK, pK);
                VoicePartyAudienceCrossRoomPkController voicePartyAu6 = new VoicePartyAudienceCrossRoomPkController(str2, this$01.X2(), uoe2, uoe7, this$01.l, new l(this$01));
                this$01.x2(R.id.live_voice_party_content, obj6);
                goto label_047f ;
             }
             break;
           case 7:
             VoicePartyAudienceViewController$vcFactory$1 this$02 = ovcFactory$1.this$0;
             Objects.requireNonNull(obj1, "null cannot be cast to non-null type com.kuaishou.live.core.voiceparty.core.audience.AudienceGridChatParam");
             Objects.requireNonNull(this$02);
             voicePartyAu1 = PatchProxy.applyOneRefs(obj1, this$02, voicePartyAu, "11");
             if (voicePartyAu1 != patchProxyRe) {
                goto label_0b89 ;
             }else {
                a = e.a;
                Activity uActivity = this$02.B2();
                a uoa17 = this$02.H.b().d();
                f2 uof25 = this$02.H.b().l();
                m = this$02.m;
                b uob8 = this$02.H.b().k().c();
                c uoc12 = this$02.H.d().d();
                f uof10 = VoicePartyAudienceViewController.Z2(this$02, obj3, this, str2);
                d uod4 = this$02.H.d().a();
                g t og4 = this$02.H.e().l();
                LiveVoicePartyPlayViewService liveVoicePar = this$02.H.e().i();
                patchProxyRe2 = patchProxyRe;
                h oh4 = this$02.H.d().b();
                voicePartyAu2 = this$02.o;
                p1 = this$02.H.b().e();
                uoc2 = this$02.H.b().c().getChildFragmentManager();
                a.o(uoc2, str1);
                og1 = this$02.H.e().f();
                Objects.requireNonNull(a);
                if (PatchProxy.isSupport(uoe)) {
                   ovcFactory$12 = this$02;
                   Object[] objArray1 = new Object[16];
                   objArray1[0] = uActivity;
                   objArray1[1] = uoa17;
                   objArray1[i1] = uof25;
                   objArray1[3] = obj1;
                   objArray1[4] = m;
                   objArray1[5] = uob8;
                   objArray1[6] = uoc12;
                   objArray1[7] = uof10;
                   objArray1[8] = uod4;
                   objArray1[9] = og4;
                   objArray1[10] = liveVoicePar;
                   objArray1[11] = oh4;
                   objArray1[12] = voicePartyAu2;
                   objArray1[13] = p1;
                   objArray1[14] = uoc2;
                   objArray1[15] = og1;
                   p2 = uoc12;
                   obj7 = PatchProxy.apply(objArray1, a, uoe, "1");
                   patchProxyRe1 = patchProxyRe2;
                   if (obj7 != patchProxyRe1) {
                      voicePartyAu1 = obj7;
                   label_02d8 :
                      ovcFactory$12.x2(R.id.live_voice_party_grid_mode_container, voicePartyAu1);
                      goto label_0b89 ;
                   }
                }else {
                   p2 = uoc12;
                   ovcFactory$12 = this$02;
                   patchProxyRe1 = patchProxyRe2;
                }
                a.p(uActivity, "activity");
                a.p(uoa17, "liveBaseContext");
                a.p(uof25, "voicePartyContext");
                obj7 = "gridChatParam";
                a.p(obj1, obj7);
                a.p(m, "micSeatLongConnection");
                a.p(uof10, "micSeatPendantDependency");
                a.p(uod4, "micSeatDisplayConfig");
                a.p(og4, "liveStageManager");
                a.p(liveVoicePar, "livePlayViewService");
                uoa9 = p1;
                a.p(uoa9, "liveLongConnection");
                a.p(uoc2, "childFragmentManager");
                a.p(og1, "liveAudienceEventBusService");
                g og5 = og1;
                c uoc13 = uoc2;
                b uob9 = new b(3, obj1.a());
                uod2 = new d(m.a());
                a uoa18 = uoa9;
                LiveVoicePartyPlayViewService liveVoicePar1 = liveVoicePar;
                e$a uoa19 = e.d.a().b(c.b(m.a()));
                g og6 = og4;
                VoicePartyAudienceVideoViewController voicePartyAu7 = uoc2;
                og4 = PatchProxy.applyOneRefs(obj1, null, c.class, "3");
                if (og4 != patchProxyRe1) {
                }else {
                   a.p(obj1, obj7);
                   LiveStreamMessages$SCVoicePartyGridChatOpened micSeatDetai = obj1.b().micSeatDetailInfo;
                   if (micSeatDetai != null) {
                      ArrayList og41 = new ArrayList(micSeatDetai.length);
                      i = micSeatDetai.length;
                      int i4 = 0;
                      while (i4 < i) {
                         object oobject = micSeatDetai[i4];
                         a.o(oobject, "it");
                         og41.add(c.d(oobject));
                         i4 = i4 + 1;
                         micSeatDetai = micSeatDetai;
                      }
                      ol1 = new l(og41, obj1.b().micSeatsVersion);
                   }else {
                      ol1 = null;
                   }
                   og4 = t.just(ol1);
                   a.o(og4, "Observable.just\(versionDataList\)");
                }
                e uoe8 = obj7;
                f uof11 = new f(uod4.a(), false, null, null, null, 30, null);
                e uoe9 = new e(uof10, new g(VoicePartyPlayType.Grid, false), uoa19, MicSeatStyle.Video);
                a uoa20 = uoe9;
                uoa7 = new a(uob9);
                ot = uod2.d().map(b.b);
                t ot6 = ot;
                a.o(ot, "pendantDataSource.userMu¡­f\(\)\) { User\(it\) }\n      }");
                b uob10 = v25;
                b uob11 = new b(uActivity, 0x7f08110c, null, 4, null);
                CameraRequestApi uCameraReque2 = ot;
                this = uof25.y();
                a.o(this, "voicePartyContext.voicePartyId");
                CameraRequestApi uCameraReque3 = new CameraRequestApi(uActivity, m, new VoicePartyPlayTypeAudienceViewControllerFactory$createGridChatViewController$5(uoa17), this);
                VoicePartyAudienceVideoViewController voicePartyAu8 = new VoicePartyAudienceVideoViewController(uoa17, uof25, uoa19.b(og4).c(new VoicePartyPlayTypeAudienceViewControllerFactory$createGridChatViewController$1(uob8)).c(new VoicePartyPlayTypeAudienceViewControllerFactory$createGridChatViewController$2(p2)).c(new VoicePartyPlayTypeAudienceViewControllerFactory$createGridChatViewController$3(uof25)).a(), uoe8, uod2.c(), og6, uob9, GridLegacyLayoutConfigDelegate.c.a(), uoa20, a.a(uob8, oh4), ot6, uob10, liveVoicePar1, uCameraReque2, voicePartyAu2, uoa18, uoc13, og5);
                voicePartyAu1 = voicePartyAu7;
                goto label_02d8 ;
             }
             break;
           default:
             throw new IllegalArgumentException("create ViewController not unsupported for mode "+i);
       }
       return voicePartyAu1;
    }
    public Object invoke(Object p0,Object p1,Object p2){
       return this.invoke(p0.intValue(), p1, p2);
    }
}
