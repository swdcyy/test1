package a27.d;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager$LayoutParams;

public class d	// class@000031
{

    public static boolean a(Activity p0){
       return p0.findViewById(0x1020002).getChildAt(0).getFitsSystemWindows();
    }
    public static boolean b(Activity p0){
       boolean b = (p0.getWindow().getAttributes().flags & 0x0400)? true: false;
       return b;
    }
    public static boolean c(Activity p0){
       boolean b = (p0.getWindow().getAttributes().flags & 0x4000000)? true: false;
       return b;
    }
}
