package com.tencent.open.b.b;
import java.lang.Object;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.concurrent.Executor;
import com.tencent.open.utils.j;
import com.tencent.open.b.c;
import com.tencent.open.b.b$1;
import java.lang.Runnable;
import java.lang.String;
import com.tencent.open.log.SLog;
import android.content.Context;
import com.tencent.open.utils.i;
import com.tencent.open.utils.f;
import com.tencent.open.utils.k;
import java.util.Map;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import java.lang.System;
import java.util.HashMap;
import android.os.Build$VERSION;
import android.os.Build;
import com.tencent.open.a.a;
import com.tencent.open.a.b;
import java.lang.Throwable;
import com.tencent.open.b.g;
import java.util.Collection;
import java.util.Iterator;
import java.io.Serializable;

public class b	// class@000f45
{
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public List i;
    public List j;
    public Executor k;
    public boolean l;
    public static b a;

    public void b(){
       super();
       this.b = "";
       this.c = "";
       this.d = "";
       this.e = "";
       this.f = "";
       this.g = "";
       this.h = "";
       this.i = Collections.synchronizedList(new ArrayList());
       this.j = Collections.synchronizedList(new ArrayList());
       this.k = j.b();
    }
    public static synchronized b a(){
       _monitor_enter(b.class);
       if (b.a == null) {
          b.a = new b();
       }
       _monitor_exit(b.class);
       return b.a;
    }
    public static List a(b p0){
       return p0.i;
    }
    public static void b(b p0){
       p0.c();
    }
    public final void a(c p0){
       this.k.execute(new b$1(this, p0));
    }
    public void a(String p0){
       SLog.i("AttaReporter", "updateOpenId");
       if (p0 == null) {
          p0 = "";
       }
       this.d = p0;
       return;
    }
    public void a(String p0,Context p1){
       SLog.i("AttaReporter", "init");
       this.b = p0;
       this.c = i.a(p1);
       this.e = k.d(p1, f.b());
       this.f = f.b();
       p0 = (i.b(p1))? "1": "0";
       this.g = p0;
       this.h = k.c(p1, "com.tencent.mobileqq");
       this.b();
       return;
    }
    public void a(String p0,Object p1){
       this.a(p0, "", p1, null);
    }
    public void a(String p0,String p1){
       this.a(p0, p1, null);
    }
    public void a(String p0,String p1,Object p2,Map p3){
       c uoc = this.b(p0, p1, p2, p3);
       if (!TextUtils.isEmpty(this.b) && (TextUtils.isEmpty(this.c) || f.a() == null)) {
          SLog.i("AttaReporter", "attaReport cancel appid="+this.b+", mAppName="+this.c+", context="+f.a()+", "+uoc);
          this.j.add(uoc);
          return;
       }else {
          this.a(uoc);
          return;
       }
    }
    public void a(String p0,String p1,Map p2){
       this.a(p0, p1, "", p2);
    }
    public final c b(String p0,String p1,Object p2,Map p3){
       long l = System.currentTimeMillis();
       HashMap hashMap = new HashMap();
       hashMap.put("attaid", "09400051119");
       hashMap.put("token", "9389887874");
       hashMap.put("time_appid_openid", l+"_"+this.b+"_"+this.d);
       hashMap.put("time", String.valueOf(l));
       hashMap.put("openid", this.d);
       hashMap.put("appid", this.b);
       hashMap.put("app_name", this.c);
       hashMap.put("app_ver", this.e);
       hashMap.put("pkg_name", this.f);
       hashMap.put("os", "AND");
       hashMap.put("os_ver", Build$VERSION.RELEASE);
       hashMap.put("sdk_ver", "3.5.4.lite");
       hashMap.put("model_name", Build.MODEL);
       hashMap.put("interface_name", p0);
       hashMap.put("interface_data", p1);
       p0 = "";
       p1 = (p2 == null)? p0: p2.toString();
       hashMap.put("interface_result", p1);
       hashMap.put("qq_install", this.g);
       hashMap.put("qq_ver", this.h);
       if (p3 != null && !p3.isEmpty()) {
          p1 = "reserve1";
          p2 = p3.get(p1);
          p2 = (p2 == null)? p0: p2.toString();
          hashMap.put(p1, p2);
          p1 = "reserve2";
          p2 = p3.get(p1);
          p2 = (p2 == null)? p0: p2.toString();
          hashMap.put(p1, p2);
          p1 = "reserve3";
          p2 = p3.get(p1);
          p2 = (p2 == null)? p0: p2.toString();
          hashMap.put(p1, p2);
          p2 = p3.get("reserve4");
          if (p2 != null) {
             p0 = p2.toString();
          }
          hashMap.put("reserve4", p0);
       }
       return new c(hashMap);
    }
    public final void b(){
       while (!this.j.isEmpty()) {
          c uoc = this.j.remove(0);
          uoc.a.put("appid", this.b);
          uoc.a.put("app_name", this.c);
          uoc.a.put("app_ver", this.e);
          uoc.a.put("pkg_name", this.f);
          uoc.a.put("qq_install", this.g);
          uoc.a.put("qq_ver", this.h);
          uoc.a.put("openid", this.d);
          uoc.a.put("time_appid_openid", uoc.a.get("time")+"_"+this.b+"_"+this.d);
          SLog.i("AttaReporter", "fixDirtyData--------------------------"+uoc);
          this.i.add(uoc);
       }
       return;
    }
    public final boolean b(c p0){
       String str = "AttaReporter";
       boolean b = false;
       int i = 0;
    label_0004 :
       i = i + 1;
       try{
          SLog.i(str, "doAttaReportItem post "+p0);
          if (a.a().b("https://h.trace.qq.com/kv", p0.a).d() == 200) {
             b = true;
          }
          return b;
       }catch(java.lang.Exception e3){
          SLog.i(200, "Exception", e3);
          if (i >= 2) {
             return b;
          }else {
             goto label_0004 ;
          }
       }
    }
    public final void c(){
       String str = "AttaReporter";
       SLog.i(str, "attaReportAtSubThread");
       if (this.l == null) {
          List list = g.a().a("report_atta");
          this.l = list.isEmpty();
          this.i.addAll(list);
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             SLog.i(str, "attaReportAtSubThread from db = "+iterator.next());
          }
       }
       ArrayList uArrayList = new ArrayList();
       int i = 0;
       while (!this.i.isEmpty()) {
          c uoc = this.i.remove(i);
          if (!this.b(uoc)) {
             uArrayList.add(uoc);
          }
       }
       if (!uArrayList.isEmpty()) {
          SLog.i(str, "attaReportAtSubThread fail size="+uArrayList.size());
          Iterator iterator1 = uArrayList.iterator();
          while (iterator1.hasNext()) {
             SLog.i(str, "attaReportAtSubThread fail cache to db, "+iterator1.next());
          }
          g.a().a("report_atta", uArrayList);
          this.l = i;
       }else if(this.l == null){
          SLog.i(str, "attaReportAtSubThread clear db");
          g.a().b("report_atta");
          this.l = true;
       }
       return;
    }
}
