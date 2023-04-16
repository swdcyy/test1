package com.kwai.performance.stability.crash.monitor.anr.d$c;
import com.kwai.performance.stability.crash.monitor.anr.d$d;
import java.lang.Object;
import java.lang.String;
import com.kwai.apm.message.FastUnwindBacktrace;
import java.util.List;

public class d$c implements d$d	// class@0011c3
{
    public long a;
    public Object[] b;
    public String c;
    public FastUnwindBacktrace d;
    public d$d e;
    public ThreadHolder f;
    public boolean g;
    public Message h;
    public long i;
    public long j;
    public long k;
    public long l;
    public long m;

    public void d$c(){
       super();
       this.a = -1;
    }
    public void d$c(String p0){
       super();
       this.a = -1;
       this.c = p0;
    }
    public void d$c(Object[] p0){
       super();
       this.a = -1;
       this.b = p0;
    }
    public void a(long p0,Object[] p1){
       this.b = p1;
       d$c te = this.e;
       if (te != null) {
          te.a(this.a, p1);
       }
       return;
    }
    public void b(long p0){
       this.a = p0;
       d$c te = this.e;
       if (te != null) {
          te.b(p0);
       }
       return;
    }
    public List c(FastUnwindBacktrace p0){
       this.d = p0;
       d$c te = this.e;
       if (te != null) {
          return te.c(p0);
       }
       return null;
    }
    public void d(Object[] p0){
       this.b = p0;
    }
}
