package com.kuaishou.weapon.ks.cc;
import android.content.Context;
import java.lang.Object;
import com.kuaishou.weapon.ks.d;
import java.lang.String;
import com.kuaishou.weapon.ks.l;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.os.Handler;
import android.os.Looper;
import com.kuaishou.weapon.ks.g;
import java.lang.System;
import java.nio.ByteBuffer;
import com.kuaishou.weapon.ks.cc$1;
import java.lang.Runnable;
import java.util.UUID;
import com.kuaishou.weapon.ks.bs;
import com.kuaishou.weapon.ks.bh;
import java.lang.StringBuilder;
import com.kuaishou.weapon.ks.j;
import java.lang.Integer;
import java.lang.Math;
import java.util.zip.CRC32;
import com.kuaishou.weapon.ks.f;

public class cc	// class@001208
{
    public boolean b;
    public Context c;
    public d d;
    public l e;
    public String f;
    public int g;
    public String h;
    public int i;
    public int j;
    public int k;
    public Handler l;
    public static cc a;

    public void cc(Context p0){
       super();
       this.b = false;
       this.h = "";
       this.i = -1;
       this.j = -1;
       this.k = -2;
       this.c = p0;
       this.d = d.a(p0);
       this.e = l.a(p0, "re_po_rt");
    }
    public static int a(cc p0,int p1){
       p0.k = p1;
       return p1;
    }
    public static cc a(){
       return cc.a;
    }
    public static synchronized cc a(Context p0){
       _monitor_enter(cc.class);
       try{
          if (cc.a == null) {
             cc.a = new cc(p0);
          }
          _monitor_exit(cc.class);
          return cc.a;
       }catch(java.lang.Exception e0){
          _monitor_exit(e0);
          return null;
       }
    }
    public static d a(cc p0){
       return p0.d;
    }
    public static int b(cc p0){
       cc g = p0.g;
       p0.g = g + 1;
       return g;
    }
    public static void c(cc p0){
       p0.e();
    }
    public static String d(cc p0){
       return p0.f;
    }
    public static int e(cc p0){
       return p0.g;
    }
    public static l f(cc p0){
       return p0.e;
    }
    public void a(String p0){
       if (!TextUtils.isEmpty(p0) && !p0.equals(this.f)) {
       label_000f :
          this.g = 0;
          this.f = p0;
       }else if(TextUtils.isEmpty(p0)){
          p0 = this.d.a("w_t", "");
          if (!TextUtils.isEmpty(p0) && !p0.equals(this.f)) {
             goto label_000f ;
          }
       }
       return;
    }
    public synchronized void b(){
       try{
          if (this.b != null) {
             return;
          }else {
             boolean b = true;
             this.b = b;
             String str = -1;
             if (this.i == str) {
                this.i = this.d.b("plc001_pd_pg_ps", b);
             }
             if (this.j == str) {
                this.j = this.d.b("plc001_pd_pk_pc", b);
             }
             if (this.k == -2) {
                this.k = this.e.b("l_t_i_s", b);
             }
             if (this.i == null) {
                return;
             }else {
                this.f = this.d.a("w_t", "");
                int i = 0;
                this.g = this.d.a("w_t_r", i);
                if (this.l == null) {
                   this.l = new Handler(Looper.getMainLooper());
                }
                if (TextUtils.isEmpty(this.f)) {
                   this.g = i;
                   this.d();
                   this.d.a("w_t", this.f, i);
                   this.d.a("w_t_r", this.g, b);
                }else {
                   this.g = this.g + b;
                   this.d.a("w_t_r", this.g, b);
                   byte[] uobyteArray = g.a(this.f, 2);
                   byte[] uobyteArray1 = new byte[(uobyteArray.length + 4)];
                   System.arraycopy(uobyteArray, i, uobyteArray1, i, uobyteArray.length);
                   byte[] uobyteArray2 = ByteBuffer.allocate(4).putInt(this.g).array();
                   System.arraycopy(uobyteArray2, i, uobyteArray1, uobyteArray.length, uobyteArray2.length);
                   this.h = g.b(uobyteArray1, 2);
                }
             }
          }
       }catch(java.lang.Exception e0){
          this.f = "k7uScHh359Yzm5EBZWL1FnUqbNQIQgoi62qnRh115RoBSMNbVVwfqDuJ62OPICG8";
          this.h = "k7uScHh359Yzm5EBZWL1FnUqbNQIQgoi62qnRh115RoBSMNbVVwfqDuJ62OPICG8AAAAAA==";
       }
       return;
    }
    public String c(){
       int i = 0;
       if (this.k == -2) {
          this.k = this.e.b("l_t_i_s", i);
       }
       cc tk = this.k;
       String str = null;
       String str1 = -1;
       if (tk == str1) {
          if (this.j == str1) {
             this.j = this.d.b("plc001_pd_pk_pc", i);
          }
          if (this.j == null) {
             return str;
          }
       }else if(tk == null){
          return str;
       }
       if (this.i == str1) {
          this.i = this.d.b("plc001_pd_pg_ps", i);
       }
       if (this.i == null) {
          return "null";
       }else if(!TextUtils.isEmpty(this.f)){
          tk = this.l;
          if (tk != null) {
             tk.removeCallbacksAndMessages(str);
             this.l.postDelayed(new cc$1(this), 5000);
          label_0060 :
             return this.h;
          }
       }
       this.b();
       goto label_0060 ;
    }
    public final void d(){
       String str = " ";
       String str1 = "w_t_u";
       String str2 = this.d.c(str1);
       if (TextUtils.isEmpty(str2)) {
          str2 = UUID.randomUUID().toString();
       }
       this.d.a(str1, str2, false);
       int b = this.d.f("a1_p_s_p_s_c_b");
       String str3 = "";
       String str4 = "ANDROID_";
       int i = 3;
       if (!this.d.f("a1_p_s_p_s") && !b) {
          str1 = bs.e(this.c);
       }else {
          str1 = bh.g(this.c);
          if (!TextUtils.isEmpty(str1) && !str1.contains("RISK_")) {
             b = 1;
          label_0063 :
             this.d.a("w_t_d", str1, false);
             this.d.a("w_t_d_n", b, true);
             byte[] uobyteArray = j.d((str2+str+bs.a()+str+str1).getBytes());
             byte[] uobyteArray1 = ByteBuffer.allocate(2).putShort(false).array();
             byte[] uobyteArray2 = ByteBuffer.allocate(4).putInt(false).array();
             str3 = String.valueOf(System.currentTimeMillis());
             byte[] uobyteArray3 = ByteBuffer.allocate(4).putInt(Integer.parseInt(str3.substring(false, (str3.length() - i)))).array();
             byte[] uobyteArray4 = ByteBuffer.allocate(4).putInt((int)(Math.random() * 1000000000.00f)).array();
             byte[] uobyteArray5 = ByteBuffer.allocate(4).putInt(false).array();
             int i1 = ((((((uobyteArray.length + 2) + uobyteArray1.length) + uobyteArray2.length) + uobyteArray3.length) + uobyteArray4.length) + uobyteArray5.length) + ByteBuffer.allocate(2).putShort(false).array().length;
             byte[] uobyteArray6 = new byte[i1];
             System.arraycopy(uobyteArray, false, uobyteArray6, false, uobyteArray.length);
             uobyteArray6[uobyteArray.length] = b;
             uobyteArray6[(uobyteArray.length + true)] = true;
             System.arraycopy(uobyteArray1, false, uobyteArray6, (uobyteArray.length + 2), uobyteArray1.length);
             System.arraycopy(uobyteArray2, false, uobyteArray6, ((uobyteArray.length + 2) + uobyteArray1.length), uobyteArray2.length);
             System.arraycopy(uobyteArray3, false, uobyteArray6, (((uobyteArray.length + 2) + uobyteArray1.length) + uobyteArray2.length), uobyteArray3.length);
             System.arraycopy(uobyteArray4, false, uobyteArray6, ((((uobyteArray.length + 2) + uobyteArray1.length) + uobyteArray2.length) + uobyteArray3.length), uobyteArray4.length);
             System.arraycopy(uobyteArray5, false, uobyteArray6, (((((uobyteArray.length + 2) + uobyteArray1.length) + uobyteArray2.length) + uobyteArray3.length) + uobyteArray4.length), uobyteArray5.length);
             CRC32 uCRC32 = new CRC32();
             uCRC32.update(uobyteArray6);
             uobyteArray = ByteBuffer.allocate(8).putLong(uCRC32.getValue()).array();
             uobyteArray1 = new byte[(uobyteArray.length + i1)];
             System.arraycopy(uobyteArray6, false, uobyteArray1, false, i1);
             System.arraycopy(uobyteArray, false, uobyteArray1, i1, uobyteArray.length);
             uobyteArray = f.a(new String(g.a(("OUROR1J1WjlNdnNieS93Mg==").getBytes(), 2)), new String(g.a(("OUROR1J1WjlNdnNieS93Mg==").getBytes(), 2)), uobyteArray1);
             this.f = g.b(uobyteArray, 2);
             uobyteArray1 = ByteBuffer.allocate(4).putInt(true).array();
             uobyteArray2 = new byte[(uobyteArray.length + uobyteArray1.length)];
             System.arraycopy(uobyteArray, false, uobyteArray2, false, uobyteArray.length);
             System.arraycopy(uobyteArray1, false, uobyteArray2, uobyteArray.length, uobyteArray1.length);
             this.h = g.b(uobyteArray2, 2);
             return;
          }else {
             str1 = bs.e(this.c);
          }
       }
       str1 = str1.replace(str4, str3);
       b = 3;
       goto label_0063 ;
    }
    public final void e(){
       byte[] uobyteArray = g.a(this.f, 2);
       byte[] uobyteArray1 = new byte[(uobyteArray.length + 4)];
       System.arraycopy(uobyteArray, 0, uobyteArray1, 0, uobyteArray.length);
       byte[] uobyteArray2 = ByteBuffer.allocate(4).putInt(this.g).array();
       System.arraycopy(uobyteArray2, 0, uobyteArray1, uobyteArray.length, uobyteArray2.length);
       this.h = g.b(uobyteArray1, 2);
       return;
    }
}
