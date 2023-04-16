package com.kuaishou.merchant.live.marketing.sandeago.o;
import is3.b;
import m64.a;
import java.lang.String;
import ot3.x0;
import java.util.HashMap;
import java.util.HashSet;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import com.kuaishou.merchant.live.marketing.sandeago.o$a;
import java.util.Map;
import java.lang.Integer;
import ekd.k1;
import android.app.Activity;
import brd.t;
import mrd.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.merchant.live.MerchantLiveLogBiz;
import p74.a;
import o74.a;
import java.lang.Boolean;
import com.kuaishou.merchant.live.marketing.sandeago.j;
import erd.g;
import n64.r;
import mrd.c;
import erd.o;
import com.kwai.framework.model.user.UserInfo;
import y04.d;
import y04.c;
import cjd.e;
import com.kuaishou.merchant.live.marketing.sandeago.k;
import com.kuaishou.merchant.live.marketing.sandeago.m;
import java.util.Collections;
import java.lang.Number;
import hs5.a$a;
import n64.y;
import com.kuaishou.merchant.live.marketing.sandeago.h;
import crd.b;
import n64.z;
import com.kuaishou.merchant.live.marketing.sandeago.i;
import hs3.c;
import java.util.Collection;
import java.util.Iterator;
import r14.k;
import e17.i;
import u07.t$a;
import com.kuaishou.merchant.live.marketing.sandeago.l;
import u07.u;
import n64.u;
import com.kwai.library.widget.popup.common.c$b;
import u07.t;
import u07.j;
import java.util.Set;
import java.util.Map$Entry;
import com.kwai.sdk.switchconfig.a;
import n64.s;
import java.lang.Runnable;
import is3.c;
import com.kuaishou.merchant.live.marketing.sandeago.n;
import io.reactivex.g;
import java.lang.Math;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import ot3.z;
import n64.m;
import n64.x;
import t90.q;
import erd.a;

public class o extends a implements b	// class@001a5a
{
    public int g;
    public Map h;
    public Map i;
    public Set j;
    public int k;
    public Map l;
    public Map m;
    public static final String n;

    static {
       o.n = x0.a("https://app.kwaixiaodian.com/merchant/category?type=all&sourceType=98&from=SANDEAGO");
    }
    public void o(){
       super();
       this.g = 1;
       this.h = new HashMap();
       this.i = new HashMap();
       this.j = new HashSet();
       this.l = new HashMap();
       this.m = new HashMap();
    }
    public static o H(){
       Object obj = PatchProxy.apply(null, null, o.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(0x198aa694);
    }
    public void B(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "4")) {
          return;
       }
       super.B(p0);
       this.D(p0);
       return;
    }
    public synchronized void C(String p0,o$a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, o.class, "20")) {
          return;
       }
       Map map = this.i.get(p0);
       if (map == null) {
          map = new HashMap();
          this.i.put(p0, map);
       }
       if (!map.containsKey(p1.a)) {
          Integer integer = this.h.get(p0);
          o th = this.h;
          int i = (integer != null)? integer.intValue(): 0;
          th.put(p0, Integer.valueOf((i + 1)));
       }
       map.put(p1.a, p1);
       return;
    }
    public synchronized void D(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "17")) {
          return;
       }
       this.i.remove(p0);
       this.h.remove(p0);
       k1.n("SandeagoManager");
       return;
    }
    public final t E(Activity p0,String p1){
       a obj = PatchProxy.applyTwoRefs(p0, p1, this, o.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.g();
       String str = this.g(p1);
       if (!TextUtils.x(str)) {
          return this.y(p0, p1, str).doOnError(j.b).flatMap(new r(this, p1, obj));
       }
       a.A(MerchantLiveLogBiz.LIVE_SANDEAGO, "close sandeago failed", "sandeagoId is null");
       obj.onNext(Boolean.FALSE);
       return obj;
    }
    public t F(String p0,UserInfo p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, o.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return c.a().b().map(new e()).flatMap(new k(this, p0, p1));
    }
    public t G(String p0,String p1,String p2,String p3,int p4){
       m obj;
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4)};
          obj = PatchProxy.apply(objArray, this, oo, "23");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new m(this, p1, p2, p3, p4);
       return c.a().u(p0, p1, p3, p2).map(new e()).flatMap(v6);
    }
    public Map I(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map map = this.i.get(p0);
       if (map != null) {
          return map;
       }
       return Collections.emptyMap();
    }
    public int J(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Integer integer = this.h.get(p0);
       int i = (integer != null)? integer.intValue(): 0;
       i++;
       return i;
    }
    public void K(String p0,String p1,String p2,int p3,a$a p4){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, this, oo, "24")) {
             return;
          }
       }
       y oy = new y(this, p3, p0, p2, p1, p4);
       c.a().k(p1, p0, p2, p3).map(new e()).subscribe(v8, h.b);
       return;
    }
    public void L(String p0,UserInfo p1,a$a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, o.class, "27")) {
          return;
       }
       String str = PatchProxy.applyOneRefs(p0, this, o.class, "32");
       if (str != PatchProxyResult.class) {
       }else {
          str = this.l.get(p0);
          if (str == null) {
             str = "";
          }
       }
       Object obj = str;
       String str1 = this.c(p0);
       z oz = new z(this, p0, p1, str1, obj, p2);
       c.a().c(obj, str1, p0).map(new e()).subscribe(v8, i.b);
       return;
    }
    public void M(int p0){
       this.k = p0;
    }
    public final void N(String p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, o.class, "25")) {
          return;
       }
       this.m(p0, p1);
       this.a(p0, p2);
       return;
    }
    public synchronized void W(String p0,UserInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, o.class, "12")) {
          return;
       }
       c uoc = this.d.get(p0);
       if (uoc != null) {
          uoc.K5(p0, p1);
       }
       return;
    }
    public void a(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, o.class, "31")) {
          return;
       }
       this.m.put(p0, p1);
       return;
    }
    public String c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = this.m.get(p0);
       if (p0 == null) {
          p0 = "";
       }
       return p0;
    }
    public String g(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       o$a uoa = this.I(p0).values().iterator().next();
       uoa = (uoa != null)? uoa.a: "";
       return uoa;
    }
    public t h(Activity p0,String p1){
       a obj = PatchProxy.applyTwoRefs(p0, p1, this, o.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.g();
       k.c(p1);
       if (!TextUtils.x(p1) && this.u(p1)) {
          if (this.w(p1) > 1) {
             a.A(MerchantLiveLogBiz.LIVE_SANDEAGO, "close sandeago failed", "multi sandeago");
             obj.onNext(Boolean.FALSE);
             i.a(R.style.arg_RES_7f110668, 0x7f10434f);
             return obj;
          }else {
             t$a uoa = new t$a(p0);
             uoa.W0(R.string.arg_RES_7f104388);
             uoa.Q0(R.string.cancel);
             uoa.S0(R.string.arg_RES_7f104389);
             uoa.u0(new l(this, p0, p1, obj));
             uoa.t0(new u(obj));
             uoa.z(false);
             uoa.v(true);
             uoa.A(false);
             j.d(uoa);
          }
       }else {
          a.s(MerchantLiveLogBiz.LIVE_SANDEAGO, "SandeagoManager", "turn sandeago mode off");
          this.b(p1, false);
          obj.onNext(Boolean.TRUE);
       }
       return obj;
    }
    public synchronized void j(String p0,String p1,int p2){
       if (PatchProxy.isSupport(o.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, o.class, "19")) {
          return;
       }
       o$a uoa = new o$a();
       uoa.a = p1;
       uoa.b = (long)p2;
       this.C(p0, uoa);
       return;
    }
    public void l(String p0,Map p1){
       o oo = o.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, oo, "22")) {
          return;
       }
       a.s(MerchantLiveLogBiz.LIVE_SANDEAGO, "SandeagoManager", "updateSandeago");
       Iterator iterator = p1.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          if (uEntry != null) {
             String key = uEntry.getKey();
             int i = uEntry.getValue().intValue();
             _monitor_enter(this);
             if (PatchProxy.isSupport(oo) && PatchProxy.applyVoidThreeRefs(p0, key, Integer.valueOf(i), this, o.class, "19")) {
                _monitor_exit(this);
             }else {
                o$a uoa = new o$a();
                uoa.a = key;
                uoa.b = (long)i;
                this.C(p0, uoa);
                _monitor_exit(this);
             }
          }
       }
       if (a.t().d("enable_sandeago_update", false)) {
          a.t(MerchantLiveLogBiz.LIVE_SANDEAGO, "SandeagoManager", "updateSandeago", "just list size", Integer.valueOf(p1.size()));
          k1.n("SandeagoManager");
          k1.s(new s(this, p0, p1), "SandeagoManager", 1000);
       }
       return;
    }
    public void m(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, o.class, "30")) {
          return;
       }
       this.l.put(p0, p1);
       return;
    }
    public void n(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "29")) {
          return;
       }
       this.j.remove(p0);
       return;
    }
    public t r(Activity p0,String p1,String p2,String p3){
       a obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, o.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.g();
       k.c(p1);
       if (this.u(p1)) {
          if (this.I(p1).size() > 1) {
             a.A(MerchantLiveLogBiz.LIVE_SANDEAGO, "close sandeago failed", "multi sandeago");
             obj.onNext(Boolean.FALSE);
             i.a(R.style.arg_RES_7f110668, 0x7f10434f);
             return obj;
          }else {
             n on = new n(this, p0, p2, p3, p1);
             return t.create(obj);
          }
       }else if(this.x(p1)){
          a.s(MerchantLiveLogBiz.LIVE_SANDEAGO, "SandeagoManager", "turn sandeago mode off");
          this.b(p1, false);
          i.a(R.style.arg_RES_7f11066a, 0x7f10436b);
       }
       obj.onNext(Boolean.TRUE);
       return obj;
    }
    public synchronized void t(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, o.class, "21")) {
          return;
       }
       Map map = this.i.get(p0);
       if (map != null) {
          map.remove(p1);
       }
       return;
    }
    public boolean u(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (this.I(p0).isEmpty() ^ 0x01);
    }
    public void v(int p0){
       o oo = o.class;
       if (PatchProxy.isSupport(oo) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oo, "6")) {
          return;
       }
       this.g = Math.max(p0, 1);
       return;
    }
    public int w(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.I(p0).size();
    }
    public t y(Activity p0,String p1,String p2){
       ProgressFragment obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, o.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = z.a(p0);
       obj.Ih(R.string.arg_RES_7f10438b);
       return c.a().t(p1, p2).map(new e()).doOnNext(new m(this, p1, p2)).doOnError(new x(p0)).doFinally(new q(obj));
    }
    public void z(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "28")) {
          return;
       }
       this.j.add(p0);
       return;
    }
}
