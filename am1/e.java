package am1.e;
import yg1.a;
import am1.d;
import java.lang.Object;
import java.lang.String;
import yg1.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.List;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import yh3.a;
import ch1.e;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import ch1.d;
import ul1.d;

public final class e implements a	// class@0000e0
{
    public final d a;

    public void e(d p0){
       this.a = p0;
       super();
    }
    public void a(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "1")) {
       }else {
          a.p(p0, "source");
          a.p(p1, "result");
          List list = p1.c();
          if (list != null) {
             p1 = this.a;
             p1 = p1.r0(p1.u0());
             ArrayList uArrayList = PatchProxy.applyOneRefs(list, null, e.class, "3");
             if (uArrayList != PatchProxyResult.class) {
             }else {
                a.p(list, "$this$toTabDataWrapper");
                uArrayList = new ArrayList(u.Y(list, 10));
                Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                   d uod = iterator.next();
                   uArrayList.add(new d(uod.a(), uod));
                }
             }
             p1.setValue(uArrayList);
          }
       }
       return;
    }
}
