package bu2.l;
import im8.g;
import a51.c;
import bu2.l$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import co2.f2;
import com.kwai.library.widget.popup.common.c;
import com.kuaishou.live.core.voiceparty.d0;
import com.kuaishou.live.core.voiceparty.online.userlist.VoicePartyOnlineUser;
import y8c.g;
import java.lang.Integer;
import bs2.a;
import com.kuaishou.live.core.voiceparty.http.LiveVoicePartyApi;
import com.kwai.framework.model.user.UserInfo;
import brd.t;
import bu2.i;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import brd.x;
import bu2.g;
import sfc.a;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kwai.robust.PatchProxyResult;
import t02.r1;
import com.kuaishou.live.common.core.basic.baseinfo.QLivePushConfig;
import t02.a0;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import pp.d;
import com.kwai.framework.model.user.QCurrentUser;
import com.kuaishou.live.basic.api.LiveApiParams$AssistantType;
import bb1.o;
import com.kuaishou.live.core.voiceparty.micseats.mode.VoicePartyMicSeatData;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import qs2.r;
import bs2.d;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import com.kuaishou.live.core.voiceparty.playway.shared.model.MicSeatsDataManager;
import ok.x;
import bu2.l$a;
import z1.a;
import e17.i;
import java.lang.Boolean;
import bu2.e;
import bu2.h;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.feature.api.live.base.service.model.LiveStreamClickType;
import tx1.a;
import wj2.r0;
import bu2.p;
import java.util.Map;
import java.util.HashMap;
import bw2.a;
import qu2.d;
import qu2.a;

public class l extends c implements g	// class@000463
{
    public b A;
    public VoicePartyAudienceTeamPkJoinBattleDialogFragment B;
    public a$b C;
    public a D;
    public l$c E;
    public r1 v;
    public a0 w;
    public m x;
    public f2 y;
    public d z;
    public static String sLivePresenterClassName = "VoicePartyInviteOnlineUserPresenter";

    public void l(){
       super();
       this.E = new l$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, l.class, "23")) {
          return;
       }
       super.E8();
       this.y.s = this.E;
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, l.class, "24")) {
          return;
       }
       super.J8();
       d0.e(this.z);
       d0.e(this.A);
       return;
    }
    public void S8(VoicePartyOnlineUser p0,g p1,int p2){
       if (PatchProxy.isSupport(l.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, l.class, "8")) {
          return;
       }
       if (this.w != null) {
          this.X7(LiveVoicePartyApi.b().b0(this.getLiveStreamId(), this.y.y(), p0.mApplyUserInfo.mId).subscribe(new i(p0, p1, p2)));
       }else {
          this.X7(LiveVoicePartyApi.b().t0(this.getLiveStreamId(), this.y.y(), p0.mApplyUserInfo.mId).compose(this.P8()).subscribe(new g(this, p0, p1, p2), new a()));
       }
       return;
    }
    public final CDNUrl[] V8(){
       l obj = PatchProxy.apply(null, this, l.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.v;
       if (obj != null) {
          r1 f = obj.f;
          if (f != null) {
             return f.getCoverThumbnailUrls();
          }
       }
       obj = this.w;
       if (obj != null) {
          a0 c = obj.c;
          if (c != null) {
             LiveStreamFeedWrapper mEntity = c.mEntity;
             if (mEntity != null) {
                return r1.F0(mEntity);
             }
          }
       }
       return null;
    }
    public final d W8(){
       l tv = this.v;
       a0 h2 = (tv == null)? this.w.H2: tv.w1;
       return h2;
    }
    public final t X8(String p0,int p1){
       LiveApiParams$AssistantType obj;
       l ol = l.class;
       if (PatchProxy.isSupport(ol)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, ol, "20");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       ol = this.w;
       if (ol != null) {
          obj = ol.b2.d(QCurrentUser.me().getId());
          if (obj != null && obj.isAdmin()) {
             return LiveVoicePartyApi.b().R(this.getLiveStreamId(), this.y.y(), p0, p1);
          }
       }
       return LiveVoicePartyApi.b().e0(this.getLiveStreamId(), this.y.y(), p0, p1);
    }
    public final t Y8(String p0,VoicePartyMicSeatData p1,int p2){
       if (PatchProxy.isSupport(l.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, l.class, "15");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = 0;
       String str = (p1 == null)? null: p1.mId;
       if (p2 != 1) {
          if (p2 != 2) {
             if (p2 != 3) {
                this.W8().h(LiveVoicePartyLogTag.ANCHOR, "getInviteUserObservable onDefault");
                return this.X8(p0, i);
             }else {
                return this.Z8(p0, 2);
             }
          }else {
             return this.Z8(p0, 1);
          }
       }else if(p1 == null){
          return this.X8(p0, str);
       }else if(this.y.h() == 5){
          if (r.h(p1.mMicSeatTypes)) {
             return this.Z8(p0, 1);
          }else if(r.c(p1.mMicSeatTypes)){
             return this.Z8(p0, 2);
          }
       }
       return this.X8(p0, str);
    }
    public final t Z8(String p0,int p1){
       l ol = l.class;
       if (PatchProxy.isSupport(ol)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, ol, "21");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.v != null) {
          return LiveVoicePartyApi.d().g(this.getLiveStreamId(), this.y.y(), this.y.r(), p0, p1);
       }else {
          return LiveVoicePartyApi.d().d(this.getLiveStreamId(), this.y.y(), this.y.r(), p0, p1);
       }
    }
    public ClientContent$LiveStreamPackage a9(){
       Object obj = PatchProxy.apply(null, this, l.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.x.a();
    }
    public final MicSeatsDataManager b9(){
       MicSeatsDataManager obj = PatchProxy.apply(null, this, l.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.v == null)? this.y.r.get(): this.y.q.get();
       return obj;
    }
    public final void c9(){
       if (PatchProxy.applyVoid(null, this, l.class, "11")) {
          return;
       }
       if (this.C == null) {
          this.C = new l$a(this);
       }
       return;
    }
    public void d9(VoicePartyMicSeatData p0,String p1,int p2,a p3){
       if (PatchProxy.isSupport(l.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, this, l.class, "9")) {
          return;
       }
       MicSeatsDataManager micSeatsData = this.b9();
       if (micSeatsData != null && micSeatsData.t(p1)) {
          this.W8().i(LiveVoicePartyLogTag.ANCHOR, "requestInviteUser block ,because user is singing", "inviteUserId ", p1);
          i.a(R.style.arg_RES_7f11066a, 0x7f102e60);
          if (p3 != null) {
             p3.accept(Boolean.FALSE);
          }
          return;
       }else {
          this.X7(this.Y8(p1, p0, p2).compose(this.P8()).doOnError(new e(p3)).subscribe(new h(this, p1, p2, p3), new a()));
          return;
       }
    }
    public void e9(UserInfo p0,int p1){
       l ol = l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, ol, "22")) {
          return;
       }
       ol = this.v;
       if (ol != null) {
          ol.Z.g3(new UserProfile(p0), LiveStreamClickType.VOICE_PARTY, 18, p1);
       }else {
          this.w.U.w0(new UserProfile(p0), LiveStreamClickType.VOICE_PARTY, 18, false, p1);
       }
       return;
    }
    public final String getLiveStreamId(){
       Object obj = PatchProxy.apply(null, this, l.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.x.getLiveStreamId();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, l.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new p();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, l.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(l.class, new p());
       }else {
          obj.put(l.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, l.class, "1")) {
          return;
       }
       this.v = this.s8(r1.class);
       this.w = this.s8(a0.class);
       this.x = this.r8("LIVE_BASIC_CONTEXT");
       this.y = this.q8(f2.class);
       this.D = new a(new d(this.x), this.y);
       return;
    }
}
