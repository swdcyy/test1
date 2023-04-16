package ap6.a3;
import java.util.concurrent.Callable;
import com.kwai.imsdk.group.g;
import java.lang.String;
import java.lang.Object;
import dp6.b;
import hp6.b;

public final class a3 implements Callable	// class@000316
{
    public final g b;
    public final String c;

    public void a3(g p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object call(){
       return b.i(this.b.c).j(this.c);
    }
}
