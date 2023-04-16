package gy0.m;
import java.lang.Runnable;
import com.kuaishou.live.audience.component.comments.send.e$d;
import java.lang.Object;
import com.kuaishou.live.audience.component.comments.send.e;
import t02.a0;
import com.kuaishou.live.comments.view.a;

public final class m implements Runnable	// class@0025b0
{
    public final e$d b;

    public void m(e$d p0){
       this.b = p0;
    }
    public final void run(){
       a0 h = this.b.b.r.H;
       if (h != null) {
          h.do(true);
       }
       return;
    }
}
