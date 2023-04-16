package c5.l;
import c5.n;
import c5.j;
import com.airbnb.lottie.ex.model.content.MergePaths;
import java.lang.Object;
import android.graphics.Path;
import java.util.ArrayList;
import java.lang.String;
import java.util.List;
import c5.c;
import java.util.ListIterator;
import android.graphics.Path$Op;
import c5.d;
import android.graphics.Matrix;
import c5.l$a;
import java.lang.Enum;

public class l implements n, j	// class@000cd7
{
    public final Path a;
    public final Path b;
    public final Path c;
    public final String d;
    public final List e;
    public final MergePaths f;

    public void l(MergePaths p0){
       super();
       this.a = new Path();
       this.b = new Path();
       this.c = new Path();
       this.e = new ArrayList();
       this.d = p0.b();
       this.f = p0;
    }
    public void b(List p0,List p1){
       for (int i = 0; i < this.e.size(); i = i + 1) {
          this.e.get(i).b(p0, p1);
       }
       return;
    }
    public void d(ListIterator p0){
       do {
       } while (p0.hasPrevious() && p0.previous() != this);
       while (p0.hasPrevious()) {
          c uoc = p0.previous();
          if (uoc instanceof n) {
             this.e.add(uoc);
             p0.remove();
          }
       }
       return;
    }
    public final void e(Path$Op p0){
       this.b.reset();
       this.a.reset();
       int i = 1;
       int i1 = this.e.size() - i;
       while (i1 >= i) {
          n on = this.e.get(i1);
          if (on instanceof d) {
             List list = on.d();
             for (int i2 = list.size() - i; i2 >= 0; i2 = i2 - 1) {
                Path path = list.get(i2).getPath();
                path.transform(on.h());
                this.b.addPath(path);
             }
          }else {
             this.b.addPath(on.getPath());
          }
          i1 = i1 - 1;
       }
       i = 0;
       n on1 = this.e.get(i);
       if (on1 instanceof d) {
          List list1 = on1.d();
          for (; i < list1.size(); i = i + 1) {
             Path path1 = list1.get(i).getPath();
             path1.transform(on1.h());
             this.a.addPath(path1);
          }
       }else {
          this.a.set(on1.getPath());
       }
       this.c.op(this.a, this.b, p0);
       return;
    }
    public String getName(){
       return this.d;
    }
    public Path getPath(){
       this.c.reset();
       l tf = this.f;
       if (tf.c != null) {
          return this.c;
       }
       int i = l$a.a[tf.b.ordinal()];
       if (i != 1) {
          if (i != 2) {
             if (i != 3) {
                if (i != 4) {
                   if (i == 5) {
                      this.e(Path$Op.XOR);
                   }
                }else {
                   this.e(Path$Op.INTERSECT);
                }
             }else {
                this.e(Path$Op.REVERSE_DIFFERENCE);
             }
          }else {
             this.e(Path$Op.UNION);
          }
       }else {
          for (i = 0; i < this.e.size(); i = i + 1) {
             this.c.addPath(this.e.get(i).getPath());
          }
       }
       return this.c;
    }
}
