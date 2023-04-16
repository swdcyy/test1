package bj8.d;
import android.view.View$OnSystemUiVisibilityChangeListener;
import android.view.Window;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Runnable;
import java.lang.Integer;
import bj8.c;

public class d implements View$OnSystemUiVisibilityChangeListener	// class@000379
{
    public Window b;
    public int c;
    public int d;
    public Runnable e;
    public static int f;

    static {
       d.f = 5894;
    }
    public void d(Window p0){
       super();
       this.c = -1;
       if (p0 == null) {
          return;
       }
       this.b = p0;
       this.c = p0.getDecorView().getSystemUiVisibility();
       return;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, d.class, "6")) {
          return;
       }
       d tb = this.b;
       if (tb == null) {
          return;
       }
       if (this.e != null) {
          tb.getDecorView().removeCallbacks(this.e);
          this.e = null;
       }
       return;
    }
    public void onSystemUiVisibilityChange(int p0){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, d.class, "7")) {
          return;
       }
       d tb = this.b;
       if (tb == null) {
          return;
       }
       if (p0 != this.d) {
          tb.getDecorView().setOnSystemUiVisibilityChangeListener(null);
          c uoc = new c(this);
          this.e = uoc;
          this.b.getDecorView().postDelayed(uoc, 10);
       }else {
          this.a();
       }
       return;
    }
}
