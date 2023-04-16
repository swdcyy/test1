package com.kuaishou.live.audience.component.chat.single.a;
import com.kwai.video.waynelive.listeners.LivePlayerEventListener;
import qr5.b$a;
import com.kuaishou.live.audience.component.chat.single.BaseLiveAudienceSingleChatPresenter;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveChatGuestGiftInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import xd1.g;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import yd1.b;
import lp3.i;
import ga1.e;
import lp3.c;
import com.kwai.video.waynelive.LivePlayerController;
import com.kwai.video.waynelive.ILivePlayerStatusMonitor;
import qr5.b;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveFlvStreamMessage;
import rd1.o;
import com.kuaishou.android.live.log.LiveLogTag;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveChatSyncMessage;
import java.lang.Integer;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.component.chat.model.ChatInfo;
import com.kuaishou.live.common.core.component.chat.model.ChatInfo$RoleType;
import ae1.a;
import com.kwai.framework.model.user.UserInfo;
import android.text.TextUtils;
import android.content.res.Configuration;
import android.view.View;
import dp3.g;
import aq5.d;
import aq5.a;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import yd1.p;
import jq5.a;
import fp3.d;
import android.content.res.Resources;
import android.app.Activity;
import com.kuaishou.live.audience.component.chat.single.a$a;
import yd1.t;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import xp5.i;
import zd1.f;
import zd1.b;
import tx0.a;
import ok.x;
import zd1.b$a;
import zd1.g;
import zd1.a;
import xp5.g;
import tx0.c;
import yd1.m;
import com.airbnb.lottie.LottieAnimationView;
import u71.c;
import com.kuaishou.live.core.show.chat.model.LiveMultiChatGuestWidgetConfig;
import u71.a;
import o91.c;
import com.kuaishou.live.camerahost.view.LiveCameraView;
import java.util.Map;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveChatViewPostionMessage;
import tx0.e;
import java.lang.Runnable;
import e93.f;
import java.lang.Throwable;
import java.nio.ByteBuffer;
import ox0.o;
import java.lang.Float;
import tx0.b;

public class a extends BaseLiveAudienceSingleChatPresenter implements LivePlayerEventListener, b$a	// class@000a8f
{
    public b O;
    public a P;
    public boolean Q;
    public static String sLivePresenterClassName = "LiveAudienceSingleChatPresenter";

    public void a(){
       super();
       this.Q = false;
    }
    public void C5(LiveStreamMessages$SCLiveChatGuestGiftInfo p0,boolean p1){
       g a;
       String str1;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "3")) {
          return;
       }
       uoa = this.O;
       if (uoa != null && p1) {
          a = g.a;
          Objects.requireNonNull(a);
          String str = PatchProxy.applyOneRefs(p0, a, g.class, "2");
          if (str != PatchProxyResult.class) {
          }else {
             a.p(p0, "guestGiftInfo");
             if (TextUtils.x(p0.displayKsCoin)) {
                str1 = "0";
             }else {
                p0 = p0.displayKsCoin;
                a.o(p0, "guestGiftInfo.displayKsCoin");
             }
             str = str1;
          }
          uoa.j(str);
          this.O.l(true);
       }
       return;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       super.E8();
       LivePlayerController livePlayerCo = this.S8().a(e.class).Vc();
       boolean b = true;
       if (livePlayerCo.getCurrentLiveStreamType() != b) {
          b = false;
       }
       this.Q = b;
       livePlayerCo.addLiveEventListener(this);
       this.S8().a(b.class).oi(this);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       super.J8();
       a tO = this.O;
       if (tO != null) {
          tO.s();
       }
       this.S8().a(e.class).Vc().removeLiveEventListener(this);
       this.S8().a(b.class).j8(this);
       return;
    }
    public void O7(LiveFlvStream$LiveFlvStreamMessage p0){
       o oo = o.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "21")) {
          return;
       }
       LiveLogTag cHAT = LiveLogTag.CHAT;
       LiveFlvStream$LiveFlvStreamMessage chatStatusSy = p0.chatStatusSync;
       String str = "null";
       String str1 = (chatStatusSy == null)? str: chatStatusSy.guestId;
       String str2 = (chatStatusSy == null)? str: Integer.valueOf(chatStatusSy.liveChatRoomId);
       b.d0(cHAT, "acceptData", "guestId", str1, "liveChatRoomId", str2);
       ChatInfo uChatInfo = this.S8().a(oo).p();
       LiveFlvStream$LiveFlvStreamMessage chatStatusSy1 = p0.chatStatusSync;
       if (chatStatusSy1 != null && chatStatusSy1.isConnected == null) {
          LiveFlvStream$LiveChatSyncMessage liveChatRoom = chatStatusSy1.liveChatRoomId;
          if (liveChatRoom != null && (uChatInfo != null && (uChatInfo.b == ChatInfo$RoleType.AUDIENCE && (uChatInfo.k == liveChatRoom && (uChatInfo.d() != null && (uChatInfo.d().e != null && TextUtils.equals(uChatInfo.d().e.mId, p0.chatStatusSync.guestId))))))) {
             this.S8().a(oo).close(11);
          }
       }
    label_0083 :
       return;
    }
    public int T7(){
       return 1;
    }
    public void W8(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "6")) {
          return;
       }
       a tO = this.O;
       if (tO != null && tO.getView().isShown()) {
          this.O.v(this.X8(p0));
       }
       super.W8(p0);
       return;
    }
    public void Y8(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       super.Y8();
       this.S8().a(o.class).close(7);
       return;
    }
    public void Yd(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "10")) {
          return;
       }
       super.Yd(p0);
       if (!PatchProxy.applyVoid(null, this, uoa, "15") && this.O != null) {
          b.Z(LiveLogTag.CHAT, "hideSmallScreen");
          d uod = this.S8().a(d.class);
          int i = 2;
          a[] uoaArray = new a[i];
          uoaArray[0] = AudienceBizRelation.CHAT_VIDEO_VIEW;
          AudienceBizRelation cHAT_VIDEO_S = (this.S8().a(o.class).p().d().f == i)? AudienceBizRelation.CHAT_VIDEO_STATUS_VIEW: AudienceBizRelation.CHAT_AUDIO_STATUS_VIEW;
          uoaArray[1] = cHAT_VIDEO_S;
          uod.Jh(uoaArray);
          this.Q = false;
          this.P = null;
          this.O.s();
          this.V8(0, 1, null);
       }
       return;
    }
    public final b Z8(){
       Object[] objArray = null;
       BaseLiveAudienceSingleChatPresenter obj = PatchProxy.apply(objArray, this, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.O == null) {
          this.O = new p();
          this.S8().a(a.class).P(this.O);
          obj = this.w;
          Configuration configuratio = (obj != null && obj.getResources() != null)? this.w.getResources().getConfiguration(): objArray;
          this.O.v(this.X8(configuratio));
          this.O.p(new a$a(this));
          obj = this.v;
          if (obj != null) {
             this.C5(obj, this.R8());
          }
          if (!PatchProxy.applyVoid(objArray, this, BaseLiveAudienceSingleChatPresenter.class, "30")) {
             obj = this.u;
             if (obj == null) {
                a.S("mLogPackageProvider");
             }
             f.g(obj.a());
             if (this.C == null) {
                this.C = new b(new a(this), this);
                obj = this.q;
                if (obj == null) {
                   a.S("serviceManager");
                }
                c uoc = obj.a(g.class);
                a.o(uoc, "serviceManager.getServic¡­ollowService::class.java\)");
                BaseLiveAudienceSingleChatPresenter tC = this.C;
                if (tC != null) {
                   objArray = tC.e;
                }
                uoc.hg(objArray);
                uoc.Pf();
                BaseLiveAudienceSingleChatPresenter tt = this.t;
                if (tt == null) {
                   a.S("mLiveInfoManager");
                }
                uoc.Di(tt.getLiveStreamId(), false);
             }
          }
       }
    label_00be :
       return this.O;
    }
    public final void a9(boolean p0,a p1){
       o oo = o.class;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoa, "16")) {
          return;
       }
       AudienceBizRelation cHAT_VIDEO_S = (p0)? AudienceBizRelation.CHAT_VIDEO_STATUS_VIEW: AudienceBizRelation.CHAT_AUDIO_STATUS_VIEW;
       a[] uoaArray = new a[]{cHAT_VIDEO_S,AudienceBizRelation.CHAT_VIDEO_VIEW};
       if (this.S8().a(d.class).L8(uoaArray)) {
          b.Z(LiveLogTag.CHAT, "showSmallScreen");
          if (PatchProxy.isSupport(uoa) && (!PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoa, "17") && (this.S8().a(oo).p() != null && p1 != null))) {
             b uob = this.Z8();
             uob.g(false, p0, 3, p1, new c(uob));
             this.V8(1, 1, uob);
             BaseLiveAudienceSingleChatPresenter tC = this.C;
             if (tC != null) {
                tC.e(this.S8().a(g.class));
                this.C.a();
                this.C.f(p1.e, uob.m());
             }
          }
       }else {
          b.Z(LiveLogTag.CHAT, "showSmallScreen biz not compatible");
          this.S8().a(oo).close(15);
       }
       return;
    }
    public a bi(c p0,LiveMultiChatGuestWidgetConfig p1){
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "11");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       return this.S8().a(c.class).hh(p0, this.Z8().y());
    }
    public void d8(ChatInfo p0){
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "9")) {
          return;
       }
       if (p0.b == ChatInfo$RoleType.AUDIENCE && p0.b().size() > 0) {
          a uoa1 = p0.d();
          boolean b = (uoa1.f == 2)? true: false;
          if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(b), uoa1, this, uoa, "14")) {
             b.Z(LiveLogTag.CHAT, "onLiveChatWithGuestReady");
             if (!b) {
                this.a9(false, uoa1);
             }else {
                this.P = uoa1;
             }
          }
       }
    label_004a :
       return;
    }
    public String getTag(){
       return "LiveAudienceChatComponent";
    }
    public void onLiveEventChange(byte[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "19")) {
          return;
       }
       try{
          LiveFlvStream$LiveFlvStreamMessage liveFlvStrea = LiveFlvStream$LiveFlvStreamMessage.parseFrom(p0);
          if (liveFlvStrea != null && liveFlvStrea.messageType == 12) {
             LiveFlvStream$LiveFlvStreamMessage chatViewPosi = liveFlvStrea.chatViewPosition;
             if (chatViewPosi == null || !chatViewPosi.chatViewPositionWidth - null) {
             label_002e :
                return;
             }else {
                f.i("updateChatViewPosition", new e(this, liveFlvStrea), this);
             }
          }else {
             goto label_002e ;
          }
       }catch(com.google.protobuf.nano.InvalidProtocolBufferNanoException e3){
          b.I(LiveLogTag.CHAT, "parse flv message pb failed", e3);
       }
       return;
    }
    public void onLiveTypeChange(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "20")) {
          return;
       }
       if (1 == p0) {
          this.Q = true;
       }
       super.onLiveTypeChange(p0);
       return;
    }
    public void pe(a p0,ByteBuffer p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(a.class)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, a.class, "12")) {
             return;
          }
       }
       this.B.b(p1, p2, p3, p4);
       return;
    }
    public void t3(float p0,a p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), p1, this, uoa, "7")) {
          return;
       }
       b uob = this.Z8();
       uob.g(false, p1.b(), 1, p1, new b(uob));
       this.V8(true, false, uob);
       return;
    }
    public boolean z1(int p0){
       boolean b = (11 == p0)? true: false;
       return b;
    }
}
