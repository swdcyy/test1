package mg.n4;
import erd.g;
import com.feature.post.bridge.b1;
import f55.g;
import java.lang.Object;
import java.lang.Integer;
import java.util.Objects;
import com.kwai.yoda.function.FunctionResultParams;
import java.lang.String;
import mg.r1;

public final class n4 implements g	// class@002640
{
    public final b1 b;
    public final g c;

    public void n4(b1 p0,g p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       n4 tb = this.b;
       n4 tc = this.c;
       Objects.requireNonNull(tb);
       if (p0.intValue() == 1) {
          if (tc != null) {
             p0 = new FunctionResultParams();
             p0.mResult = 1;
             tc.onSuccess(p0);
          }
       }else {
          tb.b(tc, p0.intValue(), "");
       }
       return;
    }
}
