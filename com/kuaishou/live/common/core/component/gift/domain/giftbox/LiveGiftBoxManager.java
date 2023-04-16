package com.kuaishou.live.common.core.component.gift.domain.giftbox.LiveGiftBoxManager;
import com.kuaishou.live.common.core.component.gift.base.LifecycleManager;
import androidx.lifecycle.LifecycleOwner;
import vq5.d;
import aq5.d;
import v51.a;
import zg1.g;
import zg1.l;
import zg1.e;
import zg1.d;
import z1.k;
import zg1.b;
import pi1.a;
import om1.e;
import com.kuaishou.live.common.core.component.gift.domain.giftsend.LiveGiftSendModel;
import ih1.l;
import yi1.a;
import ni1.d;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftBoxConfig;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import ih1.f;
import ih1.i;
import yi1.b;
import si1.a;
import ah1.c;
import nsd.u;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.model.LiveGiftBoxRefreshModel;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.LiveGiftBoxManager$d;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.dialog.bottom.LiveGiftBoxPaymentManager;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.router.LiveGiftBoxRouterManager;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.LiveGiftBoxManager$c;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.LiveGiftBoxManager$b;
import java.util.concurrent.CopyOnWriteArrayList;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.LiveGiftBoxManager$1;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.LiveGiftBoxManager$2;
import l73.c0;
import zg1.a;
import zg1.c;
import hka.a;
import l73.d0;
import brd.t;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.LiveGiftBoxManager$a;
import erd.g;
import crd.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ni1.c;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.dialog.LiveGiftBoxDialogVC;
import java.lang.StringBuilder;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftBoxPopupView;
import com.kwai.robust.PatchProxyResult;
import qi1.b;
import ni1.a;
import java.lang.Boolean;
import e17.i;
import wh5.c;
import o79.i;
import java.lang.CharSequence;
import com.kwai.framework.model.user.QCurrentUser;
import lj1.c;
import com.kwai.framework.model.user.UserInfo;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle$State;
import rm1.j;
import java.util.Objects;
import rm1.j$a;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.SelectMode;
import ul1.d;
import ul1.a;
import ch1.c;
import com.yxcorp.gifshow.models.Gift;
import java.util.Map;
import java.util.List;
import com.kuaishou.live.viewcontroller.ViewController;

public final class LiveGiftBoxManager extends LifecycleManager	// class@0011ca
{
    public final k A;
    public final k B;
    public final a C;
    public final e D;
    public final LiveGiftSendModel E;
    public final k F;
    public final k G;
    public final l H;
    public final a I;
    public final k J;
    public final d K;
    public final LiveGiftBoxConfig L;
    public LiveGiftBoxDialogVC c;
    public final f d;
    public final b e;
    public final a f;
    public final c g;
    public b h;
    public final LiveGiftBoxRefreshModel i;
    public final LiveGiftBoxPaymentManager j;
    public final LiveGiftBoxRouterManager k;
    public final c l;
    public final a m;
    public final CopyOnWriteArrayList n;
    public final d o;
    public final d p;
    public final a q;
    public final g r;
    public final l s;
    public final e t;
    public final d u;
    public final k v;
    public final b w;
    public final k x;
    public final k y;
    public final k z;

    public void LiveGiftBoxManager(LifecycleOwner p0,d p1,d p2,a p3,g p4,l p5,e p6,d p7,k p8,b p9,k p10,k p11,k p12,k p13,k p14,a p15,e p16,LiveGiftSendModel p17,k p18,k p19,l p20,a p21,k p22,d p23,LiveGiftBoxConfig p24){
       LiveGiftBoxManager$c obj = p1;
       LiveGiftBoxManager$b obj1 = p2;
       LiveGiftBoxRouterManager obj2 = p3;
       a obj3 = p4;
       Object obj4 = p5;
       LiveGiftSendModel obj5 = p6;
       k obj6 = p7;
       Object obj7 = p8;
       k obj8 = p9;
       Object obj9 = p10;
       Object obj10 = p11;
       Object obj11 = p12;
       Object obj12 = p13;
       LiveGiftSendModel obj13 = p14;
       a.p(p0, "lifecycleOwner");
       a.p(obj, "routerManager");
       a.p(obj1, "bizManager");
       a.p(obj2, "longConnectManager");
       a.p(obj3, "fragmentServiceAdapter");
       a.p(obj4, "userStatusServiceAdapter");
       a.p(obj5, "dialogServiceAdapter");
       a.p(obj6, "dialogNotifyServiceAdapter");
       a.p(obj7, "dialogType");
       a.p(obj8, "backPressedDispatcherAdapter");
       a.p(obj9, "liveStreamId");
       a.p(obj10, "giftApiRequestPathSuffix");
       a.p(obj11, "anchorInfo");
       a.p(obj12, "currentUser");
       a.p(obj13, "liveModel");
       a.p(p15, "loginDependency");
       a.p(p16, "sendGiftTracer");
       a.p(p17, "giftSendModel");
       a.p(p18, "giftRechargeManager");
       a.p(p19, "paymentManager");
       a.p(p20, "giftStoreRepository");
       a.p(p21, "giftBoxDisableModel");
       a.p(p22, "bizLogParams");
       a.p(p23, "giftBoxEventHub");
       a.p(p24, "giftBoxConfig");
       super(p0);
       LifecycleManager lifecycleMan = this;
       lifecycleMan.o = obj;
       lifecycleMan.p = obj1;
       lifecycleMan.q = obj2;
       lifecycleMan.r = obj3;
       lifecycleMan.s = obj4;
       lifecycleMan.t = obj5;
       lifecycleMan.u = obj6;
       lifecycleMan.v = obj7;
       lifecycleMan.w = obj8;
       lifecycleMan.x = obj9;
       lifecycleMan.y = obj10;
       lifecycleMan.z = obj11;
       lifecycleMan.A = obj12;
       lifecycleMan.B = obj13;
       lifecycleMan.C = p15;
       obj13 = p17;
       lifecycleMan.D = p16;
       lifecycleMan.E = obj13;
       obj6 = p19;
       lifecycleMan.F = p18;
       lifecycleMan.G = obj6;
       obj3 = p21;
       lifecycleMan.H = p20;
       lifecycleMan.I = obj3;
       lifecycleMan.J = p22;
       lifecycleMan.K = p23;
       lifecycleMan.L = p24;
       obj8 = obj6;
       obj5 = obj13;
       obj7 = obj12;
       obj1 = obj11;
       f uof = new f(p24, obj9, obj10, p20, p23, p5);
       lifecycleMan.d = v1;
       lifecycleMan.e = new b(obj4);
       lifecycleMan.f = new a();
       c uoc = new c("giftBoxRestoreModel", null, false, true, 6, null);
       lifecycleMan.g = v1;
       LifecycleOwner lifecycleOwn = p0;
       LiveGiftBoxRefreshModel liveGiftBoxR = new LiveGiftBoxRefreshModel(lifecycleOwn, obj2, obj5, new LiveGiftBoxManager$d(lifecycleMan));
       lifecycleMan.i = liveGiftBoxR;
       lifecycleMan.j = new LiveGiftBoxPaymentManager(lifecycleOwn, obj8, obj7);
       obj2 = new LiveGiftBoxRouterManager(lifecycleOwn, obj, lifecycleMan, obj1);
       lifecycleMan.k = obj2;
       obj = new LiveGiftBoxManager$c(lifecycleMan);
       lifecycleMan.l = obj;
       obj1 = new LiveGiftBoxManager$b(lifecycleMan);
       lifecycleMan.m = obj1;
       lifecycleMan.n = new CopyOnWriteArrayList();
       b.Z(LiveGiftTag.GIFT_BOX, "[LiveGiftBoxManager][init]");
       p21.b(lifecycleOwn, new LiveGiftBoxManager$1(lifecycleMan));
       liveGiftBoxR.b(lifecycleOwn, new LiveGiftBoxManager$2(lifecycleMan));
       Object obj14 = p8.get();
       a.o(obj14, "dialogType.get\(\)");
       p6.b(obj14, obj);
       obj2.c();
       p9.a(obj1);
       lifecycleMan.h = p15.a().subscribe(new LiveGiftBoxManager$a(lifecycleMan));
    }
    public final void b(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveGiftBoxManager.class, "3")) {
          return;
       }
       LiveGiftBoxManager tg = this.g;
       LiveGiftBoxManager tc = this.c;
       c uoc = (tc != null)? tc.X2(): objArray;
       tg.e("[LiveGiftBoxManager][onDialogDismiss]", uoc);
       tg = this.c;
       if (tg != null && !PatchProxy.applyVoid(objArray, tg, LiveGiftBoxDialogVC.class, "15")) {
          b.Z(LiveGiftTag.GIFT_BOX, "[LiveGiftBoxDialogVC][dismissDialog]"+tg.o);
          LiveGiftBoxDialogVC o = tg.o;
          if (o != null) {
             o.i();
          }
       }
       b.Z(LiveGiftTag.GIFT_BOX, "[LiveGiftBoxManager][dismissGiftBoxDialog]giftBoxDialogVC:"+this.c);
       return;
    }
    public final d c(){
       return this.p;
    }
    public final d d(){
       return this.u;
    }
    public final k e(){
       return this.v;
    }
    public final d f(){
       return this.K;
    }
    public final c g(){
       Object[] objArray = null;
       LiveGiftBoxManager obj = PatchProxy.apply(objArray, this, LiveGiftBoxManager.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       if (obj != null) {
          objArray = obj.X2();
       }
       return objArray;
    }
    public final void h(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftBoxManager.class, "5")) {
          return;
       }
       a.p(p0, "listener");
       this.K.o(p0);
       return;
    }
    public final void i(a p0){
       LiveGiftBoxManager c;
       LiveGiftBoxManager a;
       a uoa;
       c obj2;
       LiveGiftBoxDialogVC liveGiftBoxD = this;
       Object obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, liveGiftBoxD, LiveGiftBoxManager.class, "2")) {
          return;
       }
       String str = "giftBoxParam";
       a.p(obj, str);
       int i = 0x7f11066a;
       if (a.g(liveGiftBoxD.I.a(), Boolean.TRUE)) {
          i.a(i, R.string.arg_RES_7f10060b);
          liveGiftBoxD.K.g2(0x30ed5, "[LiveGiftBoxManager][showGiftBoxDialog]disableGiftPanel");
          return;
       }else if(c.b()){
          i.d(i, i.p(R.string.arg_RES_7f100545));
          liveGiftBoxD.K.g2(0x30ed1, "[LiveGiftBoxManager][showGiftBoxDialog]childLock");
          return;
       }else {
          QCurrentUser qCurrentUser = QCurrentUser.me();
          a.o(qCurrentUser, "QCurrentUser.me\(\)");
          if (TextUtils.equals(qCurrentUser.getId(), p0.a().a().mId)) {
             liveGiftBoxD.K.g2(0x30ed3, "[LiveGiftBoxManager][showGiftBoxDialog]anchor is self");
             return;
          }else {
             Lifecycle lifecycle = this.a().getLifecycle();
             a.o(lifecycle, "lifecycleOwner.lifecycle");
             if (lifecycle.getCurrentState() == Lifecycle$State.DESTROYED) {
                liveGiftBoxD.K.g2(0x30ed4, "[LiveGiftBoxManager][showGiftBoxDialog]lifecycleOwner destroyed");
                return;
             }else {
                LiveGiftBoxManager o = liveGiftBoxD.o;
                LiveGiftBoxManager r = liveGiftBoxD.r;
                LiveGiftBoxManager u = liveGiftBoxD.u;
                LiveGiftBoxManager t = liveGiftBoxD.t;
                c = liveGiftBoxD.C;
                LiveGiftBoxManager x = liveGiftBoxD.x;
                LiveGiftBoxManager y = liveGiftBoxD.y;
                a = liveGiftBoxD.A;
                j$a a1 = j.a;
                c uoc = liveGiftBoxD.g.a();
                Objects.requireNonNull(a1);
                LiveGiftBoxManager liveGiftBoxM = liveGiftBoxD.D;
                LiveGiftBoxManager liveGiftBoxM1 = liveGiftBoxD.B;
                LiveGiftBoxDialogVC obj1 = PatchProxy.applyTwoRefs(obj, uoc, a1, j$a.class, "6");
                if (obj1 != PatchProxyResult.class) {
                   obj = obj1;
                }else {
                   a.p(obj, str);
                   if (p0.d() != SelectMode.DEFAULT && p0.d() == SelectMode.LAST_SELECT) {
                      if (uoc != null) {
                         obj2 = uoc.a();
                         if (obj2 != null) {
                         label_00f5 :
                            c uoc1 = obj2;
                            int i1 = (uoc != null)? uoc.b(): p0.b();
                            int i2 = i1;
                            if (uoc != null) {
                               d uod = uoc.d();
                               if (uod != null) {
                                  str = uod.a();
                                  if (str != null) {
                                  label_0117 :
                                     String str1 = str;
                                     if (uoc != null) {
                                        a uoa1 = uoc.c();
                                        if (uoa1 != null) {
                                           obj2 = uoa1.b();
                                           if (obj2 != null) {
                                              Gift gift = obj2.b();
                                              if (gift != null) {
                                                 gift = gift.mId;
                                              label_0134 :
                                                 a uoa2 = new a(uoc1, p0.f(), gift, str1, i2, null, p0.g(), 32, null);
                                                 uoa = gift;
                                              label_014c :
                                                 obj1 = new LiveGiftBoxDialogVC(o, r, u, t, c, a, x, y, liveGiftBoxM1, liveGiftBoxM, uoa, liveGiftBoxD.d, liveGiftBoxD.K, liveGiftBoxD.v, liveGiftBoxD.e, liveGiftBoxD.E, liveGiftBoxD.j, liveGiftBoxD.F, liveGiftBoxD.f, liveGiftBoxD.n, liveGiftBoxD.L);
                                                 liveGiftBoxD.c = lifecycle;
                                                 obj2 = liveGiftBoxD.v.get();
                                                 a.o(obj2, "dialogType.get\(\)");
                                                 liveGiftBoxD.t.a(obj2, lifecycle);
                                                 b.Z(LiveGiftTag.GIFT_BOX, "[LiveGiftBoxManager][showGiftBoxDialog]");
                                                 return;
                                              }
                                           }
                                        }
                                     }
                                     i1 = p0.c();
                                     goto label_0134 ;
                                  }
                               }
                            }
                            str = p0.e();
                            goto label_0117 ;
                         }
                      }
                      obj2 = p0.a();
                      goto label_00f5 ;
                   }
                }
                uoa = obj;
                goto label_014c ;
             }
          }
       }
    }
    public final void j(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftBoxManager.class, "6")) {
          return;
       }
       a.p(p0, "listener");
       this.K.p(p0);
       return;
    }
    public void onDestroy(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftBoxManager.class, "1")) {
          return;
       }
       a.p(p0, "owner");
       b.Z(LiveGiftTag.GIFT_BOX, "[LiveGiftBoxManager][onDestroy]");
       super.onDestroy(p0);
       this.d.a();
       Object obj = this.v.get();
       a.o(obj, "dialogType.get\(\)");
       this.t.d(obj, this.l);
       this.k.d();
       this.w.b(this.m);
       LiveGiftBoxManager th = this.h;
       if (th != null) {
          th.dispose();
       }
       return;
    }
}
