package ln9.g;
import erd.g;
import ln9.l;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import gq.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.v3.framework.KSStore;
import tvc.c;
import nn9.b;
import com.yxcorp.gifshow.component.postlistcomponent.state.ItemLoadingStatus;
import mn9.a;
import com.yxcorp.gifshow.component.postlistcomponent.SelectScrollOption;
import kn9.o;
import tvc.a;

public final class g implements g	// class@002e23
{
    public final l b;
    public final String c;

    public void g(l p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       Object obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, this, g.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          a.D().A("PostListComponentMiddleware", "loadDataItem failed, reason: "+obj.getMessage(), objArray);
          p0 = this.b.a();
          if (p0 != null) {
             b uob = this.b.d(this.c);
             if (uob != null) {
                p0.a(new o(b.a(uob, null, ItemLoadingStatus.ITEM_LOADING_FAILED, 0, false, -1, obj, false, false, null, 461, null)));
             }
          }
       }
       return;
    }
}
