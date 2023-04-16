package nfd.j2;
import java.lang.Object;
import androidx.fragment.app.Fragment;
import fl8.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.search.navigation.NavigationContainerFragment;
import il8.c;
import com.yxcorp.plugin.search.SearchMode;
import el8.c;
import nfd.s0;
import el8.d;

public final class j2	// class@001dbf
{

    public void j2(){
       super();
    }
    public static c a(Fragment p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, j2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       while (true) {
          if (p0 == null) {
             return null;
          }
          if (p0 instanceof NavigationContainerFragment) {
             break ;
          }else {
             p0 = p0.getParentFragment();
          }
       }
       return p0.j;
    }
    public static Object b(Fragment p0){
       Object obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, j2.class, "2");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       c uoc = j2.c(p0);
       if (uoc != null) {
          obj = uoc.b();
       }
       return obj;
    }
    public static c c(Fragment p0){
       c uoc = null;
       Object obj = PatchProxy.applyOneRefs(p0, uoc, j2.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       c uoc1 = j2.a(p0);
       if (uoc1 != null) {
          uoc = uoc1.p();
       }
       return uoc;
    }
    public static SearchMode d(Fragment p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, j2.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       c uoc = j2.c(p0);
       if (uoc == null) {
          return null;
       }
       return uoc.a().d;
    }
    public static void e(Fragment p0,d p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, j2.class, "5")) {
          return;
       }
       c uoc = j2.a(p0);
       if (uoc != null) {
          uoc.e(p1);
       }
       return;
    }
}
