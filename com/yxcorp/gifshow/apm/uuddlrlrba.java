package com.yxcorp.gifshow.apm.uuddlrlrba;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import wkd.b;
import com.yxcorp.gifshow.OnlineSystraceManager;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Number;
import com.yxcorp.utility.SystemUtil;
import o56.a;
import kotlin.jvm.internal.a;
import java.util.Objects;
import android.os.Bundle;
import java.util.Set;
import java.util.Iterator;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import ekd.e0;
import android.content.Context;

public final class uuddlrlrba extends Service	// class@001b9f
{
    public final String b;

    public void uuddlrlrba(){
       super();
       this.b = "AJJJJOSS";
    }
    public IBinder onBind(Intent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, uuddlrlrba.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       "onBind intent:"+p0;
       return null;
    }
    public void onCreate(){
       if (PatchProxy.applyVoid(null, this, uuddlrlrba.class, "4")) {
          return;
       }
       super.onCreate();
       b.a(-2022051331).init();
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, uuddlrlrba.class, "5")) {
          return;
       }
       super.onDestroy();
       return;
    }
    public int onStartCommand(Intent p0,int p1,int p2){
       String obj;
       String this;
       Bundle extras;
       boolean this1;
       if (PatchProxy.isSupport(uuddlrlrba.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, uuddlrlrba.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       int i = 1;
       String str = "test";
       String str1 = "null cannot be cast to non-null type java.lang.String";
       this = "AppEnv.CHANNEL";
       if (SystemUtil.R()) {
          obj = a.k;
          a.o(obj, this);
          Objects.requireNonNull(obj, str1);
          obj = obj.toLowerCase();
          a.o(obj, "\(this as java.lang.String\).toLowerCase\(\)");
          if (a.g(obj, str) ^ i) {
             return super.onStartCommand(p0, p1, p2);
          }
       }
       if (SystemUtil.J()) {
          int q = a.q;
          if (q != 0x1869f && q != 0x1046a) {
             obj = a.k;
             a.o(obj, this);
             Objects.requireNonNull(obj, str1);
             obj = obj.toLowerCase();
             a.o(obj, "\(this as java.lang.String\).toLowerCase\(\)");
             if (!a.g(obj, str)) {
                return super.onStartCommand(p0, p1, p2);
             }
          }
       }
       obj = "onStartCommand intent:"+p0+" flags:"+p1+" startId:"+p2+" extras:";
       str = null;
       extras = (p0 != null)? p0.getExtras(): str;
       obj = obj+String.valueOf(extras);
       a.m(p0);
       Bundle extras1 = p0.getExtras();
       if (extras1 != null) {
          Iterator iterator = extras1.keySet().iterator();
          while (iterator.hasNext()) {
             this = iterator.next();
             StringBuilder str2 = "extra key:\""+this+"\" value:\"";
             this = (extras1.get(this) != null)? extras1.get(this): "NULL";
             str2 = str2+this+"\"";
          }
          this = extras1.getString("action");
          if (this != null) {
             this = StringsKt__StringsKt.o5(this).toString();
             if (this != null) {
                this = this.toLowerCase();
                a.o(this, "\(this as java.lang.String\).toLowerCase\(\)");
             label_010d :
                if (a.g(this, "begin")) {
                   this = null;
                   String str3 = extras1.getString("useFastUnind");
                   String str4 = "it";
                   if (str3 != null) {
                      a.o(str3, str4);
                      str3 = str3.toLowerCase();
                      a.o(str3, "\(this as java.lang.String\).toLowerCase\(\)");
                      i = i ^ a.g(str3, "false");
                   }
                   str3 = extras1.getString("onlymain");
                   if (str3 != null) {
                      a.o(str3, str4);
                      this = str3.toLowerCase();
                      a.o(this, "\(this as java.lang.String\).toLowerCase\(\)");
                      this1 = a.g(this, "true");
                   }
                   b.a(-2022051331).k(e0.b, Boolean.valueOf(i), Boolean.valueOf(this1));
                }
                obj = extras1.getString("action");
                if (obj != null) {
                   obj = StringsKt__StringsKt.o5(obj).toString();
                   if (obj != null) {
                      str = obj.toLowerCase();
                      a.o(str, "\(this as java.lang.String\).toLowerCase\(\)");
                   }
                }
                if (a.g(str, "end")) {
                   b.a(-2022051331).m();
                }
             }
          }
          this = str;
          goto label_010d ;
       }
       return super.onStartCommand(p0, p1, p2);
    }
    public boolean onUnbind(Intent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, uuddlrlrba.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       "onUnbind intent:"+p0;
       return super.onUnbind(p0);
    }
}
