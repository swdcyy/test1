package a2.j$c;
import android.view.View;
import a2.l;
import android.view.WindowInsets;

public class j$c	// class@000073
{

    public static l a(View p0){
       WindowInsets rootWindowIn = p0.getRootWindowInsets();
       if (rootWindowIn == null) {
          return null;
       }
       l ol = l.n(rootWindowIn);
       ol.k(ol);
       ol.d(p0.getRootView());
       return ol;
    }
}
