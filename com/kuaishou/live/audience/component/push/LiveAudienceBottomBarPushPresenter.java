package com.kuaishou.live.audience.component.push.LiveAudienceBottomBarPushPresenter;
import k51.c;
import com.kuaishou.live.audience.component.push.LiveAudienceBottomBarPushPresenter$1;
import v21.f;
import v21.e;
import com.kuaishou.live.audience.component.push.LiveAudienceBottomBarPushPresenter$a;
import com.kuaishou.live.audience.component.push.LiveAudienceBottomBarPushPresenter$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import androidx.lifecycle.MutableLiveData;
import x61.c;
import lp3.c;
import lp3.e;
import java.lang.Boolean;
import z61.b;
import mq5.h;
import mq5.b;
import t02.a0;
import aq5.a;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.b;
import m91.b;
import com.kuaishou.live.common.core.component.chat.LiveAudienceChatService;
import lp3.i;
import com.kuaishou.live.common.core.component.chat.LiveAudienceChatService$a;
import crd.b;
import lnc.b9;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.audience.component.push.f;
import android.view.View$OnClickListener;
import java.util.HashMap;
import java.lang.Integer;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import nl8.m;

public class LiveAudienceBottomBarPushPresenter extends c	// class@000bc4
{
    public AudienceBizRelation p;
    public a0 q;
    public i r;
    public b s;
    public LiveAudiencePushContainerFragment t;
    public final h u;
    public final LiveAudienceChatService$a v;
    public final b w;
    public LiveAudienceBottomBarPushPresenter$b x;
    public b y;
    public static String sLivePresenterClassName = "LiveAudienceBottomBarPushPresenter";
    public static final HashMap z;

    static {
       LiveAudienceBottomBarPushPresenter.z = new LiveAudienceBottomBarPushPresenter$1();
    }
    public void LiveAudienceBottomBarPushPresenter(){
       super();
       this.u = new f(this);
       this.v = new e(this);
       this.w = new LiveAudienceBottomBarPushPresenter$a(this);
    }
    public void E8(){
       LiveAudienceBottomBarPushPresenter$b uob = LiveAudienceBottomBarPushPresenter$b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveAudienceBottomBarPushPresenter.class, "6")) {
          return;
       }
       LiveAudienceBottomBarPushPresenter$b uob1 = this.R8();
       Objects.requireNonNull(uob1);
       if (!PatchProxy.applyVoid(objArray, uob1, uob, "4")) {
          uob1.c.setValue(uob1.b);
          uob1.a.a(c.class).v1(uob1.c);
       }
       uob1 = this.R8();
       Objects.requireNonNull(uob1);
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidOneRefs(Boolean.TRUE, uob1, uob, "2")) {
          uob = uob1.b;
          uob.mIsVisible = Boolean.TRUE;
          uob1.c.setValue(uob);
       }
       this.s.Km(this.u);
       a[] uoaArray = new a[]{AudienceBizRelation.VOICE_PARTY,AudienceBizRelation.VOICE_PARTY_KTV,AudienceBizRelation.VOICE_PARTY_THEATER,AudienceBizRelation.VOICE_PARTY_TEAM_PK,AudienceBizRelation.VOICE_PARTY_VIDEO,AudienceBizRelation.VOICE_PARTY_GRID_CHAT,AudienceBizRelation.VOICE_PARTY_CROSS_ROOM_PK};
       this.q.Y0.u5(this.w, uoaArray);
       LiveAudienceBottomBarPushPresenter tr = this.r;
       if (tr != null) {
          tr.a(LiveAudienceChatService.class).Jl(this.v);
       }
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveAudienceBottomBarPushPresenter.class, "7")) {
          return;
       }
       LiveAudienceBottomBarPushPresenter$b uob = this.R8();
       Objects.requireNonNull(uob);
       if (!PatchProxy.applyVoid(objArray, uob, LiveAudienceBottomBarPushPresenter$b.class, "5")) {
          uob.a.a(c.class).O0(1028);
       }
       this.s.le(this.u);
       this.P8();
       LiveAudienceBottomBarPushPresenter tr = this.r;
       if (tr != null) {
          tr.a(LiveAudienceChatService.class).Yg(this.v);
       }
       a[] uoaArray = new a[]{AudienceBizRelation.VOICE_PARTY,AudienceBizRelation.VOICE_PARTY_KTV,AudienceBizRelation.VOICE_PARTY_THEATER,AudienceBizRelation.VOICE_PARTY_TEAM_PK,AudienceBizRelation.VOICE_PARTY_VIDEO,AudienceBizRelation.VOICE_PARTY_GRID_CHAT,AudienceBizRelation.VOICE_PARTY_CROSS_ROOM_PK};
       this.q.Y0.G5(this.w, uoaArray);
       b9.a(this.y);
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceBottomBarPushPresenter.class, "8")) {
          return;
       }
       LiveAudienceBottomBarPushPresenter tt = this.t;
       if (tt != null && tt.isAdded()) {
          e uoe = this.q.Z2.b().getChildFragmentManager().beginTransaction();
          uoe.y(R.anim.arg_RES_7f010105, 0x7f01010d);
          uoe.u(this.t).m();
       }
       return;
    }
    public final LiveAudienceBottomBarPushPresenter$b R8(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceBottomBarPushPresenter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.x == null) {
          this.x = new LiveAudienceBottomBarPushPresenter$b(new f(this));
       }
       return this.x;
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceBottomBarPushPresenter.class, "1")) {
          return;
       }
       LiveAudienceBottomBarPushPresenter tp = this.p;
       if (tp != null) {
          this.x.l(LiveAudienceBottomBarPushPresenter.z.get(tp).intValue());
       }else {
          this.x.l(R.string.arg_RES_7f102103);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceBottomBarPushPresenter.class, "5")) {
          return;
       }
       this.q = this.q8(a0.class);
       this.s = this.r8("LIVE_AUDIENCE_LIVE_END_SERVICE");
       this.r = this.r8("LIVE_SERVICE_MANAGER");
       this.R8().e(this);
       return;
    }
}
