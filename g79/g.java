package g79.g;
import erd.o;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.models.QMedia;

public final class g implements o	// class@002431
{
    public static final g b;

    static {
       g.b = new g();
    }
    public void g(){
       super();
    }
    public Object apply(Object p0){
       ArrayList uArrayList = PatchProxy.applyOneRefs(p0, this, g.class, "1");
       if (uArrayList != PatchProxyResult.class) {
       }else {
          a.q(p0, "it");
          uArrayList = new ArrayList();
          p0 = p0.iterator();
          while (p0.hasNext()) {
             Object obj = p0.next();
             if (obj instanceof QMedia) {
                uArrayList.add(obj);
             }
          }
       }
       return uArrayList;
    }
}
