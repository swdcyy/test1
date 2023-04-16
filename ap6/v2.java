package ap6.v2;
import erd.o;
import java.util.List;
import java.lang.Object;
import com.kwai.imsdk.group.g;

public final class v2 implements o	// class@00037c
{
    public final List b;

    public void v2(List p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       return g.W(this.b, 20);
    }
}
