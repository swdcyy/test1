package kx8.g;
import erd.g;
import com.yxcorp.gifshow.activity.web.OperateLazyLoadFragmentContainerNew;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import com.kwai.kds.krn.api.page.router.KwaiRnTab;
import tra.b;
import java.lang.StringBuilder;
import q87.c;

public final class g implements g	// class@002c3d
{
    public final OperateLazyLoadFragmentContainerNew b;

    public void g(OperateLazyLoadFragmentContainerNew p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       g tb = this.b;
       Objects.requireNonNull(tb);
       int i = p0.booleanValue() ^ 0x01;
       if (!PatchProxy.isSupport(OperateLazyLoadFragmentContainerNew.class) || (!PatchProxy.applyVoidOneRefs(Boolean.valueOf(i), tb, OperateLazyLoadFragmentContainerNew.class, "10") && tb.v instanceof KwaiRnTab)) {
          Object[] objArray = new Object[0];
          b.C().w("OperateLazyLoadFragmentContainer", "KwaiRnTab notifyKrnPageObservedPaused: paused="+i, objArray);
          tb.v.eh(i);
       }
       return;
    }
}
