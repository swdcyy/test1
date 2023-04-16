package com.kuaishou.weapon.ks.l;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import oe6.g;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.weapon.ks.g;

public class l	// class@001214
{
    public SharedPreferences b;
    public SharedPreferences$Editor c;
    public Context d;
    public static l e;

    public void l(Context p0){
       super();
       this.d = p0;
       SharedPreferences sharedPrefer = p0.getSharedPreferences("re_po_rt", 4);
       this.b = sharedPrefer;
       this.c = sharedPrefer.edit();
    }
    public void l(Context p0,String p1){
       super();
       this.d = p0;
       SharedPreferences sharedPrefer = p0.getSharedPreferences(p1, 4);
       this.b = sharedPrefer;
       this.c = sharedPrefer.edit();
    }
    public static l a(){
       return l.e;
    }
    public static synchronized l a(Context p0,String p1){
       _monitor_enter(l.class);
       if (l.e == null) {
          _monitor_enter(l.class);
          if (l.e == null) {
             l.e = new l(p0, p1);
          }
          _monitor_exit(l.class);
       }
       _monitor_exit(l.class);
       return l.e;
    }
    public long a(String p0,long p1){
       return this.b.getLong(p0, p1);
    }
    public String a(String p0){
       return this.b.getString(p0, "");
    }
    public void a(Context p0){
       this.d = p0;
    }
    public void a(String p0,int p1){
       this.c.putInt(p0, p1);
       g.a(this.c);
    }
    public void a(String p0,int p1,boolean p2){
       this.c.putInt(p0, p1);
       if (p2) {
          g.a(this.c);
       }
       return;
    }
    public void a(String p0,Boolean p1){
       this.c.putBoolean(p0, p1.booleanValue());
       g.a(this.c);
    }
    public void a(String p0,String p1){
       if (!TextUtils.isEmpty(p1)) {
          this.c.putString(p0, p1);
          g.a(this.c);
       }
       return;
    }
    public void a(String p0,String p1,boolean p2){
       if (!TextUtils.isEmpty(p1)) {
          this.c.putString(p0, p1);
          if (p2) {
             g.a(this.c);
          }
       }
       return;
    }
    public int b(String p0){
       int i = 0;
       try{
          return this.b.getInt(p0, i);
       }catch(java.lang.Exception e0){
          return e0;
       }
    }
    public int b(String p0,int p1){
       try{
          return this.b.getInt(p0, p1);
       }catch(java.lang.Exception e0){
          return p1;
       }
    }
    public Context b(){
       return this.d;
    }
    public String b(String p0,String p1){
       return this.b.getString(p0, p1);
    }
    public String b(String p0,String p1,boolean p2){
       p0 = this.b(p0, "");
       if (!TextUtils.isEmpty(p0)) {
          p1 = (p2)? g.b(p0, 2): p0;
       }
    label_0015 :
       return p1;
    }
    public void b(String p0,long p1){
       this.c.putLong(p0, p1);
       g.a(this.c);
    }
    public int c(String p0){
       int i = 0;
       try{
          return this.b.getInt(p0, i);
       }catch(java.lang.Exception e0){
          return e0;
       }
    }
    public int c(String p0,int p1){
       try{
          return this.b.getInt(p0, p1);
       }catch(java.lang.Exception e0){
          return p1;
       }
    }
    public void c(){
       g.a(this.c);
    }
    public void c(String p0,String p1){
       try{
          this.c.putString(p0, p1);
          g.a(this.c);
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public void c(String p0,String p1,boolean p2){
       if (!TextUtils.isEmpty(p1)) {
          if (p2) {
             p1 = g.b(p1.getBytes(), 2);
          }
          this.c.putString(p0, p1);
          g.a(this.c);
       }
       return;
    }
    public long d(String p0){
       return this.b.getLong(p0, 0);
    }
    public void d(String p0,int p1){
       this.c.putInt(p0, p1);
       g.a(this.c);
    }
    public boolean e(String p0){
       return this.b.getBoolean(p0, false);
    }
}
