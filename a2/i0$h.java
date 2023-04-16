package a2.i0$h;
import android.view.WindowInsets;
import android.view.View;
import java.lang.Object;
import android.view.View$OnApplyWindowInsetsListener;
import a2.u0;
import android.graphics.Rect;
import a2.u0$a;
import a2.z;
import android.os.Build$VERSION;
import a2.i0$h$a;

public class i0$h	// class@000068
{

    public static void a(WindowInsets p0,View p1){
       View$OnApplyWindowInsetsListener tag = p1.getTag(R.id.tag_window_insets_animation_callback);
       if (tag != null) {
          tag.onApplyWindowInsets(p1, p0);
       }
       return;
    }
    public static u0 b(View p0,u0 p1,Rect p2){
       WindowInsets windowInsets = p1.v();
       if (windowInsets != null) {
          return u0.x(p0.computeSystemWindowInsets(windowInsets, p2), p0);
       }
       p2.setEmpty();
       return p1;
    }
    public static u0 c(View p0){
       return u0$a.a(p0);
    }
    public static void d(View p0,z p1){
       if (Build$VERSION.SDK_INT < 30) {
          p0.setTag(R.id.tag_on_apply_window_listener, p1);
       }
       if (p1 == null) {
          p0.setOnApplyWindowInsetsListener(p0.getTag(R.id.tag_window_insets_animation_callback));
          return;
       }else {
          p0.setOnApplyWindowInsetsListener(new i0$h$a(p0, p1));
          return;
       }
    }
}
