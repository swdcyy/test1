package ln9.f;
import erd.g;
import ln9.l;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.framework.KSStore;
import tvc.c;
import nn9.b;
import com.yxcorp.gifshow.component.postlistcomponent.state.ItemLoadingStatus;
import kotlin.jvm.internal.a;
import mn9.a;
import java.lang.Throwable;
import com.yxcorp.gifshow.component.postlistcomponent.SelectScrollOption;
import kn9.o;
import tvc.a;

public final class f implements g	// class@002e22
{
    public final l b;
    public final String c;

    public void f(l p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, f.class, "1")) {
       }else {
          KSStore kSStore = obj.b.a();
          if (kSStore != null) {
             b uob = obj.b.d(obj.c);
             if (uob != null) {
                ItemLoadingStatus iTEM_LOADING = (obj1.intValue() >= 100)? ItemLoadingStatus.ITEM_LOADING_FINISH: ItemLoadingStatus.ITEM_LOADING;
                a.o(obj1, "progress");
                kSStore.a(new o(b.a(uob, null, iTEM_LOADING, 0, false, obj1.intValue(), null, false, false, null, 493, null)));
             }
          }
       }
       return;
    }
}
