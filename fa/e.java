package fa.e;
import ca.a;
import android.content.Context;
import zf6.l;
import ll8.c$b;
import android.content.res.TypedArray;
import j17.a;

public class e	// class@001fde
{
    public static final int[] a;

    static {
       int[] ointArray = new int[]{0x1010095};
       e.a = ointArray;
    }
    public static void a(int p0,a p1){
       TypedArray typedArray1;
       if (p1 != null) {
          a s = p1.S;
          if (s != null) {
             int i = -1;
             if (p0 != i) {
                a c = p1.C;
                if (c != null) {
                   s = l.h(s, c);
                }
                TypedArray typedArray = s.obtainStyledAttributes(p0, c$b.l2);
                p1.Y = typedArray.getColor(4, a.a(s, 0x7f060c34));
                int resourceId = typedArray.getResourceId(5, i);
                if (resourceId != i) {
                   typedArray1 = s.obtainStyledAttributes(resourceId, e.a);
                   p1.c0 = typedArray1.getDimensionPixelSize(0, a.d(s, 0x7f07057d));
                   typedArray1.recycle();
                }
                int i1 = 0x7f060c33;
                p1.h0 = typedArray.getColor(2, a.a(s, i1));
                resourceId = typedArray.getResourceId(3, i);
                if (resourceId != i) {
                   typedArray1 = s.obtainStyledAttributes(resourceId, e.a);
                   p1.f0 = typedArray1.getDimensionPixelSize(0, a.d(s, 0x7f0710e9));
                   typedArray1.recycle();
                }
                p1.g0 = typedArray.getColor(7, a.a(s, i1));
                resourceId = typedArray.getResourceId(6, i);
                if (resourceId != i) {
                   TypedArray typedArray2 = s.obtainStyledAttributes(resourceId, e.a);
                   p1.e0 = typedArray2.getDimensionPixelSize(0, a.d(s, 0x7f0710ef));
                   typedArray2.recycle();
                }
                p1.i0 = typedArray.getColor(1, a.a(s, 0x7f060c27));
                p1.j0 = typedArray.getResourceId(0, 0x7f060c25);
                typedArray.recycle();
             }
          }
       }
       return;
    }
}
