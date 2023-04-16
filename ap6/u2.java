package ap6.u2;
import erd.o;
import java.util.List;
import java.lang.Object;
import com.kwai.imsdk.group.g;

public final class u2 implements o	// class@000378
{
    public final List b;

    public void u2(List p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       return g.W(this.b, 20);
    }
}
