package com.loc.d$b;
import android.os.HandlerThread;
import java.lang.String;
import com.loc.d;
import com.loc.j;
import android.content.Context;
import com.loc.fn;
import com.loc.fi;

public final class d$b extends HandlerThread	// class@0013d7
{
    public d a;

    public void d$b(String p0,d p1){
       super(p0);
       this.a = null;
       this.a = p1;
    }
    public final void onLooperPrepared(){
       this.a.j.a();
       fn.a(d.c(this.a));
       d.d(this.a);
       d$b ta = this.a;
       if (ta != null && d.c(ta) != null) {
          fi.b(d.c(this.a));
          fi.a(d.c(this.a));
       }
       super.onLooperPrepared();
       return;
    }
    public final void run(){
       super.run();
    }
}
