package e31.j;
import z61.a;
import z61.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import e31.i;

public class j extends a	// class@00209c
{
    public e b;

    public void j(){
       super();
    }
    public c getViewItemInstanceFactory(){
       Object obj = PatchProxy.apply(null, this, j.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return i.a;
    }
}
