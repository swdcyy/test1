package cwa.a;
import qvb.f;
import java.lang.Object;
import brd.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;

public class a extends f	// class@0023eb
{

    public void a(){
       super();
    }
    public boolean B1(Object p0){
       return false;
    }
    public t I1(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.empty();
    }
    public void M1(Object p0,List p1){
    }
}
