package o1.f$b;
import android.content.res.Resources$Theme;
import android.os.Build$VERSION;
import o1.f$b$b;
import o1.f$b$a;

public final class f$b	// class@002744
{

    public static void a(Resources$Theme p0){
       int sDK_INT = Build$VERSION.SDK_INT;
       if (sDK_INT >= 29) {
          f$b$b.a(p0);
       }else if(sDK_INT >= 23){
          f$b$a.a(p0);
       }
       return;
    }
}
