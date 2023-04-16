package bf2.b;
import androidx.lifecycle.Observer;
import msd.l;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class b implements Observer	// class@0003ea
{
    public final l b;

    public void b(l p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       a.o(this.b.invoke(p0), "invoke\(...\)");
    }
}
