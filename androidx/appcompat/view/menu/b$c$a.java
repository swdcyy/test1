package androidx.appcompat.view.menu.b$c$a;
import java.lang.Runnable;
import androidx.appcompat.view.menu.b$c;
import androidx.appcompat.view.menu.b$d;
import android.view.MenuItem;
import androidx.appcompat.view.menu.e;
import java.lang.Object;
import androidx.appcompat.view.menu.b;

public class b$c$a implements Runnable	// class@0005a3
{
    public final b$d b;
    public final MenuItem c;
    public final e d;
    public final b$c e;

    public void b$c$a(b$c p0,b$d p1,MenuItem p2,e p3){
       this.e = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void run(){
       b$c$a tb = this.b;
       if (tb != null) {
          this.e.b.B = true;
          boolean b = false;
          tb.b.e(b);
          this.e.b.B = b;
       }
       if (this.c.isEnabled() && this.c.hasSubMenu()) {
          this.d.N(this.c, 4);
       }
       return;
    }
}
