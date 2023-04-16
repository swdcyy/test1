package gz1.c;
import android.view.ViewGroup;
import gz1.a;
import java.lang.Object;
import android.graphics.Rect;
import android.content.Context;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;

public abstract class c	// class@0025df
{
    public ViewGroup a;
    public ViewGroup b;
    public a c;
    public float d;
    public Rect e;

    public void c(ViewGroup p0,a p1){
       super();
       Rect rect = new Rect();
       this.e = rect;
       this.a = p0;
       this.c = p1;
       rect.set(p0.getPaddingLeft(), this.a.getPaddingTop(), this.a.getPaddingRight(), this.a.getPaddingBottom());
       this.a.setPadding(0, 0, 0, 0);
    }
    public abstract ViewGroup a(Context p0);
    public abstract void b(ViewGroup p0);
    public void c(float p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoc, "7")) {
          return;
       }
       if (!this.d - p0) {
          return;
       }
       this.d = p0;
       uoc = this.b;
       if (uoc != null) {
          uoc.setPivotX(0);
          this.b.setPivotY(0);
          this.b.setScaleX(p0);
          this.b.setScaleY(p0);
       }
       return;
    }
}
