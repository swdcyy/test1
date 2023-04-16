package a2.i0$h$a;
import android.view.View$OnApplyWindowInsetsListener;
import android.view.View;
import a2.z;
import java.lang.Object;
import android.view.WindowInsets;
import a2.u0;
import android.os.Build$VERSION;
import a2.i0$h;
import a2.i0;

public class i0$h$a implements View$OnApplyWindowInsetsListener	// class@000067
{
    public u0 b;
    public final View c;
    public final z d;

    public void i0$h$a(View p0,z p1){
       this.c = p0;
       this.d = p1;
       super();
       this.b = null;
    }
    public WindowInsets onApplyWindowInsets(View p0,WindowInsets p1){
       u0 ou0 = u0.x(p1, p0);
       int sDK_INT = Build$VERSION.SDK_INT;
       if (sDK_INT < 30) {
          i0$h.a(p1, this.c);
          if (ou0.equals(this.b)) {
             return this.d.a(p0, ou0).v();
          }
       }
       this.b = ou0;
       u0 ou01 = this.d.a(p0, ou0);
       if (sDK_INT >= 30) {
          return ou01.v();
       }else {
          i0.p0(p0);
          return ou01.v();
       }
    }
}
