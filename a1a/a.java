package a1a.a;
import yw6.j;
import java.util.List;
import qvb.i;
import ok.o;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import yw6.g;

public class a extends j	// class@00000c
{

    public void a(List p0,i p1,o p2,boolean p3){
       super(p0, p1, p2, p3);
    }
    public boolean i(){
       g obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.g;
       if (obj != null) {
          return obj.i();
       }
       return false;
    }
}
