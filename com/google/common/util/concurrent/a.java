package com.google.common.util.concurrent.a;
import java.lang.Runnable;
import com.google.common.util.concurrent.AbstractFuture$h;
import xk.d;
import java.lang.Object;
import ok.n;
import java.lang.String;
import com.google.common.util.concurrent.AbstractFuture;
import java.lang.StringBuilder;
import com.google.common.util.concurrent.AbstractFuture$c;
import java.util.concurrent.Future;
import com.google.common.util.concurrent.d;
import java.lang.Throwable;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.ExecutionException;

public abstract class a extends AbstractFuture$h implements Runnable	// class@001933
{
    public d i;
    public Object j;
    public static final int k;

    public void a(d p0,Object p1){
       super();
       n.j(p0);
       this.i = p0;
       n.j(p1);
       this.j = p1;
    }
    public String D(){
       a ti = this.i;
       a tj = this.j;
       String str = super.D();
       String str1 = (ti != null)? "inputFuture=["+ti+"], ": "";
       if (tj != null) {
          return str1+"function=["+tj+"]";
       }else if(str != null){
          return str1+str;
       }else {
          return null;
       }
    }
    public abstract Object I(Object p0,Object p1);
    public abstract void J(Object p0);
    public final void q(){
       a ti = this.i;
       boolean b = false;
       int i = (ti != null)? 1: 0;
       if (i & this.isCancelled()) {
          AbstractFuture tb = this.b;
          if (tb instanceof AbstractFuture$c && tb.a != null) {
             b = true;
          }
          ti.cancel(b);
       }
       this.i = null;
       this.j = null;
       return;
    }
    public final void run(){
       a ti = this.i;
       a tj = this.j;
       int b = this.isCancelled();
       int i = 1;
       int i1 = (ti == null)? 1: 0;
       b = b | i1;
       if (tj != null) {
          i = 0;
       }
       if (b | i) {
          return;
       }else {
          this.i = null;
          try{
             Object obj = d.a(ti);
             try{
                this.j = null;
                this.J(this.I(tj, obj));
                return;
             }catch(java.lang.reflect.UndeclaredThrowableException e0){
                this.G(e0.getCause());
                this.j = b;
                return;
             }
          }catch(java.util.concurrent.CancellationException e0){
             this.cancel(0);
             return;
          }catch(java.util.concurrent.ExecutionException e0){
             this.G(e0.getCause());
             return;
          }catch(java.lang.RuntimeException e0){
             this.G(e0);
             return;
          }catch(java.lang.Error e0){
             this.G(e0);
             return;
          }
       }
    }
}
