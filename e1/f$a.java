package e1.f$a;
import android.util.SparseIntArray;
import e1.f;
import android.content.res.TypedArray;
import java.lang.String;
import java.lang.Integer;
import e1.e;
import androidx.constraintlayout.motion.widget.MotionLayout;
import android.util.TypedValue;

public class f$a	// class@001e82
{
    public static SparseIntArray a;

    static {
       SparseIntArray sparseIntArr = new SparseIntArray();
       f$a.a = sparseIntArr;
       sparseIntArr.append(0, 1);
       f$a.a.append(11, 2);
       f$a.a.append(7, 4);
       f$a.a.append(8, 5);
       f$a.a.append(9, 6);
       f$a.a.append(1, 19);
       f$a.a.append(2, 20);
       f$a.a.append(5, 7);
       f$a.a.append(17, 8);
       f$a.a.append(16, 9);
       f$a.a.append(15, 10);
       f$a.a.append(13, 12);
       f$a.a.append(12, 13);
       f$a.a.append(6, 14);
       f$a.a.append(3, 15);
       f$a.a.append(4, 16);
       f$a.a.append(10, 17);
       f$a.a.append(14, 18);
    }
    public static void a(f p0,TypedArray p1){
       int indexCount = p1.getIndexCount();
       int i = 0;
       while (i < indexCount) {
          int index = p1.getIndex(i);
          switch (f$a.a.get(index)){
              case 1:
                p0.j = p1.getFloat(index, p0.j);
                break;
              case 2:
                p0.k = p1.getDimension(index, p0.k);
                break;
              case 4:
                p0.l = p1.getFloat(index, p0.l);
                break;
              case 5:
                p0.m = p1.getFloat(index, p0.m);
                break;
              case 6:
                p0.n = p1.getFloat(index, p0.n);
                break;
              case 7:
                p0.r = p1.getFloat(index, p0.r);
                break;
              case 8:
                p0.q = p1.getFloat(index, p0.q);
                break;
              case 9:
                p0.g = p1.getString(index);
                break;
              case 10:
                if (MotionLayout.L1) {
                   int resourceId = p1.getResourceId(index, p0.b);
                   p0.b = resourceId;
                   if (resourceId == -1) {
                      p0.c = p1.getString(index);
                   }
                }else if(p1.peekValue(index).type == 3){
                   p0.c = p1.getString(index);
                }else {
                   p0.b = p1.getResourceId(index, p0.b);
                }
                break;
              case 12:
                p0.a = p1.getInt(index, p0.a);
                break;
              case 13:
                p0.h = p1.getInteger(index, p0.h);
                break;
              case 14:
                p0.s = p1.getFloat(index, p0.s);
                break;
              case 15:
                p0.t = p1.getDimension(index, p0.t);
                break;
              case 16:
                p0.u = p1.getDimension(index, p0.u);
                break;
              case 17:
                p0.v = p1.getDimension(index, p0.v);
                break;
              case 18:
                p0.w = p1.getFloat(index, p0.w);
                break;
              case 19:
                p0.o = p1.getDimension(index, p0.o);
                break;
              case 20:
                p0.p = p1.getDimension(index, p0.p);
                break;
              default:
             label_0014 :
                Integer.toHexString(index);
                f$a.a.get(index);
          }
          i = i + 1;
       }
       return;
    }
}
