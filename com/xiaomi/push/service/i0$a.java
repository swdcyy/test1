package com.xiaomi.push.service.i0$a;
import com.xiaomi.push.service.i0$c;
import java.lang.Object;

public final class i0$a	// class@001171
{
    public final i0$c a;

    public void i0$a(i0$c p0){
       this.a = p0;
    }
    public void finalize(){
       i0$a ta = this.a;
       _monitor_enter(ta);
       i0$c.g(this.a, true);
       this.a.notify();
       _monitor_exit(ta);
       super.finalize();
    }
}
