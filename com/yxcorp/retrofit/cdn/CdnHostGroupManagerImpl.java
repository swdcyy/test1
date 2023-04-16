package com.yxcorp.retrofit.cdn.CdnHostGroupManagerImpl;
import bjd.d;
import com.yxcorp.retrofit.cdn.CdnHostGroupManagerImpl$a;
import nsd.u;
import com.yxcorp.retrofit.cdn.CdnHostGroupManagerImpl$Companion$instance$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.util.LinkedHashMap;
import java.lang.String;
import java.util.Map;
import android.net.Uri$Builder;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.CharSequence;
import android.net.Uri;
import kotlin.jvm.internal.a;
import java.net.URLDecoder;
import java.lang.StringBuilder;
import mjd.a;
import com.yxcorp.retrofit.cdn.CdnHostGroup;
import java.util.List;
import java.util.Collection;
import qrd.l1;
import java.util.ArrayList;
import kotlin.Pair;
import qrd.r0;
import trd.t0;
import bjd.c;
import com.google.gson.Gson;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import android.content.Context;
import java.lang.Iterable;
import trd.s0;
import trd.u;
import usd.q;
import com.yxcorp.retrofit.cdn.CdnHostGroupManagerImpl$setHostGroups$1;
import android.os.Handler;
import ekd.s1;
import bjd.e;
import java.lang.Runnable;
import bjd.a;
import java.lang.Integer;
import okhttp3.Response;

public final class CdnHostGroupManagerImpl implements d	// class@00095f
{
    public final Object a;
    public final Map b;
    public final Map c;
    public c d;
    public static final p e;
    public static final CdnHostGroupManagerImpl$a f;

    static {
       CdnHostGroupManagerImpl.f = new CdnHostGroupManagerImpl$a(null);
       CdnHostGroupManagerImpl.e = s.c(CdnHostGroupManagerImpl$Companion$instance$2.INSTANCE);
    }
    public void CdnHostGroupManagerImpl(){
       super();
       this.a = new Object();
       this.b = new LinkedHashMap();
       this.c = new LinkedHashMap();
    }
    public void CdnHostGroupManagerImpl(u p0){
       super();
       this.a = new Object();
       this.b = new LinkedHashMap();
       this.c = new LinkedHashMap();
    }
    public final String a(String p0,String p1,String p2,String p3,Map p4){
       Uri$Builder uBuilder;
       try{
          uBuilder = new Uri$Builder().scheme(p2).authority(p0).appendPath(p3);
          Iterator iterator = p4.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             String key = uEntry.getKey();
             uBuilder.appendQueryParameter(key, uEntry.getValue());
          }
          iterator = (p1.length() > 0)? 1: null;
          if (iterator) {
             uBuilder.appendQueryParameter("bp", p1);
          }
          uBuilder = uBuilder.build().toString();
          a.h(uBuilder, "urlBuilder.build\(\).toString\(\)");
          uBuilder = URLDecoder.decode(uBuilder);
       }catch(java.lang.Exception e2){
          a.b("CdnHostGroupManager", "Couldn\'t compose the URL. error: "+e2);
          uBuilder = null;
       }
       return uBuilder;
    }
    public final CdnHostGroup b(String p0,String p1,boolean p2){
       CdnHostGroup uCdnHostGrou = this.b.get(p0);
       if (uCdnHostGrou != null) {
          int i = 1;
          if (p2 && (!uCdnHostGrou.isPredefined() || (!a.g(uCdnHostGrou.getVersion(), p1) || !(uCdnHostGrou.getHostList().isEmpty() ^ i)))) {
             i = 0;
          }
          if (i) {
          label_002f :
             return uCdnHostGrou;
          }
       }
       uCdnHostGrou = null;
       goto label_002f ;
    }
    public String c(String p0){
       a.q(p0, "hostGroupType");
       CdnHostGroupManagerImpl ta = this.a;
       _monitor_enter(ta);
       CdnHostGroup uCdnHostGrou = this.b.get(p0);
       uCdnHostGrou = (uCdnHostGrou != null)? uCdnHostGrou.getHost(): null;
       _monitor_exit(ta);
       return uCdnHostGrou;
    }
    public List d(String p0){
       a.q(p0, "hostGroupType");
       CdnHostGroupManagerImpl ta = this.a;
       _monitor_enter(ta);
       CdnHostGroup uCdnHostGrou = this.b.get(p0);
       List allHosts = (uCdnHostGrou != null)? uCdnHostGrou.getAllHosts(): null;
       _monitor_exit(ta);
       return allHosts;
    }
    public List e(String p0,String p1,String p2,Map p3){
       String this;
       a.q(p0, "hostGroupType");
       a.q(p1, "scheme");
       a.q(p2, "path");
       a.q(p3, "query");
       CdnHostGroupManagerImpl ta = this.a;
       _monitor_enter(ta);
       CdnHostGroup uCdnHostGrou = this.b.get(p0);
       if (uCdnHostGrou != null) {
          List allHosts = uCdnHostGrou.getAllHosts();
          String id = uCdnHostGrou.getId();
          _monitor_exit(ta);
          a.c("CdnHostGroupManager", "Get cdn host ["+allHosts+"] for "+p0);
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = allHosts.iterator();
          while (iterator.hasNext()) {
             String str = iterator.next();
             this = this.a(str, id, p1, p2, p3);
             if (this != null) {
                Pair[] pairArray = new Pair[]{r0.a("url", this),r0.a("cdn", str)};
                uArrayList.add(t0.W(pairArray));
             }
          }
          return uArrayList;
       }else {
          a.c("CdnHostGroupManager", "Couldn\'t find the cdn host group for "+p0);
          _monitor_exit(ta);
          return null;
       }
    }
    public String f(String p0,String p1,String p2,Map p3){
       String host;
       a.q(p0, "hostGroupType");
       a.q(p1, "scheme");
       a.q(p2, "path");
       a.q(p3, "query");
       CdnHostGroupManagerImpl ta = this.a;
       _monitor_enter(ta);
       CdnHostGroup uCdnHostGrou = this.b.get(p0);
       _monitor_exit(ta);
       String str = null;
       if (uCdnHostGrou == null) {
          a.c("CdnHostGroupManager", "Couldn\'t find the cdn host group for "+p0);
          return str;
       }else {
          host = uCdnHostGrou.getHost();
          if (host != null) {
             a.c("CdnHostGroupManager", "Get cdn host ["+host+"] for "+p0);
             return this.a(host, uCdnHostGrou.getId(), p1, p2, p3);
          }else {
             a.c("CdnHostGroupManager", "Couldn\'t get cdn host for "+p0);
             return str;
          }
       }
    }
    public void g(String p0,String p1){
       l1 a;
       a.q(p0, "hostGroupType");
       a.q(p1, "currentHost");
       CdnHostGroupManagerImpl ta = this.a;
       _monitor_enter(ta);
       CdnHostGroup uCdnHostGrou = this.b.get(p0);
       if (uCdnHostGrou == null) {
          a.c("CdnHostGroupManager", "Couldn\'t find the cdn host group for "+p0);
          _monitor_exit(ta);
          return;
       }else if(a.g(p1, uCdnHostGrou.getHost())){
          a.c("CdnHostGroupManager", "Switch cdn host ["+p1+"] "+"for "+p0+". success = "+uCdnHostGrou.nextHost());
          CdnHostGroupManagerImpl td = this.d;
          if (td != null) {
             a.q(uCdnHostGrou, "group");
             c b = td.b;
             if (b != null) {
                td = td.a.q(uCdnHostGrou);
                a.h(td, "it");
                int i = (td.length() > 0)? 1: 0;
                if (!i) {
                   td = null;
                }
                g.a(b.edit().putString(uCdnHostGrou.getTypeName(), td));
             }
             a = l1.a;
          }
       }else {
          a.c("CdnHostGroupManager", "Couldn\'t switch cdn host "+'['+p1+"] for "+p0+' '+"because current host doesn\'t match");
          a = l1.a;
       }
       _monitor_exit(ta);
       return;
    }
    public String h(String p0,String p1,Map p2){
       a.q(p0, "hostGroupType");
       a.q(p1, "path");
       a.q(p2, "query");
       return this.f(p0, "https", p1, p2);
    }
    public void i(Context p0,List p1){
       boolean i1;
       a.q(p0, "context");
       a.q(p1, "predefinedHostGroups");
       CdnHostGroupManagerImpl ta = this.a;
       _monitor_enter(ta);
       a.c("CdnHostGroupManager", "initialize.");
       this.b.clear();
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          CdnHostGroup uCdnHostGrou = iterator.next();
          this.c.put(uCdnHostGrou.getTypeName(), uCdnHostGrou);
       }
       c uoc = new c(p0);
       this.d = uoc;
       Map map = uoc.a();
       if (map == null) {
          map = t0.z();
       }
       CdnHostGroupManagerImpl tc = this.c;
       LinkedHashMap linkedHashMa = new LinkedHashMap(s0.j(tc.size()));
       iterator = tc.entrySet().iterator();
       int i = 0;
       while (iterator.hasNext()) {
          CdnHostGroup obj = iterator.next();
          Map$Entry key = obj.getKey();
          String key1 = obj.getKey();
          obj = obj.getValue();
          CdnHostGroup uCdnHostGrou1 = map.get(key1);
          if (uCdnHostGrou1 != null) {
             if (!uCdnHostGrou1.isPredefined() || !a.g(uCdnHostGrou1.getVersion(), obj.getVersion())) {
                if (!uCdnHostGrou1.isPredefined()) {
                   i1 = uCdnHostGrou1.getHostList().isEmpty() ^ 1;
                   if (!i1) {
                   }
                }else {
                }
             }
             i1 = true;
          label_00ae :
             if (!i1) {
                uCdnHostGrou1 = null;
             }
             if (uCdnHostGrou1 != null) {
                obj = uCdnHostGrou1;
             label_00b7 :
                linkedHashMa.put(key, obj);
             }
          }
          i = 1;
          goto label_00b7 ;
       }
       this.b.putAll(linkedHashMa);
       if (i) {
          CdnHostGroupManagerImpl td = this.d;
          if (td != null) {
             td.b(this.b);
          }
       }
       _monitor_exit(ta);
       return;
    }
    public List j(String p0,String p1,Map p2){
       a.q(p0, "hostGroupType");
       a.q(p1, "path");
       a.q(p2, "query");
       return this.e(p0, "https", p1, p2);
    }
    public void k(List p0){
       a.q(p0, "newHostGroupList");
       if (p0.isEmpty()) {
          return;
       }
       LinkedHashMap linkedHashMa = new LinkedHashMap(q.n(s0.j(u.Y(p0, 10)), 16));
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          linkedHashMa.put(obj.getTypeName(), obj);
       }
       s1.c().post(new e(new CdnHostGroupManagerImpl$setHostGroups$1(this, linkedHashMa)));
       return;
    }
    public boolean l(a p0){
       a.q(p0, "cdnException");
       if (p0.b != null) {
          a.c("CdnHostGroupManager", "Asked to switch host. "+p0);
          return true;
       }else {
          Integer integer = p0.a();
          int i = (integer != null)? integer.intValue(): 0;
          if (i >= 500) {
             return true;
          }else {
             return p0.b();
          }
       }
    }
    public boolean m(Response p0){
       a.q(p0, "response");
       return this.l(new a(p0.code(), false, 2, null));
    }
}
