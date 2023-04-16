package androidx.appcompat.widget.ActionMenuPresenter$c;
import java.lang.Runnable;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.ActionMenuPresenter$d;
import java.lang.Object;
import androidx.appcompat.view.menu.a;
import androidx.appcompat.view.menu.e;
import android.view.View;
import android.os.IBinder;
import androidx.appcompat.view.menu.i;

public class ActionMenuPresenter$c implements Runnable	// class@0005cc
{
    public ActionMenuPresenter$d b;
    public final ActionMenuPresenter c;

    public void ActionMenuPresenter$c(ActionMenuPresenter p0,ActionMenuPresenter$d p1){
       this.c = p0;
       super();
       this.b = p1;
    }
    public void run(){
       a d = this.c.d;
       if (d != null) {
          d.d();
       }
       d = this.c.j;
       if (d != null && (d.getWindowToken() != null && this.b.l())) {
          this.c.z = this.b;
       }
    label_0025 :
       this.c.B = null;
       return;
    }
}
