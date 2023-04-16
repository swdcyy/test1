package e1.m$a;
import android.util.SparseIntArray;
import e1.m;
import android.content.res.TypedArray;
import java.lang.String;
import java.lang.Integer;
import android.util.TypedValue;
import e1.e;
import androidx.constraintlayout.motion.widget.MotionLayout;

public class m$a	// class@001e9c
{
    public static SparseIntArray a;

    static {
       SparseIntArray sparseIntArr = new SparseIntArray();
       m$a.a = sparseIntArr;
       sparseIntArr.append(0, 1);
       m$a.a.append(9, 2);
       m$a.a.append(5, 4);
       m$a.a.append(6, 5);
       m$a.a.append(7, 6);
       m$a.a.append(3, 7);
       m$a.a.append(15, 8);
       m$a.a.append(14, 9);
       m$a.a.append(13, 10);
       m$a.a.append(11, 12);
       m$a.a.append(10, 13);
       m$a.a.append(4, 14);
       m$a.a.append(1, 15);
       m$a.a.append(2, 16);
       m$a.a.append(8, 17);
       m$a.a.append(12, 18);
       m$a.a.append(18, 20);
       m$a.a.append(17, 21);
       m$a.a.append(19, 19);
    }
    public static void a(m p0,TypedArray p1){
       int indexCount = p1.getIndexCount();
       int i = 0;
       while (i < indexCount) {
          int index = p1.getIndex(i);
          switch (m$a.a.get(index)){
              case 1:
                p0.i = p1.getFloat(index, p0.i);
                break;
              case 2:
                p0.j = p1.getDimension(index, p0.j);
                break;
              case 4:
                p0.k = p1.getFloat(index, p0.k);
                break;
              case 5:
                p0.l = p1.getFloat(index, p0.l);
                break;
              case 6:
                p0.m = p1.getFloat(index, p0.m);
                break;
              case 7:
                p0.o = p1.getFloat(index, p0.o);
                break;
              case 8:
                p0.n = p1.getFloat(index, p0.n);
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
                p0.p = p1.getFloat(index, p0.p);
                break;
              case 15:
                p0.q = p1.getDimension(index, p0.q);
                break;
              case 16:
                p0.r = p1.getDimension(index, p0.r);
                break;
              case 17:
                p0.s = p1.getDimension(index, p0.s);
                break;
              case 18:
                p0.t = p1.getFloat(index, p0.t);
                break;
              case 19:
                p0.u = p1.getInt(index, p0.u);
                break;
              case 20:
                p0.v = p1.getFloat(index, p0.v);
                break;
              case 21:
                if (p1.peekValue(index).type == 5) {
                   p0.w = p1.getDimension(index, p0.w);
                }else {
                   p0.w = p1.getFloat(index, p0.w);
                }
                break;
              default:
             label_0014 :
                Integer.toHexString(index);
                m$a.a.get(index);
          }
          i = i + 1;
       }
       return;
    }
}
