package dx8.a$b;
import erd.g;
import dx8.a;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import f66.i;
import jq.a;
import q87.c;
import e17.i;

public final class a$b implements g	// class@0020f1
{
    public final a b;

    public void a$b(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       Object[] objArray;
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
       }else {
          a.o(p0, "it");
          int i = 0;
          if (p0.booleanValue()) {
             p0 = this.b;
             Objects.requireNonNull(p0);
             if (!PatchProxy.applyVoid(null, p0, a.class, "2")) {
                objArray = new Object[i];
                a.b().w("ShareActivityLifecycleCallbacksAdapter", "show Toast", objArray);
                i.a(R.style.arg_RES_7f110669, 0x7f1043d8);
             }
          }else {
             objArray = new Object[i];
             a.b().w("ShareActivityLifecycleCallbacksAdapter", "draft is invalid", objArray);
             a.o(i.a(R.style.arg_RES_7f11066a, 0x7f100ad0), "KSToast.applyStyle\(R.sty¡­tring.draft_no_space_tip\)");
          }
       }
       return;
    }
}
