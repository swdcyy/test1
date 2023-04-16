package bk0.d;
import zj0.v;
import lj0.c;
import java.lang.Throwable;
import java.lang.Object;
import com.kuaishou.krn.log.model.KrnLogCommonParams;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public abstract class d extends v	// class@00039e
{

    public void d(){
       super();
    }
    public static KrnLogCommonParams F(d p0,c p1,Throwable p2,int p3,Object p4){
       return p0.E(p1, null);
    }
    public final KrnLogCommonParams E(c p0,Throwable p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = (p1 != null)? p1.toString(): null;
       return new KrnLogCommonParams(p0, str);
    }
}
