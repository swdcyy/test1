package nn9.c;
import mn9.a;
import mn9.b;
import com.yxcorp.gifshow.component.postlistcomponent.state.ItemLoadingStatus;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class c	// class@0031e5
{

    public static final ItemLoadingStatus a(a p0,b p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "item");
       a.p(p1, "dataProvider");
       ItemLoadingStatus iTEM_LOADING = (p1.d(p0))? ItemLoadingStatus.ITEM_LOADING_FINISH: ItemLoadingStatus.IDLE;
       return iTEM_LOADING;
    }
}
