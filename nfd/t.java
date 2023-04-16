package nfd.t;
import androidx.fragment.app.Fragment;
import w7d.e;
import nfd.u;

public final class t	// class@001e0f
{

    public static void a(Fragment p0,e p1){
       while (p0 != null) {
          if (p0 instanceof u) {
             p0.qa(p1);
             break ;
          }else {
             p0 = p0.getParentFragment();
          }
       }
       return;
    }
}
