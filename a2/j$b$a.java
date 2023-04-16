package a2.j$b$a;
import android.view.View$OnApplyWindowInsetsListener;
import android.view.View;
import a2.i;
import java.lang.Object;
import android.view.WindowInsets;
import a2.l;
import android.os.Build$VERSION;
import a2.j$b;
import a2.j;

public class j$b$a implements View$OnApplyWindowInsetsListener	// class@000071
{
    public l b;
    public final View c;
    public final i d;

    public void j$b$a(View p0,i p1){
       this.c = p0;
       this.d = p1;
       super();
       this.b = null;
    }
    public WindowInsets onApplyWindowInsets(View p0,WindowInsets p1){
       l ol = l.o(p1, p0);
       int sDK_INT = Build$VERSION.SDK_INT;
       if (sDK_INT < 30) {
          j$b.a(p1, this.c);
          if (ol.equals(this.b)) {
             return this.d.a(p0, ol).m();
          }
       }
       this.b = ol;
       l ol1 = this.d.a(p0, ol);
       if (sDK_INT >= 30) {
          return ol1.m();
       }else {
          j.b(p0);
          return ol1.m();
       }
    }
}
