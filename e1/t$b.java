package e1.t$b;
import e1.t;
import java.lang.String;
import android.util.SparseArray;
import java.lang.RuntimeException;
import android.view.View;
import d1.b;
import java.lang.Object;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.Class;
import java.lang.reflect.Array;

public class t$b extends t	// class@001ea6
{
    public String f;
    public SparseArray g;
    public float[] h;

    public void t$b(String p0,SparseArray p1){
       super();
       this.f = p0.split(",")[1];
       this.g = p1;
    }
    public void e(int p0,float p1){
       throw new RuntimeException("don\'t call for custom attribute call setPoint\(pos, ConstraintAttribute\)");
    }
    public void f(View p0,float p1){
       this.a.e((double)p1, this.h);
       this.g.valueAt(0).i(p0, this.h);
    }
    public void h(int p0){
       int i = this.g.size();
       int i1 = this.g.valueAt(0).f();
       double[] uodoubleArra = new double[i];
       float[] uofloatArray = new float[i1];
       this.h = uofloatArray;
       int[] ointArray = new int[]{i,i1};
       double[][] uodoubleArra1 = Array.newInstance(double.class, ointArray);
       int i2 = 0;
       while (i2 < i) {
          double d = (double)this.g.keyAt(i2) * 0x3f847ae147ae147b;
          uodoubleArra[i2] = d;
          this.g.valueAt(i2).e(this.h);
          int i3 = 0;
          t$b th = this.h;
          while (i3 < th.length) {
             uodoubleArra1[i2][i3] = (double)th[i3];
             i3 = i3 + 1;
          }
          i2 = i2 + 1;
       }
       this.a = b.a(p0, uodoubleArra, uodoubleArra1);
       return;
    }
    public void i(int p0,ConstraintAttribute p1){
       this.g.append(p0, p1);
    }
}
