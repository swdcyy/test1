package com.kuaishou.weapon.ks.c$1;
import java.lang.Runnable;
import com.kuaishou.weapon.ks.c;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.weapon.ks.bs;
import java.lang.Boolean;
import java.io.File;
import com.kuaishou.weapon.ks.b;

public class c$1 implements Runnable	// class@001202
{
    public final c a;

    public void c$1(c p0){
       this.a = p0;
       super();
    }
    public void run(){
       _monitor_enter(c.class);
       if (!bs.a(c.a(this.a))) {
          bs.a(c.b(this.a), c.a(this.a));
          bs.a(c.a(this.a), Boolean.TRUE);
          b.a(new File(c.a(this.a)));
          b.a(new File(c.a(this.a)), new File(c.b(this.a)));
       }
       _monitor_exit(c.class);
       return;
    }
}
