package ga.d;
import android.view.View$OnClickListener;
import ga.k;
import java.lang.Object;
import android.view.View;
import ga.l$f;
import ga.l;

public final class d implements View$OnClickListener	// class@00205d
{
    public final k b;

    public void d(k p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       d tb = this.b;
       if (tb.f.d() != null) {
          tb.f.d().b();
       }
       return;
    }
}
