package com.loc.ev$1;
import java.lang.Runnable;
import com.loc.ev;
import java.lang.Object;
import android.os.Handler;

public final class ev$1 implements Runnable	// class@00141c
{
    public final ev a;

    public void ev$1(ev p0){
       this.a = p0;
       super();
    }
    public final void run(){
       if (!ev.a(this.a)) {
          if (ev.b(this.a)) {
             ev.c(this.a);
             ev.d(this.a);
          }
          if (ev.e(this.a) != null) {
             ev.e(this.a).postDelayed(ev.f(this.a), 0xea60);
          }
       }
       return;
    }
}
