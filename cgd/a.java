package cgd.a;
import java.util.Comparator;
import java.lang.Object;
import bgd.a;
import java.lang.String;
import com.kwai.framework.cache.a;
import java.util.List;

public final class a implements Comparator	// class@00031d
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final int compare(Object p0,Object p1){
       String str = p0.c();
       String str1 = p1.c();
       List n = a.n;
       int i = -1;
       int i1 = 1;
       if (n.contains(str) && n.contains(str1)) {
          if ((p1.d() - p0.d()) > 0) {
          label_006d :
             i = 1;
          }
       }else if(n.contains(str1) || (p0.c()).equals(a.m)){
       label_006f :
          return i1;
       }else if((p1.c()).equals(a.m) || n.contains(str)){
          if (!p1.d() - p0.d()) {
             i1 = 0;
             goto label_006f ;
          }else if((p1.d() - p0.d()) > 0){
             goto label_006d ;
          }
       }
       i1 = i;
       goto label_006f ;
    }
}
