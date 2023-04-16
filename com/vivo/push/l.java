package com.vivo.push.l;
import java.lang.Runnable;
import com.vivo.push.o;
import java.lang.Object;
import com.vivo.push.e;
import android.content.Context;
import java.lang.IllegalArgumentException;
import java.lang.String;
import com.vivo.push.b.n;
import java.lang.StringBuilder;
import com.vivo.push.util.p;
import java.lang.Class;

public abstract class l implements Runnable	// class@001086
{
    public Context a;
    public int b;
    public o c;

    public void l(o p0){
       super();
       this.b = -1;
       this.c = p0;
       int i = p0.b();
       this.b = i;
       if (i < 0) {
          throw new IllegalArgumentException("PushTask need a > 0 task id.");
       }
       this.a = e.a().h();
       return;
    }
    public final int a(){
       return this.b;
    }
    public abstract void a(o p0);
    public final void run(){
       l ta = this.a;
       if (ta != null && !this.c instanceof n) {
          p.a(ta, "[÷¥––÷∏¡Ó]"+this.c);
       }
       this.a(this.c);
       return;
    }
    public String toString(){
       StringBuilder str = this.getClass().getSimpleName()+"{";
       l tc = this.c;
       String str1 = (tc == null)? "[null]": tc.toString();
       return str+str1+"}";
    }
}
