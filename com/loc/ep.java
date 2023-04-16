package com.loc.ep;
import android.content.Context;
import java.lang.String;
import android.os.Handler;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import com.loc.ep$2;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.loc.fq;
import java.io.File;
import java.lang.Throwable;
import java.util.Map;
import java.lang.Runnable;
import java.util.List;
import java.util.Iterator;
import com.loc.ep$a;
import com.loc.p;
import com.loc.ey;
import java.lang.Long;
import java.lang.Integer;
import java.util.Set;
import java.util.Map$Entry;
import java.util.ArrayList;
import java.util.Collection;
import com.loc.ep$1;
import java.util.Comparator;
import java.util.Collections;
import java.lang.StringBuilder;
import java.io.UnsupportedEncodingException;

public abstract class ep	// class@001414
{
    public String a;
    public File b;
    public boolean c;
    public Map d;
    public Handler e;
    public String f;
    public boolean g;
    public Runnable h;

    public void ep(Context p0,String p1,Handler p2){
       super();
       this.c = false;
       this.d = new ConcurrentHashMap();
       this.f = null;
       this.h = new ep$2(this);
       if (p0 == null) {
          return;
       }
       this.e = p2;
       if (TextUtils.isEmpty(p1)) {
          p1 = "unknow";
       }
       this.a = p1;
       this.f = fq.l(p0);
       this.b = new File(p0.getFilesDir().getPath(), this.a);
       this.d();
       return;
    }
    public static int a(long p0,long p1){
       if ((v0 = p0 - p1) < 0) {
          return -1;
       }
       if (!v0) {
          return 0;
       }
       return 1;
    }
    public static Map a(ep p0){
       return p0.d;
    }
    public static boolean b(ep p0){
       return p0.c;
    }
    public static boolean c(ep p0){
       return p0.g;
    }
    public static void d(ep p0){
       p0.e();
    }
    public static boolean e(ep p0){
       p0.g = false;
       return false;
    }
    public static Handler f(ep p0){
       return p0.e;
    }
    public static Runnable g(ep p0){
       return p0.h;
    }
    public final void a(){
       if (this.c == null) {
          ep te = this.e;
          if (te != null) {
             te.removeCallbacks(this.h);
             this.e.postDelayed(this.h, 0xea60);
          }
       }
       this.c = true;
       return;
    }
    public final void a(Object p0){
       this.b(p0, fq.b());
    }
    public abstract void a(Object p0,long p1);
    public final void a(List p0){
       long l = fq.b();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          this.b(iterator.next(), l);
       }
       if (this.d.size() >= p0.size()) {
          this.g = true;
       }
       if (this.d.size() > 0x4000 || this.c() <= 0) {
          this.d.clear();
          Iterator iterator1 = p0.iterator();
          while (iterator1.hasNext()) {
             ep$a obj = iterator1.next();
             String str = this.b(obj);
             int i = this.c(obj);
             long l1 = this.d(obj);
             obj = new ep$a(i, l1, l);
             this.d.put(str, v10);
          }
       }
       return;
    }
    public final void a(boolean p0){
       ep te = this.e;
       if (te != null) {
          te.removeCallbacks(this.h);
       }
       if (!p0) {
          this.h.run();
       }
       this.c = false;
       return;
    }
    public abstract long b();
    public abstract String b(Object p0);
    public final void b(Object p0,long p1){
       if (p0 != null && this.d(p0) >= 0) {
          String str = this.b(p0);
          ep$a uoa = this.d.get(str);
          if (uoa == null) {
             this.a(p0, p1);
             ep$a uoa1 = new ep$a(this.c(p0), this.d(p0), p1);
             this.d.put(str, v9);
             this.g = true;
             return;
          }else {
             uoa.c = p1;
             if (uoa.a != this.c(p0)) {
                this.a(p0, p1);
                uoa.a = this.c(p0);
                uoa.b = this.d(p0);
                this.g = true;
                return;
             }else {
                this.a(p0, uoa.b);
             }
          }
       }
       return;
    }
    public abstract int c(Object p0);
    public abstract long c();
    public abstract long d(Object p0);
    public final void d(){
       Iterator iterator = fq.a(this.b).iterator();
       while (iterator.hasNext()) {
          String[] stringArray = (new String(ey.b(p.b(iterator.next()), this.f), "UTF-8")).split(",");
          long l = (stringArray.length >= 4)? Long.parseLong(stringArray[3]): fq.b();
          ep$a uoa = new ep$a(Integer.parseInt(stringArray[1]), Long.parseLong(stringArray[2]), l);
          this.d.put(stringArray[0], v10);
       }
       return;
    }
    public final long e(Object p0){
       return ((fq.b() - this.d(p0)) / 1000);
    }
    public final void e(){
       ep uoep = null;
       if (this.c() - uoep > 0) {
          this.d.size();
          if (this.b() - uoep > 0) {
             long l = fq.b();
             Iterator iterator = this.d.entrySet().iterator();
             while (iterator.hasNext()) {
                long l1 = l - this.d.get(iterator.next().getKey()).c;
                if (l1 - this.b() > 0) {
                   iterator.remove();
                }
             }
          }
          if ((long)this.d.size() - this.c() > 0) {
             ArrayList uArrayList = new ArrayList(this.d.keySet());
             Collections.sort(uArrayList, new ep$1(this));
             for (int i = (int)this.c(); i < uArrayList.size(); i = i + 1) {
                this.d.remove(uArrayList.get(i));
             }
          }
       }
       String str = "";
       Iterator iterator1 = this.d.entrySet().iterator();
       while (iterator1.hasNext()) {
          Map$Entry uEntry = iterator1.next();
          String str1 = uEntry.getKey()+","+uEntry.getValue().a+","+uEntry.getValue().b+","+uEntry.getValue().c;
          try{
             str = str+p.b(ey.a(str1.getBytes("UTF-8"), this.f))+"\n";
          }catch(java.io.UnsupportedEncodingException e2){
             e2.printStackTrace();
             goto label_0095 ;
          }
       }
       str = str;
       if (!TextUtils.isEmpty(str)) {
          fq.a(this.b, str);
       }
       return;
    }
}
