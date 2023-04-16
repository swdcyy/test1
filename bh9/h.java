package bh9.h;
import java.lang.Runnable;
import java.lang.Object;
import bh9.r;
import com.yxcorp.gifshow.util.rx.RxBus;
import lm6.j;

public final class h implements Runnable	// class@00049d
{
    public static final h b;

    static {
       h.b = new h();
    }
    public void h(){
       super();
    }
    public final void run(){
       RxBus.f.b(new j(false));
    }
}
