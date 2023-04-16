package e3.f;
import android.view.View;
import android.view.ViewGroup;
import android.graphics.Matrix;
import e3.d;
import android.os.Build$VERSION;
import e3.e;
import androidx.transition.GhostViewPort;

public class f	// class@001ee3
{

    public static d a(View p0,ViewGroup p1,Matrix p2){
       if (Build$VERSION.SDK_INT >= 28) {
          return e.b(p0, p1, p2);
       }
       return GhostViewPort.b(p0, p1, p2);
    }
    public static void b(View p0){
       if (Build$VERSION.SDK_INT >= 28) {
          e.f(p0);
       }else {
          GhostViewPort.f(p0);
       }
       return;
    }
}
