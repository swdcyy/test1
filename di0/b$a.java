package di0.b$a;
import java.lang.Object;
import nsd.u;
import di0.b;
import msd.p;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.kotlin.livedata.ListHolder;
import di0.b$a$a;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.MediatorLiveData;

public final class b$a	// class@001fa1
{

    public void b$a(){
       super();
    }
    public void b$a(u p0){
       super();
    }
    public final b a(b p0,p p1){
       b obj = PatchProxy.applyTwoRefs(p0, p1, this, b$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "source");
       a.p(p1, "mapFunction");
       obj = new b(null, 1, null);
       obj.addSource(p0, new b$a$a(obj, p1));
       return obj;
    }
}
