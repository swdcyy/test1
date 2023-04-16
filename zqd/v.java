package zqd.v;
import zqd.l;
import io.netty.util.Recycler$e;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;

public abstract class v extends l	// class@002b69
{
    public final Recycler$e d;

    public void v(Recycler$e p0){
       super();
       Objects.requireNonNull(p0, "handle");
       this.d = p0;
    }
    public final void d(){
       super.d();
       this.d.a(this);
    }
}
