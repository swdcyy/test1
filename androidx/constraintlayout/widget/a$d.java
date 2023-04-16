package androidx.constraintlayout.widget.a$d;
import java.lang.Object;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import androidx.constraintlayout.widget.a;

public class a$d	// class@0006c1
{
    public boolean a;
    public int b;
    public int c;
    public float d;
    public float e;

    public void a$d(){
       super();
       this.a = false;
       this.b = 0;
       this.c = 0;
       this.d = 0x3f800000;
       this.e = Float.NaN;
    }
    public void a(a$d p0){
       this.a = p0.a;
       this.b = p0.b;
       this.d = p0.d;
       this.e = p0.e;
       this.c = p0.c;
    }
    public void b(Context p0,AttributeSet p1){
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.s4);
       this.a = true;
       int indexCount = typedArray.getIndexCount();
       int i = 0;
       while (i < indexCount) {
          int index = typedArray.getIndex(i);
          if (index == 1) {
             this.d = typedArray.getFloat(index, this.d);
          }else if(!index){
             index = typedArray.getInt(index, this.b);
             this.b = index;
             this.b = a.e[index];
          }else if(index == 4){
             this.c = typedArray.getInt(index, this.c);
          }else if(index == 3){
             this.e = typedArray.getFloat(index, this.e);
          }
          i = i + 1;
       }
       typedArray.recycle();
       return;
    }
}
