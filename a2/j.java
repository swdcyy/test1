package a2.j;
import android.view.View;
import a2.l;
import android.os.Build$VERSION;
import a2.j$c;
import a2.j$b;
import a2.j$a;
import a2.i;

public class j	// class@000075
{

    public static l a(View p0){
       if (Build$VERSION.SDK_INT >= 23) {
          return j$c.a(p0);
       }
       return j$b.b(p0);
    }
    public static void b(View p0){
       j$a.a(p0);
    }
    public static void c(View p0,i p1){
       j$b.c(p0, p1);
    }
}
