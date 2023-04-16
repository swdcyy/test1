package e3.q;
import e3.r;
import android.view.ViewGroup;
import java.lang.Object;
import android.view.ViewGroupOverlay;
import android.view.View;
import android.graphics.drawable.Drawable;

public class q implements r	// class@001eef
{
    public final ViewGroupOverlay a;

    public void q(ViewGroup p0){
       super();
       this.a = p0.getOverlay();
    }
    public void a(View p0){
       this.a.remove(p0);
    }
    public void b(Drawable p0){
       this.a.add(p0);
    }
    public void c(View p0){
       this.a.add(p0);
    }
    public void d(Drawable p0){
       this.a.remove(p0);
    }
}
