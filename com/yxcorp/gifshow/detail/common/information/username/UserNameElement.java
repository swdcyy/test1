package com.yxcorp.gifshow.detail.common.information.username.UserNameElement;
import com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement;
import com.yxcorp.gifshow.activity.GifshowActivity;
import jh5.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import xq7.d;
import rp7.a;
import com.yxcorp.gifshow.detail.common.information.username.UserNameElement$m;
import com.yxcorp.gifshow.detail.common.information.username.UserNameElement$mExperimentVideoVisibleLimitValue$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import qp7.a;
import v6a.m0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import le5.a;
import java.lang.StringBuilder;
import uw9.o;
import q87.c;
import rq7.a;
import com.kwai.robust.PatchProxyResult;
import sr7.t;
import eh5.l;
import java.lang.Long;
import java.lang.Boolean;
import com.yxcorp.gifshow.detail.common.information.username.UserNameElement$e;
import qp7.b1;
import qp7.b;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import com.yxcorp.gifshow.nasa.NasaSlideSerialParam;
import wkd.b;
import hn5.f0;
import hn5.f0$a;
import qp7.x0;
import lnc.a1;
import com.kwai.component.uiconfig.homeslideplay.NasaSlidePlayExperimentUtil;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import java.util.Objects;
import java.lang.Integer;
import pp7.b;
import com.kwai.framework.model.user.User;
import av7.f;
import brd.a0;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.detail.common.information.username.UserNameElement$f;
import com.yxcorp.gifshow.detail.common.information.username.UserNameElement$g;
import erd.g;
import crd.b;
import com.kuaishou.android.model.mix.CoCreateInfo;
import qp7.c;
import sr7.r;
import com.yxcorp.gifshow.detail.common.information.username.UserNameElement$h;
import io.reactivex.internal.functions.Functions;
import com.yxcorp.gifshow.detail.common.information.username.UserNameElement$i;
import com.yxcorp.gifshow.detail.common.information.username.UserNameElement$j;
import com.yxcorp.gifshow.detail.common.information.username.UserNameElement$k;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import com.yxcorp.gifshow.detail.common.information.username.UserNameElement$b;
import qp7.t0;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.smile.gifmaker.mvps.utils.DefaultSyncable;
import com.yxcorp.gifshow.detail.common.information.username.UserNameElement$c;
import com.yxcorp.gifshow.detail.common.information.username.UserNameElement$l;
import qp7.g;
import xq7.e;
import com.yxcorp.gifshow.detail.common.information.username.UserNameElement$d;
import im8.f;
import qp7.d;
import sr7.q;
import com.kuaishou.android.model.mix.w;
import wh5.c;
import com.kwai.framework.model.user.UserVerifiedDetail;
import com.kwai.slide.play.detail.information.username.UserIconType;
import com.kuaishou.android.model.feed.VisibilityExpiration;
import java.lang.CharSequence;
import com.yxcorp.gifshow.detail.common.information.username.UserNameElement$a;
import dy9.a;
import android.content.Context;

public final class UserNameElement extends DispatchBaseElement	// class@00146e
{
    public final f0$a A;
    public final p B;
    public String C;
    public NasaBizParam D;
    public m0 E;
    public final GifshowActivity F;
    public final int G;
    public QPhoto t;
    public PhotoDetailParam u;
    public a v;
    public BaseFragment w;
    public b x;
    public boolean y;
    public a z;

    public void UserNameElement(GifshowActivity p0,int p1,a p2){
       a.p(p0, "activity");
       super(d.j, p2);
       this.F = p0;
       this.G = p1;
       this.A = new UserNameElement$m(this);
       this.B = s.c(UserNameElement$mExperimentVideoVisibleLimitValue$2.INSTANCE);
    }
    public static final QPhoto n0(UserNameElement p0){
       p0 = p0.t;
       if (p0 == null) {
          a.S("mPhoto");
       }
       return p0;
    }
    public static final PhotoDetailParam o0(UserNameElement p0){
       p0 = p0.u;
       if (p0 == null) {
          a.S("mPhotoDetailParam");
       }
       return p0;
    }
    public void P(a p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, UserNameElement.class, "2")) {
       }else {
          a.p(p0, "callerContext");
          this.E = p0;
          PhotoDetailParam mPhoto = p0.c.mPhoto;
          a.o(mPhoto, "callerContext.mPhotoDetailParam.mPhoto");
          this.t = mPhoto;
          a c = p0.c;
          a.o(c, "callerContext.mPhotoDetailParam");
          this.u = c;
          m0 o = p0.o;
          a.o(o, "callerContext.mLogListener");
          this.v = o;
          this.D = p0.h;
          p0 = p0.b;
          a.o(p0, "callerContext.mFragment");
          this.w = p0;
          StringBuilder str = "id = "+this.hashCode()+", action = bindData, currentPhotoId = ";
          UserNameElement tt = this.t;
          if (tt == null) {
             a.S("mPhoto");
          }
          Object[] objArray = new Object[0];
          o.C().w("UserNameElement", str+tt.getPhotoId(), objArray);
          PatchProxy.onMethodExit(UserNameElement.class, "2");
       }
       return;
    }
    public a f0(a p0){
       t ot = PatchProxy.applyOneRefs(p0, this, UserNameElement.class, "14");
       if (ot != PatchProxyResult.class) {
       }else {
          ot = new t(p0);
       }
       return ot;
    }
    public void g(long p0,l p1,boolean p2,boolean p3){
       if (PatchProxy.isSupport(UserNameElement.class) && PatchProxy.applyVoidFourRefs(Long.valueOf(p0), p1, Boolean.valueOf(p2), Boolean.valueOf(p3), this, UserNameElement.class, "18")) {
          return;
       }
       a.p(p1, "type");
       Object[] objArray = new Object[0];
       o.C().w("UserNameElement", "id = "+this.hashCode()+", action = cancelTasks, batchId = "+p0+", type = "+p1.getStage()+", overStep = "+p2+", flushRemain = "+p3, objArray);
       super.g(p0, p1, p2, p3);
       return;
    }
    public void j0(boolean p0){
       NasaSlideSerialParam mCommercialA;
       String id;
       UserNameElement tt2;
       t ot;
       UserNameElement tw;
       Object[] objArray1;
       String str2;
       int i1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       UserNameElement userNameElem = UserNameElement.class;
       if (PatchProxy.isSupport(userNameElem) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, userNameElem, "3")) {
          return;
       }
       this.i(new UserNameElement$e(this));
       UserNameElement tD = this.D;
       if (tD != null) {
          NasaSlideParam nasaSlidePar = tD.getNasaSlideParam();
          if (nasaSlidePar != null) {
             nasaSlidePar = nasaSlidePar.mNasaSlideSerialParam;
             if (nasaSlidePar != null) {
                mCommercialA = nasaSlidePar.mCommercialActiveCallback;
             label_0034 :
                this.C = mCommercialA;
                f0 uof0 = b.a(0x238e5b38);
                UserNameElement tt = this.t;
                if (tt == null) {
                   a.S("mPhoto");
                }
                uof0.a(tt.getPhotoId(), this.A);
                StringBuilder str = "id = "+this.hashCode()+", action = addPhotoCountChangeListener, currentPhotoId = ";
                tt = this.t;
                if (tt == null) {
                   a.S("mPhoto");
                }
                int i = 0;
                Object[] objArray = new Object[i];
                o.C().w("UserNameElement", str+tt.getPhotoId()+", async = "+p0, objArray);
                this.y = i;
                String str1 = "1";
                UserNameElement$g og = 1;
                if (!PatchProxy.applyVoid(null, this, userNameElem, "5")) {
                   if (this.r0()) {
                      this.E().h(null);
                   }else {
                      ot = this.E();
                      tt2 = this.t;
                      if (tt2 == null) {
                         a.S("mPhoto");
                      }
                      if (tt2.isLongPhotos()) {
                         str2 = a1.p(R.string.arg_RES_7f1030c7);
                      }else {
                         tt2 = this.t;
                         if (tt2 == null) {
                            a.S("mPhoto");
                         }
                         if (tt2.isAtlasPhotos()) {
                            str2 = a1.p(R.string.arg_RES_7f104b99);
                         }else if(NasaSlidePlayExperimentUtil.j()){
                            tt2 = this.t;
                            if (tt2 == null) {
                               a.S("mPhoto");
                            }
                            if (tt2.isVideoType()) {
                               tt2 = this.t;
                               if (tt2 == null) {
                                  a.S("mPhoto");
                               }
                               if (r1.l3(tt2.getEntity())) {
                                  str2 = a1.p(R.string.arg_RES_7f103b68);
                               }
                            }
                         }
                      label_0109 :
                         str2 = null;
                      }
                      ot.h(str2);
                      ot = this.E();
                      tt2 = this.t;
                      if (tt2 == null) {
                         a.S("mPhoto");
                      }
                      if (tt2.isLongPhotos()) {
                         i1 = 1;
                      }else {
                         tt2 = this.t;
                         if (tt2 == null) {
                            a.S("mPhoto");
                         }
                         if (tt2.isAtlasPhotos()) {
                            i1 = 2;
                         }else if(NasaSlidePlayExperimentUtil.j()){
                            tt2 = this.t;
                            if (tt2 == null) {
                               a.S("mPhoto");
                            }
                            if (tt2.isVideoType()) {
                               tt2 = this.t;
                               if (tt2 == null) {
                                  a.S("mPhoto");
                               }
                               if (r1.l3(tt2.getEntity())) {
                                  i1 = 3;
                               }
                            }
                         }
                      label_0157 :
                         i1 = 0;
                      }
                      Objects.requireNonNull(ot);
                      if (!PatchProxy.isSupport(t.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i1), ot, t.class, str1)) {
                         ot.m.f(Integer.valueOf(i1));
                      }
                   }
                }
                UserNameElement tt1 = this.t;
                if (tt1 == null) {
                   a.S("mPhoto");
                }
                User user = tt1.getUser();
                a.o(user, "mPhoto.user");
                id = user.getId();
                tt2 = this.t;
                if (tt2 == null) {
                   a.S("mPhoto");
                }
                User mName = tt2.getUser().mName;
                a0 uoa0 = PatchProxy.applyTwoRefs(id, mName, null, f.class, str1);
                if (uoa0 != patchProxyRe) {
                }else {
                   t[] otArray = new t[og];
                   otArray[i] = f.a(id);
                   uoa0 = f.b(mName, otArray);
                }
                b uob = uoa0.T(d.c).G(d.a).R(new UserNameElement$f(this), new UserNameElement$g(this));
                a.o(uob, "UserNameHelper.getUserNa¡­tVerfiedIcon\(\)\n        }\)");
                this.j(uob);
                ot = this.E();
                userNameElem = this.t;
                if (userNameElem == null) {
                   a.S("mPhoto");
                }
                CoCreateInfo coCreateInfo = userNameElem.getCoCreateInfo();
                coCreateInfo = (coCreateInfo != null)? coCreateInfo.mLabelText: null;
                Objects.requireNonNull(ot);
                if (!PatchProxy.applyVoidOneRefs(coCreateInfo, ot, t.class, "11")) {
                   ot.o.f(coCreateInfo);
                }
                this.t0();
                this.u0();
                ot = this.E();
                userNameElem = this.G;
                Objects.requireNonNull(ot);
                if (!PatchProxy.isSupport(t.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(userNameElem), ot, t.class, "13")) {
                   ot.i.f(Integer.valueOf(userNameElem));
                }
                g og1 = Functions.d();
                a.o(og1, "Functions.emptyConsumer\(\)");
                this.j(this.A().a(new UserNameElement$h(this), og1));
                tt1 = this.t;
                if (tt1 == null) {
                   a.S("mPhoto");
                }
                uob = tt1.observePostChange().subscribe(new UserNameElement$i(this), UserNameElement$j.b);
                a.o(uob, "mPhoto.observePostChange¡­wable.printStackTrace\(\) }");
                this.j(uob);
                r or = this.A();
                UserNameElement$k ok = new UserNameElement$k(this);
                og1 = Functions.e;
                a.o(og1, "Functions.ERROR_CONSUMER");
                Objects.requireNonNull(or);
                b uob1 = PatchProxy.applyTwoRefs(ok, og1, or, r.class, "6");
                if (uob1 != patchProxyRe) {
                }else {
                   a.p(ok, "onNext");
                   a.p(og1, "onError");
                   uob1 = or.c.subscribe(ok, og1);
                   a.o(uob1, "coCreatorClickSubject.subscribe\(onNext, onError\)");
                }
                this.j(uob1);
                tt1 = this.t;
                if (tt1 == null) {
                   a.S("mPhoto");
                }
                PhotoMeta photoMeta = tt1.getPhotoMeta();
                if (photoMeta != null) {
                   uob = photoMeta.observable().subscribe(new UserNameElement$b(this));
                   a.o(uob, "it.observable\(\).subscrib¡­Limit\(\)\n        }\n      }");
                   this.j(uob);
                }
                if (this.H().N()) {
                   tt1 = this.t;
                   if (tt1 == null) {
                      a.S("mPhoto");
                   }
                   user = tt1.getUser();
                   if (user != null) {
                      tw = this.w;
                      if (tw == null) {
                         a.S("mFragment");
                      }
                      user.startSyncWithFragment(tw.m());
                      uob = user.observable().subscribe(new UserNameElement$c(this), UserNameElement$l.b);
                      if (uob != null) {
                         this.j(uob);
                      }
                   }
                }
             label_02f6 :
                if (this.H().d1 != null) {
                   ot = this.E();
                   Objects.requireNonNull(ot);
                   if (!PatchProxy.applyVoid(null, ot, t.class, "21")) {
                      ot.p.f(Boolean.TRUE);
                   }
                }
                a.o(og1, "Functions.ERROR_CONSUMER");
                this.j(this.D().t(new UserNameElement$d(this), og1));
                if (this.r0()) {
                   ot = this.E();
                   tw = this.t;
                   if (tw == null) {
                      a.S("mPhoto");
                   }
                   PhotoMeta photoMeta1 = tw.getPhotoMeta();
                   a.m(photoMeta1);
                   photoMeta1 = photoMeta1.mActivityUserIconMode;
                   a.o(photoMeta1, "mPhoto.photoMeta!!.mActivityUserIconMode");
                   Objects.requireNonNull(ot);
                   if (!PatchProxy.applyVoidOneRefs(photoMeta1, ot, t.class, "24")) {
                      a.p(photoMeta1, "model");
                      ot.n.f(photoMeta1);
                   }
                }else {
                   ot = this.E();
                   Objects.requireNonNull(ot);
                   if (!PatchProxy.applyVoid(null, ot, t.class, "25")) {
                      ot.n.f(null);
                   }
                }
                tt1 = this.E;
                if (tt1 != null) {
                   tt1.A0.set(Boolean.TRUE);
                }
                return;
             }
          }
       }
       mCommercialA = null;
       goto label_0034 ;
    }
    public void l0(boolean p0){
       Object[] objArray;
       UserNameElement userNameElem = UserNameElement.class;
       if (PatchProxy.isSupport(userNameElem) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, userNameElem, "13")) {
          return;
       }
       int i = 0;
       if (this.y == null && this.t != null) {
          f0 uof0 = b.a(0x238e5b38);
          UserNameElement tt = this.t;
          if (tt == null) {
             a.S("mPhoto");
          }
          uof0.b(tt.getPhotoId(), this.A);
          StringBuilder str = "id = "+this.hashCode()+", action = destroy-removePhotoCountChangeListener, "+"currentPhotoId = ";
          tt = this.t;
          if (tt == null) {
             a.S("mPhoto");
          }
          objArray = new Object[i];
          o.C().w("UserNameElement", str+tt.getPhotoId()+", async = "+p0, objArray);
       }else {
          objArray = new Object[i];
          o.C().w("UserNameElement", this.hashCode()+" onDestroy, photo is null", objArray);
       }
       return;
    }
    public void m0(boolean p0){
       UserNameElement userNameElem = UserNameElement.class;
       if (PatchProxy.isSupport(userNameElem) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, userNameElem, "12")) {
          return;
       }
       f0 uof0 = b.a(0x238e5b38);
       UserNameElement tt = this.t;
       String str = "mPhoto";
       if (tt == null) {
          a.S(str);
       }
       uof0.b(tt.getPhotoId(), this.A);
       this.y = true;
       userNameElem = this.E;
       if (userNameElem != null) {
          userNameElem.A0.set(Boolean.FALSE);
       }
       StringBuilder str1 = "id = "+this.hashCode()+", action = unBind-removePhotoCountChangeListener, "+"currentPhotoId = ";
       tt = this.t;
       if (tt == null) {
          a.S(str);
       }
       Object[] objArray = new Object[0];
       o.C().w("UserNameElement", str1+tt.getPhotoId()+", async = "+p0, objArray);
       return;
    }
    public final GifshowActivity p0(){
       return this.F;
    }
    public d q(){
       q oq = PatchProxy.apply(null, this, UserNameElement.class, "16");
       if (oq != PatchProxyResult.class) {
       }else {
          oq = new q();
       }
       return oq;
    }
    public final String q0(){
       Object obj = PatchProxy.apply(null, this, UserNameElement.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.B.getValue();
    }
    public c r(){
       r or = PatchProxy.apply(null, this, UserNameElement.class, "15");
       if (or != PatchProxyResult.class) {
       }else {
          or = new r();
       }
       return or;
    }
    public final boolean r0(){
       UserNameElement obj = PatchProxy.apply(null, this, UserNameElement.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.t;
       if (obj == null) {
          a.S("mPhoto");
       }
       boolean b = (w.C0(obj.getPhotoMeta()) && !c.b())? true: false;
       return b;
    }
    public final void s0(){
       Integer integer;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, UserNameElement.class, "4")) {
          return;
       }
       if (!this.r0()) {
          t ot = this.E();
          UserNameElement tt = this.t;
          if (tt == null) {
             a.S("mPhoto");
          }
          User user = tt.getUser();
          if (user != null) {
             user = user.mVerifiedDetail;
             if (user != null) {
                integer = Integer.valueOf(user.mIconType);
             label_0033 :
                int i = 1;
                if (integer != null && integer.intValue() == i) {
                   objArray = UserIconType.ICON_TYPE_YELLOW;
                }else {
                   i = 2;
                   if (integer != null && integer.intValue() == i) {
                      objArray = UserIconType.ICON_TYPE_BLUE;
                   }else if(integer != null && integer.intValue() == 3){
                      objArray = UserIconType.ICON_TYPE_MUSIC;
                   }
                }
                ot.j(objArray);
             }
          }
          integer = objArray;
          goto label_0033 ;
       }else {
          this.E().j(objArray);
       }
       return;
    }
    public final void t0(){
       VisibilityExpiration mExpiryDays;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, UserNameElement.class, "8")) {
          return;
       }
       boolean b = false;
       if (this.r0()) {
          this.E().k(objArray);
          this.E().g(b);
          return;
       }else {
          UserNameElement tt = this.t;
          if (tt == null) {
             a.S("mPhoto");
          }
          PhotoMeta photoMeta = tt.getPhotoMeta();
          if (photoMeta != null) {
             photoMeta = photoMeta.mVisibilityExpiration;
             if (photoMeta != null) {
                mExpiryDays = photoMeta.mExpiryDays;
             label_003d :
                if (mExpiryDays != null) {
                   if (mExpiryDays != 1) {
                      objArray = this.q0();
                      if (objArray == null) {
                         objArray = a1.q(R.string.arg_RES_7f104869, mExpiryDays);
                      }
                   }else {
                      objArray = this.q0();
                      if (objArray == null) {
                         objArray = a1.p(R.string.arg_RES_7f100c80);
                      }
                   }
                }
                this.E().k(objArray);
                t ot = this.E();
                if (objArray != null && objArray.length() > 0) {
                   b = true;
                }
                ot.g(b);
                return;
             }
          }
          mExpiryDays = null;
          goto label_003d ;
       }
    }
    public final void u0(){
       t ot = t.class;
       Object[] objArray = null;
       String str = "9";
       if (PatchProxy.applyVoid(objArray, this, UserNameElement.class, str)) {
          return;
       }
       if (this.H().Y().b()) {
          a a = a.a;
          UserNameElement tt = this.t;
          String str1 = "mPhoto";
          if (tt == null) {
             a.S(str1);
          }
          UserNameElement tu = this.u;
          if (tu == null) {
             a.S("mPhotoDetailParam");
          }
          if (!a.a(tt, tu)) {
             UserNameElement tF = this.F;
             tt = this.t;
             if (tt == null) {
                a.S(str1);
             }
             UserNameElement tu1 = this.u;
             if (tu1 == null) {
                a.S("mPhotoDetailParam");
             }
             objArray = a.b(tF, tt, tu1, this.H().O());
          }
       }
       t ot1 = this.E();
       Objects.requireNonNull(ot1);
       if (!PatchProxy.applyVoidOneRefs(objArray, ot1, ot, str)) {
          ot1.g.f(objArray);
       }
       ot1 = this.E();
       boolean b = false;
       if (objArray != null && objArray.length() > 0) {
          b = true;
       }
       Objects.requireNonNull(ot1);
       if (!PatchProxy.isSupport(ot) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), ot1, ot, "15")) {
          ot1.j.f(Boolean.valueOf(b));
       }
       return;
    }
}
