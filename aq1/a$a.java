package aq1.a$a;
import androidx.lifecycle.Observer;
import aq1.a;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class a$a implements Observer	// class@00027a
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
       }else {
          a.o(p0, "it");
          this.b.I3(p0.booleanValue());
       }
       return;
    }
}
