package io.reactivex.internal.disposables.b;
import crd.b;
import io.reactivex.internal.disposables.a;
import java.lang.Object;
import java.lang.Iterable;
import java.lang.String;
import io.reactivex.internal.functions.a;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;
import java.lang.Throwable;
import drd.a;
import java.util.ArrayList;
import java.lang.RuntimeException;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.exceptions.CompositeException;

public final class b implements b, a	// class@001826
{
    public List b;
    public boolean c;

    public void b(){
       super();
    }
    public void b(Iterable p0){
       super();
       a.c(p0, "resources is null");
       this.b = new LinkedList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          b uob = iterator.next();
          a.c(uob, "Disposable item is null");
          this.b.add(uob);
       }
       return;
    }
    public void b(b[] p0){
       super();
       a.c(p0, "resources is null");
       this.b = new LinkedList();
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = p0[i];
          a.c(oobject, "Disposable item is null");
          this.b.add(oobject);
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
       a.c(p0, "Disposable item is null");
       if (this.c != null) {
          return false;
       }
       _monitor_enter(this);
       if (this.c != null) {
          _monitor_exit(this);
          return false;
       }else {
          b tb = this.b;
          if (tb == null || !tb.remove(p0)) {
             _monitor_exit(this);
             return false;
          }else {
             _monitor_exit(this);
             return true;
          }
       }
    }
    public boolean c(b p0){
       a.c(p0, "d is null");
       if (this.c == null) {
          _monitor_enter(this);
          if (this.c == null) {
             b tb = this.b;
             if (tb == null) {
                tb = new LinkedList();
                this.b = tb;
             }
             tb.add(p0);
             _monitor_exit(this);
             return true;
          }else {
             _monitor_exit(this);
          }
       }
       p0.dispose();
       return false;
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
          boolean b = true;
          this.c = b;
          b tb = this.b;
          this.b = null;
          _monitor_exit(this);
          if (tb != null) {
             Iterator iterator = tb.iterator();
             while (iterator.hasNext()) {
                iterator.next().dispose();
             }
             if (null != null) {
                if (null.size() == b) {
                   throw ExceptionHelper.d(null.get(0));
                }else {
                   throw new CompositeException(null);
                }
             }
          }
          return;
       }
    }
    public boolean isDisposed(){
       return this.c;
    }
}
