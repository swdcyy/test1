package eca.d;
import java.lang.Runnable;
import eca.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ProgressBar;
import faa.a;
import q87.c;

public final class d implements Runnable	// class@002109
{
    public final e b;

    public void d(e p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       if (this.b.i.getVisibility() == 4) {
          this.b.i.setVisibility(0);
          Object[] objArray = new Object[0];
          a.D().s("VideoTemplateItemHolder", "showProgressBarLaterIfNeed: its time to show", objArray);
       }
       return;
    }
}
