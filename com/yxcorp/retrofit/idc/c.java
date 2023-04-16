package com.yxcorp.retrofit.idc.c;
import fjd.b;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.HashMap;
import java.util.ArrayList;
import com.yxcorp.retrofit.idc.PreconnectManager;
import com.yxcorp.retrofit.idc.c$a;
import com.yxcorp.retrofit.idc.c$b;
import java.lang.String;
import javax.net.ssl.HostnameVerifier;
import ijd.a;
import com.yxcorp.retrofit.idc.models.Host;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Map;
import jjd.a;
import jjd.b;
import com.kuaishou.godzilla.idc.KwaiIDCHost;
import com.kuaishou.godzilla.idc.KwaiIDCSelector;
import java.lang.StringBuilder;
import mjd.a;
import java.util.List;
import java.util.Iterator;
import javax.net.ssl.SSLSocketFactory;
import android.content.Context;
import okhttp3.OkHttpClient;
import kjd.b;
import gjd.a;
import ekd.k1;
import java.util.Collection;
import ekd.q;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import java.util.Set;
import java.util.Collections;
import com.yxcorp.retrofit.idc.c$c;
import com.yxcorp.utility.NetworkUtilsCached$a;
import com.yxcorp.utility.NetworkUtilsCached;
import com.kuaishou.godzilla.Godzilla;
import com.yxcorp.retrofit.idc.b;
import com.kuaishou.godzilla.Godzilla$Logger;
import com.yxcorp.retrofit.idc.a;
import com.kuaishou.godzilla.Godzilla$LibraryLoader;
import oe6.o;
import skd.a;
import com.kuaishou.godzilla.idc.KwaiDefaultIDCSpeedTestRequestGenerator;
import kjd.a;
import com.kuaishou.godzilla.idc.KwaiDefaultIDCStorage;
import com.kuaishou.godzilla.idc.KwaiDefaultIDCStorage$DefaultHostsReader;
import com.kuaishou.godzilla.idc.KwaiSpeedTestRequestGenerator;
import com.kuaishou.godzilla.idc.KwaIDCSpeedTestCallback;
import com.kuaishou.godzilla.idc.KwaiIDCStorage;
import com.yxcorp.utility.SystemUtil;

public final class c implements b	// class@0013d5
{
    public final Object a;
    public final AtomicBoolean b;
    public Context c;
    public a d;
    public final Map e;
    public final List f;
    public KwaiIDCSelector g;
    public SharedPreferences h;
    public boolean i;
    public a j;
    public final PreconnectManager k;
    public final KwaiDefaultIDCStorage$DefaultHostsReader l;

    public void c(){
       super();
       this.a = new Object();
       this.b = new AtomicBoolean(false);
       this.e = new HashMap();
       this.f = new ArrayList();
       this.i = false;
       this.k = new PreconnectManager();
       this.l = new c$a(this);
    }
    public void c(c$a p0){
       super();
       this.a = new Object();
       this.b = new AtomicBoolean(false);
       this.e = new HashMap();
       this.f = new ArrayList();
       this.i = false;
       this.k = new PreconnectManager();
       this.l = new c$a(this);
    }
    public static c n(){
       return c$b.a;
    }
    public HostnameVerifier a(String p0,String p1){
       c tj = this.j;
       if (tj != null) {
          return tj.a(p0, p1);
       }
       return null;
    }
    public boolean b(String p0){
       c tj = this.j;
       if (tj != null) {
          return tj.b(p0);
       }
       return false;
    }
    public Host c(String p0){
       if (!this.p()) {
          return null;
       }
       Host host = this.j.c(p0);
       if (host != null && !TextUtils.isEmpty(host.mHost)) {
          a uoa = this.e.get(p0);
          boolean b = (uoa != null && uoa.c().isHttps())? true: false;
          host.mIsHttps = b;
          return host;
       }else {
          host = this.l(this.g.getHost(p0));
          a.c("RouterImpl", "RouterImpl.getHost "+host+" for type "+p0);
          return host;
       }
    }
    public List d(String p0){
       List hosts = this.g.getHosts(p0);
       ArrayList uArrayList = new ArrayList();
       if (hosts != null) {
          Iterator iterator = hosts.iterator();
          while (iterator.hasNext()) {
             uArrayList.add(this.l(iterator.next()));
          }
       }
       return uArrayList;
    }
    public int e(String p0){
       if (!this.p()) {
          return -1;
       }
       return this.g.getHostCount(p0);
    }
    public void f(String p0,Host p1){
       if (!this.p()) {
          return;
       }
       a.c("RouterImpl", "RouterImpl switchHost type "+p0+" with host "+p1);
       this.g.switchHost(p0, p1.mHost);
       this.k.a(p0, 2);
       return;
    }
    public SSLSocketFactory g(String p0,String p1){
       c tj = this.j;
       if (tj != null) {
          return tj.d(p0, p1);
       }
       return null;
    }
    public b getType(String p0){
       if (p0 != null && p0.contains(".mock-host.com")) {
          p0 = p0.substring(0, p0.indexOf(46));
          Iterator iterator = this.f.iterator();
          while (iterator.hasNext()) {
             b uob = iterator.next();
             if ((uob.getName()).equals(p0)) {
                return uob;
             }
          }
       }
       return null;
    }
    public void h(Context p0,Map p1,OkHttpClient p2,b p3,String p4){
       this.k(p0, p1, p2, p3, p4, null);
    }
    public void i(a p0){
       a a;
       boolean b3;
       k1.b(p0, "Config should not be null.");
       if (p0.equals(this.d)) {
          a.c("RouterImpl", "RouterImpl.updateConfig does not change, ignore");
          return;
       }else if(!this.p()){
          return;
       }else {
          this.d = p0;
          Iterator iterator = this.e.values().iterator();
          while (iterator.hasNext()) {
             a uoa = iterator.next();
             _monitor_enter(this);
             if (p0.a == null) {
                p0.a = new HashMap();
             }
             a = p0.a;
             if (p0.b == null) {
                p0.b = new HashMap();
             }
             a b = p0.b;
             b uob = uoa.c();
             boolean b1 = true;
             boolean b2 = (!p0.b())? true: false;
             List list = this.m(b, uob.getName(), b1);
             if (q.f(list)) {
                list = this.m(a, uob.getName(), uob.isDefaultHttps());
                b3 = false;
             }else {
                b3 = true;
                b2 = false;
             }
             if (!list.isEmpty()) {
                b3 = (b3 || uob.isDefaultHttps())? true: false;
                uob.setHttps(b3);
                this.g.setHosts(uob.getName(), list, b2);
                String str = "RouterImpl";
                StringBuilder str1 = "RouteTypeImpl.config type: "+uob.getName()+", server only: "+p0.b()+", final server only: ";
                if (b2) {
                   b1 = false;
                }
                a.c(str, str1+b1+", hosts: "+list);
             }
             _monitor_exit(this);
          }
          this.k.b();
          this.q();
          return;
       }
    }
    public void j(boolean p0){
       this.i = p0;
       if (!this.p()) {
          return;
       }
       g.a(this.h.edit().putBoolean("disable_speed_testing", p0));
       return;
    }
    public void k(Context p0,Map p1,OkHttpClient p2,b p3,String p4,a p5){
       c ta = this.a;
       _monitor_enter(ta);
       if (this.b.get()) {
          _monitor_exit(ta);
          return;
       }else {
          this.o(p0, p1, p2, p3, p4, p5);
          _monitor_exit(ta);
          return;
       }
    }
    public final Host l(KwaiIDCHost p0){
       if (p0 == null) {
          return null;
       }
       return new Host(p0.mDomain, p0.mIsHttps);
    }
    public final List m(Map p0,String p1,boolean p2){
       Iterator iterator;
       a uoa = this.e.get(p1);
       String str = (uoa == null)? "": uoa.d();
       List list = p0.get(str);
       if (list == null) {
          list = p0.get(p1);
       }
       ArrayList uArrayList = new ArrayList();
       if (list != null) {
          uArrayList.addAll(list);
       }
       if (uoa != null && uoa.f()) {
          Set set = uoa.a();
          if (q.f(uArrayList)) {
             uArrayList = Collections.emptyList();
          }else {
             ArrayList uArrayList2 = new ArrayList();
             iterator = uArrayList.iterator();
             while (iterator.hasNext()) {
                String str2 = iterator.next();
                if (set.contains(str2)) {
                   uArrayList2.add(str2);
                }
             }
             uArrayList = uArrayList2;
          }
       }
       if (q.f(uArrayList)) {
          a.c("RouterImpl", "Hosts failed found host for: "+p1);
       }
       if (q.f(uArrayList)) {
          return Collections.emptyList();
       }else {
          ArrayList uArrayList1 = new ArrayList();
          iterator = uArrayList.iterator();
          while (iterator.hasNext()) {
             String str1 = iterator.next();
             if (!TextUtils.isEmpty(str1)) {
                uArrayList1.add(new KwaiIDCHost(str1, p2));
             }
          }
          return uArrayList1;
       }
    }
    public final void o(Context p0,Map p1,OkHttpClient p2,b p3,String p4,a p5){
       a uoa;
       a.c("RouterImpl", "initialize.");
       this.c = p0;
       this.e.putAll(p1);
       c tk = this.k;
       _monitor_enter(tk);
       tk.a = this;
       tk.b.putAll(this.e);
       _monitor_exit(tk);
       this.j = p5;
       NetworkUtilsCached.m(new c$c(this));
       tk = this.j;
       if (tk != null && tk.e()) {
          Godzilla.setDebug(true);
       }
       Godzilla.setLogger(b.a);
       Godzilla.initialize(a.a);
       tk = this.j;
       int i = 0;
       SharedPreferences sharedPrefer = (tk != null && tk.e())? 1: null;
       c tc = this.c;
       String str = "router";
       sharedPrefer = (sharedPrefer)? o.c(tc, str, i): a.b(tc, str);
       this.h = sharedPrefer;
       this.i = sharedPrefer.getBoolean("disable_speed_testing", i);
       this.g = new KwaiIDCSelector(new KwaiDefaultIDCSpeedTestRequestGenerator(p2, p4), new a(p3), new KwaiDefaultIDCStorage(this.h, this.l, "idc"));
       Iterator iterator = this.e.values().iterator();
       while (iterator.hasNext()) {
          b uob = iterator.next().c();
          KwaiIDCHost host = this.g.getHost(uob.getName());
          if (host != null) {
             uob.setHttps(host.mIsHttps);
          }
          this.f.add(uob);
       }
       this.b.set(true);
       this.k.b();
       return;
    }
    public final boolean p(){
       boolean b = this.b.get();
       if (!b) {
          a.c("RouterImpl", "Initialization needs to be done.");
       }
       return b;
    }
    public void q(){
       if (SystemUtil.L(this.c)) {
          c td = this.d;
          if (td != null) {
             if (this.i != null) {
                Iterator iterator = td.a().iterator();
                while (iterator.hasNext()) {
                   String str = iterator.next();
                   List hosts = this.g.getHosts(str);
                   Collections.shuffle(hosts);
                   this.g.setHosts(str, hosts);
                   this.k.a(str, 1);
                }
             }else {
                this.g.setSpeedTestTypes(td.a());
                this.g.setTimeout(this.d.f);
                this.g.setGoodIdcThresholdMs(this.d.e);
                this.g.launchSpeedTest();
             }
             return;
          }
       }
       a.a("RouterImpl", "startSpeedTest is NOT in main process");
       return;
    }
}
