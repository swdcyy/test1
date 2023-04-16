package bp6.m1;
import java.util.concurrent.Callable;
import com.kwai.imsdk.internal.v;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import bp6.f2;
import com.kwai.imsdk.profile.a;
import java.util.Map;

public final class m1 implements Callable	// class@000539
{
    public final v b;
    public final List c;
    public final int d;

    public void m1(v p0,List p1,int p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object call(){
       return a.k(f2.a(this.b.a).a).l(this.c, this.d);
    }
}
