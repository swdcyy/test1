package n0.e$e;
import java.lang.Runnable;
import n0.e$b;
import n0.e;
import java.lang.CharSequence;
import android.text.Layout;
import android.graphics.Canvas;
import java.util.Set;
import java.util.Iterator;
import java.lang.Object;
import n0.e$d;

public class e$e implements Runnable	// class@0026ae
{
    public CharSequence b;
    public e c;
    public Layout d;
    public boolean e;

    public void run(){
       if (this.e != null) {
          return;
       }
       Layout layout = this.c.b().a(this.b);
       this.d = layout;
       if (layout != null) {
          layout.draw(this.c.a);
          Iterator iterator = this.c.a().iterator();
          while (iterator.hasNext()) {
             iterator.next().a(this.b, this);
          }
       }
       return;
    }
}
