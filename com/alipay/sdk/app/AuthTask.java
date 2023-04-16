package com.alipay.sdk.app.AuthTask;
import com.alipay.sdk.m.q.a;
import android.app.Activity;
import java.lang.Object;
import s6.b;
import android.content.Context;
import v6.a;
import java.lang.String;
import s6.a;
import m6.a;
import java.util.List;
import j6.a;
import com.alipay.sdk.m.q.b;
import b6.a;
import com.alipay.sdk.m.q.a$c;
import java.lang.CharSequence;
import android.text.TextUtils;
import j6.b;
import k6.a;
import java.util.Map;
import u6.i;
import r6.a;
import android.os.Bundle;
import android.content.Intent;
import com.alipay.sdk.app.H5AuthActivity;
import java.lang.Class;
import s6.a$a;
import q6.a;
import p6.b;
import p6.e;
import org.json.JSONObject;
import java.util.ArrayList;
import com.alipay.sdk.m.n.a;
import java.lang.Throwable;
import com.alipay.sdk.m.f.c;
import java.lang.StringBuilder;
import android.os.SystemClock;
import u6.c;

public class AuthTask	// class@000e8a
{
    public Activity a;
    public a b;
    public static final Object c;

    static {
       AuthTask.c = a.class;
    }
    public void AuthTask(Activity p0){
       super();
       this.a = p0;
       b.d().a(this.a);
       this.b = new a(p0, "È¥Ö§¸¶±¦ÊÚÈ¨");
    }
    public static void a(AuthTask p0){
       p0.c();
    }
    public final String a(Activity p0,String p1,a p2){
       p1 = p2.b(p1);
       List list = a.A().p();
       if (a.A().g == null || list == null) {
          list = a.d;
       }
       if (b.l(p2, this.a, list)) {
          a uoa = new a(p0, p2, new a(this));
          String str = uoa.d(p1, false);
          uoa.f();
          if (TextUtils.equals(str, "failed") || TextUtils.equals(str, "scheme_failed")) {
             a.b(p2, "biz", "LogBindCalledH5");
             return this.d(p0, p1, p2);
          }else if(TextUtils.isEmpty(str)){
             return b.a();
          }else {
             return str;
          }
       }else {
          a.b(p2, "biz", "LogCalledH5");
          return this.d(p0, p1, p2);
       }
    }
    public synchronized String auth(String p0,boolean p1){
       return this.innerAuth(new a(this.a, p0, "auth"), p0, p1);
    }
    public synchronized Map authV2(String p0,boolean p1){
       a uoa = new a(this.a, p0, "authV2");
       return i.c(uoa, this.innerAuth(uoa, p0, p1));
    }
    public final String b(a p0,a p1){
       String str;
       Bundle uBundle = new Bundle();
       uBundle.putString("url", p1.d()[0]);
       Intent intent = new Intent(this.a, H5AuthActivity.class);
       intent.putExtras(uBundle);
       a$a.c(p0, intent);
       this.a.startActivity(intent);
       p0 = AuthTask.c;
       try{
          _monitor_enter(p0);
          p0.wait();
          _monitor_exit(p0);
          str = b.e();
          if (TextUtils.isEmpty(str)) {
             str = b.a();
          }
          return str;
       }catch(java.lang.InterruptedException e0){
          _monitor_exit(str);
          return b.a();
       }
    }
    public final void c(){
       AuthTask tb = this.b;
       if (tb != null) {
          tb.b();
       }
       return;
    }
    public final String d(Activity p0,String p1,a p2){
       c uoc;
       this.e();
       try{
          int i = 0;
          List list = a.b(new a().h(p2, p0, p1).c().optJSONObject("form").optJSONObject("onload"));
          this.c();
          int i1 = 0;
          while (true) {
             List list1 = list;
             if (i1 < list1.size()) {
                if (list1.get(i1).a() == a.c) {
                   this.c();
                   return this.b(p2, list1.get(i1));
                }else {
                   i1++;
                }
             }else {
                this.c();
             }
          }
       }catch(java.io.IOException e5){
          a.f(p2, "net", e5);
          uoc = c.b(c.f.b());
          this.c();
       }
       if (uoc == null) {
          uoc = c.b(c.d.b());
       }
       return b.b(uoc.b(), uoc.a(), "");
    }
    public final void e(){
       AuthTask tb = this.b;
       if (tb != null) {
          tb.e();
       }
       return;
    }
    public synchronized String innerAuth(a p0,String p1,boolean p2){
       int i;
       if (p2) {
          this.e();
       }
       b.d().a(this.a);
       String str = b.a();
       a.a("");
       try{
          i = 0;
          str = this.a(this.a, p1, p0);
          a.c(p0, "biz", "PgReturn", SystemClock.elapsedRealtime());
          a.c(p0, "biz", "PgReturnV", i.a(str, "resultStatus")+"|"+i.a(str, "memo"));
          if (!a.A().v()) {
          }
       label_00c9 :
          this.c();
          a.g(this.a, p0, p1, p0.d);
          return str;
       }catch(java.lang.Exception e1){
          c.c(e1);
          a.c(p0, "biz", "PgReturn", SystemClock.elapsedRealtime());
          a.c(p0, "biz", "PgReturnV", i.a(str, "resultStatus")+"|"+i.a(str, "memo"));
          if (!a.A().v()) {
          }else {
             goto label_00c9 ;
          }
       }
       a.A().d(p0, this.a, i);
       goto label_00c9 ;
    }
}
