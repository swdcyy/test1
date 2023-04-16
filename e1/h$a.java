package e1.h$a;
import android.util.SparseIntArray;
import e1.h;
import android.content.res.TypedArray;
import java.lang.String;
import java.lang.Integer;
import android.util.TypedValue;
import e1.e;
import androidx.constraintlayout.motion.widget.MotionLayout;

public class h$a	// class@001e85
{
    public static SparseIntArray a;

    static {
       SparseIntArray sparseIntArr = new SparseIntArray();
       h$a.a = sparseIntArr;
       sparseIntArr.append(13, 1);
       h$a.a.append(11, 2);
       h$a.a.append(14, 3);
       h$a.a.append(10, 4);
       h$a.a.append(18, 5);
       h$a.a.append(17, 6);
       h$a.a.append(16, 7);
       h$a.a.append(19, 8);
       h$a.a.append(0, 9);
       h$a.a.append(9, 10);
       h$a.a.append(5, 11);
       h$a.a.append(6, 12);
       h$a.a.append(7, 13);
       h$a.a.append(15, 14);
       h$a.a.append(3, 15);
       h$a.a.append(4, 16);
       h$a.a.append(1, 17);
       h$a.a.append(2, 18);
       h$a.a.append(8, 19);
       h$a.a.append(12, 20);
    }
    public static void a(h p0,TypedArray p1){
       int indexCount = p1.getIndexCount();
       int i = 0;
       while (i < indexCount) {
          int index = p1.getIndex(i);
          switch (h$a.a.get(index)){
              case 1:
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
              case 2:
                p0.a = p1.getInt(index, p0.a);
                break;
              case 3:
                p0.g = p1.getString(index);
                break;
              case 4:
                p0.h = p1.getInteger(index, p0.h);
                break;
              case 5:
                p0.i = p1.getInt(index, p0.i);
                break;
              case 6:
                p0.j = p1.getFloat(index, p0.j);
                break;
              case 7:
                if (p1.peekValue(index).type == 5) {
                   p0.k = p1.getDimension(index, p0.k);
                }else {
                   p0.k = p1.getFloat(index, p0.k);
                }
                break;
              case 8:
                p0.m = p1.getInt(index, p0.m);
                break;
              case 9:
                p0.n = p1.getFloat(index, p0.n);
                break;
              case 10:
                p0.o = p1.getDimension(index, p0.o);
                break;
              case 11:
                p0.p = p1.getFloat(index, p0.p);
                break;
              case 12:
                p0.r = p1.getFloat(index, p0.r);
                break;
              case 13:
                p0.s = p1.getFloat(index, p0.s);
                break;
              case 14:
                p0.q = p1.getFloat(index, p0.q);
                break;
              case 15:
                p0.t = p1.getFloat(index, p0.t);
                break;
              case 16:
                p0.u = p1.getFloat(index, p0.u);
                break;
              case 17:
                p0.v = p1.getDimension(index, p0.v);
                break;
              case 18:
                p0.w = p1.getDimension(index, p0.w);
                break;
              case 19:
                p0.x = p1.getDimension(index, p0.x);
                break;
              case 20:
                p0.l = p1.getFloat(index, p0.l);
                break;
              default:
                Integer.toHexString(index);
                h$a.a.get(index);
          }
          i = i + 1;
       }
       return;
    }
}
