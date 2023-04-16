package kx8.i;
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
import isa.a;

public final class i implements g	// class@002c3f
{
    public final OperateLazyLoadFragmentContainerNew b;

    public void i(OperateLazyLoadFragmentContainerNew p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       i tb = this.b;
       Objects.requireNonNull(tb);
       boolean b = p0.booleanValue();
       if (!PatchProxy.isSupport(OperateLazyLoadFragmentContainerNew.class) || (!PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), tb, OperateLazyLoadFragmentContainerNew.class, "16") && tb.v instanceof KwaiRnTab)) {
          Object[] objArray1 = new Object[false];
          b.C().w("OperateLazyLoadFragmentContainer", "KwaiRnTab notifyKrnPageState: selected="+b, objArray1);
          if (b) {
             tb.v.A();
          }else {
             tb.v.m0();
          }
       }
       if (p0.booleanValue() && (tb.x != null && tb.u != null)) {
          tb.x = false;
          Object[] objArray = new Object[false];
          b.C().w("OperateLazyLoadFragmentContainer", "replaceFragmentWhenSelected", objArray);
          tb.oh(tb.u);
       }
    label_0079 :
       return;
    }
}
