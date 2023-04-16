package com.loc.ep$2;
import java.lang.Runnable;
import com.loc.ep;
import java.lang.Object;
import android.os.Handler;

public final class ep$2 implements Runnable	// class@001412
{
    public final ep a;

    public void ep$2(ep p0){
       this.a = p0;
       super();
    }
    public final void run(){
       if (ep.b(this.a)) {
          if (ep.c(this.a)) {
             ep.d(this.a);
             ep.e(this.a);
          }
          if (ep.f(this.a) != null) {
             ep.f(this.a).postDelayed(ep.g(this.a), 0xea60);
          }
       }
       return;
    }
}
