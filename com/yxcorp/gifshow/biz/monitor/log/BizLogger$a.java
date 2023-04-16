package com.yxcorp.gifshow.biz.monitor.log.BizLogger$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.biz.monitor.log.BizLogger;
import na9.e;
import java.lang.Object;
import na9.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import na9.d;
import java.util.Objects;
import java.util.List;
import java.util.ArrayList;
import com.yxcorp.gifshow.biz.monitor.log.LogOption;
import java.util.HashMap;
import com.yxcorp.gifshow.biz.monitor.log.LogOption$InsertEvent;
import java.util.Collection;
import pa9.a;
import pa9.b;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.Iterable;
import oa9.a;
import oa9.a$a;
import na9.a;
import java.lang.Enum;
import com.yxcorp.utility.Log;
import java.lang.Double;
import java.lang.Boolean;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.Long;
import xf6.l;
import com.kuaishou.bizmonitor.framework.funnel.a;
import java.util.UUID;
import mu.b;
import com.kuaishou.bizmonitor.framework.funnel.a$e;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.StringBuilder;
import java.lang.System;

public final class BizLogger$a implements Runnable	// class@001c55
{
    public final BizLogger b;
    public final e c;

    public void BizLogger$a(BizLogger p0,e p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       LogOption d;
       a obj;
       boolean b;
       String id;
       c uoc = c.class;
       BizLogger uBizLogger = BizLogger.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, BizLogger$a.class, "1")) {
          return;
       }
       BizLogger$a tb = this.b;
       Objects.requireNonNull(tb);
       ArrayList uArrayList = PatchProxy.apply(objArray, tb, uBizLogger, "31");
       if (uArrayList != patchProxyRe) {
       }else {
          uArrayList = new ArrayList();
          List list = tb.f().b().get(LogOption$InsertEvent.HEAD);
          if (list != null) {
             uArrayList.addAll(list);
          }
          uArrayList.add(new a());
          list = tb.f().b().get(LogOption$InsertEvent.TAIL);
          if (list != null) {
             uArrayList.addAll(list);
          }
          uArrayList.add(new b());
       }
       d uod = new d(uArrayList, this.b.f());
       BizLogger$a tc = this.c;
       d uod1 = PatchProxy.applyOneRefs(tc, uod, d.class, "3");
       if (uod1 != patchProxyRe) {
       }else {
          a.p(tc, "loggerBaseInfo");
          uod.a = tc;
          Iterator iterator = uod.b.iterator();
          while (iterator.hasNext()) {
             uod.a = iterator.next().a(uod);
          }
          uod1 = uod.a;
          if (uod1 == null) {
             a.S("logInfo");
          }
       }
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(uod1, tb, uBizLogger, "28")) {
          int i = a.a[uod1.a.ordinal()];
          e uoe = 1;
          if (i != uoe) {
             if (i != 2) {
                if (i != 3) {
                   if (i == 4) {
                      Log.d(uod1.f(), uod1.b());
                      d = tb.f().d;
                      if (PatchProxy.isSupport(uBizLogger)) {
                         obj = PatchProxy.applyOneRefs(Double.valueOf(d), tb, uBizLogger, "30");
                         if (obj != patchProxyRe) {
                            b = obj.booleanValue();
                         }else {
                         label_00f4 :
                            QCurrentUser qCurrentUser = QCurrentUser.me();
                            a.o(qCurrentUser, "QCurrentUser.me\(\)");
                            id = qCurrentUser.getId();
                            if (id.equals("0")) {
                               b = false;
                            }else {
                               a.o(id, "userId");
                               double d1 = (double)(Long.parseLong(id) % (long)0x2710) / 10000.00f;
                               if (d - (double)uoe > 0 || (d1 - d >= 0 && !l.c("key_biz_log_monitor", false))) {
                                  uoe = null;
                               }
                            label_0132 :
                               b = uoe;
                            }
                         }
                      }else {
                         goto label_00f4 ;
                      }
                      if (b != null) {
                         obj = a.f();
                         c uoc1 = new c(uod1.m, uod1.b(), tb.f().c);
                         String str = UUID.randomUUID().toString();
                         Objects.requireNonNull(obj);
                         b obj1 = PatchProxy.applyTwoRefs(uoc1, str, obj, a.class, "5");
                         if (obj1 != patchProxyRe) {
                            uoc1 = obj1;
                         }else {
                            a$e uoe1 = new a$e();
                            uoe1.a = false;
                            uoe1.b = uoc;
                            uoe1.d = str;
                            obj1 = obj.d.get(uoe1);
                            if (obj1 != null && obj1 == uoc1) {
                               Log.b("FunnelManager", "registerFunnel get cached "+uoc.getSimpleName()+" id:"+str);
                               uoc1 = obj1;
                            }else {
                               uoe1.f = System.currentTimeMillis();
                               uoe1.c = uoc1.d();
                               obj.c.put(uoc1, uoe1);
                               obj.d.put(uoe1, uoc1);
                            }
                         }
                         uoc1.h();
                      }
                   }
                }else {
                   Log.n(uod1.f(), uod1.b());
                   tb.h(uod1);
                }
             }else {
                Log.g(uod1.f(), uod1.b());
                tb.h(uod1);
             }
          }else {
             Log.b(uod1.f(), uod1.b());
             tb.h(uod1);
          }
       }
       return;
    }
}
