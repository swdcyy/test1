package i02.r;
import com.kuaishou.live.common.core.component.bottombubble.notices.increasefans.b;
import lp3.a;
import p91.m;
import android.app.Activity;
import java.lang.String;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import w91.a;
import java.util.HashMap;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.live.common.core.component.bottombubble.notices.increasefans.LiveIncreaseFansNoticeInfo;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import y41.i$a;
import i02.n;
import com.yxcorp.gifshow.entity.helper.FollowHelper$a;
import y41.i;
import u07.t$a;
import java.lang.CharSequence;
import u07.f;
import i02.l;
import u07.u;
import i02.m;
import i02.r$a;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;
import android.text.TextUtils;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.feature.api.live.base.service.model.LiveStreamClickType;
import crd.b;
import lnc.b9;
import java.util.Map;
import java.lang.Boolean;
import java.util.Set;
import java.util.Iterator;
import com.kuaishou.live.common.core.component.bottombubble.notices.increasefans.b$a;
import h91.d;
import h91.c;
import brd.t;
import i02.q;
import i02.r$b;
import erd.g;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import rw1.b;
import com.kuaishou.live.common.core.component.recharge.d;
import com.kuaishou.live.common.core.component.follow.cache.c;
import i02.o;
import i02.p;

public class r extends a implements b	// class@0027fb
{
    public b d;
    public b e;
    public final GifshowActivity f;
    public final m g;
    public final String h;
    public final LiveBizParam i;
    public final a j;
    public final Map k;

    public void r(m p0,Activity p1,String p2,LiveBizParam p3,a p4){
       super();
       this.k = new HashMap();
       this.f = p1;
       this.g = p0;
       this.h = p2;
       this.i = p3;
       this.j = p4;
    }
    public void Gd(LiveIncreaseFansNoticeInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "3")) {
          return;
       }
       i$a uoa = new i$a(this.g.getLiveStreamId()).p(p0.mUserId);
       uoa.h(this.f.Q2());
       uoa.m(this.h);
       uoa.n(122);
       uoa.r(true);
       uoa.e(n.a);
       uoa.a().c();
       return;
    }
    public void Lk(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, r.class, "4")) {
          return;
       }
       t$a uoa = new t$a(this.f);
       uoa.X0(p0);
       uoa.z0(p1);
       uoa.S0(R.string.arg_RES_7f1024f9);
       uoa.Q0(R.string.arg_RES_7f1024f8);
       t$a uoa1 = f.e(uoa);
       uoa1.u0(new l(this));
       uoa1.t0(new m(this));
       uoa1.Y(new r$a(this));
       return;
    }
    public void Ol(LiveIncreaseFansNoticeInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "8")) {
          return;
       }
       if (!TextUtils.isEmpty(p0.mUserId)) {
          UserInfo userInfo = new UserInfo();
          userInfo.mId = p0.mUserId;
          this.g.w0(new UserProfile(userInfo), LiveStreamClickType.LIVE_COMMENT_NOTICE_FANS_INCREASE, 0, false, 122);
       }
       return;
    }
    public void Ro(){
       if (PatchProxy.applyVoid(null, this, r.class, "10")) {
          return;
       }
       b9.a(this.d);
       b9.a(this.e);
       return;
    }
    public void Sb(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "2")) {
          return;
       }
       this.k.remove(p0);
       return;
    }
    public final void So(String p0,boolean p1,LiveIncreaseFansNoticeInfo p2){
       if (PatchProxy.isSupport(r.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, this, r.class, "11")) {
          return;
       }
       Iterator iterator = this.k.keySet().iterator();
       while (iterator.hasNext()) {
          if (TextUtils.equals(p0, iterator.next())) {
             this.k.get(p0).a(p0, p1, p2);
          }
       }
       return;
    }
    public final void To(){
       if (PatchProxy.applyVoid(null, this, r.class, "5")) {
          return;
       }
       this.e = c.b().f(this.g.getLiveStreamId(), 1, 2).subscribe(q.b, new r$b(this));
       return;
    }
    public void c2(){
       if (PatchProxy.applyVoid(null, this, r.class, "7")) {
          return;
       }
       b.b(this.g.a(), "LIVE_ROOM_COMMENT_NOTICE", this.j.d6());
       d.f("LIVE_ROOM_COMMENT_NOTICE", this.f, this.g.getLiveStreamId(), this.g.d(), this.i, this.g.i(), this.j.d6());
       return;
    }
    public void hc(String p0,LiveIncreaseFansNoticeInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, r.class, "9")) {
          return;
       }
       this.d = c.b().d(p1.mUserId).take(1).subscribe(new o(this, p0, p1), new p(this, p0, p1));
       return;
    }
    public void n7(String p0,b$a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, r.class, "1")) {
          return;
       }
       this.k.put(p0, p1);
       return;
    }
}
