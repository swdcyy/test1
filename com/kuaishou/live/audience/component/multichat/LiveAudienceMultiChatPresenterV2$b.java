package com.kuaishou.live.audience.component.multichat.LiveAudienceMultiChatPresenterV2$b;
import lp1.d;
import ip1.a;
import com.kuaishou.live.audience.component.multichat.LiveAudienceMultiChatPresenterV2;
import java.lang.Object;
import z11.a;
import com.kwai.framework.model.user.User;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lp3.i;
import xp5.g;
import lp3.c;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import xp5.i;
import androidx.fragment.app.c;
import rp5.a;
import java.lang.Boolean;
import pg1.e;
import t02.a0;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import erd.g;
import com.kuaishou.live.livestage.videopipe.renderarea.ui.RenderAreaView;
import com.kwai.framework.model.user.UserInfo;
import n91.e;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.feature.api.live.base.service.model.LiveStreamClickType;
import fe3.a;
import android.view.ViewGroup;
import androidx.lifecycle.LiveData;
import a21.b;
import android.app.Activity;
import k2b.e0;
import java.util.Map;
import com.kuaishou.live.jsbridge.LiveKrnPageKey;
import p63.a;
import oa1.a;
import o63.d;
import oa1.b;
import o63.a;
import msd.l;
import android.view.View;
import mw1.c;
import mp1.c;
import rd1.d;
import ne1.d;
import ox0.l;
import wp1.c;
import wp1.b;
import a21.a;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.a;
import wp1.a;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import rd1.c0;
import lu7.f;
import aq5.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.utility.n;
import lnc.a1;
import ow0.a;
import nw1.b;
import op1.b;
import java.util.Objects;
import com.kwai.framework.model.user.QCurrentUser;
import op1.d;
import n91.c;
import d61.b0;

public final class LiveAudienceMultiChatPresenterV2$b implements d, a	// class@000b99
{
    public final a a;
    public final LiveAudienceMultiChatPresenterV2 b;

    public void LiveAudienceMultiChatPresenterV2$b(LiveAudienceMultiChatPresenterV2 p0){
       this.b = p0;
       super();
       this.a = LiveAudienceMultiChatPresenterV2.W8(p0);
    }
    public User I(){
       c obj = PatchProxy.apply(null, this, LiveAudienceMultiChatPresenterV2$b.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = LiveAudienceMultiChatPresenterV2.Z8(this.b).a(g.class);
       a.o(obj, "liveServiceManager.getSe¡­eInfoManager::class.java\)");
       return obj.I();
    }
    public void S(String p0,int p1){
       if (PatchProxy.isSupport(LiveAudienceMultiChatPresenterV2$b.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LiveAudienceMultiChatPresenterV2$b.class, "11")) {
          return;
       }
       a.p(p0, "userId");
       return;
    }
    public int V0(){
       c obj = PatchProxy.apply(null, this, LiveAudienceMultiChatPresenterV2$b.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = LiveAudienceMultiChatPresenterV2.Z8(this.b).a(g.class);
       a.o(obj, "liveServiceManager.getSe¡­eInfoManager::class.java\)");
       return obj.V0();
    }
    public ClientContent$LiveStreamPackage a(){
       c obj = PatchProxy.apply(null, this, LiveAudienceMultiChatPresenterV2$b.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = LiveAudienceMultiChatPresenterV2.Z8(this.b).a(i.class);
       a.o(obj, "liveServiceManager.getSe¡­kageProvider::class.java\)");
       ClientContent$LiveStreamPackage liveStreamPa = obj.a();
       a.o(liveStreamPa, "liveServiceManager.getSe¡­s.java\).liveStreamPackage");
       return liveStreamPa;
    }
    public c b(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceMultiChatPresenterV2$b.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveAudienceMultiChatPresenterV2.Z8(this.b).a(a.class).b();
    }
    public void b1(String p0,int p1,boolean p2){
       if (PatchProxy.isSupport(LiveAudienceMultiChatPresenterV2$b.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), this, LiveAudienceMultiChatPresenterV2$b.class, "8")) {
          return;
       }
       LiveAudienceMultiChatPresenterV2.Z8(this.b).a(e.class).E7(LiveAudienceMultiChatPresenterV2.Y8(this.b).j0().mEntity, p0, p1, p2, null);
       return;
    }
    public RenderAreaView c(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceMultiChatPresenterV2$b.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.c();
    }
    public void c1(UserInfo p0,int p1){
       LiveAudienceMultiChatPresenterV2$b uob = LiveAudienceMultiChatPresenterV2$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "7")) {
          return;
       }
       a.p(p0, "userInfo");
       LiveAudienceMultiChatPresenterV2.Z8(this.b).a(e.class).g3(new UserProfile(p0), LiveStreamClickType.LIVE_CHAT, 6, p1);
       return;
    }
    public a d(a p0,int p1){
       LiveAudienceMultiChatPresenterV2$b uob = LiveAudienceMultiChatPresenterV2$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "31");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "canvasSize");
       return this.a.d(p0, p1);
    }
    public ViewGroup e(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceMultiChatPresenterV2$b.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.e();
    }
    public LiveData f(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceMultiChatPresenterV2$b.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.f();
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceMultiChatPresenterV2$b.class, "2")) {
          return;
       }
       LiveAudienceMultiChatPresenterV2 l = this.b.L;
       if (l != null) {
          l.a();
       }
       return;
    }
    public Activity getActivity(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceMultiChatPresenterV2$b.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveAudienceMultiChatPresenterV2.Z8(this.b).a(a.class).c();
    }
    public String getLiveStreamId(){
       c obj = PatchProxy.apply(null, this, LiveAudienceMultiChatPresenterV2$b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = LiveAudienceMultiChatPresenterV2.Z8(this.b).a(g.class);
       a.o(obj, "liveServiceManager.getSe¡­eInfoManager::class.java\)");
       String liveStreamId = obj.getLiveStreamId();
       if (liveStreamId == null) {
          liveStreamId = "";
       }
       return liveStreamId;
    }
    public String h(){
       c obj = PatchProxy.apply(null, this, LiveAudienceMultiChatPresenterV2$b.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = LiveAudienceMultiChatPresenterV2.Z8(this.b).a(g.class);
       a.o(obj, "liveServiceManager.getSe¡­eInfoManager::class.java\)");
       String str = obj.d();
       if (str == null) {
          str = "";
       }
       return str;
    }
    public e0 i(){
       c obj = PatchProxy.apply(null, this, LiveAudienceMultiChatPresenterV2$b.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = LiveAudienceMultiChatPresenterV2.Z8(this.b).a(i.class);
       a.o(obj, "liveServiceManager.getSe¡­kageProvider::class.java\)");
       e0 page = obj.getPage();
       a.o(page, "liveServiceManager.getSe¡­rovider::class.java\).page");
       return page;
    }
    public Map j(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceMultiChatPresenterV2$b.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "userId");
       return this.b.k9(p0);
    }
    public d k(LiveKrnPageKey p0,a p1,a p2){
       c obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveAudienceMultiChatPresenterV2$b.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "pageKey");
       a.p(p1, "param");
       a.p(p2, "style");
       obj = LiveAudienceMultiChatPresenterV2.Z8(this.b).a(a.class);
       a.o(obj, "liveServiceManager.getSe¡­ridgeService::class.java\)");
       return b.d(b.a, obj, p0, p1, p2, null, 16, null);
    }
    public void l(int p0){
       LiveAudienceMultiChatPresenterV2$b uob = LiveAudienceMultiChatPresenterV2$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "5")) {
          return;
       }
       a0 f2 = LiveAudienceMultiChatPresenterV2.Y8(this.b).F2;
       a.o(f2, "livePlayCallerContext.mLiveAudiencePlayViewService");
       View view = f2.k();
       a.o(view, "livePlayCallerContext.mL¡­ePlayViewService.playView");
       view.setVisibility(p0);
       return;
    }
    public void m(c p0,d p1){
       boolean b;
       boolean b1;
       b a;
       String str = "1";
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveAudienceMultiChatPresenterV2$b.class, str)) {
          return;
       }
       String str1 = "onInviteExtra";
       a.p(p0, str1);
       String str2 = "inviteCallback";
       a.p(p1, str2);
       LiveAudienceMultiChatPresenterV2 l = this.b.L;
       if (l != null && !PatchProxy.applyVoidTwoRefs(p0, p1, l, b.class, str)) {
          a.p(p0, str1);
          a.p(p1, str2);
          l.b.J0();
          l.a();
          l.a = new l(l.c.getLiveStreamId(), l.c.a(), l.c.i(), new a(p1, p0));
          b = p0.a();
          if (l.c.r2(AudienceBizRelation.RECRUIT_EXPLAIN_PANEL)) {
             b.Z(LiveCommonLogTag.NEW_MULTI_CHAT, "ChatOnInvite InviteDialog force audio");
             b1 = false;
          }else {
             b1 = b;
          }
          Activity activity = l.c.getActivity();
          if (activity != null) {
             User user = l.c.I();
             if (user != null) {
                if (p0.d()) {
                   int i = (b1)? 2: 1;
                   c0.w(i, l.c.a());
                   a = l.a;
                   a.m(a);
                   a.j(activity, f.o(user).mProfile, p0.b(), b1, p0.c());
                }else {
                   a = l.a;
                   a.m(a);
                   a.i(activity, f.o(user).mProfile, p0.b(), b1, p0.c());
                }
                c0.T(l.c.getLiveStreamId(), p0.c());
             }
          }
       }
    label_00c8 :
       return;
    }
    public boolean n(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceMultiChatPresenterV2$b.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return LiveAudienceMultiChatPresenterV2.X8(this.b).r2(AudienceBizRelation.RECRUIT_EXPLAIN_PANEL);
    }
    public int o(){
       a0 obj = PatchProxy.apply(null, this, LiveAudienceMultiChatPresenterV2$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = LiveAudienceMultiChatPresenterV2.Y8(this.b).F2;
       a.o(obj, "livePlayCallerContext.mLiveAudiencePlayViewService");
       View view = obj.k();
       a.o(view, "livePlayCallerContext.mL¡­ePlayViewService.playView");
       return view.getVisibility();
    }
    public View p(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceMultiChatPresenterV2$b.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.p();
    }
    public int q(){
       View obj = PatchProxy.apply(null, this, LiveAudienceMultiChatPresenterV2$b.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.b.m8();
       a.o(obj, "rootView");
       int height = obj.getHeight();
       Activity activity = this.b.getActivity();
       if (height <= 0 && activity != null) {
          height = n.l(activity);
       }
       LiveAudienceMultiChatPresenterV2 g = this.b.G;
       if (g == null) {
          a.S("bottomBarView");
       }
       int height1 = g.getHeight();
       if (height1 <= 0) {
          height1 = a1.d(R.dimen.arg_RES_7f0705b7);
       }
       return (height - height1);
    }
    public boolean r(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceMultiChatPresenterV2$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.c();
    }
    public boolean r2(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceMultiChatPresenterV2$b.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "bizRelation");
       return LiveAudienceMultiChatPresenterV2.X8(this.b).r2(p0);
    }
    public boolean s(){
       return false;
    }
    public void switchCamera(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceMultiChatPresenterV2$b.class, "25")) {
          return;
       }
       LiveAudienceMultiChatPresenterV2.Z8(this.b).a(b.class).switchCamera();
       LiveAudienceMultiChatPresenterV2 p = this.b.P;
       if (p != null) {
          p.switchCamera();
       }
       return;
    }
    public void u(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveAudienceMultiChatPresenterV2$b.class, "24")) {
          return;
       }
       LiveAudienceMultiChatPresenterV2$b tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, LiveAudienceMultiChatPresenterV2.class, "31")) {
          LiveAudienceMultiChatPresenterV2 y = tb.y;
          String str = "liveServiceManager";
          if (y == null) {
             a.S(str);
          }
          c uoc = y.a(b.class);
          a.o(uoc, "liveServiceManager.getSe¡­ttifyService::class.java\)");
          LiveAudienceMultiChatPresenterV2 y1 = tb.y;
          if (y1 == null) {
             a.S(str);
          }
          c uoc1 = y1.a(i.class);
          a.o(uoc1, "liveServiceManager.getSe¡­kageProvider::class.java\)");
          QCurrentUser qCurrentUser = QCurrentUser.me();
          a.o(qCurrentUser, "QCurrentUser.me\(\)");
          String id = qCurrentUser.getId();
          a.o(id, "QCurrentUser.me\(\).id");
          d.b(uoc, uoc1, tb.P, tb.k9(id));
       }
       return;
    }
    public void v(UserInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceMultiChatPresenterV2$b.class, "10")) {
          return;
       }
       a.p(p0, "userInfo");
       return;
    }
    public void w(UserInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceMultiChatPresenterV2$b.class, "9")) {
          return;
       }
       LiveAudienceMultiChatPresenterV2.Z8(this.b).a(c.class).jb(p0);
       return;
    }
    public int y(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceMultiChatPresenterV2$b.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return b0.d(this.p().getBottom());
    }
}
