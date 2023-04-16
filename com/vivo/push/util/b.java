package com.vivo.push.util.b;
import java.lang.Object;
import java.util.HashMap;
import android.content.SharedPreferences$Editor;
import android.os.Looper;
import oe6.g;
import java.lang.String;
import java.lang.Integer;
import android.content.SharedPreferences;
import android.content.Context;
import java.lang.CharSequence;
import android.text.TextUtils;
import oe6.o;
import java.util.List;
import java.util.Map;
import com.vivo.push.util.p;
import java.lang.RuntimeException;
import java.lang.Long;
import java.util.Set;
import java.util.Iterator;
import java.lang.Throwable;
import java.util.ArrayList;
import com.vivo.push.util.z;
import android.util.Base64;
import java.lang.StringBuilder;
import java.lang.Exception;

public class b	// class@0010b0
{
    public Context a;
    public String b;
    public SharedPreferences c;
    public HashMap d;
    public HashMap e;
    public HashMap f;
    public HashMap g;

    public void b(){
       super();
       this.d = new HashMap();
       this.e = new HashMap();
       this.f = new HashMap();
       this.g = new HashMap();
    }
    public static void a(SharedPreferences$Editor p0){
       if (p0 == null) {
          return;
       }
       if (Looper.myLooper() == Looper.getMainLooper()) {
          g.a(p0);
          return;
       }else {
          g.b(p0);
          return;
       }
    }
    public final int a(String p0){
       Integer integer = this.f.get(p0);
       if (integer != null) {
          return integer.intValue();
       }
       this.b();
       if (this.c != null) {
          integer = Integer.valueOf(this.c.getInt(p0, 0));
          if (!integer.equals(Integer.valueOf(0))) {
             this.f.put(p0, integer);
          }
       }
       return integer.intValue();
    }
    public final void a(){
       this.e.clear();
       this.f.clear();
       this.g.clear();
       this.d.clear();
       this.b();
       if (this.c != null) {
          SharedPreferences$Editor uEditor = this.c.edit();
          uEditor.clear();
          b.a(uEditor);
       }
       return;
    }
    public final void a(Context p0,String p1){
       if (TextUtils.isEmpty(p1)) {
          throw new RuntimeException("sharedFileName can\'t be null");
       }
       this.b = p1;
       int i = 0;
       this.c = o.c(p0, p1, i);
       this.a = p0;
       List list = this.c("local_iv");
       if (list == null || list.size() < 4) {
          p.a("BaseSharePreference", " initSecureCode error list is null ");
          return;
       }else {
          HashMap hashMap = new HashMap();
          hashMap.put("com.vivo.push.secure_sub_iv", list.get(1));
          hashMap.put("com.vivo.push.secure_sub_key", list.get(2));
          hashMap.put("com.vivo.push.secure_cache_iv", list.get(3));
          hashMap.put("com.vivo.push.secure_cache_key", list.get(i));
          this.a(hashMap);
          return;
       }
    }
    public final void a(String p0,int p1){
       this.f.put(p0, Integer.valueOf(p1));
       this.b();
       if (this.c != null) {
          SharedPreferences$Editor uEditor = this.c.edit();
          uEditor.putInt(p0, p1);
          b.a(uEditor);
       }
       return;
    }
    public final void a(String p0,long p1){
       this.e.put(p0, Long.valueOf(p1));
       this.b();
       if (this.c != null) {
          SharedPreferences$Editor uEditor = this.c.edit();
          uEditor.putLong(p0, p1);
          b.a(uEditor);
       }
       return;
    }
    public final void a(String p0,String p1){
       this.d.put(p0, p1);
       this.b();
       if (this.c != null) {
          SharedPreferences$Editor uEditor = this.c.edit();
          uEditor.putString(p0, p1);
          b.a(uEditor);
       }
       return;
    }
    public final void a(Map p0){
       if (p0.size() > 0) {
          this.b();
          if (this.c != null) {
             SharedPreferences$Editor uEditor = this.c.edit();
             Iterator iterator = p0.keySet().iterator();
             while (iterator.hasNext()) {
                String str = iterator.next();
                String str1 = p0.get(str);
                this.d.put(str, str1);
                uEditor.putString(str, str1);
             }
             b.a(uEditor);
          }
       }
       return;
    }
    public final long b(String p0,long p1){
       Long longx = this.e.get(p0);
       if (longx != null) {
          return longx.longValue();
       }
       this.b();
       if (this.c != null) {
          longx = Long.valueOf(this.c.getLong(p0, p1));
          if (!longx.equals(Long.valueOf(p1))) {
             this.e.put(p0, longx);
          }
       }
       return longx.longValue();
    }
    public final String b(String p0,String p1){
       String str = this.d.get(p0);
       if (str != null) {
          return str;
       }
       this.b();
       if (this.c != null) {
          str = this.c.getString(p0, p1);
          if (!TextUtils.isEmpty(str) && !str.equals(p1)) {
             this.d.put(p0, str);
          }
       }
       return str;
    }
    public final void b(){
       if (this.c == null) {
          b ta = this.a;
          if (ta != null) {
             this.c = o.c(ta, this.b, 0);
          }else {
             throw new RuntimeException("SharedPreferences is not init", new Throwable());
          }
       }
       return;
    }
    public final void b(String p0){
       this.e.remove(p0);
       this.f.remove(p0);
       this.g.remove(p0);
       this.d.remove(p0);
       this.b();
       if (this.c != null) {
          SharedPreferences$Editor uEditor = this.c.edit();
          if (this.c.contains(p0)) {
             uEditor.remove(p0);
             b.a(uEditor);
          }
       }
       return;
    }
    public final List c(String p0){
       ArrayList uArrayList;
       String str = ",#@";
       if (this.a == null) {
          p.c("BaseSharePreference", " parsLocalIv error mContext is null ");
          return null;
       }else {
          try{
             uArrayList = new ArrayList();
             b ta = this.a;
             p0 = z.a(ta, ta.getPackageName(), p0);
             if (p0 == null) {
                return null;
             }else {
                String str1 = new String(Base64.decode(p0.toString(), 2));
                if (TextUtils.isEmpty(str1)) {
                   return null;
                }else {
                   String[] stringArray = str1.split(str);
                   if (stringArray != null && stringArray.length >= 4) {
                      int len = stringArray.length;
                      for (int i = 0; i < len; i = i + 1) {
                         uArrayList.add((stringArray[i]).replace(str, ""));
                      }
                      if (uArrayList.size() >= 4) {
                      }
                   }
                   return null;
                }
             }
          }catch(java.lang.Exception e10){
             p.c("BaseSharePreference", " parsLocalIv error e ="+e10.getMessage());
             e10.printStackTrace();
          }
          return uArrayList;
       }
    }
}
