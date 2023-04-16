package fsd.k;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import kotlin.jvm.internal.a;
import fsd.k$a;
import java.lang.reflect.Method;
import ssd.e;
import ssd.b;
import java.util.regex.MatchResult;
import zsd.h;
import java.lang.UnsupportedOperationException;
import java.util.List;
import trd.n;
import kotlin.collections.CollectionsKt__CollectionsKt;

public class k	// class@000e67
{

    public void k(){
       super();
    }
    public void a(Throwable p0,Throwable p1){
       Method a;
       a.p(p0, "cause");
       a.p(p1, "exception");
       a = k$a.a;
       if (a != null) {
          Object[] objArray = new Object[]{p1};
          a.invoke(p0, objArray);
       }
       return;
    }
    public e b(){
       return new b();
    }
    public h c(MatchResult p0,String p1){
       a.p(p0, "matchResult");
       a.p(p1, "name");
       throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
    }
    public List d(Throwable p0){
       List list;
       a.p(p0, "exception");
       Method b = k$a.b;
       if (b != null) {
          Object[] objArray = new Object[0];
          p0 = b.invoke(p0, objArray);
          if (p0 != null) {
             list = n.t(p0);
             if (list != null) {
             label_001f :
                return list;
             }
          }
       }
       list = CollectionsKt__CollectionsKt.E();
       goto label_001f ;
    }
}
