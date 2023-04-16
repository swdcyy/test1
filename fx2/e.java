package fx2.e;
import android.view.View$OnClickListener;
import msd.l;
import java.lang.Object;
import android.view.View;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class e implements View$OnClickListener	// class@002a00
{
    public final l b;

    public void e(l p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       a.o(this.b.invoke(p0), "invoke\(...\)");
    }
}
