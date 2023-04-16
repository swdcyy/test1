package com.tencent.open.utils.j$a;
import java.util.concurrent.Executor;
import java.lang.Object;
import java.util.LinkedList;
import com.tencent.open.utils.j$1;
import java.util.Queue;
import java.lang.Runnable;
import com.tencent.open.utils.j;
import com.tencent.open.utils.j$a$1;

public class j$a implements Executor	// class@000f82
{
    public final Queue a;
    public Runnable b;

    public void j$a(){
       super();
       this.a = new LinkedList();
    }
    public void j$a(j$1 p0){
       super();
    }
    public synchronized void a(){
       Runnable runnable = this.a.poll();
       this.b = runnable;
       if (runnable != null) {
          j.a.execute(runnable);
       }
       return;
    }
    public synchronized void execute(Runnable p0){
       this.a.offer(new j$a$1(this, p0));
       if (this.b == null) {
          this.a();
       }
       return;
    }
}
