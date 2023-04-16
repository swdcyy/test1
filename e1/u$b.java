package e1.u$b;
import e1.u;
import java.lang.String;
import android.util.SparseArray;
import java.lang.RuntimeException;
import android.view.View;
import e1.g;
import d1.b;
import java.lang.Float;
import java.lang.Object;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.Class;
import java.lang.reflect.Array;
import java.lang.Math;

public class u$b extends u	// class@001eb7
{
    public String l;
    public SparseArray m;
    public SparseArray n;
    public float[] o;
    public float[] p;

    public void u$b(String p0,SparseArray p1){
       super();
       this.n = new SparseArray();
       this.l = p0.split(",")[1];
       this.m = p1;
    }
    public void e(int p0,float p1,float p2,int p3,float p4){
       throw new RuntimeException("don\'t call for custom attribute call setPoint\(pos, ConstraintAttribute,...\)");
    }
    public boolean f(View p0,float p1,long p2,g p3){
       float f;
       u ou = this;
       Object obj = p0;
       long l = p2;
       ou.a.e((double)p1, ou.o);
       u$b o = ou.o;
       int i = o[(o.length - 2)];
       int i1 = o[(o.length - 1)];
       long l1 = l - ou.i;
       if (Float.isNaN(ou.j)) {
          f = p3.a(obj, ou.l, 0);
          ou.j = f;
          if (Float.isNaN(f)) {
             ou.j = 0;
          }
       }
       f = (float)(((double)ou.j + (((double)l1 * 0.00f) * (double)i)) % 0x3ff0000000000000);
       ou.j = f;
       ou.i = l;
       float f1 = ou.a(f);
       ou.h = false;
       int i2 = 0;
       u$b p = ou.p;
       while (i2 < p.length) {
          u h = ou.h;
          u$b o1 = ou.o;
          int i3 = ((double)o1[i2])? 1: 0;
          int i4 = h | i3;
          ou.h = i4;
          float f2 = o1[i2] * f1;
          f2 = f2 + i1;
          p[i2] = f2;
          i2 = i2 + 1;
       }
       ou.m.valueAt(0).i(obj, ou.p);
       if (i) {
          ou.h = true;
       }
       return ou.h;
    }
    public void i(int p0){
       int i = this.m.size();
       int i1 = this.m.valueAt(0).f();
       double[] uodoubleArra = new double[i];
       int i2 = i1 + 2;
       float[] uofloatArray = new float[i2];
       this.o = uofloatArray;
       uofloatArray = new float[i1];
       this.p = uofloatArray;
       int[] ointArray = new int[]{i,i2};
       double[][] uodoubleArra1 = Array.newInstance(double.class, ointArray);
       for (int i3 = 0; i3 < i; i3 = i3 + 1) {
          float[] uofloatArray1 = this.n.valueAt(i3);
          double d = (double)this.m.keyAt(i3) * 0x3f847ae147ae147b;
          uodoubleArra[i3] = d;
          this.m.valueAt(i3).e(this.o);
          int i4 = 0;
          u$b to = this.o;
          while (i4 < to.length) {
             uodoubleArra1[i3][i4] = (double)to[i4];
             i4 = i4 + 1;
          }
          uodoubleArra1[i3][i1] = (double)uofloatArray1[0];
          int i5 = i1 + 1;
          uodoubleArra1[i3][i5] = (double)uofloatArray1[1];
       }
       this.a = b.a(p0, uodoubleArra, uodoubleArra1);
       return;
    }
    public void j(int p0,ConstraintAttribute p1,float p2,int p3,float p4){
       this.m.append(p0, p1);
       float[] uofloatArray = new float[]{p2,p4};
       this.n.append(p0, uofloatArray);
       this.b = Math.max(this.b, p3);
    }
}
