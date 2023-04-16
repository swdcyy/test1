package e3.u;
import e3.v;
import android.view.View;
import java.lang.Object;
import android.view.ViewOverlay;
import android.graphics.drawable.Drawable;

public class u implements v	// class@001ef3
{
    public final ViewOverlay a;

    public void u(View p0){
       super();
       this.a = p0.getOverlay();
    }
    public void b(Drawable p0){
       this.a.add(p0);
    }
    public void d(Drawable p0){
       this.a.remove(p0);
    }
}
