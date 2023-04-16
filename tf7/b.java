package tf7.b;
import tf7.a$a;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import tf7.a;
import java.lang.AssertionError;
import java.lang.StringBuilder;

public final class b implements a$a	// class@002536
{
    public final List a;
    public final int b;

    public void b(List p0,int p1){
       a.q(p0, "mInterceptors");
       super();
       this.a = p0;
       this.b = p1;
    }
    public void a(){
       if (this.b >= this.a.size()) {
          throw new AssertionError("mIndex is overflow: "+this.a.size());
       }
       this.a.get(this.b).a(new b(this.a, (this.b + 1)));
       return;
    }
}
