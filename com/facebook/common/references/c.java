package com.facebook.common.references.c;
import com.facebook.common.references.a;
import java.lang.Object;
import fb.c;
import com.facebook.common.references.a$c;
import java.lang.Throwable;
import com.facebook.common.references.SharedReference;
import java.lang.System;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import cb.a;

public class c extends a	// class@00106a
{

    public void c(Object p0,c p1,a$c p2,Throwable p3){
       super(p0, p1, p2, p3);
    }
    public a a(){
       return this;
    }
    public Object clone(){
       return this;
    }
    public void close(){
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
          Object[] objArray = new Object[3];
          objArray[0] = Integer.valueOf(System.identityHashCode(this));
          objArray[1] = Integer.valueOf(System.identityHashCode(this.c));
          obj = (obj == null)? null: obj.getClass().getName();
          objArray[2] = obj;
          a.z("FinalizerCloseableReference", "Finalized without closing: %x %x \(type = %s\)", objArray);
          this.c.a();
          super.finalize();
          return;
       }
    }
}
