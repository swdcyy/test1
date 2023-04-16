package com.kwai.framework.network.keyconfig.a$f;
import erd.o;
import rb6.b;
import com.kwai.framework.network.keyconfig.a;
import java.lang.String;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import java.lang.Object;
import java.lang.Throwable;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import brd.e0;
import kotlin.jvm.internal.a;
import java.util.Objects;
import brd.a0;
import ta6.c;
import q87.c;
import java.lang.Boolean;
import com.google.common.base.b;
import com.yxcorp.retrofit.model.KwaiException;
import ob6.h;
import com.kwai.framework.network.keyconfig.BaseConfig;
import com.kwai.framework.network.keyconfig.KeyConfigCdnDegrade;
import qrd.l1;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import zsd.u;
import brd.t;
import ob6.r;

public final class a$f implements o	// class@0017e5
{
    public final b b;
    public final a c;
    public final String d;
    public final RequestTiming e;

    public void a$f(b p0,a p1,String p2,RequestTiming p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public Object apply(Object p0){
       Object[] objArray;
       boolean b1;
       Object[] objArray1;
       Throwable throwable;
       Object obj = this;
       a0 obj1 = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a$f obj2 = PatchProxy.applyOneRefsWithListener(obj1, obj, a$f.class, "1");
       if (obj2 != patchProxyRe) {
       }else {
          a.p(obj1, "throwable");
          obj2 = obj.c;
          a$f b = obj.b;
          Objects.requireNonNull(obj2);
          a uoa = a.class;
          h obj3 = PatchProxy.applyTwoRefs(b, obj1, obj2, uoa, "15");
          if (obj3 != patchProxyRe) {
             obj2 = obj3;
          }else {
             try{
                c.C().v("KeyConfigManager", "Request keyConfig from Api server failed: ", obj1);
                obj3 = PatchProxy.applyOneRefs(obj1, obj2, uoa, "22");
                objArray = null;
                if (obj3 != patchProxyRe) {
                   b1 = obj3.booleanValue();
                }else {
                   throwable = b.c(obj1);
                   if (!throwable instanceof KwaiException) {
                      throwable = objArray;
                   }
                   if (throwable != null && throwable.getErrorCode() != 17) {
                      b1 = true;
                   }else {
                      b1 = false;
                   }
                }
             }catch(java.lang.IllegalArgumentException e0){
             }
             if (b1) {
                objArray1 = new Object[0];
                c.C().w("KeyConfigManager", "KeyConfig degraded by self. Skip retrieving from cdn", objArray1);
                obj1 = a0.s(obj1);
                a.o(obj1, "Single.error\(throwable\)");
             }else {
                _monitor_enter(obj2);
                obj3 = obj2.m().mBaseConfig;
                a.o(obj3, "getNetworkOrLocalKeyConfig\(\).mBaseConfig");
                Objects.requireNonNull(obj3);
                BaseConfig uBaseConfig = PatchProxy.apply(objArray, obj3, BaseConfig.class, "6");
                if (uBaseConfig != patchProxyRe) {
                }else if(obj3.mKeyConfigCdnDegrade == null){
                   obj3.mKeyConfigCdnDegrade = new KeyConfigCdnDegrade();
                }
                uBaseConfig = obj3.mKeyConfigCdnDegrade;
                a.o(uBaseConfig, "getNetworkOrLocalKeyConf¡­onfig.keyConfigCdnDegrade");
                _monitor_exit(obj2);
                Objects.requireNonNull(uBaseConfig);
                KeyConfigCdnDegrade keyConfigCdn = PatchProxy.apply(objArray, uBaseConfig, KeyConfigCdnDegrade.class, "1");
                if (keyConfigCdn != patchProxyRe) {
                }else if(uBaseConfig.mCdnList == null){
                   uBaseConfig.mCdnList = new ArrayList();
                }
                keyConfigCdn = uBaseConfig.mCdnList;
                if (keyConfigCdn.isEmpty()) {
                   objArray1 = new Object[0];
                   c.C().w("KeyConfigManager", "KeyConfig degrade cdn hosts is empty. Skip retrieving from cdn", objArray1);
                   obj1 = a0.s(obj1);
                   a.o(obj1, "Single.error\(throwable\)");
                }else {
                   b.d(obj1, obj2.getVersion());
                   a.o(keyConfigCdn, "shuffledCdnHosts");
                   Collections.shuffle(keyConfigCdn);
                   ArrayList uArrayList = new ArrayList(u.Y(keyConfigCdn, 10));
                   Iterator iterator = keyConfigCdn.iterator();
                   while (iterator.hasNext()) {
                      Object obj4 = iterator.next();
                      if (uBaseConfig.mCdnPath == null) {
                         uBaseConfig.mCdnPath = "";
                      }
                      KeyConfigCdnDegrade mCdnPath = uBaseConfig.mCdnPath;
                      a.o(mCdnPath, "keyConfigDegrade.cdnPath");
                      a.o(obj4, "it");
                      uArrayList.add(u.g2(mCdnPath, "{cdn}", obj4, false, 4, null));
                   }
                   obj2 = PatchProxy.applyTwoRefs(uArrayList, b, obj2, uoa, "18");
                   if (obj2 != patchProxyRe) {
                   }else {
                      obj1 = t.fromIterable(uArrayList).concatMap(new r(b)).firstOrError();
                      a.o(obj1, "Observable.fromIterable\(¡­}\n        .firstOrError\(\)");
                   }
                }
             }
             obj2 = obj1;
          }
          PatchProxy.onMethodExit(a$f.class, "1");
       }
       return obj2;
    }
}
