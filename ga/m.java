package ga.m;
import android.content.DialogInterface$OnDismissListener;
import ga.l;
import java.lang.Object;
import android.content.DialogInterface;
import ea.c;

public class m implements DialogInterface$OnDismissListener	// class@002078
{
    public final l b;

    public void m(l p0){
       this.b = p0;
       super();
    }
    public void onDismiss(DialogInterface p0){
       m tb = this.b;
       l g = tb.g;
       if (g != null) {
          g.a(tb);
       }
       return;
    }
}
