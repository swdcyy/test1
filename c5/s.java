package c5.s;
import c5.a;
import a5.f;
import com.airbnb.lottie.ex.model.layer.a;
import com.airbnb.lottie.ex.model.content.ShapeStroke;
import android.graphics.Paint$Cap;
import com.airbnb.lottie.ex.model.content.ShapeStroke$LineCapType;
import android.graphics.Paint$Join;
import com.airbnb.lottie.ex.model.content.ShapeStroke$LineJoinType;
import h5.d;
import h5.b;
import java.util.List;
import d5.a;
import h5.a;
import d5.a$a;
import android.graphics.Canvas;
import android.graphics.Matrix;
import d5.b;
import android.graphics.Paint;
import java.lang.Object;
import android.graphics.ColorFilter;
import n5.c;
import a5.j;
import d5.p;
import java.lang.String;

public class s extends a	// class@000cdf
{
    public final a o;
    public final String p;
    public final boolean q;
    public final a r;
    public a s;

    public void s(f p0,a p1,ShapeStroke p2){
       super(p0, p1, p2.g.toPaintCap(), p2.h.toPaintJoin(), p2.i, p2.e, p2.f, p2.c, p2.b);
       this.o = p1;
       this.p = p2.a;
       this.q = p2.j;
       a uoa = p2.d.a();
       this.r = uoa;
       uoa.a(this);
       p1.d(uoa);
    }
    public void a(Canvas p0,Matrix p1,int p2){
       if (this.q != null) {
          return;
       }
       this.i.setColor(this.r.m());
       s ts = this.s;
       if (ts != null) {
          this.i.setColorFilter(ts.h());
       }
       super.a(p0, p1, p2);
       return;
    }
    public void f(Object p0,c p1){
       super.f(p0, p1);
       if (p0 == j.b) {
          this.r.l(p1);
       }else if(p0 == j.B){
          if (p1 == null) {
             this.s = null;
          }else {
             p0 = new p(p1);
             this.s = p0;
             p0.a(this);
             this.o.d(this.r);
          }
       }
       return;
    }
    public String getName(){
       return this.p;
    }
}
