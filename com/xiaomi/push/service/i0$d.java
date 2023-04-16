package com.xiaomi.push.service.i0$d;
import java.lang.Object;

public class i0$d	// class@001175
{
    public final Object a;
    public boolean b;
    public long c;
    public i0$b d;
    public int e;
    public long f;

    public void i0$d(){
       this.a = new Object();
    }
    public void a(long p0){
       i0$d ta = this.a;
       _monitor_enter(ta);
       this.f = p0;
       _monitor_exit(ta);
    }
    public boolean b(){
       i0$d ta = this.a;
       _monitor_enter(ta);
       boolean b = (this.b == null && this.c > 0)? true: false;
       this.b = true;
       _monitor_exit(ta);
       return b;
    }
}
