package cm2.l;
import android.view.View$OnClickListener;
import cm2.p;
import java.lang.Object;
import android.view.View;
import cm2.p$b;

public final class l implements View$OnClickListener	// class@000563
{
    public final p b;

    public void l(p p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       p j = this.b.J;
       if (j != null) {
          j.d();
       }
       return;
    }
}
