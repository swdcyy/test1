package com.yxcorp.gifshow.detail.common.rightactionbar.music.wheel.MusicWheelElement;
import com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement;
import com.yxcorp.gifshow.detail.common.rightactionbar.music.wheel.MusicWheelElement$a;
import nsd.u;
import jh5.a;
import hs7.d;
import rp7.a;
import com.yxcorp.gifshow.detail.common.rightactionbar.music.wheel.MusicWheelElement$mLowPhone$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.detail.common.rightactionbar.music.wheel.MusicWheelElement$d;
import com.yxcorp.gifshow.detail.common.rightactionbar.music.wheel.MusicWheelElement$b;
import com.yxcorp.gifshow.detail.common.rightactionbar.music.wheel.MusicWheelElement$c;
import de5.a;
import java.lang.String;
import kotlin.jvm.internal.a;
import p1a.a;
import com.yxcorp.gifshow.entity.QPhoto;
import qp7.a;
import v6a.m0;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import le5.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.kuaishou.android.model.music.Music;
import lnc.d6;
import py9.w;
import android.app.Activity;
import uy6.h;
import uy6.b;
import rz9.a;
import java.lang.Runnable;
import k2b.n;
import rq7.a;
import com.kwai.robust.PatchProxyResult;
import ss7.r;
import java.lang.Boolean;
import qp7.b1;
import qp7.b;
import qp7.t0;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import com.kwai.library.groot.framework.viewpager.GrootViewPager;
import com.kwai.library.widget.viewpager.VerticalViewPager;
import androidx.viewpager.widget.ViewPager$i;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.yxcorp.gifshow.detail.common.rightactionbar.music.wheel.MusicWheelElement$onBind$1;
import rz9.b;
import msd.l;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.detail.common.rightactionbar.music.wheel.MusicWheelElement$e;
import com.yxcorp.gifshow.detail.common.rightactionbar.music.wheel.MusicWheelElement$f;
import qp7.c;
import ss7.p;
import com.yxcorp.gifshow.detail.common.rightactionbar.music.wheel.MusicWheelElement$g;
import com.yxcorp.gifshow.detail.common.rightactionbar.music.wheel.MusicWheelElement$h;
import com.yxcorp.gifshow.detail.common.rightactionbar.music.wheel.MusicWheelElement$i;
import com.yxcorp.gifshow.model.CDNUrl;
import p5a.b;
import ekd.j;
import com.yxcorp.gifshow.detail.common.rightactionbar.music.wheel.MusicWheelElement$j;
import qp7.d;
import com.kwai.slide.play.detail.rightactionbar.music.wheel.MusicWheelElementView;
import com.kuaishou.android.model.music.MusicWheelInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.android.model.mix.LipsSyncModel;
import tca.w2;
import e0a.j;
import com.yxcorp.gifshow.util.DateUtils;
import uw9.c;
import android.content.SharedPreferences;
import uw9.o;
import java.lang.StringBuilder;
import q87.c;
import android.content.SharedPreferences$Editor;
import oe6.g;
import uy6.f;
import com.kwai.library.slide.base.exp.SlidePerformanceExp;
import com.yxcorp.gifshow.detail.wolverine.FeedWolverinePerformanceHolder;
import l27.g;
import com.kwai.library.wolverine.impl.WolverinePerformanceLevel;
import com.yxcorp.gifshow.detail.wolverine.FeedWolverinePerformanceHelper;
import com.kwai.library.wolverine.contract.WolverinePerformanceLevelInterface;
import xzc.a;
import qp7.x0;
import com.kuaishou.android.model.feed.VideoFeed;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.kuaishou.android.model.music.MusicStrategy;
import com.kuaishou.android.model.feed.ImageFeed;
import java.util.Objects;
import pp7.b;
import java.lang.Integer;
import ss7.s;
import uy6.d;
import com.kwai.framework.model.user.User;
import s0d.f;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import s0d.a;
import lnc.a1;
import com.kwai.framework.model.user.UserInfo;
import s0d.e;
import lnc.e0;

public final class MusicWheelElement extends DispatchBaseElement	// class@0014c1
{
    public t A;
    public SlidePlayViewModel B;
    public GrootViewPager C;
    public Music D;
    public w E;
    public final p F;
    public boolean G;
    public final b$b H;
    public final MusicWheelElement$b I;
    public final ViewPager$i J;
    public QPhoto t;
    public BaseFragment u;
    public Activity v;
    public a w;
    public a x;
    public t y;
    public t z;
    public static final MusicWheelElement$a K;

    static {
       MusicWheelElement.K = new MusicWheelElement$a(null);
    }
    public void MusicWheelElement(a p0){
       super(d.j, p0);
       this.F = s.c(MusicWheelElement$mLowPhone$2.INSTANCE);
       this.H = new MusicWheelElement$d(this);
       this.I = new MusicWheelElement$b(this);
       this.J = new MusicWheelElement$c(this);
    }
    public static final a n0(MusicWheelElement p0){
       p0 = p0.x;
       if (p0 == null) {
          a.S("mDetailPlayModule");
       }
       return p0;
    }
    public static final a o0(MusicWheelElement p0){
       p0 = p0.w;
       if (p0 == null) {
          a.S("mLogListener");
       }
       return p0;
    }
    public static final QPhoto p0(MusicWheelElement p0){
       p0 = p0.t;
       if (p0 == null) {
          a.S("mPhoto");
       }
       return p0;
    }
    public void P(a p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, MusicWheelElement.class, "2")) {
       }else {
          a.p(p0, "callerContext");
          PhotoDetailParam mPhoto = p0.c.mPhoto;
          a.o(mPhoto, "callerContext.mPhotoDetailParam.mPhoto");
          this.t = mPhoto;
          a b = p0.b;
          a.o(b, "callerContext.mFragment");
          this.u = b;
          if (b == null) {
             a.S("mFragment");
          }
          this.B = SlidePlayViewModel.B0(b.getParentFragment());
          b = p0.a;
          a.o(b, "callerContext.mActivity");
          this.v = b;
          m0 o = p0.o;
          a.o(o, "callerContext.mLogListener");
          this.w = o;
          o = p0.j;
          a.o(o, "callerContext.mPlayModule");
          this.x = o;
          b = p0.e;
          a.o(b, "callerContext.mDetailPlayedProgressObservable");
          this.y = b;
          b = p0.f;
          a.o(b, "callerContext.mDetailPlayedCountObservable");
          this.z = b;
          MusicWheelElement tt = this.t;
          String str = "mPhoto";
          if (tt == null) {
             a.S(str);
          }
          this.D = d6.c(tt);
          MusicWheelElement tt1 = this.t;
          if (tt1 == null) {
             a.S(str);
          }
          MusicWheelElement tD = this.D;
          MusicWheelElement tv = this.v;
          if (tv == null) {
             a.S("mActivity");
          }
          this.E = new w(tt1, tD, tv);
          m0 p = p0.P;
          a.o(p, "callerContext.mPlayPauseShowObservable");
          this.A = p;
          PatchProxy.onMethodExit(MusicWheelElement.class, "2");
       }
       return;
    }
    public void S(){
       MusicWheelElement musicWheelEl = MusicWheelElement.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, musicWheelEl, "10")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, musicWheelEl, "11") && h.a.r == null) {
          a uoa = new a(this);
          MusicWheelElement tu = this.u;
          if (tu == null) {
             a.S("mFragment");
          }
          n.a(tu, uoa);
       }
       return;
    }
    public a f0(a p0){
       r or = PatchProxy.applyOneRefs(p0, this, MusicWheelElement.class, "3");
       if (or != PatchProxyResult.class) {
       }else {
          or = new r();
       }
       return or;
    }
    public void j0(boolean p0){
       MusicWheelElement tB;
       b uob;
       MusicWheelElement musicWheelEl = MusicWheelElement.class;
       if (PatchProxy.isSupport(musicWheelEl) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, musicWheelEl, "6")) {
          return;
       }
       this.i(this.I);
       Object[] objArray = null;
       if (this.H().l()) {
          tB = this.B;
          GrootViewPager grootViewPag = (tB != null)? tB.d1(GrootViewPager.class): objArray;
          this.C = grootViewPag;
          if (grootViewPag != null) {
             grootViewPag.i0(this.J);
          }
          tB = this.u;
          if (tB == null) {
             a.S("mFragment");
          }
          uob = tB.m().subscribe(new b(new MusicWheelElement$onBind$1(this)), Functions.e);
          a.o(uob, "mFragment.lifecycle\(\).su¡­Functions.ERROR_CONSUMER\)");
          this.j(uob);
       }
       tB = this.t;
       if (tB == null) {
          a.S("mPhoto");
       }
       uob = tB.observePostChange().subscribe(new MusicWheelElement$e(this), MusicWheelElement$f.b);
       a.o(uob, "mPhoto.observePostChange¡­ror\(throwable\)\n        }\)");
       this.j(uob);
       g og = Functions.d();
       a.o(og, "Functions.emptyConsumer\(\)");
       this.j(this.A().a(new MusicWheelElement$g(this), og));
       tB = this.y;
       if (tB == null) {
          a.S("mDetailPlayedProgressObservable");
       }
       uob = tB.subscribe(new MusicWheelElement$h(this));
       a.o(uob, "mDetailPlayedProgressObs¡­artExtend\(\)\n      }\n    }");
       this.j(uob);
       tB = this.z;
       if (tB == null) {
          a.S("mDetailPlayedCountObservable");
       }
       uob = tB.subscribe(new MusicWheelElement$i(this));
       a.o(uob, "mDetailPlayedCountObserv¡­      startExtend\(\)\n    }");
       this.j(uob);
       Object[] obj = PatchProxy.apply(objArray, this, musicWheelEl, "9");
       if (obj != PatchProxyResult.class) {
          obj = obj.booleanValue();
       }else {
          tB = this.t;
          if (tB == null) {
             a.S("mPhoto");
          }
          if (!tB.isSinglePhoto()) {
             tB = this.t;
             if (tB == null) {
                a.S("mPhoto");
             }
             if (!tB.isAtlasPhotos()) {
             label_0110 :
                tB = false;
             }
          }
          tB = this.t;
          if (tB == null) {
             a.S("mPhoto");
          }
          if (j.h(b.b(tB))) {
             tB = true;
          }else {
             goto label_0110 ;
          }
       }
       if (obj) {
          tB = this.A;
          if (tB == null) {
             a.S("mPlayPauseShowObservable");
          }
          uob = tB.subscribe(new MusicWheelElement$j(this), Functions.d());
          a.o(uob, "mPlayPauseShowObservable¡­unctions.emptyConsumer\(\)\)");
          this.j(uob);
       }
       return;
    }
    public void m0(boolean p0){
       if (PatchProxy.isSupport(MusicWheelElement.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, MusicWheelElement.class, "21")) {
          return;
       }
       this.y0();
       return;
    }
    public d q(){
       MusicWheelElementView musicWheelEl = PatchProxy.apply(null, this, MusicWheelElement.class, "5");
       if (musicWheelEl != PatchProxyResult.class) {
       }else {
          musicWheelEl = new MusicWheelElementView();
       }
       return musicWheelEl;
    }
    public final boolean q0(){
       int b1;
       SharedPreferences a;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       MusicWheelElement musicWheelEl = MusicWheelElement.class;
       Object[] objArray = null;
       MusicWheelElement obj = PatchProxy.apply(objArray, this, musicWheelEl, "16");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.t;
       String str = "mPhoto";
       if (obj == null) {
          a.S(str);
       }
       boolean b = true;
       if (obj.getMusicWheelInfo() != null) {
          obj = this.t;
          if (obj == null) {
             a.S(str);
          }
          if (obj.getMusicWheelInfo().mMusicWheelExtendable != null && !this.u0()) {
             obj = this.D;
             if (obj != null) {
                a.m(obj);
                if (!TextUtils.x(obj.mName)) {
                   obj = this.t;
                   if (obj == null) {
                      a.S(str);
                   }
                   if (obj.getLipsSyncModel() == null) {
                      obj = this.t;
                      if (obj == null) {
                         a.S(str);
                      }
                      if (!w2.b(obj)) {
                         obj = this.t;
                         if (obj == null) {
                            a.S(str);
                         }
                         if (!obj.isQuestionnaire()) {
                            obj = this.t;
                            if (obj == null) {
                               a.S(str);
                            }
                            if (!obj.disableFollowShoot()) {
                               SharedPreferences$Editor obj1 = PatchProxy.apply(objArray, this, musicWheelEl, "18");
                               if (obj1 != patchProxyRe) {
                                  b1 = obj1.booleanValue();
                               }else {
                                  b1 = j.o();
                                  if (b1 > 0) {
                                     a = c.a;
                                     if (TextUtils.n(DateUtils.m(), a.getString("musicWheelLastShowDate", ""))) {
                                        if (c.k() >= b1) {
                                           b1 = true;
                                        }
                                     }else {
                                        Object[] objArray1 = new Object[0];
                                        o.C().w("MusicWheelElement", "refresh last showdate: "+DateUtils.m(), objArray1);
                                        obj1 = a.edit();
                                        obj1.putString("musicWheelLastShowDate", DateUtils.m());
                                        g.a(obj1);
                                        c.F(0);
                                     }
                                  }
                                  b1 = false;
                               }
                               if (!b1) {
                               label_00e7 :
                                  return b;
                               }
                            }
                         }
                      }
                   }
                }
             }
          }
       }
    label_00e6 :
       b = false;
       goto label_00e7 ;
    }
    public c r(){
       p op = PatchProxy.apply(null, this, MusicWheelElement.class, "4");
       if (op != PatchProxyResult.class) {
       }else {
          op = new p();
       }
       return op;
    }
    public final boolean r0(){
       g obj = PatchProxy.apply(null, this, MusicWheelElement.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (SlidePerformanceExp.d().b()) {
          return b;
       }
       if (this.v0()) {
          return b;
       }
       obj = FeedWolverinePerformanceHolder.c.c();
       WolverinePerformanceLevel wolverinePer = FeedWolverinePerformanceHelper.a("feed_wolverine_music_wheel_demotion_grade");
       if (obj == null || wolverinePer == null) {
          return (this.u0() ^ 0x01);
       }
       WolverinePerformanceLevel wolverinePer1 = obj.a();
       b = wolverinePer1.higherThan(wolverinePer);
       if (!b) {
          a.a("musicDiskAnimation", wolverinePer1);
       }
       return b;
    }
    public final boolean s0(CDNUrl[] p0,String p1){
       boolean i;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, MusicWheelElement.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 != null) {
          i = (!p0.length)? 1: 0;
          if (!i) {
             i = false;
          label_0023 :
             if (!i || !TextUtils.x(p1)) {
                b = true;
             }
             return b;
          }
       }
       i = true;
       goto label_0023 ;
    }
    public final String t0(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MusicWheelElement.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = "TRUE";
       String str1 = "";
       switch (p0.hashCode()){
           case 0x9721d027:
             if (p0.equals("button_type")) {
                p0 = (!this.q0())? "TYPE1": "TYPE2";
                return p0;
             }
             break;
           case 0xe98dd2cf:
             if (p0.equals("is_unfold")) {
                if (!this.E().h()) {
                   str = "FALSE";
                }
                return str;
             }
             break;
           case 0x23254935:
             if (p0.equals("static_reason")) {
                p0 = (this.v0())? "no_copyright": "demotion";
                return p0;
             }
             break;
           case 0x324c9575:
             if (p0.equals("music_id")) {
                MusicWheelElement tD = this.D;
                if (tD != null) {
                   tD = tD.getId();
                   if (tD != null) {
                      str1 = tD;
                   }
                }
                return str1;
             }
             break;
           case 0x7c1cd672:
             if (p0.equals("is_turn")) {
                if (!this.r0()) {
                   str = "FALSE";
                }
                return str;
             }
             break;
           default:
       }
    label_0082 :
       return str1;
    }
    public final boolean u0(){
       Object obj = PatchProxy.apply(null, this, MusicWheelElement.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = this.F.getValue();
       }
       return obj.booleanValue();
    }
    public final boolean v0(){
       PhotoMeta mMusicStrate;
       MusicWheelElement obj = PatchProxy.apply(null, this, MusicWheelElement.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.t;
       if (obj == null) {
          a.S("mPhoto");
       }
       QPhoto mEntity = obj.mEntity;
       MusicStrategy musicStrateg = null;
       if (mEntity instanceof VideoFeed) {
          mMusicStrate = mEntity.mPhotoMeta.mMusicStrategy;
          if (mMusicStrate != null) {
             musicStrateg = mMusicStrate.mIsNeedMuted;
          }
       }else if(mEntity instanceof ImageFeed){
          mMusicStrate = mEntity.mPhotoMeta.mMusicStrategy;
          if (mMusicStrate != null) {
             musicStrateg = mMusicStrate.mIsNeedMuted;
          }
       }
       return musicStrateg;
    }
    public final void w0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MusicWheelElement.class, "17")) {
          return;
       }
       Object[] objArray1 = new Object[0];
       o.C().w("MusicWheelElement", "startExtend", objArray1);
       if (j.o() > 0) {
          c.F((c.k() + 1));
       }
       r or = this.E();
       Objects.requireNonNull(or);
       if (!PatchProxy.applyVoid(objArray, or, r.class, "10")) {
          Boolean tRUE = Boolean.TRUE;
          if (a.g(or.f.a(), tRUE) ^ 0x01) {
             or.f.f(tRUE);
          }
       }
       return;
    }
    public final void x0(int p0){
       MusicWheelElement musicWheelEl = MusicWheelElement.class;
       if (PatchProxy.isSupport(musicWheelEl) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, musicWheelEl, "20")) {
          return;
       }
       if (p0 != 3) {
          if (p0 == 4) {
             Objects.requireNonNull(s.e);
             this.E().i();
          }
       }else {
          this.E().l();
       }
       return;
    }
    public final void y0(){
       if (PatchProxy.applyVoid(null, this, MusicWheelElement.class, "8")) {
          return;
       }
       MusicWheelElement tC = this.C;
       if (tC != null) {
          tC.m0(this.J);
       }
       this.E().g();
       return;
    }
    public final void z0(){
       MusicWheelElement tE;
       User user;
       CDNUrl[] avatars;
       MusicWheelElement tD;
       Music mUserProfile;
       UserInfo mHeadUrls;
       Music mUserProfile1;
       Object[] objArray2;
       MusicWheelElement tD1;
       Music mImageUrls;
       UserInfo mHeadUrl1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MusicWheelElement.class, "12")) {
          return;
       }
       String str = "MusicWheelElement";
       String str1 = "mPhoto";
       int i = 0;
       if (SlidePerformanceExp.a().b()) {
          tE = this.E;
          if (tE != null && !tE.a()) {
             tE = this.t;
             if (tE == null) {
                a.S(str1);
             }
             user = tE.getUser();
             avatars = (user != null)? user.getAvatars(): objArray;
             MusicWheelElement tt = this.t;
             if (tt == null) {
                a.S(str1);
             }
             User user1 = tt.getUser();
             String avatar = (user1 != null)? user1.getAvatar(): objArray;
             if (this.s0(avatars, avatar)) {
                Object[] objArray1 = new Object[i];
                o.C().w(str, "updateCover-user?.avatars", objArray1);
                f uof = f.x();
                tt = this.t;
                if (tt == null) {
                   a.S(str1);
                }
                user1 = tt.getUser();
                CDNUrl[] avatars1 = (user1 != null)? user1.getAvatars(): objArray;
                uof = uof.r(avatars1);
                tt = this.t;
                if (tt == null) {
                   a.S(str1);
                }
                User user2 = tt.getUser();
                str1 = (user2 != null)? user2.getAvatar(): objArray;
                uof = uof.t(str1);
                uof.g(HeadImageSize.ADJUST_MIDDLE.getSize());
                uof = uof.o(a1.e(24.00f), a1.e(24.00f));
             label_00ab :
                if (uof == null) {
                   tD = this.D;
                   if (tD != null) {
                      mUserProfile = tD.mUserProfile;
                      if (mUserProfile != null) {
                         mHeadUrls = mUserProfile.mHeadUrls;
                      label_00b9 :
                         if (tD != null) {
                            mUserProfile1 = tD.mUserProfile;
                            if (mUserProfile1 != null) {
                               UserInfo mHeadUrl = mUserProfile1.mHeadUrl;
                            label_00c3 :
                               if (this.s0(mHeadUrls, mHeadUrl)) {
                                  objArray2 = new Object[i];
                                  o.C().w(str, "updateCover-mMusic?.mUserProfile?.mHeadUrls", objArray2);
                                  uof = f.x();
                                  tD = this.D;
                                  if (tD != null) {
                                     mUserProfile1 = tD.mUserProfile;
                                     if (mUserProfile1 != null) {
                                        mHeadUrl = mUserProfile1.mHeadUrls;
                                     label_00e4 :
                                        uof = uof.r(mHeadUrl);
                                        tD = this.D;
                                        if (tD != null) {
                                           mUserProfile1 = tD.mUserProfile;
                                           if (mUserProfile1 != null) {
                                              mHeadUrl = mUserProfile1.mHeadUrl;
                                           label_00f4 :
                                              uof = uof.t(mHeadUrl);
                                              uof.g(HeadImageSize.ADJUST_MIDDLE.getSize());
                                              uof = uof.o(a1.e(24.00f), a1.e(24.00f));
                                           }
                                        }
                                        objArray2 = objArray;
                                        goto label_00f4 ;
                                     }
                                  }
                                  objArray2 = objArray;
                                  goto label_00e4 ;
                               }
                            }
                         }
                         objArray2 = objArray;
                         goto label_00c3 ;
                      }
                   }
                   mHeadUrls = objArray;
                   goto label_00b9 ;
                }
                if (uof == null) {
                   tD = this.D;
                   mUserProfile = (tD != null)? tD.mImageUrls: objArray;
                   mUserProfile1 = (tD != null)? tD.mImageUrl: objArray;
                   if (this.s0(mUserProfile, mUserProfile1)) {
                      objArray2 = new Object[i];
                      o.C().w(str, "updateCover-mMusic?.mImageUrls", objArray2);
                      uof = f.x();
                      tD1 = this.D;
                      mImageUrls = (tD1 != null)? tD1.mImageUrls: objArray;
                      uof = uof.r(mImageUrls);
                      tD1 = this.D;
                      if (tD1 != null) {
                         objArray = tD1.mImageUrl;
                      }
                      uof = uof.t(objArray);
                      uof.g(a1.e(24.00f));
                      uof = uof.o(a1.e(24.00f), a1.e(24.00f));
                   }
                }
                if (uof == null) {
                   e[] uoeArray = new e[i];
                   this.E().j(uoeArray);
                }else {
                   e[] uoeArray1 = uof.w();
                   a.o(uoeArray1, "imageRequestGroupBuilder!!.buildRequests\(\)");
                   this.E().j(uoeArray1);
                }
             }
          }
       label_00aa :
          Object[] objArray3 = objArray;
          goto label_00ab ;
       }else {
          Object[] objArray4 = new Object[i];
          o.C().w(str, "updateCover-coverUrls", objArray4);
          tE = this.D;
          if (tE != null) {
             mImageUrls = tE.mUserProfile;
             if (mImageUrls != null) {
                UserInfo mHeadUrls1 = mImageUrls.mHeadUrls;
             label_019d :
                if (tE != null) {
                   Music mUserProfile2 = tE.mUserProfile;
                   if (mUserProfile2 != null) {
                      mHeadUrl1 = mUserProfile2.mHeadUrl;
                   label_01a7 :
                      String[] stringArray = e0.b(mHeadUrls1, mHeadUrl1);
                      if (stringArray != null) {
                         objArray4 = (!stringArray.length)? 1: 0;
                         if (!objArray4) {
                         label_01b7 :
                            if (i) {
                               tE = this.D;
                               mImageUrls = (tE != null)? tE.mImageUrls: objArray;
                               mUserProfile2 = (tE != null)? tE.mImageUrl: objArray;
                               stringArray = e0.b(mImageUrls, mUserProfile2);
                            }
                            tD1 = this.E;
                            if (tD1 != null && !tD1.a()) {
                               tE = this.t;
                               if (tE == null) {
                                  a.S(str1);
                               }
                               user = tE.getUser();
                               avatars = (user != null)? user.getAvatars(): objArray;
                               tD1 = this.t;
                               if (tD1 == null) {
                                  a.S(str1);
                               }
                               User user3 = tD1.getUser();
                               if (user3 != null) {
                                  objArray = user3.getAvatar();
                               }
                               stringArray = e0.b(avatars, objArray);
                            }
                            a.o(stringArray, "coverUrls");
                            this.E().k(stringArray);
                         }
                      }
                      i = 1;
                      goto label_01b7 ;
                   }
                }
                mHeadUrl1 = objArray;
                goto label_01a7 ;
             }
          }
          Object[] objArray5 = objArray;
          goto label_019d ;
       }
       return;
    }
}
