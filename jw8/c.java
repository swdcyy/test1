package jw8.c;
import c35.k;
import c35.c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import jw8.b;

public final class c extends k	// class@0029ba
{

    public void c(){
       super();
    }
    public Object a(c p0,int p1){
       b uob;
       if (PatchProxy.isSupport(c.class)) {
          uob = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, c.class, "1");
          if (uob != PatchProxyResult.class) {
          label_001e :
             return uob;
          }
       }
       uob = new b();
       goto label_001e ;
    }
}
