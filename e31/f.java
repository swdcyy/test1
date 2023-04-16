package e31.f;
import java.lang.Runnable;
import e31.h;
import java.lang.Object;

public final class f implements Runnable	// class@002096
{
    public final h b;
    public final int c;

    public void f(h p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.b.c(this.c);
    }
}
