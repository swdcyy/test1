package ad9.h;
import java.lang.Runnable;
import ad9.i;
import java.lang.Object;
import java.util.Objects;

public final class h implements Runnable	// class@00009f
{
    public final i b;
    public final boolean c;
    public final Runnable d;
    public final long e;

    public void h(i p0,boolean p1,Runnable p2,long p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void run(){
       h tb = this.b;
       h td = this.d;
       h te = this.e;
       Objects.requireNonNull(tb);
       if (this.c != null) {
          tb.i(td, te);
       }
       return;
    }
}
