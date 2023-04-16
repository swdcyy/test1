package com.kuaishou.live.core.show.comments.f;
import im8.g;
import k51.c;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Class;
import java.lang.String;
import com.kuaishou.live.basic.utils.b;
import com.kuaishou.live.common.core.component.comments.model.PurchaseInfoMessage;
import com.kuaishou.live.common.core.component.comments.model.LiveFansGroupJoinMessage;
import com.kuaishou.live.common.core.component.comments.model.LiveFansTopHelpBuyMessage;
import com.kuaishou.live.common.core.component.follow.FollowAnchorMessage;
import com.kuaishou.live.common.core.component.redpacket.SendRedPacketMessage;
import com.kuaishou.live.common.core.component.redpacket.redpacket.GrabRedPacketMessage;
import com.kuaishou.live.common.core.component.comments.model.LiveGzoneCommonMessage;
import com.kuaishou.live.common.core.component.comments.model.LiveFellowRedPackSendPacketMessage;
import com.kuaishou.live.common.core.component.comments.model.LiveFellowRedPacketGrabPacketMessage;
import com.kuaishou.live.core.show.enterroom.model.EnterRoomMessage;
import com.kuaishou.live.common.core.component.comments.model.RichTextMessageOld;
import com.kuaishou.live.common.core.component.chat.LiveChatWithGuestApplyMessage;
import com.kuaishou.live.common.core.component.comments.model.LiveAdConversionTaskMessage;
import java.lang.Object;
import java.util.List;
import java.util.Arrays;
import com.kuaishou.live.common.core.component.comments.display.e;
import n52.b;
import re1.h;
import re1.k;
import java.util.ArrayList;
import com.kuaishou.live.core.show.comments.b;
import n52.c;
import s93.v;
import n52.j;
import com.kuaishou.live.core.show.comments.f$a;
import com.kuaishou.live.core.show.comments.f$b;
import com.kuaishou.live.common.core.component.comments.mock.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.materialresource.LiveMaterialResourceManager;
import android.app.Application;
import o56.a;
import wkd.b;
import c0d.a;
import android.content.Context;
import msd.a;
import com.kuaishou.live.materialresource.MaterialResourceManagerUpdateStrategyKt;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.live.base.service.scenetype.LiveSceneType;
import p91.m;
import n52.o;
import ds5.c;
import ds5.a;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCForbidComment;
import n52.h;
import lf3.g;
import hf3.a;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCForbidCommentRecover;
import n52.i;
import com.kuaishou.livestream.message.nano.SCActionSignal;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCFeedPush;
import ne1.k;
import n52.f;
import com.kuaishou.livestream.message.nano.SCCommentZoneRichText;
import n52.g;
import com.kuaishou.protobuf.livestream.nano.SCLiveNobleForbiddenProtectNotice;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveCommonNotice;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import da1.a;
import com.kuaishou.live.common.core.component.comments.fluency.quick.a;
import lp3.c;
import lp3.i;
import java.util.Objects;
import n52.a;
import z1.i;
import ry1.b;
import brd.t;
import re1.i;
import re1.j;
import erd.g;
import crd.b;
import ekd.k1;
import com.kuaishou.live.common.core.component.comments.fluency.b;
import java.util.Collection;
import ekd.q;
import k12.d;
import java.util.Iterator;
import com.kuaishou.live.basic.model.QLiveMessage;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.model.user.User;
import va1.a0;
import com.kuaishou.live.core.show.gift.GiftMessage;
import qx1.a;
import com.kuaishou.live.common.core.component.comments.model.LiveShareMessage;
import java.util.LinkedList;
import com.kuaishou.live.common.core.component.like.LikeMessage;
import com.kuaishou.live.common.core.component.comments.combo.ComboCommentMessage;
import com.kuaishou.live.common.core.component.comments.model.SystemNoticeMessage;
import com.kuaishou.live.common.core.component.comments.display.CommentMessageQueueType;
import oe1.j;
import com.kuaishou.live.common.core.component.comments.display.LiveCommentsDisplayControllerV2;
import android.app.Activity;
import g81.c;
import lp3.e;
import pe1.b;
import com.kuaishou.live.common.core.component.comments.display.c;
import w51.a;
import java.util.Collections;
import ne1.g;
import hx1.a;
import hx1.c;
import com.kuaishou.android.live.model.QLivePlayConfig;
import xp5.a;
import u53.b;
import com.kuaishou.live.common.core.component.topbar.topuser.LiveAudienceRankChangeMessage;
import lnc.a1;
import com.kuaishou.live.common.core.component.comments.parser.LiveCommentsMocker;
import n91.f;
import n52.d;
import java.lang.Runnable;
import n52.s;
import java.util.Map;
import java.util.HashMap;
import ds5.e;
import as3.a;
import sr5.a;
import lf1.q;
import ft5.b;
import i81.g;
import uf1.a;

public class f extends c implements g	// class@000a61
{
    public q A;
    public a B;
    public a C;
    public g D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public e I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public b N;
    public h O;
    public k P;
    public b Q;
    public boolean R;
    public final List S;
    public b T;
    public final g U;
    public d U0;
    public final g V;
    public final g V0;
    public long W;
    public h W0;
    public g X;
    public t X0;
    public g Y;
    public v Z;
    public final String p;
    public final List q;
    public a r;
    public a s;
    public m t;
    public j u;
    public c v;
    public i w;
    public g x;
    public e y;
    public a z;
    public static final String Y0;
    public static String sLivePresenterClassName;

    static {
       f.Y0 = b.a(UserInfo.class);
    }
    public void f(){
       super();
       this.p = "LiveCommentsFeedPresenter";
       Class[] uClassArray = new Class[13];
       uClassArray[0] = PurchaseInfoMessage.class;
       uClassArray[1] = LiveFansGroupJoinMessage.class;
       uClassArray[2] = LiveFansTopHelpBuyMessage.class;
       uClassArray[3] = FollowAnchorMessage.class;
       uClassArray[4] = SendRedPacketMessage.class;
       uClassArray[5] = GrabRedPacketMessage.class;
       uClassArray[6] = LiveGzoneCommonMessage.class;
       uClassArray[7] = LiveFellowRedPackSendPacketMessage.class;
       uClassArray[8] = LiveFellowRedPacketGrabPacketMessage.class;
       uClassArray[9] = EnterRoomMessage.class;
       uClassArray[10] = RichTextMessageOld.class;
       uClassArray[11] = LiveChatWithGuestApplyMessage.class;
       uClassArray[12] = LiveAdConversionTaskMessage.class;
       this.q = Arrays.asList(uClassArray);
       this.E = false;
       this.F = false;
       this.I = new e();
       this.J = false;
       this.N = new b();
       this.O = new h();
       this.P = new k();
       this.R = true;
       this.S = new ArrayList();
       this.U = new b(this);
       this.V = new c(this);
       this.Z = new v();
       this.V0 = new j(this);
       this.W0 = new f$a(this);
       this.X0 = new f$b(this);
       this.U7(new c());
       LiveMaterialResourceManager h = LiveMaterialResourceManager.h;
       h.c(a.b(), b.a(0x1a7467ca));
       h.d(MaterialResourceManagerUpdateStrategyKt.a());
    }
    public void E8(){
       f uof = f.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uof, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uof, "4")) {
          if (this.t.u5() == LiveSceneType.Audience && this.y != null) {
             this.R8(1);
             this.y.gd(new o(this));
          }else {
             this.R8(false);
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, uof, "7")) {
          this.s.u0(414, LiveStreamMessages$SCForbidComment.class, new h(this));
          this.s.u0(416, LiveStreamMessages$SCForbidCommentRecover.class, new i(this));
          this.s.u0(510, SCActionSignal.class, this.V);
          this.s.u0(310, LiveStreamMessages$SCFeedPush.class, this.U);
          if (k.l()) {
             f uof1 = new f(this);
             this.X = uof1;
             this.s.u0(829, SCCommentZoneRichText.class, uof1);
          }
          g og = new g(this);
          this.Y = og;
          this.s.u0(851, SCLiveNobleForbiddenProtectNotice.class, og);
          this.s.u0(964, LiveStreamMessages$SCLiveCommonNotice.class, this.V0);
       }
       if (!PatchProxy.applyVoid(objArray, this, uof, "23")) {
          b.Z(LiveLogTag.COMMENT, "createDefaultLiveDataBundleConverter");
          a uoa1 = a.b();
          this.C = uoa1;
          uoa1.a(20);
          this.C.e(4);
          this.C.e(5);
          this.C.a(18);
          this.C.a(19);
       }
       if (this.t.u5() == LiveSceneType.Audience) {
          uof = this.N;
          a uoa = this.w.a(a.class);
          Objects.requireNonNull(uof);
          if (!PatchProxy.applyVoidOneRefs(uoa, uof, b.class, "1")) {
             uoa.l8(1, new a(uof));
          }
          uof = this.P;
          b uob = this.w.a(b.class);
          Objects.requireNonNull(uof);
          if (!PatchProxy.applyVoidOneRefs(uob, uof, k.class, "1")) {
             uob.W().subscribe(new i(uof), j.b);
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, f.class, "3")) {
          return;
       }
       b.Z(LiveLogTag.COMMENT, "initLiveCommentsDisplayController -- onUnbind");
       this.s.o(310, this.U);
       this.s.o(510, this.V);
       this.s.o(964, this.V0);
       f tX = this.X;
       if (tX != null) {
          this.s.o(829, tX);
       }
       this.s.o(851, this.Y);
       if (this.t.u5() == LiveSceneType.Audience) {
          tX = this.N;
          a uoa = this.w.a(a.class);
          Objects.requireNonNull(tX);
          if (!PatchProxy.applyVoidOneRefs(uoa, tX, b.class, "2")) {
             uoa.be(1);
             tX.a = false;
          }
       }
       k1.n(this);
       this.S.clear();
       tX = this.Q;
       if (tX != null) {
          tX.a();
       }
       this.I.clear();
       this.E = false;
       this.G = 0;
       this.H = 0;
       this.F = false;
       this.J = false;
       return;
    }
    public final void P8(Collection p0){
       int b;
       Iterator iterator;
       f uof;
       Collection uCollection;
       int i = this;
       Iterator obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, i, f.class, "6")) {
          return;
       }
       if (q.f(p0)) {
          return;
       }
       if (i.t.e()) {
          f u0 = i.U0;
          if (u0 != null) {
             u0.a(obj);
          }
       }
       int i1 = 15;
       obj = p0.iterator();
       List list = null;
       List list1 = null;
       List list2 = null;
       List list3 = null;
       List list4 = null;
       List list5 = null;
       int i2 = 0;
       while (obj.hasNext()) {
          QLiveMessage qLiveMessage = obj.next();
          if (v14 = qLiveMessage instanceof FollowAnchorMessage) {
             QLiveMessage obj1 = PatchProxy.applyOneRefs(qLiveMessage, i, f.class, "27");
             if (obj1 != PatchProxyResult.class) {
                b = obj1.booleanValue();
             }else if(i.M != null && (v14 && (i.t.I().isFollowingOrFollowRequesting() && !a0.g(qLiveMessage)))){
                b = true;
             }else {
                b = false;
             }
             if (b) {
                iterator = obj;
             }else {
             label_0073 :
                v13 = qLiveMessage instanceof EnterRoomMessage;
                if (b) {
                   obj1 = qLiveMessage;
                   if (!i.t.e()) {
                      iterator = obj;
                      if (obj1.mSource == 10) {
                         obj1.mSource = i2;
                      }
                   }else {
                   label_008d :
                      iterator = obj;
                   }
                }else {
                   goto label_008d ;
                }
                if (!a0.g(qLiveMessage) && (qLiveMessage instanceof GiftMessage && (i.t.u5() != LiveSceneType.Escrow && i.w.a(a.class).g6(5, String.valueOf(qLiveMessage.mGiftId))))) {
                   b.c0(LiveLogTag.LIVE_SERVER_SIGNAL_BLOCK, "LiveCommentsFeedPresenter ServerSignalBlocked", "data", qLiveMessage.toString());
                }else if(i.J == null){
                   if (!b && (!qLiveMessage instanceof LiveShareMessage && (!v14 && (qLiveMessage instanceof LiveFansGroupJoinMessage || i.X8(qLiveMessage))))) {
                      if (list4 == null) {
                         list4 = new LinkedList();
                      }
                      list4.add(qLiveMessage);
                   }
                }else if(!a0.g(qLiveMessage)){
                   if (qLiveMessage instanceof GiftMessage) {
                      if (list1 == null) {
                         list1 = new LinkedList();
                      }
                      list1.add(qLiveMessage);
                   }else if(qLiveMessage instanceof LiveShareMessage){
                      if (list2 == null) {
                         list2 = new LinkedList();
                      }
                      list2.add(qLiveMessage);
                   }else if(qLiveMessage instanceof LikeMessage){
                      if (list3 == null) {
                         list3 = new LinkedList();
                      }
                      list3.add(qLiveMessage);
                   }else if(i.q.contains(qLiveMessage.getClass())){
                      if (list4 == null) {
                         list4 = new LinkedList();
                      }
                      list4.add(qLiveMessage);
                   }else if(i.X8(qLiveMessage)){
                      if (list4 == null) {
                         list4 = new LinkedList();
                      }
                      list4.add(qLiveMessage);
                   }
                }
                if (qLiveMessage instanceof ComboCommentMessage) {
                   if (list5 == null) {
                      list5 = new LinkedList();
                   }
                   qLiveMessage.setContent(qLiveMessage.getContent());
                   list5.add(qLiveMessage);
                }else if(list == null){
                   list = new LinkedList();
                }
                if (qLiveMessage instanceof SystemNoticeMessage || a0.g(qLiveMessage)) {
                   list.add(qLiveMessage);
                }else {
                   int i3 = i1 - 1;
                   if (i1 > 0) {
                      list.add(qLiveMessage);
                   }
                   i1 = i3;
                }
             }
          }else {
             goto label_0073 ;
          }
          obj = iterator;
       }
       if (!q.f(list)) {
          i.G = i.G + list.size();
          i.I.h(list);
          uof = 1;
       }else {
          uof = null;
       }
       if (q.f(null)) {
          if (!q.f(list1)) {
             i.G = i.G + list1.size();
             i.I.f(CommentMessageQueueType.GIFT, list1);
             uof = 1;
             i1 = 1;
          }else {
             i1 = 0;
          }
          if (!q.f(list2)) {
             i.G = i.G + list2.size();
             i.I.f(CommentMessageQueueType.SHARE, list2);
             uof = 1;
             i1 = 1;
          }
          if (!q.f(list3)) {
             i.G = i.G + list3.size();
             i.I.f(CommentMessageQueueType.LIKE, list3);
             uof = 1;
             i1 = 1;
          }
          if (!q.f(list4)) {
             i.G = i.G + list4.size();
             i.I.f(CommentMessageQueueType.OTHER, list4);
             uof = 1;
             uCollection = null;
             b = 1;
          }else {
             b = i1;
             uCollection = null;
          }
          if (q.f(uCollection)) {
             if (b) {
                i.I.b();
             }
             if (uof != null) {
                uof = i.I;
                if (list != null) {
                   i2 = list.size();
                }
                uof.d(i2);
             }
             if (!q.f(list5)) {
                i.H = i.H + list5.size();
                if (!PatchProxy.applyVoidOneRefs(list5, i, f.class, "19")) {
                   uof = i.u;
                   if (uof != null) {
                      uof.c(list5);
                   }
                }
             }
             return;
          }else {
             throw null;
          }
       }else {
          throw null;
       }
    }
    public final void R8(boolean p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uof, "5")) {
          return;
       }
       if (this.L != null) {
          return;
       }
       this.L = true;
       this.K = p0;
       if (p0) {
          b.Z(LiveLogTag.COMMENT, "initLiveCommentsDisplayController, V2");
          this.I.i(new LiveCommentsDisplayControllerV2(this.getActivity(), this.t.I(), this.v, this.w));
       }else {
          b.Z(LiveLogTag.COMMENT, "initLiveCommentsDisplayController, V1");
          this.I.i(new c(this.getActivity(), this.t.I(), this.v, this.w));
       }
       return;
    }
    public void S8(QLiveMessage p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "17")) {
          return;
       }
       if (a.C()) {
          return;
       }
       List list = Collections.singletonList(p0);
       f tD = this.D;
       if (tD != null) {
          tD.a(list);
       }
       this.a9(list);
       if (this.t.u5() == LiveSceneType.Audience) {
          c.b(this.w.a(a.class), list);
          this.N.a(p0);
       }
       this.P8(list);
       return;
    }
    public final boolean V8(QLivePlayConfig p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && b.d(this.t.t5()).b())? true: false;
       return b;
    }
    public final boolean W8(QLivePlayConfig p0){
       boolean b = (p0 != null && p0.mIsShopLive != null)? true: false;
       return b;
    }
    public final boolean X8(QLiveMessage p0){
       boolean b = (p0 instanceof LiveAudienceRankChangeMessage && p0.isNeedFold != null)? true: false;
       return b;
    }
    public final void Y8(LiveStreamMessages$SCForbidComment p0,boolean p1){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uof, "14")) {
          return;
       }
       this.E = true;
       if (p1) {
          int i = (p0.operatorType == true)? 0x7f102855: 0x7f102854;
          String[] stringArray = this.Z8(a1.p(i));
          if (stringArray.length > 1) {
             this.S8(LiveCommentsMocker.f(stringArray[0], stringArray[1]));
          }
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, uof, "15")) {
          this.W = p0.duration + this.w.a(f.class).s();
       }
       k1.s(new d(this), this, p0.duration);
       return;
    }
    public final String[] Z8(String p0){
       String[] obj = PatchProxy.applyOneRefs(p0, this, f.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.split("£º");
       if (obj.length <= 1) {
          obj = p0.split(": ");
       }
       return obj;
    }
    public final void a9(Collection p0){
       String y0;
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "28")) {
          return;
       }
       if (q.f(p0)) {
          return;
       }
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          UserInfo user = iterator.next().getUser();
          if (user != null) {
             y0 = f.Y0;
             Object obj = PatchProxy.applyTwoRefs(user, y0, null, b.class, "4");
             b = (obj != PatchProxyResult.class)? obj.booleanValue(): b.b(user, y0, false);
             if (b) {
                continue ;
             }
          }
          b.c(user, y0, true);
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new s();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, f.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(f.class, new s());
       }else {
          obj.put(f.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       this.y = this.t8("LIVE_PLAY_CONFIG_SERVICE");
       this.z = this.t8("LIVE_MERCHANT_PLAY_CALLER_CONTEXT");
       this.r = this.t8("LIVE_PLAY_CALLER_CONTEXT");
       this.s = this.r8("LIVE_LONG_CONNECTION");
       this.t = this.r8("LIVE_BASIC_CONTEXT");
       this.u = this.t8("LIVE_COMBO_COMMENT_SERVICE");
       this.v = this.q8(c.class);
       this.A = this.s8(q.class);
       this.w = this.r8("LIVE_SERVICE_MANAGER");
       this.T = this.t8("LIVE_AUDIENCE_SEND_COMMENTS_SERVICE");
       this.U0 = this.s8(d.class);
       this.x = this.w.a(g.class);
       this.B = this.w.c(a.class);
       return;
    }
}
