package androidx.drawerlayout.widget.DrawerLayout$a;
import android.view.View$OnApplyWindowInsetsListener;
import androidx.drawerlayout.widget.DrawerLayout;
import java.lang.Object;
import android.view.View;
import android.view.WindowInsets;

public class DrawerLayout$a implements View$OnApplyWindowInsetsListener	// class@00073c
{
    public final DrawerLayout b;

    public void DrawerLayout$a(DrawerLayout p0){
       this.b = p0;
       super();
    }
    public WindowInsets onApplyWindowInsets(View p0,WindowInsets p1){
       boolean b = (p1.getSystemWindowInsetTop() > 0)? true: false;
       p0.Q(p1, b);
       return p1.consumeSystemWindowInsets();
    }
}
