package org.greenrobot.eventbus.a;
import awd.c;
import java.util.HashMap;
import java.lang.Object;
import org.greenrobot.eventbus.a$a;
import java.util.concurrent.ConcurrentHashMap;
import awd.d;
import android.os.Looper;
import awd.b;
import awd.a;
import java.util.List;
import awd.j;
import java.lang.Class;
import java.util.Map;
import java.util.ArrayList;
import awd.k;
import java.util.concurrent.ExecutorService;
import awd.f;
import awd.i;
import java.lang.reflect.Method;
import java.lang.IllegalStateException;
import java.lang.String;
import java.lang.Throwable;
import java.lang.reflect.InvocationTargetException;
import awd.h;
import java.util.Objects;
import org.greenrobot.eventbus.EventBusException;
import java.lang.ThreadLocal;
import org.greenrobot.eventbus.a$d;
import awd.e;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Iterator;
import org.greenrobot.eventbus.a$b;
import java.lang.Enum;
import awd.g;
import java.lang.Runnable;
import java.lang.StringBuilder;
import android.os.Message;
import android.os.Handler;
import awd.j$a;
import bwd.c;
import bwd.d;
import java.util.Set;
import java.util.Map$Entry;

public class a	// class@002127
{
    public final Map a;
    public final Map b;
    public final Map c;
    public final ThreadLocal d;
    public final d e;
    public final b f;
    public final a g;
    public final j h;
    public final ExecutorService i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final int p;
    public static String q = "EventBus";
    public static a r;
    public static final c s;
    public static final Map t;

    static {
       a.s = new c();
       a.t = new HashMap();
    }
    public void a(){
       super(a.s);
    }
    public void a(c p0){
       super();
       this.d = new a$a(this);
       this.a = new HashMap();
       this.b = new HashMap();
       this.c = new ConcurrentHashMap();
       this.e = new d(this, Looper.getMainLooper(), 10);
       this.f = new b(this);
       this.g = new a(this);
       c k = p0.k;
       int i = (k != null)? k.size(): 0;
       this.p = i;
       this.h = new j(p0.k, p0.h, p0.g);
       this.k = p0.a;
       this.l = p0.b;
       this.m = p0.c;
       this.n = p0.d;
       this.j = p0.e;
       this.o = p0.f;
       this.i = p0.i;
       return;
    }
    public static void a(List p0,Class[] p1){
       int len = p1.length;
       int i = 0;
       while (i < len) {
          object oobject = p1[i];
          if (!p0.contains(oobject)) {
             p0.add(oobject);
             a.a(p0, oobject.getInterfaces());
          }
          i = i + 1;
       }
       return;
    }
    public static c b(){
       return new c();
    }
    public static a d(){
       if (a.r == null) {
          a uoa = a.class;
          _monitor_enter(uoa);
          if (a.r == null) {
             a.r = new a();
          }
          _monitor_exit(uoa);
       }
       return a.r;
    }
    public static List j(Class p0){
       Map t = a.t;
       _monitor_enter(t);
       List list = t.get(p0);
       if (list == null) {
          list = new ArrayList();
          for (Class uClass = p0; uClass != null; uClass = uClass.getSuperclass()) {
             list.add(uClass);
             a.a(list, uClass.getInterfaces());
          }
          a.t.put(p0, list);
       }
       _monitor_exit(t);
       return list;
    }
    public final void c(k p0,Object p1){
       if (p1 != null) {
          boolean b = (Looper.getMainLooper() == Looper.myLooper())? true: false;
          this.o(p0, p1, b);
       }
       return;
    }
    public ExecutorService e(){
       return this.i;
    }
    public Object f(Class p0){
       a tc = this.c;
       _monitor_enter(tc);
       _monitor_exit(tc);
       return p0.cast(this.c.get(p0));
    }
    public void g(f p0){
       f a = p0.a;
       f b = p0.b;
       p0.a = null;
       p0.b = null;
       p0.c = null;
       List d = f.d;
       _monitor_enter(d);
       if (d.size() < 0x2710) {
          d.add(p0);
       }
       _monitor_exit(d);
       if (b.c != null) {
          this.h(b, a);
       }
       return;
    }
    public void h(k p0,Object p1){
       try{
          Object[] objArray = new Object[]{p1};
          p0.b.a.invoke(p0.a, objArray);
       }catch(java.lang.reflect.InvocationTargetException e0){
          Throwable cause = e0.getCause();
          if (p1 instanceof h) {
             if (this.k != null) {
                p0.a.getClass().toString();
                Objects.toString(p1.c);
                Objects.toString(p1.d);
             }
          }else if(this.j == null){
             if (this.k != null) {
                p1.getClass().toString();
                p0.a.getClass().toString();
             }
             if (this.m != null) {
                this.k(new h(this, cause, p1, p0.a));
             }
          }else {
             throw new EventBusException("Invoking subscriber failed", cause);
          }
       }catch(java.lang.IllegalAccessException e5){
          throw new IllegalStateException("Unexpected exception", e5);
       }
    label_0062 :
       return;
    }
    public synchronized boolean i(Object p0){
       return this.b.containsKey(p0);
    }
    public void k(Object p0){
       a$d uod = this.d.get();
       a$d a = uod.a;
       a.add(p0);
       if (uod.b == null) {
          boolean b = (Looper.getMainLooper() == Looper.myLooper())? true: false;
          uod.c = b;
          uod.b = true;
          if (uod.f == null) {
             while (!a.isEmpty()) {
                this.l(a.remove(0), uod);
             }
             uod.b = false;
             uod.c = false;
          }else {
             throw new EventBusException("Internal error. Abort state was not reset");
          }
       }
       return;
    }
    public final void l(Object p0,a$d p1){
       int i2;
       Class class = p0.getClass();
       if (this.o != null) {
          List list = a.j(class);
          int i = list.size();
          i2 = 0;
          for (int i1 = 0; i1 < i; i1 = i1 + 1) {
             i2 = i2 | this.m(p0, p1, list.get(i1));
          }
       }else {
          i2 = this.m(p0, p1, class);
       }
       if (!i2) {
          if (this.l != null) {
             class.toString();
          }
          if (this.n != null && (class != e.class && class != h.class)) {
             this.k(new e(this, p0));
          }
       }
    label_0043 :
       return;
    }
    public final boolean m(Object p0,a$d p1,Class p2){
       _monitor_enter(this);
       CopyOnWriteArrayList uCopyOnWrite = this.a.get(p2);
       _monitor_exit(this);
       if (uCopyOnWrite == null || uCopyOnWrite.isEmpty()) {
          return false;
       }
       Iterator iterator = uCopyOnWrite.iterator();
       while (iterator.hasNext()) {
          k ok = iterator.next();
          p1.e = p0;
          p1.d = ok;
          this.o(ok, p0, p1.c);
          a$d f = p1.f;
          p1.e = null;
          p1.d = null;
          p1.f = false;
          if (f != null) {
             break ;
          }
       }
       return true;
    }
    public void n(Object p0){
       a tc = this.c;
       _monitor_enter(tc);
       this.c.put(p0.getClass(), p0);
       _monitor_exit(tc);
       this.k(p0);
    }
    public final void o(k p0,Object p1,boolean p2){
       a tg;
       int i = a$b.a[p0.b.b.ordinal()];
       if (i != 1) {
          if (i != 2) {
             if (i != 3) {
                if (i == 4) {
                   tg = this.g;
                   Objects.requireNonNull(tg);
                   tg.b.a(f.a(p0, p1));
                   tg.c.e().execute(tg);
                }else {
                   throw new IllegalStateException("Unknown thread mode: "+p0.b.b);
                }
             }else if(p2){
                tg = this.f;
                Objects.requireNonNull(tg);
                _monitor_enter(tg);
                tg.b.a(f.a(p0, p1));
                if (tg.d == null) {
                   tg.d = true;
                   tg.c.e().execute(tg);
                }
                _monitor_exit(tg);
             }else {
                this.h(p0, p1);
             }
          }else if(p2){
             this.h(p0, p1);
          }else {
             tg = this.e;
             Objects.requireNonNull(tg);
             _monitor_enter(tg);
             tg.a.a(f.a(p0, p1));
             if (tg.d == null) {
                tg.d = true;
                if (!tg.sendMessage(tg.obtainMessage())) {
                   throw new EventBusException("Could not send handler message");
                }
             }
             _monitor_exit(tg);
          }
       }else {
          this.h(p0, p1);
       }
       return;
    }
    public void p(Object p0){
       j$a uoa;
       List list1;
       c uoc;
       Class class = p0.getClass();
       a th = this.h;
       Objects.requireNonNull(th);
       List list = j.d.get(class);
       if (list != null) {
       }else if(th.c != null){
          uoa = th.c();
          uoa.c(class);
          while (uoa.f != null) {
             th.a(uoa);
             uoa.d();
          }
          list1 = th.b(uoa);
       }else {
          uoa = th.c();
          uoa.c(class);
          while (uoa.f != null) {
             j$a h = uoa.h;
             if (h != null && h.d() != null) {
                uoc = uoa.h.d();
                if (uoa.f != uoc.a()) {
                label_0055 :
                   j a = th.a;
                   if (a != null) {
                      Iterator iterator1 = a.iterator();
                      while (true) {
                         if (iterator1.hasNext()) {
                            c uoc1 = iterator1.next().a(uoa.f);
                            if (uoc1 != null) {
                               uoc = uoc1;
                            }
                         }
                      }
                   }
                   uoc = null;
                }
             }else {
                goto label_0055 ;
             }
             uoa.h = uoc;
             if (uoc != null) {
                i[] oiArray = uoc.b();
                int len = oiArray.length;
                int i = 0;
                while (i < len) {
                   object oobject = oiArray[i];
                   if (uoa.a(oobject.a, oobject.c)) {
                      uoa.a.add(oobject);
                   }
                   i = i + 1;
                }
             }else {
                th.a(uoa);
             }
             uoa.d();
          }
          list1 = th.b(uoa);
       }
       list = list1;
       if (!list.isEmpty()) {
          j.d.put(class, list);
       }else {
          throw new EventBusException("Subscriber "+class+" and its super classes have no public methods with the @Subscribe annotation");
       }
       _monitor_enter(this);
       Iterator iterator = list.iterator();
       while (iterator.hasNext()) {
          this.s(p0, iterator.next());
       }
       _monitor_exit(this);
       return;
    }
    public Object q(Class p0){
       a tc = this.c;
       _monitor_enter(tc);
       _monitor_exit(tc);
       return p0.cast(this.c.remove(p0));
    }
    public boolean r(Object p0){
       a tc = this.c;
       _monitor_enter(tc);
       Class class = p0.getClass();
       if (p0.equals(this.c.get(class))) {
          this.c.remove(class);
          _monitor_exit(tc);
          return true;
       }else {
          _monitor_exit(tc);
          return false;
       }
    }
    public final void s(Object p0,i p1){
       i c = p1.c;
       k ok = new k(p0, p1);
       CopyOnWriteArrayList uCopyOnWrite = this.a.get(c);
       if (uCopyOnWrite == null) {
          uCopyOnWrite = new CopyOnWriteArrayList();
          this.a.put(c, uCopyOnWrite);
       }else if(!uCopyOnWrite.contains(ok)){
          throw new EventBusException("Subscriber "+p0.getClass()+" already registered to event "+c);
       }
       int i = uCopyOnWrite.size();
       int i1 = 0;
       while (i1 <= i) {
          if (i1 == i || p1.d > uCopyOnWrite.get(i1).b.d) {
             uCopyOnWrite.add(i1, ok);
             break ;
          }
          i1 = i1 + 1;
       }
       List list = this.b.get(p0);
       if (list == null) {
          list = new ArrayList();
          this.b.put(p0, list);
       }
       list.add(c);
       if (p1.e != null) {
          if (this.o != null) {
             p0 = this.c.entrySet().iterator();
             while (p0.hasNext()) {
                Map$Entry uEntry = p0.next();
                if (c.isAssignableFrom(uEntry.getKey())) {
                   this.c(ok, uEntry.getValue());
                }
             }
          }else {
             this.c(ok, this.c.get(c));
          }
       }
       return;
    }
    public synchronized void t(Object p0){
       List list = this.b.get(p0);
       if (list != null) {
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             List list1 = this.a.get(iterator.next());
             if (list1 != null) {
                int i = list1.size();
                int i1 = 0;
                while (i1 < i) {
                   k ok = list1.get(i1);
                   if (ok.a == p0) {
                      ok.c = false;
                      list1.remove(i1);
                      i1 = i1 - 1;
                      i = i - 1;
                   }
                   i1 = i1 + 1;
                }
             }
          }
          this.b.remove(p0);
       }else {
          "Subscriber to unregister was not registered before: "+p0.getClass();
       }
       return;
    }
    public String toString(){
       return "EventBus[indexCount="+this.p+", eventInheritance="+this.o+"]";
    }
}
