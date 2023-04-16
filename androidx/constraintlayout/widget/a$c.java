package androidx.constraintlayout.widget.a$c;
import android.util.SparseIntArray;
import java.lang.Object;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import androidx.constraintlayout.widget.a;
import android.util.TypedValue;
import java.lang.String;
import d1.c;

public class a$c	// class@0006c0
{
    public boolean a;
    public int b;
    public String c;
    public int d;
    public int e;
    public float f;
    public float g;
    public static SparseIntArray h;

    static {
       SparseIntArray sparseIntArr = new SparseIntArray();
       a$c.h = sparseIntArr;
       sparseIntArr.append(2, 1);
       a$c.h.append(4, 2);
       a$c.h.append(5, 3);
       a$c.h.append(1, 4);
       a$c.h.append(0, 5);
       a$c.h.append(3, 6);
    }
    public void a$c(){
       super();
       this.a = false;
       this.b = -1;
       this.c = null;
       this.d = -1;
       this.e = 0;
       this.f = Float.NaN;
       this.g = Float.NaN;
    }
    public void a(a$c p0){
       this.a = p0.a;
       this.b = p0.b;
       this.c = p0.c;
       this.d = p0.d;
       this.e = p0.e;
       this.g = p0.g;
       this.f = p0.f;
    }
    public void b(Context p0,AttributeSet p1){
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.x3);
       this.a = true;
       int indexCount = typedArray.getIndexCount();
       int i = 0;
       while (i < indexCount) {
          int index = typedArray.getIndex(i);
          switch (a$c.h.get(index)){
              case 1:
                this.g = typedArray.getFloat(index, this.g);
                break;
              case 2:
                this.d = typedArray.getInt(index, this.d);
                break;
              case 3:
                if (typedArray.peekValue(index).type == 3) {
                   this.c = typedArray.getString(index);
                }else {
                   this.c = c.c[typedArray.getInteger(index, 0)];
                }
                break;
              case 4:
                this.e = typedArray.getInt(index, 0);
                break;
              case 5:
                this.b = a.F(typedArray, index, this.b);
                break;
              case 6:
                this.f = typedArray.getFloat(index, this.f);
                break;
              default:
          }
          i = i + 1;
       }
       typedArray.recycle();
       return;
    }
}
