package f79.a$c;
import java.lang.Runnable;
import f79.a;
import android.content.Context;
import java.lang.Object;
import e2.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.drawee.view.DraweeView;
import android.graphics.Matrix;
import android.widget.ImageView;
import android.view.View;

public class a$c implements Runnable	// class@0022d3
{
    public final g b;
    public int c;
    public int d;
    public final a e;

    public void a$c(a p0,Context p1){
       this.e = p0;
       super();
       this.b = g.c(p1);
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, a$c.class, "3")) {
          return;
       }
       if (this.b.j()) {
          this.e.i();
          return;
       }else {
          DraweeView uDraweeView = this.e.p();
          if (uDraweeView != null && this.b.b()) {
             int i = this.b.f();
             int i1 = this.b.g();
             this.e.p.postTranslate((float)(this.c - i), (float)(this.d - i1));
             uDraweeView.invalidate();
             this.c = i;
             this.d = i1;
             this.e.t(uDraweeView, this);
          }
          return;
       }
    }
}
