package ftd.h3;
import java.lang.String;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import ftd.g3;
import java.lang.StringBuilder;
import java.lang.IllegalArgumentException;
import java.lang.Object;

public final class h3	// class@000e92
{

    public static final ExecutorCoroutineDispatcher a(int p0,String p1){
       int i = 1;
       if (p0 >= i) {
       }else {
          i = 0;
       }
       if (i) {
          return new g3(p0, p1);
       }else {
          throw new IllegalArgumentException("Expected at least one thread, but "+p0+" specified".toString());
       }
    }
    public static final ExecutorCoroutineDispatcher b(String p0){
       return h3.a(1, p0);
    }
}
