package cb8.d;
import java.lang.Runnable;
import cb8.f;
import java.lang.Object;
import java.util.Objects;
import fc8.i;
import fc8.c;
import zi8.m1;
import java.lang.Integer;
import java.lang.String;
import fc8.g;

public final class d implements Runnable	// class@0003dc
{
    public final f b;
    public final int c;

    public void d(f p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       d tb = this.b;
       Objects.requireNonNull(tb);
       i oi = c.e();
       oi.c("height", Integer.valueOf(m1.u((float)this.c)));
       tb.e.b(oi.k());
       oi.d();
    }
}
