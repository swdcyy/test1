package com.facebook.cache.disk.c$b;
import java.lang.Object;

public class c$b	// class@000435
{
    public boolean a;
    public long b;
    public long c;

    public void c$b(){
       super();
       this.a = false;
       this.b = -1;
       this.c = -1;
    }
    public synchronized long a(){
       return this.c;
    }
    public synchronized long b(){
       return this.b;
    }
    public synchronized void c(long p0,long p1){
       if (this.a != null) {
          this.b = this.b + p0;
          this.c = this.c + p1;
       }
       return;
    }
    public synchronized void d(){
       this.a = false;
       this.c = -1;
       this.b = -1;
    }
}
