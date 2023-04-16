package fa.d;
import android.content.Context;
import android.app.Activity;
import android.content.ContextWrapper;

public class d	// class@001fdd
{

    public static Activity a(Context p0){
       while (true) {
          if (!p0 instanceof ContextWrapper) {
             return null;
          }
          if (p0 instanceof Activity) {
             break ;
          }else {
             p0 = p0.getBaseContext();
          }
       }
       return p0;
    }
}
