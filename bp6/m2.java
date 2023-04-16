package bp6.m2;
import erd.g;
import qo6.k1;
import java.lang.Object;

public class m2 implements g	// class@00053a
{
    public k1 b;

    public void m2(k1 p0){
       super();
       this.b = p0;
    }
    public void accept(Object p0){
       m2 tb = this.b;
       if (tb != null) {
          tb.b(p0);
       }
       return;
    }
}
