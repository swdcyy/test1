package fr1.b$b;
import androidx.lifecycle.Observer;
import fr1.b;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.util.DateUtils;
import dr1.a;
import dr1.a$a;
import er1.a;

public final class b$b implements Observer	// class@00238b
{
    public final b b;

    public void b$b(b p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "1")) {
       }else {
          a.o(p0, "it");
          p0 = DateUtils.v(p0.longValue());
          a.o(p0, "DateUtils.getMSDuration\(it\)");
          this.b.u0(R.string.arg_RES_7f1025b4, null, p0, a.f.b());
       }
       return;
    }
}
