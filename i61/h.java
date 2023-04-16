package i61.h;
import java.lang.Runnable;
import i61.j;
import java.lang.Object;
import java.lang.String;

public final class h implements Runnable	// class@00283b
{
    public final j b;

    public void h(j p0){
       this.b = p0;
    }
    public final void run(){
       this.b.f(true, "run loop update");
    }
}
