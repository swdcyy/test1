package com.xiaomi.mipush.sdk.b$a;
import java.lang.Object;
import com.xiaomi.mipush.sdk.b$a$a;
import java.util.ArrayList;
import android.content.Context;
import java.lang.String;
import rs8.c;
import java.lang.Boolean;
import com.xiaomi.push.hl;
import vs8.x;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;
import ys8.g0;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import ys8.u;
import java.lang.System;
import java.util.Collection;
import java.util.Iterator;
import vs8.f0;

public class b$a	// class@0010eb
{
    public Context a;
    public String b;
    public Boolean c;
    public b$a$a d;
    public final ArrayList e;
    public static b$a f;

    public void b$a(){
       super();
       this.d = new b$a$a(this);
       this.e = new ArrayList();
    }
    public static Context a(b$a p0){
       return p0.a;
    }
    public static b$a b(){
       if (b$a.f == null) {
          b$a uoa = b$a.class;
          _monitor_enter(uoa);
          if (b$a.f == null) {
             b$a.f = new b$a();
          }
          _monitor_exit(uoa);
       }
       return b$a.f;
    }
    public void c(Context p0){
       if (p0 == null) {
          c.l("context is null, MiTinyDataClientImp.init\(\) failed.");
          return;
       }else {
          this.a = p0;
          this.c = Boolean.valueOf(this.f(p0));
          this.h("com.xiaomi.xmpushsdk.tinydataPending.init");
          return;
       }
    }
    public final void d(hl p0){
       b$a te = this.e;
       _monitor_enter(te);
       if (!this.e.contains(p0)) {
          this.e.add(p0);
          if (this.e.size() > 100) {
             this.e.remove(0);
          }
       }
       _monitor_exit(te);
       return;
    }
    public boolean e(){
       boolean b = (this.a != null)? true: false;
       return b;
    }
    public final boolean f(Context p0){
       if (!x.l(p0).J()) {
          return true;
       }
       PackageManager packageManag = p0.getPackageManager();
       try{
          int i = 0;
          PackageInfo packageInfo = packageManag.getPackageInfo("com.xiaomi.xmsf", 4);
          if (packageInfo == null) {
             return i;
          }
          if (packageInfo.versionCode < 108) {
             return i;
          }
          return true;
       }catch(java.lang.Exception e0){
          return e0;
       }
    }
    public synchronized boolean g(hl p0){
       String str1;
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       boolean b1 = true;
       if (g0.e(p0, b1)) {
          return b;
       }
       String str = (TextUtils.isEmpty(p0.a()) && TextUtils.isEmpty(this.b))? 1: null;
       int i = (!this.e())? 1: 0;
       b$a ta = this.a;
       if (ta == null || this.i(ta)) {
          b = true;
       }
       if (!i && (str || b)) {
          if (str) {
             str1 = "MiTinyDataClient Pending "+p0.b()+" reason is "+"com.xiaomi.xmpushsdk.tinydataPending.channel";
          }else if(i){
             str1 = "MiTinyDataClient Pending "+p0.b()+" reason is "+"com.xiaomi.xmpushsdk.tinydataPending.init";
          }else if(b){
             str1 = "MiTinyDataClient Pending "+p0.b()+" reason is "+"com.xiaomi.xmpushsdk.tinydataPending.appId";
          }else {
          label_010a :
             this.d(p0);
             return b1;
          }
          c.t(str1);
          goto label_010a ;
       }else {
          c.t("MiTinyDataClient Send item immediately."+p0.d());
          if (TextUtils.isEmpty(p0.d())) {
             p0.f(u.a());
          }
          if (TextUtils.isEmpty(p0.a())) {
             p0.a(this.b);
          }
          if (TextUtils.isEmpty(p0.c())) {
             p0.e(this.a.getPackageName());
          }
          if (p0.a() <= 0) {
             p0.b(System.currentTimeMillis());
          }
          return this.j(p0);
       }
    }
    public void h(String p0){
       c.t("MiTinyDataClient.processPendingList\("+p0+"\)");
       ArrayList uArrayList = new ArrayList();
       b$a te = this.e;
       _monitor_enter(te);
       uArrayList.addAll(this.e);
       this.e.clear();
       _monitor_exit(te);
       Iterator iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          this.g(iterator.next());
       }
       return;
    }
    public final boolean i(Context p0){
       boolean b = (f0.d(p0).c() == null && !this.f(this.a))? true: false;
       return b;
    }
    public final boolean j(hl p0){
       boolean b = false;
       if (g0.e(p0, b)) {
          return b;
       }
       if (this.c.booleanValue()) {
          c.t("MiTinyDataClient Send item by PushServiceClient.sendTinyData\(ClientUploadDataItem\)."+p0.d());
          x.l(this.a).s(p0);
       }else {
          this.d.e(p0);
       }
       return true;
    }
}
