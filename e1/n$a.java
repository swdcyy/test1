package e1.n$a;
import android.util.SparseIntArray;
import e1.n;
import android.content.res.TypedArray;
import android.content.Context;
import e1.e;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.String;
import android.util.TypedValue;
import java.lang.Integer;

public class n$a	// class@001e9e
{
    public static SparseIntArray a;

    static {
       SparseIntArray sparseIntArr = new SparseIntArray();
       n$a.a = sparseIntArr;
       sparseIntArr.append(0, 8);
       n$a.a.append(4, 4);
       n$a.a.append(5, 1);
       n$a.a.append(6, 2);
       n$a.a.append(1, 7);
       n$a.a.append(7, 6);
       n$a.a.append(9, 5);
       n$a.a.append(3, 9);
       n$a.a.append(2, 10);
       n$a.a.append(8, 11);
    }
    public static void a(n p0,TypedArray p1,Context p2){
       int indexCount = p1.getIndexCount();
       int i = 0;
       while (i < indexCount) {
          int index = p1.getIndex(i);
          switch (n$a.a.get(index)){
              case 1:
                p0.j = p1.getString(index);
                break;
              case 2:
                p0.k = p1.getString(index);
                break;
              case 4:
                p0.h = p1.getString(index);
                break;
              case 5:
                p0.o = p1.getFloat(index, p0.o);
                break;
              case 6:
                p0.l = p1.getResourceId(index, p0.l);
                break;
              case 7:
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
              case 8:
                index = p1.getInteger(index, p0.a);
                p0.a = index;
                float f = (float)index + 0x3f000000;
                f = f / 100.00f;
                p0.s = f;
                break;
              case 9:
                p0.m = p1.getResourceId(index, p0.m);
                break;
              case 10:
                p0.x = p1.getBoolean(index, p0.x);
                break;
              case 11:
                p0.i = p1.getResourceId(index, p0.i);
             label_009c :
                Integer.toHexString(index);
                n$a.a.get(index);
                break;
              default:
                goto label_009c ;
          }
          i = i + 1;
       }
       return;
    }
}
