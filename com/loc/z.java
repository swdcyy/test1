package com.loc.z;
import java.lang.String;
import com.loc.x;
import android.content.Context;
import java.lang.Object;
import android.os.Looper;
import com.loc.z$a;
import com.loc.z$1;
import java.lang.Thread;
import com.loc.af;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.os.Build$VERSION;
import android.content.ContentResolver;
import android.provider.Settings$System;
import com.loc.ab;
import android.content.SharedPreferences;
import oe6.o;
import android.content.SharedPreferences$Editor;
import oe6.g;
import java.util.List;

public final class z	// class@001475
{
    public List b;
    public String c;
    public final Context d;
    public final Handler e;
    public static final String a;
    public static z f;

    static {
       z.a = x.c("SU2hhcmVkUHJlZmVyZW5jZUFkaXU");
    }
    public void z(Context p0){
       super();
       this.d = p0.getApplicationContext();
       z$a uoa = (Looper.myLooper() == null)? new z$a(Looper.getMainLooper(), this): new z$a(this);
       this.e = uoa;
       return;
    }
    public static Context a(z p0){
       return p0.d;
    }
    public static z a(Context p0){
       if (z.f == null) {
          _monitor_enter(z.class);
          if (z.f == null) {
             z.f = new z(p0);
          }
          _monitor_exit(z.class);
       }
       return z.f;
    }
    public static void a(z p0,String p1,int p2){
       p0.a(p1, p2);
    }
    public static String b(z p0){
       return p0.c;
    }
    public final void a(String p0){
       this.c = p0;
    }
    public synchronized final void a(String p0,int p1){
       SharedPreferences$Editor uEditor;
       ContentResolver contentResol;
       z tc;
       if (Looper.myLooper() == Looper.getMainLooper()) {
          new z$1(this, p0, p1).start();
          return;
       }else {
          p0 = af.b(p0);
          if (!TextUtils.isEmpty(p0)) {
             if ((p1 & 0x01) > 0) {
                try{
                   if (Build$VERSION.SDK_INT >= 23) {
                      contentResol = this.d.getContentResolver();
                      tc = this.c;
                   }else {
                      contentResol = this.d.getContentResolver();
                      tc = this.c;
                   }
                   Settings$System.putString(contentResol, tc, p0);
                }catch(java.lang.Exception e0){
                }
             }
          }
          return;
       }
    }
    public final void b(String p0){
       z tb = this.b;
       if (tb != null) {
          tb.clear();
          this.b.add(p0);
       }
       this.a(p0, 273);
       return;
    }
}
