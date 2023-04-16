package ad9.b;
import erd.g;
import ad9.i;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Integer;

public final class b implements g	// class@000099
{
    public final i b;
    public final Runnable c;

    public void b(i p0,Runnable p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       b tc = this.c;
       this.b.c(true);
       if (tc != null) {
          tc.run();
       }
       return;
    }
}
