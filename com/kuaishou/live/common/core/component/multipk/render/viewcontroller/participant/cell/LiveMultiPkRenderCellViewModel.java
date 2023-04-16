package com.kuaishou.live.common.core.component.multipk.render.viewcontroller.participant.cell.LiveMultiPkRenderCellViewModel;
import ju1.a;
import com.kuaishou.live.common.core.component.multipk.render.layout.LiveMultiPkViewStyle;
import zs1.b;
import hu1.c;
import java.lang.String;
import du1.d;
import st1.a;
import java.lang.Object;
import kotlin.jvm.internal.a;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import yh3.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import wca.n;
import java.lang.Class;
import brd.t;
import t45.d;
import brd.z;
import com.kuaishou.live.common.core.component.multipk.render.viewcontroller.participant.cell.LiveMultiPkRenderCellViewModel$h;
import erd.g;
import crd.b;
import cu1.d;
import com.kuaishou.live.common.core.component.multipk.render.viewcontroller.participant.cell.LiveMultiPkRenderCellViewModel$a;
import z0.a;
import androidx.lifecycle.Transformations;
import com.kuaishou.live.common.core.component.multipk.render.viewcontroller.participant.cell.LiveMultiPkRenderCellViewModel$b;
import com.kuaishou.live.common.core.component.multipk.render.viewcontroller.participant.cell.LiveMultiPkRenderCellViewModel$c;
import com.kuaishou.live.common.core.component.multipk.render.viewcontroller.participant.cell.LiveMultiPkRenderCellViewModel$l;
import com.kuaishou.live.common.core.component.multipk.render.viewcontroller.participant.cell.LiveMultiPkRenderCellViewModel$userTagVisibility$1;
import msd.p;
import com.kuaishou.live.mvvm.viewmodel.state.LiveDataOperators;
import com.kuaishou.live.common.core.component.multipk.render.viewcontroller.participant.cell.LiveMultiPkRenderCellViewModel$j;
import com.kuaishou.live.common.core.component.multipk.render.viewcontroller.participant.cell.LiveMultiPkRenderCellViewModel$i;
import com.kuaishou.live.common.core.component.multipk.render.viewcontroller.participant.cell.LiveMultiPkRenderCellViewModel$m;
import com.kuaishou.live.common.core.component.multipk.render.viewcontroller.participant.cell.LiveMultiPkRenderCellViewModel$k;
import com.kuaishou.live.common.core.component.multipk.render.viewcontroller.participant.cell.LiveMultiPkRenderCellViewModel$d;
import com.kuaishou.live.common.core.component.multipk.render.viewcontroller.participant.cell.LiveMultiPkRenderCellViewModel$e;
import com.kuaishou.live.common.core.component.multipk.render.viewcontroller.participant.cell.LiveMultiPkRenderCellViewModel$f;
import com.kuaishou.live.common.core.component.multipk.render.viewcontroller.participant.cell.LiveMultiPkRenderCellViewModel$g;
import zs1.d;
import l02.f;
import com.yxcorp.utility.TextUtils;
import lu1.v;
import gu1.a;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import lu1.v$d;
import pu1.m;
import st1.c;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import k2b.e0;
import java.lang.Boolean;
import com.kuaishou.live.common.core.component.multipk.render.log.LiveMultiPkRenderLogger$logMuteIconClickEvent$1;
import lu1.s;
import io.reactivex.internal.functions.Functions;
import lu1.v$e;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import lu1.v$b;
import lu1.v$c;
import lu1.v$a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import ut1.f;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import ut1.k;
import ut1.l;
import com.kwai.framework.model.user.UserInfo;
import gu1.b;
import java.lang.Runnable;
import java.util.concurrent.Future;
import pu1.g;
import lu1.v$i;
import lu1.v$g;
import ut1.o;
import java.lang.Integer;
import gu1.c;
import lu1.v$f;
import com.kuaishou.live.common.core.component.multipk.logger.LiveMultiPkLogType;
import com.google.common.collect.ImmutableMap;
import st1.e;
import lu1.v$h;
import oe3.h;
import java.util.HashMap;
import mrd.a;
import lnc.b9;
import com.kuaishou.live.common.core.component.multipk.render.log.LiveMultiPkRenderLogger$logMuteIconShowEvent$1;

public final class LiveMultiPkRenderCellViewModel extends a	// class@001695
{
    public final LiveData A;
    public final LiveMultiPkViewStyle B;
    public final d C;
    public final a D;
    public final LiveData g;
    public final b h;
    public final LiveData i;
    public final LiveData j;
    public final LiveData k;
    public final LiveData l;
    public final LiveData m;
    public boolean n;
    public final LiveData o;
    public final LiveData p;
    public final LiveData q;
    public final LiveData r;
    public final LiveMultiPkRenderCellViewModel$m s;
    public b t;
    public boolean u;
    public boolean v;
    public final LiveMultiPkRenderCellViewModel$k w;
    public final LiveData x;
    public final LiveData y;
    public final LiveData z;

    public void LiveMultiPkRenderCellViewModel(LiveMultiPkViewStyle p0,b p1,c p2,String p3,d p4,a p5){
       a.p(p0, "viewStyle");
       a.p(p1, "pkCoreModel");
       a.p(p2, "renderModel");
       a.p(p3, "viewKey");
       a.p(p4, "renderDelegate");
       a.p(p5, "logDelegate");
       super(p1, p3);
       this.B = p0;
       this.C = p4;
       this.D = p5;
       MutableLiveData mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.g = mutableLiveD;
       b uob = RxBus.f.f(n.class).observeOn(d.a).subscribe(new LiveMultiPkRenderCellViewModel$h(this));
       a.o(uob, "RxBus.INSTANCE.toObserva¡­nged\(followEvent\)\n      }");
       this.h = uob;
       LiveData liveData = Transformations.map(d.a(this.v0()), new LiveMultiPkRenderCellViewModel$a(this));
       a.h(liveData, "Transformations.map\(this\) { transform\(it\) }");
       this.i = liveData;
       LiveData liveData1 = Transformations.map(d.a(liveData), new LiveMultiPkRenderCellViewModel$b(this));
       a.h(liveData1, "Transformations.map\(this\) { transform\(it\) }");
       liveData1 = Transformations.distinctUntilChanged(d.a(liveData1));
       a.h(liveData1, "Transformations.distinctUntilChanged\(this\)");
       this.j = liveData1;
       liveData = Transformations.map(liveData, new LiveMultiPkRenderCellViewModel$c());
       a.h(liveData, "Transformations.map\(this\) { transform\(it\) }");
       liveData = Transformations.distinctUntilChanged(liveData);
       a.h(liveData, "Transformations.distinctUntilChanged\(this\)");
       this.k = liveData;
       mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.l = mutableLiveD;
       MutableLiveData mutableLiveD1 = new MutableLiveData();
       this.o0(mutableLiveD1);
       this.m = mutableLiveD1;
       LiveData liveData2 = Transformations.map(p2.c(), new LiveMultiPkRenderCellViewModel$l(this, p1));
       a.o(liveData2, "Transformations.map\(rend¡­\)\n        \)\n      }\n    }");
       this.o = liveData2;
       liveData2 = Transformations.distinctUntilChanged(LiveDataOperators.b(liveData2, mutableLiveD1, LiveMultiPkRenderCellViewModel$userTagVisibility$1.INSTANCE));
       a.h(liveData2, "Transformations.distinctUntilChanged\(this\)");
       this.p = liveData2;
       liveData2 = Transformations.map(mutableLiveD, new LiveMultiPkRenderCellViewModel$j(this));
       a.o(liveData2, "Transformations.map\(isMu¡­turn@map isMute\n    }\n  }");
       this.q = liveData2;
       liveData = Transformations.map(mutableLiveD, LiveMultiPkRenderCellViewModel$i.a);
       a.o(liveData, "Transformations.map\(isMute\) { it }");
       this.r = liveData;
       LiveMultiPkRenderCellViewModel$m om = new LiveMultiPkRenderCellViewModel$m(this);
       this.s = om;
       LiveMultiPkRenderCellViewModel$k ok = new LiveMultiPkRenderCellViewModel$k(this);
       this.w = ok;
       LiveData liveData3 = Transformations.map(d.a(this.v0()), new LiveMultiPkRenderCellViewModel$d(this));
       a.h(liveData3, "Transformations.map\(this\) { transform\(it\) }");
       liveData3 = Transformations.distinctUntilChanged(d.a(liveData3));
       a.h(liveData3, "Transformations.distinctUntilChanged\(this\)");
       this.x = liveData3;
       liveData3 = Transformations.map(d.a(this.v0()), new LiveMultiPkRenderCellViewModel$e(p1));
       a.h(liveData3, "Transformations.map\(this\) { transform\(it\) }");
       liveData3 = Transformations.distinctUntilChanged(liveData3);
       a.h(liveData3, "Transformations.distinctUntilChanged\(this\)");
       this.y = liveData3;
       LiveData liveData4 = Transformations.map(p1.l(), new LiveMultiPkRenderCellViewModel$f(this));
       a.h(liveData4, "Transformations.map\(this\) { transform\(it\) }");
       this.z = liveData4;
       liveData4 = Transformations.map(p1.o(), new LiveMultiPkRenderCellViewModel$g(this));
       a.h(liveData4, "Transformations.map\(this\) { transform\(it\) }");
       this.A = liveData4;
       p1.a(ok);
       p4.g1(om);
       this.r0(mutableLiveD1).setValue(TextUtils.k(p4.R(this.getUserId())));
    }
    public final LiveData A0(){
       return this.q;
    }
    public final LiveData C0(){
       return this.z;
    }
    public final LiveData D0(){
       return this.m;
    }
    public void E0(v p0){
       ClientContent$LiveStreamPackage liveStreamPa;
       e0 uoe0;
       boolean i5;
       c uoc1;
       ClientContent$LiveStreamPackage liveStreamPa1;
       String userId;
       m a;
       String userId1;
       object oobject;
       ClientContent$LiveStreamPackage liveStreamPa2;
       f value2;
       Map map;
       UserInfo userInfo;
       boolean b1;
       e0 uoe04;
       c uoc5;
       boolean b = this;
       String obj = p0;
       a uoa = a.class;
       LiveMultiPkRenderCellViewModel liveMultiPkR = LiveMultiPkRenderCellViewModel.class;
       if (PatchProxy.applyVoidOneRefs(obj, b, liveMultiPkR, "2")) {
          return;
       }
       a.p(obj, "intent");
       if (b.n != null) {
          b.Z(LiveCommonLogTag.MULTI_PK, "cell vm handle intent intercepted");
          return;
       }else {
          int i = 3;
          int i1 = 2;
          int i2 = 5;
          String str = "targetUserId";
          int i3 = 0;
          int i4 = 1;
          Object[] objArray = null;
          if (obj instanceof v$d) {
             if (!PatchProxy.applyVoid(objArray, b, liveMultiPkR, "3")) {
                if (m.m(this.u0())) {
                   obj = this.getUserId();
                   c uoc = this.u0().z();
                   liveStreamPa = b.C.a();
                   uoe0 = b.C.i();
                   Boolean value = b.l.getValue();
                   if (PatchProxy.isSupport(uoa)) {
                      Object[] objArray1 = new Object[i2];
                      objArray1[i3] = obj;
                      objArray1[i4] = uoc;
                      objArray1[i1] = liveStreamPa;
                      objArray1[i] = uoe0;
                      objArray1[4] = value;
                      if (!PatchProxy.applyVoid(objArray1, null, uoa, "10")) {
                      }
                   }else {
                   }
                }
             label_00a5 :
                Boolean value1 = b.l.getValue();
                if (value1 == null) {
                   value1 = Boolean.FALSE;
                }
                i5 = value1.booleanValue() ^ i4;
                b.r0(b.r).setValue(Boolean.valueOf(i5));
                t ot = this.u0().y(this.getUserId(), i5);
                b uob = (ot != null)? ot.subscribe(s.b, Functions.d()): null;
                b.t = uob;
             }
          }else if(obj instanceof v$e){
             if (!PatchProxy.applyVoid(null, b, liveMultiPkR, "9")) {
                i.e(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f101e59), i3);
             }
          }else if(obj instanceof v$b){
             if (!PatchProxy.applyVoid(null, b, liveMultiPkR, "6")) {
                i5 = (m.m(this.u0()))? 121: 225;
                b.C.b1(this.getUserId(), i5, i4);
                if (m.m(this.u0())) {
                   obj = this.getUserId();
                   uoc1 = this.u0().z();
                   liveStreamPa1 = b.C.a();
                   uoe0 = b.C.i();
                   if (!PatchProxy.applyVoidFourRefs(obj, uoc1, liveStreamPa1, uoe0, null, a.class, "12")) {
                      a.p(obj, str);
                      a.p(uoc1, "pkLogInfo");
                      a.p(liveStreamPa1, "liveStreamPackage");
                      a.p(uoe0, "logPage");
                      a.b("MULTI_FOLLOW_BUTTON", obj, uoc1, liveStreamPa1, uoe0, null, 32, null);
                   }
                }
             }
          }else if(obj instanceof v$c){
             if (!PatchProxy.applyVoid(null, b, liveMultiPkR, "5") && (m.m(this.u0()) & (b.u ^ i4))) {
                b.u = i4;
                obj = this.getUserId();
                uoc1 = this.u0().z();
                liveStreamPa1 = b.C.a();
                uoe0 = b.C.i();
                if (!PatchProxy.applyVoidFourRefs(obj, uoc1, liveStreamPa1, uoe0, null, a.class, "11")) {
                   a.p(obj, str);
                   a.p(uoc1, "pkLogInfo");
                   a.p(liveStreamPa1, "liveStreamPackage");
                   a.p(uoe0, "logPage");
                   a.c("MULTI_FOLLOW_BUTTON", obj, uoc1, liveStreamPa1, uoe0, null);
                }
             }
          }else {
             String str1 = "8";
             String str2 = "userId";
             if (obj instanceof v$a) {
                if (!PatchProxy.applyVoid(null, b, liveMultiPkR, "7")) {
                   userId = this.getUserId();
                   a = m.a;
                   userId1 = this.getUserId();
                   b uob1 = this.u0();
                   Objects.requireNonNull(a);
                   l ol = PatchProxy.applyTwoRefs(userId1, uob1, a, m.class, "28");
                   if (ol != PatchProxyResult.class) {
                   }else {
                      a.p(userId1, str2);
                      a.p(uob1, "pkCoreModel");
                      f value3 = uob1.l().getValue();
                      if (value3 != null) {
                         Map map1 = value3.l();
                         if (map1 != null) {
                            Iterator iterator = map1.entrySet().iterator();
                            while (true) {
                               if (iterator.hasNext()) {
                                  Iterator iterator1 = iterator.next().getValue().f().entrySet().iterator();
                                  while (true) {
                                     if (iterator1.hasNext()) {
                                        Map$Entry uEntry = iterator1.next();
                                        if (TextUtils.n(userId1, uEntry.getValue().c().mId)) {
                                           ol = uEntry.getValue().b;
                                        }
                                     }else {
                                        continue ;
                                     }
                                  }
                                  c uoc2 = this.u0().z();
                                  liveStreamPa2 = b.C.a();
                                  e0 uoe01 = b.C.i();
                                  if (PatchProxy.isSupport(uoa)) {
                                     Object[] objArray2 = new Object[i2];
                                     objArray2[i3] = userId;
                                     objArray2[i4] = oobject;
                                     objArray2[i1] = uoc2;
                                     objArray2[3] = liveStreamPa2;
                                     objArray2[4] = uoe01;
                                     if (PatchProxy.applyVoid(objArray2, null, uoa, str1)) {
                                     label_02c4 :
                                        obj = this.getUserId();
                                        value2 = this.u0().l().getValue();
                                        map = (value2 != null)? value2.l(): null;
                                        userInfo = d.i(obj, map);
                                        if (userInfo != null) {
                                           b.C.N1(userInfo, m.m(this.u0()));
                                        }
                                     }
                                  }
                                  a.p(uoc2, "pkLogInfo");
                                  a.p(liveStreamPa2, "liveStreamPackage");
                                  a.p(uoe01, "logPage");
                                  b uob2 = new b(uoc2, userId, oobject, liveStreamPa2, uoe01);
                                  g.a(uoa);
                                  goto label_02c4 ;
                               }
                            }
                         }
                      }
                      oobject = null;
                      goto label_027b ;
                   }
                   oobject = ol;
                   goto label_027b ;
                }
             }else if(obj instanceof v$i){
                if (!PatchProxy.applyVoid(null, b, liveMultiPkR, str1)) {
                   i5 = m.m(this.u0());
                   if (i5) {
                      String userId2 = this.getUserId();
                      c uoc3 = this.u0().z();
                      ClientContent$LiveStreamPackage liveStreamPa3 = b.C.a();
                      e0 uoe02 = b.C.i();
                      e0 uoe03 = uoe02;
                      b1 = i5;
                      uoe04 = uoe02;
                      if (!PatchProxy.applyVoidFourRefs(userId2, uoc3, liveStreamPa3, uoe03, null, a.class, "13")) {
                         a.p(userId2, str);
                         a.p(uoc3, "pkLogInfo");
                         a.p(liveStreamPa3, "liveStreamPackage");
                         a.p(uoe04, "logPage");
                         a.b("MULTI_NICK_AVATAT_BUTTON", userId2, uoc3, liveStreamPa3, uoe04, null, 32, null);
                      }
                   }else {
                      b1 = i5;
                   }
                   obj = this.getUserId();
                   value2 = this.u0().l().getValue();
                   map = (value2 != null)? value2.l(): null;
                   userInfo = d.i(obj, map);
                   if (userInfo != null) {
                      b.C.k1(userInfo, b1);
                   }
                }
             }else if(obj instanceof v$g){
                if (!PatchProxy.applyVoid(null, b, liveMultiPkR, "4")) {
                   o value4 = b.x.getValue();
                   if (value4 != null) {
                      value4 = value4.b;
                      if (value4 != null) {
                         b.C.T(value4);
                         uoe04 = b.C.i();
                         liveStreamPa2 = b.C.a();
                         o value5 = b.x.getValue();
                         int i6 = (value5 != null)? value5.a(): 0;
                         String userId3 = this.getUserId();
                         f value6 = this.u0().l().getValue();
                         str1 = (value6 != null)? value6.a(): null;
                         boolean b2 = a.g(userId3, str1);
                         c uoc4 = b.D.l();
                         if (PatchProxy.isSupport(uoa)) {
                            Object[] objArray3 = new Object[]{uoe04,liveStreamPa2,Integer.valueOf(i6),Boolean.valueOf(b2),uoc4,Integer.valueOf(3)};
                            if (!PatchProxy.applyVoid(objArray3, null, uoa, "17")) {
                            }
                         }else {
                         }
                      }
                   }
                }
             }else if(obj instanceof v$f){
                LiveMultiPkLogType cLICK = LiveMultiPkLogType.CLICK;
                c uoc6 = b.D.l();
                e0 uoe05 = b.D.i();
                liveStreamPa = b.D.a();
                str1 = this.getUserId();
                String str3 = b.C.R(this.getUserId());
                if (str3 == null) {
                   str3 = "";
                }
                ImmutableMap immutableMap = ImmutableMap.of(str1, str3);
                a.o(immutableMap, "ImmutableMap.of\(\n       ¡­.EMPTY_STRING\n          \)");
                e.c(cLICK, uoc6, uoe05, liveStreamPa, immutableMap);
                b.C.a1();
             }else if(obj instanceof v$h){
                b.Z(LiveCommonLogTag.MULTI_PK, "handleIntent UpdateCellBitmapIntent");
                b uob3 = this.u0();
                userId1 = this.getUserId();
                h oh = new h(obj.a);
                Objects.requireNonNull(uob3);
                if (!PatchProxy.applyVoidTwoRefs(userId1, oh, uob3, b.class, "30")) {
                   a.p(userId1, str2);
                   a.p(oh, "bitmap");
                   a uoa1 = uob3.j.get(userId1);
                   if (uoa1 != null) {
                      uoa1.onNext(oh);
                   }
                }
             }
          }
          return;
       }
    }
    public final String getUserId(){
       Object obj = PatchProxy.apply(null, this, LiveMultiPkRenderCellViewModel.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.x0();
    }
    public void onCleared(){
       if (PatchProxy.applyVoid(null, this, LiveMultiPkRenderCellViewModel.class, "12")) {
          return;
       }
       super.onCleared();
       this.n = true;
       LiveMultiPkRenderCellViewModel tt = this.t;
       if (tt != null) {
          tt.dispose();
       }
       this.u0().D(this.w);
       this.C.d1(this.s);
       b9.a(this.h);
       return;
    }
    public void y0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveMultiPkRenderCellViewModel.class, "1")) {
          return;
       }
       if (this.C.e()) {
          this.r0(this.q).setValue(Boolean.TRUE);
          int i = 1;
          if (m.m(this.u0()) & (this.v ^ i)) {
             this.v = i;
             String userId = this.getUserId();
             c uoc = this.u0().z();
             ClientContent$LiveStreamPackage liveStreamPa = this.C.a();
             e0 uoe0 = this.C.i();
             Boolean value = this.l.getValue();
             if (PatchProxy.isSupport(a.class)) {
                Object[] objArray1 = new Object[]{userId,uoc,liveStreamPa,uoe0,value};
                if (!PatchProxy.applyVoid(objArray1, objArray, a.class, "9")) {
                }
             }else {
             }
          }
       }else {
          this.r0(this.q).setValue(Boolean.FALSE);
       }
       return;
    }
    public final LiveData z0(){
       return this.x;
    }
}
