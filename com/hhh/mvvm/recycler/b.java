package com.hhh.mvvm.recycler.b;
import java.lang.Runnable;
import com.hhh.mvvm.recycler.c;
import java.lang.Object;
import java.util.Objects;
import android.os.HandlerThread;
import java.lang.String;
import android.os.Handler;
import android.os.Looper;
import fm.e;

public final class b implements Runnable	// class@000568
{
    public final c b;
    public final Object c;

    public void b(c p0,Object p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       b tb = this.b;
       b tc = this.c;
       Objects.requireNonNull(tb);
       if (c.l == null) {
          HandlerThread handlerThrea = new HandlerThread("mini_app_mvvm");
          handlerThrea.start();
          c.l = new Handler(handlerThrea.getLooper());
       }
       c.l.post(new e(tb, tc));
       return;
    }
}
