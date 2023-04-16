package e3.k;
import android.animation.TypeEvaluator;
import java.lang.Object;
import android.graphics.Rect;

public class k implements TypeEvaluator	// class@001ee9
{
    public Rect a;

    public void k(){
       super();
    }
    public void k(Rect p0){
       super();
       this.a = p0;
    }
    public Rect a(float p0,Rect p1,Rect p2){
       Rect left = p1.left;
       int i = left + (int)((float)(p2.left - left) * p0);
       Rect top = p1.top;
       int i1 = top + (int)((float)(p2.top - top) * p0);
       Rect right = p1.right;
       int i2 = right + (int)((float)(p2.right - right) * p0);
       p1 = p1.bottom;
       int i3 = p1 + (int)((float)(p2.bottom - p1) * p0);
       k ta = this.a;
       if (ta == null) {
          return new Rect(i, i1, i2, i3);
       }
       ta.set(i, i1, i2, i3);
       return this.a;
    }
    public Object evaluate(float p0,Object p1,Object p2){
       return this.a(p0, p1, p2);
    }
}
