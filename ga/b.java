package ga.b;
import android.content.DialogInterface$OnDismissListener;
import ga.a;
import java.lang.Object;
import android.content.DialogInterface;
import ea.c;

public class b implements DialogInterface$OnDismissListener	// class@002058
{
    public final a b;

    public void b(a p0){
       this.b = p0;
       super();
    }
    public void onDismiss(DialogInterface p0){
       b tb = this.b;
       a g = tb.g;
       if (g != null) {
          g.a(tb);
       }
       return;
    }
}
