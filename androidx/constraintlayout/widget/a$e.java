package androidx.constraintlayout.widget.a$e;
import android.util.SparseIntArray;
import java.lang.Object;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;

public class a$e	// class@0006c2
{
    public boolean a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public boolean l;
    public float m;
    public static SparseIntArray n;

    static {
       SparseIntArray sparseIntArr = new SparseIntArray();
       a$e.n = sparseIntArr;
       sparseIntArr.append(6, 1);
       a$e.n.append(7, 2);
       a$e.n.append(8, 3);
       a$e.n.append(4, 4);
       a$e.n.append(5, 5);
       a$e.n.append(0, 6);
       a$e.n.append(1, 7);
       a$e.n.append(2, 8);
       a$e.n.append(3, 9);
       a$e.n.append(9, 10);
       a$e.n.append(10, 11);
    }
    public void a$e(){
       super();
       this.a = false;
       this.b = 0;
       this.c = 0;
       this.d = 0;
       this.e = 0x3f800000;
       this.f = 0x3f800000;
       this.g = Float.NaN;
       this.h = Float.NaN;
       this.i = 0;
       this.j = 0;
       this.k = 0;
       this.l = false;
       this.m = 0;
    }
    public void a(a$e p0){
       this.a = p0.a;
       this.b = p0.b;
       this.c = p0.c;
       this.d = p0.d;
       this.e = p0.e;
       this.f = p0.f;
       this.g = p0.g;
       this.h = p0.h;
       this.i = p0.i;
       this.j = p0.j;
       this.k = p0.k;
       this.l = p0.l;
       this.m = p0.m;
    }
    public void b(Context p0,AttributeSet p1){
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.N5);
       this.a = true;
       int indexCount = typedArray.getIndexCount();
       int i = 0;
       while (i < indexCount) {
          int index = typedArray.getIndex(i);
          switch (a$e.n.get(index)){
              case 1:
                this.b = typedArray.getFloat(index, this.b);
                break;
              case 2:
                this.c = typedArray.getFloat(index, this.c);
                break;
              case 3:
                this.d = typedArray.getFloat(index, this.d);
                break;
              case 4:
                this.e = typedArray.getFloat(index, this.e);
                break;
              case 5:
                this.f = typedArray.getFloat(index, this.f);
                break;
              case 6:
                this.g = typedArray.getDimension(index, this.g);
                break;
              case 7:
                this.h = typedArray.getDimension(index, this.h);
                break;
              case 8:
                this.i = typedArray.getDimension(index, this.i);
                break;
              case 9:
                this.j = typedArray.getDimension(index, this.j);
                break;
              case 10:
                this.k = typedArray.getDimension(index, this.k);
                break;
              case 11:
                this.l = true;
                this.m = typedArray.getDimension(index, this.m);
                break;
              default:
          }
          i = i + 1;
       }
       typedArray.recycle();
       return;
    }
}
