package bq1.a$a;
import androidx.lifecycle.Observer;
import bq1.a;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class a$a implements Observer	// class@0003db
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
          this.b.O3(p0.booleanValue());
       }
       return;
    }
}
