package aegon.chrome.base.task.a;
import java.util.concurrent.Executor;
import java.lang.Object;
import java.lang.Runnable;
import aegon.chrome.base.task.b;
import g0.n;
import aegon.chrome.base.task.PostTask;
import a0.o;
import java.lang.Class;
import java.lang.String;
import K.S;
import java.util.concurrent.atomic.AtomicReferenceArray;
import g0.k;

public final class a implements Executor	// class@000173
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final void execute(Runnable p0){
       n h = n.h;
       if (!PostTask.c || h.f != null) {
          PostTask.f.get(h.d).a(h, p0, 0);
       }else {
          h = h.e();
          o.a(false);
          S.MTILOhAQ(h.a, h.b, h.c, h.d, h.e, p0, 0, p0.getClass().getName());
       }
       return;
    }
}
