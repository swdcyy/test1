package com.kwai.framework.network.regions.RegionSchedulerImpl;
import pjd.c;
import android.content.Context;
import com.yxcorp.retrofit.region.config.RegionInfo;
import java.lang.Object;
import com.kuaishou.godzilla.idc.KwaiDefaultIDCSpeedTestRequestGenerator;
import okhttp3.OkHttpClient;
import nb6.d;
import java.lang.String;
import com.kuaishou.godzilla.idc.KwaiIDCSpeedTester;
import com.kwai.framework.network.regions.RegionSchedulerImpl$NetworkChangeReceiver;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import android.content.Intent;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import o56.c;
import o56.a;
import xf6.l;
import com.google.common.base.Optional;
import com.yxcorp.retrofit.model.Region;
import java.lang.reflect.Type;
import wb6.c;
import java.lang.Long;
import ta6.c;
import q87.c;
import com.kwai.framework.network.k;
import java.lang.StringBuilder;
import ta6.a;
import java.util.List;
import java.util.Iterator;
import qjd.b;
import java.util.Objects;
import java.util.ArrayList;
import qjd.a;
import java.util.Set;
import java.util.HashSet;
import java.util.Collection;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.godzilla.idc.KwaiIDCHost;
import java.util.Collections;
import com.kwai.framework.network.regions.d;
import com.kuaishou.godzilla.idc.KwaiSpeedTestRequestGenerator;
import com.kuaishou.godzilla.idc.KwaIDCSpeedTestCallback;
import com.yxcorp.utility.SystemUtil;
import wkd.b;
import pb6.o;
import java.lang.Iterable;
import com.google.common.collect.Lists;
import ekd.p0;

public class RegionSchedulerImpl implements c	// class@00180e
{
    public final Context a;
    public final Object b;
    public final KwaiIDCSpeedTester c;
    public RegionInfo d;
    public long e;
    public long f;
    public String g;
    public final KwaiSpeedTestRequestGenerator h;

    public void RegionSchedulerImpl(Context p0,RegionInfo p1){
       super();
       this.b = new Object();
       this.h = new KwaiDefaultIDCSpeedTestRequestGenerator(d.a(), "/rest/n/system/speed");
       this.a = p0;
       this.d = p1;
       this.c = new KwaiIDCSpeedTester("region", true);
       UniversalReceiver.e(p0, new RegionSchedulerImpl$NetworkChangeReceiver(this), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, RegionSchedulerImpl.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!a.a().c() || l.c("enable_api_region_scheduling", b)) {
          b = true;
       }
       return b;
    }
    public Optional b(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       RegionSchedulerImpl regionSchedu = RegionSchedulerImpl.class;
       RegionSchedulerImpl obj = PatchProxy.applyOneRefs(p0, this, regionSchedu, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.b;
       _monitor_enter(obj);
       Optional optional = this.e(p0);
       if (!optional.isPresent()) {
          _monitor_exit(obj);
          return Optional.absent();
       }else {
          Region region = PatchProxy.apply(null, this, regionSchedu, "11");
          if (region != patchProxyRe) {
          }else {
             Region region1 = c.b(Region.class);
             if (region1 == null) {
                region1 = new Region();
             }
             region = region1;
          }
          _monitor_exit(obj);
          return this.f(region, optional.get());
       }
    }
    public RegionInfo c(){
       return this.d;
    }
    public void d(RegionInfo p0,long p1,long p2,String p3){
       Object[] this;
       if (PatchProxy.isSupport(RegionSchedulerImpl.class) && PatchProxy.applyVoidFourRefs(p0, Long.valueOf(p1), Long.valueOf(p2), p3, this, RegionSchedulerImpl.class, "2")) {
          return;
       }
       RegionSchedulerImpl tb = this.b;
       _monitor_enter(tb);
       this = new Object[0];
       c.C().w("RegionSchedulerImpl", "updateRegionInfoLocked and speed test config", this);
       boolean b = this.d.e(p0);
       k.d(p3);
       boolean b1 = (this.e - p1 || this.f - p2)? true: false;
       this.e = p1;
       this.f = p2;
       Object[] objArray = new Object[0];
       c.C().w("RegionSchedulerImpl", "Hosts changed: "+b, objArray);
       objArray = new Object[0];
       c.C().w("RegionSchedulerImpl", "Config changed: "+b1, objArray);
       if (b || b1) {
          a.m(this.d);
          Object[] objArray1 = new Object[0];
          c.C().w("RegionSchedulerImpl", "Hosts have changed, start a speed test", objArray1);
          this.i();
       }
       _monitor_exit(tb);
       return;
    }
    public final Optional e(String p0){
       Iterator iterator;
       Optional optional1;
       Iterator obj = PatchProxy.applyOneRefs(p0, this, RegionSchedulerImpl.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d.b().iterator();
       while (true) {
          if (!obj.hasNext()) {
             return Optional.absent();
          }
          b uob = obj.next();
          Objects.requireNonNull(uob);
          Optional optional = Optional.absent();
          b mPath = uob.mPath;
          if (mPath == null) {
             mPath = new ArrayList();
          }
          if (!mPath.isEmpty()) {
             iterator = mPath.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   if (p0.equals(iterator.next())) {
                      optional = Optional.of(uob.a());
                   }
                }else {
                   optional = Optional.absent();
                }
             }
             return optional;
          }
          if (!optional.isPresent()) {
             b mPathRegex = uob.mPathRegex;
             if (mPathRegex == null) {
                mPathRegex = new ArrayList();
             }
             if (!mPathRegex.isEmpty()) {
                iterator = mPathRegex.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      if (p0.matches(iterator.next())) {
                         optional1 = Optional.of(uob.a());
                      }else {
                         continue ;
                      }
                   }else {
                      optional1 = Optional.absent();
                   }
                   optional = optional1;
                }
             }else {
                optional = Optional.absent();
             }
          }
          if (optional.isPresent()) {
          }else {
             continue ;
          }
       }
    }
    public final Optional f(Region p0,String p1){
       a uoa;
       Iterator obj = PatchProxy.applyTwoRefs(p0, p1, this, RegionSchedulerImpl.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[0];
       c.C().w("RegionSchedulerImpl", "current region.uid: "+p0.c(), objArray);
       objArray = new Object[0];
       c.C().w("RegionSchedulerImpl", "current region.name: "+p0.a(), objArray);
       objArray = new Object[0];
       c.C().w("RegionSchedulerImpl", "current region.ticket: "+p0.b(), objArray);
       Object[] objArray1 = new Object[0];
       c.C().w("RegionSchedulerImpl", "current apiGroup: "+p1, objArray1);
       obj = this.d.a().iterator();
       while (true) {
          if (!obj.hasNext()) {
             return Optional.absent();
          }
          uoa = obj.next();
          if (p1.equals(uoa.a()) && (p0.a()).equals(uoa.e())) {
             break ;
          }
       }
       return Optional.of(uoa);
    }
    public final Set g(boolean p0){
       HashSet obj;
       RegionSchedulerImpl regionSchedu = RegionSchedulerImpl.class;
       if (PatchProxy.isSupport(regionSchedu)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, regionSchedu, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new HashSet();
       Iterator iterator = this.d.a().iterator();
       while (iterator.hasNext()) {
          a uoa = iterator.next();
          List list = (p0)? uoa.d(): uoa.c();
          obj.addAll(list);
       }
       return obj;
    }
    public final void h(boolean p0){
       HashSet obj;
       a uoa;
       List list;
       Iterator iterator1;
       String str1;
       ArrayList uArrayList1;
       RegionSchedulerImpl regionSchedu = RegionSchedulerImpl.class;
       if (PatchProxy.isSupport(regionSchedu) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, regionSchedu, "5")) {
          return;
       }
       if (PatchProxy.isSupport(regionSchedu)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, regionSchedu, "8");
          if (obj != PatchProxyResult.class) {
             ArrayList uArrayList = obj;
          label_007b :
             RegionSchedulerImpl tc = this.c;
             String str = (p0)? "region_https": "region_http";
             tc.testSpeed(str, uArrayList, this.h, new d(this), this.e, this.f);
             return;
          }
       }
       obj = new HashSet();
       Iterator iterator = this.d.a().iterator();
    }
    public void i(){
       RegionSchedulerImpl regionSchedu = RegionSchedulerImpl.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, regionSchedu, "4")) {
          return;
       }
       if (SystemUtil.L(this.a) && this.f) {
          if (b.a(0x3d855db5).b()) {
             if (!PatchProxy.applyVoid(objArray, this, regionSchedu, "6")) {
                Iterator iterator = this.d.a().iterator();
                while (iterator.hasNext()) {
                   a uoa = iterator.next();
                   ArrayList uArrayList = Lists.c(uoa.c());
                   ArrayList uArrayList1 = Lists.c(uoa.d());
                   Collections.shuffle(uArrayList);
                   Collections.shuffle(uArrayList1);
                   _monitor_enter(uoa);
                   uoa.mHttpHostList = uArrayList;
                   uoa.mHttpsHostList = uArrayList1;
                   _monitor_exit(uoa);
                }
                a.m(this.d);
             }
             this.g = p0.g(this.a);
             return;
          }else {
             this.h(false);
             this.h(true);
             this.g = p0.g(this.a);
             Object[] objArray1 = new Object[false];
             c.C().w("RegionSchedulerImpl", "Speed test is started, last networkType = "+this.g, objArray1);
          }
       }
       return;
    }
}
