package com.facebook.common.references.b;
import com.facebook.common.references.a;
import com.facebook.common.references.SharedReference;
import com.facebook.common.references.a$c;
import java.lang.Throwable;
import java.lang.Object;
import fb.c;
import ab.e;
import java.lang.System;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import cb.a;

public class b extends a	// class@001069
{

    public void b(SharedReference p0,a$c p1,Throwable p2){
       super(p0, p1, p2);
    }
    public void b(Object p0,c p1,a$c p2,Throwable p3){
       super(p0, p1, p2, p3);
    }
    public a a(){
       e.f(this.k());
       a tc = this.c;
       a td = this.d;
       Throwable throwable = (this.e != null)? new Throwable(this.e): null;
       return new b(tc, td, throwable);
    }
    public Object clone(){
       return this.a();
    }
    public void finalize(){
       String name;
       _monitor_enter(this);
       if (this.b != null) {
          _monitor_exit(this);
          super.finalize();
          return;
       }else {
          _monitor_exit(this);
          object obj = this.c.c();
          String str = "DefaultCloseableReference";
          String str1 = "Finalized without closing: %x %x \(type = %s\)";
          Object[] objArray = new Object[3];
          objArray[0] = Integer.valueOf(System.identityHashCode(this));
          objArray[1] = Integer.valueOf(System.identityHashCode(this.c));
          obj = (obj == null)? null: obj.getClass().getName();
          objArray[2] = obj;
          a.z(str, str1, objArray);
          this.d.b(this.c, this.e);
          this.close();
          super.finalize();
          return;
       }
    }
}
