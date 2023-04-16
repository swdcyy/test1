package a2.i0$k;
import android.view.View;
import a2.v0;
import android.view.WindowInsetsController;

public class i0$k	// class@00006b
{

    public static v0 a(View p0){
       WindowInsetsController windowInsets = p0.getWindowInsetsController();
       v0 ov0 = (windowInsets != null)? windowInsets.c(windowInsets): null;
       return ov0;
    }
}
