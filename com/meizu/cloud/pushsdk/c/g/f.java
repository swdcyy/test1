package com.meizu.cloud.pushsdk.c.g.f;
import com.meizu.cloud.pushsdk.c.g.l;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import java.lang.String;
import com.meizu.cloud.pushsdk.c.g.b;
import java.lang.StringBuilder;
import java.lang.Class;

public abstract class f implements l	// class@0014ef
{
    public final l a;

    public void f(l p0){
       super();
       if (p0 == null) {
          throw new IllegalArgumentException("delegate == null");
       }
       this.a = p0;
       return;
    }
    public void a(b p0,long p1){
       this.a.a(p0, p1);
    }
    public void close(){
       this.a.close();
    }
    public void flush(){
       this.a.flush();
    }
    public String toString(){
       return this.getClass().getSimpleName()+"\("+this.a.toString()+"\)";
    }
}
