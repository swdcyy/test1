package com.yxcorp.gifshow.util.resource.b;
import com.yxcorp.gifshow.util.resource.f$c;
import java.util.Map;
import java.lang.Object;
import com.yxcorp.gifshow.util.resource.c;
import android.os.SystemClock;

public class b implements f$c	// class@000cdd
{
    public final Map a;

    public void b(Map p0){
       this.a = p0;
       super();
    }
    public void a(){
       c.a(2, true, this.a);
    }
    public void b(){
       c.a(9, true, this.a);
    }
    public void c(){
       c.a = 0;
    }
    public void onShow(){
       c.a = SystemClock.elapsedRealtime();
       c.a(1, false, this.a);
    }
}
