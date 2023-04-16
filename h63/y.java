package h63.y;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Boolean;
import java.lang.Object;
import mrd.a;
import h63.y$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import h63.g;
import android.view.View;
import y43.a;
import j47.c;
import ds5.a;
import h63.y$b;
import ds5.c;
import io.reactivex.subjects.PublishSubject;
import kg1.g;
import h63.t;
import erd.g;
import crd.b;
import brd.t;
import h63.u;
import java.util.Objects;
import android.animation.Animator;
import ekd.f;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.QCurrentUser;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kwai.framework.model.user.User;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import h63.x;
import java.lang.Runnable;
import o56.c;
import o56.a;
import android.app.Application;
import android.app.Activity;
import tkd.b;
import tkd.d;
import ou5.b;
import va1.d0;
import h63.r;
import android.content.Context;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import n3d.d;
import f37.o0;
import com.yxcorp.gifshow.activity.GifshowActivity;
import lnc.a1;
import mz6.b;
import com.kwai.live.gzone.favorite.LiveGzoneFavoriteFollowConfigResponse;
import java.lang.Integer;
import mz6.b$d;
import h63.o;
import android.content.DialogInterface$OnClickListener;
import android.app.Dialog;
import hq5.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import fq5.b;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import s77.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import k2b.e0;
import e63.k1;
import java.lang.Number;
import com.kuaishou.live.core.show.fansgroup.http.LiveFansGroupIntimacyInfo;
import android.widget.TextView;
import com.kuaishou.android.live.model.QLivePlayConfig;
import h63.p;
import android.view.View$OnClickListener;
import h63.q;
import ok.h;
import lnc.b9;
import com.yxcorp.gifshow.util.rx.RxBus;
import wca.n;
import t45.d;
import brd.z;
import h63.w;
import f82.d;
import h63.s;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import k2b.u1;
import h63.g$b;
import h63.c0;
import java.util.Map;
import java.util.HashMap;

public class y extends PresenterV2 implements g	// class@002ca9
{
    public g p;
    public a q;
    public b r;
    public b s;
    public LiveGzoneFavoriteFollowConfigResponse t;
    public boolean u;
    public boolean v;
    public boolean w;
    public a x;
    public o y;

    public void y(){
       super();
       this.x = a.h(Boolean.FALSE);
       this.y = new y$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, y.class, "3")) {
          return;
       }
       this.p = new g(this.m8(), this.q.O);
       if (this.q.F.Gb()) {
          this.v = true;
          this.W8();
       }else {
          this.q.F.gd(new y$b(this));
       }
       this.X7(this.q.G.Xf().subscribe(new t(this)));
       this.X7(this.q.O.Y2().subscribe(new u(this)));
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, y.class, "8")) {
          return;
       }
       y tp = this.p;
       Objects.requireNonNull(tp);
       if (!PatchProxy.applyVoid(objArray, tp, g.class, "6")) {
          f.a(tp.m);
       }
       this.u = false;
       return;
    }
    public final boolean P8(){
       Object obj = PatchProxy.apply(null, this, y.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.q.G.Gl() && this.X8())? true: false;
       return b;
    }
    public final void R8(View p0){
       Object[] objArray1;
       String str;
       y oy = y.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oy, "11")) {
          return;
       }
       if (TextUtils.n(QCurrentUser.me().getId(), this.q.Q().getUser().getId())) {
          return;
       }
       int i = this.S8();
       if (!QCurrentUser.me().isLogined()) {
          this.m8().post(new x(this, i));
          o0.k(this.getActivity(), d.a(-1712118428).ne(this.getActivity(), d0.a(this.q.Q()), "live_follow", 40, a.a().a().getString(R.string.arg_RES_7f103077), this.q.Q().mEntity, null, null, new r(this, p0)));
          return;
       }else {
          int i1 = 0;
          y oy1 = 1;
          if (this.P8()) {
             this.q.G.Zk("OVERT_GAME_JOIN");
          }else if(this.X8()){
             Object[] objArray = null;
             if (!PatchProxy.applyVoid(objArray, this, oy, "12")) {
                GifshowActivity activity = this.getActivity();
                if (a1.i(activity)) {
                   b uob = new b(activity);
                   y tt = this.t;
                   if (tt != null && tt.mFollowDays > null) {
                      if (this.q.Q().getUser().isFemale()) {
                         objArray1 = new Object[oy1];
                         objArray1[i1] = Integer.valueOf(this.t.mFollowDays);
                         str = activity.getString(R.string.arg_RES_7f10248f, objArray1);
                      }else {
                         objArray1 = new Object[oy1];
                         objArray1[i1] = Integer.valueOf(this.t.mFollowDays);
                         str = activity.getString(R.string.arg_RES_7f102490, objArray1);
                      }
                   }else {
                      str = objArray;
                   }
                   if (!TextUtils.x(str)) {
                      b$d uod = new b$d(str, objArray, a1.a(0x7f061fa5));
                      uod.h(R.dimen.arg_RES_7f070f70);
                      uob.a(uod);
                   }
                   uob.a(new b$d(R.string.arg_RES_7f104f05, -1, R.color.arg_RES_7f060c49));
                   uob.l(new o(this, activity));
                   uob.q();
                }
             }
          }else {
             a h = this.q.H;
             if (h != null) {
                h.Wj(98);
             label_0140 :
                if (i) {
                   k1.a(this.r.b(), i1, i, a.a(this.r), this.r.a());
                }
                return;
             }else {
                goto label_0140 ;
             }
          }
          i1 = true;
          goto label_0140 ;
       }
    }
    public int S8(){
       Object obj = PatchProxy.apply(null, this, y.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (!QCurrentUser.me().isLogined()) {
          return 0;
       }
       if (!this.X8()) {
          return 1;
       }
       if (!this.P8()) {
          return 2;
       }
       if (this.q.G.Qi().mStatus != 3) {
          return 7;
       }
       return 6;
    }
    public void V8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, y.class, "6")) {
          return;
       }
       this.x.onNext(Boolean.FALSE);
       y tp = this.p;
       Objects.requireNonNull(tp);
       if (!PatchProxy.applyVoid(objArray, tp, g.class, "3")) {
          tp.b.setVisibility(8);
          tp.d.setVisibility(8);
          tp.e.setVisibility(8);
       }
       return;
    }
    public void W8(){
       y oy = y.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oy, "5")) {
          return;
       }
       if (this.X8() && (this.v == null || this.w == null)) {
          return;
       }
       if (this.q.R().mIsGzoneCompetitionLive != null) {
          this.V8();
          return;
       }else {
          this.Y8();
          this.Z8();
          y tp = this.p;
          p op = new p(this);
          Objects.requireNonNull(tp);
          if (!PatchProxy.applyVoidOneRefs(op, tp, g.class, "1")) {
             tp.b.setOnClickListener(op);
          }
          if (!PatchProxy.applyVoid(objArray, this, oy, "9")) {
             this.s = b9.c(this.s, new q(this));
          }
          RxBus f = RxBus.f;
          z a = d.a;
          this.X7(f.f(n.class).observeOn(a).subscribe(new w(this)));
          this.X7(f.f(d.class).observeOn(a).subscribe(new s(this)));
          if (!TextUtils.n(QCurrentUser.me().getId(), this.q.Q().getUser().getId()) && this.u == null) {
             k1.b(this.S8(), this.r.a());
             BaseFragment uBaseFragmen = this.r.b();
             boolean b = this.X8();
             FeedLogCtx uFeedLogCtx = a.a(this.r);
             ClientContent$LiveStreamPackage liveStreamPa = this.r.a();
             if (!PatchProxy.isSupport(k1.class) || !PatchProxy.applyVoidFourRefs(uBaseFragmen, Boolean.valueOf(b), uFeedLogCtx, liveStreamPa, null, k1.class, "2")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "FOLLOW_BUTTON";
                i3 oi3 = i3.f();
                oi3.c("is_follow", Integer.valueOf(b));
                uElementPack.params = oi3.e();
                ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                uContentPack.liveStreamPackage = liveStreamPa;
                ShowMetaData showMetaData = new ShowMetaData();
                showMetaData.setLogPage(uBaseFragmen).setElementPackage(uElementPack).setContentPackage(uContentPack).setType(6).setFeedLogCtx(uFeedLogCtx);
                u1.B0(showMetaData);
             }
             this.u = true;
          }
          return;
       }
    }
    public final boolean X8(){
       Object obj = PatchProxy.apply(null, this, y.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (QCurrentUser.me().isLogined() && this.q.Q().getUser().isFollowingOrFollowRequesting())? true: false;
       return b;
    }
    public void Y8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, y.class, "7")) {
          return;
       }
       if (this.q.R().mIsGzoneCompetitionLive != null) {
          return;
       }
       this.x.onNext(Boolean.TRUE);
       y tp = this.p;
       Objects.requireNonNull(tp);
       if (!PatchProxy.applyVoid(objArray, tp, g.class, "4")) {
          tp.b.setVisibility(0);
          tp.d.setVisibility(0);
          tp.e.setVisibility(0);
       }
       return;
    }
    public void Z8(){
       y oy = y.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oy, "14")) {
          return;
       }
       if (!Boolean.TRUE.equals(this.x.i())) {
          return;
       }
       if (TextUtils.n(QCurrentUser.me().getId(), this.q.Q().getUser().getId())) {
          this.a9();
          oy = this.p;
          Objects.requireNonNull(oy);
          if (!PatchProxy.applyVoid(objArray, oy, g.class, "8")) {
             oy.d.setText(R.string.arg_RES_7f10103c);
             oy.a(oy.h);
          }
       }else if(this.P8()){
          boolean b = false;
          if (!PatchProxy.applyVoid(objArray, this, oy, "17")) {
             oy = this.t;
             LiveGzoneFavoriteFollowConfigResponse mFansGroupMe = (oy != null)? oy.mFansGroupMemberCount: 0;
             this.p.c(mFansGroupMe);
          }
          oy = this.p;
          if (this.q.G.Qi().mStatus != 3) {
             b = true;
          }
          oy.d(b);
       }else {
          this.p.e(this.X8());
          this.a9();
       }
       return;
    }
    public final void a9(){
       if (PatchProxy.applyVoid(null, this, y.class, "18")) {
          return;
       }
       y tt = this.t;
       LiveGzoneFavoriteFollowConfigResponse mFansCount = (tt != null)? tt.mFansCount: 0;
       this.p.c(mFansCount);
       return;
    }
    public void doBindView(View p0){
       PatchProxy.applyVoidOneRefs(p0, this, y.class, "2");
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, y.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new c0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, y.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(y.class, new c0());
       }else {
          obj.put(y.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, y.class, "1")) {
          return;
       }
       a uoa = this.q8(a.class);
       this.q = uoa;
       this.r = uoa.m;
       return;
    }
    public void onLiveProfileJoinFansGroupSuccessfulEvent(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y.class, "16")) {
          return;
       }
       y tt = this.t;
       int i = 1;
       if (tt != null) {
          tt.mFansGroupMemberCount = tt.mFansGroupMemberCount + i;
       }
       this.Z8();
       this.p.d(i);
       if (!TextUtils.n(QCurrentUser.me().getId(), this.q.Q().getUser().getId())) {
          k1.b(this.S8(), this.r.a());
       }
       return;
    }
}
