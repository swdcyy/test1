package e5b.a;
import e5b.a$a;
import nsd.u;
import java.lang.Object;
import android.os.Handler;
import android.os.Looper;
import e5b.a$d;
import e5b.a$c;
import e5b.a$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.b;
import java.lang.Runnable;
import android.view.View$OnLayoutChangeListener;
import android.view.View;

public final class a	// class@00261b
{
    public View a;
    public l b;
    public Activity c;
    public Dialog d;
    public boolean e;
    public final Handler f;
    public Runnable g;
    public View$OnLayoutChangeListener h;
    public final a$b i;
    public static final a$a j;

    static {
       a.j = new a$a(null);
    }
    public void a(){
       super();
       this.e = true;
       this.f = new Handler(Looper.getMainLooper());
       this.g = new a$d(this);
       this.h = new a$c(this);
       this.i = new a$b(this);
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       b.a("InputKeyboardListener", "initListener");
       this.f.removeCallbacks(this.g);
       this.f.postDelayed(this.g, 100);
       a ta = this.a;
       if (ta != null) {
          ta.addOnLayoutChangeListener(this.h);
       }
       return;
    }
}
