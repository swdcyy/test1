package a2.i0$i;
import android.view.View;
import a2.u0;
import android.view.WindowInsets;

public class i0$i	// class@000069
{

    public static u0 a(View p0){
       WindowInsets rootWindowIn = p0.getRootWindowInsets();
       if (rootWindowIn == null) {
          return null;
       }
       u0 ou0 = u0.w(rootWindowIn);
       ou0.t(ou0);
       ou0.d(p0.getRootView());
       return ou0;
    }
}
