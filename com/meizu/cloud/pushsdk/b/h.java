package com.meizu.cloud.pushsdk.b.h;
import java.lang.Object;
import java.lang.RuntimeException;
import java.lang.String;

public class h	// class@0014b3
{
    public Object a;
    public Object b;

    public void h(Object p0){
       super();
       if (p0 == null) {
          throw new RuntimeException("proxy must be has a default implementation");
       }
       this.b = p0;
       return;
    }
    public Object c(){
       h ta = this.a;
       if (ta != null) {
          return ta;
       }
       return this.b;
    }
}
