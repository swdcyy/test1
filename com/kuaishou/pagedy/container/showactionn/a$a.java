package com.kuaishou.pagedy.container.showactionn.a$a;
import java.lang.Object;
import nsd.u;
import com.kuaishou.bowl.core.component.a;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import hu4.n;
import com.kuaishou.bowl.data.center.data.model.page.PageDyComponentInfo;
import java.util.Map;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import go4.a;
import hu4.f;

public final class a$a	// class@000a61
{

    public void a$a(){
       super();
    }
    public void a$a(u p0){
       super();
    }
    public final View a(a p0,ViewGroup p1){
       n on;
       a obj = PatchProxy.applyTwoRefs(p0, p1, this, a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "component");
       a.p(p1, "viewGroup");
       if (!p0.isTypeNative()) {
          obj = p0.componentData;
          if (obj != null) {
             a.o(obj, "component.componentData");
             on = new n(obj.bundleUrl, obj.getMapParams());
          label_0036 :
             Context context = p1.getContext();
             a.o(context, "viewGroup.context");
             return p0.getView(a.g(context), on, p1, null);
          }
       }
       on = null;
       goto label_0036 ;
    }
}
