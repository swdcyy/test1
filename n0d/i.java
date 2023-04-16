package n0d.i;
import pb.f;
import android.content.res.Resources;
import tb.a;
import zc.a;
import java.util.concurrent.Executor;
import tc.v;
import com.facebook.common.internal.ImmutableList;
import pb.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import n0d.f;

public final class i extends f	// class@001efd
{
    public final int h;

    public void i(){
       super(0);
    }
    public void i(int p0){
       super();
       this.h = p0;
    }
    public c b(Resources p0,a p1,a p2,Executor p3,v p4,ImmutableList p5){
       i oi = i.class;
       if (PatchProxy.isSupport(oi)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          f uof = PatchProxy.apply(objArray, this, oi, "1");
          if (uof != PatchProxyResult.class) {
          label_0038 :
             return uof;
          }
       }
       f uof1 = new f(p0, p1, p2, p3, p4, p5, this.h);
       goto label_0038 ;
    }
}
