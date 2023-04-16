package ln9.h;
import erd.o;
import ln9.l;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.util.Iterator;
import mn9.a;
import mn9.f;
import com.yxcorp.gifshow.component.postlistcomponent.state.ItemLoadingStatus;
import nn9.b;
import java.lang.Throwable;
import com.yxcorp.gifshow.component.postlistcomponent.SelectScrollOption;
import nsd.u;
import jn9.d;
import java.lang.StringBuilder;
import java.lang.IllegalArgumentException;
import com.yxcorp.gifshow.util.PostUtils;
import brd.t;

public final class h implements o	// class@002e24
{
    public final l b;

    public void h(l p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, h.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          ArrayList uArrayList = new ArrayList();
          p0 = p0.iterator();
          while (p0.hasNext()) {
             Object obj = p0.next();
             ItemLoadingStatus iTEM_LOADING = (f.b(this.b.f, obj, null, 2, null))? ItemLoadingStatus.ITEM_LOADING_FINISH: ItemLoadingStatus.IDLE;
             b uob = new b(obj, iTEM_LOADING, 0, false, 0, null, false, false, null, 508, null);
             if (!this.b.g.a()) {
                uArrayList.add(iTEM_LOADING);
             }else if(!uArrayList.contains(iTEM_LOADING)){
                uArrayList.add(iTEM_LOADING);
             }else {
                PostUtils.D("PostListComponentMiddleware", "loadMoreList returns duplicated item, id="+iTEM_LOADING.b(), new IllegalArgumentException());
             }
          }
          ot = t.just(uArrayList);
       }
       return ot;
    }
}
