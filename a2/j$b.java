package a2.j$b;
import android.view.WindowInsets;
import android.view.View;
import java.lang.Object;
import android.view.View$OnApplyWindowInsetsListener;
import a2.l;
import a2.l$a;
import a2.i;
import android.os.Build$VERSION;
import a2.j$b$a;

public class j$b	// class@000072
{

    public static void a(WindowInsets p0,View p1){
       View$OnApplyWindowInsetsListener tag = p1.getTag(R.id.tag_window_insets_animation_callback);
       if (tag != null) {
          tag.onApplyWindowInsets(p1, p0);
       }
       return;
    }
    public static l b(View p0){
       return l$a.a(p0);
    }
    public static void c(View p0,i p1){
       if (Build$VERSION.SDK_INT < 30) {
          p0.setTag(R.id.tag_on_apply_window_listener, p1);
       }
       if (p1 == null) {
          p0.setOnApplyWindowInsetsListener(p0.getTag(R.id.tag_window_insets_animation_callback));
          return;
       }else {
          p0.setOnApplyWindowInsetsListener(new j$b$a(p0, p1));
          return;
       }
    }
}
