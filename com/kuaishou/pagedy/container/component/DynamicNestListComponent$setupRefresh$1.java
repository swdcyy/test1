package com.kuaishou.pagedy.container.component.DynamicNestListComponent$setupRefresh$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import ho4.h;
import java.util.Map;
import com.kuaishou.pagedy.container.widget.DynamicNestListContainer;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import su.g$a;
import su.g;
import com.kuaishou.pagedy.PageDy;
import androidx.fragment.app.Fragment;
import com.kuaishou.bowl.core.component.a;
import com.kuaishou.pagedy.container.component.DynamicNestListComponent$setupRefresh$1$a;
import co4.d;

public final class DynamicNestListComponent$setupRefresh$1 extends Lambda implements a	// class@000a56
{
    public final DynamicNestListContainer $nestListContainer;
    public final Map $params;
    public final h this$0;

    public void DynamicNestListComponent$setupRefresh$1(h p0,Map p1,DynamicNestListContainer p2){
       this.this$0 = p0;
       this.$params = p1;
       this.$nestListContainer = p2;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, DynamicNestListComponent$setupRefresh$1.class, "1")) {
          return;
       }
       g$a uoa = new g$a("", "", "");
       uoa.u(this.$params);
       uoa.v(this.this$0.b);
       uoa.l(true);
       uoa.n(true);
       PageDy.e().p(this.this$0.getCurFragment(), uoa.a(), new DynamicNestListComponent$setupRefresh$1$a(this));
       return;
    }
}
