package com.yxcorp.gifshow.detail.fragments.milano.presenter.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import yqb.l;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.fragments.milano.presenter.f$a;
import qw6.a;
import sy6.a;
import crd.b;
import lnc.b9;
import com.yxcorp.gifshow.entity.QPhoto;
import hf5.b;
import com.kwai.robust.PatchProxyResult;
import d0a.i;
import com.kuaishou.android.model.mix.PostShowInfo;
import brd.y;
import java.lang.Boolean;
import com.kwai.framework.model.user.User;
import tl8.d;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.detail.util.DetailSpecialCameraHelper;
import java.util.Objects;
import ixc.c;
import brd.t;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.kuaishou.android.model.mix.w;
import kotlin.jvm.internal.a;
import lnc.pa;
import lnc.qa;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a0;
import m9a.g;
import com.kwai.framework.model.feed.BaseFeed;
import erd.o;
import m9a.h;
import t45.d;
import brd.z;
import m9a.i;
import v0a.l0;
import com.yxcorp.gifshow.detail.fragments.milano.presenter.e;
import erd.g;
import hf5.g;

public class f extends PresenterV2	// class@001528
{
    public a p;
    public g q;
    public b r;
    public y s;
    public final l t;
    public b u;
    public a v;

    public void f(){
       super(new l());
    }
    public void f(l p0){
       super();
       this.t = p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, f.class, "2")) {
          return;
       }
       this.P8();
       if (this.p != null) {
          f$a uoa = new f$a(this);
          this.v = uoa;
          this.p.h(uoa);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, f.class, "3")) {
          return;
       }
       b9.a(this.u);
       this.u = null;
       f tp = this.p;
       if (tp != null) {
          tp.l(this.v);
          this.v = null;
       }
       return;
    }
    public void P8(){
       boolean b1;
       t ot;
       boolean b3;
       t ot1;
       f uof = f.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uof, "4")) {
          return;
       }
       QPhoto currentPhoto = this.r.getCurrentPhoto();
       Object[] objArray1 = (currentPhoto == null)? objArray: currentPhoto.mEntity;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (!PatchProxy.applyVoidOneRefs(objArray1, this, uof, "6")) {
          b9.a(this.u);
          this.u = objArray;
          int i = 1;
          if (objArray1 == null) {
             this.s.onNext(new i(i, objArray));
          }else {
             DetailSpecialCameraHelper obj = PatchProxy.applyOneRefs(objArray1, this, uof, "7");
             boolean b = false;
             if (obj != patchProxyRe) {
                b1 = obj.booleanValue();
             }else if(this.t.a != null && (objArray1.a(User.class) != null && TextUtils.n(objArray1.a(User.class).mId, QCurrentUser.ME.getId()))){
                b1 = true;
             }else {
                b1 = false;
             }
             if (b1) {
                this.s.onNext(new i(i, objArray));
             }else {
                obj = DetailSpecialCameraHelper.c;
                boolean b2 = (this.p.z() == i)? true: false;
                Objects.requireNonNull(obj);
                DetailSpecialCameraHelper uDetailSpeci = DetailSpecialCameraHelper.class;
                if (PatchProxy.isSupport(uDetailSpeci)) {
                   ot = PatchProxy.applyTwoRefs(objArray1, Boolean.valueOf(b2), obj, uDetailSpeci, "3");
                   if (ot != patchProxyRe) {
                   }else {
                   label_00a9 :
                      Object obj1 = PatchProxy.applyOneRefs(objArray1, obj, uDetailSpeci, "5");
                      if (obj1 != patchProxyRe) {
                         b3 = obj1.booleanValue();
                      }else if(objArray1.a(PhotoMeta.class) != null && w.a0(objArray1.a(PhotoMeta.class)) != null){
                         b3 = true;
                      }else {
                         b3 = false;
                      }
                      if (!b3) {
                         ot = t.just(new i(i, objArray));
                         a.o(ot, "Observable.just\(PhotoCam¡­Type.HIDE,\n        null\)\)");
                      }else {
                         a.m(objArray1);
                         PostShowInfo postShowInfo = w.a0(objArray1.a(PhotoMeta.class));
                         if (postShowInfo.mType != 2) {
                            b = true;
                         }
                         c uoc = qa.r(c.class);
                         if (postShowInfo.mType == i && uoc == null) {
                            ot1 = qa.s(c.class, LoadPolicy.SILENT_IF_DOWNLOADED).w(new g(objArray1, postShowInfo)).onErrorReturn(new h(objArray1, postShowInfo, uoc)).observeOn(d.a);
                            a.o(ot1, "VideoPluginManager.load\(¡­veOn\(KwaiSchedulers.MAIN\)");
                         }else {
                            a.o(postShowInfo, "postShowInfo");
                            ot1 = t.just(Boolean.valueOf(obj.c(objArray1, postShowInfo, uoc)));
                            a.o(ot1, "Observable.just\(getShoul¡­magicEmojiPluginManager\)\)");
                         }
                         ot = ot1.map(new i(postShowInfo, objArray1, b2, b));
                         a.o(ot, "shouldShowSpecialCameraI¡­HIDE, null\)\n      }\n    }");
                      }
                   }
                }else {
                   goto label_00a9 ;
                }
                this.u = ot.observeOn(d.a).subscribe(new l0(this), e.b);
             }
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       this.s = this.r8("NASA_DETAIL_SPECIAL_CAMERA_OBSERVER");
       this.p = this.q8(a.class);
       this.q = this.q8(g.class);
       this.r = this.q8(b.class);
       return;
    }
}
