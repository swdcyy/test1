package crd.a;
import crd.b;
import io.reactivex.internal.disposables.a;
import java.lang.Object;
import java.lang.Iterable;
import java.lang.String;
import io.reactivex.internal.functions.a;
import io.reactivex.internal.util.j;
import java.util.Iterator;
import java.lang.Throwable;
import drd.a;
import java.util.ArrayList;
import java.util.List;
import java.lang.RuntimeException;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.exceptions.CompositeException;

public final class a implements b, a	// class@001430
{
    public j b;
    public boolean c;

    public void a(){
       super();
    }
    public void a(Iterable p0){
       super();
       a.c(p0, "resources is null");
       this.b = new j();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          b uob = iterator.next();
          a.c(uob, "Disposable item is null");
          this.b.a(uob);
       }
       return;
    }
    public void a(b[] p0){
       super();
       a.c(p0, "resources is null");
       this.b = new j((p0.length + 1));
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = p0[i];
          a.c(oobject, "Disposable item is null");
          this.b.a(oobject);
       }
       return;
    }
    public boolean a(b p0){
       if (!this.b(p0)) {
          return false;
       }
       p0.dispose();
       return true;
    }
    public boolean b(b p0){
       int i1;
       a.c(p0, "Disposable item is null");
       if (this.c != null) {
          return false;
       }
       _monitor_enter(this);
       if (this.c != null) {
          _monitor_exit(this);
          return false;
       }else {
          a tb = this.b;
          if (tb != null) {
             j e = tb.e;
             j b = tb.b;
             int i = j.b(p0.hashCode()) & b;
             object oobject = e[i];
             if (oobject != null) {
                if (oobject.equals(p0)) {
                   tb.c(i, e, b);
                }else {
                   while (true) {
                      i = i + true;
                      i = i & b;
                      oobject = e[i];
                      if (oobject != null) {
                         if (oobject.equals(p0)) {
                            tb.c(i, e, b);
                         }
                      }
                   }
                   if (i1) {
                      _monitor_exit(this);
                      return true;
                   }
                }
                i1 = 1;
                goto label_0046 ;
             }
             i1 = 0;
             goto label_0046 ;
          }
          _monitor_exit(this);
          return false;
       }
    }
    public boolean c(b p0){
       a.c(p0, "d is null");
       if (this.c == null) {
          _monitor_enter(this);
          if (this.c == null) {
             a tb = this.b;
             if (tb == null) {
                tb = new j();
                this.b = tb;
             }
             tb.a(p0);
             _monitor_exit(this);
             return true;
          }else {
             _monitor_exit(this);
          }
       }
       p0.dispose();
       return false;
    }
    public void d(){
       if (this.c != null) {
          return;
       }
       _monitor_enter(this);
       if (this.c != null) {
          _monitor_exit(this);
          return;
       }else {
          a tb = this.b;
          this.b = null;
          _monitor_exit(this);
          this.e(tb);
          return;
       }
    }
    public void dispose(){
       if (this.c != null) {
          return;
       }
       _monitor_enter(this);
       if (this.c != null) {
          _monitor_exit(this);
          return;
       }else {
          this.c = true;
          a tb = this.b;
          this.b = null;
          _monitor_exit(this);
          this.e(tb);
          return;
       }
    }
    public void e(j p0){
       if (p0 == null) {
          return;
       }
       p0 = p0.e;
       int len = p0.length;
       int i = 0;
       while (i < len) {
          object oobject = p0[i];
          if (oobject instanceof b) {
             oobject.dispose();
          }
          i = i + 1;
       }
       if (null == null) {
          return;
       }
       if (null.size() == 1) {
          throw ExceptionHelper.d(null.get(0));
       }
       throw new CompositeException(null);
    }
    public int f(){
       int i = 0;
       if (this.c != null) {
          return i;
       }
       _monitor_enter(this);
       if (this.c != null) {
          _monitor_exit(this);
          return i;
       }else {
          a tb = this.b;
          if (tb != null) {
             i = tb.c;
          }
          _monitor_exit(this);
          return i;
       }
    }
    public boolean isDisposed(){
       return this.c;
    }
}
