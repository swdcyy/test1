package e1.k$a;
import android.util.SparseIntArray;
import e1.k;
import android.content.res.TypedArray;
import java.lang.String;
import java.lang.Integer;
import e1.l;
import android.util.TypedValue;
import d1.c;
import e1.e;
import androidx.constraintlayout.motion.widget.MotionLayout;

public class k$a	// class@001e99
{
    public static final int a = 9;
    public static SparseIntArray b;

    static {
       SparseIntArray sparseIntArr = new SparseIntArray();
       k$a.b = sparseIntArr;
       sparseIntArr.append(4, 1);
       k$a.b.append(2, 2);
       k$a.b.append(11, 3);
       k$a.b.append(0, 4);
       k$a.b.append(1, 5);
       k$a.b.append(8, 6);
       k$a.b.append(9, 7);
       k$a.b.append(3, 9);
       k$a.b.append(10, 8);
       k$a.b.append(7, 11);
       k$a.b.append(6, 12);
       k$a.b.append(5, 10);
    }
    public static void a(k p0,TypedArray p1){
       int indexCount = p1.getIndexCount();
       int i = 0;
       while (i < indexCount) {
          int index = p1.getIndex(i);
          int i1 = 3;
          switch (k$a.b.get(index)){
              case 1:
                if (MotionLayout.L1) {
                   int resourceId = p1.getResourceId(index, p0.b);
                   p0.b = resourceId;
                   if (resourceId == -1) {
                      p0.c = p1.getString(index);
                   }
                }else if(p1.peekValue(index).type == i1){
                   p0.c = p1.getString(index);
                }else {
                   p0.b = p1.getResourceId(index, p0.b);
                }
                break;
              case 2:
                p0.a = p1.getInt(index, p0.a);
                break;
              case 3:
                if (p1.peekValue(index).type == i1) {
                   p0.h = p1.getString(index);
                }else {
                   p0.h = c.c[p1.getInteger(index, 0)];
                }
                break;
              case 4:
                p0.g = p1.getInteger(index, p0.g);
                break;
              case 5:
                p0.j = p1.getInt(index, p0.j);
                break;
              case 6:
                p0.m = p1.getFloat(index, p0.m);
                break;
              case 7:
                p0.n = p1.getFloat(index, p0.n);
                break;
              case 8:
                float floatx = p1.getFloat(index, p0.l);
                p0.k = floatx;
                p0.l = floatx;
                break;
              case 9:
                p0.q = p1.getInt(index, p0.q);
                break;
              case 10:
                p0.i = p1.getInt(index, p0.i);
                break;
              case 11:
                p0.k = p1.getFloat(index, p0.k);
                break;
              case 12:
                p0.l = p1.getFloat(index, p0.l);
                break;
              default:
                Integer.toHexString(index);
                k$a.b.get(index);
          }
          i = i + 1;
       }
       return;
    }
}
