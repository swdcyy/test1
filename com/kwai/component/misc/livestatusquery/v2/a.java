package com.kwai.component.misc.livestatusquery.v2.a;
import java.lang.Object;
import java.util.concurrent.CopyOnWriteArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.component.misc.livestatusquery.LiveCheckStatusConfig;
import pc5.a;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import km8.b;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import tc5.d;
import org.greenrobot.eventbus.a;
import java.util.HashMap;
import com.kwai.robust.PatchProxyResult;
import com.kwai.component.misc.livestatusquery.v2.a$a;
import java.lang.Boolean;
import java.util.Iterator;
import java.util.List;
import tc5.a;
import java.util.Collection;
import ekd.q;
import java.util.Set;
import brd.w;
import java.lang.System;
import com.yxcorp.utility.SystemUtil;
import java.lang.StringBuilder;
import brd.t;
import com.yxcorp.utility.TextUtils;
import wkd.b;
import sc5.b;
import tc5.h;
import erd.o;
import java.lang.Number;
import java.lang.Long;
import java.lang.Throwable;
import java.lang.Integer;
import java.lang.Math;
import sc5.d;
import java.util.Objects;
import com.kwai.component.misc.livestatusquery.LiveStatusQueryResponse;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import sc5.f;
import crd.b;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import tc5.g;
import erd.g;
import tc5.i;
import tc5.e;
import tc5.f;
import m56.f;
import m56.g;

public class a	// class@0009d4
{
    public final List a;
    public LiveCheckStatusConfig b;
    public Map c;
    public int d;
    public boolean e;
    public b f;
    public long g;
    public static a h;

    public void a(){
       LiveCheckStatusConfig mBizRequestI;
       super();
       this.a = new CopyOnWriteArrayList();
       this.e = false;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "2")) {
       }else {
          mBizRequestI = LiveCheckStatusConfig.class;
          String str = a.a.getString("liveCheckStatusConfig", "{}");
          if (str != null && str != "") {
             objArray = b.a(str, mBizRequestI);
          }
          this.b = objArray;
          if (objArray == null) {
             this.b = new LiveCheckStatusConfig();
          }
          d.d(this.f(), "initLiveCheckStatusConfig", ImmutableMap.of("liveCheckStatusConfig", this.b));
       }
       a.d().p(this);
       mBizRequestI = this.b.mBizRequestIntervalMs;
       if (mBizRequestI == null) {
          mBizRequestI = new HashMap();
       }
       this.c = mBizRequestI;
       return;
    }
    public static a e(){
       Object obj = PatchProxy.apply(null, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (a.h == null) {
          a.h = new a();
       }
       return a.h;
    }
    public final void a(boolean p0,a$a p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoa, "17")) {
          return;
       }
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          a uoa1 = iterator.next();
          if (p1.a.size() >= this.b.mMaxRequestBatchSize) {
             break ;
          }else if(uoa1.b() != p0 || q.f(uoa1.a())){
             continue ;
          }else {
             p1.c.add(uoa1.a);
             p1.b.add(uoa1);
             Iterator iterator1 = uoa1.a().iterator();
             while (iterator1.hasNext()) {
                String str = iterator1.next();
                if (p1.a.size() >= this.b.mMaxRequestBatchSize) {
                   continue ;
                }else {
                   p1.a.add(str);
                }
             }
          }
       }
       return;
    }
    public w b(){
       StringBuilder str;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, uoa, "16");
       if (obj != patchProxyRe) {
          return obj;
       }
       long l = System.currentTimeMillis();
       boolean b = false;
       if (SystemUtil.I()) {
          for (int i = 0; i < this.a.size(); i = i + 1) {
             d.d(this.f(), "bizItem ", ImmutableMap.of(String.valueOf(i), this.a.get(i)));
          }
       }
       a$a uoa1 = new a$a();
       this.a(true, uoa1);
       this.a(b, uoa1);
       a$a b1 = uoa1.b;
       Object[] objArray1 = PatchProxy.applyOneRefs(b1, this, uoa, "18");
       if (objArray1 != patchProxyRe) {
       }else {
          str = "active biz list:";
          Iterator iterator = b1.iterator();
          b1 = null;
          int i1 = b1;
          while (iterator.hasNext()) {
             a uoa2 = iterator.next();
             if (uoa2.b() && !q.f(uoa2.a())) {
                str = str+" "+uoa2.a;
                if (objArray == null) {
                   objArray = uoa2.a;
                   i1 = this.d(objArray);
                }else {
                   long l1 = this.d(uoa2.a);
                   if (i1 - b1 > 0 || (l1 - b1 > 0 || (l1 - b1 > 0 && l1 - i1 < 0))) {
                      objArray = uoa2.a;
                      i1 = l1;
                   }
                }
             }
          }
          d.c(this.f(), str);
          objArray1 = objArray;
       }
       uoa1.d = objArray1;
       if (q.f(uoa1.a)) {
          d.c(this.f(), "createLiveStatusQueryObservable invalid request");
          return t.just(uoa1);
       }else {
          str = this.c(uoa1.a);
          String str1 = this.c(uoa1.c);
          d.d(this.f(), "createLiveStatusQueryObservable", ImmutableMap.of("anchorIdList", str, "bizList", str1, "activeBiz", TextUtils.k(uoa1.d), "timeCost", String.valueOf((System.currentTimeMillis() - l))));
          t ot = b.a(-487855651).a(str, str1, uoa1.d);
          return ot.map(new h(uoa1));
       }
    }
    public final String c(Collection p0){
       StringBuilder obj = PatchProxy.applyOneRefs(p0, this, a.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "";
       int i = 1;
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          if (i) {
             i = 0;
          }else {
             obj = obj+",";
          }
          obj = obj+str;
       }
       return obj;
    }
    public final long d(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       Long longx = this.c.get(p0);
       long l = (longx == null)? 0: longx.longValue();
       return l;
    }
    public String f(){
       return "LiveStatusQueryManagerV2";
    }
    public boolean g(){
       return this.b.mEnableCheckLiveStatus;
    }
    public boolean h(){
       boolean b = (this.d >= 3)? true: false;
       return b;
    }
    public void i(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "15")) {
          return;
       }
       d.b(this.f(), "processLiveStatusQueryFailed", ImmutableMap.of("mCurrentRetryCount", Integer.valueOf(this.d)), p0);
       this.l();
       if (this.n() && !this.h()) {
          int i = this.d + 1;
          this.d = i;
          this.m((this.b.mRequestIntervalMs * (long)Math.pow(2.00f, (double)i)));
       }else if(this.n() && this.h()){
          long l = (long)d.a() * 1000;
          d.d(this.f(), "processLiveStatusQueryFailed reset retry", ImmutableMap.of("resetDelayMs", Long.valueOf(l)));
          if (l > 0) {
             this.d = 0;
             this.m(l);
          }
       }
       return;
    }
    public void j(a$a p0){
       boolean b;
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "12")) {
          return;
       }
       this.l();
       Objects.requireNonNull(p0);
       a$a obj = PatchProxy.apply(null, p0, a$a.class, "1");
       int i = 0;
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(!q.f(p0.a) && p0.e != null){
          b = true;
       }else {
          b = false;
       }
       if (!b) {
          d.c(this.f(), "processLiveStatusQueryResponse, invalid wrapper");
          this.p();
          return;
       }else {
          this.d = i;
          obj = p0.e;
          if (obj.mLiveEndAuthorIds != null) {
             d.d(this.f(), "processLiveStatusQueryResponse", ImmutableMap.of("mLiveEndAuthorIds", obj.mLiveEndAuthorIds));
             LiveStatusQueryResponse mLiveEndAuth = obj.mLiveEndAuthorIds;
             if (!PatchProxy.applyVoidOneRefs(mLiveEndAuth, this, uoa, "13") && !q.f(mLiveEndAuth)) {
                long l = System.currentTimeMillis();
                Iterator iterator1 = this.a.iterator();
                while (iterator1.hasNext()) {
                   a uoa1 = iterator1.next();
                   if (uoa1.a() != null) {
                      uoa1.a().removeAll(mLiveEndAuth);
                   }
                }
                if (SystemUtil.I()) {
                   d.d(this.f(), "removeAnchorIdsFromBizItems", ImmutableMap.of("time cost", Long.valueOf((System.currentTimeMillis() - l))));
                }
             }
             p0 = p0.a;
             mLiveEndAuth = obj.mLiveEndAuthorIds;
             if (!PatchProxy.applyVoidTwoRefs(p0, mLiveEndAuth, this, uoa, "14")) {
                ArrayMap uArrayMap = new ArrayMap(p0.size());
                Iterator iterator = p0.iterator();
                while (iterator.hasNext()) {
                   String str = iterator.next();
                   int i1 = mLiveEndAuth.contains(str) ^ 1;
                   uArrayMap.put(str, Boolean.valueOf(i1));
                }
                iterator = this.a.iterator();
                while (iterator.hasNext()) {
                   iterator.next().b.a(uArrayMap);
                }
             }
          }
          LiveStatusQueryResponse mLiveCheckSt = obj.mLiveCheckStatusConfig;
          if (mLiveCheckSt != null) {
             this.b = mLiveCheckSt;
             LiveCheckStatusConfig mBizRequestI = mLiveCheckSt.mBizRequestIntervalMs;
             if (mBizRequestI != null) {
                this.c = mBizRequestI;
             }
             d.d(this.f(), "processLiveStatusQueryResponse", ImmutableMap.of("mLiveCheckStatusConfig", this.b));
          }
          this.p();
          return;
       }
    }
    public void k(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "6")) {
          return;
       }
       this.a.remove(p0);
       this.a.add(0, p0);
       this.p();
       return;
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, a.class, "10")) {
          return;
       }
       a tf = this.f;
       if (tf != null && !tf.isDisposed()) {
          this.f.dispose();
       }
       this.f = null;
       return;
    }
    public final void m(long p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoa, "11")) {
          return;
       }
       d.d(this.f(), "scheduleCheckLiveStatus", ImmutableMap.of("delayTimeMs", Long.valueOf(p0)));
       this.f = t.timer(p0, TimeUnit.MILLISECONDS).observeOn(d.a).doOnNext(new g(this)).flatMap(new i(this)).subscribe(new e(this), new f(this));
       return;
    }
    public final boolean n(){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, uoa, "8");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.b;
       boolean b = true;
       if (obj.mEnableCheckLiveStatus != null && (obj.mMaxRequestBatchSize > null && this.e == null)) {
          Object obj1 = PatchProxy.apply(objArray, this, uoa, "9");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else {
             Iterator iterator = this.a.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   uoa = iterator.next();
                   if (uoa.b() && !q.f(uoa.a())) {
                      b1 = true;
                   }
                }else {
                   b1 = false;
                }
             }
             return b;
          }
          if (b1) {
             goto label_005c ;
          }
       }
    label_005b :
       b = false;
       goto label_005c ;
    }
    public void o(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "5")) {
          return;
       }
       this.a.remove(p0);
       this.p();
       return;
    }
    public void onEventMainThread(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       this.l();
       this.e = true;
       return;
    }
    public void onEventMainThread(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       this.d = 0;
       this.e = false;
       this.p();
       return;
    }
    public void p(){
       if (PatchProxy.applyVoid(null, this, a.class, "7")) {
          return;
       }
       if (this.n()) {
          if (this.f == null) {
             long l = 0;
             if (!this.g - l) {
                this.g = System.currentTimeMillis();
                this.m(this.b.mRequestIntervalMs);
             }else {
                long l1 = System.currentTimeMillis() - this.g;
                LiveCheckStatusConfig mRequestInte = this.b.mRequestIntervalMs;
                if (l1 - mRequestInte < 0) {
                   l = mRequestInte - l1;
                }
                this.m(l);
             }
          }
       }else {
          this.l();
       }
       return;
    }
}
