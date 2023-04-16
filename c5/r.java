package c5.r;
import c5.n;
import d5.a$a;
import a5.f;
import com.airbnb.lottie.ex.model.layer.a;
import i5.j;
import java.lang.Object;
import android.graphics.Path;
import c5.b;
import d5.a;
import h5.h;
import java.util.List;
import c5.c;
import c5.t;
import com.airbnb.lottie.ex.model.content.ShapeTrimPath$Type;
import java.lang.String;
import android.graphics.Path$FillType;

public class r implements n, a$a	// class@000cde
{
    public final Path a;
    public final String b;
    public final boolean c;
    public final f d;
    public final a e;
    public boolean f;
    public b g;

    public void r(f p0,a p1,j p2){
       super();
       this.a = new Path();
       this.g = new b();
       this.b = p2.a;
       this.c = p2.d;
       this.d = p0;
       a uoa = p2.c.a();
       this.e = uoa;
       p1.d(uoa);
       uoa.a(this);
    }
    public void b(List p0,List p1){
       int i = 0;
       while (i < p0.size()) {
          c uoc = p0.get(i);
          if (uoc instanceof t && uoc.i() == ShapeTrimPath$Type.SIMULTANEOUSLY) {
             this.g.a(uoc);
             uoc.d(this);
          }
          i++;
       }
       return;
    }
    public void e(){
       this.f = false;
       this.d.invalidateSelf();
    }
    public String getName(){
       return this.b;
    }
    public Path getPath(){
       if (this.f != null) {
          return this.a;
       }
       this.a.reset();
       if (this.c != null) {
          this.f = true;
          return this.a;
       }else {
          this.a.set(this.e.h());
          this.a.setFillType(Path$FillType.EVEN_ODD);
          this.g.b(this.a);
          this.f = true;
          return this.a;
       }
    }
}
