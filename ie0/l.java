package ie0.l;
import java.util.concurrent.Callable;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.growth.pendant.core.manager.f$a;
import com.kuaishou.growth.pendant.core.manager.f;

public final class l implements Callable	// class@0028ab
{
    public final String b;
    public final String c;

    public void l(String p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object call(){
       return f.c(this.b, this.c);
    }
}
