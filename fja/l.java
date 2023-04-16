package fja.l;
import java.lang.Object;
import rja.c;
import qvb.i;
import ok.x;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import fja.j;

public final class l	// class@002957
{

    public void l(){
       super();
    }
    public static x a(c p0,i p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, l.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new j(p1, p0);
    }
}
