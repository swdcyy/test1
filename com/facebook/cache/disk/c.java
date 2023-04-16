package com.facebook.cache.disk.c;
import com.facebook.cache.disk.f;
import xa.a;
import java.util.concurrent.TimeUnit;
import com.facebook.cache.disk.b;
import ua.b;
import com.facebook.cache.disk.c$c;
import com.facebook.cache.common.CacheEventListener;
import com.facebook.cache.common.CacheErrorLogger;
import xa.b;
import java.util.concurrent.Executor;
import java.lang.Object;
import com.facebook.common.statfs.StatFsHelper;
import com.facebook.cache.disk.c$b;
import hb.d;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import com.facebook.cache.disk.c$a;
import java.lang.Runnable;
import com.facebook.cache.disk.b$a;
import java.util.Set;
import com.facebook.cache.common.CacheErrorLogger$CacheErrorCategory;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Exception;
import java.lang.Class;
import java.lang.Throwable;
import com.facebook.cache.common.CacheKey;
import sa.a;
import ua.c;
import java.util.List;
import com.facebook.cache.common.b;
import com.facebook.cache.common.a;
import ab.e;
import java.io.IOException;
import hb.a;
import java.util.Collection;
import java.util.Iterator;
import com.facebook.cache.disk.b$c;
import java.lang.Math;
import com.facebook.cache.common.CacheEventListener$EvictionReason;
import com.facebook.cache.common.d;
import ta.b;
import com.facebook.cache.disk.b$d;
import cb.a;
import java.lang.RuntimeException;
import java.util.ArrayList;
import com.facebook.cache.disk.e;
import java.util.Comparator;
import java.util.Collections;
import com.facebook.common.statfs.StatFsHelper$StorageType;
import android.os.StatFs;

public class c implements f, a	// class@000437
{
    public final long a;
    public final long b;
    public final CountDownLatch c;
    public long d;
    public final CacheEventListener e;
    public final Set f;
    public long g;
    public final long h;
    public final StatFsHelper i;
    public final b j;
    public final b k;
    public final CacheErrorLogger l;
    public final boolean m;
    public final c$b n;
    public final a o;
    public final Object p;
    public boolean q;
    public static final Class r;
    public static final long s;
    public static final long t;

    static {
       c.r = c.class;
       c.s = TimeUnit.HOURS.toMillis(2);
       c.t = TimeUnit.MINUTES.toMillis(30);
    }
    public void c(b p0,b p1,c$c p2,CacheEventListener p3,CacheErrorLogger p4,b p5,Executor p6,boolean p7){
       super();
       this.p = new Object();
       this.a = p2.b;
       c$c c = p2.c;
       this.b = c;
       this.d = c;
       _monitor_enter(StatFsHelper.class);
       if (StatFsHelper.h == null) {
          StatFsHelper.h = new StatFsHelper();
       }
       _monitor_exit(StatFsHelper.class);
       this.i = StatFsHelper.h;
       this.j = p0;
       this.k = p1;
       this.g = -1;
       this.e = p3;
       this.h = p2.a;
       this.l = p4;
       this.n = new c$b();
       this.o = d.a();
       this.m = p7;
       this.f = new HashSet();
       if (p5 != null) {
          p5.b(this);
       }
       if (p7) {
          this.c = new CountDownLatch(1);
          p6.execute(new c$a(this));
       }else {
          this.c = new CountDownLatch(0);
       }
       return;
    }
    public b$a a(){
       return this.j.a();
    }
    public void b(){
       c tp = this.p;
       _monitor_enter(tp);
       try{
          this.j.b();
          this.f.clear();
          this.e.b();
       label_0036 :
          this.n.d();
          _monitor_exit(tp);
          return;
       }catch(java.io.IOException e1){
       }catch(java.lang.NullPointerException e1){
       }
       this.l.a(CacheErrorLogger$CacheErrorCategory.EVICTION, c.r, "clearAll: "+e1.getMessage(), e1);
       goto label_0036 ;
    }
    public a c(CacheKey p0){
       int i;
       c uoc = c.f();
       uoc.h(p0);
       try{
          i = 0;
          c tp = this.p;
          _monitor_enter(tp);
          List list = b.a(p0);
          int i1 = 0;
          String str = i;
          a uoa = str;
          while (i1 < list.size()) {
             str = list.get(i1);
             uoc.m(str);
             uoa = this.j.i(str, p0);
             if (uoa != null) {
                break ;
             }else {
                i1 = i1 + 1;
             }
          }
          if (uoa == null) {
             this.e.c(uoc);
             this.f.remove(str);
          }else {
             e.d(str);
             this.e.e(uoc);
             this.f.add(str);
          }
          _monitor_exit(tp);
          uoc.g();
          return uoa;
       }catch(java.io.IOException e9){
          this.l.a(CacheErrorLogger$CacheErrorCategory.GENERIC_IO, c.r, "getResource", e9);
          uoc.k(e9);
          this.e.f(uoc);
          uoc.g();
          return i;
       }
    }
    public void d(){
       this.b();
    }
    public void e(){
       c tp = this.p;
       _monitor_enter(tp);
       this.n();
       long l = this.n.b();
       c th = this.h;
       int i = 0;
       if (th - i > 0 && (l - i <= 0 || l - th < 0)) {
          _monitor_exit(tp);
          return;
       }else {
          double d = 0x3ff0000000000000 - ((double)th / (double)l);
          if (d - 0x3f947ae147ae147b > 0) {
             this.p(d);
          }
          _monitor_exit(tp);
          return;
       }
    }
    public long f(long p0){
       int i1;
       c uoc = this;
       c p = uoc.p;
       _monitor_enter(p);
       try{
          long l = uoc.o.now();
          long l1 = uoc.n.b();
          int i = 0;
          Iterator iterator = uoc.j.j().iterator();
          long l2 = 0;
          long l3 = 0;
          try{
             while (iterator.hasNext()) {
                b$c uoc1 = iterator.next();
                long l4 = l - uoc1.getTimestamp();
                long l5 = l;
                long l6 = Math.max(1, Math.abs(l4));
                if (l6 - p0 >= 0) {
                   l6 = uoc.j.f(uoc1);
                   uoc.f.remove(uoc1.getId());
                   if (l6 > 0) {
                      i = i + 1;
                      l2 = l2 + l6;
                      c uoc2 = c.f();
                      uoc2.m(uoc1.getId());
                      uoc2.j(CacheEventListener$EvictionReason.CONTENT_STALE);
                      uoc2.l(l6);
                      l6 = l1 - l2;
                      uoc2.i(l6);
                      uoc.e.h(uoc2);
                      uoc2.g();
                   }
                }else {
                   l3 = Math.max(l3, l6);
                }
                l = l5;
             }
             uoc.j.d();
             if (i > 0) {
                this.n();
                uoc.n.c((- l2), (long)(- i));
             label_00bf :
                _monitor_exit(p);
                return l3;
             }else {
                goto label_00bf ;
             }
          }catch(java.io.IOException e0){
             i1 = l3;
          }
          uoc.l.a(CacheErrorLogger$CacheErrorCategory.EVICTION, c.r, "clearOldEntries: "+e0.getMessage(), e0);
          l3 = i1;
          goto label_00bf ;
       }catch(java.io.IOException e0){
          i1 = 0;
          goto label_00a0 ;
       }
    }
    public void g(CacheKey p0){
       c tp = this.p;
       _monitor_enter(tp);
       try{
          List list = b.a(p0);
          for (int i = 0; i < list.size(); i = i + 1) {
             String str = list.get(i);
             this.j.remove(str);
             this.f.remove(str);
          }
       }catch(java.io.IOException e7){
          this.l.a(CacheErrorLogger$CacheErrorCategory.DELETE_FILE, c.r, "delete: "+e7.getMessage(), e7);
       }
       _monitor_exit(tp);
       return;
    }
    public long getCount(){
       return this.n.a();
    }
    public long getSize(){
       return this.n.b();
    }
    public boolean h(CacheKey p0){
       c tp;
       String str;
       c uoc = null;
       try{
          tp = this.p;
          _monitor_enter(tp);
          List list = b.a(p0);
          int i = 0;
          while (true) {
             if (i < list.size()) {
                str = list.get(i);
                if (this.j.e(str, p0)) {
                   break ;
                }else {
                   i = i + 1;
                   String str1 = str;
                }
             }else {
                _monitor_exit(tp);
                return false;
             }
          }
          this.f.add(str);
          _monitor_exit(tp);
          return true;
       }catch(java.io.IOException e2){
          str = uoc;
          IOException iOException = e2;
          tp = c.f();
          tp.h(p0);
          tp.m(str);
          tp.k(iOException);
          this.e.f(tp);
          tp.g();
          return false;
       }
    }
    public boolean i(CacheKey p0){
       c tp = this.p;
       _monitor_enter(tp);
       List list = b.a(p0);
       int i = 0;
       while (true) {
          if (i < list.size()) {
             if (this.f.contains(list.get(i))) {
                break ;
             }else {
                i = i + 1;
             }
          }else {
             _monitor_exit(tp);
             return false;
          }
       }
       _monitor_exit(tp);
       return true;
    }
    public boolean isEnabled(){
       return this.j.isEnabled();
    }
    public boolean j(CacheKey p0){
       String str;
       c tp = this.p;
       _monitor_enter(tp);
       if (this.i(p0)) {
          _monitor_exit(tp);
          return true;
       }else {
          boolean b = false;
          try{
             List list = b.a(p0);
             int i = 0;
             while (true) {
                if (i < list.size()) {
                   str = list.get(i);
                   if (this.j.c(str, p0)) {
                      break ;
                   }else {
                      i = i + 1;
                   }
                }else {
                   _monitor_exit(tp);
                   return b;
                }
             }
             this.f.add(str);
             _monitor_exit(tp);
             return true;
          }catch(java.io.IOException e0){
             _monitor_exit(e0);
             return b;
          }
       }
    }
    public a k(CacheKey p0,d p1){
       c uoc = c.f();
       uoc.h(p0);
       this.e.g(uoc);
       c tp = this.p;
       try{
          _monitor_enter(tp);
          String str = (p0 instanceof b)? b.b(p0.d().get(0)): b.b(p0);
          _monitor_exit(tp);
          try{
             uoc.m(str);
             b$d uod = this.o(str, p0);
             uod.a(p1, p0);
             c tp1 = this.p;
             _monitor_enter(tp1);
             a uoa = uod.b(p0);
             this.f.add(str);
             this.n.c(uoa.size(), 1);
             _monitor_exit(tp1);
             uoc.l(uoa.size());
             uoc.i(this.n.b());
             this.e.i(uoc);
             if (!uod.cleanUp()) {
                a.c(c.r, "Failed to delete temp file");
             }
             uoc.g();
             return uoa;
          }catch(java.io.IOException e8){
             uoc.k(e8);
             this.e.d(uoc);
             a.d(c.r, "Failed inserting a file into the cache", e8);
             throw e8;
          }
       }catch(java.io.UnsupportedEncodingException e8){
          throw new RuntimeException(e8);
       }
    }
    public final void l(long p0,CacheEventListener$EvictionReason p1){
       c uoc = this;
       long l = p0;
       try{
          long l1 = uoc.n.b();
          long l2 = l1 - l;
          int i = 0;
          Iterator iterator = uoc.m(uoc.j.j()).iterator();
          long l3 = 0;
          while (iterator.hasNext()) {
             b$c uoc1 = iterator.next();
             if (l3 - l2 > 0) {
                break ;
             }else {
                long l4 = uoc.j.f(uoc1);
                uoc.f.remove(uoc1.getId());
                if (l4 - null > 0) {
                   i = i + 1;
                   l3 = l3 + l4;
                   c uoc2 = c.f();
                   uoc2.m(uoc1.getId());
                   uoc2.j(p1);
                   uoc2.l(l4);
                   long l5 = l1 - l3;
                   uoc2.i(l5);
                   uoc2.d = l;
                   uoc.e.h(uoc2);
                   uoc2.g();
                }else {
                   int i1 = p1;
                }
             }
          }
          uoc.n.c((- l3), (long)(- i));
          uoc.j.d();
          return;
       }catch(java.io.IOException e0){
          uoc.l.a(CacheErrorLogger$CacheErrorCategory.EVICTION, c.r, "evictAboveSize: "+e0.getMessage(), e0);
          throw e0;
       }
    }
    public final Collection m(Collection p0){
       long l = this.o.now() + c.s;
       ArrayList uArrayList = new ArrayList(p0.size());
       ArrayList uArrayList1 = new ArrayList(p0.size());
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          b$c uoc = iterator.next();
          if (uoc.getTimestamp() - l > 0) {
             uArrayList.add(uoc);
          }else {
             uArrayList1.add(uoc);
          }
       }
       Collections.sort(uArrayList1, this.k.get());
       uArrayList.addAll(uArrayList1);
       return uArrayList;
    }
    public boolean n(){
       c f;
       long l5;
       long l6;
       c uoc = this;
       long l = uoc.o.now();
       c n = uoc.n;
       _monitor_enter(n);
       _monitor_exit(n);
       long l1 = -1;
       boolean i = 0;
       if (n.a != null) {
          c g = uoc.g;
          if (g - l1 && (l - g) - c.t <= 0) {
             return i;
          }
       }
       l = uoc.o.now();
       long l2 = c.s + l;
       if (uoc.m != null && uoc.f.isEmpty()) {
          f = uoc.f;
       }else if(uoc.m != null){
          f = new HashSet();
       }else {
          f = null;
       }
       try{
          Iterator iterator = uoc.j.j().iterator();
          long l3 = 0;
          int i1 = 0;
          String str = null;
          int i2 = 0;
          while (iterator.hasNext()) {
             b$c uoc1 = iterator.next();
             i2 = i2 + 1;
             l3 = l3 + uoc1.getSize();
             if (uoc1.getTimestamp() - l2 > 0) {
                i = i + 1;
                long l4 = (long)i1 + uoc1.getSize();
                i1 = (int)l4;
                l5 = l2;
                int i3 = i;
                l6 = uoc1.getTimestamp() - l;
                l1 = Math.max(l6, l1);
                i = i3;
                str = 1;
             }else {
                l5 = l2;
                if (uoc.m != null) {
                   e.d(f);
                   f.add(uoc1.getId());
                }
             }
             l2 = l5;
          }
          if (str) {
             uoc.l.a(CacheErrorLogger$CacheErrorCategory.READ_INVALID_ENTRY, c.r, "Future timestamp found in "+i+" files , with a total size of "+i1+" bytes, and a maximum time delta of "+l1+"ms", null);
          }
          l6 = (long)i2;
          if (uoc.n.a() - l6 || uoc.n.b() - l3) {
             if (uoc.m != null && uoc.f != f) {
                e.d(f);
                uoc.f.clear();
                uoc.f.addAll(f);
             }
             n = uoc.n;
             _monitor_enter(n);
             n.c = l6;
             n.b = l3;
             n.a = true;
             _monitor_exit(n);
          }else {
             f = 1;
          }
          uoc.g = l;
          i = true;
       }catch(java.io.IOException e0){
          uoc.l.a(CacheErrorLogger$CacheErrorCategory.GENERIC_IO, c.r, "calcFileCacheSize: "+e0.getMessage(), e0);
          i = false;
       }
       return i;
    }
    public final b$d o(String p0,CacheKey p1){
       c tp = this.p;
       _monitor_enter(tp);
       boolean b = this.n();
       this.q();
       long l = this.n.b();
       if (l - this.d > 0 && !b) {
          this.n.d();
          this.n();
       }
       c td = this.d;
       if (l - td > 0) {
          this.l(((td * 9) / 10), CacheEventListener$EvictionReason.CACHE_FULL);
       }
       _monitor_exit(tp);
       return this.j.g(p0, p1);
    }
    public final void p(double p0){
       c tp = this.p;
       _monitor_enter(tp);
       try{
          this.n.d();
          this.n();
          long l = this.n.b();
          this.l((l - (long)(p0 * (double)l)), CacheEventListener$EvictionReason.CACHE_MANAGER_TRIMMED);
       }catch(java.io.IOException e6){
          this.l.a(CacheErrorLogger$CacheErrorCategory.EVICTION, c.r, "trimBy: "+e6.getMessage(), e6);
       }
       _monitor_exit(tp);
       return;
    }
    public final void q(){
       StatFsHelper$StorageType eXTERNAL = (this.j.isExternal())? StatFsHelper$StorageType.EXTERNAL: StatFsHelper$StorageType.INTERNAL;
       c ti = this.i;
       long l = this.b - this.n.b();
       ti.a();
       ti.a();
       ti.b();
       StatFsHelper a = (eXTERNAL == StatFsHelper$StorageType.INTERNAL)? ti.a: ti.c;
       long l1 = (a != null)? a.getBlockSizeLong() * a.getAvailableBlocksLong(): 0;
       c uoc = 1;
       if (l1 > 0 && l1 - l >= 0) {
          uoc = null;
       }
       this.d = (uoc)? this.a: this.b;
       return;
    }
}
