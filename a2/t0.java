package a2.t0;
import java.lang.Object;
import android.os.Build$VERSION;
import a2.t0$b;
import java.lang.UnsupportedOperationException;
import java.lang.StringBuilder;
import java.lang.String;
import android.view.WindowInsetsAnimationController;
import java.lang.Class;
import a2.t0$a;

public final class t0	// class@0000a9
{
    public final t0$b a;

    public void t0(){
       super();
       if (Build$VERSION.SDK_INT >= 30) {
          throw new UnsupportedOperationException("On API 30+, the constructor taking a "+WindowInsetsAnimationController.class.getSimpleName()+" as parameter");
       }
       this.a = new t0$b();
       return;
    }
    public void t0(WindowInsetsAnimationController p0){
       super();
       this.a = new t0$a(p0);
    }
}
