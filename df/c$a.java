package df.c$a;
import java.util.Comparator;
import java.lang.Object;
import df.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public final class c$a implements Comparator	// class@001e4c
{

    public void c$a(){
       super();
    }
    public int compare(Object p0,Object p1){
       int i;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, c$a.class, "1");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else if(p0 == null && p1 == null){
          if (p0 != null) {
             if (p1 != null) {
                if (v5 = p0.f() - p1.f()) {
                   if (v5 >= 0) {
                   }
                }
             }
          }
          i = -1;
       }
       i = 0;
       return i;
    }
}
