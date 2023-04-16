package com.loc.an$1;
import com.loc.ck;
import com.loc.an;
import com.loc.w;
import android.os.Looper;
import com.loc.al;
import android.content.Context;
import com.loc.ao;
import java.lang.Throwable;

public final class an$1 extends ck	// class@00136e
{
    public final w a;
    public final boolean b;
    public final an c;

    public void an$1(an p0,w p1,boolean p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public final void a(){
       Looper mainLooper = Looper.getMainLooper();
       _monitor_enter(mainLooper);
       al.a(this.a);
       _monitor_exit(mainLooper);
       if (this.b != null) {
          ao.a(an.a(this.c));
       }
       return;
    }
}
