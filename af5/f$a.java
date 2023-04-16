package af5.f$a;
import d6a.a;
import af5.f;
import com.yxcorp.gifshow.log.d0;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.yxcorp.utility.Log;
import im8.f;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import com.kwai.framework.model.feed.BaseFeed;
import wd5.p;
import k2b.v2;
import a95.a;
import k2b.g3;
import java.util.Objects;
import java.lang.Number;
import qvb.i;
import g3a.a;
import wvb.e;
import k2b.e2;
import lnc.i3;
import java.lang.Integer;
import kp.r1;
import java.lang.Boolean;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.feature.api.feed.detail.router.DetailLogParam;
import java.util.Map;
import ekd.q;
import java.util.Set;
import java.util.Iterator;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTransList;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTrans;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import k2b.k2;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.gifshow.log.c0;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.log.g$b;
import com.kuaishou.weapon.i.WeaponHI;
import p1a.a;
import af5.g;
import p1a.a$a;
import com.yxcorp.gifshow.events.realaction.RealAction$ExtParams;
import com.yxcorp.gifshow.action.c;
import com.yxcorp.gifshow.util.rx.RxBus;
import jsa.e;

public class f$a extends a	// class@000095
{
    public final f b;

    public void f$a(f p0){
       this.b = p0;
       super();
    }
    public void i2(){
       int i;
       int i1;
       String str;
       f$a uoa1;
       f r;
       RealAction$ExtParams obj3;
       int i2;
       int i3;
       f x;
       f r1;
       d0 uod01;
       Object obj = this;
       d0 uod0 = d0.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f uof = f.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, f$a.class, "1")) {
          return;
       }
       if (obj.b.x != null) {
          Log.g("GROOT", "RealShowPresenter - attached: "+obj.b.r.toString()+" sourceType = "+obj.b.x.a()+" mViewPager.getCurrentItem = "+obj.b.x.j()+" getCurrentShowIndex = "+obj.b.x.j());
       }
       f$a b = obj.b;
       f t = b.t;
       if (t != null) {
          t.a(b.r.mEntity, b.q.get());
       }
       if (!obj.b.r.isShowed()) {
          obj.b.r.setShowed(true);
          b = obj.b;
          f v = b.v;
          if (v != null) {
             v.a(b.r);
          }
          if (obj.b.A.b()) {
             g3.c();
          }
          b = obj.b;
          Objects.requireNonNull(b);
          g obj1 = PatchProxy.apply(objArray, b, uof, "9");
          f$a uoa = null;
          if (obj1 != patchProxyRe) {
             i = obj1.intValue();
          }else {
             f x1 = b.x;
             i = (x1 != null)? x1.c(): 0;
          }
          boolean b1 = 3;
          f uof1 = 2;
          if (i == 1) {
             i1 = 2;
          }else if(i == uof1){
             i1 = 3;
          }else {
             i1 = 5;
          }
          b = obj.b;
          Objects.requireNonNull(b);
          f obj2 = PatchProxy.apply(objArray, b, uof, "6");
          if (obj2 != patchProxyRe) {
             str = obj2;
          }else {
             i oi = PatchProxy.apply(objArray, b, uof, "10");
             if (oi != patchProxyRe) {
             }else {
                obj2 = b.x;
                oi = (obj2 != null)? obj2.X0(): objArray;
             }
             if (oi instanceof a) {
                oi = oi.m();
                if (oi instanceof e2) {
                   str = oi.a(b.r);
                }
             }
             str = objArray;
          }
          i3 oi3 = i3.f();
          oi3.c("video_start_type", Integer.valueOf(obj.b.r.getVideoColdStartType()));
          oi3.c("support_type", Integer.valueOf(obj.b.r.getSupportType()));
          if (r1.l3(obj.b.r.mEntity)) {
             oi3.d("photo_type", "PANORAMIC_PHOTO");
          }
          if (obj.b.A.b()) {
             oi3.c("session_index", Integer.valueOf(g3.a()));
             if (r1.S2(obj.b.r.getEntity())) {
                oi3.c("live_stream_session_gap", Integer.valueOf(g3.b()));
                g3.d();
             }
          }
          if (r1.x2(obj.b.r.mEntity)) {
             oi3.a("is_cache", Boolean.TRUE);
          }
          obj2 = obj.b.p;
          if (obj2 != null && obj2.getBizType() == 19) {
             oi3.d("page", "DETAIL");
          }
          obj2 = obj.b.p;
          if (obj2 != null && obj2.getDetailLogParam() != null) {
             Map immutableRea = obj.b.p.getDetailLogParam().getImmutableRealShowExtraParamMap();
             if (!q.h(immutableRea)) {
                Iterator iterator = immutableRea.keySet().iterator();
                while (iterator.hasNext()) {
                   String str1 = iterator.next();
                   oi3.d(str1, immutableRea.get(str1));
                   uoa1 = null;
                }
             }
          }
          String str2 = oi3.e();
          if (r1.S2(obj.b.r.getEntity())) {
             uoa1 = obj.b;
             Objects.requireNonNull(uoa1);
             if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidThreeRefs(str, Integer.valueOf(i1), str2, uoa1, f.class, "5")) {
                ClientEvent$ExpTagTransList uExpTagTrans = new ClientEvent$ExpTagTransList();
                ClientEvent$ExpTagTrans[] uExpTagTrans1 = new ClientEvent$ExpTagTrans[true];
                uExpTagTrans.expTagTrans = uExpTagTrans1;
                ClientEvent$ExpTagTrans uExpTagTrans2 = new ClientEvent$ExpTagTrans();
                uExpTagTrans2.serverExpTag = r1.I1(uoa1.r.mEntity);
                uExpTagTrans.expTagTrans[uoa] = uExpTagTrans2;
                k2 ok2 = b.a(0x4b316083).Q();
                if (ok2 != null) {
                   ClientEvent$UrlPackage urlPackage = ok2.e(true);
                   if (!TextUtils.isEmpty(urlPackage.entryPageSource)) {
                      urlPackage = urlPackage.entryPageSource;
                   label_0253 :
                      if (!TextUtils.isEmpty(str)) {
                         x = uoa1.r;
                         uod0 = d0.i(x.mEntity, str, x.getPosition(), i1, urlPackage, uExpTagTrans);
                         uod0.c(str2);
                         c0.q().n(uod0);
                      }else {
                         QPhoto mEntity = uoa1.r.mEntity;
                         if (PatchProxy.isSupport(uod0)) {
                            uod0 = PatchProxy.applyFourRefs(mEntity, Integer.valueOf(i1), urlPackage, uExpTagTrans, null, d0.class, "12");
                            if (uod0 != patchProxyRe) {
                            label_02aa :
                               uod0.c(str2);
                               c0.q().n(uod0);
                            }
                         }
                         uod0 = d0.b(mEntity, null, -1, i1, urlPackage, uExpTagTrans, false, true, 2);
                         goto label_02aa ;
                      }
                   }
                }
                uoa = null;
                goto label_0253 ;
             }
          }else {
             uoa1 = obj.b;
             Objects.requireNonNull(uoa1);
             if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidThreeRefs(str, Integer.valueOf(i1), str2, uoa1, f.class, "4")) {
                obj2 = uoa1.p;
                BaseFeed entranceFeed = (obj2 != null)? obj2.getEntranceFeed(): null;
                if (!TextUtils.isEmpty(str)) {
                   r = uoa1.y;
                   r1 = uoa1.r;
                   QPhoto mEntity1 = r1.mEntity;
                   int position = r1.getPosition();
                   if (PatchProxy.isSupport(uod0)) {
                      Object[] objArray1 = new Object[]{r,entranceFeed,mEntity1,str,Integer.valueOf(position),Integer.valueOf(i1)};
                      uod0 = PatchProxy.apply(objArray1, null, uod0, "13");
                      if (uod0 != patchProxyRe) {
                      label_0331 :
                         uod0.c(str2);
                         c0.q().n(uod0);
                      }
                   }
                   uod01 = new d0(mEntity1, str, position, i1, d0.a(entranceFeed, r, String.valueOf(true)).b());
                   uod0 = b1;
                   goto label_0331 ;
                }else {
                   v = uoa1.y;
                   QPhoto mEntity2 = uoa1.r.mEntity;
                   if (PatchProxy.isSupport(uod0)) {
                      uod0 = PatchProxy.applyFourRefs(v, entranceFeed, mEntity2, Integer.valueOf(i1), null, d0.class, "10");
                      if (uod0 != patchProxyRe) {
                      label_0376 :
                         uod0.c(str2);
                         c0.q().n(uod0);
                      }
                   }
                   uod01 = new d0(mEntity2, null, -1, i1, d0.a(entranceFeed, v, String.valueOf(true)).b());
                   uod0 = uoa1;
                   goto label_0376 ;
                }
             }
          }
          uoa = obj.b;
          r = uoa.r;
          Objects.requireNonNull(uoa);
          obj3 = PatchProxy.apply(null, uoa, uof, "2");
          if (obj3 != patchProxyRe) {
             i2 = obj3.intValue();
          }else {
             x = uoa.x;
             if (x != null) {
                i2 = x.j();
             }else {
                i3 = -1;
             label_03a3 :
                Objects.requireNonNull(uoa);
                if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidTwoRefs(r, Integer.valueOf(i3), uoa, uof, "3")) {
                   WeaponHI.setI(r.getPhotoId(), r.isAd());
                   if (uoa.w.get() != null) {
                      obj1 = new g(uoa, 0, 804, "show_photo", r, i3);
                      uoa.w.get().b(patchProxyRe);
                   }
                }
             }
          }
          i3 = i2;
          goto label_03a3 ;
       }
    label_03e4 :
       if (!obj.b.r.isRecShowed()) {
          obj.b.r.setRecShowed(true);
          obj3 = RealAction$ExtParams.newInstance();
          obj3.mHyperTagRecoLogInfo = r1.V0(obj.b.r.mEntity);
          obj3.mIsPrefetch = obj.b.r.isPrefetch();
          c.e(obj.b.y.o(), true, obj.b.r.mEntity, obj3);
          RxBus.f.b(new e(obj.b.y.o(), obj.b.r.mEntity));
       }
       return;
    }
}
