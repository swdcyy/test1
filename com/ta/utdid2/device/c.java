package com.ta.utdid2.device.c;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.String;
import java.io.File;
import android.content.Context;
import java.util.regex.Pattern;
import com.ta.utdid2.b.a.c;
import com.ta.utdid2.device.d;
import com.ta.utdid2.a.a.g;
import java.lang.Integer;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import com.ta.utdid2.a.a.f;
import java.security.Key;
import com.ta.utdid2.a.a.b;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import java.io.ByteArrayOutputStream;
import java.lang.System;
import java.util.Random;
import com.ta.utdid2.a.a.d;
import com.ta.utdid2.a.a.e;
import android.os.Binder;
import android.text.TextUtils;
import java.lang.Exception;
import android.content.ContentResolver;
import android.provider.Settings$System;
import com.ta.utdid2.device.e;

public class c	// class@000cd4
{
    public c a;
    public d a;
    public c b;
    public Pattern b;
    public String h;
    public String i;
    public String j;
    public Context mContext;
    public static c a;
    public static final Object e;
    public static final String k;

    static {
       c.e = new Object();
       c.k = ".UTSystemConfig"+File.separator+"Global";
    }
    public void c(Context p0){
       super();
       this.mContext = null;
       this.h = null;
       this.a = null;
       this.i = "xx_utdid_key";
       this.j = "xx_utdid_domain";
       this.a = null;
       this.b = null;
       this.b = Pattern.compile("[^0-9a-zA-Z=/+]+");
       this.mContext = p0;
       c uoc = new c(p0, c.k, "Alvin2", false, true);
       this.b = v0;
       c uoc1 = new c(p0, ".DataStorage", "ContextData", false, true);
       this.a = v0;
       this.a = new d();
       Object[] objArray = new Object[]{Integer.valueOf(g.a(this.i))};
       this.i = String.format("K_%d", objArray);
       Object[] objArray1 = new Object[]{Integer.valueOf(g.a(this.j))};
       this.j = String.format("D_%d", objArray1);
    }
    public static c a(Context p0){
       if (p0 != null && c.a == null) {
          Object e = c.e;
          _monitor_enter(e);
          if (c.a == null) {
             c uoc = new c(p0);
             c.a = uoc;
             uoc.c();
          }
          _monitor_exit(e);
       }
       return c.a;
    }
    public static String b(byte[] p0){
       Mac instance = Mac.getInstance("HmacSHA1");
       instance.init(new SecretKeySpec(f.a(new byte[44]{'E','r','t',0xdf,'}',0xca,0xe1,'V',0xf5,0x0b,0xb2,0xa0,0xef,0x9d,'@',0x17,0xa1,0x82,0xae,0xc0,'q','t',0xf0,0x99,'1',0xe2,0x09,0xd9,'!',0xb0,0xbc,0xb2,0x8b,'5',0x1e,0x86,'@',0x98,'J',0xcf,'j','U',0xda,0xa3}), instance.getAlgorithm()));
       return b.encodeToString(instance.doFinal(p0), 2);
    }
    public final boolean b(String p0){
       if (p0 != null) {
          if (p0.endsWith("\n")) {
             p0 = p0.substring(0, (p0.length() - 1));
          }
          if (24 == p0.length() && !this.b.matcher(p0).find()) {
             return 1;
          }
       }
    label_002a :
       return 0;
    }
    public final void c(){
       c tb = this.b;
       if (tb != null) {
          if (g.a(tb.getString("UTDID2"))) {
             String str = this.b.getString("UTDID");
             if (!g.a(str)) {
                this.f(str);
             }
          }
          tb = null;
          String str1 = "DID";
          c uoc = 1;
          if (!g.a(this.b.getString(str1))) {
             this.b.remove(str1);
             tb = 1;
          }
          str1 = "EI";
          if (!g.a(this.b.getString(str1))) {
             this.b.remove(str1);
             tb = 1;
          }
          if (!g.a(this.b.getString("SI"))) {
             this.b.remove("SI");
          }else {
             uoc = tb;
          }
          if (uoc != null) {
             this.b.commit();
          }
       }
       return;
    }
    public final byte[] c(){
       String str;
       ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
       uByteArrayOu.write(d.getBytes((int)(System.currentTimeMillis() / 1000)), 0, 4);
       uByteArrayOu.write(d.getBytes(new Random().nextInt()), 0, 4);
       uByteArrayOu.write(3);
       try{
          uByteArrayOu.write(0);
          str = e.a(this.mContext);
       }catch(java.lang.Exception e0){
          str = new Random().nextInt();
       }
       e0.write(d.getBytes(g.a(str)), 0, 4);
       e0.write(d.getBytes(g.a(c.b(e0.toByteArray()))));
       return e0.toByteArray();
    }
    public final void f(String p0){
       if (this.b(p0)) {
          if (p0.endsWith("\n")) {
             p0 = p0.substring(0, (p0.length() - 1));
          }
          if (p0.length() == 24) {
             c tb = this.b;
             if (tb != null) {
                tb.putString("UTDID2", p0);
                this.b.commit();
             }
          }
       }
    label_002f :
       return;
    }
    public final boolean f(){
       boolean b = (!this.mContext.checkPermission("android.permission.WRITE_SETTINGS", Binder.getCallingPid(), Binder.getCallingUid()))? true: false;
       return b;
    }
    public final String g(){
       c tb = this.b;
       if (tb != null) {
          String str = tb.getString("UTDID2");
          if (!g.a(str) && this.a.c(str) != null) {
             return str;
          }
       }
       return null;
    }
    public final void g(String p0){
       if (p0 != null) {
          c ta = this.a;
          if (ta != null && !p0.equals(ta.getString(this.i))) {
             this.a.putString(this.i, p0);
             this.a.commit();
          }
       }
       return;
    }
    public synchronized String getValue(){
       c th = this.h;
       if (th != null) {
          return th;
       }
       return this.h();
    }
    public synchronized String h(){
       String str = this.i();
       this.h = str;
       if (!TextUtils.isEmpty(str)) {
          return this.h;
       }
       try{
          byte[] uobyteArray = this.c();
          if (uobyteArray != null) {
             String str1 = b.encodeToString(uobyteArray, 2);
             this.h = str1;
             this.f(str1);
             str = this.a.c(uobyteArray);
             if (str != null) {
                this.j(str);
                this.g(str);
             }
             return this.h;
          }
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       return null;
    }
    public final void h(String p0){
       try{
          if (this.f() && this.b(p0)) {
             if (p0.endsWith("\n")) {
                p0 = p0.substring(0, (p0.length() - 1));
             }
             if (24 == p0.length()) {
                String str = null;
                try{
                   str = Settings$System.getString(this.mContext.getContentResolver(), "mqBRboGZkQPcAkyk");
                }catch(java.lang.Exception e0){
                }
                if (!this.b(str)) {
                   Settings$System.putString(this.mContext.getContentResolver(), e0, p0);
                }
             }
          }
       label_0045 :
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public synchronized String i(){
       int i1;
       String str1;
       String str = "";
       try{
          str = Settings$System.getString(this.mContext.getContentResolver(), "mqBRboGZkQPcAkyk");
          if (this.b(e0)) {
             return e0;
          }
          e uoe = new e();
          int i = 0;
          try{
             i1 = 0;
             str1 = Settings$System.getString(this.mContext.getContentResolver(), "dxCRMxhQkdGePGnp");
          }catch(java.lang.Exception e0){
             str1 = i1;
          }
          if (!g.a(str1)) {
             String str2 = e0.e(str1);
             if (this.b(str2)) {
                this.h(str2);
                return str2;
             }else {
                try{
                   str2 = e0.d(str1);
                   if (this.b(str2)) {
                      str2 = this.a.c(str2);
                      if (!g.a(str2)) {
                         this.j(str2);
                         str1 = Settings$System.getString(this.mContext.getContentResolver(), "dxCRMxhQkdGePGnp");
                      }
                   }
                   str2 = this.a.d(str1);
                   if (this.b(str2)) {
                      this.h = str2;
                      this.f(str2);
                      this.g(str1);
                      this.h(this.h);
                      return this.h;
                   }
                }catch(java.lang.Exception e0){
                }
             }
          }else {
             i = 1;
          }
       }catch(java.lang.Exception e0){
       }
    }
    public final void i(String p0){
       String str1;
       String str = "dxCRMxhQkdGePGnp";
       try{
          str1 = Settings$System.getString(this.mContext.getContentResolver(), str);
       }catch(java.lang.Exception e0){
          str1 = null;
       }
       try{
          if (!p0.equals(str1)) {
             Settings$System.putString(this.mContext.getContentResolver(), e0, p0);
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public final void j(String p0){
       if (this.f() && p0 != null) {
          this.i(p0);
       }
       return;
    }
}
