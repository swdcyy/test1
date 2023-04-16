package ktd.e;
import java.lang.ArithmeticException;
import java.lang.String;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import jtd.e;

public final class e	// class@001bdb
{

    public static final int a(int p0){
       if (p0 >= 0) {
          return p0;
       }
       throw new ArithmeticException("Index overflow has happened");
    }
    public static final void b(AbortFlowException p0,e p1){
       if (p0.getOwner() == p1) {
          return;
       }
       throw p0;
    }
}
