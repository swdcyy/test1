package a2.q0;
import android.view.Window;
import android.view.View;
import a2.v0;
import android.os.Build$VERSION;
import a2.q0$a;

public final class q0	// class@000097
{

    public static v0 a(Window p0,View p1){
       if (Build$VERSION.SDK_INT >= 30) {
          return q0$a.a(p0);
       }
       return new v0(p0, p1);
    }
}
