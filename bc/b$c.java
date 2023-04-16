package bc.b$c;
import ub.a;
import bc.b;
import bc.a;
import java.lang.Object;
import ab.e;
import java.lang.String;
import android.graphics.drawable.Animatable;
import bd.f;
import cc.a;
import android.graphics.drawable.Drawable;
import android.graphics.Rect;
import bc.b$d;

public class b$c extends a	// class@000b11
{
    public final a b;
    public final boolean c;
    public final int d;
    public final b e;

    public void b$c(b p0,a p1,boolean p2,int p3){
       this.e = p0;
       super();
       e.d(p1);
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       b$c te;
       if (this.c != null && (p1 != null && this.b.c().g() != null)) {
          Drawable uDrawable = this.b.c().g();
          Rect bounds = uDrawable.getBounds();
          b$c td = this.d;
          if (td != -1) {
             int i = (int)(((float)td / (float)p1.getHeight()) * (float)p1.getWidth());
             if (bounds.width() != i || bounds.height() != this.d) {
                uDrawable.setBounds(0, 0, i, this.d);
                te = this.e;
                i = te.f;
                if (i != null) {
                   i.a(te);
                }
             }
          }else if(bounds.width() != p1.getWidth() || bounds.height() != p1.getHeight()){
             uDrawable.setBounds(0, 0, p1.getWidth(), p1.getHeight());
             te = this.e;
             p1 = te.f;
             if (p1 != null) {
                p1.a(te);
             }
          }
       }
       return;
    }
}
