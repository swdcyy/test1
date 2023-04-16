package nd9.x;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public abstract class x	// class@00315c
{
    public final long a;
    public final long b;

    public void x(){
       super();
       this.a = 300;
       this.b = 240;
    }
    public abstract void a();
    public abstract void b(View p0);
    public abstract void c();
    public final void d(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x.class, "4")) {
          return;
       }
       if (p0 != null) {
          View view = p0.findViewById(R.id.arrow);
          if (view != null) {
             p0.setPivotX((view.getX() + (float)(view.getWidth() / 2)));
             p0.setPivotY(view.getY());
          }
       }
       return;
    }
    public abstract void e(int p0,int p1);
}
