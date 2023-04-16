package com.vivo.push.sdk.a;
import com.vivo.push.q;
import java.lang.Integer;
import java.lang.Object;
import java.util.List;
import java.util.Arrays;
import android.content.Context;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ActivityInfo;
import java.lang.StringBuilder;
import java.lang.Exception;
import com.vivo.push.util.p;
import android.os.Message;
import com.vivo.push.b.x;
import java.util.HashMap;
import android.os.Bundle;
import com.vivo.push.util.z;
import com.vivo.push.e;
import com.vivo.push.o;
import java.lang.Class;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import com.vivo.push.util.ContextDelegate;
import java.lang.Throwable;
import com.vivo.push.util.a;
import com.vivo.push.c.d;
import com.vivo.push.c.b;
import java.security.PublicKey;
import com.vivo.push.util.u;
import android.util.Base64;
import com.vivo.push.util.t;

public final class a extends q	// class@001099
{
    public String d;
    public String f;
    public static a c;
    public static final List e;

    static {
       Integer[] integerArray = new Integer[]{Integer.valueOf(3)};
       a.e = Arrays.asList(integerArray);
    }
    public void a(){
       super();
       this.f = "";
    }
    public static synchronized a a(){
       _monitor_enter(a.class);
       if (a.c == null) {
          a.c = new a();
       }
       _monitor_exit(a.class);
       return a.c;
    }
    public static String a(Context p0,String p1,String p2){
       String str = null;
       if (!TextUtils.isEmpty(p1) && !TextUtils.isEmpty(p2)) {
          Intent intent = new Intent(p2);
          try{
             intent.setPackage(p1);
             PackageManager packageManag = p0.getPackageManager();
             if (packageManag == null) {
                return str;
             }else {
                List list = packageManag.queryBroadcastReceivers(intent, 64);
                if (list != null && list.size() > 0) {
                   str = list.get(0).activityInfo.name;
                }
             }
          }catch(java.lang.Exception e2){
             p.a("CommandWorker", "error  "+e2.getMessage());
          }
       }
    }
    public final void a(Intent p0){
       if (p0 == null || this.a == null) {
          p.d("CommandWorker", " sendMessage error: intent : "+p0+", mContext: "+this.a);
          return;
       }else {
          Message message = Message.obtain();
          message.obj = p0;
          this.a(message);
          return;
       }
    }
    public final void a(String p0){
       this.f = p0;
    }
    public final void b(){
       this.d = null;
    }
    public final void b(Message p0){
       p0 = p0.obj;
       String str = "CommandWorker";
       if (p0 != null) {
          q ta = this.a;
          if (ta != null) {
             String packageName = ta.getPackageName();
             int i = this.d(p0);
             if (i > 0) {
                x ox = new x((long)i);
                HashMap hashMap = new HashMap();
                Bundle extras = p0.getExtras();
                long l = 0x59b4be66e275800;
                if (extras != null) {
                   l = extras.getLong("notify_id", l);
                }
                hashMap.put("messageID", String.valueOf(l));
                String str1 = z.b(this.a, packageName);
                if (!TextUtils.isEmpty(str1)) {
                   hashMap.put("remoteAppId", str1);
                }
                ox.a(hashMap);
                e.a().a(ox);
                return;
             }else {
                try{
                   Class uClass = Class.forName(this.d);
                   Class[] uClassArray = new Class[0];
                   Object[] objArray = new Object[0];
                   Class[] uClassArray1 = new Class[]{Context.class,Intent.class};
                   p0.setClassName(packageName, this.d);
                   Object[] objArray1 = new Object[]{ContextDelegate.getContext(this.a).getApplicationContext(),p0};
                   uClass.getMethod("onReceive", uClassArray1).invoke(uClass.getConstructor(uClassArray).newInstance(objArray), objArray1);
                   return;
                }catch(java.lang.Exception e10){
                   p.b(str, "reflect e: ", e10);
                   return;
                }
             }
          }
       }
       p.d(str, " handleMessage error: intent : "+p0+", mContext: "+this.a);
       return;
    }
    public final boolean b(Intent p0){
       String stringExtra = p0.getStringExtra("security_avoid_pull");
       if (!TextUtils.isEmpty(stringExtra)) {
          boolean b = false;
          try{
             stringExtra = a.a(this.a).b(stringExtra);
             if (!("com.vivo.pushservice").equals(stringExtra)) {
                p.a("CommandWorker", ("!decrypt.equals, so decrypt == ").concat(String.valueOf(stringExtra)));
                return b;
             }
          }catch(java.lang.Exception e5){
             p.a("CommandWorker", "checkIntentIsSecurity Exception: "+e5.getMessage());
             return b;
          }
       }else {
          p.a("CommandWorker", "checkIntentIsSecurityTextUtils.isEmpty");
       }
       return true;
    }
    public final boolean c(Intent p0){
       String str = "com.vivo.pushservice";
       String str1 = z.c(this.a, str);
       p.d("CommandWorker", (" 配置的验签参数 = ").concat(String.valueOf(str1)));
       if (!TextUtils.equals(str1, "1")) {
          return true;
       }
       str1 = p0.getStringExtra("security_avoid_pull_rsa");
       String stringExtra = p0.getStringExtra("security_avoid_rsa_public_key");
       if (TextUtils.isEmpty(str1) || TextUtils.isEmpty(stringExtra)) {
          p.a("CommandWorker", "!decrypt.equals, so securityContent == "+str1+" or publickKey isempty ");
          return false;
       }else if(d.a(this.a).a().a(str.getBytes("UTF-8"), u.a(stringExtra), Base64.decode(str1, 2))){
          p.d("CommandWorker", " RSA验签通过  ");
          return true;
       }
    }
    public final int d(Intent p0){
       int i = 2151;
       if (!TextUtils.isEmpty(this.f) && (this.f).contains("CommandService")) {
          q oq = (p0 != null && (this.b(p0) && this.c(p0)))? 1: null;
          if (!oq) {
             p.a("CommandWorker", " !checkIntentIsSecurity\(intent\)");
             return i;
          }
       }
    label_0030 :
       String packageName = this.a.getPackageName();
       try{
          String stringExtra = p0.getStringExtra("command_type");
          if (TextUtils.isEmpty(stringExtra) || !stringExtra.equals("reflect_receiver")) {
             p.a("CommandWorker", ("commandTypeStr is not satisfy == ").concat(String.valueOf(stringExtra)));
             return i;
          }else {
             int i1 = -1;
             i = p0.getIntExtra("command", i1);
             if (i < 0) {
                i = p0.getIntExtra("method", i1);
             }
             if (a.e.contains(Integer.valueOf(i)) && (t.c(this.a, packageName) && !t.c(this.a))) {
                p.a("CommandWorker", "METHOD_ON_MESSAGE is not support");
                return 2153;
             }else {
                String action = p0.getAction();
                if (TextUtils.isEmpty(this.d)) {
                   stringExtra = a.a(this.a, packageName, action);
                   this.d = stringExtra;
                   if (TextUtils.isEmpty(stringExtra)) {
                      p.d("CommandWorker", " reflectReceiver error: receiver for: "+action+" not found, package: "+packageName);
                      p0.setPackage(packageName);
                      this.a.sendBroadcast(p0);
                      return 2152;
                   }
                }
             }
          }
       }catch(java.lang.Exception e7){
          p.a("CommandWorker", e7);
       }
       return 0;
    }
}
