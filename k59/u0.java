package k59.u0;
import androidx.lifecycle.Observer;
import msd.l;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class u0 implements Observer	// class@002b20
{
    public final l b;

    public void u0(l p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       a.o(this.b.invoke(p0), "invoke\(...\)");
    }
}
