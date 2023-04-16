package com.yxcorp.gifshow.detail.common.information.profilefollow.ProfileFollowElement;
import com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement;
import jh5.a;
import xq7.d;
import rp7.a;
import com.yxcorp.gifshow.detail.common.information.profilefollow.ProfileFollowElement$b;
import com.yxcorp.gifshow.detail.common.information.profilefollow.ProfileFollowElement$a;
import com.kwai.slide.play.detail.information.profilefollow.ProfileFollowManager;
import java.lang.String;
import kotlin.jvm.internal.a;
import qp7.a;
import v6a.m0;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import le5.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.robust.PatchProxyResult;
import uw9.l0;
import uw9.u3;
import rq7.a;
import mr7.n;
import mr7.m;
import java.lang.Boolean;
import com.kwai.component.photo.reduce.d;
import com.yxcorp.gifshow.activity.GifshowActivity;
import lnc.u1;
import qp7.b;
import eoc.h;
import brd.z;
import io.reactivex.android.schedulers.a;
import brd.t;
import com.yxcorp.gifshow.detail.common.information.profilefollow.ProfileFollowElement$c;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import com.yxcorp.gifshow.detail.common.information.profilefollow.ProfileFollowElement$onBind$2;
import sy9.b;
import msd.l;
import erd.o;
import com.yxcorp.gifshow.detail.common.information.profilefollow.ProfileFollowElement$d;
import p5a.e;
import de5.a;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.kwai.framework.player.core.b;
import qp7.b1;
import qp7.c;
import com.yxcorp.gifshow.detail.common.information.profilefollow.ProfileFollowElement$e;
import java.util.Objects;
import com.yxcorp.gifshow.detail.common.information.profilefollow.ProfileFollowElement$f;
import qp7.g;
import xq7.e;
import com.yxcorp.gifshow.detail.common.information.profilefollow.ProfileFollowElement$g;
import p1a.a$a;
import p1a.a;
import mvb.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import qp7.x0;
import com.kwai.slide.play.detail.information.profilefollow.ProfileFollowElementState;
import qp7.d;
import mr7.e;

public final class ProfileFollowElement extends DispatchBaseElement	// class@00143a
{
    public a A;
    public d B;
    public boolean C;
    public boolean D;
    public final IMediaPlayer$OnInfoListener E;
    public final b1 F;
    public l0 t;
    public ProfileFollowManager u;
    public QPhoto v;
    public User w;
    public a x;
    public Activity y;
    public PhotoDetailParam z;

    public void ProfileFollowElement(a p0){
       super(d.F, p0);
       this.E = new ProfileFollowElement$b(this);
       this.F = new ProfileFollowElement$a(this);
    }
    public static final ProfileFollowManager n0(ProfileFollowElement p0){
       p0 = p0.u;
       if (p0 == null) {
          a.S("mProfileFollowManager");
       }
       return p0;
    }
    public void P(a p0){
       a a;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, ProfileFollowElement.class, "1")) {
       }else {
          a.p(p0, "callerContext");
          PhotoDetailParam mPhoto = p0.c.mPhoto;
          a.o(mPhoto, "callerContext.mPhotoDetailParam.mPhoto");
          this.v = mPhoto;
          if (mPhoto == null) {
             a.S("mPhoto");
          }
          User user = mPhoto.getUser();
          a.o(user, "mPhoto.user");
          this.w = user;
          m0 v = p0.v;
          a.o(v, "callerContext.mPhotoDetailGlobalParams");
          this.t = v;
          ProfileFollowManager profileFollo = PatchProxy.apply(null, this, ProfileFollowElement.class, "9");
          if (profileFollo != PatchProxyResult.class) {
          }else {
             ProfileFollowElement tt = this.t;
             String str = "mGlobalParams";
             if (tt == null) {
                a.S(str);
             }
             profileFollo = tt.t2.a("ProfileFollowManager");
             if (profileFollo == null) {
                profileFollo = new ProfileFollowManager();
                ProfileFollowElement tt1 = this.t;
                if (tt1 == null) {
                   a.S(str);
                }
                tt1.t2.b("ProfileFollowManager", profileFollo);
             }
          }
          this.u = profileFollo;
          v = p0.j;
          a.o(v, "callerContext.mPlayModule");
          this.x = v;
          a = p0.a;
          a.o(a, "callerContext.mActivity");
          this.y = a;
          a = p0.c;
          a.o(a, "callerContext.mPhotoDetailParam");
          this.z = a;
          m0 o = p0.o;
          a.o(o, "callerContext.mLogListener");
          this.A = o;
          PatchProxy.onMethodExit(ProfileFollowElement.class, "1");
       }
       return;
    }
    public void S(){
       if (PatchProxy.applyVoid(null, this, ProfileFollowElement.class, "17")) {
          return;
       }
       this.o0();
       return;
    }
    public a f0(a p0){
       n on = PatchProxy.applyOneRefs(p0, this, ProfileFollowElement.class, "2");
       if (on != PatchProxyResult.class) {
       }else {
          on = new n(this.i0());
       }
       return on;
    }
    public void j0(boolean p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       m om = m.class;
       ProfileFollowElement profileFollo = ProfileFollowElement.class;
       if (PatchProxy.isSupport(profileFollo) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, profileFollo, "5")) {
          return;
       }
       ProfileFollowElement tw = this.w;
       String str = "mUser";
       if (tw == null) {
          a.S(str);
       }
       if (!tw.isFollowingOrFollowRequesting()) {
          tw = this.v;
          String str1 = "mPhoto";
          if (tw == null) {
             a.S(str1);
          }
          if (!tw.isMine()) {
             ProfileFollowElement tv = this.v;
             if (tv == null) {
                a.S(str1);
             }
             ProfileFollowElement ty = this.y;
             if (ty == null) {
                a.S("mActivity");
             }
             this.B = new d(tv, ty);
             u1.a(this);
             this.D = false;
             this.c0();
             tw = this.u;
             str1 = "mProfileFollowManager";
             if (tw == null) {
                a.S(str1);
             }
             b obj = tw.a().a();
             a.o(obj, "mProfileFollowManager.mCanShowProfileFollow.value");
             this.p0(obj.booleanValue());
             tw = this.u;
             if (tw == null) {
                a.S(str1);
             }
             obj = tw.a().a.observeOn(a.c()).distinctUntilChanged().subscribe(new ProfileFollowElement$c(this));
             a.o(obj, "mProfileFollowManager.mC…dateVisible\(it\)\n        }");
             this.j(obj);
             tw = this.w;
             if (tw == null) {
                a.S(str);
             }
             t ot = tw.observable();
             ProfileFollowElement$onBind$2 iNSTANCE = ProfileFollowElement$onBind$2.INSTANCE;
             if (iNSTANCE != null) {
                iNSTANCE = new b(iNSTANCE);
             }
             obj = ot.distinctUntilChanged(iNSTANCE).subscribe(new ProfileFollowElement$d(this));
             a.o(obj, "mUser.observable\(\).disti…llow = true\n      }\n    }");
             this.j(obj);
             tw = this.x;
             if (tw == null) {
                a.S("mPlayModule");
             }
             tw.getPlayer().addOnInfoListener(this.E);
             this.i(this.F);
             m om1 = this.A();
             ProfileFollowElement$e uoe = new ProfileFollowElement$e(this);
             Objects.requireNonNull(om1);
             b uob = PatchProxy.applyOneRefs(uoe, om1, om, "4");
             if (uob != patchProxyRe) {
             }else {
                a.p(uoe, "onNext");
                uob = om1.b.subscribe(uoe);
                a.o(uob, "mCancelButtonClickSubject.subscribe\(onNext\)");
             }
             this.j(uob);
             om1 = this.A();
             ProfileFollowElement$f uof = new ProfileFollowElement$f(this);
             Objects.requireNonNull(om1);
             b uob1 = PatchProxy.applyOneRefs(uof, om1, om, "2");
             if (uob1 != patchProxyRe) {
             }else {
                a.p(uof, "onNext");
                uob1 = om1.a.subscribe(uof);
                a.o(uob1, "mFollowButtonClickSubject.subscribe\(onNext\)");
             }
             this.j(uob1);
             this.j(e.g(this.D(), new ProfileFollowElement$g(this), null, 2, null));
             return;
          }
       }
       this.b0();
       return;
    }
    public void m0(boolean p0){
       ProfileFollowElement profileFollo = ProfileFollowElement.class;
       if (PatchProxy.isSupport(profileFollo) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, profileFollo, "8")) {
          return;
       }
       ProfileFollowElement tx = this.x;
       if (tx == null) {
          a.S("mPlayModule");
       }
       tx.getPlayer().removeOnInfoListener(this.E);
       u1.b(this);
       return;
    }
    public final void o0(){
       ProfileFollowElement profileFollo = ProfileFollowElement.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, profileFollo, "16")) {
          return;
       }
       if (this.D != null) {
          return;
       }
       ProfileFollowElement tu = this.u;
       if (tu == null) {
          a.S("mProfileFollowManager");
       }
       Object obj = tu.a().a();
       a.o(obj, "mProfileFollowManager.mCanShowProfileFollow.value");
       if (obj.booleanValue() && this.C != null) {
          this.D = true;
          if (!PatchProxy.applyVoid(objArray, this, profileFollo, "13")) {
             ProfileFollowElement tA = this.A;
             if (tA == null) {
                a.S("mLogListener");
             }
             a$a uoa1 = a$a.s(0, "Profile 关注引导的【不感兴趣】按钮曝光");
             uoa1.f("NOT_INTEREST_BUTTON");
             uoa1.r(true);
             tA.b(uoa1);
          }
          if (!PatchProxy.applyVoid(objArray, this, profileFollo, "11")) {
             profileFollo = this.A;
             if (profileFollo == null) {
                a.S("mLogListener");
             }
             a$a uoa = a$a.s(31, "Profile 关注引导的【关注】按钮曝光");
             uoa.f("USER_FOLLOW_BTN");
             uoa.r(true);
             profileFollo.b(uoa);
          }
       }
    label_007d :
       return;
    }
    public final void onEventMainThread(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileFollowElement.class, "15")) {
          return;
       }
       c a = (p0 != null)? p0.a: null;
       if (a != null) {
          a = p0.a;
          String str = "event.targetPhoto";
          a.o(a, str);
          String photoId = a.getPhotoId();
          ProfileFollowElement tv = this.v;
          if (tv == null) {
             a.S("mPhoto");
          }
          if (TextUtils.n(photoId, tv.getPhotoId())) {
             p0 = p0.a;
             a.o(p0, str);
             if (p0.isLiked()) {
                ProfileFollowElement tu = this.u;
                if (tu == null) {
                   a.S("mProfileFollowManager");
                }
                Objects.requireNonNull(tu);
                ProfileFollowManager profileFollo = ProfileFollowManager.class;
                if (!PatchProxy.isSupport(profileFollo) || !PatchProxy.applyVoidOneRefs(Boolean.TRUE, tu, profileFollo, "3")) {
                   tu.e = true;
                   tu.c();
                }
             }
          }
       }
    label_0061 :
       return;
    }
    public final void p0(boolean p0){
       ProfileFollowElement profileFollo = ProfileFollowElement.class;
       if (PatchProxy.isSupport(profileFollo) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, profileFollo, "7")) {
          return;
       }
       this.o0();
       if (p0) {
          n on = this.E();
          ProfileFollowElementState sHOW = (this.C != null)? ProfileFollowElementState.SHOW: ProfileFollowElementState.SHOW_NO_ANIM;
          on.g(sHOW);
       }else if(this.C != null){
          ProfileFollowElement tv = this.v;
          if (tv == null) {
             a.S("mPhoto");
          }
          User user = tv.getUser();
          a.o(user, "mPhoto.user");
          if (user.isFollowingOrFollowRequesting()) {
             this.E().g(ProfileFollowElementState.HIDE_WITH_FOLLOW_ANIM);
          }else {
             this.E().g(ProfileFollowElementState.HIDE_WITH_NORMAL_ANIM);
          }
       }else {
          this.E().g(ProfileFollowElementState.HIDE_NO_ANIM);
       }
       return;
    }
    public d q(){
       e uoe = PatchProxy.apply(null, this, ProfileFollowElement.class, "4");
       if (uoe != PatchProxyResult.class) {
       }else {
          uoe = new e();
       }
       return uoe;
    }
    public c r(){
       m om = PatchProxy.apply(null, this, ProfileFollowElement.class, "3");
       if (om != PatchProxyResult.class) {
       }else {
          om = new m();
       }
       return om;
    }
}
