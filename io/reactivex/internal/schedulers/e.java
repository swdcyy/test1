package io.reactivex.internal.schedulers.e;
import brd.z;
import java.lang.String;
import java.lang.Integer;
import java.lang.Math;
import io.reactivex.internal.schedulers.RxThreadFactory;
import java.util.concurrent.ThreadFactory;
import brd.z$c;
import io.reactivex.internal.schedulers.f;

public final class e extends z	// class@00193e
{
    public final ThreadFactory b;
    public static final RxThreadFactory c;

    static {
       e.c = new RxThreadFactory("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));
    }
    public void e(){
       super(e.c);
    }
    public void e(ThreadFactory p0){
       super();
       this.b = p0;
    }
    public z$c b(){
       return new f(this.b);
    }
}
