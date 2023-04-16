package bbc.g;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import ji5.b;

public final class g implements g	// class@00042d
{
    public final g b;

    public void g(g p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       g tb = this.b;
       b.c(p0, "/rest/n/intimate/relation/delete", "intimate");
       if (tb != null) {
          tb.accept(p0);
       }
       return;
    }
}
