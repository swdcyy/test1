package bud.b;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.graphics.Rect;
import bud.c;
import bud.e;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import android.view.Window;
import android.view.WindowManager$LayoutParams;
import bud.b$b;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import bud.d;
import java.lang.IllegalArgumentException;
import android.app.Application;
import bud.b$a;
import android.app.Application$ActivityLifecycleCallbacks;

public class b	// class@0002f9
{

    public static View a(Activity p0){
       return p0.findViewById(0x1020002).getChildAt(0);
    }
    public static boolean b(Activity p0){
       Rect rect = new Rect();
       View view = b.a(p0);
       view.getWindowVisibleDisplayFrame(rect);
       boolean height = view.getRootView().getHeight();
       height = ((double)(height - rect.height()) - ((double)height * 0x3fc3333333333333) > 0)? true: false;
       return height;
    }
    public static e c(Activity p0,c p1){
       Objects.requireNonNull(p0, "Parameter:activity must not be null");
       int i = 48;
       if (((p0.getWindow().getAttributes().softInputMode & 0x00f0) & i) == i) {
          throw new IllegalArgumentException("Parameter:activity window SoftInputMethod is SOFT_INPUT_ADJUST_NOTHING. In this case window will not be resized");
       }
       Objects.requireNonNull(p1, "Parameter:listener must not be null");
       View view = b.a(p0);
       b$b uob = new b$b(view, p1);
       view.getViewTreeObserver().addOnGlobalLayoutListener(uob);
       return new d(p0, uob);
    }
    public static void d(Activity p0,c p1){
       p0.getApplication().registerActivityLifecycleCallbacks(new b$a(p0, b.c(p0, p1)));
    }
}
