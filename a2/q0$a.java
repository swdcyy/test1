package a2.q0$a;
import android.view.Window;
import a2.v0;
import android.view.WindowInsetsController;

public class q0$a	// class@000096
{

    public static v0 a(Window p0){
       WindowInsetsController insetsContro = p0.getInsetsController();
       if (insetsContro != null) {
          return insetsContro.c(insetsContro);
       }
       return null;
    }
}
