package a2.k;
import android.view.Window;
import android.os.Build$VERSION;
import a2.k$b;
import a2.k$a;

public class k	// class@000079
{

    public static void a(Window p0,boolean p1){
       if (Build$VERSION.SDK_INT >= 30) {
          k$b.a(p0, p1);
       }else {
          k$a.a(p0, p1);
       }
       return;
    }
}
