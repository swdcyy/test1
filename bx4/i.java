package bx4.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.System;

public class i	// class@0003e9
{
    public String a;
    public long b;
    public long c;
    public long d;
    public long e;
    public boolean f;

    public void i(){
       super();
       this.a = "";
       this.f = false;
    }
    public long a(){
       return this.d;
    }
    public long b(){
       return this.b;
    }
    public long c(){
       return this.e;
    }
    public long d(){
       return this.c;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, i.class, "1")) {
          return;
       }
       this.b = System.currentTimeMillis();
       return;
    }
    public void f(String p0){
       this.a = p0;
    }
}
