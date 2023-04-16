package com.facebook.common.references.a;
import java.lang.Cloneable;
import java.io.Closeable;
import com.facebook.common.references.a$a;
import com.facebook.common.references.a$b;
import com.facebook.common.references.SharedReference;
import com.facebook.common.references.a$c;
import java.lang.Throwable;
import java.lang.Object;
import ab.e;
import fb.c;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import android.graphics.Bitmap;
import fb.a;
import com.facebook.common.references.b;
import com.facebook.common.references.d;
import com.facebook.common.references.e;
import com.facebook.common.references.c;

public abstract class a implements Cloneable, Closeable	// class@00044d
{
    public boolean b;
    public final SharedReference c;
    public final a$c d;
    public final Throwable e;
    public static Class f;
    public static int g;
    public static final c h;
    public static final a$c i;

    static {
       a.f = a.class;
       a.g = 0;
       a.h = new a$a();
       a.i = new a$b();
    }
    public void a(SharedReference p0,a$c p1,Throwable p2){
       super();
       this.b = false;
       e.d(p0);
       this.c = p0;
       _monitor_enter(p0);
       p0.b();
       p0.b = p0.b + 1;
       _monitor_exit(p0);
       this.d = p1;
       this.e = p2;
    }
    public void a(Object p0,c p1,a$c p2,Throwable p3){
       super();
       this.b = false;
       this.c = new SharedReference(p0, p1);
       this.d = p2;
       this.e = p3;
    }
    public static a d(a p0){
       p0 = (p0 != null)? p0.c(): null;
       return p0;
    }
    public static List e(Collection p0){
       if (p0 == null) {
          return null;
       }
       ArrayList uArrayList = new ArrayList(p0.size());
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(a.d(iterator.next()));
       }
       return uArrayList;
    }
    public static void f(a p0){
       if (p0 != null) {
          p0.close();
       }
       return;
    }
    public static void g(Iterable p0){
       if (p0 != null) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             a.f(iterator.next());
          }
       }
       return;
    }
    public static boolean l(a p0){
       boolean b = (p0 != null && p0.k())? true: false;
       return b;
    }
    public static a o(Closeable p0){
       return a.p(p0, a.h);
    }
    public static a p(Object p0,c p1){
       return a.r(p0, p1, a.i);
    }
    public static a r(Object p0,c p1,a$c p2){
       a uoa = null;
       if (p0 == null) {
          return uoa;
       }
       if (p2.a()) {
          uoa = new Throwable();
       }
       return a.s(p0, p1, p2, uoa);
    }
    public static a s(Object p0,c p1,a$c p2,Throwable p3){
       if (p0 instanceof Bitmap || p0 instanceof a) {
          int g = a.g;
          if (g != 1) {
             if (g != 2) {
                if (g == 3) {
                   return new d(p0, p1, p2, p3);
                }
             }else {
                return new e(p0, p1, p2, p3);
             }
          }else {
             return new c(p0, p1, p2, p3);
          }
       }
       return new b(p0, p1, p2, p3);
    }
    public abstract a a();
    public synchronized a c(){
       if (this.k()) {
          return this.a();
       }
       return null;
    }
    public Object clone(){
       return this.a();
    }
    public void close(){
       _monitor_enter(this);
       if (this.b != null) {
          _monitor_exit(this);
          return;
       }else {
          this.b = true;
          _monitor_exit(this);
          this.c.a();
          return;
       }
    }
    public void finalize(){
       _monitor_enter(this);
       if (this.b != null) {
          _monitor_exit(this);
          super.finalize();
          return;
       }else {
          _monitor_exit(this);
          this.d.b(this.c, this.e);
          this.close();
          super.finalize();
          return;
       }
    }
    public synchronized Object j(){
       boolean b = (this.b == null)? true: false;
       e.f(b);
       Object obj = this.c.c();
       e.d(obj);
       return obj;
    }
    public synchronized boolean k(){
       return (this.b ^ 0x01);
    }
}
