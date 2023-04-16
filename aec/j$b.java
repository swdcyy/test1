package aec.j$b;
import erd.r;
import aec.j;
import kotlin.jvm.internal.Ref$BooleanRef;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class j$b implements r	// class@000105
{
    public final j b;
    public final Ref$BooleanRef c;

    public void j$b(j p0,Ref$BooleanRef p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, j$b.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "it");
          b = (j.R8(this.b).Vg().e() && (this.c.element != null && j.R8(this.b).Vg().c()))? true: false;
       }
       return b;
    }
}
