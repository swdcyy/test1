package com.yxcorp.gifshow.log.c0;
import com.yxcorp.gifshow.log.v;
import com.yxcorp.gifshow.log.x;
import ok.x;
import com.google.common.base.Suppliers;
import com.kwai.framework.model.router.RouteType;
import java.lang.String;
import jb6.b;
import com.yxcorp.gifshow.log.policy.LogPolicy;
import ok.v;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.concurrent.TimeUnit;
import com.yxcorp.gifshow.log.realtime.RealTimeReporting;
import com.google.common.base.Optional;
import java.lang.Boolean;
import com.yxcorp.gifshow.log.realtime.RealShowDao;
import org.greenrobot.greendao.query.QueryBuilder;
import org.greenrobot.greendao.AbstractDao;
import java.util.List;
import java.util.Collection;
import ekd.q;
import brd.t;
import brd.w;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.log.d0;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import wkd.b;
import com.yxcorp.gifshow.log.g;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTransList;
import vjc.a;
import com.yxcorp.gifshow.log.h;
import com.yxcorp.utility.TextUtils;
import java.lang.System;
import kp.r1;
import com.yxcorp.gifshow.log.z;
import java.lang.Runnable;
import com.google.gson.JsonObject;
import java.lang.CharSequence;
import com.google.gson.Gson;
import com.yxcorp.gifshow.log.realtime.RealShowDao$Properties;
import org.greenrobot.greendao.query.WhereCondition;
import org.greenrobot.greendao.Property;
import java.util.ArrayList;
import com.kuaishou.log.realshow.nano.RealShowLogs$RealShowFeed;
import java.lang.Long;
import com.yxcorp.gifshow.log.model.RealShowMetaData;
import com.kuaishou.log.realshow.nano.RealShowLogs$RealShowPage;
import k2b.u1;
import java.util.UUID;
import rkd.b;
import java.lang.Integer;
import com.google.gson.JsonElement;
import com.yxcorp.gifshow.log.model.response.UploadLogResponse;
import java.util.HashMap;
import java.util.Iterator;
import com.yxcorp.gifshow.log.realtime.RealShow;
import com.google.protobuf.nano.MessageNano;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import java.lang.Exception;
import com.kuaishou.log.realshow.nano.RealShowLogs$RealShowLog;
import java.util.Set;
import java.util.Map$Entry;
import com.yxcorp.gifshow.log.policy.LogPolicy$Upload;
import java.util.Map;
import h30.a;
import com.google.common.collect.ImmutableMap;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import vk7.g0;
import qe6.b;
import com.yxcorp.utility.SystemUtil;
import ekd.a0;
import fg6.a;
import com.kwai.framework.security.LogEncryptor;
import android.util.Base64;
import l2b.b;
import l2b.a;
import cjd.e;
import erd.o;
import brd.z;
import com.yxcorp.gifshow.log.a0;
import erd.g;

public class c0 extends v	// class@001af7
{
    public ImmutableMap f;
    public String g;
    public Optional h;
    public long i;
    public LogPolicy j;
    public final v k;
    public int l;
    public static final c0 m;
    public static x n;

    static {
       c0.m = new c0();
       c0.n = Suppliers.a(x.b);
    }
    public void c0(){
       super();
       this.g = b.d("n/clc/show", RouteType.API);
       this.i = 4000;
       this.j = LogPolicy.DEFAULT;
       v ov = new v();
       ov.d();
       this.k = ov;
       this.l = 0;
    }
    public static c0 q(){
       return c0.m;
    }
    public long a(){
       c0 obj = PatchProxy.apply(null, this, c0.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (this.l <= 5) {
          obj = this.k;
          if (obj == null || obj.b(TimeUnit.SECONDS) - 20 < 0) {
             return TimeUnit.MILLISECONDS.convert(1, TimeUnit.SECONDS);
          }
       }
       return this.i;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, c0.class, "5")) {
          return;
       }
       this.h = RealTimeReporting.getInstance().getRealShowDao();
       return;
    }
    public boolean d(boolean p0){
       c0 uoc0 = c0.class;
       if (PatchProxy.isSupport(uoc0)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uoc0, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       int i = 1;
       if (this.h.isPresent()) {
          if (p0) {
             if (this.h.get().queryBuilder().limit(i).count()) {
                i = false;
             }
             return i;
          }else {
             return q.f(this.p(p0));
          }
       }else {
          return i;
       }
    }
    public t i(boolean p0){
       c0 uoc0 = c0.class;
       if (PatchProxy.isSupport(uoc0)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uoc0, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       boolean b = false;
       if (p0) {
          return t.merge(this.t(this.p(true), true), this.t(this.p(b), b));
       }else {
          return this.t(this.p(b), b);
       }
    }
    public void k(BaseFeed p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c0.class, "8")) {
          return;
       }
       this.n(d0.e(p0));
       return;
    }
    public void l(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c0.class, "6")) {
          return;
       }
       d0 uod0 = (p0 != null)? d0.e(p0.mEntity): null;
       this.n(uod0);
       return;
    }
    public void m(QPhoto p0,BaseFragment p1){
       ClientEvent$ExpTagTransList uExpTagTrans;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c0.class, "7")) {
          return;
       }
       QPhoto mEntity = p0.mEntity;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d0 obj = null;
       Object obj1 = PatchProxy.applyTwoRefs(mEntity, p1, obj, d0.class, "2");
       if (obj1 != patchProxyRe) {
       }else if(p1 == null){
          uExpTagTrans = obj;
       }else {
          uExpTagTrans = b.a(0xe0ff4fb).c(p1);
       }
       p1 = PatchProxy.applyTwoRefs(mEntity, uExpTagTrans, obj, d0.class, "3");
       if (p1 != patchProxyRe) {
          obj1 = p1;
       }else {
          obj = new d0(mEntity, null, -1, 1, uExpTagTrans);
          obj1 = patchProxyRe;
       }
       this.n(obj1);
       return;
    }
    public void n(d0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c0.class, "11")) {
          return;
       }
       if (a.a(p0.a)) {
          return;
       }
       r1.i5(p0.a, System.currentTimeMillis());
       this.f(new z(this, p0, TextUtils.k(b.a(0x4b316083).R0())));
       return;
    }
    public final JsonObject o(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c0.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       JsonObject jsonObject = (!TextUtils.x(p0))? new Gson().h(p0, JsonObject.class): new JsonObject();
    }
    public List p(boolean p0){
       List list;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c0 uoc0 = c0.class;
       if (PatchProxy.isSupport(uoc0)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uoc0, "3");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       int i = 0;
       Object[] objArray = null;
       if (p0) {
          list = PatchProxy.apply(objArray, this, uoc0, "15");
          if (list != patchProxyRe) {
          }else if(this.h.isPresent()){
             WhereCondition[] whereConditi = new WhereCondition[i];
             list = this.h.get().queryBuilder().where(RealShowDao$Properties.Is_delayed_log.eq(Boolean.TRUE), whereConditi).limit(500).list();
          }else {
             list = new ArrayList();
          }
       }else {
          list = PatchProxy.apply(objArray, this, uoc0, "14");
          if (list != patchProxyRe) {
          }else if(this.h.isPresent()){
             Property is_delayed_l = RealShowDao$Properties.Is_delayed_log;
             WhereCondition whereConditi1 = is_delayed_l.isNull();
             WhereCondition[] whereConditi2 = new WhereCondition[i];
             list = this.h.get().queryBuilder().whereOr(whereConditi1, is_delayed_l.eq(Boolean.FALSE), whereConditi2).limit(500).list();
          }else {
             list = new ArrayList();
          }
       }
       return list;
    }
    public final void r(long p0,RealShowLogs$RealShowFeed p1){
       c0 uoc0 = c0.class;
       if (PatchProxy.isSupport(uoc0) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, this, uoc0, "12")) {
          return;
       }
       RealShowMetaData realShowMeta = new RealShowMetaData();
       RealShowLogs$RealShowPage realShowPage = new RealShowLogs$RealShowPage();
       realShowMeta.realShowPage = realShowPage;
       RealShowLogs$RealShowFeed[] realShowFeed = new RealShowLogs$RealShowFeed[]{p1};
       realShowPage.feed = realShowFeed;
       realShowPage.llsid = p0;
       if (!PatchProxy.applyVoidOneRefs(realShowMeta, null, u1.class, "79")) {
          b.a(0x4b316083).S(realShowMeta);
       }
       return;
    }
    public final void s(RealShowLogs$RealShowFeed p0,BaseFeed p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c0.class, "13")) {
          return;
       }
       JsonObject jsonObject = this.o(p0.expParams);
       String str = r1.F1(p1);
       if (!TextUtils.x(str)) {
          jsonObject.c0("exit_rerank_page", str);
       }
       jsonObject.c0("uuid", UUID.randomUUID().toString());
       jsonObject.a0("realshow_time", Long.valueOf(r1.E1(p1)));
       if (b.f()) {
          jsonObject.a0("is_pad", Integer.valueOf(b.f()));
          jsonObject.a0("is_horizontal", Integer.valueOf(b.e()));
       }
       String str1 = (r1.v2(p1))? "outside": "inside";
       jsonObject.c0("is_inside", str1);
       p0.expParams = jsonObject.toString();
       return;
    }
    public final t t(List p0,boolean p1){
       HashMap obj;
       List list;
       t ot;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c0 uoc0 = c0.class;
       if (PatchProxy.isSupport(uoc0)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uoc0, "16");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       if (q.f(p0)) {
          return t.just(new UploadLogResponse());
       }else {
          obj = new HashMap();
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             RealShow realShow = iterator.next();
             list = obj.get(realShow.getLlsid());
             if (list == null) {
                list = new ArrayList();
                obj.put(realShow.getLlsid(), list);
             }
             try{
                list.add(MessageNano.mergeFrom(new RealShowLogs$RealShowFeed(), realShow.getContent()));
             }catch(java.lang.Exception e4){
                ExceptionHandler.handleCaughtException(e4);
                e4.printStackTrace();
                goto label_0032 ;
             }
          }
          RealShowLogs$RealShowLog realShowLog = new RealShowLogs$RealShowLog();
          RealShowLogs$RealShowPage[] realShowPage = new RealShowLogs$RealShowPage[obj.size()];
          realShowLog.page = realShowPage;
          Iterator iterator1 = obj.entrySet().iterator();
          c uoc = null;
          int i = 0;
          while (iterator1.hasNext()) {
             Map$Entry uEntry = iterator1.next();
             RealShowLogs$RealShowPage realShowPage1 = new RealShowLogs$RealShowPage();
             int i1 = i + 1;
             realShowLog.page[i] = realShowPage1;
             realShowPage1.llsid = uEntry.getKey().longValue();
             list = uEntry.getValue();
             RealShowLogs$RealShowFeed[] realShowFeed = new RealShowLogs$RealShowFeed[uEntry.getValue().size()];
             realShowPage1.feed = list.toArray(realShowFeed);
             i = i1;
          }
          if (PatchProxy.isSupport(uoc0)) {
             ot = PatchProxy.applyThreeRefs(realShowLog, p0, Boolean.valueOf(p1), this, c0.class, "17");
             if (ot != patchProxyRe) {
             }else if(this.j.getUploadPolicy() == LogPolicy$Upload.NONE || q.f(p0)){
                ot = t.just(new UploadLogResponse());
             }else {
                obj = new HashMap();
                this.e(obj, MessageNano.toByteArray(realShowLog));
                obj.put("oaid", TextUtils.k(a.d()));
                c0 uoc01 = PatchProxy.apply(null, this, uoc0, "19");
                int i2 = 2;
                if (uoc01 != patchProxyRe) {
                }else {
                   _monitor_enter(this);
                   if (this.f == null) {
                      if (!g0.a(a.a().a(), "android.permission.READ_PHONE_STATE")) {
                         uoc = 1;
                      }
                      boolean b = b.a();
                      if (uoc && b) {
                         String str = TextUtils.k(a0.c(TextUtils.L(SystemUtil.m(a.a().a()))));
                         Application uApplication = a.a().a();
                         String str1 = PatchProxy.applyOneRefs(uApplication, null, uoc0, "18");
                         if (str1 != patchProxyRe) {
                         }else {
                            str1 = Base64.encodeToString(LogEncryptor.c.a((a.a.q(SystemUtil.j(uApplication))).getBytes()), i2);
                         }
                         this.f = ImmutableMap.of("muid", str, "imeis", str1);
                      }
                   }
                label_0186 :
                   uoc01 = this.f;
                   _monitor_exit(this);
                }
                if (uoc01 != null) {
                   obj.putAll(uoc01);
                }
                b uob = a.a();
                uoc0 = this.g;
                if (!p1) {
                   i2 = 1;
                }
                ot = uob.a(uoc0, Integer.valueOf(i2), obj).map(new e()).observeOn(this.d).doOnNext(new a0(this, p0));
             }
          }else {
             goto label_00e2 ;
          }
          return ot;
       }
    }
}
