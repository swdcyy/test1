package com.loc.bd$2;
import java.util.concurrent.Callable;
import com.loc.bd;
import java.lang.Object;
import java.lang.Void;
import java.io.Writer;

public final class bd$2 implements Callable	// class@001384
{
    public final bd a;

    public void bd$2(bd p0){
       this.a = p0;
       super();
    }
    public final Void a(){
       bd$2 ta = this.a;
       _monitor_enter(ta);
       if (bd.a(this.a) == null) {
          _monitor_exit(ta);
          return null;
       }else {
          bd.b(this.a);
          if (bd.c(this.a)) {
             bd.d(this.a);
             bd.e(this.a);
          }
          _monitor_exit(ta);
          return null;
       }
    }
    public final Object call(){
       return this.a();
    }
}
