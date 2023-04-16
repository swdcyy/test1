package com.yxcorp.gifshow.util.audiorecord.b$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.util.audiorecord.b;
import java.lang.Object;
import java.lang.System;
import com.yxcorp.gifshow.util.audiorecord.b$b;

public class b$a implements Runnable	// class@001f50
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public void run(){
       b$a tb = this.b;
       this.b.e = System.currentTimeMillis() - tb.d;
       b c = tb.c;
       if (c != null) {
          c.a(tb.e);
       }
       c = this.b.g;
       _monitor_enter(c);
       b$a tb1 = this.b;
       tb1.k = true;
       tb1.g.notify();
       _monitor_exit(c);
       return;
    }
}
