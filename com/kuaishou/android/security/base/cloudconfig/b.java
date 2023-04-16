package com.kuaishou.android.security.base.cloudconfig.b;
import android.content.Context;
import java.lang.Object;
import java.util.ArrayList;
import com.kuaishou.android.security.base.cloudconfig.c;
import com.kuaishou.android.security.base.util.c;
import com.kuaishou.android.security.base.util.i;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import org.json.JSONObject;
import java.lang.Long;
import x38.c;
import java.lang.Boolean;
import java.lang.System;
import java.util.Iterator;
import java.lang.Throwable;
import com.kuaishou.android.security.base.log.d;
import com.kuaishou.android.security.base.util.n;
import com.kuaishou.android.security.base.logsender.a;
import x38.a;
import com.kuaishou.android.security.bridge.main.b;
import com.kuaishou.android.security.internal.common.KSecurityContext;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.android.security.base.util.g;
import com.middleware.security.MXSec;
import com.middleware.security.wrapper.IKSecurityBase;
import android.util.Base64;
import java.lang.StringBuilder;

public class b	// class@000ed5
{
    public final Context a;
    public c b;
    public c c;
    public i d;
    public ArrayList e;
    public static b f;

    public void b(Context p0){
       super();
       this.e = new ArrayList();
       this.a = p0;
       this.b = new c(p0);
       this.c = new c(p0);
       this.d = new i(p0);
    }
    public static synchronized b a(Context p0){
       _monitor_enter(b.class);
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "1");
       if (obj != PatchProxyResult.class) {
          _monitor_exit(b.class);
          return obj;
       }else if(b.f == null){
          b.f = new b(p0);
       }
       _monitor_exit(b.class);
       return b.f;
    }
    public final void a(JSONObject p0){
       boolean b;
       b tb2;
       Long longx;
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "8")) {
          return;
       }
       JSONObject jSONObject = p0.optJSONObject("native");
       String str = "sw";
       int i = 1;
       if (jSONObject != null) {
          b tb = this.b;
          b = (jSONObject.optInt(str, i) == i)? true: false;
          tb.e(b);
       }
       p0 = p0.optJSONObject("dfp");
       if (p0 != null) {
          b tb1 = this.b;
          b = (p0.optInt(str, i) == i)? true: false;
          tb1.a(b);
          b = p0.optInt("interval", 7);
          if (b > 0) {
             this.b.b(b);
          }
          this.b.c(p0.optInt("relimit", 20));
          b = p0.optInt("festlimit", 0);
          if (b == i) {
             this.b.a(b);
          }else {
             this.b.a(0);
          }
          long l = 0;
          long l1 = p0.optLong("festStart", l);
          String str1 = "pl_f_d_f_st";
          if (l1 - l) {
             this.b.a(str1, Long.valueOf(l1));
          }else {
             this.b.a(str1, Long.valueOf(l));
          }
          l1 = p0.optLong("festEnd", l);
          if (l1 - l) {
             tb2 = this.b;
             longx = Long.valueOf(l1);
          }else {
             tb2 = this.b;
             longx = Long.valueOf(l);
          }
          tb2.a("pl_f_d_f_ed", longx);
       }
       return;
    }
    public void a(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "10")) {
          return;
       }
       if (p0 != null) {
          this.e.add(p0);
       }
       return;
    }
    public void a(boolean p0){
       Iterator iterator;
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "11")) {
          return;
       }
       long l = this.b.d();
       long l1 = (long)this.b.e() * 0x36ee80;
       long l2 = System.currentTimeMillis();
       if (l1 <= 0) {
          if (p0) {
             iterator = this.e.iterator();
             while (iterator.hasNext()) {
                iterator.next().a();
             }
          }
          return;
       }else {
          l = l2 - l;
          if (l - l1 >= 0) {
             if (n.f(this.a)) {
                d.b("requestPolicy");
                this.a();
             }else {
                d.b("no net for requestPolicy");
             }
             this.b.a(l2);
             n.a(this.a, "com.kw.pp.action", 218, l1);
          }else {
             d.b("policy in interval");
             n.a(this.a, "com.kw.pp.action", 218, (l1 - l));
          }
          if (p0) {
             iterator = this.e.iterator();
             while (iterator.hasNext()) {
                iterator.next().a();
             }
          }
          return;
       }
    }
    public synchronized final boolean a(){
       g og;
       String str1;
       Object obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       JSONObject jSONObject = new JSONObject();
       String str = "KWE_N";
       a uoa = a.a(this.a).a();
       if (uoa != null) {
          str = uoa.b(0x11000a);
       }
       jSONObject.put("sdkVersion", str);
       jSONObject.put("appVersion", n.b(this.a));
       jSONObject.put("packageName", this.a.getPackageName());
       jSONObject.put("productName", b.i().h().getProductName());
       str = "";
       uoa = a.a(this.a).a();
       if (uoa != null) {
          str = uoa.b(0x110008);
       }
       if (TextUtils.isEmpty(str)) {
          str = "KWE_N";
       }
       jSONObject.put("outId", str);
       if (("KS_TV").equals(b.i().h().getProductName())) {
          og = new g("aHR0cHM6Ly9nZGZwLWdpZnNob3cueXN0LmFpc2VlLnR2L3Jlc3QvaW5mcmEvZ2RmcC9yZXBvcnQvZ2V0L2NvbmZpZw==");
          str1 = "carryInfo";
       }else {
          og = new g("aHR0cHM6Ly9nZGZwLmtzYXBpc3J2LmNvbS9yZXN0L2luZnJhL2dkZnAvcmVwb3J0L2dldC9jb25maWc=");
          str1 = "carryInfo";
       }
       String str2 = jSONObject.toString();
       str2 = og.a(str1, str2);
       if (TextUtils.isEmpty(str2)) {
          return false;
       }else {
          JSONObject jSONObject1 = new JSONObject(str2);
          if (jSONObject1.optInt("result") != 1) {
             return false;
          }else {
             str2 = jSONObject1.optString("conf");
             if (!TextUtils.isEmpty(str2)) {
                str = new String(MXSec.get().getWrapper().atlasDecrypt("ztdfp", "7e46b28a-8c93-4940-8238-4c60e64e3c81", false, Base64.decode(str2, false)));
                d.b("conf: "+str);
                jSONObject = new JSONObject(str);
                this.e(jSONObject);
                this.a(jSONObject);
                this.d(jSONObject);
                this.b(jSONObject);
                this.g(jSONObject);
                this.f(jSONObject);
                this.c(jSONObject);
             }
             return true;
          }
       }
    }
    public final void b(JSONObject p0){
       b tb;
       int i2;
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "6")) {
          return;
       }
       JSONObject jSONObject = p0.optJSONObject("env");
       String str = "sw";
       int i = 0;
       if (jSONObject != null) {
          boolean i1 = jSONObject.optInt(str, 1);
          if (i1 >= 0) {
             tb = this.b;
             i1 = (i1 == 1)? true: false;
             tb.d(i1);
          }
          this.b.f(jSONObject.optInt("cycle", 24));
          this.b.g(jSONObject.optInt("limit", 5));
          i1 = jSONObject.optInt("delay", 1);
          if (i1 >= 0) {
             tb = this.b;
             i1 = (i1 == 1)? true: false;
             tb.b(i1);
          }
          i2 = jSONObject.optInt("delayT1", i);
          if (i2 >= 0) {
             this.b.d(i2);
          }
       }
       p0 = p0.optJSONObject("riskda");
       if (p0 != null) {
          i2 = p0.optInt(str, 1);
          if (i2 >= 0) {
             b tb1 = this.b;
             if (i2 == 1) {
                i = true;
             }
             tb1.f(i);
          }
          this.b.k(p0.optInt("limit", 3));
       }
       return;
    }
    public final void c(JSONObject p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "3")) {
          return;
       }
       p0 = p0.optJSONObject("ksp");
       b = false;
       this.d.b(b);
       if (p0 != null) {
          b td = this.d;
          boolean b1 = (p0.optInt("spsw", b) == 1)? true: false;
          td.c(b1);
          td = this.d;
          b1 = (p0.optInt("ipsw", b) == 1)? true: false;
          td.b(b1);
          b td1 = this.d;
          if (p0.optInt("ipr", b) == 1) {
             b = true;
          }
          td1.a(b);
       }
       return;
    }
    public final void d(JSONObject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "7")) {
          return;
       }
       p0 = p0.optJSONObject("policy");
       if (p0 != null) {
          int i = p0.optInt("interval", 3);
          if (i >= 0) {
             this.b.h(i);
          }
          Iterator iterator = p0.keys();
          while (iterator.hasNext()) {
             String str = iterator.next();
             if (!TextUtils.isEmpty(str) && str.startsWith("plc")) {
                JSONObject jSONObject = p0.optJSONObject(str);
                if (jSONObject != null) {
                   this.b.a(str, jSONObject.toString());
                }else {
                   this.b.a(str, "");
                }
             }
          }
       }
       return;
    }
    public final void e(JSONObject p0){
       b tb;
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "9")) {
          return;
       }
       p0 = p0.optJSONObject("report");
       if (p0 != null) {
          int i = 1;
          boolean i1 = p0.optInt("sw", i);
          if (i1 >= 0) {
             tb = this.b;
             i1 = (i1 == i)? true: false;
             tb.i(i1);
          }
          i1 = p0.optInt("litesw", i);
          if (i1 >= 0) {
             tb = this.b;
             i1 = (i1 == i)? true: false;
             tb.h(i1);
          }
          i1 = p0.optInt("ala", i);
          if (i1 >= 0) {
             tb = this.b;
             if (i1 != i) {
                i = false;
             }
             tb.g(i);
          }
          i1 = p0.optInt("interval", 3);
          if (i1 > 0) {
             this.b.j(i1);
          }
          int i2 = p0.optInt("num", 50);
          if (i2 > 0) {
             this.b.l(i2);
          }
       }
       return;
    }
    public final void f(JSONObject p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "4")) {
          return;
       }
       p0 = p0.optJSONObject("dlp");
       b = false;
       this.c.a(b);
       this.c.d(b);
       this.c.e(b);
       this.c.a(0);
       this.c.c("");
       this.c.b(b);
       int i = 0x1869f;
       this.c.b(i);
       this.c.d(i);
       if (p0 != null) {
          b tc = this.c;
          boolean b1 = (p0.optInt("dsw", b) == 1)? true: false;
          tc.a(b1);
          tc = this.c;
          b1 = (p0.optInt("rsw", b) == 1)? true: false;
          tc.d(b1);
          tc = this.c;
          b1 = (p0.optInt("rsw2", b) == 1)? true: false;
          tc.e(b1);
          this.c.a((float)p0.optDouble("sam", 0));
          this.c.b(p0.optInt("sdt", i));
          this.c.d(p0.optInt("udt", i));
          b tc1 = this.c;
          if (p0.optInt("infs", b) == 1) {
             b = true;
          }
          tc1.b(b);
          this.c.c(p0.optString("srs", ""));
       }
       return;
    }
    public final void g(JSONObject p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "5")) {
          return;
       }
       p0 = p0.optJSONObject("sig3");
       if (p0 != null) {
          b tc = this.c;
          b = true;
          if (p0.optInt("s3dgsw_4.5.2") != b) {
             b = false;
          }
          tc.f(b);
       }
       return;
    }
}
