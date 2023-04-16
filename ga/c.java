package ga.c;
import android.view.View$OnClickListener;
import ga.k;
import java.lang.Object;
import android.view.View;
import ga.l$f;
import ga.l;

public final class c implements View$OnClickListener	// class@00205a
{
    public final k b;

    public void c(k p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       c tb = this.b;
       if (tb.f.d() != null) {
          tb.f.d().a();
       }
       return;
    }
}
