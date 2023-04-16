package androidx.appcompat.app.d$c;
import androidx.appcompat.view.menu.j$a;
import androidx.appcompat.app.d;
import java.lang.Object;
import androidx.appcompat.view.menu.e;
import w0.k;
import android.view.Menu;
import android.view.Window$Callback;

public final class d$c implements j$a	// class@00058b
{
    public boolean b;
    public final d c;

    public void d$c(d p0){
       this.c = p0;
       super();
    }
    public void b(e p0,boolean p1){
       if (this.b != null) {
          return;
       }
       this.b = true;
       this.c.d.t();
       d f = this.c.f;
       if (f != null) {
          f.onPanelClosed(108, p0);
       }
       this.b = false;
       return;
    }
    public boolean c(e p0){
       d f = this.c.f;
       if (f == null) {
          return false;
       }
       f.onMenuOpened(108, p0);
       return true;
    }
}
