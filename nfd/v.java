package nfd.v;
import androidx.fragment.app.Fragment;
import com.yxcorp.plugin.search.b$a;
import nfd.w;
import com.yxcorp.plugin.search.SearchMode;
import nfd.x$a;
import nfd.x;

public final class v	// class@001e1a
{

    public static void a(Fragment p0,b$a p1){
       while (p0 != null) {
          if (p0 instanceof w) {
             p0.tb(p1);
             break ;
          }else {
             p0 = p0.getParentFragment();
          }
       }
       return;
    }
    public static void b(Fragment p0,SearchMode p1){
       v.c(p0, new x$a(p1).a());
    }
    public static void c(Fragment p0,x p1){
       while (p0 != null) {
          if (p0 instanceof w) {
             p0.c9(p1);
             break ;
          }else {
             p0 = p0.getParentFragment();
          }
       }
       return;
    }
    public static void d(Fragment p0,b$a p1){
       while (p0 != null) {
          if (p0 instanceof w) {
             p0.Wf(p1);
             break ;
          }else {
             p0 = p0.getParentFragment();
          }
       }
       return;
    }
}
