package eh0.a;
import erd.a;
import com.kuaishou.house.live.prerequest.a;
import java.lang.Object;
import java.lang.System;
import com.kuaishou.house.live.prerequest.a$b;
import mrd.a;

public final class a implements a	// class@00215c
{
    public final a b;

    public void a(a p0){
       this.b = p0;
    }
    public final void run(){
       a tb = this.b;
       tb.w.c = System.currentTimeMillis();
       tb.t.onNext(tb.w);
    }
}
