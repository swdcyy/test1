package com.yxcorp.gifshow.reddot.i;
import j9c.d;
import xr4.a$a;
import java.lang.Object;
import java.util.Set;
import com.google.common.collect.o;
import java.util.concurrent.ConcurrentMap;
import com.google.common.collect.Maps;
import org.greenrobot.eventbus.a;
import lnc.u1;
import crd.b;
import lnc.b9;
import com.yxcorp.gifshow.util.rx.RxBus;
import cub.b;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import java.lang.Class;
import brd.t;
import j9c.l;
import erd.g;
import wkd.b;
import zb5.l;
import com.yxcorp.gifshow.reddot.i$a;
import i85.f;
import zb5.i;
import j9c.e;
import java.lang.String;
import j85.e;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.reddot.f;
import java.util.concurrent.Callable;
import t45.d;
import brd.z;
import j9c.i;
import erd.a;
import j9c.m;
import io.reactivex.internal.functions.Functions;
import j9c.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Map;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.google.common.base.Optional;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Boolean;
import com.yxcorp.gifshow.reddot.RedDotConfig;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import com.google.common.collect.Range;
import java.lang.Comparable;
import java.lang.Long;
import k2b.f2;
import com.kwai.component.menudot.c;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;
import java.lang.System;
import com.yxcorp.gifshow.reddot.g;
import brd.x;
import j9c.g;
import erd.o;
import j9c.f;
import com.yxcorp.gifshow.reddot.e;
import com.yxcorp.gifshow.reddot.h;
import com.yxcorp.gifshow.reddot.d;
import com.yxcorp.gifshow.reddot.c;
import j9c.j;
import j9c.k;
import j9c.n;
import com.yxcorp.gifshow.reddot.b;
import java.util.concurrent.TimeUnit;
import brd.a0;
import dc5.d;
import j9c.o;
import com.yxcorp.gifshow.reddot.a;
import m56.g;
import cub.c;

public class i implements d	// class@0017ca
{
    public final Set a;
    public final Map b;
    public b c;
    public RedDotConfig d;
    public String e;
    public long f;
    public b g;
    public b h;
    public b i;
    public Set j;
    public static final a$a k;

    static {
       i.k = new a$a();
    }
    public void i(){
       super();
       this.a = o.g();
       this.b = Maps.q();
       this.j = o.g();
       if (!a.d().i(this)) {
          u1.a(this);
       }
       b9.a(this.c);
       this.c = RxBus.f.g(b.class, RxBus$ThreadMode.POSTING).subscribe(new l(this));
       b.a(-2031148417).a(new i$a(this));
       String[] stringArray = new String[]{"Push.Webserver.RedDot"};
       b.a(-1989170423).e(new e(this), stringArray);
       if (!PatchProxy.applyVoid(null, this, i.class, "5")) {
          b9.a(this.i);
          this.i = t.fromCallable(f.b).subscribeOn(d.c).observeOn(d.a).doOnTerminate(new i(this)).subscribe(new m(this), Functions.e);
       }
       return;
    }
    public void a(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "11")) {
          return;
       }
       this.a.remove(p0);
       return;
    }
    public void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "6")) {
          return;
       }
       if (!TextUtils.n(this.e, p0)) {
          this.b.clear();
          this.e = p0;
          if (!TextUtils.x(p0)) {
             this.l();
          }
       }
       return;
    }
    public a$a c(int p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oi, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return Optional.fromNullable(this.b.get(Integer.valueOf(p0))).or(i.k);
    }
    public void d(Map p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "4")) {
          return;
       }
       i = 0;
       Iterator iterator = p0.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          boolean b = (uEntry.getValue() == Boolean.TRUE)? this.j.add(uEntry.getKey()): this.j.remove(uEntry.getKey());
          i = i | b;
       }
       if (i) {
          i td = this.d;
          if (td != null) {
             td.updateRedDotConfigs(this.j);
          }
       }
       return;
    }
    public boolean e(int p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oi, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       oi = this.d;
       boolean b = (oi != null && oi.checkEnabled(p0))? true: false;
       return b;
    }
    public boolean f(String p0,int p1){
       i oi = i.class;
       if (PatchProxy.isSupport(oi)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, oi, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       oi = this.d;
       if (oi == null) {
          return false;
       }else {
          return oi.checkEnabled(p0, p1);
       }
    }
    public boolean g(String p0){
       i obj = PatchProxy.applyOneRefs(p0, this, i.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.d;
       boolean b = (obj != null && obj.checkEnabled(p0))? true: false;
       return b;
    }
    public void h(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "10")) {
          return;
       }
       this.a.add(p0);
       return;
    }
    public List i(String p0){
       int i;
       i obj = PatchProxy.applyOneRefs(p0, this, i.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.b.size() < 1) {
          return Collections.emptyList();
       }
       obj = this.d;
       Set redDotRanges = (obj != null)? obj.getRedDotRanges(p0): null;
       if (redDotRanges == null) {
          return Collections.emptyList();
       }else {
          ArrayList uArrayList = Lists.b();
          Iterator iterator = redDotRanges.iterator();
          while (iterator.hasNext()) {
             Range range = iterator.next();
             i = range.lowerEndpoint().intValue();
             while (i <= range.upperEndpoint().intValue()) {
                a$a uoa = this.b.get(Integer.valueOf(i));
                if (uoa != null) {
                   uArrayList.add(uoa);
                }
                i = i + 1;
             }
          }
          if (uArrayList.isEmpty()) {
             uArrayList = Collections.emptyList();
          }
          return uArrayList;
       }
    }
    public final void j(a$a p0,boolean p1){
       int i;
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, oi, "13")) {
          return;
       }
       i = 2;
       int i1 = 3;
       if (p0 == null || !TextUtils.n(this.e, String.valueOf(p0.a))) {
          Object[] objArray = new Object[i1];
          String str = (p0 == null)? "NULL": "NONNULL";
          objArray[0] = str;
          objArray[1] = TextUtils.k(this.e);
          String str1 = (p0 == null)? "": String.valueOf(p0.a);
          objArray[i] = str1;
          f2.b("RedDotManagerImpl", "onReceived: newRedDot is %1$s, currentUid :=%2$s, new userId := %3$s", objArray);
          return;
       }else {
          Object[] objArray1 = new Object[5];
          String str2 = "API-Server";
          String str3 = (p1)? str2: "IM-SDK-Server";
          objArray1[0] = str3;
          objArray1[1] = Integer.valueOf(p0.g);
          objArray1[i] = Long.valueOf(p0.c);
          objArray1[i1] = Long.valueOf(p0.d);
          objArray1[4] = Long.valueOf((p0.c - p0.d));
          f2.b("RedDotManagerImpl", "onReceived: Received redDots from %1$s, type :=%2$s, total := %3$s, waterline := %4$s, delta := %5$s", objArray1);
          if (p0.g == null) {
             p0.g = p0.b;
          }
          Object[] objArray2 = null;
          if (!PatchProxy.applyVoid(objArray2, objArray2, oi, "12") && !PatchProxy.applyVoid(objArray2, objArray2, c.class, "36")) {
             b.a(0x34c80eb4);
          }
          a$a uoa = this.b.get(Integer.valueOf(p0.g));
          if (uoa == null || p0.h - uoa.h > 0) {
             objArray2 = new Object[1];
             if (!p1) {
                str2 = "IM-SDK-Server";
             }
             objArray2[0] = str2;
             f2.b("RedDotManagerImpl", "onReceived: Received redDots from %1$s, cache and notify all", objArray2);
             this.b.put(Integer.valueOf(p0.g), p0);
             Iterator iterator = this.a.iterator();
             while (iterator.hasNext()) {
                iterator.next().a(p0, uoa);
             }
          }
          return;
       }
    }
    public void k(RequestTiming p0){
       int i;
       Object[] objArray;
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "14")) {
          return;
       }
       i = 0;
       if (!SystemUtil.L(a.B)) {
          objArray = new Object[i];
          f2.b("RedDotManagerImpl", "postFetchRedDot: Failed, reason: doesn\'t in main process", objArray);
          return;
       }else if(TextUtils.x(this.e) || this.d == null){
          objArray = new Object[1];
          String str = (this.d == null)? "RedDotConfig is null": "Not Signed";
          objArray[i] = str;
          f2.b("RedDotManagerImpl", "postFetchRedDot: Failed, reason: %1$s", objArray);
          return;
       }else {
          i tg = this.g;
          if (tg != null && !tg.isDisposed()) {
             objArray = new Object[i];
             f2.b("RedDotManagerImpl", "postFetchRedDot: Failed, reason: Fetch data is already flying", objArray);
             return;
          }else if((System.currentTimeMillis() - this.f) - 1000 < 0){
             objArray = new Object[]{Long.valueOf(1000)};
             f2.b("RedDotManagerImpl", "postFetchRedDot: Failed, reason: Continuous request time interval should >= %1$s ms", objArray);
             return;
          }else {
             Object[] objArray1 = new Object[i];
             f2.b("RedDotManagerImpl", "postFetchRedDot: start to pull all redDots", objArray1);
             this.g = t.just(Boolean.TRUE).compose(g.b).flatMap(new g(p0)).observeOn(d.c).doOnNext(new f(this)).map(e.b).doOnNext(new h(this)).flatMapIterable(d.b).map(c.b).doOnTerminate(new j(this)).doOnComplete(new k(this)).subscribe(new n(this), b.b);
             return;
          }
       }
    }
    public final void l(){
       if (PatchProxy.applyVoid(null, this, i.class, "7")) {
          return;
       }
       i th = this.h;
       if (th == null || th.isDisposed()) {
          this.h = a0.Y(10, TimeUnit.SECONDS).G(d.a).R(new o(this), a.b);
       }
       return;
    }
    public void onEvent(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "17")) {
          return;
       }
       if (TextUtils.x(this.e)) {
          return;
       }
       if (!b.a(-1989170423).d()) {
          Object[] objArray = new Object[0];
          f2.b("RedDotManagerImpl", "onAppForegroundEvent: Ready to call syncIfNeedWait10Secs", objArray);
          this.l();
       }
       return;
    }
    public void onNotifyStartUpEvent(b p0){
       int i;
       Object[] objArray;
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "18")) {
          return;
       }
       if (p0 != null && p0.a != null) {
          i ti = this.i;
          if (ti != null) {
             ti.dispose();
             this.i = null;
          }
          c mRedDotConfi = p0.a.mRedDotConfig;
          if (mRedDotConfi == null) {
             return;
          }else {
             i = mRedDotConfi.equals(this.d) ^ 0x01;
             if (i) {
                this.d = mRedDotConfi;
                objArray = new Object[0];
                f2.b("RedDotManagerImpl", "onNotifyStartUpEvent: ReDotConfig changed", objArray);
             }
             if (this.d.updateRedDotConfigs(this.j)) {
                objArray = new Object[0];
                f2.b("RedDotManagerImpl", "onNotifyStartUpEvent: ReDotConfig ranges changed", objArray);
             }
             if (i || !this.b.size()) {
                objArray = new Object[0];
                f2.b("RedDotManagerImpl", "onNotifyStartUpEvent: Ready to call postFetchRedDot", objArray);
                this.k(RequestTiming.AFTER_STARTUP);
             }
          }
       }
    label_0060 :
       return;
    }
}
